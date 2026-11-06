package com.amazon.comms.calling.domain.usecase;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/EndCallUseCaseParams;", "", "callId", "", "shouldEndForThisDeviceOnly", "", "<init>", "(Ljava/lang/String;Z)V", "getCallId", "()Ljava/lang/String;", "getShouldEndForThisDeviceOnly", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class EndCallUseCaseParams {

    @Nullable
    private final String callId;
    private final boolean shouldEndForThisDeviceOnly;

    public /* synthetic */ EndCallUseCaseParams(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ EndCallUseCaseParams copy$default(EndCallUseCaseParams endCallUseCaseParams, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endCallUseCaseParams.callId;
        }
        if ((i & 2) != 0) {
            z = endCallUseCaseParams.shouldEndForThisDeviceOnly;
        }
        return endCallUseCaseParams.copy(str, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldEndForThisDeviceOnly() {
        return this.shouldEndForThisDeviceOnly;
    }

    @NotNull
    public final EndCallUseCaseParams copy(@Nullable String callId, boolean shouldEndForThisDeviceOnly) {
        return new EndCallUseCaseParams(callId, shouldEndForThisDeviceOnly);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndCallUseCaseParams)) {
            return false;
        }
        EndCallUseCaseParams endCallUseCaseParams = (EndCallUseCaseParams) other;
        return Intrinsics.areEqual(this.callId, endCallUseCaseParams.callId) && this.shouldEndForThisDeviceOnly == endCallUseCaseParams.shouldEndForThisDeviceOnly;
    }

    @Nullable
    public final String getCallId() {
        return this.callId;
    }

    public final boolean getShouldEndForThisDeviceOnly() {
        return this.shouldEndForThisDeviceOnly;
    }

    public int hashCode() {
        String str = this.callId;
        return Boolean.hashCode(this.shouldEndForThisDeviceOnly) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("EndCallUseCaseParams(callId=", this.callId, ", shouldEndForThisDeviceOnly=", this.shouldEndForThisDeviceOnly, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public EndCallUseCaseParams(@Nullable String str, boolean z) {
        this.callId = str;
        this.shouldEndForThisDeviceOnly = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EndCallUseCaseParams() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
