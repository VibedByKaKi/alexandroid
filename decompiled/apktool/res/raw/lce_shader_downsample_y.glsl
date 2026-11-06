#version 310 es
// Fast Guided Filter — area-downsample the guide.
//
// For each low-resolution pixel, area-average computeYLinear() over the
// s×s block of the full-resolution input, writing the result into the
// low-res guide SSBO (yLow). Mirrors tone_retoucher.py _downsample_area
// applied to the luminance guide I (= Y_linear) before the fast guided
// filter computes coefficients at reduced resolution.
//
// Dispatch: (ceil(lowW/16), ceil(lowH/16), 1), local 16×16.

layout(local_size_x = 16, local_size_y = 16) in;

layout(rgba32f, binding = 0) readonly uniform highp image2D inputImage;

// FP32 always — the guide feeds the cumulative-sum box filter; same
// precision rationale as boxH (see lce_shader_cumsum_h.glsl).
layout(std430, binding = 14) buffer YLowBuf {
    float yLow[];
};

layout(location = 0) uniform ivec2 uSizeFull;
layout(location = 1) uniform ivec2 uSizeLow;
layout(location = 2) uniform int uSub;

void main() {
    ivec2 lp = ivec2(gl_GlobalInvocationID.xy);
    if (lp.x >= uSizeLow.x || lp.y >= uSizeLow.y) return;

    int x0 = lp.x * uSub;
    int y0 = lp.y * uSub;

    float acc = 0.0;
    int n = 0;
    for (int dy = 0; dy < uSub; dy++) {
        int y = y0 + dy;
        if (y >= uSizeFull.y) break;
        for (int dx = 0; dx < uSub; dx++) {
            int x = x0 + dx;
            if (x >= uSizeFull.x) break;
            vec4 px = imageLoad(inputImage, ivec2(x, y));
            acc += computeYLinear(px.rgb);
            n++;
        }
    }

    yLow[lp.y * uSizeLow.x + lp.x] = (n > 0) ? (acc / float(n)) : 0.0;
}
