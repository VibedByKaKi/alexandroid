package com.amazonaws.mobileconnectors.iot;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AWSIotMqttLastWillAndTestament {
    private String message;
    private AWSIotMqttQos qos;
    private String topic;

    public AWSIotMqttLastWillAndTestament(String str, String str2, AWSIotMqttQos aWSIotMqttQos) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("LWT topic cannot be null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("LWT message cannot be null");
            throw null;
        }
        if (aWSIotMqttQos == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("LWT QoS cannot be null");
            throw null;
        }
        this.topic = str;
        this.message = str2;
        this.qos = aWSIotMqttQos;
    }

    public String getMessage() {
        return this.message;
    }

    public AWSIotMqttQos getQos() {
        return this.qos;
    }

    public String getTopic() {
        return this.topic;
    }
}
