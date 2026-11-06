package com.amazon.alexa.voice.ui.onedesign.tta.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.onedesign.tta.items.AutoValue_PillResultTtaItem;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaPillResultViewHolder;
import com.amazon.alexa.voice.ui.tta.search.PillResultItem;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = TtaPillResultViewHolder.class)
/* loaded from: classes20.dex */
public abstract class PillResultTtaItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PillResultTtaItem build();

        public abstract Builder fromSimba(boolean z);

        public abstract Builder itemId(String str);

        public abstract Builder itemRoute(String str);

        public abstract Builder itemText(CharSequence charSequence);

        public abstract Builder itemType(int i);
    }

    public static Builder builder() {
        return new AutoValue_PillResultTtaItem.Builder();
    }

    public static PillResultTtaItem fromPillResultItem(PillResultItem pillResultItem) {
        return builder().itemId(pillResultItem.getId()).itemText(pillResultItem.getItemText()).itemType(pillResultItem.getType()).itemRoute(pillResultItem.getItemRoute()).fromSimba(pillResultItem.isFromSimba()).build();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PillResultTtaItem) {
            return getItemId().equals(((PillResultTtaItem) obj).getItemId());
        }
        return false;
    }

    public abstract String getItemId();

    @Nullable
    public abstract String getItemRoute();

    public abstract CharSequence getItemText();

    public abstract int getItemType();

    public int hashCode() {
        return getItemId().hashCode();
    }

    public abstract boolean isFromSimba();
}
