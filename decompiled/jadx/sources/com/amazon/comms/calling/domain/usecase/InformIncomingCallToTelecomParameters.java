package com.amazon.comms.calling.domain.usecase;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/InformIncomingCallToTelecomParameters;", "", "callerName", "", "isVideoCall", "", "<init>", "(Ljava/lang/String;Z)V", "getCallerName", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class InformIncomingCallToTelecomParameters {

    @NotNull
    private final String callerName;
    private final boolean isVideoCall;

    public InformIncomingCallToTelecomParameters(@NotNull String str, boolean z) {
        str.getClass();
        this.callerName = str;
        this.isVideoCall = z;
    }

    public static /* synthetic */ InformIncomingCallToTelecomParameters copy$default(InformIncomingCallToTelecomParameters informIncomingCallToTelecomParameters, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = informIncomingCallToTelecomParameters.callerName;
        }
        if ((i & 2) != 0) {
            z = informIncomingCallToTelecomParameters.isVideoCall;
        }
        return informIncomingCallToTelecomParameters.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCallerName() {
        return this.callerName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVideoCall() {
        return this.isVideoCall;
    }

    @NotNull
    public final InformIncomingCallToTelecomParameters copy(@NotNull String callerName, boolean isVideoCall) {
        callerName.getClass();
        return new InformIncomingCallToTelecomParameters(callerName, isVideoCall);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InformIncomingCallToTelecomParameters)) {
            return false;
        }
        InformIncomingCallToTelecomParameters informIncomingCallToTelecomParameters = (InformIncomingCallToTelecomParameters) other;
        return Intrinsics.areEqual(this.callerName, informIncomingCallToTelecomParameters.callerName) && this.isVideoCall == informIncomingCallToTelecomParameters.isVideoCall;
    }

    @NotNull
    public final String getCallerName() {
        return this.callerName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVideoCall) + (this.callerName.hashCode() * 31);
    }

    public final boolean isVideoCall() {
        return this.isVideoCall;
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("InformIncomingCallToTelecomParameters(callerName=", this.callerName, ", isVideoCall=", this.isVideoCall, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
