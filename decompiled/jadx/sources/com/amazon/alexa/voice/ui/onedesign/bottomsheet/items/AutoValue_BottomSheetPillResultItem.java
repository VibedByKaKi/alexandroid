package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_BottomSheetPillResultItem extends BottomSheetPillResultItem {
    private final boolean fromSimba;
    private final String id;
    private final boolean remarkableAlexaStyleEnabled;
    private final String route;
    private final CharSequence text;
    private final int type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends BottomSheetPillResultItem.Builder {
        private Boolean fromSimba;
        private String id;
        private Boolean remarkableAlexaStyleEnabled;
        private String route;
        private CharSequence text;
        private Integer type;

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem.Builder
        public BottomSheetPillResultItem build() {
            String str;
            Integer num;
            CharSequence charSequence = this.text;
            if (charSequence != null && (str = this.id) != null && (num = this.type) != null && this.fromSimba != null && this.remarkableAlexaStyleEnabled != null) {
                return new AutoValue_BottomSheetPillResultItem(charSequence, str, num.intValue(), this.route, this.fromSimba.booleanValue(), this.remarkableAlexaStyleEnabled.booleanValue(), 0);
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
            if (this.fromSimba == null) {
                sb.append(" fromSimba");
            }
            if (this.remarkableAlexaStyleEnabled == null) {
                sb.append(" remarkableAlexaStyleEnabled");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem.Builder
        public BottomSheetPillResultItem.Builder fromSimba(boolean z) {
            this.fromSimba = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem.Builder
        public BottomSheetPillResultItem.Builder id(String str) {
            if (str != null) {
                this.id = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null id");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem.Builder
        public BottomSheetPillResultItem.Builder remarkableAlexaStyleEnabled(boolean z) {
            this.remarkableAlexaStyleEnabled = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem.Builder
        public BottomSheetPillResultItem.Builder route(String str) {
            this.route = str;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem.Builder
        public BottomSheetPillResultItem.Builder text(CharSequence charSequence) {
            if (charSequence != null) {
                this.text = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null text");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem.Builder
        public BottomSheetPillResultItem.Builder type(int i) {
            this.type = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_BottomSheetPillResultItem(CharSequence charSequence, String str, int i, @Nullable String str2, boolean z, boolean z2) {
        this.text = charSequence;
        this.id = str;
        this.type = i;
        this.route = str2;
        this.fromSimba = z;
        this.remarkableAlexaStyleEnabled = z2;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem
    @Nullable
    public String getRoute() {
        return this.route;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem
    public CharSequence getText() {
        return this.text;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem
    public int getType() {
        return this.type;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem
    public boolean isFromSimba() {
        return this.fromSimba;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetPillResultItem
    public boolean isRemarkableAlexaStyleEnabled() {
        return this.remarkableAlexaStyleEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetPillResultItem{text=");
        sb.append((Object) this.text);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", route=");
        sb.append(this.route);
        sb.append(", fromSimba=");
        sb.append(this.fromSimba);
        sb.append(", remarkableAlexaStyleEnabled=");
        return a$$ExternalSyntheticOutline0.m(sb, this.remarkableAlexaStyleEnabled, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_BottomSheetPillResultItem(CharSequence charSequence, String str, int i, String str2, boolean z, boolean z2, int i2) {
        this(charSequence, str, i, str2, z, z2);
    }
}
