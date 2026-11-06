#version 310 es
layout(local_size_x = 256) in;

// Input: packed ARGB integers from Bitmap.copyPixelsToBuffer()
layout(std430, binding = 10) readonly buffer ArgbBuf {
    uint argbPixels[];
};

// Output: normalized RGBA float texture
layout(rgba32f, binding = 0) writeonly uniform highp image2D inputImage;

layout(location = 0) uniform ivec2 uSize;  // (width, height)

void main() {
    uint idx = gl_GlobalInvocationID.x;
    uint total = uint(uSize.x) * uint(uSize.y);
    if (idx >= total) return;

    uint packed = argbPixels[idx];

    // Android ARGB_8888 layout: [A:31-24][R:23-16][G:15-8][B:7-0]
    float a = float((packed >> 24u) & 0xFFu) / 255.0;
    float r = float((packed >> 16u) & 0xFFu) / 255.0;
    float g = float((packed >>  8u) & 0xFFu) / 255.0;
    float b = float( packed         & 0xFFu) / 255.0;

    int x = int(idx) % uSize.x;
    int y = int(idx) / uSize.x;
    imageStore(inputImage, ivec2(x, y), vec4(r, g, b, a));
}
