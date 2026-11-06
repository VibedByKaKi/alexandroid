package com.amazon.alexa.ra.ui;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/ui/WindowModeUtils;", "", "<init>", "()V", Constants.LOG_TAG, "", "EDGE_TOLERANCE_PX", "", "isInSplitScreen", "", "activity", "Landroid/app/Activity;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class WindowModeUtils {
    public static final int $stable = 0;
    private static final int EDGE_TOLERANCE_PX = 12;

    @NotNull
    public static final WindowModeUtils INSTANCE = new WindowModeUtils();

    @NotNull
    private static final String TAG = "WindowModeUtils";

    private WindowModeUtils() {
    }

    @JvmStatic
    public static final boolean isInSplitScreen(@NotNull Activity activity) {
        WindowManager windowManager;
        activity.getClass();
        if (!activity.isInMultiWindowMode() || activity.isInPictureInPictureMode() || Build.VERSION.SDK_INT < 30 || (windowManager = (WindowManager) activity.getSystemService(WindowManager.class)) == null) {
            return false;
        }
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        Rect bounds2 = windowManager.getMaximumWindowMetrics().getBounds();
        bounds2.getClass();
        boolean z = (Math.abs(bounds.width() - bounds2.width()) <= 12) != (Math.abs(bounds.height() - bounds2.height()) <= 12);
        bounds.toString();
        bounds2.toString();
        return z;
    }
}
