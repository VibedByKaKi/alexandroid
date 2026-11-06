package com.facebook.react.uimanager;

import android.annotation.TargetApi;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J2\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eJ\u001a\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010#\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010%\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010'\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010)\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001c\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00132\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b.¨\u0006/"}, d2 = {"Lcom/facebook/react/uimanager/FilterHelper;", "", "<init>", "()V", "parseFilters", "Landroid/graphics/RenderEffect;", "filters", "Lcom/facebook/react/bridge/ReadableArray;", "parseColorMatrixFilters", "Landroid/graphics/ColorMatrixColorFilter;", "isOnlyColorMatrixFilters", "", "createBlurEffect", "sigma", "", "chainedEffects", "createBrightnessEffect", "amount", "createBrightnessColorMatrix", "Landroid/graphics/ColorMatrix;", "createOpacityEffect", "createDropShadowEffect", "offsetX", "offsetY", "blurRadius", "color", "", "parseAndCreateDropShadowEffect", "filterValues", "Lcom/facebook/react/bridge/ReadableMap;", "createOpacityColorMatrix", "createContrastEffect", "createContrastColorMatrix", "createGrayscaleEffect", "createGrayscaleColorMatrix", "createSepiaEffect", "createSepiaColorMatrix", "createSaturateEffect", "createSaturateColorMatrix", "createHueRotateEffect", "createHueRotateColorMatrix", "createInvertEffect", "createInvertColorMatrix", "createColorMatrixEffect", "colorMatrix", "sigmaToRadius", "sigmaToRadius$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@TargetApi(31)
/* loaded from: classes6.dex */
public final class FilterHelper {

    @NotNull
    public static final FilterHelper INSTANCE = new FilterHelper();

    private FilterHelper() {
    }

    public static /* synthetic */ RenderEffect createBlurEffect$default(FilterHelper filterHelper, float f, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createBlurEffect(f, renderEffect);
    }

    private final ColorMatrix createBrightnessColorMatrix(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(amount, amount, amount, 1.0f);
        return colorMatrix;
    }

    public static /* synthetic */ RenderEffect createBrightnessEffect$default(FilterHelper filterHelper, float f, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createBrightnessEffect(f, renderEffect);
    }

