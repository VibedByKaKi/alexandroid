package com.amazon.alexa.voice.ui.onedesign.minicards;

import com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_NativeMiniCardListItem extends NativeMiniCardListItem {
    private final String attribution;
    private final String document;
    private final String id;
    private final Double imageAspectRatio;
    private final NativeMiniCardImageShape imageShape;
    private final String imageUrl;
    private final NativeMiniCardAction primaryAction;
    private final String primaryText;
    private final String secondaryText;
    private final String tertiaryText;
    private final String trailingText;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends NativeMiniCardListItem.Builder {
        private String attribution;
        private String document;
        private String id;
        private Double imageAspectRatio;
        private NativeMiniCardImageShape imageShape;
        private String imageUrl;
        private NativeMiniCardAction primaryAction;
        private String primaryText;
        private String secondaryText;
        private String tertiaryText;
        private String trailingText;

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder attribution(String str) {
            this.attribution = str;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem build() {
            String str = this.id;
            if (str != null) {
                return new AutoValue_NativeMiniCardListItem(str, this.primaryText, this.secondaryText, this.tertiaryText, this.trailingText, this.imageUrl, this.imageAspectRatio, this.imageShape, this.attribution, this.primaryAction, this.document, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: id");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder document(String str) {
            this.document = str;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder id(String str) {
            if (str != null) {
                this.id = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null id");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder imageAspectRatio(Double d) {
            this.imageAspectRatio = d;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder imageShape(NativeMiniCardImageShape nativeMiniCardImageShape) {
            this.imageShape = nativeMiniCardImageShape;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder imageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder primaryAction(NativeMiniCardAction nativeMiniCardAction) {
            this.primaryAction = nativeMiniCardAction;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder primaryText(String str) {
            this.primaryText = str;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder secondaryText(String str) {
            this.secondaryText = str;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder tertiaryText(String str) {
            this.tertiaryText = str;
            return this;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem.Builder
        public NativeMiniCardListItem.Builder trailingText(String str) {
            this.trailingText = str;
            return this;
        }
    }

    private AutoValue_NativeMiniCardListItem(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Double d, @Nullable NativeMiniCardImageShape nativeMiniCardImageShape, @Nullable String str7, @Nullable NativeMiniCardAction nativeMiniCardAction, @Nullable String str8) {
        this.id = str;
        this.primaryText = str2;
        this.secondaryText = str3;
        this.tertiaryText = str4;
        this.trailingText = str5;
        this.imageUrl = str6;
        this.imageAspectRatio = d;
        this.imageShape = nativeMiniCardImageShape;
        this.attribution = str7;
        this.primaryAction = nativeMiniCardAction;
        this.document = str8;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Double d;
        NativeMiniCardImageShape nativeMiniCardImageShape;
        String str6;
        NativeMiniCardAction nativeMiniCardAction;
        String str7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof NativeMiniCardListItem) {
            NativeMiniCardListItem nativeMiniCardListItem = (NativeMiniCardListItem) obj;
            if (this.id.equals(nativeMiniCardListItem.getId()) && ((str = this.primaryText) != null ? str.equals(nativeMiniCardListItem.getPrimaryText()) : nativeMiniCardListItem.getPrimaryText() == null) && ((str2 = this.secondaryText) != null ? str2.equals(nativeMiniCardListItem.getSecondaryText()) : nativeMiniCardListItem.getSecondaryText() == null) && ((str3 = this.tertiaryText) != null ? str3.equals(nativeMiniCardListItem.getTertiaryText()) : nativeMiniCardListItem.getTertiaryText() == null) && ((str4 = this.trailingText) != null ? str4.equals(nativeMiniCardListItem.getTrailingText()) : nativeMiniCardListItem.getTrailingText() == null) && ((str5 = this.imageUrl) != null ? str5.equals(nativeMiniCardListItem.getImageUrl()) : nativeMiniCardListItem.getImageUrl() == null) && ((d = this.imageAspectRatio) != null ? d.equals(nativeMiniCardListItem.getImageAspectRatio()) : nativeMiniCardListItem.getImageAspectRatio() == null) && ((nativeMiniCardImageShape = this.imageShape) != null ? nativeMiniCardImageShape.equals(nativeMiniCardListItem.getImageShape()) : nativeMiniCardListItem.getImageShape() == null) && ((str6 = this.attribution) != null ? str6.equals(nativeMiniCardListItem.getAttribution()) : nativeMiniCardListItem.getAttribution() == null) && ((nativeMiniCardAction = this.primaryAction) != null ? nativeMiniCardAction.equals(nativeMiniCardListItem.getPrimaryAction()) : nativeMiniCardListItem.getPrimaryAction() == null) && ((str7 = this.document) != null ? str7.equals(nativeMiniCardListItem.getDocument()) : nativeMiniCardListItem.getDocument() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public String getAttribution() {
        return this.attribution;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public String getDocument() {
        return this.document;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public Double getImageAspectRatio() {
        return this.imageAspectRatio;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public NativeMiniCardImageShape getImageShape() {
        return this.imageShape;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public NativeMiniCardAction getPrimaryAction() {
        return this.primaryAction;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public String getPrimaryText() {
        return this.primaryText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public String getSecondaryText() {
        return this.secondaryText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public String getTertiaryText() {
        return this.tertiaryText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem
    @Nullable
    public String getTrailingText() {
        return this.trailingText;
    }

    public int hashCode() {
        int hashCode = (this.id.hashCode() ^ 1000003) * 1000003;
        String str = this.primaryText;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.secondaryText;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.tertiaryText;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.trailingText;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.imageUrl;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        Double d = this.imageAspectRatio;
        int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
        NativeMiniCardImageShape nativeMiniCardImageShape = this.imageShape;
        int hashCode8 = (hashCode7 ^ (nativeMiniCardImageShape == null ? 0 : nativeMiniCardImageShape.hashCode())) * 1000003;
        String str6 = this.attribution;
        int hashCode9 = (hashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        NativeMiniCardAction nativeMiniCardAction = this.primaryAction;
        int hashCode10 = (hashCode9 ^ (nativeMiniCardAction == null ? 0 : nativeMiniCardAction.hashCode())) * 1000003;
        String str7 = this.document;
        return hashCode10 ^ (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeMiniCardListItem{id=");
        sb.append(this.id);
        sb.append(", primaryText=");
        sb.append(this.primaryText);
        sb.append(", secondaryText=");
        sb.append(this.secondaryText);
        sb.append(", tertiaryText=");
        sb.append(this.tertiaryText);
        sb.append(", trailingText=");
        sb.append(this.trailingText);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", imageAspectRatio=");
        sb.append(this.imageAspectRatio);
        sb.append(", imageShape=");
        sb.append(this.imageShape);
        sb.append(", attribution=");
        sb.append(this.attribution);
        sb.append(", primaryAction=");
        sb.append(this.primaryAction);
        sb.append(", document=");
        return a$$ExternalSyntheticOutline0.m(sb, this.document, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_NativeMiniCardListItem(String str, String str2, String str3, String str4, String str5, String str6, Double d, NativeMiniCardImageShape nativeMiniCardImageShape, String str7, NativeMiniCardAction nativeMiniCardAction, String str8, int i) {
        this(str, str2, str3, str4, str5, str6, d, nativeMiniCardImageShape, str7, nativeMiniCardAction, str8);
    }
}
