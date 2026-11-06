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

    // PowerVR D-Series (Pixel 10) note: a conditional shared-memory read ahead of a
    // barrier() (e.g. `local >= off ? scratch[local - off] : 0.0`) makes the driver skip
    // the whole dispatch, as does an early return before a barrier (GLSL ES 3.10 §8.15).
    // Every lane therefore runs the same code up to the last barrier: loads and scan reads
    // use a clamped index and a 0/1 mask, and out-of-range workgroups are masked, not
    // returned. Results for valid elements are unchanged.
    bool rowValid = row < H;
    int globalX = tileIdx * 256 + local;
    int idx = row * W + globalX;
    bool inRange = rowValid && globalX < W;
    float mask = inRange ? 1.0 : 0.0;
    int loadIdx = min(row, H - 1) * W + min(globalX, W - 1);

    vec4 coeff = vec4(ab[loadIdx]);
    float vA = mask * coeff.x;
    float vB = mask * coeff.y;
    scratchA[local] = vA;
    scratchB[local] = vB;
    barrier();

    // Hillis-Steele inclusive scan, unrolled (barrier() may not sit in control flow).
#define SCAN_STEP(OFFSET) {                                                     \
        int src = max(local - (OFFSET), 0);                                     \
        float keep = step(float(OFFSET), float(local));                         \
        float addA = keep * scratchA[src];                                          \
        float addB = keep * scratchB[src];                                          \
        barrier();                                                              \
        scratchA[local] += addA;                                                    \
        scratchB[local] += addB;                                                    \
        barrier();                                                              \
    }
    SCAN_STEP(1)
    SCAN_STEP(2)
    SCAN_STEP(4)
    SCAN_STEP(8)
    SCAN_STEP(16)
    SCAN_STEP(32)
    SCAN_STEP(64)
    SCAN_STEP(128)
#undef SCAN_STEP

    // Writes after the last barrier may branch.
    if (inRange) {
        boxHAb[idx] = vec4(scratchA[local], scratchB[local], 0.0, 0.0);
    }
    if (rowValid && local == 255) {
        tileSumsAb[row * uTilesPerRow + tileIdx] = vec4(scratchA[255], scratchB[255], 0.0, 0.0);
    }
}
