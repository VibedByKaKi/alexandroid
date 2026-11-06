package com.amazon.alexa.voice.ui.onedesign.tta.items;

import com.amazon.alexa.voice.ui.onedesign.tta.items.UserInputTtaItem;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_UserInputTtaItem extends UserInputTtaItem {
    private final CharSequence itemText;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends UserInputTtaItem.Builder {
        private CharSequence itemText;

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.UserInputTtaItem.Builder
        public UserInputTtaItem build() {
            CharSequence charSequence = this.itemText;
            if (charSequence != null) {
                return new AutoValue_UserInputTtaItem(charSequence, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: itemText");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.UserInputTtaItem.Builder
        public UserInputTtaItem.Builder itemText(CharSequence charSequence) {
            if (charSequence != null) {
                this.itemText = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemText");
            return null;
        }
    }

    private AutoValue_UserInputTtaItem(CharSequence charSequence) {
        this.itemText = charSequence;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserInputTtaItem) {
            return this.itemText.equals(((UserInputTtaItem) obj).getItemText());
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.UserInputTtaItem
    public CharSequence getItemText() {
        return this.itemText;
    }

    public int hashCode() {
        return this.itemText.hashCode() ^ 1000003;
    }

    public String toString() {
        return "UserInputTtaItem{itemText=" + ((Object) this.itemText) + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_UserInputTtaItem(CharSequence charSequence, int i) {
        this(charSequence);
    }
}
