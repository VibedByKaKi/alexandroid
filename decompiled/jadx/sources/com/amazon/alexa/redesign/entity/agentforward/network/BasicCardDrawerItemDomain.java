package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.CardButton;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J]\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006*"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/BasicCardDrawerItemDomain;", "", "endComponent", "Lcom/amazon/alexa/redesign/entity/agentforward/network/AppComponentDomain;", "style", "Lcom/amazon/alexa/redesign/entity/agentforward/network/StyleDomain;", "primaryText", "", "secondaryText", CardButton.PRIMARY_ACTION, "Lcom/amazon/alexa/redesign/entity/agentforward/network/ContentActionDomain;", "primaryImage", "Lcom/amazon/alexa/redesign/entity/agentforward/network/ImageDomain;", "id", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/AppComponentDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/StyleDomain;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/network/ContentActionDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/ImageDomain;Ljava/lang/String;)V", "getEndComponent", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/AppComponentDomain;", "getStyle", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/StyleDomain;", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "getPrimaryAction", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/ContentActionDomain;", "getPrimaryImage", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/ImageDomain;", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class BasicCardDrawerItemDomain {
    public static final int $stable = 8;

    @Nullable
    private final AppComponentDomain endComponent;

    @Nullable
    private final String id;

    @Nullable
    private final ContentActionDomain primaryAction;

    @Nullable
    private final ImageDomain primaryImage;

    @Nullable
    private final String primaryText;

    @Nullable
    private final String secondaryText;

    @Nullable
    private final StyleDomain style;

    public /* synthetic */ BasicCardDrawerItemDomain(AppComponentDomain appComponentDomain, StyleDomain styleDomain, String str, String str2, ContentActionDomain contentActionDomain, ImageDomain imageDomain, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : appComponentDomain, (i & 2) != 0 ? null : styleDomain, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : contentActionDomain, (i & 32) != 0 ? null : imageDomain, (i & 64) != 0 ? null : str3);
    }

    public static /* synthetic */ BasicCardDrawerItemDomain copy$default(BasicCardDrawerItemDomain basicCardDrawerItemDomain, AppComponentDomain appComponentDomain, StyleDomain styleDomain, String str, String str2, ContentActionDomain contentActionDomain, ImageDomain imageDomain, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            appComponentDomain = basicCardDrawerItemDomain.endComponent;
        }
        if ((i & 2) != 0) {
            styleDomain = basicCardDrawerItemDomain.style;
        }
        if ((i & 4) != 0) {
            str = basicCardDrawerItemDomain.primaryText;
        }
        if ((i & 8) != 0) {
            str2 = basicCardDrawerItemDomain.secondaryText;
        }
        if ((i & 16) != 0) {
            contentActionDomain = basicCardDrawerItemDomain.primaryAction;
        }
        if ((i & 32) != 0) {
            imageDomain = basicCardDrawerItemDomain.primaryImage;
        }
        if ((i & 64) != 0) {
            str3 = basicCardDrawerItemDomain.id;
        }
        ImageDomain imageDomain2 = imageDomain;
        String str4 = str3;
        ContentActionDomain contentActionDomain2 = contentActionDomain;
        String str5 = str;
        return basicCardDrawerItemDomain.copy(appComponentDomain, styleDomain, str5, str2, contentActionDomain2, imageDomain2, str4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final AppComponentDomain getEndComponent() {
        return this.endComponent;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final StyleDomain getStyle() {
        return this.style;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ContentActionDomain getPrimaryAction() {
        return this.primaryAction;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ImageDomain getPrimaryImage() {
        return this.primaryImage;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final BasicCardDrawerItemDomain copy(@Nullable AppComponentDomain endComponent, @Nullable StyleDomain style, @Nullable String primaryText, @Nullable String secondaryText, @Nullable ContentActionDomain primaryAction, @Nullable ImageDomain primaryImage, @Nullable String id) {
        return new BasicCardDrawerItemDomain(endComponent, style, primaryText, secondaryText, primaryAction, primaryImage, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicCardDrawerItemDomain)) {
            return false;
        }
        BasicCardDrawerItemDomain basicCardDrawerItemDomain = (BasicCardDrawerItemDomain) other;
        return Intrinsics.areEqual(this.endComponent, basicCardDrawerItemDomain.endComponent) && Intrinsics.areEqual(this.style, basicCardDrawerItemDomain.style) && Intrinsics.areEqual(this.primaryText, basicCardDrawerItemDomain.primaryText) && Intrinsics.areEqual(this.secondaryText, basicCardDrawerItemDomain.secondaryText) && Intrinsics.areEqual(this.primaryAction, basicCardDrawerItemDomain.primaryAction) && Intrinsics.areEqual(this.primaryImage, basicCardDrawerItemDomain.primaryImage) && Intrinsics.areEqual(this.id, basicCardDrawerItemDomain.id);
    }

    @Nullable
    public final AppComponentDomain getEndComponent() {
        return this.endComponent;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final ContentActionDomain getPrimaryAction() {
        return this.primaryAction;
    }

    @Nullable
    public final ImageDomain getPrimaryImage() {
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
    public final StyleDomain getStyle() {
        return this.style;
    }

    public int hashCode() {
        AppComponentDomain appComponentDomain = this.endComponent;
        int hashCode = (appComponentDomain == null ? 0 : appComponentDomain.hashCode()) * 31;
        StyleDomain styleDomain = this.style;
        int hashCode2 = (hashCode + (styleDomain == null ? 0 : styleDomain.hashCode())) * 31;
        String str = this.primaryText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryText;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ContentActionDomain contentActionDomain = this.primaryAction;
        int hashCode5 = (hashCode4 + (contentActionDomain == null ? 0 : contentActionDomain.hashCode())) * 31;
        ImageDomain imageDomain = this.primaryImage;
        int hashCode6 = (hashCode5 + (imageDomain == null ? 0 : imageDomain.hashCode())) * 31;
        String str3 = this.id;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AppComponentDomain appComponentDomain = this.endComponent;
        StyleDomain styleDomain = this.style;
        String str = this.primaryText;
        String str2 = this.secondaryText;
        ContentActionDomain contentActionDomain = this.primaryAction;
        ImageDomain imageDomain = this.primaryImage;
        String str3 = this.id;
        StringBuilder sb = new StringBuilder("BasicCardDrawerItemDomain(endComponent=");
        sb.append(appComponentDomain);
        sb.append(", style=");
        sb.append(styleDomain);
        sb.append(", primaryText=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str, ", secondaryText=", str2, ", primaryAction=");
        sb.append(contentActionDomain);
        sb.append(", primaryImage=");
        sb.append(imageDomain);
        sb.append(", id=");
        return a$$ExternalSyntheticOutline0.m(sb, str3, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public BasicCardDrawerItemDomain(@Nullable AppComponentDomain appComponentDomain, @Nullable StyleDomain styleDomain, @Nullable String str, @Nullable String str2, @Nullable ContentActionDomain contentActionDomain, @Nullable ImageDomain imageDomain, @Nullable String str3) {
        this.endComponent = appComponentDomain;
        this.style = styleDomain;
        this.primaryText = str;
        this.secondaryText = str2;
        this.primaryAction = contentActionDomain;
        this.primaryImage = imageDomain;
        this.id = str3;
    }

    public BasicCardDrawerItemDomain() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
