package com.amazon.alexa.client.alexaservice.base.system;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class SendSystemLocalesReportEvent extends Event.NotGated {
    private final List<Locale> locales;

    private SendSystemLocalesReportEvent(List<Locale> list) {
        this.locales = ErrorUtils$$ExternalSyntheticOutline0.m(list);
    }

    public static SendSystemLocalesReportEvent create(List<Locale> list) {
        return new SendSystemLocalesReportEvent(list);
    }

    public List<Locale> getLocales() {
        return this.locales;
    }
}
