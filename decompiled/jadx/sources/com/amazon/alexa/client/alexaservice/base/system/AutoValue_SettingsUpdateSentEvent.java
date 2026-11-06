package com.amazon.alexa.client.alexaservice.base.system;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.base.system.SettingsUpdateSentEvent;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_SettingsUpdateSentEvent extends SettingsUpdateSentEvent {
    private final Integer responseCode;
    private final SettingsUpdateSentEvent.SettingsUpdateType settingsUpdateType;
    private final boolean successful;

    public AutoValue_SettingsUpdateSentEvent(SettingsUpdateSentEvent.SettingsUpdateType settingsUpdateType, boolean z, @Nullable Integer num) {
        if (settingsUpdateType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null settingsUpdateType");
            throw null;
        }
        this.settingsUpdateType = settingsUpdateType;
        this.successful = z;
        this.responseCode = num;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SettingsUpdateSentEvent) {
            SettingsUpdateSentEvent settingsUpdateSentEvent = (SettingsUpdateSentEvent) obj;
            if (this.settingsUpdateType.equals(settingsUpdateSentEvent.getSettingsUpdateType()) && this.successful == settingsUpdateSentEvent.isSuccessful() && ((num = this.responseCode) != null ? num.equals(settingsUpdateSentEvent.getResponseCode()) : settingsUpdateSentEvent.getResponseCode() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.SettingsUpdateSentEvent
    @Nullable
    public Integer getResponseCode() {
        return this.responseCode;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.SettingsUpdateSentEvent
    public SettingsUpdateSentEvent.SettingsUpdateType getSettingsUpdateType() {
        return this.settingsUpdateType;
    }

    public int hashCode() {
        int hashCode = (((this.settingsUpdateType.hashCode() ^ 1000003) * 1000003) ^ (this.successful ? 1231 : 1237)) * 1000003;
        Integer num = this.responseCode;
        return (num == null ? 0 : num.hashCode()) ^ hashCode;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.SettingsUpdateSentEvent
    public boolean isSuccessful() {
        return this.successful;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SettingsUpdateSentEvent{settingsUpdateType=");
        sb.append(this.settingsUpdateType);
        sb.append(", successful=");
        sb.append(this.successful);
        sb.append(", responseCode=");
        return Automotive$$ExternalSyntheticOutline0.m(sb, this.responseCode, StringSubstitutor.DEFAULT_VAR_END);
    }
}
