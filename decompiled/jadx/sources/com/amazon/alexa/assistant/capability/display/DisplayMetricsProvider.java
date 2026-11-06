package com.amazon.alexa.assistant.capability.display;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.dee.app.contacts.common.constants.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.apache.commons.net.ftp.FTPReply;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/display/DisplayMetricsProvider;", "", "<init>", "()V", Constants.LOG_TAG, "", "getDeviceSize", "Landroid/graphics/Point;", "context", "Landroid/content/Context;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "getDeviceSizeInInches", "Lcom/amazon/alexa/assistant/capability/display/DisplaySizeInInches;", "convertToApprovedDpi", "", "deviceDensity", "", "BASE_DEVICE_DPI", "APPROVED_DPIS", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DisplayMetricsProvider {
    private static final int BASE_DEVICE_DPI = 160;

    @NotNull
    private static final String TAG = "DisplayMetricsProvider";

    @NotNull
    public static final DisplayMetricsProvider INSTANCE = new DisplayMetricsProvider();

    @NotNull
    private static final List<Integer> APPROVED_DPIS = CollectionsKt.listOf((Object[]) new Integer[]{120, 160, Integer.valueOf(FTPReply.FILE_STATUS), 240, 320, 480, 640});

    private DisplayMetricsProvider() {
    }

    public final int convertToApprovedDpi(float deviceDensity) {
        int i = (int) (160 * deviceDensity);
        List<Integer> list = APPROVED_DPIS;
        int i2 = 0;
        int abs = Math.abs(list.get(0).intValue() - i);
        int size = list.size();
        for (int i3 = 1; i3 < size; i3++) {
            int abs2 = Math.abs(APPROVED_DPIS.get(i3).intValue() - i);
            if (abs > abs2) {
                i2 = i3;
                abs = abs2;
            }
        }
        return APPROVED_DPIS.get(i2).intValue();
    }

    @NotNull
    public final Point getDeviceSize(@NotNull Context context, @NotNull Logger logger) {
        context.getClass();
        logger.getClass();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT < 30) {
            Logger.DefaultImpls.debug$default(logger, TAG, "Using legacy Display API for API 29 and below", null, 4, null);
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return point;
        }
        Logger.DefaultImpls.debug$default(logger, TAG, "Using currentWindowMetrics for API 30+", null, 4, null);
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        currentWindowMetrics.getClass();
        Rect bounds = currentWindowMetrics.getBounds();
        bounds.getClass();
        return new Point(bounds.width(), bounds.height());
    }

    @NotNull
    public final DisplaySizeInInches getDeviceSizeInInches() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = displayMetrics.heightPixels;
        return new DisplaySizeInInches(displayMetrics.widthPixels / displayMetrics.ydpi, i / displayMetrics.xdpi);
    }
}
