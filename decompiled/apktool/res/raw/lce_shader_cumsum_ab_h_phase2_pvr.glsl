#version 310 es
// Horizontal Cumulative Sum for (a, b) — Phase 2
//
// Counterpart to lce_shader_cumsum_h_phase2.glsl, but for the (a, b)
// guided-filter coefficients. Uses the same row-prefix shared-memory
// scan structure — see that file for the full algorithmic explanation.

layout(local_size_x = 256, local_size_y = 1) in;

// FP32 always (cumulative sum, not normalized). See lce_shader_cumsum_h.glsl
// for the precision rationale.
layout(std430, binding = 6) buffer BoxHAbBuf {
    vec4 boxHAb[];
};

// FP32 always — sized to vec4 in GpuResourcePool. See lce_shader_cumsum_h.glsl.
layout(std430, binding = 13) readonly buffer TileSumsAbBuf {
    vec4 tileSumsAb[];
};

layout(location = 0) uniform ivec2 uSize;
layout(location = 1) uniform int uTilesPerRow;

const int MAX_TILES_PER_ROW = 64;

shared float scratchPrefixA[256];   // one slot per lane (see main)
shared float scratchPrefixB[256];

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
    vec4 ts = tileSumsAb[min(row, H - 1) * tpr + min(local, tpr - 1)];
    scratchPrefixA[local] = inT * ts.x;
    scratchPrefixB[local] = inT * ts.y;
    barrier();

    // Hillis-Steele inclusive scan over the first MAX_TILES_PER_ROW (= 64) entries,
    // unrolled. Lanes >= 64 compute unused values; lanes < 64 only read lower lanes.
#define PREFIX_STEP(OFFSET) {                                                   \
        int src = max(local - (OFFSET), 0);                                     \
        float keep = step(float(OFFSET), float(local));                         \
        float addA = keep * scratchPrefixA[src];                                          \
        float addB = keep * scratchPrefixB[src];                                          \
        barrier();                                                              \
        scratchPrefixA[local] += addA;                                                    \
        scratchPrefixB[local] += addB;                                                    \
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
    float exclA = keep0 * scratchPrefixA[max(local - 1, 0)];
    float exclB = keep0 * scratchPrefixB[max(local - 1, 0)];
    barrier();
    scratchPrefixA[local] = exclA;
    scratchPrefixB[local] = exclB;
    barrier();

    // Apply the prefix (no barriers below, so this may branch).
    for (int globalX = local; rowValid && globalX < W; globalX += 256) {
        int tileIdx = globalX / 256;
        if (tileIdx == 0) continue;   // tile 0 has no prefix to add

        int idx = row * W + globalX;
        vec4 v = boxHAb[idx];
        v.x += scratchPrefixA[tileIdx];
        v.y += scratchPrefixB[tileIdx];
        boxHAb[idx] = v;
    }
}
