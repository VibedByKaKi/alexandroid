package com.amazon.alexa.capabilityagent.cardstudiosurface.config;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003JY\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/capabilityagent/cardstudiosurface/config/SupportedSurface;", "", "surface", "", "supportedRenderTypes", "", "supportedCardTypes", "supportedOperations", "supportedDeviceCardProviders", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSurface", "()Ljava/lang/String;", "getSupportedRenderTypes", "()Ljava/util/List;", "getSupportedCardTypes", "getSupportedOperations", "getSupportedDeviceCardProviders", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SupportedSurface {
    public static final int $stable = 8;

    @SerializedName("supportedCardTypes")
    @Nullable
    private final List<String> supportedCardTypes;

    @SerializedName("supportedDeviceCardProviders")
    @Nullable
    private final List<String> supportedDeviceCardProviders;

    @SerializedName("supportedOperations")
    @Nullable
    private final List<String> supportedOperations;

    @SerializedName("supportedRenderTypes")
    @NotNull
    private final List<String> supportedRenderTypes;

    @SerializedName("surface")
    @NotNull
    private final String surface;

    public SupportedSurface(@NotNull String str, @NotNull List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4) {
        str.getClass();
        list.getClass();
        this.surface = str;
        this.supportedRenderTypes = list;
        this.supportedCardTypes = list2;
        this.supportedOperations = list3;
        this.supportedDeviceCardProviders = list4;
    }

    public static /* synthetic */ SupportedSurface copy$default(SupportedSurface supportedSurface, String str, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportedSurface.surface;
        }
        if ((i & 2) != 0) {
            list = supportedSurface.supportedRenderTypes;
        }
        if ((i & 4) != 0) {
            list2 = supportedSurface.supportedCardTypes;
        }
        if ((i & 8) != 0) {
            list3 = supportedSurface.supportedOperations;
        }
        if ((i & 16) != 0) {
            list4 = supportedSurface.supportedDeviceCardProviders;
        }
        List list5 = list4;
        List list6 = list2;
        return supportedSurface.copy(str, list, list6, list3, list5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    @NotNull
    public final List<String> component2() {
        return this.supportedRenderTypes;
    }

    @Nullable
    public final List<String> component3() {
        return this.supportedCardTypes;
    }

    @Nullable
    public final List<String> component4() {
        return this.supportedOperations;
    }

    @Nullable
    public final List<String> component5() {
        return this.supportedDeviceCardProviders;
    }

    @NotNull
    public final SupportedSurface copy(@NotNull String surface, @NotNull List<String> supportedRenderTypes, @Nullable List<String> supportedCardTypes, @Nullable List<String> supportedOperations, @Nullable List<String> supportedDeviceCardProviders) {
        surface.getClass();
        supportedRenderTypes.getClass();
        return new SupportedSurface(surface, supportedRenderTypes, supportedCardTypes, supportedOperations, supportedDeviceCardProviders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedSurface)) {
            return false;
        }
        SupportedSurface supportedSurface = (SupportedSurface) other;
        return Intrinsics.areEqual(this.surface, supportedSurface.surface) && Intrinsics.areEqual(this.supportedRenderTypes, supportedSurface.supportedRenderTypes) && Intrinsics.areEqual(this.supportedCardTypes, supportedSurface.supportedCardTypes) && Intrinsics.areEqual(this.supportedOperations, supportedSurface.supportedOperations) && Intrinsics.areEqual(this.supportedDeviceCardProviders, supportedSurface.supportedDeviceCardProviders);
    }

    @Nullable
    public final List<String> getSupportedCardTypes() {
        return this.supportedCardTypes;
    }

    @Nullable
    public final List<String> getSupportedDeviceCardProviders() {
        return this.supportedDeviceCardProviders;
    }

    @Nullable
    public final List<String> getSupportedOperations() {
        return this.supportedOperations;
    }

    @NotNull
    public final List<String> getSupportedRenderTypes() {
        return this.supportedRenderTypes;
    }

    @NotNull
    public final String getSurface() {
        return this.surface;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.supportedRenderTypes, this.surface.hashCode() * 31, 31);
        List<String> list = this.supportedCardTypes;
        int hashCode = (m + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.supportedOperations;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.supportedDeviceCardProviders;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.surface;
        List<String> list = this.supportedRenderTypes;
        List<String> list2 = this.supportedCardTypes;
        List<String> list3 = this.supportedOperations;
        List<String> list4 = this.supportedDeviceCardProviders;
        StringBuilder m14724m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("SupportedSurface(surface=", str, ", supportedRenderTypes=", (List) list, ", supportedCardTypes=");
        m14724m.append(list2);
        m14724m.append(", supportedOperations=");
        m14724m.append(list3);
        m14724m.append(", supportedDeviceCardProviders=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list4, m14724m);
    }

    public /* synthetic */ SupportedSurface(String str, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4);
    }
}
