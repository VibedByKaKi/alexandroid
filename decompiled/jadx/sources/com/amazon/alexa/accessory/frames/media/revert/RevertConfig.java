package com.amazon.alexa.accessory.frames.media.revert;

import com.amazon.alexa.accessory.frames.media.transform.lce.LceConfigDefaults;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/revert/RevertConfig;", "", "<init>", "()V", "TTL_MS", "", "getTTL_MS", "()J", "CAP_BYTES", "SWEEP_INTERVAL_MS", "getSWEEP_INTERVAL_MS", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RevertConfig {
    public static final long CAP_BYTES = 1073741824;

    @NotNull
    public static final RevertConfig INSTANCE = new RevertConfig();
    private static final long TTL_MS = LceConfigDefaults.GPU_DISABLE_TTL_MS;
    private static final long SWEEP_INTERVAL_MS = 86400000;

    private RevertConfig() {
    }

    public final long getSWEEP_INTERVAL_MS() {
        return SWEEP_INTERVAL_MS;
    }

    public final long getTTL_MS() {
        return TTL_MS;
    }
}
