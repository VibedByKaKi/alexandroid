package org.eclipse.paho.client.mqttv3.internal.wire;

import org.eclipse.paho.client.mqttv3.MqttMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MqttReceivedMessage extends MqttMessage {
    public int getMessageId() {
        return super.getId();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttMessage
    public void setDuplicate(boolean z) {
        super.setDuplicate(z);
    }

    public void setMessageId(int i) {
        super.setId(i);
    }
}
