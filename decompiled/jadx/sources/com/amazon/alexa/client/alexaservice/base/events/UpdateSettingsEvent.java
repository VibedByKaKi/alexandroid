package com.amazon.alexa.client.alexaservice.base.events;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.base.system.payload.Setting;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class UpdateSettingsEvent extends Event.NotGated {
    private final List<Setting> settings;

    private UpdateSettingsEvent(List<Setting> list) {
        this.settings = list == null ? Collections.EMPTY_LIST : ErrorUtils$$ExternalSyntheticOutline0.m(list);
    }

    public static UpdateSettingsEvent create(List<Setting> list) {
        return new UpdateSettingsEvent(list);
    }

    public List<Setting> getSettings() {
        return this.settings;
    }
}
