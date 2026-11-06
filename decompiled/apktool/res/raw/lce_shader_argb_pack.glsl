#version 310 es
layout(local_size_x = 256) in;

// Input: RGBA8 output texture
layout(rgba8, binding = 9) readonly uniform highp image2D outputImage;

// Output: packed ARGB integers for Bitmap.copyPixelsFromBuffer()
layout(std430, binding = 11) writeonly buffer ArgbBuf {
    uint argbPixels[];
};

layout(location = 0) uniform ivec2 uSize;

void main() {
    uint idx = gl_GlobalInvocationID.x;
    uint total = uint(uSize.x) * uint(uSize.y);
    if (idx >= total) return;

    int x = int(idx) % uSize.x;
    int y = int(idx) / uSize.x;
    vec4 pixel = imageLoad(outputImage, ivec2(x, y));

    // Pack as ARGB_8888: [A:31-24][R:23-16][G:15-8][B:7-0]
    uint r = uint(clamp(pixel.r * 255.0 + 0.5, 0.0, 255.0));
    uint g = uint(clamp(pixel.g * 255.0 + 0.5, 0.0, 255.0));
    uint b = uint(clamp(pixel.b * 255.0 + 0.5, 0.0, 255.0));
    uint a = uint(clamp(pixel.a * 255.0 + 0.5, 0.0, 255.0));

    argbPixels[idx] = (a << 24u) | (r << 16u) | (g << 8u) | b;
}
