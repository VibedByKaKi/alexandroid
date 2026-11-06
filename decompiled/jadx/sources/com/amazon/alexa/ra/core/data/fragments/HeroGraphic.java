package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#Bc\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001d\u0010\u001b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b\u0018\u00010\u0003HÆ\u0003Jg\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R%\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006$"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/HeroGraphic;", "", "source", "", "Lcom/amazon/alexa/ra/core/data/fragments/ImageData;", "altText", "", "attribution", "style", "icon", "headers", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSource", "()Ljava/util/List;", "getAltText", "()Ljava/lang/String;", "getAttribution", "getStyle", "getIcon", "getHeaders", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class HeroGraphic {

    @NotNull
    public static final String ALT_TEXT = "altText";

    @NotNull
    public static final String ATTRIBUTION = "attribution";

    @NotNull
    public static final String HEADERS = "headers";

    @NotNull
    public static final String ICON = "icon";

    @NotNull
    public static final String SOURCE = "source";

    @NotNull
    public static final String STYLE = "style";

    @Nullable
    private final String altText;

    @Nullable
    private final String attribution;

    @Nullable
    private final List<Map<String, String>> headers;

    @Nullable
    private final String icon;

    @NotNull
    private final List<ImageData> source;

    @Nullable
    private final String style;
    public static final int $stable = 8;

    public /* synthetic */ HeroGraphic(List list, String str, String str2, String str3, String str4, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list2);
    }

    public static /* synthetic */ HeroGraphic copy$default(HeroGraphic heroGraphic, List list, String str, String str2, String str3, String str4, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = heroGraphic.source;
        }
        if ((i & 2) != 0) {
            str = heroGraphic.altText;
        }
        if ((i & 4) != 0) {
            str2 = heroGraphic.attribution;
        }
        if ((i & 8) != 0) {
            str3 = heroGraphic.style;
        }
        if ((i & 16) != 0) {
            str4 = heroGraphic.icon;
        }
        if ((i & 32) != 0) {
            list2 = heroGraphic.headers;
        }
        String str5 = str4;
        List list3 = list2;
        return heroGraphic.copy(list, str, str2, str3, str5, list3);
    }

    @NotNull
    public final List<ImageData> component1() {
        return this.source;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAttribution() {
        return this.attribution;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final List<Map<String, String>> component6() {
        return this.headers;
    }

    @NotNull
    public final HeroGraphic copy(@NotNull List<ImageData> source, @Nullable String altText, @Nullable String attribution, @Nullable String style, @Nullable String icon, @Nullable List<? extends Map<String, String>> headers) {
        source.getClass();
        return new HeroGraphic(source, altText, attribution, style, icon, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeroGraphic)) {
            return false;
        }
        HeroGraphic heroGraphic = (HeroGraphic) other;
        return Intrinsics.areEqual(this.source, heroGraphic.source) && Intrinsics.areEqual(this.altText, heroGraphic.altText) && Intrinsics.areEqual(this.attribution, heroGraphic.attribution) && Intrinsics.areEqual(this.style, heroGraphic.style) && Intrinsics.areEqual(this.icon, heroGraphic.icon) && Intrinsics.areEqual(this.headers, heroGraphic.headers);
    }

    @Nullable
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    public final String getAttribution() {
        return this.attribution;
    }

    @Nullable
    public final List<Map<String, String>> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<ImageData> getSource() {
        return this.source;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        String str = this.altText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.attribution;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Map<String, String>> list = this.headers;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ImageData> list = this.source;
        String str = this.altText;
        String str2 = this.attribution;
        String str3 = this.style;
        String str4 = this.icon;
        List<Map<String, String>> list2 = this.headers;
        StringBuilder sb = new StringBuilder("HeroGraphic(source=");
        sb.append(list);
        sb.append(", altText=");
        sb.append(str);
        sb.append(", attribution=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str2, ", style=", str3, ", icon=");
        sb.append(str4);
        sb.append(", headers=");
        sb.append(list2);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeroGraphic(@NotNull List<ImageData> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<? extends Map<String, String>> list2) {
        list.getClass();
        this.source = list;
        this.altText = str;
        this.attribution = str2;
        this.style = str3;
        this.icon = str4;
        this.headers = list2;
    }
}
