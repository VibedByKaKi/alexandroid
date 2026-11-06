package com.amazon.alexa.accessory.frames.media.transform;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class FaceCropEligibilityResult {
    final String detail;
    final boolean eligible;
    final Reason reason;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Reason {
        NO_FACES,
        TOO_MANY_FACES,
        FACES_ALREADY_PROMINENT,
        ELIGIBLE
    }

    public FaceCropEligibilityResult(boolean z, Reason reason, String str) {
        this.eligible = z;
        this.reason = reason;
        this.detail = str;
    }
}
