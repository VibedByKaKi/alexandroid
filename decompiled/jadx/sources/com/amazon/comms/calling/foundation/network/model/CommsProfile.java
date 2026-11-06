package com.amazon.comms.calling.foundation.network.model;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.google.common.base.Objects;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/amazon/comms/calling/foundation/network/model/CommsProfile;", "", "<init>", "()V", "commsId", "", "getCommsId", "()Ljava/lang/String;", "setCommsId", "(Ljava/lang/String;)V", MetricKeys.META_HASHED_COMMS_ID, "getHashedCommsId", "setHashedCommsId", "homeGroupId", "getHomeGroupId", "setHomeGroupId", ContactProviderContract.PhoneNumberEntry.COLUMN_AOR, "getAor", "setAor", "commsProvisionStatus", "Lcom/amazon/comms/calling/foundation/network/model/CommsProvisionStatus;", "getCommsProvisionStatus", "()Lcom/amazon/comms/calling/foundation/network/model/CommsProvisionStatus;", "setCommsProvisionStatus", "(Lcom/amazon/comms/calling/foundation/network/model/CommsProvisionStatus;)V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class CommsProfile {

    @SerializedName(ContactProviderContract.PhoneNumberEntry.COLUMN_AOR)
    @Nullable
    private String aor;

    @SerializedName("commsId")
    @Nullable
    private String commsId;

    @SerializedName("commsProvisionStatus")
    @Nullable
    private CommsProvisionStatus commsProvisionStatus;

    @SerializedName(MetricKeys.META_HASHED_COMMS_ID)
    @Nullable
    private String hashedCommsId;

    @SerializedName("homeGroupId")
    @Nullable
    private String homeGroupId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommsProfile)) {
            return false;
        }
        CommsProfile commsProfile = (CommsProfile) other;
        if (Objects.equal(this.commsId, commsProfile.commsId) && Objects.equal(this.hashedCommsId, commsProfile.hashedCommsId) && Objects.equal(this.homeGroupId, commsProfile.homeGroupId) && Objects.equal(this.aor, commsProfile.aor)) {
            CommsProvisionStatus commsProvisionStatus = this.commsProvisionStatus;
            if (commsProvisionStatus != null ? commsProvisionStatus.equals(commsProfile.commsProvisionStatus) : false) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String getAor() {
        return this.aor;
    }

    @Nullable
    public final String getCommsId() {
        return this.commsId;
    }

    @Nullable
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
        return Objects.hashCode(this.commsId, this.hashedCommsId, this.homeGroupId, this.aor, this.commsProvisionStatus);
    }

    public final void setAor(@Nullable String str) {
        this.aor = str;
    }

    public final void setCommsId(@Nullable String str) {
        this.commsId = str;
    }

    public final void setCommsProvisionStatus(@Nullable CommsProvisionStatus commsProvisionStatus) {
        this.commsProvisionStatus = commsProvisionStatus;
    }

    public final void setHashedCommsId(@Nullable String str) {
        this.hashedCommsId = str;
    }

    public final void setHomeGroupId(@Nullable String str) {
        this.homeGroupId = str;
    }
}
