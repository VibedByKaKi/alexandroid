package com.amazon.alexa.redesign.entity;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.actions.ActionFactory;
import com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel;
import com.amazon.alexa.redesign.utils.Constants;
import com.amazon.alexa.redesign.utils.DismissIdBuilder;
import com.amazon.alexa.redesign.utils.HomeCardsProducer;
import com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ\n\u0010@\u001a\u0004\u0018\u00010AH&J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010D\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bJ\u0006\u0010E\u001a\u00020\fJ\u0006\u0010F\u001a\u00020\u001dJ\u0006\u0010G\u001a\u00020\u001dJ\u0006\u0010H\u001a\u00020\u001dJ\b\u0010I\u001a\u00020\u001dH\u0002J\u0006\u0010J\u001a\u00020\u001dJ\u0006\u0010K\u001a\u00020\u001dJ\u0006\u0010L\u001a\u00020\u001dR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R<\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0012@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0018X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001d@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001d@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u000e\u0010$\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010%\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R$\u0010(\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u001e\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u000fR\u001a\u0010-\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R\u001a\u0010/\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R\u001a\u00102\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R(\u00105\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R\"\u00109\u001a\u0004\u0018\u0001082\b\u0010\u000b\u001a\u0004\u0018\u000108@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R(\u0010<\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0006¨\u0006M"}, d2 = {"Lcom/amazon/alexa/redesign/entity/CardModel;", "", "<init>", "()V", "cardJson", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "childModels", "", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "(Lorg/json/JSONObject;Ljava/util/List;)V", "value", "", "templateType", "getTemplateType", "()Ljava/lang/String;", "setTemplateType", "(Ljava/lang/String;)V", "", "metricsData", "getMetricsData", "()Ljava/util/Map;", "setMetricsData", "(Ljava/util/Map;)V", "", "getChildModels", "()Ljava/util/List;", "setChildModels", "(Ljava/util/List;)V", "", "isDismissible", "()Z", "setDismissible", "(Z)V", "clickToDismiss", "getClickToDismiss", "contentId", "contentProvider", "getContentProvider", "setContentProvider", "contentType", "getContentType", "setContentType", "refreshId", "getRefreshId", "isColdStart", "setColdStart", "viewUpdateType", "getViewUpdateType", "setViewUpdateType", "lastRouteName", "getLastRouteName", "setLastRouteName", "cardId", "getCardId", "setCardId", "Lcom/amazon/alexa/redesign/entity/ContentMetadata;", "contentMetadata", "getContentMetadata", "()Lcom/amazon/alexa/redesign/entity/ContentMetadata;", "jsonObject", "getJsonObject", "()Lorg/json/JSONObject;", "setJsonObject", "toViewItem", "Lcom/amazon/alexa/redesign/view/homeFeed/RecyclerViewItem;", "initContentMetadata", "", "getChildViewModels", "getDismissCardId", "canPoll", "isLegalCard", "isPE", "isCmsDebugCard", "isHnbEligible", "isHSB", "isPremium", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardModel.kt\ncom/amazon/alexa/redesign/entity/CardModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
/* loaded from: classes19.dex */
public abstract class CardModel {
    public static final int $stable = 8;

    @Nullable
    private String cardId;

    @Nullable
    private List<ViewTypeModel> childModels;
    private boolean clickToDismiss;

    @NotNull
    private String contentId;

    @Nullable
    private ContentMetadata contentMetadata;

    @NotNull
    private String contentProvider;

    @NotNull
    private String contentType;
    private boolean isColdStart;
    private boolean isDismissible;

    @Nullable
    private JSONObject jsonObject;

    @NotNull
    private String lastRouteName;

    @NotNull
    private Map<String, Object> metricsData;

    @NotNull
    private String refreshId;

    @Nullable
    private String templateType;

    @NotNull
    private String viewUpdateType;

    public CardModel(@Nullable JSONObject jSONObject) {
        this.metricsData = new LinkedHashMap();
        this.contentId = "";
        this.contentProvider = "";
        this.contentType = "";
        this.refreshId = "";
        this.isColdStart = true;
        this.viewUpdateType = "";
        this.lastRouteName = "";
        if (jSONObject != null) {
            this.jsonObject = jSONObject;
            this.metricsData = HomeCardsProducer.getTopLevelMetricsData(jSONObject);
            this.contentId = jSONObject.optString("contentId", "");
            this.contentProvider = jSONObject.optString("contentProvider", "");
            this.contentType = jSONObject.optString("contentType", "");
            this.refreshId = jSONObject.optString("refreshId", "");
            this.clickToDismiss = jSONObject.optBoolean("clickToDismiss", false);
            this.isDismissible = isDismissible(jSONObject);
            initContentMetadata(jSONObject);
        }
    }

    private final void initContentMetadata(JSONObject cardJson) {
        ContentMetadata contentMetadata;
        try {
            contentMetadata = new ContentMetadata(cardJson);
        } catch (Exception unused) {
            contentMetadata = null;
        }
        this.contentMetadata = contentMetadata;
    }

    private final boolean isCmsDebugCard() {
        boolean contains$default;
        if (!Intrinsics.areEqual(this.metricsData.get("section"), Constants.SPECIAL)) {
            return false;
        }
        contains$default = StringsKt__StringsKt.contains$default(this.contentId, "PreviewCard", false, 2, (Object) null);
        return contains$default;
    }

    public final boolean canPoll() {
        RefreshData refreshData;
        ContentMetadata contentMetadata = this.contentMetadata;
        return contentMetadata != null && (refreshData = contentMetadata.getRefreshData()) != null && refreshData.getEnabled() && refreshData.getIntervalInMs() > 0;
    }

    @Nullable
    public final String getCardId() {
        return this.cardId;
    }

    @Nullable
    public final List<ViewTypeModel> getChildModels() {
        return this.childModels;
    }

    @Nullable
    public final List<ViewTypeModel> getChildViewModels() {
        List<ViewTypeModel> list = this.childModels;
        if (list != null) {
            return CollectionsKt.toList(list);
        }
        return null;
    }

    public final boolean getClickToDismiss() {
        return this.clickToDismiss;
    }

    @Nullable
    public final ContentMetadata getContentMetadata() {
        return this.contentMetadata;
    }

    @NotNull
    public final String getContentProvider() {
        return this.contentProvider;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getDismissCardId() {
        return DismissIdBuilder.INSTANCE.buildDismissId(this.contentId, this.contentProvider, this.contentType);
    }

    @Nullable
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @NotNull
    public final String getLastRouteName() {
        return this.lastRouteName;
    }

    @NotNull
    public final Map<String, Object> getMetricsData() {
        return this.metricsData;
    }

    @NotNull
    public final String getRefreshId() {
        return this.refreshId;
    }

    @Nullable
    public final String getTemplateType() {
        return this.templateType;
    }

    @NotNull
    public final String getViewUpdateType() {
        return this.viewUpdateType;
    }

    /* renamed from: isColdStart, reason: from getter */
    public final boolean getIsColdStart() {
        return this.isColdStart;
    }

    @VisibleForTesting
    public final boolean isDismissible(@NotNull JSONObject cardJson) {
        cardJson.getClass();
        JSONArray optJSONArray = cardJson.optJSONArray("contentActions");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (Intrinsics.areEqual(optJSONObject != null ? optJSONObject.optString(MessagingControllerConstant.MESSAGING_CONTROLLER_PAYLOAD_TYPE, "") : null, ActionFactory.DISMISS_ACTION)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isHSB() {
        SectionData sectionData;
        ContentMetadata contentMetadata = this.contentMetadata;
        return Intrinsics.areEqual((contentMetadata == null || (sectionData = contentMetadata.getSectionData()) == null) ? null : sectionData.getSectionId(), SectionId.HomeStatusBar.toString());
    }

    public final boolean isHnbEligible() {
        return isLegalCard() || isCmsDebugCard();
    }

    public final boolean isLegalCard() {
        return Intrinsics.areEqual(this.metricsData.get("section"), Constants.OVERRIDE) || Intrinsics.areEqual(this.metricsData.get("subSection"), Constants.OVERRIDE);
    }

    public final boolean isPE() {
        SectionData sectionData;
        String sectionId;
        try {
            ContentMetadata contentMetadata = this.contentMetadata;
            if (contentMetadata != null && (sectionData = contentMetadata.getSectionData()) != null && (sectionId = sectionData.getSectionId()) != null) {
                if (SectionId.valueOf(sectionId) == SectionId.PriorityEvents) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final boolean isPremium() {
        SectionData sectionData;
        try {
            ContentMetadata contentMetadata = this.contentMetadata;
            if (contentMetadata != null && (sectionData = contentMetadata.getSectionData()) != null) {
                return sectionData.isPremium();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void setCardId(@Nullable String str) {
        this.cardId = str;
    }

    public final void setChildModels(@Nullable List<ViewTypeModel> list) {
        this.childModels = list;
    }

    public final void setColdStart(boolean z) {
        this.isColdStart = z;
    }

    public final void setContentProvider(@NotNull String str) {
        str.getClass();
        this.contentProvider = str;
    }

    public final void setContentType(@NotNull String str) {
        str.getClass();
        this.contentType = str;
    }

    public final void setDismissible(boolean z) {
        this.isDismissible = z;
    }

    public final void setJsonObject(@Nullable JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    public final void setLastRouteName(@NotNull String str) {
        str.getClass();
        this.lastRouteName = str;
    }

    public final void setMetricsData(@NotNull Map<String, Object> map) {
        map.getClass();
        this.metricsData = map;
    }

    public final void setTemplateType(@Nullable String str) {
        this.templateType = str;
    }

    public final void setViewUpdateType(@NotNull String str) {
        str.getClass();
        this.viewUpdateType = str;
    }

    @Nullable
    public abstract RecyclerViewItem toViewItem();

    /* renamed from: isDismissible, reason: from getter */
    public final boolean getIsDismissible() {
        return this.isDismissible;
    }

    public CardModel() {
        this.metricsData = new LinkedHashMap();
        this.contentId = "";
        this.contentProvider = "";
        this.contentType = "";
        this.refreshId = "";
        this.isColdStart = true;
        this.viewUpdateType = "";
        this.lastRouteName = "";
        this.metricsData = new LinkedHashMap();
    }

    public CardModel(@Nullable JSONObject jSONObject, @Nullable List<? extends ViewTypeModel> list) {
        this(jSONObject);
        List<ViewTypeModel> mutableList;
        this.childModels = (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) ? new ArrayList<>() : mutableList;
    }
}
