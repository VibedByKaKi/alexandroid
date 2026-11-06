package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StopUserImportJobResult implements Serializable {
    private UserImportJobType userImportJob;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StopUserImportJobResult)) {
            return false;
        }
        StopUserImportJobResult stopUserImportJobResult = (StopUserImportJobResult) obj;
        if ((stopUserImportJobResult.getUserImportJob() == null) ^ (getUserImportJob() == null)) {
            return false;
        }
        return stopUserImportJobResult.getUserImportJob() == null || stopUserImportJobResult.getUserImportJob().equals(getUserImportJob());
    }

    public UserImportJobType getUserImportJob() {
        return this.userImportJob;
    }

    public int hashCode() {
        return 31 + (getUserImportJob() == null ? 0 : getUserImportJob().hashCode());
    }

    public void setUserImportJob(UserImportJobType userImportJobType) {
        this.userImportJob = userImportJobType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserImportJob() != null) {
            sb.append("UserImportJob: " + getUserImportJob());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StopUserImportJobResult withUserImportJob(UserImportJobType userImportJobType) {
        this.userImportJob = userImportJobType;
        return this;
    }
}
