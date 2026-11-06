package com.amazon.alexa.voice.ui.onedesign.tta.items;

import com.amazon.alexa.voice.ui.onedesign.rv.ListItem;
import com.amazon.alexa.voice.ui.onedesign.tta.items.AutoValue_UserInputTtaItem;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaUserRequestViewHolder;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@ListItem(viewHolderClass = TtaUserRequestViewHolder.class)
/* loaded from: classes20.dex */
public abstract class UserInputTtaItem {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract UserInputTtaItem build();

        public abstract Builder itemText(CharSequence charSequence);
    }

    public static Builder builder() {
        return new AutoValue_UserInputTtaItem.Builder();
    }

    public abstract CharSequence getItemText();
}
