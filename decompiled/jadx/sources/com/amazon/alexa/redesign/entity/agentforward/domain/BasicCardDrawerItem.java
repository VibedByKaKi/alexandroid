package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.CardButton;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J]\u0010/\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00066"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/BasicCardDrawerItem;", "", "id", "", "primaryText", "secondaryText", CardButton.PRIMARY_ACTION, "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", "primaryImage", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/Image;", "endComponent", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/AppComponent;", "style", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/Style;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;Lcom/amazon/alexa/redesign/entity/agentforward/domain/Image;Lcom/amazon/alexa/redesign/entity/agentforward/domain/AppComponent;Lcom/amazon/alexa/redesign/entity/agentforward/domain/Style;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getPrimaryText", "setPrimaryText", "getSecondaryText", "setSecondaryText", "getPrimaryAction", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", "setPrimaryAction", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;)V", "getPrimaryImage", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/Image;", "setPrimaryImage", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/Image;)V", "getEndComponent", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/AppComponent;", "setEndComponent", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/AppComponent;)V", "getStyle", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/Style;", "setStyle", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/Style;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class BasicCardDrawerItem {
    public static final int $stable = 8;

    @Nullable
    private AppComponent endComponent;

    @Nullable
    private String id;

    @Nullable
    private ContentAction primaryAction;

    @Nullable
    private Image primaryImage;

    @Nullable
    private String primaryText;

    @Nullable
    private String secondaryText;

    @Nullable
    private Style style;

    public /* synthetic */ BasicCardDrawerItem(String str, String str2, String str3, ContentAction contentAction, Image image, AppComponent appComponent, Style style, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : contentAction, (i & 16) != 0 ? null : image, (i & 32) != 0 ? null : appComponent, (i & 64) != 0 ? null : style);
    }

    public static /* synthetic */ BasicCardDrawerItem copy$default(BasicCardDrawerItem basicCardDrawerItem, String str, String str2, String str3, ContentAction contentAction, Image image, AppComponent appComponent, Style style, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basicCardDrawerItem.id;
        }
        if ((i & 2) != 0) {
            str2 = basicCardDrawerItem.primaryText;
        }
        if ((i & 4) != 0) {
            str3 = basicCardDrawerItem.secondaryText;
        }
        if ((i & 8) != 0) {
            contentAction = basicCardDrawerItem.primaryAction;
        }
        if ((i & 16) != 0) {
            image = basicCardDrawerItem.primaryImage;
        }
        if ((i & 32) != 0) {
            appComponent = basicCardDrawerItem.endComponent;
        }
        if ((i & 64) != 0) {
            style = basicCardDrawerItem.style;
        }
        AppComponent appComponent2 = appComponent;
        Style style2 = style;
        Image image2 = image;
        String str4 = str3;
        return basicCardDrawerItem.copy(str, str2, str4, contentAction, image2, appComponent2, style2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ContentAction getPrimaryAction() {
        return this.primaryAction;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Image getPrimaryImage() {
        return this.primaryImage;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final AppComponent getEndComponent() {
        return this.endComponent;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @NotNull
    public final BasicCardDrawerItem copy(@JsonProperty("id") @Nullable String id, @JsonProperty("primaryText") @Nullable String primaryText, @JsonProperty("secondaryText") @Nullable String secondaryText, @JsonProperty("primaryAction") @Nullable ContentAction primaryAction, @JsonProperty("primaryImage") @Nullable Image primaryImage, @JsonProperty("endComponent") @Nullable AppComponent endComponent, @JsonProperty("style") @Nullable Style style) {
        return new BasicCardDrawerItem(id, primaryText, secondaryText, primaryAction, primaryImage, endComponent, style);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicCardDrawerItem)) {
            return false;
        }
        BasicCardDrawerItem basicCardDrawerItem = (BasicCardDrawerItem) other;
        return Intrinsics.areEqual(this.id, basicCardDrawerItem.id) && Intrinsics.areEqual(this.primaryText, basicCardDrawerItem.primaryText) && Intrinsics.areEqual(this.secondaryText, basicCardDrawerItem.secondaryText) && Intrinsics.areEqual(this.primaryAction, basicCardDrawerItem.primaryAction) && Intrinsics.areEqual(this.primaryImage, basicCardDrawerItem.primaryImage) && Intrinsics.areEqual(this.endComponent, basicCardDrawerItem.endComponent) && Intrinsics.areEqual(this.style, basicCardDrawerItem.style);
    }

    @Nullable
    public final AppComponent getEndComponent() {
        return this.endComponent;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final ContentAction getPrimaryAction() {
        return this.primaryAction;
    }

    @Nullable
    public final Image getPrimaryImage() {
        return this.primaryImage;
    }

    @Nullable
    public final String getPrimaryText() {
        return this.primaryText;
    }

    @Nullable
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @Nullable
    public final Style getStyle() {
        return this.style;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.primaryText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContentAction contentAction = this.primaryAction;
        int hashCode4 = (hashCode3 + (contentAction == null ? 0 : contentAction.hashCode())) * 31;
        Image image = this.primaryImage;
        int hashCode5 = (hashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        AppComponent appComponent = this.endComponent;
        int hashCode6 = (hashCode5 + (appComponent == null ? 0 : appComponent.hashCode())) * 31;
        Style style = this.style;
        return hashCode6 + (style != null ? style.hashCode() : 0);
    }

    public final void setEndComponent(@Nullable AppComponent appComponent) {
        this.endComponent = appComponent;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setPrimaryAction(@Nullable ContentAction contentAction) {
        this.primaryAction = contentAction;
    }

    public final void setPrimaryImage(@Nullable Image image) {
        this.primaryImage = image;
    }

    public final void setPrimaryText(@Nullable String str) {
        this.primaryText = str;
    }

    public final void setSecondaryText(@Nullable String str) {
        this.secondaryText = str;
    }

    public final void setStyle(@Nullable Style style) {
        this.style = style;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.primaryText;
        String str3 = this.secondaryText;
        ContentAction contentAction = this.primaryAction;
        Image image = this.primaryImage;
        AppComponent appComponent = this.endComponent;
        Style style = this.style;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("BasicCardDrawerItem(id=", str, ", primaryText=", str2, ", secondaryText=");
        m.append(str3);
        m.append(", primaryAction=");
        m.append(contentAction);
        m.append(", primaryImage=");
        m.append(image);
        m.append(", endComponent=");
        m.append(appComponent);
        m.append(", style=");
        m.append(style);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    @JsonCreator
    public BasicCardDrawerItem(@JsonProperty("id") @Nullable String str, @JsonProperty("primaryText") @Nullable String str2, @JsonProperty("secondaryText") @Nullable String str3, @JsonProperty("primaryAction") @Nullable ContentAction contentAction, @JsonProperty("primaryImage") @Nullable Image image, @JsonProperty("endComponent") @Nullable AppComponent appComponent, @JsonProperty("style") @Nullable Style style) {
        this.id = str;
        this.primaryText = str2;
        this.secondaryText = str3;
        this.primaryAction = contentAction;
        this.primaryImage = image;
        this.endComponent = appComponent;
        this.style = style;
    }

    @JsonCreator
    public BasicCardDrawerItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
