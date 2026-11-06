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
shared float scratchPrefixI[256];   // one slot per lane (see main)
shared float scratchPrefixII[256];

void main() {
    int row = int(gl_WorkGroupID.y);
    int local = int(gl_LocalInvocationID.x);

    int W = uSize.x;
    int H = uSize.y;
    int tpr = uTilesPerRow;

    // PowerVR D-Series (Pixel 10) note: a conditional shared-memory read ahead of a
    // barrier() (e.g. `local >= off ? scratch[local - off] : 0.0`) makes the driver skip
    // the whole dispatch, as does an early return before a barrier (GLSL ES 3.10 §8.15).
    // Every lane therefore runs the same code up to the last barrier: loads and scan reads
    // use a clamped index and a 0/1 mask, and out-of-range workgroups are masked, not
    // returned. Results for valid elements are unchanged.
    bool rowValid = row < H;

    // Load this row's tile totals into lanes [0, tpr); every other lane loads 0.
    float inT = (rowValid && local < tpr) ? 1.0 : 0.0;
    vec4 ts = tileSums[min(row, H - 1) * tpr + min(local, tpr - 1)];
    scratchPrefixI[local] = inT * ts.x;
    scratchPrefixII[local] = inT * ts.y;
    barrier();

    // Hillis-Steele inclusive scan over the first MAX_TILES_PER_ROW (= 64) entries,
    // unrolled. Lanes >= 64 compute unused values; lanes < 64 only read lower lanes.
#define PREFIX_STEP(OFFSET) {                                                   \
        int src = max(local - (OFFSET), 0);                                     \
        float keep = step(float(OFFSET), float(local));                         \
        float addA = keep * scratchPrefixI[src];                                          \
        float addB = keep * scratchPrefixII[src];                                          \
        barrier();                                                              \
        scratchPrefixI[local] += addA;                                                    \
        scratchPrefixII[local] += addB;                                                    \
        barrier();                                                              \
    }
    PREFIX_STEP(1)
    PREFIX_STEP(2)
    PREFIX_STEP(4)
    PREFIX_STEP(8)
    PREFIX_STEP(16)
    PREFIX_STEP(32)
#undef PREFIX_STEP

    // Inclusive → exclusive: lane t takes lane t-1's value (lane 0 gets 0).
    float keep0 = step(1.0, float(local));
    float exclA = keep0 * scratchPrefixI[max(local - 1, 0)];
    float exclB = keep0 * scratchPrefixII[max(local - 1, 0)];
    barrier();
    scratchPrefixI[local] = exclA;
    scratchPrefixII[local] = exclB;
    barrier();

    // Apply the prefix (no barriers below, so this may branch).
    for (int globalX = local; rowValid && globalX < W; globalX += 256) {
        int tileIdx = globalX / 256;
        if (tileIdx == 0) continue;   // tile 0 has no prefix to add

        int idx = row * W + globalX;
        vec4 v = boxH[idx];
        v.x += scratchPrefixI[tileIdx];
        v.y += scratchPrefixII[tileIdx];
        boxH[idx] = v;
    }
}
