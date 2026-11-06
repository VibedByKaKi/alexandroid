#version 310 es
// Color Conversion & Linearization
//
// Writes only the linearized RGB buffer. The linearized luminance Y is no
// longer written to a dedicated SSBO — its consumers (cumsum_h,
// guided_output, tone_lce) call computeYLinear() from lce_shader_common.glsl
// to derive Y on-the-fly from the original sRGB input texture. The math is
// identical to what this shader used to compute (chosen for
// byte-equivalence with the previous pipeline).
//
// Removing yLinearBuf saves pixelCount·4 bytes (48 MiB at 12 MP) of
// long-lived GPU storage and one SSBO binding (binding 1).

layout(local_size_x = 16, local_size_y = 16) in;

layout(rgba32f, binding = 0) readonly uniform highp image2D inputImage;

layout(std430, binding = 2) buffer InpLinearBuf {
    LCE_VEC4 inpLinear[];   // vec4 in FP32, f16vec4 in f16 mode
};

layout(location = 0) uniform ivec2 uSize;

void main() {
    ivec2 pos = ivec2(gl_GlobalInvocationID.xy);
    if (pos.x >= uSize.x || pos.y >= uSize.y) return;

    vec4 pixel = imageLoad(inputImage, pos);
    float r = pixel.r, g = pixel.g, b = pixel.b;

    // Gamma linearize — independent of the Y derivation, kept here so
    // downstream consumers can read inpLinear directly without re-doing the
    // pow.
    vec3 rgbLinear = pow(max(vec3(r, g, b), vec3(1e-5)), vec3(2.2));

    int idx = pos.y * uSize.x + pos.x;
    // Implicit f32 → f16 narrowing on store. The
    // GL_EXT_shader_16bit_storage extension defines implicit conversions
    // ONLY at storage-buffer reads/writes; f16-typed temporaries elsewhere
    // would require the separate GL_EXT_shader_explicit_arithmetic_types_float16
    // extension which we deliberately do not require. So we write `vec4`
    // directly into the SSBO — the driver inserts the narrow.
    inpLinear[idx] = vec4(rgbLinear, 1.0);
}
