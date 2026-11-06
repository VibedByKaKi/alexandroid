package com.amazon.comms.calling.service;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MediaParams {
    private final LastFrameClearOption localLastFrameClearOption;
    private final LastFrameClearOption remoteLastFrameClearOption;
    private final float surfaceViewBorderRadius;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum LastFrameClearOption {
        NONE,
        RENDER_BLACK,
        REINITIALIZE_SURFACE
    }

    public MediaParams(LastFrameClearOption lastFrameClearOption, LastFrameClearOption lastFrameClearOption2, float f) {
        this.localLastFrameClearOption = lastFrameClearOption;
        this.remoteLastFrameClearOption = lastFrameClearOption2;
        this.surfaceViewBorderRadius = f;
    }

    public LastFrameClearOption getLocalLastFrameClearOption() {
        return this.localLastFrameClearOption;
    }

    public LastFrameClearOption getRemoteLastFrameClearOption() {
        return this.remoteLastFrameClearOption;
    }

    public float getSurfaceViewBorderRadius() {
        return this.surfaceViewBorderRadius;
    }
}
