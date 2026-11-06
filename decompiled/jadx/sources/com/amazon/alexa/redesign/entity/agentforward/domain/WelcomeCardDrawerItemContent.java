package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.CardButton;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u00101\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014¨\u00068"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/WelcomeCardDrawerItemContent;", "", "primaryText", "", "secondaryText", "agentSpaceText", "agentSpaceMarkdownText", CardButton.PRIMARY_ACTION, "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", "primaryImage", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/Image;", "additionalData", "", "Lcom/fasterxml/jackson/databind/JsonNode;", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;Lcom/amazon/alexa/redesign/entity/agentforward/domain/Image;Ljava/util/Map;Ljava/lang/String;)V", "getPrimaryText", "()Ljava/lang/String;", "setPrimaryText", "(Ljava/lang/String;)V", "getSecondaryText", "setSecondaryText", "getAgentSpaceText", "setAgentSpaceText", "getAgentSpaceMarkdownText", "setAgentSpaceMarkdownText", "getPrimaryAction", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", "setPrimaryAction", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;)V", "getPrimaryImage", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/Image;", "setPrimaryImage", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/Image;)V", "getAdditionalData", "()Ljava/util/Map;", "setAdditionalData", "(Ljava/util/Map;)V", "getId", "setId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class WelcomeCardDrawerItemContent {
    public static final int $stable = 8;

    @Nullable
    private Map<String, ? extends JsonNode> additionalData;

    @Nullable
    private String agentSpaceMarkdownText;

    @Nullable
    private String agentSpaceText;

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

    public /* synthetic */ WelcomeCardDrawerItemContent(String str, String str2, String str3, String str4, ContentAction contentAction, Image image, Map map, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : contentAction, (i & 32) != 0 ? null : image, (i & 64) != 0 ? null : map, (i & 128) != 0 ? null : str5);
    }

    public static /* synthetic */ WelcomeCardDrawerItemContent copy$default(WelcomeCardDrawerItemContent welcomeCardDrawerItemContent, String str, String str2, String str3, String str4, ContentAction contentAction, Image image, Map map, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = welcomeCardDrawerItemContent.primaryText;
        }
        if ((i & 2) != 0) {
            str2 = welcomeCardDrawerItemContent.secondaryText;
        }
        if ((i & 4) != 0) {
            str3 = welcomeCardDrawerItemContent.agentSpaceText;
        }
        if ((i & 8) != 0) {
            str4 = welcomeCardDrawerItemContent.agentSpaceMarkdownText;
        }
        if ((i & 16) != 0) {
            contentAction = welcomeCardDrawerItemContent.primaryAction;
        }
        if ((i & 32) != 0) {
            image = welcomeCardDrawerItemContent.primaryImage;
        }
        if ((i & 64) != 0) {
            map = welcomeCardDrawerItemContent.additionalData;
        }
        if ((i & 128) != 0) {
            str5 = welcomeCardDrawerItemContent.id;
        }
        Map map2 = map;
        String str6 = str5;
        ContentAction contentAction2 = contentAction;
        Image image2 = image;
        return welcomeCardDrawerItemContent.copy(str, str2, str3, str4, contentAction2, image2, map2, str6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAgentSpaceText() {
        return this.agentSpaceText;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAgentSpaceMarkdownText() {
        return this.agentSpaceMarkdownText;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ContentAction getPrimaryAction() {
        return this.primaryAction;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Image getPrimaryImage() {
        return this.primaryImage;
    }

    @Nullable
    public final Map<String, JsonNode> component7() {
        return this.additionalData;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final WelcomeCardDrawerItemContent copy(@JsonProperty("primaryText") @Nullable String primaryText, @JsonProperty("secondaryText") @Nullable String secondaryText, @JsonProperty("agentSpaceText") @Nullable String agentSpaceText, @JsonProperty("agentSpaceMarkdownText") @Nullable String agentSpaceMarkdownText, @JsonProperty("primaryAction") @Nullable ContentAction primaryAction, @JsonProperty("primaryImage") @Nullable Image primaryImage, @JsonProperty("additionalData") @Nullable Map<String, ? extends JsonNode> additionalData, @JsonProperty("id") @Nullable String id) {
        return new WelcomeCardDrawerItemContent(primaryText, secondaryText, agentSpaceText, agentSpaceMarkdownText, primaryAction, primaryImage, additionalData, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeCardDrawerItemContent)) {
            return false;
        }
        WelcomeCardDrawerItemContent welcomeCardDrawerItemContent = (WelcomeCardDrawerItemContent) other;
        return Intrinsics.areEqual(this.primaryText, welcomeCardDrawerItemContent.primaryText) && Intrinsics.areEqual(this.secondaryText, welcomeCardDrawerItemContent.secondaryText) && Intrinsics.areEqual(this.agentSpaceText, welcomeCardDrawerItemContent.agentSpaceText) && Intrinsics.areEqual(this.agentSpaceMarkdownText, welcomeCardDrawerItemContent.agentSpaceMarkdownText) && Intrinsics.areEqual(this.primaryAction, welcomeCardDrawerItemContent.primaryAction) && Intrinsics.areEqual(this.primaryImage, welcomeCardDrawerItemContent.primaryImage) && Intrinsics.areEqual(this.additionalData, welcomeCardDrawerItemContent.additionalData) && Intrinsics.areEqual(this.id, welcomeCardDrawerItemContent.id);
    }

    @Nullable
    public final Map<String, JsonNode> getAdditionalData() {
        return this.additionalData;
    }

    @Nullable
    public final String getAgentSpaceMarkdownText() {
        return this.agentSpaceMarkdownText;
    }

    @Nullable
    public final String getAgentSpaceText() {
        return this.agentSpaceText;
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

    public int hashCode() {
        String str = this.primaryText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondaryText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentSpaceText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentSpaceMarkdownText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ContentAction contentAction = this.primaryAction;
        int hashCode5 = (hashCode4 + (contentAction == null ? 0 : contentAction.hashCode())) * 31;
        Image image = this.primaryImage;
        int hashCode6 = (hashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        Map<String, ? extends JsonNode> map = this.additionalData;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str5 = this.id;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAdditionalData(@Nullable Map<String, ? extends JsonNode> map) {
        this.additionalData = map;
    }

    public final void setAgentSpaceMarkdownText(@Nullable String str) {
        this.agentSpaceMarkdownText = str;
    }

    public final void setAgentSpaceText(@Nullable String str) {
        this.agentSpaceText = str;
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

    @NotNull
    public String toString() {
        String str = this.primaryText;
        String str2 = this.secondaryText;
        String str3 = this.agentSpaceText;
        String str4 = this.agentSpaceMarkdownText;
        ContentAction contentAction = this.primaryAction;
        Image image = this.primaryImage;
        Map<String, ? extends JsonNode> map = this.additionalData;
        String str5 = this.id;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("WelcomeCardDrawerItemContent(primaryText=", str, ", secondaryText=", str2, ", agentSpaceText=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", agentSpaceMarkdownText=", str4, ", primaryAction=");
        m.append(contentAction);
        m.append(", primaryImage=");
        m.append(image);
        m.append(", additionalData=");
        m.append(map);
        m.append(", id=");
        m.append(str5);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    @JsonCreator
    public WelcomeCardDrawerItemContent(@JsonProperty("primaryText") @Nullable String str, @JsonProperty("secondaryText") @Nullable String str2, @JsonProperty("agentSpaceText") @Nullable String str3, @JsonProperty("agentSpaceMarkdownText") @Nullable String str4, @JsonProperty("primaryAction") @Nullable ContentAction contentAction, @JsonProperty("primaryImage") @Nullable Image image, @JsonProperty("additionalData") @Nullable Map<String, ? extends JsonNode> map, @JsonProperty("id") @Nullable String str5) {
        this.primaryText = str;
        this.secondaryText = str2;
        this.agentSpaceText = str3;
        this.agentSpaceMarkdownText = str4;
        this.primaryAction = contentAction;
        this.primaryImage = image;
        this.additionalData = map;
        this.id = str5;
    }

    @JsonCreator
    public WelcomeCardDrawerItemContent() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
