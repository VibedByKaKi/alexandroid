package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutItemInput implements Serializable {
    private String tableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutItemInput)) {
            return false;
        }
        PutItemInput putItemInput = (PutItemInput) obj;
        if ((putItemInput.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        return putItemInput.getTableName() == null || putItemInput.getTableName().equals(getTableName());
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return 31 + (getTableName() == null ? 0 : getTableName().hashCode());
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTableName() != null) {
            sb.append("tableName: " + getTableName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutItemInput withTableName(String str) {
        this.tableName = str;
        return this;
    }
}
