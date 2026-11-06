package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ConversationResponseItem extends ConversationResponseItem {
    private final String itemDialogRequestId;
    private final String itemId;
    private final ItemPosition itemPosition;
    private final CharSequence itemText;
    private final int longPressAction;
    private final boolean remarkableAlexaStyleEnabled;
    private final boolean streamingEnabled;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ConversationResponseItem.Builder {
        private String itemDialogRequestId;
        private String itemId;
        private ItemPosition itemPosition;
        private CharSequence itemText;
        private Integer longPressAction;
        private Boolean remarkableAlexaStyleEnabled;
        private Boolean streamingEnabled;

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem.Builder
        public ConversationResponseItem build() {
            String str;
            String str2;
            ItemPosition itemPosition;
            Boolean bool;
            CharSequence charSequence = this.itemText;
            if (charSequence != null && (str = this.itemId) != null && (str2 = this.itemDialogRequestId) != null && (itemPosition = this.itemPosition) != null && (bool = this.remarkableAlexaStyleEnabled) != null && this.longPressAction != null && this.streamingEnabled != null) {
                return new AutoValue_ConversationResponseItem(charSequence, str, str2, itemPosition, bool.booleanValue(), this.longPressAction.intValue(), this.streamingEnabled.booleanValue(), 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.itemText == null) {
                sb.append(" itemText");
            }
            if (this.itemId == null) {
                sb.append(" itemId");
            }
            if (this.itemDialogRequestId == null) {
                sb.append(" itemDialogRequestId");
            }
            if (this.itemPosition == null) {
                sb.append(" itemPosition");
            }
            if (this.remarkableAlexaStyleEnabled == null) {
                sb.append(" remarkableAlexaStyleEnabled");
            }
            if (this.longPressAction == null) {
                sb.append(" longPressAction");
            }
            if (this.streamingEnabled == null) {
                sb.append(" streamingEnabled");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem.Builder
        public ConversationResponseItem.Builder itemDialogRequestId(String str) {
            if (str != null) {
                this.itemDialogRequestId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemDialogRequestId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem.Builder
        public ConversationResponseItem.Builder itemId(String str) {
            if (str != null) {
                this.itemId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem.Builder
        public ConversationResponseItem.Builder itemPosition(ItemPosition itemPosition) {
            if (itemPosition != null) {
                this.itemPosition = itemPosition;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemPosition");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem.Builder
        public ConversationResponseItem.Builder itemText(CharSequence charSequence) {
            if (charSequence != null) {
                this.itemText = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemText");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem.Builder
        public ConversationResponseItem.Builder longPressAction(int i) {
            this.longPressAction = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem.Builder
        public ConversationResponseItem.Builder remarkableAlexaStyleEnabled(boolean z) {
            this.remarkableAlexaStyleEnabled = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem.Builder
        public ConversationResponseItem.Builder streamingEnabled(boolean z) {
            this.streamingEnabled = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_ConversationResponseItem(CharSequence charSequence, String str, String str2, ItemPosition itemPosition, boolean z, int i, boolean z2) {
        this.itemText = charSequence;
        this.itemId = str;
        this.itemDialogRequestId = str2;
        this.itemPosition = itemPosition;
        this.remarkableAlexaStyleEnabled = z;
        this.longPressAction = i;
        this.streamingEnabled = z2;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem
    public String getItemDialogRequestId() {
        return this.itemDialogRequestId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem
    public String getItemId() {
        return this.itemId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem
    public ItemPosition getItemPosition() {
        return this.itemPosition;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem
    public CharSequence getItemText() {
        return this.itemText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem
    public int getLongPressAction() {
        return this.longPressAction;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem
    public boolean isRemarkableAlexaStyleEnabled() {
        return this.remarkableAlexaStyleEnabled;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem
    public boolean isStreamingEnabled() {
        return this.streamingEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationResponseItem{itemText=");
        sb.append((Object) this.itemText);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", itemDialogRequestId=");
        sb.append(this.itemDialogRequestId);
        sb.append(", itemPosition=");
        sb.append(this.itemPosition);
        sb.append(", remarkableAlexaStyleEnabled=");
        sb.append(this.remarkableAlexaStyleEnabled);
        sb.append(", longPressAction=");
        sb.append(this.longPressAction);
        sb.append(", streamingEnabled=");
        return a$$ExternalSyntheticOutline0.m(sb, this.streamingEnabled, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_ConversationResponseItem(CharSequence charSequence, String str, String str2, ItemPosition itemPosition, boolean z, int i, boolean z2, int i2) {
        this(charSequence, str, str2, itemPosition, z, i, z2);
    }
}
