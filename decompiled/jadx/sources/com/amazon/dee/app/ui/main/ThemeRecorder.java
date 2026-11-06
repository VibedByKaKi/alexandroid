package com.amazon.dee.app.ui.main;

import android.content.Context;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.amazon.dee.app.ui.util.UiUtils;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ThemeRecorder {
    private static final String TAG = "ThemeRecorder";
    private Context context;
    private Lazy<IdentityService> identityService;
    private Lazy<Mobilytics> mobilyticsService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.dee.app.ui.main.ThemeRecorder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$dee$app$ui$main$ThemeRecorder$ColorScheme;

        static {
            int[] iArr = new int[ColorScheme.values().length];
            $SwitchMap$com$amazon$dee$app$ui$main$ThemeRecorder$ColorScheme = iArr;
            try {
                iArr[ColorScheme.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$dee$app$ui$main$ThemeRecorder$ColorScheme[ColorScheme.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ColorScheme {
        LIGHT,
        DARK,
        UNKNOWN
    }

    public ThemeRecorder(Context context, Lazy<Mobilytics> lazy, Lazy<IdentityService> lazy2) {
        this.context = context;
        this.mobilyticsService = lazy;
        this.identityService = lazy2;
    }

    private void recordTheme(ColorScheme colorScheme) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$dee$app$ui$main$ThemeRecorder$ColorScheme[colorScheme.ordinal()];
        this.mobilyticsService.get().recordOperationalEvent(this.mobilyticsService.get().createOperationalEvent(i != 1 ? i != 2 ? AlexaMetricsConstants.MetricEvents.APP_THEME_JASPER_UNKNOWN : AlexaMetricsConstants.MetricEvents.APP_THEME_JASPER_DARK : AlexaMetricsConstants.MetricEvents.APP_THEME_JASPER_LIGHT, "counter", "Application", TAG, OwnerIdentifier.ALEXA_MOBILE_PLATFORM_MOSAIC));
    }

    public ColorScheme getColorScheme() {
        return UiUtils.isLightMode(this.context) ? ColorScheme.LIGHT : ColorScheme.DARK;
    }

    public void recordThemeOnSchemeChange(ColorScheme colorScheme) {
        if (this.identityService.get().getUser(TAG) == null) {
            return;
        }
        ColorScheme colorScheme2 = getColorScheme();
        if (colorScheme.equals(colorScheme2)) {
            return;
        }
        recordTheme(colorScheme2);
    }

    public void recordTheme() {
        if (this.identityService.get().getUser(TAG) == null) {
            return;
        }
        recordTheme(getColorScheme());
    }
}
