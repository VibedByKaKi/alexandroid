package com.amazon.alexa.voice.ui.onedesign.list;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ListItem implements ListItemModel {
    private final CharSequence name;
    private final Object tag;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        CharSequence name;
        Object tag;

        public ListItem build() {
            if (this.tag == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("tag == null");
                return null;
            }
            if (this.name != null) {
                return new ListItem(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("name == null");
            return null;
        }

        public Builder name(@NonNull CharSequence charSequence) {
            this.name = charSequence;
            return this;
        }

        public Builder tag(@NonNull Object obj) {
            this.tag = obj;
            return this;
        }
    }

    public ListItem(Builder builder) {
        this.tag = builder.tag;
        this.name = builder.name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ListItem.class != obj.getClass()) {
            return false;
        }
        ListItem listItem = (ListItem) obj;
        return this.tag.equals(listItem.tag) && this.name.equals(listItem.name);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.list.ListItemModel
    public CharSequence getName() {
        return this.name;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.list.ListItemModel
    public Object getTag() {
        return this.tag;
    }

    public int hashCode() {
        return this.name.hashCode() + ((this.tag.hashCode() + JfifUtil.MARKER_EOI) * 31);
    }

    public String toString() {
        return "ListItem{tag=" + this.tag + ", name=" + ((Object) this.name) + AbstractJsonLexerKt.END_OBJ;
    }
}
