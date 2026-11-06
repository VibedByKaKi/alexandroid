package com.amazon.alexa.ra.core.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/ContextSource;", "", "<init>", "()V", "SCREEN_SHARE", "", "CAMERA_SHARE_FRONT", "CAMERA_SHARE_REAR", "camera", "isFrontCamera", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ContextSource {
    public static final int $stable = 0;

    @NotNull
    public static final String CAMERA_SHARE_FRONT = "CameraShareFront";

    @NotNull
    public static final String CAMERA_SHARE_REAR = "CameraShareRear";

    @NotNull
    public static final ContextSource INSTANCE = new ContextSource();

    @NotNull
    public static final String SCREEN_SHARE = "ScreenShare";

    private ContextSource() {
    }

    @NotNull
    public final String camera(boolean isFrontCamera) {
        return isFrontCamera ? CAMERA_SHARE_FRONT : CAMERA_SHARE_REAR;
    }
}
