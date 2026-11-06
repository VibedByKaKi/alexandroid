package com.amazon.comms.calling.data.dao;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/amazon/comms/calling/data/dao/CommsProfileResponse;", "", "commsId", "", MetricKeys.META_HASHED_COMMS_ID, "homeGroupId", ContactProviderContract.PhoneNumberEntry.COLUMN_AOR, "commsProvisionStatus", "Lcom/amazon/comms/calling/data/dao/CommsProvisionStatus;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/comms/calling/data/dao/CommsProvisionStatus;)V", "getCommsId", "()Ljava/lang/String;", "getHashedCommsId", "getHomeGroupId", "getAor", "getCommsProvisionStatus", "()Lcom/amazon/comms/calling/data/dao/CommsProvisionStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CommsProfileResponse {

    @SerializedName(ContactProviderContract.PhoneNumberEntry.COLUMN_AOR)
    @Nullable
    private final String aor;

    @SerializedName("commsId")
    @Nullable
    private final String commsId;

    @SerializedName("commsProvisionStatus")
    @NotNull
    private final CommsProvisionStatus commsProvisionStatus;

    @SerializedName(MetricKeys.META_HASHED_COMMS_ID)
    @Nullable
    private final String hashedCommsId;

    @SerializedName("homeGroupId")
    @Nullable
    private final String homeGroupId;

    public CommsProfileResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull CommsProvisionStatus commsProvisionStatus) {
        commsProvisionStatus.getClass();
        this.commsId = str;
        this.hashedCommsId = str2;
        this.homeGroupId = str3;
        this.aor = str4;
        this.commsProvisionStatus = commsProvisionStatus;
    }

    public static /* synthetic */ CommsProfileResponse copy$default(CommsProfileResponse commsProfileResponse, String str, String str2, String str3, String str4, CommsProvisionStatus commsProvisionStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commsProfileResponse.commsId;
        }
        if ((i & 2) != 0) {
            str2 = commsProfileResponse.hashedCommsId;
        }
        if ((i & 4) != 0) {
            str3 = commsProfileResponse.homeGroupId;
        }
        if ((i & 8) != 0) {
            str4 = commsProfileResponse.aor;
        }
        if ((i & 16) != 0) {
            commsProvisionStatus = commsProfileResponse.commsProvisionStatus;
        }
        CommsProvisionStatus commsProvisionStatus2 = commsProvisionStatus;
        String str5 = str3;
        return commsProfileResponse.copy(str, str2, str5, str4, commsProvisionStatus2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCommsId() {
        return this.commsId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getHashedCommsId() {
        return this.hashedCommsId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getHomeGroupId() {
        return this.homeGroupId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAor() {
        return this.aor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommsProvisionStatus getCommsProvisionStatus() {
        return this.commsProvisionStatus;
    }

    @NotNull
    public final CommsProfileResponse copy(@Nullable String commsId, @Nullable String hashedCommsId, @Nullable String homeGroupId, @Nullable String aor, @NotNull CommsProvisionStatus commsProvisionStatus) {
        commsProvisionStatus.getClass();
        return new CommsProfileResponse(commsId, hashedCommsId, homeGroupId, aor, commsProvisionStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommsProfileResponse)) {
            return false;
        }
        CommsProfileResponse commsProfileResponse = (CommsProfileResponse) other;
        return Intrinsics.areEqual(this.commsId, commsProfileResponse.commsId) && Intrinsics.areEqual(this.hashedCommsId, commsProfileResponse.hashedCommsId) && Intrinsics.areEqual(this.homeGroupId, commsProfileResponse.homeGroupId) && Intrinsics.areEqual(this.aor, commsProfileResponse.aor) && this.commsProvisionStatus == commsProfileResponse.commsProvisionStatus;
    }

    @Nullable
    public final String getAor() {
        return this.aor;
    }

    @Nullable
    public final String getCommsId() {
        return this.commsId;
    }

    @NotNull
    public final CommsProvisionStatus getCommsProvisionStatus() {
        return this.commsProvisionStatus;
    }

    @Nullable
    public final String getHashedCommsId() {
        return this.hashedCommsId;
    }

    @Nullable
    public final String getHomeGroupId() {
        return this.homeGroupId;
    }

    public int hashCode() {
        String str = this.commsId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hashedCommsId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeGroupId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.aor;
        return this.commsProvisionStatus.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.commsId;
        String str2 = this.hashedCommsId;
        String str3 = this.homeGroupId;
        String str4 = this.aor;
        CommsProvisionStatus commsProvisionStatus = this.commsProvisionStatus;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("CommsProfileResponse(commsId=", str, ", hashedCommsId=", str2, ", homeGroupId=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", aor=", str4, ", commsProvisionStatus=");
        m.append(commsProvisionStatus);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
