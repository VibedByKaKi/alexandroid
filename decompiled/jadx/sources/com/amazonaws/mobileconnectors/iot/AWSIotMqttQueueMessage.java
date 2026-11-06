package com.amazonaws.mobileconnectors.iot;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class AWSIotMqttQueueMessage {
    private byte[] message;
    private AWSIotMqttQos qos;
    private String topic;
    private PublishMessageUserData userData;

    public AWSIotMqttQueueMessage(String str, byte[] bArr, AWSIotMqttQos aWSIotMqttQos, PublishMessageUserData publishMessageUserData) {
        this.topic = str;
        this.message = bArr;
        this.qos = aWSIotMqttQos;
        this.userData = publishMessageUserData;
    }

    public byte[] getMessage() {
        return this.message;
    }

    public AWSIotMqttQos getQos() {
        return this.qos;
    }

    public String getTopic() {
        return this.topic;
    }

    public PublishMessageUserData getUserData() {
        return this.userData;
    }
}
