package com.bugsnag.android.performance.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/performance/internal/LoadDeviceId;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "resourceAttributes", "Lcom/bugsnag/android/performance/internal/Attributes;", "(Landroid/content/Context;Lcom/bugsnag/android/performance/internal/Attributes;)V", "run", "", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadDeviceId implements Runnable {

    @NotNull
    private final Context context;

    @NotNull
    private final Attributes resourceAttributes;

    public LoadDeviceId(@NotNull Context context, @NotNull Attributes attributes) {
        context.getClass();
        attributes.getClass();
        this.context = context;
        this.resourceAttributes = attributes;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.resourceAttributes.set("device.id", DeviceIdFilePersistence.INSTANCE.forContext(this.context).loadDeviceId(true));
    }
}
