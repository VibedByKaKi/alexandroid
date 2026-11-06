package com.amazon.alexa.voice.ui.onedesign.tta.items;

import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.onedesign.tta.items.AutoValue_AlexaResponseTtaItem;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaAlexaResponseViewHolder;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = TtaAlexaResponseViewHolder.class)
/* loaded from: classes20.dex */
public abstract class AlexaResponseTtaItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AlexaResponseTtaItem build();

        public abstract Builder itemId(String str);

        public abstract Builder itemText(CharSequence charSequence);
    }

    public static Builder builder() {
        return new AutoValue_AlexaResponseTtaItem.Builder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlexaResponseTtaItem) {
            return getItemId().equals(((AlexaResponseTtaItem) obj).getItemId());
        }
        return false;
    }

    public abstract String getItemId();

    public abstract CharSequence getItemText();

    public int hashCode() {
        return getItemId().hashCode();
    }
}
