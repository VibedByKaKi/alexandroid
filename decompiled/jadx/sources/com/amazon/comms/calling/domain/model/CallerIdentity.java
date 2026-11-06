package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/comms/calling/domain/model/CallerIdentity;", "", "commsId", "", "sipUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCommsId", "()Ljava/lang/String;", "getSipUri", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CallerIdentity {

    @SerializedName(JsonDocumentFields.POLICY_ID)
    @NotNull
    private final String commsId;

    @SerializedName("Uri")
    @NotNull
    private final String sipUri;

    public CallerIdentity(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.commsId = str;
        this.sipUri = str2;
    }

    public static /* synthetic */ CallerIdentity copy$default(CallerIdentity callerIdentity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callerIdentity.commsId;
        }
        if ((i & 2) != 0) {
            str2 = callerIdentity.sipUri;
        }
        return callerIdentity.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCommsId() {
        return this.commsId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSipUri() {
        return this.sipUri;
    }

    @NotNull
    public final CallerIdentity copy(@NotNull String commsId, @NotNull String sipUri) {
        commsId.getClass();
        sipUri.getClass();
        return new CallerIdentity(commsId, sipUri);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallerIdentity)) {
            return false;
        }
        CallerIdentity callerIdentity = (CallerIdentity) other;
        return Intrinsics.areEqual(this.commsId, callerIdentity.commsId) && Intrinsics.areEqual(this.sipUri, callerIdentity.sipUri);
    }

    @NotNull
    public final String getCommsId() {
        return this.commsId;
    }

    @NotNull
    public final String getSipUri() {
        return this.sipUri;
    }

    public int hashCode() {
        return this.sipUri.hashCode() + (this.commsId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("CallerIdentity(commsId=", this.commsId, ", sipUri=", this.sipUri, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
