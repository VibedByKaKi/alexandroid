package com.amazon.alexa.protocols.messaging;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MessagingReceiver {
    public static final String NOTIFICATION = "NOTIFICATION";
    public static final String NOTIFICATION_TITLE = "NOTIFICATION_TITLE";

    void onReceive(@NonNull Message message);
}
