#version 310 es
// Tone Mapping + LCE + Color Output 
// Applies logarithmic shadow/highlight tone curves, brightness-weighted blending,
// high-pass LCE gain with extreme-brightness reduction, ratio-based color
// preservation, and gamma correction (power 1/2.2).
//
// Y_linear is derived from the input texture via
// computeYLinear() (declared in lce_shader_common.glsl, prepended to this
// source by GpuPipeline.loadShader) instead of read from a yLinearBuf SSBO.
// Math is identical to the previous SSBO-read version; this shader saves the per-pixel SSBO read
// at the cost of one helper-function call per pixel.

layout(local_size_x = 16, local_size_y = 16) in;

layout(rgba32f, binding = 0) readonly uniform highp image2D inputImage;

// LCE_INLINE_LINEAR (defined by GpuPipeline when the GPU's storage-buffer size limit
// cannot hold the full-resolution linearized RGB buffer): the linear RGB is computed
// here from inputImage with the same math as lce_shader_color_convert.glsl instead of
// being read from inpLinear.
#ifndef LCE_INLINE_LINEAR
layout(std430, binding = 2) readonly buffer InpLinearBuf {
    LCE_VEC4 inpLinear[];   // vec4 in FP32, f16vec4 in f16 mode
};
#endif

layout(std430, binding = 8) readonly buffer LpfBuf {
    LCE_FLOAT lpf[];        // float in FP32, float16_t in f16 mode
};

layout(rgba8, binding = 9) writeonly uniform highp image2D outputImage;

layout(location = 0) uniform ivec2 uSize;
layout(location = 2) uniform float uGainL;
layout(location = 3) uniform float uGainH;
layout(location = 4) uniform float uCompressL;
layout(location = 5) uniform float uCompressH;

// Highlight protection uniforms (Camera team reference, tone_retoucher.py Step 9).
// Smoothly caps the LTM gain ratio for bright pixels to prevent highlight clipping.
layout(location = 6) uniform float uHighlightRampStart;  // linear X below which no cap (default 0.08)
layout(location = 7) uniform float uHighlightRampEnd;    // linear X above which full cap (default 0.35)
layout(location = 8) uniform float uMaxHighlightGain;    // gain ceiling for bright pixels (default 1.02)

void main() {
    ivec2 pos = ivec2(gl_GlobalInvocationID.xy);
    if (pos.x >= uSize.x || pos.y >= uSize.y) return;

    // Single-column image: return input unmodified
    if (uSize.x == 1) {
        vec4 orig = imageLoad(inputImage, pos);
        imageStore(outputImage, pos, clamp(orig, 0.0, 1.0));
        return;
    }

    int idx = pos.y * uSize.x + pos.x;
    // Derive Y_linear from the original sRGB input. computeYLinear is
    // defined in lce_shader_common.glsl and
    // produces the byte-equivalent value that yLinearBuf used to hold.
    vec4 srcPixel = imageLoad(inputImage, pos);
    float Y = computeYLinear(srcPixel.rgb);
    // Read from f16 storage into f32 locals. vec4(...) is a no-op in
    // FP32 mode, a widening conversion in f16 mode (implicit on most
    // drivers; explicit construct keeps the source compatible with strict
    // type-checking).
#ifdef LCE_INLINE_LINEAR
    vec4 inp = vec4(pow(max(srcPixel.rgb, vec3(1e-5)), vec3(2.2)), 1.0);
#else
    vec4 inp = vec4(inpLinear[idx]);
#endif
    // Clamp guided filter output to [0,1] — box-filter FP accumulation can push
    // values slightly outside this range, which would corrupt blending weights,
    // high-pass detail, and the extreme-brightness reduction factor.
    float lp = clamp(float(lpf[idx]), 0.0, 1.0);

    // Shadow tone curve: Xl = log(1 + lp*strengthL) / log(1 + strengthL)
    float Xl = lp, Xu = lp;

    float strengthL = uCompressL / 16.0;
    if (strengthL > 0.0) {
        float logDenomL = log(1.0 + strengthL);
        Xl = log(1.0 + lp * strengthL) / logDenomL;
        Xl = min(Xl, 1.0);
    }

    // Highlight tone curve: Xu = 1 - log(1 + (1-lp)*strengthH) / log(1 + strengthH)
    float strengthH = uCompressH / 16.0;
    if (strengthH > 0.0) {
        float logDenomH = log(1.0 + strengthH);
        Xu = 1.0 - log(1.0 + (1.0 - lp) * strengthH) / logDenomH;
        Xu = max(Xu, 0.0);
    }

    // Brightness-weighted blending
    float Lw = 1.0 - lp;  // shadow weight
    float Hw = lp;          // highlight weight
    float ltm = Lw * Xl + Hw * Xu;

    // High-pass detail + LCE gain
    float hpf = Y - lp;
    float gL = uGainL / 16.0;
    float gH = uGainH / 16.0;
    float lce = Lw * hpf * gL + Hw * hpf * gH;

    // Extreme-brightness reduction
    lce *= min(lp, 1.0 - lp);
    ltm += lce;

    // Color preservation via ratio-based multiplication
    float ratio = (lp > 1e-7) ? (ltm / lp) : 0.0;

    // Highlight protection (Camera team reference, tone_retoucher.py Step 9):
    // Smoothly ramp from unconstrained ratio (lp <= rampStart) to a hard cap
    // of maxHighlightGain (lp >= rampEnd). Prevents bright pixels from being
    // pushed toward saturation by the LTM ratio after gamma correction.
    float t = clamp((lp - uHighlightRampStart) / (uHighlightRampEnd - uHighlightRampStart), 0.0, 1.0);
    float cappedRatio = min(ratio, uMaxHighlightGain);
    ratio = (1.0 - t) * ratio + t * cappedRatio;

    vec3 outRgb = inp.rgb * ratio;

    // Gamma correction (linear -> sRGB-ish, reciprocal of 2.2 linearization)
    outRgb = pow(max(outRgb, vec3(1e-5)), vec3(1.0 / 2.2));
    outRgb = clamp(outRgb, 0.0, 1.0);

    imageStore(outputImage, pos, vec4(outRgb, 1.0));
}
