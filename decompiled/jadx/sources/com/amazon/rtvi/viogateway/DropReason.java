package com.amazon.rtvi.viogateway;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/rtvi/viogateway/DropReason;", "", "<init>", "()V", "QUEUE_FULL", "", "STALE_FRAME", "FRAME_CAP", "RTVIAndroidAlexaAvsSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DropReason {

    @NotNull
    public static final String FRAME_CAP = "dropped_frame_cap";

    @NotNull
    public static final DropReason INSTANCE = new DropReason();

    @NotNull
    public static final String QUEUE_FULL = "dropped_queue_full";

    @NotNull
    public static final String STALE_FRAME = "dropped_stale_frame";

    private DropReason() {
    }
}
