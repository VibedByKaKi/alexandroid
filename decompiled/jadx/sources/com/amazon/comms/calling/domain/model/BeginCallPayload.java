package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J+\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0011HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013¨\u0006!"}, d2 = {"Lcom/amazon/comms/calling/domain/model/BeginCallPayload;", "", "sipCommand", "Lcom/amazon/comms/calling/domain/model/SipCommand;", "displayInfo", "Lcom/amazon/comms/calling/domain/model/DisplayInfo;", "shouldDowngradeToAudioOnly", "", "<init>", "(Lcom/amazon/comms/calling/domain/model/SipCommand;Lcom/amazon/comms/calling/domain/model/DisplayInfo;Z)V", "getSipCommand", "()Lcom/amazon/comms/calling/domain/model/SipCommand;", "getDisplayInfo", "()Lcom/amazon/comms/calling/domain/model/DisplayInfo;", "getShouldDowngradeToAudioOnly", "()Z", "cspId", "", "getCspId", "()Ljava/lang/String;", "callProvider", "getCallProvider", "callId", "getCallId", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class BeginCallPayload {

    @SerializedName("displayInfo")
    @Nullable
    private final DisplayInfo displayInfo;

    @SerializedName("shouldDowngradeToAudioOnly")
    private final boolean shouldDowngradeToAudioOnly;

    @SerializedName("sipCommand")
    @Nullable
    private final SipCommand sipCommand;

    public /* synthetic */ BeginCallPayload(SipCommand sipCommand, DisplayInfo displayInfo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sipCommand, (i & 2) != 0 ? null : displayInfo, (i & 4) != 0 ? false : z);
    }

    public static /* synthetic */ BeginCallPayload copy$default(BeginCallPayload beginCallPayload, SipCommand sipCommand, DisplayInfo displayInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            sipCommand = beginCallPayload.sipCommand;
        }
        if ((i & 2) != 0) {
            displayInfo = beginCallPayload.displayInfo;
        }
        if ((i & 4) != 0) {
            z = beginCallPayload.shouldDowngradeToAudioOnly;
        }
        return beginCallPayload.copy(sipCommand, displayInfo, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final SipCommand getSipCommand() {
        return this.sipCommand;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldDowngradeToAudioOnly() {
        return this.shouldDowngradeToAudioOnly;
    }

    @NotNull
    public final BeginCallPayload copy(@Nullable SipCommand sipCommand, @Nullable DisplayInfo displayInfo, boolean shouldDowngradeToAudioOnly) {
        return new BeginCallPayload(sipCommand, displayInfo, shouldDowngradeToAudioOnly);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeginCallPayload)) {
            return false;
        }
        BeginCallPayload beginCallPayload = (BeginCallPayload) other;
        return Intrinsics.areEqual(this.sipCommand, beginCallPayload.sipCommand) && Intrinsics.areEqual(this.displayInfo, beginCallPayload.displayInfo) && this.shouldDowngradeToAudioOnly == beginCallPayload.shouldDowngradeToAudioOnly;
    }

    @Nullable
    public final String getCallId() {
        SipPayload payload;
        SipCommand sipCommand = this.sipCommand;
        if (sipCommand == null || (payload = sipCommand.getPayload()) == null) {
            return null;
        }
        return payload.getCallId();
    }

    @Nullable
    public final String getCallProvider() {
        SipPayload payload;
        SipCommand sipCommand = this.sipCommand;
        if (sipCommand == null || (payload = sipCommand.getPayload()) == null) {
            return null;
        }
        return payload.getCallProvider();
    }

    @Nullable
    public final String getCspId() {
        DisplayInfo displayInfo = this.displayInfo;
        return (displayInfo == null || displayInfo.getCspInfo() == null) ? "" : this.displayInfo.getCspInfo().getCspId();
    }

    @Nullable
    public final DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    public final boolean getShouldDowngradeToAudioOnly() {
        return this.shouldDowngradeToAudioOnly;
    }

    @Nullable
    public final SipCommand getSipCommand() {
        return this.sipCommand;
    }

    public int hashCode() {
        SipCommand sipCommand = this.sipCommand;
        int hashCode = (sipCommand == null ? 0 : sipCommand.hashCode()) * 31;
        DisplayInfo displayInfo = this.displayInfo;
        return Boolean.hashCode(this.shouldDowngradeToAudioOnly) + ((hashCode + (displayInfo != null ? displayInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        SipCommand sipCommand = this.sipCommand;
        DisplayInfo displayInfo = this.displayInfo;
        boolean z = this.shouldDowngradeToAudioOnly;
        StringBuilder sb = new StringBuilder("BeginCallPayload(sipCommand=");
        sb.append(sipCommand);
        sb.append(", displayInfo=");
        sb.append(displayInfo);
        sb.append(", shouldDowngradeToAudioOnly=");
        return a$$ExternalSyntheticOutline0.m(sb, z, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public BeginCallPayload(@Nullable SipCommand sipCommand, @Nullable DisplayInfo displayInfo, boolean z) {
        this.sipCommand = sipCommand;
        this.displayInfo = displayInfo;
        this.shouldDowngradeToAudioOnly = z;
    }

    public BeginCallPayload() {
        this(null, null, false, 7, null);
    }
}
