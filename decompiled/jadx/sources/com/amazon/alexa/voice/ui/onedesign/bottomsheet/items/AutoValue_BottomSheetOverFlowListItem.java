package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_BottomSheetOverFlowListItem extends BottomSheetOverFlowListItem {
    private final String id;
    private final int image;
    private final String route;
    private final int text;
    private final int type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends BottomSheetOverFlowListItem.Builder {
        private String id;
        private Integer image;
        private String route;
        private Integer text;
        private Integer type;

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem.Builder
        public BottomSheetOverFlowListItem build() {
            Integer num = this.text;
            if (num != null && this.id != null && this.type != null && this.image != null) {
                int intValue = num.intValue();
                return new AutoValue_BottomSheetOverFlowListItem(this.id, intValue, this.type.intValue(), this.route, this.image.intValue(), 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.text == null) {
                sb.append(" text");
            }
            if (this.id == null) {
                sb.append(" id");
            }
            if (this.type == null) {
                sb.append(" type");
            }
            if (this.image == null) {
                sb.append(" image");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem.Builder
        public BottomSheetOverFlowListItem.Builder id(String str) {
            if (str != null) {
                this.id = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null id");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem.Builder
        public BottomSheetOverFlowListItem.Builder image(int i) {
            this.image = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem.Builder
        public BottomSheetOverFlowListItem.Builder route(String str) {
            this.route = str;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem.Builder
        public BottomSheetOverFlowListItem.Builder text(int i) {
            this.text = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem.Builder
        public BottomSheetOverFlowListItem.Builder type(int i) {
            this.type = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_BottomSheetOverFlowListItem(int i, String str, @Nullable String str2, int i2, int i3) {
        this.text = i;
        this.id = str;
        this.route = str2;
        this.type = i2;
        this.image = i3;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem
    public int getImage() {
        return this.image;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem
    @Nullable
    public String getRoute() {
        return this.route;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem
    public int getText() {
        return this.text;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem
    public int getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetOverFlowListItem{text=");
        sb.append(this.text);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", route=");
        sb.append(this.route);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", image=");
        return a$$ExternalSyntheticOutline0.m(sb, this.image, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_BottomSheetOverFlowListItem(String str, int i, int i2, String str2, int i3, int i4) {
        this(i, str, str2, i2, i3);
    }
}
