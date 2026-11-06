package com.amazon.alexa.client.alexaservice.dialog.core;

import android.os.SystemClock;
import com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ShallowResponseCoordinationCallbacks implements AlexaDialogTurnResponseReservationCallbacks {
    private static final String TAG = "ShallowResponseCoordinationCallbacks";
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final AlexaClientEventBus eventBus;
    private final String invocationType;
    private ReservationTimestamps reservationTimestamps;

    public ShallowResponseCoordinationCallbacks(AlexaClientEventBus alexaClientEventBus, String str, DialogRequestIdentifier dialogRequestIdentifier) {
        this.eventBus = alexaClientEventBus;
        this.invocationType = str;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
    }

    private void onResponse(long j, boolean z) {
        this.reservationTimestamps.setExternalResponseTimestamp(j);
        this.eventBus.post(ResponseCoordinationMetricEvent.ShallowInternalReservationEvent.create(this.invocationType, this.dialogRequestIdentifier, z, this.reservationTimestamps.getInternalDecisionTimestamp(), this.reservationTimestamps.getExternalResponseTimestamp(), this.reservationTimestamps.getExternalResponseReceivedTimestamp()));
    }

    @Override // com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks
    public void onAgreed(long j) {
        Objects.toString(this.dialogRequestIdentifier);
        SystemClock.elapsedRealtime();
        onResponse(j, true);
    }

    @Override // com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks
    public void onDisputed(long j) {
        Objects.toString(this.dialogRequestIdentifier);
        SystemClock.elapsedRealtime();
        onResponse(j, false);
    }

    public void onInitialized(ReservationTimestamps reservationTimestamps) {
        this.reservationTimestamps = reservationTimestamps;
        Objects.toString(this.dialogRequestIdentifier);
        SystemClock.elapsedRealtime();
    }

    public void onReserveResponseSent() {
        Objects.toString(this.dialogRequestIdentifier);
        SystemClock.elapsedRealtime();
    }

    public void onResponseAlreadyReserved() {
        Objects.toString(this.dialogRequestIdentifier);
        SystemClock.elapsedRealtime();
        this.eventBus.post(ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent.create(this.invocationType, this.dialogRequestIdentifier, this.reservationTimestamps.getExternalDecisionTimestamp(), this.reservationTimestamps.getExternalDecisionReceivedTimestamp(), this.reservationTimestamps.getInternalDecisionTimestamp(), this.reservationTimestamps.getReservationTimestamp()));
    }

    public void onIgnored() {
    }
}
