package com.amazon.alexa.client.alexaservice.base.system;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class SettingsUpdateSentEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SettingsUpdateType {
        TIME_ZONE,
        LOCALE,
        SUPPORTS_MOBILE_DOWNCHANNEL
    }

    public static SettingsUpdateSentEvent create(SettingsUpdateType settingsUpdateType, boolean z, @Nullable Integer num) {
        return new AutoValue_SettingsUpdateSentEvent(settingsUpdateType, z, num);
    }

    public static SettingsUpdateSentEvent createFailure(SettingsUpdateType settingsUpdateType, @Nullable Integer num) {
        return new AutoValue_SettingsUpdateSentEvent(settingsUpdateType, false, num);
    }

    public static SettingsUpdateSentEvent createSuccess(SettingsUpdateType settingsUpdateType) {
        return new AutoValue_SettingsUpdateSentEvent(settingsUpdateType, true, null);
    }

    @Nullable
    public abstract Integer getResponseCode();

    public abstract SettingsUpdateType getSettingsUpdateType();

    public abstract boolean isSuccessful();

    public static SettingsUpdateSentEvent createFailure(SettingsUpdateType settingsUpdateType) {
        return createFailure(settingsUpdateType, null);
    }
}
