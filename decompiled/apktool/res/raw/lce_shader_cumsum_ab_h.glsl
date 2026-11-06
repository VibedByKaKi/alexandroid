#version 310 es
// Horizontal Cumulative Sum for guided-filter (a, b) — Phase 1
// (parallel-scan)
//
// Mirrors lce_shader_cumsum_h.glsl but operates on the (a, b) guided-filter
// coefficients written by guided_coeff. Output stored in boxHAb[] is the
// TRUE HORIZONTAL CUMULATIVE SUM (NOT the box-filter result, unlike the previous implementation).
//
// Phase-1 scope: per-tile inclusive scan (256 elements per tile via
// Hillis-Steele in workgroup-shared memory). Tile total written to
// tileSumsAb[] for phase 2.
//
// Workgroup layout matches cumsum_h: 256 threads along X, 1 along Y.
// Total dispatch: (tilesPerRow, height, 1).

layout(local_size_x = 256, local_size_y = 1) in;

layout(std430, binding = 5) readonly buffer AbBuf {
    LCE_VEC4 ab[];          // (a, b, 0, 0) per pixel from guided_coeff
};

// Output: per-pixel cumulative sum of (a, b).
// Slot layout: .x = cumA, .y = cumB, .z = 0, .w = 0.
//
// FP32 ALWAYS — declared as plain `vec4` (NOT LCE_VEC4) regardless of
// LCE_PRECISION mode. Same precision rationale as boxH in
// lce_shader_cumsum_h.glsl: cumulative sums up to ~4000 elements wide
// would lose accuracy beyond the V1 quality bar at f16 storage.
// GpuResourcePool sizes sharedBufA at 16 B/element to match.
layout(std430, binding = 6) buffer BoxHAbBuf {
    vec4 boxHAb[];
};

// Output: per-tile total. Layout: tileSumsAb[row * tilesPerRow + tileIdx].
// FP32 always — sized to vec4 in GpuResourcePool. See lce_shader_cumsum_h.glsl
// for the rationale.
layout(std430, binding = 13) buffer TileSumsAbBuf {
    vec4 tileSumsAb[];
};

layout(location = 0) uniform ivec2 uSize;
layout(location = 1) uniform int uTilesPerRow;

shared float scratchA[256];
shared float scratchB[256];

void main() {
    int row = int(gl_WorkGroupID.y);
    int tileIdx = int(gl_WorkGroupID.x);
    int local = int(gl_LocalInvocationID.x);

    int W = uSize.x;
    int H = uSize.y;
    if (row >= H) return;

    int globalX = tileIdx * 256 + local;
    int idx = row * W + globalX;

    // Load: (a, b) from input buffer. Past row end → 0 padding.
    float vA, vB;
    if (globalX < W) {
        vec4 coeff = vec4(ab[idx]);
        vA = coeff.x;
        vB = coeff.y;
    } else {
        vA = 0.0;
        vB = 0.0;
    }

    scratchA[local] = vA;
    scratchB[local] = vB;
    barrier();

    // Hillis-Steele inclusive scan (8 sync steps for 256 elements).
    for (int offset = 1; offset < 256; offset <<= 1) {
        float addA = (local >= offset) ? scratchA[local - offset] : 0.0;
        float addB = (local >= offset) ? scratchB[local - offset] : 0.0;
        barrier();
        scratchA[local] += addA;
        scratchB[local] += addB;
        barrier();
    }

    if (globalX < W) {
        boxHAb[idx] = vec4(scratchA[local], scratchB[local], 0.0, 0.0);
    }

    if (local == 255) {
        tileSumsAb[row * uTilesPerRow + tileIdx] =
                vec4(scratchA[255], scratchB[255], 0.0, 0.0);
    }
}
