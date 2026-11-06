package com.amazon.alexa.device;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/device/DefaultScreenInformation;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isPhoneFormFactor", "", "getScreenSize", "", "calculateScreenSize", "getDisplayMetrics", "Landroid/util/DisplayMetrics;", "Companion", "AlexaMobileAndroidDevice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultScreenInformation {
    private static final String TAG = "DefaultScreenInformation";

    @NotNull
    private final Context context;

    public DefaultScreenInformation(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    private final double calculateScreenSize() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        double d = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        if (Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE) {
            return 0.0d;
        }
        return Math.sqrt(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d));
    }

    @NotNull
    public final DisplayMetrics getDisplayMetrics() {
        Object systemService = this.context.getSystemService("window");
        systemService.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public final double getScreenSize() {
        return calculateScreenSize();
    }

    public final boolean isPhoneFormFactor() {
        return this.context.getResources().getConfiguration().smallestScreenWidthDp < 600;
    }
}
