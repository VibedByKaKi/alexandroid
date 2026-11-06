#version 310 es
// Horizontal Cumulative Sum — Phase 1 (parallel-scan)
//
// Computes per-tile inclusive prefix sum of (I, I*I) along the X axis,
// where I = computeYLinear(rgbGamma) derived from inputImage. The output
// stored in boxH[] is THE TRUE CUMULATIVE SUM (NOT the box-filter result
// like the previous box-filter implementation). Downstream consumers (cumsum_v) compute the box-filter
// value via subtraction:
//
//     boxSum_at_x = cumH[min(W-1, x+r)] − cumH[max(0, x-r) - 1]
//                                                    ↑  (treat as 0 when negative)
//
// This matches the Camera team's box() function in tone_retoucher.py.
//
// Phase-1 scope: per-tile inclusive scan (256 elements per tile via
// Hillis-Steele in workgroup-shared memory). The tile total is ALSO
// written to tileSums[row * tilesPerRow + tileIdx] for phase 2 to use.
//
// Phase-2 (lce_shader_cumsum_h_phase2.glsl) adds the running prefix of
// preceding tile-sums to each tile's elements, producing the global
// cumulative sum.
//
// Workgroup layout: 256 threads along X, 1 along Y. Each workgroup
// processes ONE tile of ONE row. Total dispatch:
//     workgroups = (tilesPerRow, height, 1)
//     threads    = (256, 1, 1) per workgroup

layout(local_size_x = 256, local_size_y = 1) in;

layout(rgba32f, binding = 0) readonly uniform highp image2D inputImage;

// Output: per-pixel cumulative sum of (I, I*I).
// Slot layout: .x = cumI, .y = cumII, .z = 0, .w = 0.
// Phase 2 reads .x and .y, ADDS the tile prefix, writes them back.
//
// FP32 ALWAYS — declared as plain `vec4` (NOT LCE_VEC4) regardless of
// LCE_PRECISION mode. The cumulative sum reaches ~4000 at 4000-wide rows;
// at that magnitude f16's ULP is ~4 and the downstream subtraction
// `cumH[xRight] − cumH[xLeftMinus1]` would lose enough precision to bust
// the V1 quality bar (L∞ ≤ 3/255). GpuResourcePool sizes sharedBufA at
// 16 B/element to match.
layout(std430, binding = 3) buffer BoxHBuf {
    vec4 boxH[];
};

// Output: per-tile total. Layout: tileSums[row * tilesPerRow + tileIdx]
// where the .x and .y components carry the tile's total of I and I*I.
// Sized as (tilesPerRow * height) vec4 elements.
//
// IMPORTANT — kept as plain `vec4` (NOT `LCE_VEC4`) regardless of precision
// mode: the GpuResourcePool sizes this buffer as 16 B/element so it stays
// FP32 always. Tile totals can be up to ~256 (sum of 256 [0..1] values);
// in FP32 this is loss-free. The buffer is small (~750 KB at 4000×3000),
// so there's no memory motivation to push it to f16.
layout(std430, binding = 12) buffer TileSumsBuf {
    vec4 tileSums[];
};

layout(location = 0) uniform ivec2 uSize;       // (width, height)
layout(location = 1) uniform int uTilesPerRow;  // (width + 255) / 256

// Workgroup-shared scratch for the Hillis-Steele scan. Two parallel
// arrays: one for I, one for I*I. Both inclusive-scanned in lockstep.
shared float scratchI[256];
shared float scratchII[256];

void main() {
    int row = int(gl_WorkGroupID.y);
    int tileIdx = int(gl_WorkGroupID.x);
    int local = int(gl_LocalInvocationID.x);

    int W = uSize.x;
    int H = uSize.y;

    // Out-of-bounds workgroups (from rounding-up tilesPerRow) skip.
    if (row >= H) return;

    int globalX = tileIdx * 256 + local;
    int idx = row * W + globalX;

    // Load: I = computeYLinear(input pixel). Past row end → load 0
    // (sentinel padding for the trailing partial tile).
    float vI;
    if (globalX < W) {
        vec4 pixel = imageLoad(inputImage, ivec2(globalX, row));
        vI = computeYLinear(pixel.rgb);
    } else {
        vI = 0.0;
    }
    float vII = vI * vI;

    scratchI[local] = vI;
    scratchII[local] = vII;
    barrier();

    // Hillis-Steele inclusive scan in shared memory.
    // 8 sync steps for a 256-element scan.
    //
    // INVARIANT: after step k, scratch[i] holds the inclusive sum of
    // elements [max(0, i - 2^k + 1)..i] from the original input.
    //
    // We use a temporary register + 2 barriers per step so a thread
    // never reads a value another thread is simultaneously writing.
    for (int offset = 1; offset < 256; offset <<= 1) {
        float addI  = (local >= offset) ? scratchI[local - offset]  : 0.0;
        float addII = (local >= offset) ? scratchII[local - offset] : 0.0;
        barrier();
        scratchI[local]  += addI;
        scratchII[local] += addII;
        barrier();
    }

    // Write per-element scan result. Out-of-bounds threads do nothing —
    // they padded with 0 above and their write site doesn't exist.
    if (globalX < W) {
        boxH[idx] = vec4(scratchI[local], scratchII[local], 0.0, 0.0);
    }

    // Last lane in the workgroup writes the tile total.
    // For a partial trailing tile (where some lanes loaded 0-padding),
    // the "last lane" is still local==255. Its scan result includes the
    // 0-padding contributions, which sum to 0, so the result is the
    // sum of valid elements only — correct.
    //
    // Note: scratchI / scratchII are float (FP32) regardless of LCE_PRECISION,
    // and TileSumsBuf is plain vec4 — so this store is FP32 → FP32 with no
    // narrowing.
    if (local == 255) {
        tileSums[row * uTilesPerRow + tileIdx] =
                vec4(scratchI[255], scratchII[255], 0.0, 0.0);
    }
}
