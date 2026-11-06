package com.amazon.comms.calling.domain.model.dataChannel.sepia;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.dataChannel.SepiaParameter;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014¨\u0006 "}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaData;", "", "effectsSessionId", "", "sepiaIcons", "", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaIcon;", "targets", "parameters", "Lcom/amazon/comms/calling/domain/model/dataChannel/SepiaParameter;", "isApplied", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getEffectsSessionId", "()Ljava/lang/String;", "getSepiaIcons", "()Ljava/util/List;", "getTargets", "getParameters", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class SepiaData {

    @SerializedName("effectsSessionId")
    @NotNull
    private final String effectsSessionId;

    @SerializedName("isApplied")
    private final boolean isApplied;

    @SerializedName("parameters")
    @Nullable
    private final List<SepiaParameter> parameters;

    @SerializedName("sepiaIcons")
    @Nullable
    private final List<SepiaIcon> sepiaIcons;

    @SerializedName("targets")
    @Nullable
    private final List<String> targets;

    public SepiaData(@NotNull String str, @Nullable List<SepiaIcon> list, @Nullable List<String> list2, @Nullable List<SepiaParameter> list3, boolean z) {
        str.getClass();
        this.effectsSessionId = str;
        this.sepiaIcons = list;
        this.targets = list2;
        this.parameters = list3;
        this.isApplied = z;
    }

    public static /* synthetic */ SepiaData copy$default(SepiaData sepiaData, String str, List list, List list2, List list3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sepiaData.effectsSessionId;
        }
        if ((i & 2) != 0) {
            list = sepiaData.sepiaIcons;
        }
        if ((i & 4) != 0) {
            list2 = sepiaData.targets;
        }
        if ((i & 8) != 0) {
            list3 = sepiaData.parameters;
        }
        if ((i & 16) != 0) {
            z = sepiaData.isApplied;
        }
        boolean z2 = z;
        List list4 = list2;
        return sepiaData.copy(str, list, list4, list3, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    @Nullable
    public final List<SepiaIcon> component2() {
        return this.sepiaIcons;
    }

    @Nullable
    public final List<String> component3() {
        return this.targets;
    }

    @Nullable
    public final List<SepiaParameter> component4() {
        return this.parameters;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsApplied() {
        return this.isApplied;
    }

    @NotNull
    public final SepiaData copy(@NotNull String effectsSessionId, @Nullable List<SepiaIcon> sepiaIcons, @Nullable List<String> targets, @Nullable List<SepiaParameter> parameters, boolean isApplied) {
        effectsSessionId.getClass();
        return new SepiaData(effectsSessionId, sepiaIcons, targets, parameters, isApplied);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SepiaData)) {
            return false;
        }
        SepiaData sepiaData = (SepiaData) other;
        return Intrinsics.areEqual(this.effectsSessionId, sepiaData.effectsSessionId) && Intrinsics.areEqual(this.sepiaIcons, sepiaData.sepiaIcons) && Intrinsics.areEqual(this.targets, sepiaData.targets) && Intrinsics.areEqual(this.parameters, sepiaData.parameters) && this.isApplied == sepiaData.isApplied;
    }

    @NotNull
    public final String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    @Nullable
    public final List<SepiaParameter> getParameters() {
        return this.parameters;
    }

    @Nullable
    public final List<SepiaIcon> getSepiaIcons() {
        return this.sepiaIcons;
    }

    @Nullable
    public final List<String> getTargets() {
        return this.targets;
    }

    public int hashCode() {
        int hashCode = this.effectsSessionId.hashCode() * 31;
        List<SepiaIcon> list = this.sepiaIcons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.targets;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SepiaParameter> list3 = this.parameters;
        return Boolean.hashCode(this.isApplied) + ((hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    public final boolean isApplied() {
        return this.isApplied;
    }

    @NotNull
    public String toString() {
        String str = this.effectsSessionId;
        List<SepiaIcon> list = this.sepiaIcons;
        List<String> list2 = this.targets;
        List<SepiaParameter> list3 = this.parameters;
        boolean z = this.isApplied;
        StringBuilder m14724m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("SepiaData(effectsSessionId=", str, ", sepiaIcons=", (List) list, ", targets=");
        m14724m.append(list2);
        m14724m.append(", parameters=");
        m14724m.append(list3);
        m14724m.append(", isApplied=");
        return a$$ExternalSyntheticOutline0.m(m14724m, z, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ SepiaData(String str, List list, List list2, List list3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, z);
    }
}
