// LCE Retoucher — shared GLSL helpers.
//
// Injected by GpuPipeline.loadShader after the `#version 310 es` directive
// and before the rest of each shader's source. Do NOT include `#version`
// here; the loader handles version placement so each shader can omit it
// from its body without duplicating the directive.
//
// Anything declared in this file is visible to every LCE compute shader.
// Keep it small and well-named to avoid name-collisions with shader-local
// declarations.

// ─── Precision-mode macros ────────────────────────────────────────────
//
// The LCE pipeline runs the same compute shaders in two precision modes:
//
//   • FP32 (default): SSBOs hold float/vec4. Storage cost is the
//     full 4 B per scalar / 16 B per vec4.
//   • f16 (opt-in): SSBOs hold float16_t /
//     f16vec4 — half the storage. Compute stays in f32; the GPU does
//     implicit conversion on load/store.
//
// We use #define-d storage-type macros so each shader's SSBO declarations
// can switch between modes without duplicating the entire shader file. A
// shader writes its body using `LCE_FLOAT` / `LCE_VEC4` for the SSBO
// element type, but uses plain `float` / `vec4` for local variables and
// computation. This is "storage-only f16" — the most conservative use of
// f16 and the safest for numerical correctness.
//
// Activation:
//
//   • GpuPipeline.loadShader prepends `#define LCE_PRECISION_F16` or
//     `#define LCE_PRECISION_F32` based on the active precision mode.
//   • The loader retries with FP32 if any shader fails to compile in
//     f16 mode (transparent auto-fallback).
//
// Required extensions in f16 mode:
//
//   • GL_EXT_shader_16bit_storage — allows float16_t / f16vec4 in SSBO
//     blocks. Widely supported on modern Adreno/Mali (Adreno 6xx+,
//     Mali-G72+). Must be enabled BEFORE any storage-block declaration
//     that uses the half-precision types.
//
// Note: we do NOT require GL_EXT_shader_explicit_arithmetic_types_float16
// (the compute-side f16 extension). Storage-only conversion is enough for
// our memory savings; compute stays in f32 for numerical correctness.
//
// Numerical safety with f16 storage:
//
//   • Values stored: linearized luminance and RGB in [0, 1]; cumsum
//     accumulators bounded by image dimension (≤ 4000); guided-filter
//     coefficients also in normal ranges. None overflow f16's max of
//     65504.
//   • Precision: f16 has 11 effective mantissa bits. Worst-case
//     relative error per f32 → f16 → f32 round-trip is ~5e-4. Well
//     inside the V1 quality bar (L∞ ≤ 3/255 ≈ 1.2%, PSNR ≥ 42 dB).
//   • Subnormals: f16's smallest normal is ~6.1e-5; smaller values
//     denormalize / flush. Our guided-filter eps = 8/1024 ≈ 7.8e-3 is
//     comfortably above this floor.

#ifdef LCE_PRECISION_F16
    #extension GL_EXT_shader_16bit_storage : require
    #define LCE_VEC4  f16vec4
    #define LCE_FLOAT float16_t
#else
    #define LCE_VEC4  vec4
    #define LCE_FLOAT float
#endif

// ─── Y-linear derivation ──────────────────────────────────────────────
//
// Computes the linearized perceptual luminance Y used throughout the LCE
// pipeline. The formula is identical to the one previously embedded in
// lce_shader_color_convert.glsl — Option A in the perf-stability design,
// chosen for byte-equivalence with the previous pipeline:
//
//     luma   = 0.299·R + 0.587·G + 0.114·B            // BT.601
//     maxRGB = max(R, max(G, B))
//     minRGB = min(R, min(G, B))
//     S      = (maxRGB > 0) ? (maxRGB − minRGB) / maxRGB : 0
//     alpha  = 1 − exp(6·S − 6.22)
//     Y_perc = alpha · luma + (1 − alpha) · maxRGB    // gamma-compressed
//     Y_linear = pow(max(Y_perc, 1e-5), 2.2)
//
// `rgbGamma` is the gamma-compressed (sRGB-encoded) RGB triplet in [0, 1],
// matching what color_convert reads from inputImage. The 1e-5 floor before
// pow() guards against pow(0, x) on drivers that lack a clamped intrinsic.
float computeYLinear(vec3 rgbGamma) {
    float r = rgbGamma.r;
    float g = rgbGamma.g;
    float b = rgbGamma.b;

    float luma = 0.299 * r + 0.587 * g + 0.114 * b;

    float maxRGB = max(r, max(g, b));
    float minRGB = min(r, min(g, b));
    float S = (maxRGB > 0.0) ? ((maxRGB - minRGB) / maxRGB) : 0.0;

    float alpha = 1.0 - exp(6.0 * S - 6.22);
    float Y = alpha * luma + (1.0 - alpha) * maxRGB;

    return pow(max(Y, 1e-5), 2.2);
}
