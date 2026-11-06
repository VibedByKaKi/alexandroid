package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.openjdk.tools.javac.jvm.ByteCodes;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class PathParser {
    static ArrayList<PathElement> elements;
    private static int i;
    private static int l;
    private static Path mPath;
    private static boolean mPenDown;
    private static float mPenDownX;
    private static float mPenDownY;
    private static float mPenX;
    private static float mPenY;
    private static float mPivotX;
    private static float mPivotY;
    static float mScale;
    private static String s;

    private static void arc(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        arcTo(f, f2, f3, z, z2, f4 + mPenX, f5 + mPenY);
    }

    private static void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = mPenX;
        float f11 = mPenY;
        float abs = Math.abs(f2 == 0.0f ? f == 0.0f ? f5 - f11 : f : f2);
        float abs2 = Math.abs(f == 0.0f ? f4 - f10 : f);
        if (abs2 == 0.0f || abs == 0.0f || (f4 == f10 && f5 == f11)) {
            lineTo(f4, f5);
            return;
        }
        float radians = (float) Math.toRadians(f3);
        double d = radians;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = f4 - f10;
        float f13 = f5 - f11;
        float f14 = ((sin * f13) / 2.0f) + ((cos * f12) / 2.0f);
        float f15 = -sin;
        float f16 = ((cos * f13) / 2.0f) + ((f15 * f12) / 2.0f);
        float f17 = abs2 * abs2;
        float f18 = abs * abs * f14 * f14;
        if ((((f17 * abs) * abs) - ((f17 * f16) * f16)) - f18 < 0.0f) {
            float sqrt = (float) Math.sqrt(1.0f - (r19 / r17));
            abs2 *= sqrt;
            float f19 = abs * sqrt;
            f7 = f12 / 2.0f;
            f8 = f13 / 2.0f;
            f6 = 0.0f;
            f9 = f19;
        } else {
            f6 = 0.0f;
            float sqrt2 = (float) Math.sqrt(r19 / (r15 + f18));
            if (z == z2) {
                sqrt2 = -sqrt2;
            }
            float f20 = (((-sqrt2) * f16) * abs2) / abs;
            float f21 = ((sqrt2 * f14) * abs) / abs2;
            f7 = ((cos * f20) - (sin * f21)) + (f12 / 2.0f);
            f8 = (f13 / 2.0f) + (f21 * cos) + (f20 * sin);
            f9 = abs;
        }
        float f22 = cos / abs2;
        float f23 = sin / abs2;
        float f24 = f15 / f9;
        float f25 = cos / f9;
        float f26 = -f7;
        float f27 = -f8;
        float f28 = f9;
        float atan2 = (float) Math.atan2((f25 * f27) + (f24 * f26), (f23 * f27) + (f26 * f22));
        float f29 = f12 - f7;
        float f30 = f13 - f8;
        float atan22 = (float) Math.atan2((f25 * f30) + (f24 * f29), (f23 * f30) + (f22 * f29));
        float f31 = f7 + f10;
        float f32 = f8 + f11;
        float f33 = f12 + f10;
        float f34 = f13 + f11;
        setPenDown();
        mPivotX = f33;
        mPenX = f33;
        mPivotY = f34;
        mPenY = f34;
        if (abs2 != f28 || radians != f6) {
            arcToBezier(f31, f32, abs2, f28, atan2, atan22, z2, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(atan2);
        float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
        if (!z ? abs3 > 180.0f : abs3 < 180.0f) {
            abs3 = 360.0f - abs3;
        }
        if (!z2) {
            abs3 = -abs3;
        }
        float f35 = mScale;
        mPath.arcTo(new RectF((f31 - abs2) * f35, (f32 - abs2) * f35, (f31 + abs2) * f35, (f32 + abs2) * f35), degrees, abs3);
        elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f33, f34)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[LOOP:0: B:7:0x0065->B:8:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void arcToBezier(float r23, float r24, float r25, float r26, float r27, float r28, boolean r29, float r30) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.PathParser.arcToBezier(float, float, float, float, float, float, boolean, float):void");
    }

    private static void close() {
        if (mPenDown) {
            mPenX = mPenDownX;
            mPenY = mPenDownY;
            mPenDown = false;
            mPath.close();
            elements.add(new PathElement(ElementType.kCGPathElementCloseSubpath, new Point[]{new Point(mPenX, mPenY)}));
        }
    }

    private static void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        setPenDown();
        mPenX = f5;
        mPenY = f6;
        Path path = mPath;
        float f7 = mScale;
        path.cubicTo(f * f7, f2 * f7, f3 * f7, f4 * f7, f5 * f7, f7 * f6);
        elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f, f2), new Point(f3, f4), new Point(f5, f6)}));
    }

    private static void curve(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = mPenX;
        float f8 = mPenY;
        curveTo(f + f7, f2 + f8, f3 + f7, f4 + f8, f5 + f7, f6 + f8);
    }

    private static void curveTo(float f, float f2, float f3, float f4, float f5, float f6) {
        mPivotX = f3;
        mPivotY = f4;
        cubicTo(f, f2, f3, f4, f5, f6);
    }

    private static boolean is_absolute(char c) {
        return Character.isUpperCase(c);
    }

    private static boolean is_cmd(char c) {
        switch (c) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case ByteCodes.astore_2 /* 77 */:
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean is_number_start(char c) {
        return (c >= '0' && c <= '9') || c == '.' || c == '-' || c == '+';
    }

    private static void line(float f, float f2) {
        lineTo(f + mPenX, f2 + mPenY);
    }

    private static void lineTo(float f, float f2) {
        setPenDown();
        mPenX = f;
        mPivotX = f;
        mPenY = f2;
        mPivotY = f2;
        Path path = mPath;
        float f3 = mScale;
        path.lineTo(f * f3, f3 * f2);
        elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(f, f2)}));
    }

    private static void move(float f, float f2) {
        moveTo(f + mPenX, f2 + mPenY);
    }

    private static void moveTo(float f, float f2) {
        mPenX = f;
        mPivotX = f;
        mPenDownX = f;
        mPenY = f2;
        mPivotY = f2;
        mPenDownY = f2;
        Path path = mPath;
        float f3 = mScale;
        path.moveTo(f * f3, f3 * f2);
        elements.add(new PathElement(ElementType.kCGPathElementMoveToPoint, new Point[]{new Point(f, f2)}));
    }

    public static Path parse(String str) {
        elements = new ArrayList<>();
        Path path = new Path();
        mPath = path;
        if (str == null) {
            return path;
        }
        l = str.length();
        s = str;
        i = 0;
        mPenX = 0.0f;
        mPenY = 0.0f;
        mPivotX = 0.0f;
        mPivotY = 0.0f;
        mPenDownX = 0.0f;
        mPenDownY = 0.0f;
        mPenDown = false;
        char c = ' ';
        while (i < l) {
            skip_spaces();
            int i2 = i;
            if (i2 >= l) {
                return mPath;
            }
            boolean z = true;
            boolean z2 = c != ' ';
            char charAt = s.charAt(i2);
            if (!z2 && charAt != 'M' && charAt != 'm') {
                Buffer$$ExternalSyntheticBUOutline0.m("Unexpected character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt), Integer.valueOf(i), s});
                return null;
            }
            if (is_cmd(charAt)) {
                i++;
                z = false;
                c = charAt;
            } else {
                if (!is_number_start(charAt) || !z2) {
                    Buffer$$ExternalSyntheticBUOutline0.m("Unexpected character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt), Integer.valueOf(i), s});
                    return null;
                }
                if (c == 'Z' || c == 'z') {
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unexpected number after 'z' (s=", s, MarkdownConstants.RIGHT_PARENTHESIS));
                    return null;
                }
                if (c == 'M' || c == 'm') {
                    c = is_absolute(c) ? Matrix.MATRIX_TYPE_RANDOM_LT : 'l';
                } else {
                    z = false;
                }
            }
            boolean is_absolute = is_absolute(c);
            switch (c) {
                case 'A':
                    arcTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_flag(), parse_flag(), parse_list_number(), parse_list_number());
                    break;
                case 'C':
                    curveTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 'H':
                    lineTo(parse_list_number(), mPenY);
                    break;
                case 'L':
                    lineTo(parse_list_number(), parse_list_number());
                    break;
                case ByteCodes.astore_2 /* 77 */:
                    moveTo(parse_list_number(), parse_list_number());
                    break;
                case 'Q':
                    quadraticBezierCurveTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 'S':
                    smoothCurveTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 'T':
                    smoothQuadraticBezierCurveTo(parse_list_number(), parse_list_number());
                    break;
                case 'V':
                    lineTo(mPenX, parse_list_number());
                    break;
                case 'Z':
                case 'z':
                    close();
                    break;
                case 'a':
                    arc(parse_list_number(), parse_list_number(), parse_list_number(), parse_flag(), parse_flag(), parse_list_number(), parse_list_number());
                    break;
                case 'c':
                    curve(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 'h':
                    line(parse_list_number(), 0.0f);
                    break;
                case 'l':
                    line(parse_list_number(), parse_list_number());
                    break;
                case 'm':
                    move(parse_list_number(), parse_list_number());
                    break;
                case 'q':
                    quadraticBezierCurve(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 's':
                    smoothCurve(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 't':
                    smoothQuadraticBezierCurve(parse_list_number(), parse_list_number());
                    break;
                case 'v':
                    line(0.0f, parse_list_number());
                    break;
                default:
                    Buffer$$ExternalSyntheticBUOutline0.m("Unexpected comand '%c' (s=%s)", new Object[]{Character.valueOf(c), s});
                    return null;
            }
            if (z) {
                c = is_absolute ? 'M' : 'm';
            }
        }
        return mPath;
    }

    private static boolean parse_flag() {
        skip_spaces();
        char charAt = s.charAt(i);
        if (charAt != '0' && charAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(i), s));
        }
        int i2 = i + 1;
        i = i2;
        if (i2 < l && s.charAt(i2) == ',') {
            i++;
        }
        skip_spaces();
        return charAt == '1';
    }

    private static float parse_list_number() {
        if (i == l) {
            throw new Error(a$$ExternalSyntheticOutline0.m("Unexpected end (s=", s, MarkdownConstants.RIGHT_PARENTHESIS));
        }
        float parse_number = parse_number();
        skip_spaces();
        parse_list_separator();
        return parse_number;
    }

    private static void parse_list_separator() {
        int i2 = i;
        if (i2 >= l || s.charAt(i2) != ',') {
            return;
        }
        i++;
    }

    private static float parse_number() {
        char charAt;
        skip_spaces();
        int i2 = i;
        if (i2 == l) {
            throw new Error(a$$ExternalSyntheticOutline0.m("Unexpected end (s=", s, MarkdownConstants.RIGHT_PARENTHESIS));
        }
        char charAt2 = s.charAt(i2);
        if (charAt2 == '-' || charAt2 == '+') {
            int i3 = i + 1;
            i = i3;
            charAt2 = s.charAt(i3);
        }
        if (charAt2 >= '0' && charAt2 <= '9') {
            skip_digits();
            int i4 = i;
            if (i4 < l) {
                charAt2 = s.charAt(i4);
            }
        } else if (charAt2 != '.') {
            Buffer$$ExternalSyntheticBUOutline0.m("Invalid number formating character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt2), Integer.valueOf(i), s});
            return 0.0f;
        }
        if (charAt2 == '.') {
            i++;
            skip_digits();
            int i5 = i;
            if (i5 < l) {
                charAt2 = s.charAt(i5);
            }
        }
        if (charAt2 == 'e' || charAt2 == 'E') {
            int i6 = i;
            if (i6 + 1 < l && (charAt = s.charAt(i6 + 1)) != 'm' && charAt != 'x') {
                int i7 = i + 1;
                i = i7;
                char charAt3 = s.charAt(i7);
                if (charAt3 == '+' || charAt3 == '-') {
                    i++;
                    skip_digits();
                } else {
                    if (charAt3 < '0' || charAt3 > '9') {
                        Buffer$$ExternalSyntheticBUOutline0.m("Invalid number formating character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt3), Integer.valueOf(i), s});
                        return 0.0f;
                    }
                    skip_digits();
                }
            }
        }
        String substring = s.substring(i2, i);
        float parseFloat = Float.parseFloat(substring);
        if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
            return parseFloat;
        }
        Buffer$$ExternalSyntheticBUOutline0.m("Invalid number '%s' (start=%d, i=%d, s=%s)", new Object[]{substring, Integer.valueOf(i2), Integer.valueOf(i), s});
        return 0.0f;
    }

    private static void quadraticBezierCurve(float f, float f2, float f3, float f4) {
        float f5 = mPenX;
        float f6 = mPenY;
        quadraticBezierCurveTo(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }

    private static void quadraticBezierCurveTo(float f, float f2, float f3, float f4) {
        mPivotX = f;
        mPivotY = f2;
        float f5 = f * 2.0f;
        float f6 = f2 * 2.0f;
        cubicTo((mPenX + f5) / 3.0f, (mPenY + f6) / 3.0f, (f3 + f5) / 3.0f, (f4 + f6) / 3.0f, f3, f4);
    }

    private static double round(double d) {
        return Math.round(d * r0) / Math.pow(10.0d, 4.0d);
    }

    private static void setPenDown() {
        if (mPenDown) {
            return;
        }
        mPenDownX = mPenX;
        mPenDownY = mPenY;
        mPenDown = true;
    }

    private static void skip_digits() {
        while (true) {
            int i2 = i;
            if (i2 >= l || !Character.isDigit(s.charAt(i2))) {
                return;
            } else {
                i++;
            }
        }
    }

    private static void skip_spaces() {
        while (true) {
            int i2 = i;
            if (i2 >= l || !Character.isWhitespace(s.charAt(i2))) {
                return;
            } else {
                i++;
            }
        }
    }

    private static void smoothCurve(float f, float f2, float f3, float f4) {
        float f5 = mPenX;
        float f6 = mPenY;
        smoothCurveTo(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }

    private static void smoothCurveTo(float f, float f2, float f3, float f4) {
        float f5 = (mPenX * 2.0f) - mPivotX;
        float f6 = (mPenY * 2.0f) - mPivotY;
        mPivotX = f;
        mPivotY = f2;
        cubicTo(f5, f6, f, f2, f3, f4);
    }

    private static void smoothQuadraticBezierCurve(float f, float f2) {
        smoothQuadraticBezierCurveTo(f + mPenX, f2 + mPenY);
    }

    private static void smoothQuadraticBezierCurveTo(float f, float f2) {
        quadraticBezierCurveTo((mPenX * 2.0f) - mPivotX, (mPenY * 2.0f) - mPivotY, f, f2);
    }
}
