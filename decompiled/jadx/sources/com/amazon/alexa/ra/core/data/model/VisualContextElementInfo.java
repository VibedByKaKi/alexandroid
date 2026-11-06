package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.CardContext;
import com.amazon.alexa.ra.core.data.fragments.CardContextActions;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.data.utils.OrgJsonArrayAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.clouddrive.cdasdk.aps.account.FeatureState;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00106J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010]\u001a\u00020\nHÆ\u0003J\t\u0010^\u001a\u00020\nHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010b\u001a\u00020 HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010(HÆ\u0003J\u0090\u0002\u0010h\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0002\u0010iJ\u0013\u0010j\u001a\u00020\f2\b\u0010k\u001a\u0004\u0018\u00010lHÖ\u0003J\t\u0010m\u001a\u00020nHÖ\u0001J\t\u0010o\u001a\u00020\nHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\u0016\u0010\u0018\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0016\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00104R\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0018\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00104R\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010R¨\u0006p"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/VisualContextElementInfo;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", CardContext.ACTIONS, "", "Lcom/amazon/alexa/ra/core/data/fragments/CardContextActions;", "apl", "Lcom/google/gson/JsonObject;", "bounds", "Lcom/amazon/alexa/ra/core/data/model/Bounds;", "description", "", FeatureState.DISABLED, "", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", CardContext.ENTITIES, "Lorg/json/JSONArray;", "expandable", "Lcom/amazon/alexa/ra/core/data/model/Expandable;", "focusable", "Lcom/amazon/alexa/ra/core/data/model/Focusable;", "fragment", "Lcom/amazon/alexa/ra/core/data/model/Fragment;", "id", "language", "media", "Lcom/amazon/alexa/ra/core/data/model/Media;", "ordinal", "", "relationships", "Lcom/amazon/alexa/ra/core/data/model/Relationship;", "role", "Lcom/amazon/alexa/ra/core/data/model/Role;", "text", "textFormat", "Lcom/amazon/alexa/ra/core/data/model/TextFormatType;", "scrollable", "Lcom/amazon/alexa/ra/core/data/model/DisplayScrollable;", "url", "value", "Lcom/amazon/alexa/ra/core/data/model/ItemValue;", "<init>", "(Ljava/util/List;Lcom/google/gson/JsonObject;Lcom/amazon/alexa/ra/core/data/model/Bounds;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lorg/json/JSONArray;Lcom/amazon/alexa/ra/core/data/model/Expandable;Lcom/amazon/alexa/ra/core/data/model/Focusable;Lcom/amazon/alexa/ra/core/data/model/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/Media;Ljava/lang/Number;Lcom/amazon/alexa/ra/core/data/model/Relationship;Lcom/amazon/alexa/ra/core/data/model/Role;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/TextFormatType;Lcom/amazon/alexa/ra/core/data/model/DisplayScrollable;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/ItemValue;)V", "getActions", "()Ljava/util/List;", "getApl", "()Lcom/google/gson/JsonObject;", "setApl", "(Lcom/google/gson/JsonObject;)V", "getBounds", "()Lcom/amazon/alexa/ra/core/data/model/Bounds;", "getDescription", "()Ljava/lang/String;", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getElements", "getEntities", "()Lorg/json/JSONArray;", "getExpandable", "()Lcom/amazon/alexa/ra/core/data/model/Expandable;", "getFocusable", "()Lcom/amazon/alexa/ra/core/data/model/Focusable;", "getFragment", "()Lcom/amazon/alexa/ra/core/data/model/Fragment;", "getId", "getLanguage", "getMedia", "()Lcom/amazon/alexa/ra/core/data/model/Media;", "getOrdinal", "()Ljava/lang/Number;", "getRelationships", "()Lcom/amazon/alexa/ra/core/data/model/Relationship;", "getRole", "()Lcom/amazon/alexa/ra/core/data/model/Role;", "getText", "getTextFormat", "()Lcom/amazon/alexa/ra/core/data/model/TextFormatType;", "getScrollable", "()Lcom/amazon/alexa/ra/core/data/model/DisplayScrollable;", "getUrl", "getValue", "()Lcom/amazon/alexa/ra/core/data/model/ItemValue;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/util/List;Lcom/google/gson/JsonObject;Lcom/amazon/alexa/ra/core/data/model/Bounds;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lorg/json/JSONArray;Lcom/amazon/alexa/ra/core/data/model/Expandable;Lcom/amazon/alexa/ra/core/data/model/Focusable;Lcom/amazon/alexa/ra/core/data/model/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/Media;Ljava/lang/Number;Lcom/amazon/alexa/ra/core/data/model/Relationship;Lcom/amazon/alexa/ra/core/data/model/Role;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/TextFormatType;Lcom/amazon/alexa/ra/core/data/model/DisplayScrollable;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/ItemValue;)Lcom/amazon/alexa/ra/core/data/model/VisualContextElementInfo;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class VisualContextElementInfo implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName(CardContext.ACTIONS)
    @Nullable
    private final List<CardContextActions> actions;

    @SerializedName("apl")
    @Nullable
    private JsonObject apl;

    @SerializedName("bounds")
    @Nullable
    private final Bounds bounds;

    @SerializedName("description")
    @Nullable
    private final String description;

    @SerializedName(FeatureState.DISABLED)
    @Nullable
    private final Boolean disabled;

    @SerializedName(AlexaMetricsConstants.MetricsComponents.ELEMENTS)
    @Nullable
    private final List<VisualContextElementInfo> elements;

    @SerializedName(CardContext.ENTITIES)
    @JsonAdapter(OrgJsonArrayAdapter.class)
    @Nullable
    private final JSONArray entities;

    @SerializedName("expandable")
    @Nullable
    private final Expandable expandable;

    @SerializedName("focusable")
    @Nullable
    private final Focusable focusable;

    @SerializedName("fragment")
    @Nullable
    private final Fragment fragment;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("language")
    @NotNull
    private final String language;

    @SerializedName("media")
    @Nullable
    private final Media media;

    @SerializedName("ordinal")
    @Nullable
    private final Number ordinal;

    @SerializedName("relationships")
    @Nullable
    private final Relationship relationships;

    @SerializedName("role")
    @NotNull
    private final Role role;

    @SerializedName("scrollable")
    @Nullable
    private final DisplayScrollable scrollable;

    @SerializedName("text")
    @Nullable
    private final String text;

    @SerializedName("textFormat")
    @Nullable
    private final TextFormatType textFormat;

    @SerializedName("url")
    @Nullable
    private final String url;

    @SerializedName("value")
    @Nullable
    private final ItemValue value;

    public /* synthetic */ VisualContextElementInfo(List list, JsonObject jsonObject, Bounds bounds, String str, Boolean bool, List list2, JSONArray jSONArray, Expandable expandable, Focusable focusable, Fragment fragment, String str2, String str3, Media media, Number number, Relationship relationship, Role role, String str4, TextFormatType textFormatType, DisplayScrollable displayScrollable, String str5, ItemValue itemValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : jsonObject, bounds, (i & 8) != 0 ? null : str, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : jSONArray, (i & 128) != 0 ? null : expandable, (i & 256) != 0 ? null : focusable, (i & 512) != 0 ? null : fragment, str2, (i & 2048) != 0 ? "en" : str3, (i & 4096) != 0 ? null : media, (i & 8192) != 0 ? null : number, (i & 16384) != 0 ? null : relationship, (32768 & i) != 0 ? Role.NONE : role, (65536 & i) != 0 ? null : str4, (131072 & i) != 0 ? null : textFormatType, (262144 & i) != 0 ? null : displayScrollable, (524288 & i) != 0 ? null : str5, (i & 1048576) != 0 ? null : itemValue);
    }

    public static /* synthetic */ VisualContextElementInfo copy$default(VisualContextElementInfo visualContextElementInfo, List list, JsonObject jsonObject, Bounds bounds, String str, Boolean bool, List list2, JSONArray jSONArray, Expandable expandable, Focusable focusable, Fragment fragment, String str2, String str3, Media media, Number number, Relationship relationship, Role role, String str4, TextFormatType textFormatType, DisplayScrollable displayScrollable, String str5, ItemValue itemValue, int i, Object obj) {
        ItemValue itemValue2;
        String str6;
        List list3 = (i & 1) != 0 ? visualContextElementInfo.actions : list;
        JsonObject jsonObject2 = (i & 2) != 0 ? visualContextElementInfo.apl : jsonObject;
        Bounds bounds2 = (i & 4) != 0 ? visualContextElementInfo.bounds : bounds;
        String str7 = (i & 8) != 0 ? visualContextElementInfo.description : str;
        Boolean bool2 = (i & 16) != 0 ? visualContextElementInfo.disabled : bool;
        List list4 = (i & 32) != 0 ? visualContextElementInfo.elements : list2;
        JSONArray jSONArray2 = (i & 64) != 0 ? visualContextElementInfo.entities : jSONArray;
        Expandable expandable2 = (i & 128) != 0 ? visualContextElementInfo.expandable : expandable;
        Focusable focusable2 = (i & 256) != 0 ? visualContextElementInfo.focusable : focusable;
        Fragment fragment2 = (i & 512) != 0 ? visualContextElementInfo.fragment : fragment;
        String str8 = (i & 1024) != 0 ? visualContextElementInfo.id : str2;
        String str9 = (i & 2048) != 0 ? visualContextElementInfo.language : str3;
        Media media2 = (i & 4096) != 0 ? visualContextElementInfo.media : media;
        Number number2 = (i & 8192) != 0 ? visualContextElementInfo.ordinal : number;
        List list5 = list3;
        Relationship relationship2 = (i & 16384) != 0 ? visualContextElementInfo.relationships : relationship;
        Role role2 = (i & 32768) != 0 ? visualContextElementInfo.role : role;
        String str10 = (i & 65536) != 0 ? visualContextElementInfo.text : str4;
        TextFormatType textFormatType2 = (i & 131072) != 0 ? visualContextElementInfo.textFormat : textFormatType;
        DisplayScrollable displayScrollable2 = (i & 262144) != 0 ? visualContextElementInfo.scrollable : displayScrollable;
        String str11 = (i & 524288) != 0 ? visualContextElementInfo.url : str5;
        if ((i & 1048576) != 0) {
            str6 = str11;
            itemValue2 = visualContextElementInfo.value;
        } else {
            itemValue2 = itemValue;
            str6 = str11;
        }
        return visualContextElementInfo.copy(list5, jsonObject2, bounds2, str7, bool2, list4, jSONArray2, expandable2, focusable2, fragment2, str8, str9, media2, number2, relationship2, role2, str10, textFormatType2, displayScrollable2, str6, itemValue2);
    }

    @Nullable
    public final List<CardContextActions> component1() {
        return this.actions;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Media getMedia() {
        return this.media;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Number getOrdinal() {
        return this.ordinal;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Relationship getRelationships() {
        return this.relationships;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final Role getRole() {
        return this.role;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final TextFormatType getTextFormat() {
        return this.textFormat;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final DisplayScrollable getScrollable() {
        return this.scrollable;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final JsonObject getApl() {
        return this.apl;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final ItemValue getValue() {
        return this.value;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Bounds getBounds() {
        return this.bounds;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @Nullable
    public final List<VisualContextElementInfo> component6() {
        return this.elements;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final JSONArray getEntities() {
        return this.entities;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Expandable getExpandable() {
        return this.expandable;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Focusable getFocusable() {
        return this.focusable;
    }

    @NotNull
    public final VisualContextElementInfo copy(@Nullable List<CardContextActions> actions, @Nullable JsonObject apl, @Nullable Bounds bounds, @Nullable String description, @Nullable Boolean disabled, @Nullable List<VisualContextElementInfo> elements, @Nullable JSONArray entities, @Nullable Expandable expandable, @Nullable Focusable focusable, @Nullable Fragment fragment, @NotNull String id, @NotNull String language, @Nullable Media media, @Nullable Number ordinal, @Nullable Relationship relationships, @NotNull Role role, @Nullable String text, @Nullable TextFormatType textFormat, @Nullable DisplayScrollable scrollable, @Nullable String url, @Nullable ItemValue value) {
        id.getClass();
        language.getClass();
        role.getClass();
        return new VisualContextElementInfo(actions, apl, bounds, description, disabled, elements, entities, expandable, focusable, fragment, id, language, media, ordinal, relationships, role, text, textFormat, scrollable, url, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualContextElementInfo)) {
            return false;
        }
        VisualContextElementInfo visualContextElementInfo = (VisualContextElementInfo) other;
        return Intrinsics.areEqual(this.actions, visualContextElementInfo.actions) && Intrinsics.areEqual(this.apl, visualContextElementInfo.apl) && Intrinsics.areEqual(this.bounds, visualContextElementInfo.bounds) && Intrinsics.areEqual(this.description, visualContextElementInfo.description) && Intrinsics.areEqual(this.disabled, visualContextElementInfo.disabled) && Intrinsics.areEqual(this.elements, visualContextElementInfo.elements) && Intrinsics.areEqual(this.entities, visualContextElementInfo.entities) && Intrinsics.areEqual(this.expandable, visualContextElementInfo.expandable) && Intrinsics.areEqual(this.focusable, visualContextElementInfo.focusable) && Intrinsics.areEqual(this.fragment, visualContextElementInfo.fragment) && Intrinsics.areEqual(this.id, visualContextElementInfo.id) && Intrinsics.areEqual(this.language, visualContextElementInfo.language) && Intrinsics.areEqual(this.media, visualContextElementInfo.media) && Intrinsics.areEqual(this.ordinal, visualContextElementInfo.ordinal) && Intrinsics.areEqual(this.relationships, visualContextElementInfo.relationships) && this.role == visualContextElementInfo.role && Intrinsics.areEqual(this.text, visualContextElementInfo.text) && this.textFormat == visualContextElementInfo.textFormat && Intrinsics.areEqual(this.scrollable, visualContextElementInfo.scrollable) && Intrinsics.areEqual(this.url, visualContextElementInfo.url) && Intrinsics.areEqual(this.value, visualContextElementInfo.value);
    }

    @Nullable
    public final List<CardContextActions> getActions() {
        return this.actions;
    }

    @Nullable
    public final JsonObject getApl() {
        return this.apl;
    }

    @Nullable
    public final Bounds getBounds() {
        return this.bounds;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @Nullable
    public final List<VisualContextElementInfo> getElements() {
        return this.elements;
    }

    @Nullable
    public final JSONArray getEntities() {
        return this.entities;
    }

    @Nullable
    public final Expandable getExpandable() {
        return this.expandable;
    }

    @Nullable
    public final Focusable getFocusable() {
        return this.focusable;
    }

    @Nullable
    public final Fragment getFragment() {
        return this.fragment;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final Media getMedia() {
        return this.media;
    }

    @Nullable
    public final Number getOrdinal() {
        return this.ordinal;
    }

    @Nullable
    public final Relationship getRelationships() {
        return this.relationships;
    }

    @NotNull
    public final Role getRole() {
        return this.role;
    }

    @Nullable
    public final DisplayScrollable getScrollable() {
        return this.scrollable;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final TextFormatType getTextFormat() {
        return this.textFormat;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final ItemValue getValue() {
        return this.value;
    }

    public int hashCode() {
        List<CardContextActions> list = this.actions;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        JsonObject jsonObject = this.apl;
        int hashCode2 = (hashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        Bounds bounds = this.bounds;
        int hashCode3 = (hashCode2 + (bounds == null ? 0 : bounds.hashCode())) * 31;
        String str = this.description;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disabled;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<VisualContextElementInfo> list2 = this.elements;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        JSONArray jSONArray = this.entities;
        int hashCode7 = (hashCode6 + (jSONArray == null ? 0 : jSONArray.hashCode())) * 31;
        Expandable expandable = this.expandable;
        int hashCode8 = (hashCode7 + (expandable == null ? 0 : expandable.hashCode())) * 31;
        Focusable focusable = this.focusable;
        int hashCode9 = (hashCode8 + (focusable == null ? 0 : focusable.hashCode())) * 31;
        Fragment fragment = this.fragment;
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((hashCode9 + (fragment == null ? 0 : fragment.hashCode())) * 31, 31, this.id), 31, this.language);
        Media media = this.media;
        int hashCode10 = (m + (media == null ? 0 : media.hashCode())) * 31;
        Number number = this.ordinal;
        int hashCode11 = (hashCode10 + (number == null ? 0 : number.hashCode())) * 31;
        Relationship relationship = this.relationships;
        int hashCode12 = (this.role.hashCode() + ((hashCode11 + (relationship == null ? 0 : relationship.hashCode())) * 31)) * 31;
        String str2 = this.text;
        int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextFormatType textFormatType = this.textFormat;
        int hashCode14 = (hashCode13 + (textFormatType == null ? 0 : textFormatType.hashCode())) * 31;
        DisplayScrollable displayScrollable = this.scrollable;
        int hashCode15 = (hashCode14 + (displayScrollable == null ? 0 : displayScrollable.hashCode())) * 31;
        String str3 = this.url;
        int hashCode16 = (hashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ItemValue itemValue = this.value;
        return hashCode16 + (itemValue != null ? itemValue.hashCode() : 0);
    }

    public final void setApl(@Nullable JsonObject jsonObject) {
        this.apl = jsonObject;
    }

    @NotNull
    public String toString() {
        List<CardContextActions> list = this.actions;
        JsonObject jsonObject = this.apl;
        Bounds bounds = this.bounds;
        String str = this.description;
        Boolean bool = this.disabled;
        List<VisualContextElementInfo> list2 = this.elements;
        JSONArray jSONArray = this.entities;
        Expandable expandable = this.expandable;
        Focusable focusable = this.focusable;
        Fragment fragment = this.fragment;
        String str2 = this.id;
        String str3 = this.language;
        Media media = this.media;
        Number number = this.ordinal;
        Relationship relationship = this.relationships;
        Role role = this.role;
        String str4 = this.text;
        TextFormatType textFormatType = this.textFormat;
        DisplayScrollable displayScrollable = this.scrollable;
        String str5 = this.url;
        ItemValue itemValue = this.value;
        StringBuilder sb = new StringBuilder("VisualContextElementInfo(actions=");
        sb.append(list);
        sb.append(", apl=");
        sb.append(jsonObject);
        sb.append(", bounds=");
        sb.append(bounds);
        sb.append(", description=");
        sb.append(str);
        sb.append(", disabled=");
        sb.append(bool);
        sb.append(", elements=");
        sb.append(list2);
        sb.append(", entities=");
        sb.append(jSONArray);
        sb.append(", expandable=");
        sb.append(expandable);
        sb.append(", focusable=");
        sb.append(focusable);
        sb.append(", fragment=");
        sb.append(fragment);
        sb.append(", id=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str2, ", language=", str3, ", media=");
        sb.append(media);
        sb.append(", ordinal=");
        sb.append(number);
        sb.append(", relationships=");
        sb.append(relationship);
        sb.append(", role=");
        sb.append(role);
        sb.append(", text=");
        sb.append(str4);
        sb.append(", textFormat=");
        sb.append(textFormatType);
        sb.append(", scrollable=");
        sb.append(displayScrollable);
        sb.append(", url=");
        sb.append(str5);
        sb.append(", value=");
        sb.append(itemValue);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    public VisualContextElementInfo(@Nullable List<CardContextActions> list, @Nullable JsonObject jsonObject, @Nullable Bounds bounds, @Nullable String str, @Nullable Boolean bool, @Nullable List<VisualContextElementInfo> list2, @Nullable JSONArray jSONArray, @Nullable Expandable expandable, @Nullable Focusable focusable, @Nullable Fragment fragment, @NotNull String str2, @NotNull String str3, @Nullable Media media, @Nullable Number number, @Nullable Relationship relationship, @NotNull Role role, @Nullable String str4, @Nullable TextFormatType textFormatType, @Nullable DisplayScrollable displayScrollable, @Nullable String str5, @Nullable ItemValue itemValue) {
        str2.getClass();
        str3.getClass();
        role.getClass();
        this.actions = list;
        this.apl = jsonObject;
        this.bounds = bounds;
        this.description = str;
        this.disabled = bool;
        this.elements = list2;
        this.entities = jSONArray;
        this.expandable = expandable;
        this.focusable = focusable;
        this.fragment = fragment;
        this.id = str2;
        this.language = str3;
        this.media = media;
        this.ordinal = number;
        this.relationships = relationship;
        this.role = role;
        this.text = str4;
        this.textFormat = textFormatType;
        this.scrollable = displayScrollable;
        this.url = str5;
        this.value = itemValue;
    }
}
