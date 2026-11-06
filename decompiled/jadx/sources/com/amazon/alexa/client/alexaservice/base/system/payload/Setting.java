package com.amazon.alexa.client.alexaservice.base.system.payload;

import com.amazon.alexa.client.alexaservice.base.system.payload.AutoValue_Setting;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class Setting {
    public static Setting create(String str, String str2) {
        return new AutoValue_Setting(str, str2);
    }

    public static TypeAdapter<Setting> typeAdapter(Gson gson) {
        return new AutoValue_Setting.GsonTypeAdapter(gson);
    }

    public abstract String getKey();

    public abstract String getValue();
}
