#version 310 es
// Guided Filter Output: lpf = meanA * I + meanB 
//
// Derives I (Y_linear) directly from the input
// texture via computeYLinear() (declared in lce_shader_common.glsl,
// prepended to this source by GpuPipeline.loadShader) instead of reading
// from yLinearBuf. Math is identical to the previous SSBO-read version; this shader saves the
// per-pixel SSBO read but pays one imageLoad + the helper cost.

layout(local_size_x = 16, local_size_y = 16) in;

layout(rgba32f, binding = 0) readonly uniform highp image2D inputImage;

layout(std430, binding = 7) readonly buffer MeanAbBuf {
    LCE_VEC4 meanAb[];   // vec4 in FP32, f16vec4 in f16 mode
};

layout(std430, binding = 8) buffer LpfBuf {
    LCE_FLOAT lpf[];     // float in FP32, float16_t in f16 mode
};

layout(location = 0) uniform ivec2 uSize;

void main() {
    ivec2 pos = ivec2(gl_GlobalInvocationID.xy);
    if (pos.x >= uSize.x || pos.y >= uSize.y) return;

    int idx = pos.y * uSize.x + pos.x;
    vec4 ab = vec4(meanAb[idx]);    // f16 → f32 widening
    float meanA = ab.x;
    float meanB = ab.y;

    vec4 pixel = imageLoad(inputImage, pos);
    float I = computeYLinear(pixel.rgb);

    lpf[idx] = meanA * I + meanB;   // f32 → f16 narrowing
}
