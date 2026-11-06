package com.amazon.alexa.client.alexaservice.dialog.text;

import com.amazon.alexa.client.alexaservice.dialog.text.TextOfflineMessageEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_TextOfflineMessageEvent extends TextOfflineMessageEvent {
    private final TextOfflineMessageEvent.TextOfflineType textOfflineType;

    public AutoValue_TextOfflineMessageEvent(TextOfflineMessageEvent.TextOfflineType textOfflineType) {
        if (textOfflineType != null) {
            this.textOfflineType = textOfflineType;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null textOfflineType");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TextOfflineMessageEvent) {
            return this.textOfflineType.equals(((TextOfflineMessageEvent) obj).getTextOfflineType());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.TextOfflineMessageEvent
    public TextOfflineMessageEvent.TextOfflineType getTextOfflineType() {
        return this.textOfflineType;
    }

    public int hashCode() {
        return this.textOfflineType.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TextOfflineMessageEvent{textOfflineType=" + this.textOfflineType + StringSubstitutor.DEFAULT_VAR_END;
    }
}
