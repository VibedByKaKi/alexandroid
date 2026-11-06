package com.amazon.alexa.ra.core.ui.custom;

import android.content.Context;
import android.os.Vibrator;
import android.provider.Settings;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/HapticFeedbackHandler;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "vibrator", "Landroid/os/Vibrator;", "triggerHapticFeedback", "", "effect", "Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect;", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class HapticFeedbackHandler {

    @NotNull
    private static final String TAG = "HapticFeedbackHandler";
    private final Context appContext;

    @NotNull
    private final Vibrator vibrator;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public HapticFeedbackHandler(@NotNull Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        Object systemService = applicationContext.getSystemService("vibrator");
        systemService.getClass();
        this.vibrator = (Vibrator) systemService;
    }

    public final void triggerHapticFeedback(@NotNull HapticEffect effect) {
        effect.getClass();
        if (Settings.System.getInt(this.appContext.getContentResolver(), "haptic_feedback_enabled", 0) == 0 || !this.vibrator.hasVibrator()) {
            return;
        }
        try {
            this.vibrator.vibrate(effect.getVibrationEffect());
        } catch (SecurityException e) {
            Log.w(TAG, "Haptic feedback skipped: VIBRATE permission unavailable", e);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/HapticFeedbackHandler$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
