package com.amazon.photos.uploader.blockers;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/photos/uploader/blockers/LowBatteryBlocker;", "Lcom/amazon/photos/uploader/blockers/Blocker;", "()V", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LowBatteryBlocker extends Blocker {

    @NotNull
    public static final LowBatteryBlocker INSTANCE = new LowBatteryBlocker();

    private LowBatteryBlocker() {
        super("LOW_BATTERY", null);
    }
}
