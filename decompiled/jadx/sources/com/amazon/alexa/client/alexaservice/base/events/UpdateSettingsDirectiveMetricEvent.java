package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class UpdateSettingsDirectiveMetricEvent extends Event.NotGated {
    private final String settingKey;
    private final String settingValue;

    private UpdateSettingsDirectiveMetricEvent(String str, String str2) {
        this.settingKey = str;
        this.settingValue = str2;
    }

    public static UpdateSettingsDirectiveMetricEvent create(String str, String str2) {
        return new UpdateSettingsDirectiveMetricEvent(str, str2);
    }

    public String getSettingKey() {
        return this.settingKey;
    }

    public String getSettingValue() {
        return this.settingValue;
    }
}
