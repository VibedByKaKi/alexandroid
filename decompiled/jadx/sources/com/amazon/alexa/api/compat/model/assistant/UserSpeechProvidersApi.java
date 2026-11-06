package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class UserSpeechProvidersApi {
    public abstract void deregister(String str);

    public abstract void register(Bundle bundle);

    public abstract void requestDialog(Bundle bundle);

    public abstract void reservationAgreed(String str, long j);

    public abstract void reservationDisputed(String str, long j);

    public abstract void reserveResponse(Bundle bundle);

    public abstract void reservedResponseStarted(String str, long j);

    public abstract void turnAbandoned(String str);

    public abstract void turnStarted(Bundle bundle);
}
