package com.amazon.alexa.ra.core.data.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/DeviceCapabilities;", "", "<init>", "()V", "value", "", "hasTelephony", "getHasTelephony", "()Z", "init", "", "context", "Landroid/content/Context;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DeviceCapabilities {
    private static volatile boolean hasTelephony;

    @NotNull
    public static final DeviceCapabilities INSTANCE = new DeviceCapabilities();
    public static final int $stable = 8;

    private DeviceCapabilities() {
    }

    public final boolean getHasTelephony() {
        return hasTelephony;
    }

    public final void init(@NotNull Context context) {
        context.getClass();
        hasTelephony = context.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
