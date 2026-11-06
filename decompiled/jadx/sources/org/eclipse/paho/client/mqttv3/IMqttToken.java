package org.eclipse.paho.client.mqttv3;

import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface IMqttToken {
    IMqttActionListener getActionCallback();

    IMqttAsyncClient getClient();

    MqttException getException();

    int[] getGrantedQos();

    int getMessageId();

    MqttWireMessage getResponse();

    boolean getSessionPresent();

    String[] getTopics();

    Object getUserContext();

    boolean isComplete();

    void setActionCallback(IMqttActionListener iMqttActionListener);

    void setUserContext(Object obj);

    void waitForCompletion() throws MqttException;

    void waitForCompletion(long j) throws MqttException;
}
