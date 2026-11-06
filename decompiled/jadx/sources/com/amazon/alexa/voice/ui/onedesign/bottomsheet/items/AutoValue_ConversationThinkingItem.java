package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationThinkingItem;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ConversationThinkingItem extends ConversationThinkingItem {
    private final boolean remarkableAlexaStyleEnabled;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ConversationThinkingItem.Builder {
        private Boolean remarkableAlexaStyleEnabled;

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationThinkingItem.Builder
        public ConversationThinkingItem build() {
            Boolean bool = this.remarkableAlexaStyleEnabled;
            if (bool != null) {
                return new AutoValue_ConversationThinkingItem(bool.booleanValue(), 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: remarkableAlexaStyleEnabled");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationThinkingItem.Builder
        public ConversationThinkingItem.Builder remarkableAlexaStyleEnabled(boolean z) {
            this.remarkableAlexaStyleEnabled = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_ConversationThinkingItem(boolean z) {
        this.remarkableAlexaStyleEnabled = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ConversationThinkingItem) && this.remarkableAlexaStyleEnabled == ((ConversationThinkingItem) obj).isRemarkableAlexaStyleEnabled();
    }

    public int hashCode() {
        return (this.remarkableAlexaStyleEnabled ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationThinkingItem
    public boolean isRemarkableAlexaStyleEnabled() {
        return this.remarkableAlexaStyleEnabled;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("ConversationThinkingItem{remarkableAlexaStyleEnabled="), this.remarkableAlexaStyleEnabled, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_ConversationThinkingItem(boolean z, int i) {
        this(z);
    }
}
