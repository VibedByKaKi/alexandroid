package com.amazon.alexa.client.alexaservice.base.system;

import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AlexaLocale {
    public static AlexaLocale create(List<Locale> list, boolean z) {
        return new AutoValue_AlexaLocale(list, z);
    }

    public abstract List<Locale> getLocales();

    public abstract boolean isDeviceDefault();
}
