package com.amazon.comms.calling.domain.usecase;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.SipRegistrationReason;
import com.amazon.comms.calling.presentation.ui.OptInFragment;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/RegisterSipParams;", "", "sipRegistrationReason", "Lcom/amazon/comms/calling/domain/model/SipRegistrationReason;", OptInFragment.KEY_OUTGOING_CALL, "", "callToken", "", "callTokenVersion", "<init>", "(Lcom/amazon/comms/calling/domain/model/SipRegistrationReason;ZLjava/lang/String;Ljava/lang/String;)V", "getSipRegistrationReason", "()Lcom/amazon/comms/calling/domain/model/SipRegistrationReason;", "()Z", "getCallToken", "()Ljava/lang/String;", "getCallTokenVersion", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RegisterSipParams {

    @Nullable
    private final String callToken;

    @Nullable
    private final String callTokenVersion;
    private final boolean isOutgoingCall;

    @NotNull
    private final SipRegistrationReason sipRegistrationReason;

    public /* synthetic */ RegisterSipParams(SipRegistrationReason sipRegistrationReason, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sipRegistrationReason, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ RegisterSipParams copy$default(RegisterSipParams registerSipParams, SipRegistrationReason sipRegistrationReason, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            sipRegistrationReason = registerSipParams.sipRegistrationReason;
        }
        if ((i & 2) != 0) {
            z = registerSipParams.isOutgoingCall;
        }
        if ((i & 4) != 0) {
            str = registerSipParams.callToken;
        }
        if ((i & 8) != 0) {
            str2 = registerSipParams.callTokenVersion;
        }
        return registerSipParams.copy(sipRegistrationReason, z, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SipRegistrationReason getSipRegistrationReason() {
        return this.sipRegistrationReason;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsOutgoingCall() {
        return this.isOutgoingCall;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCallToken() {
        return this.callToken;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCallTokenVersion() {
        return this.callTokenVersion;
    }

    @NotNull
    public final RegisterSipParams copy(@NotNull SipRegistrationReason sipRegistrationReason, boolean isOutgoingCall, @Nullable String callToken, @Nullable String callTokenVersion) {
        sipRegistrationReason.getClass();
        return new RegisterSipParams(sipRegistrationReason, isOutgoingCall, callToken, callTokenVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterSipParams)) {
            return false;
        }
        RegisterSipParams registerSipParams = (RegisterSipParams) other;
        return this.sipRegistrationReason == registerSipParams.sipRegistrationReason && this.isOutgoingCall == registerSipParams.isOutgoingCall && Intrinsics.areEqual(this.callToken, registerSipParams.callToken) && Intrinsics.areEqual(this.callTokenVersion, registerSipParams.callTokenVersion);
    }

    @Nullable
    public final String getCallToken() {
        return this.callToken;
    }

    @Nullable
    public final String getCallTokenVersion() {
        return this.callTokenVersion;
    }

    @NotNull
    public final SipRegistrationReason getSipRegistrationReason() {
        return this.sipRegistrationReason;
    }

    public int hashCode() {
        int a2 = c.a(this.isOutgoingCall, this.sipRegistrationReason.hashCode() * 31, 31);
        String str = this.callToken;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.callTokenVersion;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isOutgoingCall() {
        return this.isOutgoingCall;
    }

    @NotNull
    public String toString() {
        SipRegistrationReason sipRegistrationReason = this.sipRegistrationReason;
        boolean z = this.isOutgoingCall;
        String str = this.callToken;
        String str2 = this.callTokenVersion;
        StringBuilder sb = new StringBuilder("RegisterSipParams(sipRegistrationReason=");
        sb.append(sipRegistrationReason);
        sb.append(", isOutgoingCall=");
        sb.append(z);
        sb.append(", callToken=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, str, ", callTokenVersion=", str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public RegisterSipParams(@NotNull SipRegistrationReason sipRegistrationReason, boolean z, @Nullable String str, @Nullable String str2) {
        sipRegistrationReason.getClass();
        this.sipRegistrationReason = sipRegistrationReason;
        this.isOutgoingCall = z;
        this.callToken = str;
        this.callTokenVersion = str2;
    }
}
