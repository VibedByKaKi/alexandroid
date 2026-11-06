package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.VisibleForTesting;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.utils.TimeProvider;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class ReservationTimestamps {
    public static final long DEFAULT_TIMESTAMP_VALUE = -1;
    private static final String TAG = "ReservationTimestamps";
    private long externalDecisionReceivedTimestamp;
    private long externalDecisionTimestamp;
    private long externalResponseReceivedTimestamp;
    private long externalResponseTimestamp;
    private long internalDecisionTimestamp;
    private long internalResponseTimestamp;
    private long reservationTimestamp;
    private final TimeProvider timeProvider;

    public ReservationTimestamps() {
        this(new TimeProvider());
    }

    private boolean checkIfValueExists(String str, long j) {
        if (j != 0 && j != -1) {
            return true;
        }
        AppLaunchChecker$$ExternalSyntheticOutline0.m("Could not get ", str, " safely, -1 was returned instead.", TAG);
        return false;
    }

    private long getValueSafely(String str, long j) {
        if (checkIfValueExists(str, j)) {
            return j;
        }
        return -1L;
    }

    public long getExternalDecisionReceivedTimestamp() {
        return getValueSafely("externalDecisionReceivedTimestamp", this.externalDecisionReceivedTimestamp);
    }

    public long getExternalDecisionTimestamp() {
        return getValueSafely("externalDecisionTimestamp", this.externalDecisionTimestamp);
    }

    public long getExternalResponseReceivedTimestamp() {
        return getValueSafely("externalResponseReceivedTimestamp", this.externalResponseReceivedTimestamp);
    }

    public long getExternalResponseTimestamp() {
        return getValueSafely("externalResponseTimestamp", this.externalResponseTimestamp);
    }

    public long getInternalDecisionTimestamp() {
        return getValueSafely("internalDecisionTimestamp", this.internalDecisionTimestamp);
    }

    public long getInternalResponseTimestamp() {
        return getValueSafely("internalResponseTimestamp", this.internalResponseTimestamp);
    }

    public long getReservationTimestamp() {
        return getValueSafely("reservationTimestamp", this.reservationTimestamp);
    }

    public void setExternalDecisionTimestamp(long j) {
        this.externalDecisionReceivedTimestamp = this.timeProvider.currentTimeMillis();
        this.externalDecisionTimestamp = j;
    }

    public void setExternalResponseTimestamp(long j) {
        this.externalResponseReceivedTimestamp = this.timeProvider.currentTimeMillis();
        this.externalResponseTimestamp = j;
    }

    public void setInternalDecisionTimestamp(long j) {
        this.internalDecisionTimestamp = j;
    }

    public void setInternalResponseTimestamp() {
        this.internalResponseTimestamp = this.timeProvider.currentTimeMillis();
    }

    public void setReservationTimestamp() {
        this.reservationTimestamp = this.timeProvider.currentTimeMillis();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReservationTimestamps{timeProvider=");
        sb.append(this.timeProvider);
        sb.append(", reservationTimestamp=");
        sb.append(this.reservationTimestamp);
        sb.append(", externalDecisionTimestamp=");
        sb.append(this.externalDecisionTimestamp);
        sb.append(", externalDecisionReceivedTimestamp=");
        sb.append(this.externalDecisionReceivedTimestamp);
        sb.append(", internalDecisionTimestamp=");
        sb.append(this.internalDecisionTimestamp);
        sb.append(", externalResponseTimestamp=");
        sb.append(this.externalResponseTimestamp);
        sb.append(", externalResponseReceivedTimestamp=");
        sb.append(this.externalResponseReceivedTimestamp);
        sb.append(", internalResponseTimestamp=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.internalResponseTimestamp, AbstractJsonLexerKt.END_OBJ);
    }

    @VisibleForTesting
    public ReservationTimestamps(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }
}
