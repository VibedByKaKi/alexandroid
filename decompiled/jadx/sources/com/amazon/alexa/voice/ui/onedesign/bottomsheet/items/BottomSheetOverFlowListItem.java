package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.AutoValue_BottomSheetOverFlowListItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetOverFlowViewHolder;
import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = BottomSheetOverFlowViewHolder.class)
/* loaded from: classes20.dex */
public abstract class BottomSheetOverFlowListItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract BottomSheetOverFlowListItem build();

        public abstract Builder id(String str);

        public abstract Builder image(int i);

        public abstract Builder route(String str);

        public abstract Builder text(int i);

        public abstract Builder type(int i);
    }

    public static Builder builder() {
        return new AutoValue_BottomSheetOverFlowListItem.Builder();
    }

    public static BottomSheetOverFlowListItem fromOverflowItem(OverFlowListItem overFlowListItem) {
        return builder().id(overFlowListItem.getId()).text(overFlowListItem.getItemText()).route(overFlowListItem.getItemRoute()).type(overFlowListItem.getType()).image(overFlowListItem.getImageId()).build();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BottomSheetOverFlowListItem) {
            return getId().equals(((BottomSheetOverFlowListItem) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public abstract int getImage();

    @Nullable
    public abstract String getRoute();

    public abstract int getText();

    public abstract int getType();

    public int hashCode() {
        return getId().hashCode();
    }
}
