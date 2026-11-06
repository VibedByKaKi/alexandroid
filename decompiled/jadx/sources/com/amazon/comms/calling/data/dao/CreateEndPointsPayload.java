package com.amazon.comms.calling.data.dao;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.common.Constants;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/data/dao/CreateEndPointsPayload;", "", Constants.KEY_RECIPIENT_COMMS_ID, "", Constants.KEY_GRUU, Constants.KEY_RECIPIENT_PHONE_NUMBER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRecipientCommsId", "()Ljava/lang/String;", "getGruu", "getRecipientPhoneNumber", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CreateEndPointsPayload {

    @SerializedName(Constants.KEY_GRUU)
    @Nullable
    private final String gruu;

    @SerializedName(Constants.KEY_RECIPIENT_COMMS_ID)
    @NotNull
    private final String recipientCommsId;

    @SerializedName(Constants.KEY_RECIPIENT_PHONE_NUMBER)
    @Nullable
    private final String recipientPhoneNumber;

    public /* synthetic */ CreateEndPointsPayload(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ CreateEndPointsPayload copy$default(CreateEndPointsPayload createEndPointsPayload, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createEndPointsPayload.recipientCommsId;
        }
        if ((i & 2) != 0) {
            str2 = createEndPointsPayload.gruu;
        }
        if ((i & 4) != 0) {
            str3 = createEndPointsPayload.recipientPhoneNumber;
        }
        return createEndPointsPayload.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRecipientCommsId() {
        return this.recipientCommsId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getGruu() {
        return this.gruu;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRecipientPhoneNumber() {
        return this.recipientPhoneNumber;
    }

    @NotNull
    public final CreateEndPointsPayload copy(@NotNull String recipientCommsId, @Nullable String gruu, @Nullable String recipientPhoneNumber) {
        recipientCommsId.getClass();
        return new CreateEndPointsPayload(recipientCommsId, gruu, recipientPhoneNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateEndPointsPayload)) {
            return false;
        }
        CreateEndPointsPayload createEndPointsPayload = (CreateEndPointsPayload) other;
        return Intrinsics.areEqual(this.recipientCommsId, createEndPointsPayload.recipientCommsId) && Intrinsics.areEqual(this.gruu, createEndPointsPayload.gruu) && Intrinsics.areEqual(this.recipientPhoneNumber, createEndPointsPayload.recipientPhoneNumber);
    }

    @Nullable
    public final String getGruu() {
        return this.gruu;
    }

    @NotNull
    public final String getRecipientCommsId() {
        return this.recipientCommsId;
    }

    @Nullable
    public final String getRecipientPhoneNumber() {
        return this.recipientPhoneNumber;
    }

    public int hashCode() {
        int hashCode = this.recipientCommsId.hashCode() * 31;
        String str = this.gruu;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recipientPhoneNumber;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.recipientCommsId;
        String str2 = this.gruu;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("CreateEndPointsPayload(recipientCommsId=", str, ", gruu=", str2, ", recipientPhoneNumber="), this.recipientPhoneNumber, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public CreateEndPointsPayload(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        str.getClass();
        this.recipientCommsId = str;
        this.gruu = str2;
        this.recipientPhoneNumber = str3;
    }
}
