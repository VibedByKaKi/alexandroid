package com.amazon.alexa.app.notification.messaging.adm;

import com.amazon.alexa.app.notification.util.Constants;
import com.amazon.device.messaging.ADMMessageReceiver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class AmazonMessageReceiver extends ADMMessageReceiver {
    public AmazonMessageReceiver() {
        registerJobServiceClass(PhoenixMessageHandler.class, Constants.AMAZON_MESSAGE_RECEIVER_JOB_ID);
    }
}
