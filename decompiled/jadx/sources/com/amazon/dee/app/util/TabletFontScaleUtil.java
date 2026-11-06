package com.amazon.dee.app.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0007J\u001c\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\b\u0010\u0016\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/amazon/dee/app/util/TabletFontScaleUtil;", "", "<init>", "()V", "MAX_FONT_SCALE_FOR_TABLET", "", "LARGE_SCREEN_MIN_WIDTH_DP", "", "isLargeScreenDevice", "", "Ljava/lang/Boolean;", "initDeviceType", "", "context", "Landroid/content/Context;", "cappedContext", "baseContext", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "resources", "Landroid/content/res/Resources;", "isTablet", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TabletFontScaleUtil {

    @NotNull
    public static final TabletFontScaleUtil INSTANCE = new TabletFontScaleUtil();
    private static final int LARGE_SCREEN_MIN_WIDTH_DP = 600;
    private static final float MAX_FONT_SCALE_FOR_TABLET = 1.3125f;

    @Nullable
    private static volatile Boolean isLargeScreenDevice;

    private TabletFontScaleUtil() {
    }

    @JvmStatic
    @NotNull
    public static final Context cappedContext(@NotNull Context baseContext) {
        baseContext.getClass();
        initDeviceType(baseContext);
        if (!INSTANCE.isTablet()) {
            return baseContext;
        }
        Configuration configuration = baseContext.getResources().getConfiguration();
        if (configuration.fontScale <= MAX_FONT_SCALE_FOR_TABLET) {
            return baseContext;
        }
        Configuration configuration2 = new Configuration(configuration);
        configuration2.fontScale = MAX_FONT_SCALE_FOR_TABLET;
        Context createConfigurationContext = baseContext.createConfigurationContext(configuration2);
        createConfigurationContext.getClass();
        return createConfigurationContext;
    }

    @JvmStatic
    public static final void initDeviceType(@NotNull Context context) {
        context.getClass();
        if (isLargeScreenDevice != null) {
            return;
        }
        isLargeScreenDevice = Boolean.valueOf(context.getResources().getConfiguration().smallestScreenWidthDp >= 600);
    }

    private final boolean isTablet() {
        return Intrinsics.areEqual(isLargeScreenDevice, Boolean.TRUE);
    }

    @JvmStatic
    public static final void onConfigurationChanged(@Nullable Configuration newConfig, @Nullable Resources resources) {
        if (newConfig == null || resources == null || !INSTANCE.isTablet()) {
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = newConfig.fontScale;
        if (f <= MAX_FONT_SCALE_FOR_TABLET) {
            displayMetrics.scaledDensity = displayMetrics.density * f;
        } else {
            newConfig.fontScale = MAX_FONT_SCALE_FOR_TABLET;
            displayMetrics.scaledDensity = displayMetrics.density * MAX_FONT_SCALE_FOR_TABLET;
        }
    }
}
