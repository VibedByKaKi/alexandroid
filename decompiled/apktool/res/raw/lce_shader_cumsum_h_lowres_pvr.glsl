#version 310 es
// Fast Guided Filter — horizontal cumulative sum, phase 1, over the
// LOW-RESOLUTION guide.
//
// Byte-identical to lce_shader_cumsum_h.glsl EXCEPT the guide value comes
// from the yLow SSBO (binding 14, produced by lce_shader_downsample_y)
// instead of computeYLinear(inputImage). Runs at low-res dims (uSize =
// (lowW, lowH), dispatch (lowTilesPerRow, lowH, 1)). Everything downstream
// (cumsum_h_phase2, cumsum_v, guided_coeff, cumsum_ab_*) is reused
// unchanged at low-res dims.

layout(local_size_x = 256, local_size_y = 1) in;

layout(std430, binding = 14) readonly buffer YLowBuf {
    float yLow[];
};

// FP32 always — cumulative sum. See lce_shader_cumsum_h.glsl.
layout(std430, binding = 3) buffer BoxHBuf {
    vec4 boxH[];
};

layout(std430, binding = 12) buffer TileSumsBuf {
    vec4 tileSums[];
};

layout(location = 0) uniform ivec2 uSize;       // (lowW, lowH)
layout(location = 1) uniform int uTilesPerRow;  // (lowW + 255) / 256

shared float scratchI[256];
shared float scratchII[256];

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

    float vA = mask * yLow[loadIdx];
    float vB = vA * vA;
    scratchI[local] = vA;
    scratchII[local] = vB;
    barrier();

    // Hillis-Steele inclusive scan, unrolled (barrier() may not sit in control flow).
#define SCAN_STEP(OFFSET) {                                                     \
        int src = max(local - (OFFSET), 0);                                     \
        float keep = step(float(OFFSET), float(local));                         \
        float addA = keep * scratchI[src];                                          \
        float addB = keep * scratchII[src];                                          \
        barrier();                                                              \
        scratchI[local] += addA;                                                    \
        scratchII[local] += addB;                                                    \
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
        boxH[idx] = vec4(scratchI[local], scratchII[local], 0.0, 0.0);
    }
    if (rowValid && local == 255) {
        tileSums[row * uTilesPerRow + tileIdx] = vec4(scratchI[255], scratchII[255], 0.0, 0.0);
    }
}
