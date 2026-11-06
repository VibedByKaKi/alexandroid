package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/amazon/comms/calling/domain/model/DisplayInfo;", "", "callerPartyInfo", "Lcom/amazon/comms/calling/domain/model/Party;", "calleePartyInfo", "dropInInfo", "systemTrayInfo", "Lcom/amazon/comms/calling/domain/model/SystemTrayInfo;", "mediaSettingsInfo", "Lcom/amazon/comms/calling/domain/model/MediaSettingsInfo;", "cspInfo", "Lcom/amazon/comms/calling/domain/model/CspInfo;", "<init>", "(Lcom/amazon/comms/calling/domain/model/Party;Lcom/amazon/comms/calling/domain/model/Party;Ljava/lang/Object;Lcom/amazon/comms/calling/domain/model/SystemTrayInfo;Lcom/amazon/comms/calling/domain/model/MediaSettingsInfo;Lcom/amazon/comms/calling/domain/model/CspInfo;)V", "getCallerPartyInfo", "()Lcom/amazon/comms/calling/domain/model/Party;", "getCalleePartyInfo", "getDropInInfo", "()Ljava/lang/Object;", "getSystemTrayInfo", "()Lcom/amazon/comms/calling/domain/model/SystemTrayInfo;", "getMediaSettingsInfo", "()Lcom/amazon/comms/calling/domain/model/MediaSettingsInfo;", "getCspInfo", "()Lcom/amazon/comms/calling/domain/model/CspInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class DisplayInfo {

    @SerializedName("calleePartyInfo")
    @Nullable
    private final Party calleePartyInfo;

    @SerializedName("callerPartyInfo")
    @Nullable
    private final Party callerPartyInfo;

    @SerializedName("cspInfo")
    @Nullable
    private final CspInfo cspInfo;

    @SerializedName("dropInInfo")
    @Nullable
    private final Object dropInInfo;

    @SerializedName("mediaSettingsInfo")
    @Nullable
    private final MediaSettingsInfo mediaSettingsInfo;

    @SerializedName("systemTrayInfo")
    @Nullable
    private final SystemTrayInfo systemTrayInfo;

    public /* synthetic */ DisplayInfo(Party party, Party party2, Object obj, SystemTrayInfo systemTrayInfo, MediaSettingsInfo mediaSettingsInfo, CspInfo cspInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : party, (i & 2) != 0 ? null : party2, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : systemTrayInfo, (i & 16) != 0 ? null : mediaSettingsInfo, (i & 32) != 0 ? null : cspInfo);
    }

    public static /* synthetic */ DisplayInfo copy$default(DisplayInfo displayInfo, Party party, Party party2, Object obj, SystemTrayInfo systemTrayInfo, MediaSettingsInfo mediaSettingsInfo, CspInfo cspInfo, int i, Object obj2) {
        if ((i & 1) != 0) {
            party = displayInfo.callerPartyInfo;
        }
        if ((i & 2) != 0) {
            party2 = displayInfo.calleePartyInfo;
        }
        if ((i & 4) != 0) {
            obj = displayInfo.dropInInfo;
        }
        if ((i & 8) != 0) {
            systemTrayInfo = displayInfo.systemTrayInfo;
        }
        if ((i & 16) != 0) {
            mediaSettingsInfo = displayInfo.mediaSettingsInfo;
        }
        if ((i & 32) != 0) {
            cspInfo = displayInfo.cspInfo;
        }
        MediaSettingsInfo mediaSettingsInfo2 = mediaSettingsInfo;
        CspInfo cspInfo2 = cspInfo;
        return displayInfo.copy(party, party2, obj, systemTrayInfo, mediaSettingsInfo2, cspInfo2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Party getCallerPartyInfo() {
        return this.callerPartyInfo;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Party getCalleePartyInfo() {
        return this.calleePartyInfo;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Object getDropInInfo() {
        return this.dropInInfo;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final SystemTrayInfo getSystemTrayInfo() {
        return this.systemTrayInfo;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final MediaSettingsInfo getMediaSettingsInfo() {
        return this.mediaSettingsInfo;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final CspInfo getCspInfo() {
        return this.cspInfo;
    }

    @NotNull
    public final DisplayInfo copy(@Nullable Party callerPartyInfo, @Nullable Party calleePartyInfo, @Nullable Object dropInInfo, @Nullable SystemTrayInfo systemTrayInfo, @Nullable MediaSettingsInfo mediaSettingsInfo, @Nullable CspInfo cspInfo) {
        return new DisplayInfo(callerPartyInfo, calleePartyInfo, dropInInfo, systemTrayInfo, mediaSettingsInfo, cspInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayInfo)) {
            return false;
        }
        DisplayInfo displayInfo = (DisplayInfo) other;
        return Intrinsics.areEqual(this.callerPartyInfo, displayInfo.callerPartyInfo) && Intrinsics.areEqual(this.calleePartyInfo, displayInfo.calleePartyInfo) && Intrinsics.areEqual(this.dropInInfo, displayInfo.dropInInfo) && Intrinsics.areEqual(this.systemTrayInfo, displayInfo.systemTrayInfo) && Intrinsics.areEqual(this.mediaSettingsInfo, displayInfo.mediaSettingsInfo) && Intrinsics.areEqual(this.cspInfo, displayInfo.cspInfo);
    }

    @Nullable
    public final Party getCalleePartyInfo() {
        return this.calleePartyInfo;
    }

    @Nullable
    public final Party getCallerPartyInfo() {
        return this.callerPartyInfo;
    }

    @Nullable
    public final CspInfo getCspInfo() {
        return this.cspInfo;
    }

    @Nullable
    public final Object getDropInInfo() {
        return this.dropInInfo;
    }

    @Nullable
    public final MediaSettingsInfo getMediaSettingsInfo() {
        return this.mediaSettingsInfo;
    }

    @Nullable
    public final SystemTrayInfo getSystemTrayInfo() {
        return this.systemTrayInfo;
    }

    public int hashCode() {
        Party party = this.callerPartyInfo;
        int hashCode = (party == null ? 0 : party.hashCode()) * 31;
        Party party2 = this.calleePartyInfo;
        int hashCode2 = (hashCode + (party2 == null ? 0 : party2.hashCode())) * 31;
        Object obj = this.dropInInfo;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        SystemTrayInfo systemTrayInfo = this.systemTrayInfo;
        int hashCode4 = (hashCode3 + (systemTrayInfo == null ? 0 : systemTrayInfo.hashCode())) * 31;
        MediaSettingsInfo mediaSettingsInfo = this.mediaSettingsInfo;
        int hashCode5 = (hashCode4 + (mediaSettingsInfo == null ? 0 : mediaSettingsInfo.hashCode())) * 31;
        CspInfo cspInfo = this.cspInfo;
        return hashCode5 + (cspInfo != null ? cspInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DisplayInfo(callerPartyInfo=" + this.callerPartyInfo + ", calleePartyInfo=" + this.calleePartyInfo + ", dropInInfo=" + this.dropInInfo + ", systemTrayInfo=" + this.systemTrayInfo + ", mediaSettingsInfo=" + this.mediaSettingsInfo + ", cspInfo=" + this.cspInfo + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public DisplayInfo(@Nullable Party party, @Nullable Party party2, @Nullable Object obj, @Nullable SystemTrayInfo systemTrayInfo, @Nullable MediaSettingsInfo mediaSettingsInfo, @Nullable CspInfo cspInfo) {
        this.callerPartyInfo = party;
        this.calleePartyInfo = party2;
        this.dropInInfo = obj;
        this.systemTrayInfo = systemTrayInfo;
        this.mediaSettingsInfo = mediaSettingsInfo;
        this.cspInfo = cspInfo;
    }

    public DisplayInfo() {
        this(null, null, null, null, null, null, 63, null);
    }
}
