package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import com.amazon.alexa.voice.ui.tta.search.ItemRoute;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_BottomSheetInAppLinkCardItem extends BottomSheetInAppLinkCardItem {
    private final String itemId;
    private final ItemPosition itemPosition;
    private final ItemRoute itemRoute;
    private final CharSequence primaryText;
    private final CharSequence secondText;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends BottomSheetInAppLinkCardItem.Builder {
        private String itemId;
        private ItemPosition itemPosition;
        private ItemRoute itemRoute;
        private CharSequence primaryText;
        private CharSequence secondText;

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem.Builder
        public BottomSheetInAppLinkCardItem build() {
            CharSequence charSequence;
            ItemRoute itemRoute;
            ItemPosition itemPosition;
            String str = this.itemId;
            if (str != null && (charSequence = this.primaryText) != null && (itemRoute = this.itemRoute) != null && (itemPosition = this.itemPosition) != null) {
                return new AutoValue_BottomSheetInAppLinkCardItem(str, charSequence, this.secondText, itemRoute, itemPosition, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.itemId == null) {
                sb.append(" itemId");
            }
            if (this.primaryText == null) {
                sb.append(" primaryText");
            }
            if (this.itemRoute == null) {
                sb.append(" itemRoute");
            }
            if (this.itemPosition == null) {
                sb.append(" itemPosition");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem.Builder
        public BottomSheetInAppLinkCardItem.Builder itemId(String str) {
            if (str != null) {
                this.itemId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemId");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem.Builder
        public BottomSheetInAppLinkCardItem.Builder itemPosition(ItemPosition itemPosition) {
            if (itemPosition != null) {
                this.itemPosition = itemPosition;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemPosition");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem.Builder
        public BottomSheetInAppLinkCardItem.Builder itemRoute(ItemRoute itemRoute) {
            if (itemRoute != null) {
                this.itemRoute = itemRoute;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemRoute");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem.Builder
        public BottomSheetInAppLinkCardItem.Builder primaryText(CharSequence charSequence) {
            if (charSequence != null) {
                this.primaryText = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null primaryText");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem.Builder
        public BottomSheetInAppLinkCardItem.Builder secondText(CharSequence charSequence) {
            this.secondText = charSequence;
            return this;
        }
    }

    private AutoValue_BottomSheetInAppLinkCardItem(String str, CharSequence charSequence, @Nullable CharSequence charSequence2, ItemRoute itemRoute, ItemPosition itemPosition) {
        this.itemId = str;
        this.primaryText = charSequence;
        this.secondText = charSequence2;
        this.itemRoute = itemRoute;
        this.itemPosition = itemPosition;
    }

    public boolean equals(Object obj) {
        CharSequence charSequence;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BottomSheetInAppLinkCardItem) {
            BottomSheetInAppLinkCardItem bottomSheetInAppLinkCardItem = (BottomSheetInAppLinkCardItem) obj;
            if (this.itemId.equals(bottomSheetInAppLinkCardItem.getItemId()) && this.primaryText.equals(bottomSheetInAppLinkCardItem.getPrimaryText()) && ((charSequence = this.secondText) != null ? charSequence.equals(bottomSheetInAppLinkCardItem.getSecondText()) : bottomSheetInAppLinkCardItem.getSecondText() == null) && this.itemRoute.equals(bottomSheetInAppLinkCardItem.getItemRoute()) && this.itemPosition.equals(bottomSheetInAppLinkCardItem.getItemPosition())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem
    public String getItemId() {
        return this.itemId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem
    public ItemPosition getItemPosition() {
        return this.itemPosition;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem
    public ItemRoute getItemRoute() {
        return this.itemRoute;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem
    public CharSequence getPrimaryText() {
        return this.primaryText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetInAppLinkCardItem
    @Nullable
    public CharSequence getSecondText() {
        return this.secondText;
    }

    public int hashCode() {
        int hashCode = (((this.itemId.hashCode() ^ 1000003) * 1000003) ^ this.primaryText.hashCode()) * 1000003;
        CharSequence charSequence = this.secondText;
        return this.itemPosition.hashCode() ^ ((((hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003) ^ this.itemRoute.hashCode()) * 1000003);
    }

    public String toString() {
        return "BottomSheetInAppLinkCardItem{itemId=" + this.itemId + ", primaryText=" + ((Object) this.primaryText) + ", secondText=" + ((Object) this.secondText) + ", itemRoute=" + this.itemRoute + ", itemPosition=" + this.itemPosition + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_BottomSheetInAppLinkCardItem(String str, CharSequence charSequence, CharSequence charSequence2, ItemRoute itemRoute, ItemPosition itemPosition, int i) {
        this(str, charSequence, charSequence2, itemRoute, itemPosition);
    }
}