    private final RenderEffect createColorMatrixEffect(ColorMatrix colorMatrix, RenderEffect chainedEffects) {
        if (chainedEffects == null) {
            RenderEffect createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            createColorFilterEffect.getClass();
            return createColorFilterEffect;
        }
        RenderEffect createColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), chainedEffects);
        createColorFilterEffect2.getClass();
        return createColorFilterEffect2;
    }

    public static /* synthetic */ RenderEffect createColorMatrixEffect$default(FilterHelper filterHelper, ColorMatrix colorMatrix, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createColorMatrixEffect(colorMatrix, renderEffect);
    }

    private final ColorMatrix createContrastColorMatrix(float amount) {
        float f = ((-(amount / 2.0f)) + 0.5f) * 255;
        return new ColorMatrix(new float[]{amount, 0.0f, 0.0f, 0.0f, f, 0.0f, amount, 0.0f, 0.0f, f, 0.0f, 0.0f, amount, 0.0f, f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createContrastEffect$default(FilterHelper filterHelper, float f, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createContrastEffect(f, renderEffect);
    }

    public static /* synthetic */ RenderEffect createDropShadowEffect$default(FilterHelper filterHelper, float f, float f2, float f3, int i, RenderEffect renderEffect, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            renderEffect = null;
        }
        return filterHelper.createDropShadowEffect(f, f2, f3, i, renderEffect);
    }

    private final ColorMatrix createGrayscaleColorMatrix(float amount) {
        float f = 1 - amount;
        float f2 = 0.7152f - (f * 0.7152f);
        float f3 = 0.0722f - (f * 0.0722f);
        float f4 = 0.2126f - (f * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f) + 0.2126f, f2, f3, 0.0f, 0.0f, f4, (0.2848f * f) + 0.7152f, f3, 0.0f, 0.0f, f4, f2, (f * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createGrayscaleEffect$default(FilterHelper filterHelper, float f, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createGrayscaleEffect(f, renderEffect);
    }

    private final ColorMatrix createHueRotateColorMatrix(float amount) {
        double radians = Math.toRadians(amount);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        float f = 0.715f - (cos * 0.715f);
        float f2 = sin * 0.715f;
        float f3 = 0.072f - (cos * 0.072f);
        float f4 = 0.213f - (cos * 0.213f);
        return new ColorMatrix(new float[]{((cos * 0.787f) + 0.213f) - (sin * 0.213f), f - f2, (sin * 0.928f) + f3, 0.0f, 0.0f, (0.143f * sin) + f4, (0.14f * sin) + (0.285f * cos) + 0.715f, f3 - (0.283f * sin), 0.0f, 0.0f, f4 - (0.787f * sin), f + f2, (sin * 0.072f) + (cos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createHueRotateEffect$default(FilterHelper filterHelper, float f, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createHueRotateEffect(f, renderEffect);
    }

    private final ColorMatrix createInvertColorMatrix(float amount) {
        float f = 1 - (2 * amount);
        float f2 = amount * 255;
        return new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, f2, 0.0f, f, 0.0f, 0.0f, f2, 0.0f, 0.0f, f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createInvertEffect$default(FilterHelper filterHelper, float f, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createInvertEffect(f, renderEffect);
    }

    public static /* synthetic */ RenderEffect createOpacityEffect$default(FilterHelper filterHelper, float f, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createOpacityEffect(f, renderEffect);
    }

    private final ColorMatrix createSaturateColorMatrix(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(amount);
        return colorMatrix;
    }

    public static /* synthetic */ RenderEffect createSaturateEffect$default(FilterHelper filterHelper, float f, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createSaturateEffect(f, renderEffect);
    }

    private final ColorMatrix createSepiaColorMatrix(float amount) {
        float f = 1 - amount;
        return new ColorMatrix(new float[]{(0.607f * f) + 0.393f, 0.769f - (f * 0.769f), 0.189f - (f * 0.189f), 0.0f, 0.0f, 0.349f - (f * 0.349f), (0.314f * f) + 0.686f, 0.168f - (f * 0.168f), 0.0f, 0.0f, 0.272f - (f * 0.272f), 0.534f - (f * 0.534f), (f * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createSepiaEffect$default(FilterHelper filterHelper, float f, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createSepiaEffect(f, renderEffect);
    }

    @JvmStatic
    public static final boolean isOnlyColorMatrixFilters(@Nullable ReadableArray filters) {
        if (filters == null || filters.size() == 0) {
            return false;
        }
        int size = filters.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = filters.getMap(i);
            map.getClass();
            String key = map.getEntryIterator().next().getKey();
            if (Intrinsics.areEqual(key, "blur") || Intrinsics.areEqual(key, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ RenderEffect parseAndCreateDropShadowEffect$default(FilterHelper filterHelper, ReadableMap readableMap, RenderEffect renderEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.parseAndCreateDropShadowEffect(readableMap, renderEffect);
    }

    @JvmStatic
    @Nullable
    public static final ColorMatrixColorFilter parseColorMatrixFilters(@Nullable ReadableArray filters) {
        ColorMatrix createSaturateColorMatrix;
        if (filters == null) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        int size = filters.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = filters.getMap(i);
            if (map == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("Required value was null.");
                return null;
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            Object value = next.getValue();
            value.getClass();
            float doubleValue = (float) ((Double) value).doubleValue();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid color matrix filter: ".concat(key));
                        break;
                    } else {
                        createSaturateColorMatrix = INSTANCE.createSaturateColorMatrix(doubleValue);
                        colorMatrix.preConcat(createSaturateColorMatrix);
                    }
                case -1267206133:
                    if (!key.equals("opacity")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid color matrix filter: ".concat(key));
                        break;
                    } else {
                        createSaturateColorMatrix = INSTANCE.createOpacityColorMatrix(doubleValue);
                        colorMatrix.preConcat(createSaturateColorMatrix);
                    }
                case -1183703082:
                    if (!key.equals("invert")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid color matrix filter: ".concat(key));
                        break;
                    } else {
                        createSaturateColorMatrix = INSTANCE.createInvertColorMatrix(doubleValue);
                        colorMatrix.preConcat(createSaturateColorMatrix);
                    }
                case -905411385:
                    if (!key.equals("grayscale")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid color matrix filter: ".concat(key));
                        break;
                    } else {
                        createSaturateColorMatrix = INSTANCE.createGrayscaleColorMatrix(doubleValue);
                        colorMatrix.preConcat(createSaturateColorMatrix);
                    }
                case -566947070:
                    if (!key.equals("contrast")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid color matrix filter: ".concat(key));
                        break;
                    } else {
                        createSaturateColorMatrix = INSTANCE.createContrastColorMatrix(doubleValue);
                        colorMatrix.preConcat(createSaturateColorMatrix);
                    }
                case 109324790:
                    if (!key.equals("sepia")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid color matrix filter: ".concat(key));
                        break;
                    } else {
                        createSaturateColorMatrix = INSTANCE.createSepiaColorMatrix(doubleValue);
                        colorMatrix.preConcat(createSaturateColorMatrix);
                    }
                case 648162385:
                    if (!key.equals("brightness")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid color matrix filter: ".concat(key));
                        break;
                    } else {
                        createSaturateColorMatrix = INSTANCE.createBrightnessColorMatrix(doubleValue);
                        colorMatrix.preConcat(createSaturateColorMatrix);
                    }
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid color matrix filter: ".concat(key));
                        break;
                    } else {
                        createSaturateColorMatrix = INSTANCE.createHueRotateColorMatrix(doubleValue);
                        colorMatrix.preConcat(createSaturateColorMatrix);
                    }
                default:
                    Single$$ExternalSyntheticBUOutline0.m$3("Invalid color matrix filter: ".concat(key));
                    break;
            }
            return null;
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    @JvmStatic
    @Nullable
    public static final RenderEffect parseFilters(@Nullable ReadableArray filters) {
        RenderEffect renderEffect = null;
        if (filters == null) {
            return null;
        }
        int size = filters.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = filters.getMap(i);
            if (map == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("Required value was null.");
                return null;
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper = INSTANCE;
                        Object value = next.getValue();
                        value.getClass();
                        renderEffect = filterHelper.createSaturateEffect((float) ((Double) value).doubleValue(), renderEffect);
                    }
                case -1267206133:
                    if (!key.equals("opacity")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper2 = INSTANCE;
                        Object value2 = next.getValue();
                        value2.getClass();
                        renderEffect = filterHelper2.createOpacityEffect((float) ((Double) value2).doubleValue(), renderEffect);
                    }
                case -1183703082:
                    if (!key.equals("invert")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper3 = INSTANCE;
                        Object value3 = next.getValue();
                        value3.getClass();
                        renderEffect = filterHelper3.createInvertEffect((float) ((Double) value3).doubleValue(), renderEffect);
                    }
                case -905411385:
                    if (!key.equals("grayscale")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper4 = INSTANCE;
                        Object value4 = next.getValue();
                        value4.getClass();
                        renderEffect = filterHelper4.createGrayscaleEffect((float) ((Double) value4).doubleValue(), renderEffect);
                    }
                case -566947070:
                    if (!key.equals("contrast")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper5 = INSTANCE;
                        Object value5 = next.getValue();
                        value5.getClass();
                        renderEffect = filterHelper5.createContrastEffect((float) ((Double) value5).doubleValue(), renderEffect);
                    }
                case 3027047:
                    if (!key.equals("blur")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper6 = INSTANCE;
                        Object value6 = next.getValue();
                        value6.getClass();
                        renderEffect = filterHelper6.createBlurEffect((float) ((Double) value6).doubleValue(), renderEffect);
                    }
                case 109324790:
                    if (!key.equals("sepia")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper7 = INSTANCE;
                        Object value7 = next.getValue();
                        value7.getClass();
                        renderEffect = filterHelper7.createSepiaEffect((float) ((Double) value7).doubleValue(), renderEffect);
                    }
                case 648162385:
                    if (!key.equals("brightness")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper8 = INSTANCE;
                        Object value8 = next.getValue();
                        value8.getClass();
                        renderEffect = filterHelper8.createBrightnessEffect((float) ((Double) value8).doubleValue(), renderEffect);
                    }
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper9 = INSTANCE;
                        Object value9 = next.getValue();
                        value9.getClass();
                        renderEffect = filterHelper9.createHueRotateEffect((float) ((Double) value9).doubleValue(), renderEffect);
                    }
                case 906978543:
                    if (!key.equals("dropShadow")) {
                        Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                        break;
                    } else {
                        FilterHelper filterHelper10 = INSTANCE;
                        Object value10 = next.getValue();
                        value10.getClass();
                        renderEffect = filterHelper10.parseAndCreateDropShadowEffect((ReadableMap) value10, renderEffect);
                    }
                default:
                    Single$$ExternalSyntheticBUOutline0.m$3("Invalid filter name: ".concat(key));
                    break;
            }
            return null;
        }
        return renderEffect;
    }

    @Nullable
    public final RenderEffect createBlurEffect(float sigma, @Nullable RenderEffect chainedEffects) {
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        if (sigma <= 0.5d) {
            return null;
        }
        float sigmaToRadius$ReactAndroid_release = sigmaToRadius$ReactAndroid_release(sigma);
        if (chainedEffects == null) {
            tileMode2 = Shader.TileMode.DECAL;
            return RenderEffect.createBlurEffect(sigmaToRadius$ReactAndroid_release, sigmaToRadius$ReactAndroid_release, tileMode2);
        }
        tileMode = Shader.TileMode.DECAL;
        return RenderEffect.createBlurEffect(sigmaToRadius$ReactAndroid_release, sigmaToRadius$ReactAndroid_release, chainedEffects, tileMode);
    }

    @NotNull
    public final RenderEffect createBrightnessEffect(float amount, @Nullable RenderEffect chainedEffects) {
        return createColorMatrixEffect(createBrightnessColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createContrastEffect(float amount, @Nullable RenderEffect chainedEffects) {
        return createColorMatrixEffect(createContrastColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createDropShadowEffect(float offsetX, float offsetY, float blurRadius, int color, @Nullable RenderEffect chainedEffects) {
        RenderEffect createOffsetEffect;
        RenderEffect createOffsetEffect2;
        Shader.TileMode tileMode;
        if (chainedEffects == null) {
            createOffsetEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            createOffsetEffect.getClass();
            createOffsetEffect2 = RenderEffect.createOffsetEffect(offsetX, offsetY);
            createOffsetEffect2.getClass();
        } else {
            createOffsetEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f, chainedEffects);
            createOffsetEffect.getClass();
            createOffsetEffect2 = RenderEffect.createOffsetEffect(offsetX, offsetY, chainedEffects);
            createOffsetEffect2.getClass();
        }
        RenderEffect createColorFilterEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(color, BlendMode.SRC_IN), createOffsetEffect2);
        createColorFilterEffect.getClass();
        tileMode = Shader.TileMode.DECAL;
        RenderEffect createBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, createColorFilterEffect, tileMode);
        createBlurEffect.getClass();
        RenderEffect createBlendModeEffect = RenderEffect.createBlendModeEffect(createBlurEffect, createOffsetEffect, BlendMode.SRC_OVER);
        createBlendModeEffect.getClass();
        return createBlendModeEffect;
    }

    @NotNull
    public final RenderEffect createGrayscaleEffect(float amount, @Nullable RenderEffect chainedEffects) {
        return createColorMatrixEffect(createGrayscaleColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createHueRotateEffect(float amount, @Nullable RenderEffect chainedEffects) {
        return createColorMatrixEffect(createHueRotateColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createInvertEffect(float amount, @Nullable RenderEffect chainedEffects) {
        return createColorMatrixEffect(createInvertColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final ColorMatrix createOpacityColorMatrix(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, amount);
        return colorMatrix;
    }

    @NotNull
    public final RenderEffect createOpacityEffect(float amount, @Nullable RenderEffect chainedEffects) {
        return createColorMatrixEffect(createOpacityColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createSaturateEffect(float amount, @Nullable RenderEffect chainedEffects) {
        return createColorMatrixEffect(createSaturateColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect createSepiaEffect(float amount, @Nullable RenderEffect chainedEffects) {
        return createColorMatrixEffect(createSepiaColorMatrix(amount), chainedEffects);
    }

    @NotNull
    public final RenderEffect parseAndCreateDropShadowEffect(@NotNull ReadableMap filterValues, @Nullable RenderEffect chainedEffects) {
        filterValues.getClass();
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        return createDropShadowEffect(pixelUtil.dpToPx(filterValues.getDouble("offsetX")), pixelUtil.dpToPx(filterValues.getDouble("offsetY")), filterValues.hasKey("standardDeviation") ? sigmaToRadius$ReactAndroid_release((float) filterValues.getDouble("standardDeviation")) : 0.0f, filterValues.hasKey("color") ? filterValues.getInt("color") : ViewCompat.MEASURED_STATE_MASK, chainedEffects);
    }

    public final float sigmaToRadius$ReactAndroid_release(float sigma) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(sigma);
        if (pixelFromDIP > 0.5f) {
            return (pixelFromDIP - 0.5f) / 0.57735f;
        }
        return 0.0f;
    }
}
