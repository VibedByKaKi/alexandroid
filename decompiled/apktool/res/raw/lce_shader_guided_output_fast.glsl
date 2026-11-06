#version 310 es
// Fast Guided Filter — output pass with bilinear upsampling.
//
// Byte-identical to lce_shader_guided_output.glsl EXCEPT meanAb is stored
// at LOW resolution (uSizeLow) and bilinearly upsampled to each full-res
// pixel before applying lpf = meanA·I + meanB. I is still computed at full
// resolution via computeYLinear(inputImage). Mirrors tone_retoucher.py
// gf_gray_fast: cv2.resize(mean_a/mean_b, full, INTER_LINEAR) then
// q = mean_a·I + mean_b.
//
// Full-res dispatch: (ceil(W/16), ceil(H/16), 1), local 16×16.

layout(local_size_x = 16, local_size_y = 16) in;

layout(rgba32f, binding = 0) readonly uniform highp image2D inputImage;

layout(std430, binding = 7) readonly buffer MeanAbBuf {
    LCE_VEC4 meanAb[];   // (meanA, meanB, 0, 0) at LOW resolution
};

layout(std430, binding = 8) buffer LpfBuf {
    LCE_FLOAT lpf[];     // full-resolution output
};

layout(location = 0) uniform ivec2 uSize;      // full (W, H)
layout(location = 1) uniform ivec2 uSizeLow;   // low  (lowW, lowH)
layout(location = 2) uniform int uSub;

// Bilinear sample of (meanA, meanB) from the low-res grid at low-res
// coordinate fp, clamped to the low-res bounds (matches cv2 INTER_LINEAR
// with edge clamping).
vec2 sampleMeanAb(vec2 fp) {
    int lw = uSizeLow.x;
    int lh = uSizeLow.y;
    float gx = clamp(fp.x, 0.0, float(lw - 1));
    float gy = clamp(fp.y, 0.0, float(lh - 1));
    int x0 = int(floor(gx));
    int y0 = int(floor(gy));
    int x1 = min(x0 + 1, lw - 1);
    int y1 = min(y0 + 1, lh - 1);
    float fx = gx - float(x0);
    float fy = gy - float(y0);
    vec2 c00 = vec4(meanAb[y0 * lw + x0]).xy;
    vec2 c10 = vec4(meanAb[y0 * lw + x1]).xy;
    vec2 c01 = vec4(meanAb[y1 * lw + x0]).xy;
    vec2 c11 = vec4(meanAb[y1 * lw + x1]).xy;
    vec2 top = mix(c00, c10, fx);
    vec2 bot = mix(c01, c11, fx);
    return mix(top, bot, fy);
}

void main() {
    ivec2 pos = ivec2(gl_GlobalInvocationID.xy);
    if (pos.x >= uSize.x || pos.y >= uSize.y) return;

    // Full-res pixel center → low-res coordinate (pixel-center convention,
    // matching cv2.resize INTER_LINEAR): (pos + 0.5) / s - 0.5.
    vec2 fp = (vec2(pos) + 0.5) / float(uSub) - 0.5;
    vec2 mab = sampleMeanAb(fp);

    vec4 pixel = imageLoad(inputImage, pos);
    float I = computeYLinear(pixel.rgb);

    lpf[pos.y * uSize.x + pos.x] = mab.x * I + mab.y;
}
