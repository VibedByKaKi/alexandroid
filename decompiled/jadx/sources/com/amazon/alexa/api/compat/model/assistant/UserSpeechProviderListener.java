package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class UserSpeechProviderListener {
    public abstract void onDialogFinished(Bundle bundle);

    public abstract void onDialogRequestDenied(Bundle bundle);

    public abstract void onDialogRequested(Bundle bundle);

    public abstract void onDialogStarted(Bundle bundle);

    public abstract void onDialogTurnFinished(Bundle bundle);

    public abstract void onDialogTurnRequested(Bundle bundle);

    public abstract void onDialogTurnReserveResponse(Bundle bundle);

    public abstract void onDialogTurnResponsePending(Bundle bundle);

    public abstract void onDialogTurnStarted(Bundle bundle);

    public abstract void onPlaybackStarted(String str);

    public abstract void onPlaybackStopped(String str);

    public abstract void onReservationAgreed(String str, long j);

    public abstract void onReservationDisputed(String str, long j);

    public abstract void pauseWakeWordDetection(String str, String str2);

    public abstract void resumeWakeWordDetection(String str, String str2);

    public abstract void setWakeWordDetectionEnabled(String str, boolean z);
}
