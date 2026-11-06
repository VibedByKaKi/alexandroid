package com.amazon.alexa.voice.ui.onedesign.tta.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_PillResultTtaItem extends PillResultTtaItem {
    private final boolean fromSimba;
    private final String itemId;
    private final String itemRoute;
    private final CharSequence itemText;
    private final int itemType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends PillResultTtaItem.Builder {
        private Boolean fromSimba;
        private String itemId;
        private String itemRoute;
        private CharSequence itemText;
        private Integer itemType;

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem.Builder
        public PillResultTtaItem build() {
            String str;
            Integer num;
            CharSequence charSequence = this.itemText;
            if (charSequence != null && (str = this.itemId) != null && (num = this.itemType) != null && this.fromSimba != null) {
                return new AutoValue_PillResultTtaItem(charSequence, str, num.intValue(), this.itemRoute, this.fromSimba.booleanValue(), 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.itemText == null) {
                sb.append(" itemText");
            }
            if (this.itemId == null) {
                sb.append(" itemId");
            }
            if (this.itemType == null) {
                sb.append(" itemType");
            }
            if (this.fromSimba == null) {
                sb.append(" fromSimba");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem.Builder
        public PillResultTtaItem.Builder fromSimba(boolean z) {
            this.fromSimba = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem.Builder
        public PillResultTtaItem.Builder itemId(String str) {
            if (str != null) {
                this.itemId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem.Builder
        public PillResultTtaItem.Builder itemRoute(String str) {
            this.itemRoute = str;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem.Builder
        public PillResultTtaItem.Builder itemText(CharSequence charSequence) {
            if (charSequence != null) {
                this.itemText = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemText");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem.Builder
        public PillResultTtaItem.Builder itemType(int i) {
            this.itemType = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_PillResultTtaItem(CharSequence charSequence, String str, int i, @Nullable String str2, boolean z) {
        this.itemText = charSequence;
        this.itemId = str;
        this.itemType = i;
        this.itemRoute = str2;
        this.fromSimba = z;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem
    public String getItemId() {
        return this.itemId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem
    @Nullable
    public String getItemRoute() {
        return this.itemRoute;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem
    public CharSequence getItemText() {
        return this.itemText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem
    public int getItemType() {
        return this.itemType;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.items.PillResultTtaItem
    public boolean isFromSimba() {
        return this.fromSimba;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PillResultTtaItem{itemText=");
        sb.append((Object) this.itemText);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", itemRoute=");
        sb.append(this.itemRoute);
        sb.append(", fromSimba=");
        return a$$ExternalSyntheticOutline0.m(sb, this.fromSimba, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_PillResultTtaItem(CharSequence charSequence, String str, int i, String str2, boolean z, int i2) {
        this(charSequence, str, i, str2, z);
    }
}
