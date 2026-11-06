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

shared float scratchPrefixA[MAX_TILES_PER_ROW];
shared float scratchPrefixB[MAX_TILES_PER_ROW];

void main() {
    int row = int(gl_WorkGroupID.y);
    int local = int(gl_LocalInvocationID.x);

    int W = uSize.x;
    int H = uSize.y;
    int tpr = uTilesPerRow;
    if (row >= H) return;

    // Load tileSumsAb[row, ...] into shared memory; zero-pad outside [0, tpr).
    if (local < MAX_TILES_PER_ROW) {
        if (local < tpr) {
            vec4 ts = tileSumsAb[row * tpr + local];
            scratchPrefixA[local] = ts.x;
            scratchPrefixB[local] = ts.y;
        } else {
            scratchPrefixA[local] = 0.0;
            scratchPrefixB[local] = 0.0;
        }
    }
    barrier();

    // Hillis-Steele inclusive scan over MAX_TILES_PER_ROW (= 64). 6 steps.
    for (int offset = 1; offset < MAX_TILES_PER_ROW; offset <<= 1) {
        float addA = 0.0;
        float addB = 0.0;
        if (local < MAX_TILES_PER_ROW && local >= offset) {
            addA = scratchPrefixA[local - offset];
            addB = scratchPrefixB[local - offset];
        }
        barrier();
        if (local < MAX_TILES_PER_ROW) {
            scratchPrefixA[local] += addA;
            scratchPrefixB[local] += addB;
        }
        barrier();
    }

    // Inclusive → exclusive shift.
    float exclA = 0.0;
    float exclB = 0.0;
    if (local < MAX_TILES_PER_ROW && local > 0) {
        exclA = scratchPrefixA[local - 1];
        exclB = scratchPrefixB[local - 1];
    }
    barrier();
    if (local < MAX_TILES_PER_ROW) {
        scratchPrefixA[local] = exclA;
        scratchPrefixB[local] = exclB;
    }
    barrier();

    // Apply prefix to every pixel in this row.
    for (int globalX = local; globalX < W; globalX += 256) {
        int tileIdx = globalX / 256;
        if (tileIdx == 0) continue;

        float prefixA = scratchPrefixA[tileIdx];
        float prefixB = scratchPrefixB[tileIdx];

        int idx = row * W + globalX;
        vec4 v = boxHAb[idx];
        v.x += prefixA;
        v.y += prefixB;
        boxHAb[idx] = v;
    }
}
