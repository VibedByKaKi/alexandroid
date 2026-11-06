package com.amazon.alexa.accessorykit.findmy.setting;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonSerialize(as = SettingRequest.class)
/* loaded from: classes16.dex */
public abstract class SettingRequest {
    private static final String ACCOUNT_ID_KEY = "accountId";
    private static final String DEVICE_TYPE_KEY = "deviceType";

    @JsonCreator
    public static SettingRequest create(String str, String str2) {
        return new AutoValue_SettingRequest(str, str2);
    }

    @JsonProperty(ACCOUNT_ID_KEY)
    public abstract String getAccountId();

    @JsonProperty("deviceType")
    public abstract String getDeviceType();
}
