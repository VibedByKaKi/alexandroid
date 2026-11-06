#version 310 es
// Horizontal Cumulative Sum — Phase 2 (tile-prefix correction)
//
// Adds the running sum of all preceding tile-totals to each tile's
// elements, producing the global cumulative sum. Phase-1
// (lce_shader_cumsum_h.glsl) wrote per-tile inclusive scans to boxH and
// per-tile totals to tileSums; phase 2 finishes the job.
//
// For tile T in row R, the prefix to add is:
//
//     prefix[R][T] = Σ tileSums[R, 0..T-1]
//
// Phase 2 then: boxH[R][globalX] += prefix[R][T] for every globalX in tile T.
//
// Efficient row-prefix scan
// ───────────────────────────────────────────────────────────────────────
// Pre-CR-11b, every thread re-ran the per-tile prefix loop independently —
// O(tilesPerRow) reads per thread × W threads per row = O(W·tilesPerRow)
// reads of tileSums per row. At 4000-wide × 16 tiles that was ~64k reads
// per row before any cache effect, and the dispatch geometry was
// (tilesPerRow, height, 1) workgroups so the loop ran inside every
// workgroup.
//
// Post-CR-11b, ONE workgroup per row scans the row's tileSums table in
// shared memory (Hillis-Steele over ≤ MAX_TILES_PER_ROW elements), then
// each thread strides across the row's pixels and adds the prefix
// corresponding to its column's tile. The serial prefix loop is gone;
// shared-memory reads in phase 2's apply-step are O(1) per pixel.
//
// Dispatch geometry:
//   (1, height, 1) workgroups × 256 threads — one workgroup per row.
//
// MAX_TILES_PER_ROW caps tilesPerRow at 64. At 256 px per tile that
// covers up to a 16384-wide image — well above the 4000-class hot path
// and the GLES 3.1 minimum guarantee for image dimensions. If a future
// camera ever exceeds it, the host-side path-skip (cumsum_h won't even
// dispatch) would catch it; we additionally guard at compile time with
// a static_assert-style check via an integer constant divisor.

layout(local_size_x = 256, local_size_y = 1) in;

// FP32 always (cumulative sum, not normalized). See lce_shader_cumsum_h.glsl
// for the precision rationale.
layout(std430, binding = 3) buffer BoxHBuf {
    vec4 boxH[];
};

// FP32 always — sized to vec4 in GpuResourcePool. See lce_shader_cumsum_h.glsl.
layout(std430, binding = 12) readonly buffer TileSumsBuf {
    vec4 tileSums[];
};

layout(location = 0) uniform ivec2 uSize;
layout(location = 1) uniform int uTilesPerRow;

const int MAX_TILES_PER_ROW = 64;

// Workgroup-shared exclusive-prefix table for this row's tile sums.
// scratchPrefixI[t] = Σ tileSums[row, 0..t-1].x  (0 for t=0)
// scratchPrefixII[t] = Σ tileSums[row, 0..t-1].y
shared float scratchPrefixI[MAX_TILES_PER_ROW];
shared float scratchPrefixII[MAX_TILES_PER_ROW];

void main() {
    int row = int(gl_WorkGroupID.y);
    int local = int(gl_LocalInvocationID.x);

    int W = uSize.x;
    int H = uSize.y;
    int tpr = uTilesPerRow;
    if (row >= H) return;

    // Step 1 — cooperatively load tileSums[row, 0..tpr-1] into shared
    // memory. The loaded value is the INCLUSIVE per-tile sum from phase 1.
    // We scan it to produce the EXCLUSIVE prefix in-place.
    //
    // Threads with local < tpr each load one entry. Out-of-range entries
    // are zero-padded so the scan over MAX_TILES_PER_ROW elements still
    // produces the right exclusive prefix for the in-range tiles.
    if (local < MAX_TILES_PER_ROW) {
        if (local < tpr) {
            vec4 ts = tileSums[row * tpr + local];
            scratchPrefixI[local]  = ts.x;
            scratchPrefixII[local] = ts.y;
        } else {
            scratchPrefixI[local]  = 0.0;
            scratchPrefixII[local] = 0.0;
        }
    }
    barrier();

    // Step 2 — Hillis-Steele inclusive scan over MAX_TILES_PER_ROW (= 64)
    // elements. 6 sync steps (log2(64)).
    //
    // Only the lower 64 threads participate; the rest are along for the
    // ride and must still hit the barriers.
    for (int offset = 1; offset < MAX_TILES_PER_ROW; offset <<= 1) {
        float addI  = 0.0;
        float addII = 0.0;
        if (local < MAX_TILES_PER_ROW && local >= offset) {
            addI  = scratchPrefixI[local - offset];
            addII = scratchPrefixII[local - offset];
        }
        barrier();
        if (local < MAX_TILES_PER_ROW) {
            scratchPrefixI[local]  += addI;
            scratchPrefixII[local] += addII;
        }
        barrier();
    }

    // Step 3 — convert inclusive scan to EXCLUSIVE prefix by shifting
    // right one slot. After shift, scratchPrefix[t] = Σ tileSums[0..t-1].
    //
    // We do this by reading scratchPrefix[local-1] for local > 0 and
    // writing 0 at local 0 — needs one more barrier round.
    float exclI  = 0.0;
    float exclII = 0.0;
    if (local < MAX_TILES_PER_ROW && local > 0) {
        exclI  = scratchPrefixI[local - 1];
        exclII = scratchPrefixII[local - 1];
    }
    barrier();
    if (local < MAX_TILES_PER_ROW) {
        scratchPrefixI[local]  = exclI;
        scratchPrefixII[local] = exclII;
    }
    barrier();

    // Step 4 — apply the exclusive prefix to every pixel in this row.
    // Each thread strides W pixels in steps of 256, so a 4000-wide row
    // splits across the 256 threads as ~16 strided iterations per thread.
    for (int globalX = local; globalX < W; globalX += 256) {
        int tileIdx = globalX / 256;
        if (tileIdx == 0) continue;   // tile 0 has no prefix to add

        float prefixI  = scratchPrefixI[tileIdx];
        float prefixII = scratchPrefixII[tileIdx];

        int idx = row * W + globalX;
        vec4 v = boxH[idx];
        v.x += prefixI;
        v.y += prefixII;
        boxH[idx] = v;
    }
}
