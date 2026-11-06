package com.amazon.alexa.voice.ui.onedesign.tta;

import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_TextPillResultItem extends TextPillResultItem {
    private final boolean fromSimba;
    private final String id;
    private final String itemRoute;
    private final String itemText;
    private final int type;

    public AutoValue_TextPillResultItem(boolean z, String str, @Nullable String str2, int i, String str3) {
        this.fromSimba = z;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemText");
            throw null;
        }
        this.itemText = str;
        this.itemRoute = str2;
        this.type = i;
        if (str3 != null) {
            this.id = str3;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null id");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TextPillResultItem) {
            TextPillResultItem textPillResultItem = (TextPillResultItem) obj;
            if (this.fromSimba == textPillResultItem.isFromSimba() && this.itemText.equals(textPillResultItem.getItemText()) && ((str = this.itemRoute) != null ? str.equals(textPillResultItem.getItemRoute()) : textPillResultItem.getItemRoute() == null) && this.type == textPillResultItem.getType() && this.id.equals(textPillResultItem.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.TextPillResultItem, com.amazon.alexa.voice.ui.tta.search.ResultItem
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.TextPillResultItem, com.amazon.alexa.voice.ui.tta.search.PillResultItem
    @Nullable
    public String getItemRoute() {
        return this.itemRoute;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.TextPillResultItem, com.amazon.alexa.voice.ui.tta.search.PillResultItem
    public String getItemText() {
        return this.itemText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.TextPillResultItem, com.amazon.alexa.voice.ui.tta.search.ResultItem
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.fromSimba ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.itemText.hashCode()) * 1000003;
        String str = this.itemRoute;
        return this.id.hashCode() ^ ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.type) * 1000003);
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.PillResultItem
    public boolean isFromSimba() {
        return this.fromSimba;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextPillResultItem{fromSimba=");
        sb.append(this.fromSimba);
        sb.append(", itemText=");
        sb.append(this.itemText);
        sb.append(", itemRoute=");
        sb.append(this.itemRoute);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", id=");
        return a$$ExternalSyntheticOutline0.m(sb, this.id, StringSubstitutor.DEFAULT_VAR_END);
    }
}
