package com.amazon.commscore.commsidentity.database.schema;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(tableName = "identityv2_table")
/* loaded from: classes20.dex */
public class IdentityV2 {

    @ColumnInfo(name = ContactProviderContract.PhoneNumberEntry.COLUMN_AOR)
    private String aor;

    @ColumnInfo(name = MetricKeys.COMMS_ID)
    private String commsId;

    @ColumnInfo(name = "comms_provision_status")
    private String commsProvisionStatus;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "directed_id")
    private String directedId;

    @ColumnInfo(name = "hashed_comms_id")
    private String hashedCommsId;

    @ColumnInfo(name = MetricKeys.HOMEGROUP_ID)
    private String homeGroupId;

    @ColumnInfo(name = "homegroup_pce_id")
    private String homeGroupPceId;

    @Embedded
    private Name name;

    @ColumnInfo(name = "pce_id")
    private String pceId;

    public String getAor() {
        return this.aor;
    }

    public String getCommsId() {
        return this.commsId;
    }

    public String getCommsProvisionStatus() {
        return this.commsProvisionStatus;
    }

    @NonNull
    public String getDirectedId() {
        return this.directedId;
    }

    public String getHashedCommsId() {
        return this.hashedCommsId;
    }

    public String getHomeGroupId() {
        return this.homeGroupId;
    }

    public String getHomeGroupPceId() {
        return this.homeGroupPceId;
    }

    public Name getName() {
        return this.name;
    }

    public String getPceId() {
        return this.pceId;
    }

    public void setAor(String str) {
        this.aor = str;
    }

    public void setCommsId(String str) {
        this.commsId = str;
    }

    public void setCommsProvisionStatus(String str) {
        this.commsProvisionStatus = str;
    }

    public void setDirectedId(@NonNull String str) {
        this.directedId = str;
    }

    public void setHashedCommsId(String str) {
        this.hashedCommsId = str;
    }

    public void setHomeGroupId(String str) {
        this.homeGroupId = str;
    }

    public void setHomeGroupPceId(String str) {
        this.homeGroupPceId = str;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setPceId(String str) {
        this.pceId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdentityV2{directedId='");
        sb.append(this.directedId);
        sb.append("', homeGroupPceId='");
        sb.append(this.homeGroupPceId);
        sb.append("', commsId='");
        sb.append(this.commsId);
        sb.append("', commsProvisionStatus='");
        sb.append(this.commsProvisionStatus);
        sb.append("', pceId='");
        sb.append(this.pceId);
        sb.append("', aor='");
        sb.append(this.aor);
        sb.append("', hashedCommsId='");
        sb.append(this.hashedCommsId);
        sb.append("', name=");
        sb.append(this.name);
        sb.append(", homeGroupId='");
        return a$$ExternalSyntheticOutline0.m(sb, this.homeGroupId, "'}");
    }
}
