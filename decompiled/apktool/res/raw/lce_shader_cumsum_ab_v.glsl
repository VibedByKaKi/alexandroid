#version 310 es
// Vertical Box Sum for guided-filter (a, b) — completes 2D box filter
//
//
// Reads from boxHAb[] stores the TRUE HORIZONTAL CUMULATIVE
// SUM of (a, b) per pixel. Computes the horizontal box value via subtraction,
// then accumulates vertically with a sliding window. Produces (meanA, meanB)
// per pixel.
//
//     boxRowA(y, x) = cumHAb[y, min(W-1, x+r)].x − [(x-r-1 >= 0) ? cumHAb[y, x-r-1].x : 0]
//     boxRowB(y, x) = same with cumHAb[].y
//
// N count derivation: this shader DERIVES N inline from (x, y, r, W, H)
// rather than reading it from gfStats[idx].x. Reasons:
//
//   • At default radius (r ≈ 300 at 12 MP), N reaches ~361k — well above
//     f16's max 65504. Storing N in an f16 SSBO would clip / inf and
//     break the meanA/meanB normalization. (Storing N in an f16-typed
//     gfStats SSBO would silently break at default resolution, which is
//     why N is derived inline rather than read from storage.)
//   • N is purely a function of geometry (x, y, r, W, H) — no per-pixel
//     state. Re-deriving it here is essentially free (a few int ops per
//     pixel) and removes the f16-storage hazard entirely.
//   • cumsum_v uses the same formula and produces identical N values,
//     so the two shaders stay in lockstep without the round-trip.
//
// A future optimization could parallelize the vertical accumulation.

layout(local_size_x = 256, local_size_y = 1) in;

// FP32 always (cumulative sum, not normalized). See lce_shader_cumsum_h.glsl
// for the precision rationale.
layout(std430, binding = 6) readonly buffer BoxHAbBuf {
    vec4 boxHAb[];      // cumulative sum of (a, b)
};

layout(std430, binding = 7) buffer MeanAbBuf {
    LCE_VEC4 meanAb[];      // (meanA, meanB, 0, 0) per pixel
};

layout(location = 0) uniform ivec2 uSize;
layout(location = 1) uniform int uRadius;

// Compute the horizontal box-windowed sum at column `col` of row `y`,
// using the cumulative-sum buffer. Returns vec2(boxSumA, boxSumB).
vec2 horizontalBoxAbAt(int y, int col, int W, int r) {
    int xRight = min(W - 1, col + r);
    int xLeftMinus1 = max(0, col - r) - 1;

    vec4 right = boxHAb[y * W + xRight];
    vec2 sumPos = right.xy;
    if (xLeftMinus1 >= 0) {
        vec4 left = boxHAb[y * W + xLeftMinus1];
        sumPos -= left.xy;
    }
    return sumPos;
}

void main() {
    int col = int(gl_GlobalInvocationID.x);
    if (col >= uSize.x) return;

    int W = uSize.x, H = uSize.y, r = uRadius;

    // Width of the horizontal box window at this column. Constant across
    // rows for a given column — same factor cumsum_v computes.
    int xRight = min(W - 1, col + r);
    int xLeft  = max(0, col - r);
    int boxWidthAtCol = xRight - xLeft + 1;

    // Initial vertical window: y in [0, min(r, H-1)].
    vec2 sum = vec2(0.0);
    int initBottom = min(r, H - 1);
    for (int y = 0; y <= initBottom; y++) {
        sum += horizontalBoxAbAt(y, col, W, r);
    }

    // N for the first output row (y=0).
    int boxHeightAt0 = initBottom + 1;
    int N0 = boxWidthAtCol * boxHeightAt0;
    float invN0 = 1.0 / float(max(N0, 1));
    meanAb[col] = vec4(sum.x * invN0, sum.y * invN0, 0.0, 0.0);

    for (int y = 1; y < H; y++) {
        int newBottom = y + r;
        if (newBottom < H) {
            sum += horizontalBoxAbAt(newBottom, col, W, r);
        }
        int oldTop = y - r - 1;
        if (oldTop >= 0) {
            sum -= horizontalBoxAbAt(oldTop, col, W, r);
        }

        // Recompute the vertical window height at this y for N.
        int yTop = max(0, y - r);
        int yBot = min(H - 1, y + r);
        int boxHeightAtY = yBot - yTop + 1;
        int N = boxWidthAtCol * boxHeightAtY;
        float invN = 1.0 / float(max(N, 1));

        meanAb[y * W + col] = vec4(sum.x * invN, sum.y * invN, 0.0, 0.0);
    }
}
