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
    if (row >= H) return;

    int globalX = tileIdx * 256 + local;
    int idx = row * W + globalX;

    float vI = (globalX < W) ? yLow[idx] : 0.0;
    float vII = vI * vI;

    scratchI[local] = vI;
    scratchII[local] = vII;
    barrier();

    for (int offset = 1; offset < 256; offset <<= 1) {
        float addI  = (local >= offset) ? scratchI[local - offset]  : 0.0;
        float addII = (local >= offset) ? scratchII[local - offset] : 0.0;
        barrier();
        scratchI[local]  += addI;
        scratchII[local] += addII;
        barrier();
    }

    if (globalX < W) {
        boxH[idx] = vec4(scratchI[local], scratchII[local], 0.0, 0.0);
    }

    if (local == 255) {
        tileSums[row * uTilesPerRow + tileIdx] =
                vec4(scratchI[255], scratchII[255], 0.0, 0.0);
    }
}
