package com.amazon.alexa.voice.ui.onedesign.tta.items;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_CardTtaItem extends CardTtaItem {
    private final String cardType;
    private final String itemDescription;
    private final String itemId;
    private final CharSequence itemText;
    private final String linkUrl;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends CardTtaItem.Builder {
        private String cardType;
        private String itemDescription;
        private String itemId;
        private CharSequence itemText;
        private String linkUrl;

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem.Builder
        public CardTtaItem build() {
            String str;
            String str2;
            String str3;
            String str4;
            CharSequence charSequence = this.itemText;
            if (charSequence != null && (str = this.itemDescription) != null && (str2 = this.itemId) != null && (str3 = this.linkUrl) != null && (str4 = this.cardType) != null) {
                return new AutoValue_CardTtaItem(charSequence, str, str2, str3, str4, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.itemText == null) {
                sb.append(" itemText");
            }
            if (this.itemDescription == null) {
                sb.append(" itemDescription");
            }
            if (this.itemId == null) {
                sb.append(" itemId");
            }
            if (this.linkUrl == null) {
                sb.append(" linkUrl");
            }
            if (this.cardType == null) {
                sb.append(" cardType");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem.Builder
        public CardTtaItem.Builder cardType(String str) {
            if (str != null) {
                this.cardType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null cardType");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem.Builder
        public CardTtaItem.Builder itemDescription(String str) {
            if (str != null) {
                this.itemDescription = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemDescription");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem.Builder
        public CardTtaItem.Builder itemId(String str) {
            if (str != null) {
                this.itemId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem.Builder
        public CardTtaItem.Builder itemText(CharSequence charSequence) {
            if (charSequence != null) {
                this.itemText = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemText");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem.Builder
        public CardTtaItem.Builder linkUrl(String str) {
            if (str != null) {
                this.linkUrl = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null linkUrl");
            return null;
        }
    }

    private AutoValue_CardTtaItem(CharSequence charSequence, String str, String str2, String str3, String str4) {
        this.itemText = charSequence;
        this.itemDescription = str;
        this.itemId = str2;
        this.linkUrl = str3;
        this.cardType = str4;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem
    public String getCardType() {
        return this.cardType;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem
    public String getItemDescription() {
        return this.itemDescription;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem
    public String getItemId() {
        return this.itemId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem
    public CharSequence getItemText() {
        return this.itemText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.CardTtaItem
    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardTtaItem{itemText=");
        sb.append((Object) this.itemText);
        sb.append(", itemDescription=");
        sb.append(this.itemDescription);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", linkUrl=");
        sb.append(this.linkUrl);
        sb.append(", cardType=");
        return a$$ExternalSyntheticOutline0.m(sb, this.cardType, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_CardTtaItem(CharSequence charSequence, String str, String str2, String str3, String str4, int i) {
        this(charSequence, str, str2, str3, str4);
    }
}
