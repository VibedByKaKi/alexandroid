package com.amazonaws.mobileconnectors.iot;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class AWSIotMqttTopic {
    private AWSIotMqttNewMessageCallback callback;
    private AWSIotMqttQos qos;
    private String topic;

    public AWSIotMqttTopic(String str, AWSIotMqttQos aWSIotMqttQos, AWSIotMqttNewMessageCallback aWSIotMqttNewMessageCallback) {
        this.topic = str;
        this.qos = aWSIotMqttQos;
        this.callback = aWSIotMqttNewMessageCallback;
    }

    public AWSIotMqttNewMessageCallback getCallback() {
        return this.callback;
    }

    public AWSIotMqttQos getQos() {
        return this.qos;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setCallback(AWSIotMqttNewMessageCallback aWSIotMqttNewMessageCallback) {
        this.callback = aWSIotMqttNewMessageCallback;
    }

    public void setQos(AWSIotMqttQos aWSIotMqttQos) {
        this.qos = aWSIotMqttQos;
    }

    public void setTopic(String str) {
        this.topic = str;
    }
}
