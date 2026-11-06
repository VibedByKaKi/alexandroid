package com.amazon.alexa.accessory.repositories.firmware;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class FirmwareUpdateStatus {
    private static final FirmwareUpdateStatus IDLE = new FirmwareUpdateStatus(0, null, 0.0f, 0);
    private static final int STATE_COMPLETED = 2;
    private static final int STATE_FAILED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_TRANSFERRING = 1;
    public final Throwable cause;
    public final int deviceId;
    public final float progress;
    public final int state;

    public FirmwareUpdateStatus(int i, Throwable th, float f, int i2) {
        this.state = i;
        this.cause = th;
        this.progress = f;
        this.deviceId = i2;
    }

    public static FirmwareUpdateStatus completed(int i) {
        return new FirmwareUpdateStatus(2, null, 0.0f, i);
    }

    public static FirmwareUpdateStatus completedWithError(Throwable th, int i) {
        return new FirmwareUpdateStatus(3, th, 0.0f, i);
    }

    public static FirmwareUpdateStatus idle() {
        return IDLE;
    }

    public static FirmwareUpdateStatus transferring(float f, int i) {
        return new FirmwareUpdateStatus(1, null, f, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FirmwareUpdateStatus.class == obj.getClass()) {
            FirmwareUpdateStatus firmwareUpdateStatus = (FirmwareUpdateStatus) obj;
            if (this.state == firmwareUpdateStatus.state && Float.compare(firmwareUpdateStatus.progress, this.progress) == 0 && this.deviceId == firmwareUpdateStatus.deviceId) {
                if ((this.cause == null) == (firmwareUpdateStatus.cause == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public int getDeviceId() {
        return this.deviceId;
    }

    public float getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.state), Float.valueOf(this.progress), Integer.valueOf(this.deviceId));
    }

    public boolean isCompleted() {
        return this.state == 2;
    }

    public boolean isCompletedWithError() {
        return this.state == 3;
    }

    public boolean isIdle() {
        return this.state == 0;
    }

    public boolean isInProgress() {
        return this.state == 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FirmwareUpdateStatus{state=");
        sb.append(this.state);
        sb.append(", cause=");
        sb.append(this.cause);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", deviceId=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.deviceId, AbstractJsonLexerKt.END_OBJ);
    }
}
