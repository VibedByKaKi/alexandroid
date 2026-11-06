#version 310 es
// Vertical Cumulative Sum — completes 2D box filter, derives guided-filter stats.
//
//
// Reads from boxH[] stores the TRUE HORIZONTAL CUMULATIVE
// SUM of (I, I*I) per pixel — NOT the box-filtered value. This shader
// computes the horizontal box value via subtraction, then accumulates
// vertically using a sliding window, producing the full 2D box-filtered
// (N, mean_I, corr_I) per pixel.
//
//     boxRowI(y, x) = cumH[y, min(W-1, x+r)].x − [(x-r-1 >= 0) ? cumH[y, x-r-1].x : 0]
//     boxRowII(y, x) = same with cumH[].y
//
// Then sum these vertically over the in-bounds Y range to get the full 2D
// box.
//
// A future optimization could parallelize the vertical accumulation
// too. Until then, cumsum_v stays as a per-column serial sliding window.
// The horizontal cumsum step previously had a 4000-element serial loop per row;
// it is now O(log W), and the longest remaining serial loop
// is this shader's H-element column loop (~3000 at 12 MP). That's still
// long enough to be worth parallelizing eventually but well below the
// previous TDR threshold.
//
// Workgroup: 256 threads along X. Each thread handles one column.
// Dispatch: ((W+255)/256, 1, 1).

layout(local_size_x = 256, local_size_y = 1) in;

// FP32 always (cumulative sum, not normalized). See lce_shader_cumsum_h.glsl
// for the precision rationale.
layout(std430, binding = 3) readonly buffer BoxHBuf {
    vec4 boxH[];     // cumulative sum of (I, I*I)
};

// gfStats slot layout (N derived inline):
//   .x = 0   — formerly the box pixel count N. Removed because at default
//              radius (r ≈ 300 at 12 MP) N ≈ 361k overflows f16's max 65504,
//              breaking the meanA/meanB normalization in cumsum_ab_v.
//              N is now derived inline from (x, y, r, W, H) wherever needed.
//   .y = meanI  (in [0,1])
//   .z = corrI  (in [0,1])
//   .w = 0
//
// The slot is kept at 4 components for std430 alignment and to avoid
// changing binding contracts on this hot path. The .x slot may be reused
// in a future CR for additional per-pixel state.
layout(std430, binding = 4) buffer GfStatsBuf {
    LCE_VEC4 gfStats[];
};

layout(location = 0) uniform ivec2 uSize;
layout(location = 1) uniform int uRadius;

// Compute the horizontal box-windowed sum at column `col` of row `y`,
// using the cumulative-sum buffer. Edge clamping built in.
//
// Returns vec2(boxSumI, boxSumII).
//
// W is uSize.x. r is uRadius.
vec2 horizontalBoxAt(int y, int col, int W, int r) {
    int xRight = min(W - 1, col + r);
    int xLeftMinus1 = max(0, col - r) - 1;   // can be -1

    vec4 right = boxH[y * W + xRight];
    vec2 sumPos = right.xy;
    if (xLeftMinus1 >= 0) {
        vec4 left = boxH[y * W + xLeftMinus1];
        sumPos -= left.xy;
    }
    return sumPos;
}

void main() {
    int col = int(gl_GlobalInvocationID.x);
    if (col >= uSize.x) return;

    int W = uSize.x, H = uSize.y, r = uRadius;

    // Width of the horizontal box window at this column. This factor
    // contributes to the 2D box pixel count N.
    int xRight = min(W - 1, col + r);
    int xLeft  = max(0, col - r);
    int boxWidthAtCol = xRight - xLeft + 1;

    // Initial vertical window: y in [0, min(r, H-1)].
    // Accumulate horizontalBoxAt(y, col) for y in that range.
    vec2 sum = vec2(0.0);
    int initBottom = min(r, H - 1);
    for (int y = 0; y <= initBottom; y++) {
        sum += horizontalBoxAt(y, col, W, r);
    }

    // For the first output row (y=0), N = horizontalWindowWidth × verticalWindowHeight.
    // N is derived inline (cumsum_ab_v re-derives the same value); slot .x is 0.
    int boxHeightAt0 = initBottom + 1;
    int N0 = boxWidthAtCol * boxHeightAt0;
    float invN0 = 1.0 / float(max(N0, 1));
    gfStats[col] = vec4(0.0, sum.x * invN0, sum.y * invN0, 0.0);

    // Slide the window down for subsequent rows.
    for (int y = 1; y < H; y++) {
        int newBottom = y + r;
        if (newBottom < H) {
            sum += horizontalBoxAt(newBottom, col, W, r);
        }
        int oldTop = y - r - 1;
        if (oldTop >= 0) {
            sum -= horizontalBoxAt(oldTop, col, W, r);
        }

        // Recompute the vertical window height at this y for N.
        int yTop = max(0, y - r);
        int yBot = min(H - 1, y + r);
        int boxHeightAtY = yBot - yTop + 1;
        int N = boxWidthAtCol * boxHeightAtY;
        float invN = 1.0 / float(max(N, 1));

        gfStats[y * W + col] = vec4(0.0, sum.x * invN, sum.y * invN, 0.0);
    }
}
