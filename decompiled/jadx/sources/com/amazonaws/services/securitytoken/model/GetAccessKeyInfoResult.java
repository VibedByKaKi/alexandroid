package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetAccessKeyInfoResult implements Serializable {
    private String account;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetAccessKeyInfoResult)) {
            return false;
        }
        GetAccessKeyInfoResult getAccessKeyInfoResult = (GetAccessKeyInfoResult) obj;
        if ((getAccessKeyInfoResult.getAccount() == null) ^ (getAccount() == null)) {
            return false;
        }
        return getAccessKeyInfoResult.getAccount() == null || getAccessKeyInfoResult.getAccount().equals(getAccount());
    }

    public String getAccount() {
        return this.account;
    }

    public int hashCode() {
        return 31 + (getAccount() == null ? 0 : getAccount().hashCode());
    }

    public void setAccount(String str) {
        this.account = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAccount() != null) {
            sb.append("Account: " + getAccount());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetAccessKeyInfoResult withAccount(String str) {
        this.account = str;
        return this;
    }
}
