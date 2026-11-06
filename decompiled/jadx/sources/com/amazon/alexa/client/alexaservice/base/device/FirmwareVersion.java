package com.amazon.alexa.client.alexaservice.base.device;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class FirmwareVersion implements StronglyTypedString {
    public static final FirmwareVersion UNKNOWN = create("UNKNOWN");

    public static FirmwareVersion create(String str) {
        return new AutoValue_FirmwareVersion(str);
    }

    public static TypeAdapter<FirmwareVersion> typeAdapter(Gson gson) {
        return new StronglyTypedString.StronglyTypedStringAdapter<FirmwareVersion>() { // from class: com.amazon.alexa.client.alexaservice.base.device.FirmwareVersion.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public FirmwareVersion instantiate(@NonNull String str) {
                return FirmwareVersion.create(str);
            }
        };
    }
}
