package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.graphics.PathParser;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import defpackage.a$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class MotionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    private static float getLegacyControlPoint(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("Motion easing control point value must be between 0 and 1; instead got: ", parseFloat));
        return 0.0f;
    }

    private static String getLegacyEasingContent(String str, String str2) {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(1, str2.length() + 1, str);
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String str) {
        if (!isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER)) {
            if (isLegacyEasingType(str, "path")) {
                return new PathInterpolator(PathParser.createPathFromPathData(getLegacyEasingContent(str, "path")));
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid motion easing type: ", str));
            return null;
        }
        String[] split = getLegacyEasingContent(str, EASING_TYPE_CUBIC_BEZIER).split(",");
        if (split.length == 4) {
            return new PathInterpolator(getLegacyControlPoint(split, 0), getLegacyControlPoint(split, 1), getLegacyControlPoint(split, 2), getLegacyControlPoint(split, 3));
        }
        CrlID$$ExternalSyntheticBUOutline0.m(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    }

    private static boolean isLegacyEasingAttribute(String str) {
        return isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER) || isLegacyEasingType(str, "path");
    }

    private static boolean isLegacyEasingType(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static int resolveThemeDuration(@NonNull Context context, @AttrRes int i, int i2) {
        return MaterialAttributes.resolveInteger(context, i, i2);
    }

    @NonNull
    public static TimeInterpolator resolveThemeInterpolator(@NonNull Context context, @AttrRes int i, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            return isLegacyEasingAttribute(valueOf) ? getLegacyThemeInterpolator(valueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    @NonNull
    public static SpringForce resolveThemeSpringForce(@NonNull Context context, @AttrRes int i, @StyleRes int i2) {
        TypedValue resolve = MaterialAttributes.resolve(context, i);
        TypedArray obtainStyledAttributes = resolve == null ? context.obtainStyledAttributes(null, R.styleable.MaterialSpring, 0, i2) : context.obtainStyledAttributes(resolve.resourceId, R.styleable.MaterialSpring);
        SpringForce springForce = new SpringForce();
        try {
            float f = obtainStyledAttributes.getFloat(R.styleable.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = obtainStyledAttributes.getFloat(R.styleable.MaterialSpring_damping, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            springForce.setStiffness(f);
            springForce.setDampingRatio(f2);
            return springForce;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
