package com.amazonaws.mobileconnectors.iot;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class PublishMessageUserData {
    private AWSIotMqttMessageDeliveryCallback userCallback;
    private Object userData;

    public PublishMessageUserData(AWSIotMqttMessageDeliveryCallback aWSIotMqttMessageDeliveryCallback, Object obj) {
        this.userCallback = aWSIotMqttMessageDeliveryCallback;
        this.userData = obj;
    }

    public AWSIotMqttMessageDeliveryCallback getUserCallback() {
        return this.userCallback;
    }

    public Object getUserData() {
        return this.userData;
    }
}
