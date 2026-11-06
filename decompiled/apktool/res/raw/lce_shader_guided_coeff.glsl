#version 310 es
// Guided Filter Coefficients: a = varI / (varI + eps), b = meanI * (1 - a)
// Self-guided filter (I = p). eps = 8.0 / 1024.0

layout(local_size_x = 16, local_size_y = 16) in;

layout(std430, binding = 4) readonly buffer GfStatsBuf {
    LCE_VEC4 gfStats[];   // vec4 in FP32, f16vec4 in f16 mode
};

layout(std430, binding = 5) buffer AbBuf {
    LCE_VEC4 ab[];        // vec4 in FP32, f16vec4 in f16 mode
};

layout(location = 0) uniform ivec2 uSize;

void main() {
    ivec2 pos = ivec2(gl_GlobalInvocationID.xy);
    if (pos.x >= uSize.x || pos.y >= uSize.y) return;

    int idx = pos.y * uSize.x + pos.x;
    vec4 stats = vec4(gfStats[idx]);    // f16 → f32 widening (no-op in FP32 mode)
    float meanI = stats.y;
    float corrI = stats.z;

    float varI = max(corrI - meanI * meanI, 0.0);
    const float eps = 8.0 / 1024.0;

    float a = varI / (varI + eps);
    float b = meanI * (1.0 - a);

    ab[idx] = vec4(a, b, 0.0, 0.0);   // f32 → f16 narrowing (no-op in FP32 mode)
}
