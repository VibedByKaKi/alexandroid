package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.AutoValue_BottomSheetPillResultItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetPillResultViewHolder;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.tta.search.PillResultItem;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = BottomSheetPillResultViewHolder.class)
/* loaded from: classes20.dex */
public abstract class BottomSheetPillResultItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract BottomSheetPillResultItem build();

        public abstract Builder fromSimba(boolean z);

        public abstract Builder id(String str);

        public abstract Builder remarkableAlexaStyleEnabled(boolean z);

        public abstract Builder route(String str);

        public abstract Builder text(CharSequence charSequence);

        public abstract Builder type(int i);
    }

    public static Builder builder() {
        return new AutoValue_BottomSheetPillResultItem.Builder();
    }

    public static BottomSheetPillResultItem fromPillResultItem(PillResultItem pillResultItem, boolean z) {
        return builder().id(pillResultItem.getId()).text(pillResultItem.getItemText()).type(pillResultItem.getType()).route(pillResultItem.getItemRoute()).fromSimba(pillResultItem.isFromSimba()).remarkableAlexaStyleEnabled(z).build();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BottomSheetPillResultItem) {
            return getId().equals(((BottomSheetPillResultItem) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    @Nullable
    public abstract String getRoute();

    public abstract CharSequence getText();

    public abstract int getType();

    public int hashCode() {
        return getId().hashCode();
    }

    public abstract boolean isFromSimba();

    public abstract boolean isRemarkableAlexaStyleEnabled();
}
