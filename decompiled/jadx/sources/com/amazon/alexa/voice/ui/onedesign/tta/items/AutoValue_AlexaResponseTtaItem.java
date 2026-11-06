package com.amazon.alexa.voice.ui.onedesign.tta.items;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.tta.items.AlexaResponseTtaItem;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_AlexaResponseTtaItem extends AlexaResponseTtaItem {
    private final String itemId;
    private final CharSequence itemText;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AlexaResponseTtaItem.Builder {
        private String itemId;
        private CharSequence itemText;

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.AlexaResponseTtaItem.Builder
        public AlexaResponseTtaItem build() {
            String str;
            CharSequence charSequence = this.itemText;
            if (charSequence != null && (str = this.itemId) != null) {
                return new AutoValue_AlexaResponseTtaItem(charSequence, str, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.itemText == null) {
                sb.append(" itemText");
            }
            if (this.itemId == null) {
                sb.append(" itemId");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.AlexaResponseTtaItem.Builder
        public AlexaResponseTtaItem.Builder itemId(String str) {
            if (str != null) {
                this.itemId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.AlexaResponseTtaItem.Builder
        public AlexaResponseTtaItem.Builder itemText(CharSequence charSequence) {
            if (charSequence != null) {
                this.itemText = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemText");
            return null;
        }
    }

    private AutoValue_AlexaResponseTtaItem(CharSequence charSequence, String str) {
        this.itemText = charSequence;
        this.itemId = str;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.AlexaResponseTtaItem
    public String getItemId() {
        return this.itemId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.AlexaResponseTtaItem
    public CharSequence getItemText() {
        return this.itemText;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlexaResponseTtaItem{itemText=");
        sb.append((Object) this.itemText);
        sb.append(", itemId=");
        return a$$ExternalSyntheticOutline0.m(sb, this.itemId, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_AlexaResponseTtaItem(CharSequence charSequence, String str, int i) {
        this(charSequence, str);
    }
}
