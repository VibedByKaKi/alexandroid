package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetParametersForImportResult implements Serializable {
    private ByteBuffer importToken;
    private String keyId;
    private Date parametersValidTo;
    private ByteBuffer publicKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetParametersForImportResult)) {
            return false;
        }
        GetParametersForImportResult getParametersForImportResult = (GetParametersForImportResult) obj;
        if ((getParametersForImportResult.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (getParametersForImportResult.getKeyId() != null && !getParametersForImportResult.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((getParametersForImportResult.getImportToken() == null) ^ (getImportToken() == null)) {
            return false;
        }
        if (getParametersForImportResult.getImportToken() != null && !getParametersForImportResult.getImportToken().equals(getImportToken())) {
            return false;
        }
        if ((getParametersForImportResult.getPublicKey() == null) ^ (getPublicKey() == null)) {
            return false;
        }
        if (getParametersForImportResult.getPublicKey() != null && !getParametersForImportResult.getPublicKey().equals(getPublicKey())) {
            return false;
        }
        if ((getParametersForImportResult.getParametersValidTo() == null) ^ (getParametersValidTo() == null)) {
            return false;
        }
        return getParametersForImportResult.getParametersValidTo() == null || getParametersForImportResult.getParametersValidTo().equals(getParametersValidTo());
    }

    public ByteBuffer getImportToken() {
        return this.importToken;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public Date getParametersValidTo() {
        return this.parametersValidTo;
    }

    public ByteBuffer getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return (((((((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getImportToken() == null ? 0 : getImportToken().hashCode())) * 31) + (getPublicKey() == null ? 0 : getPublicKey().hashCode())) * 31) + (getParametersValidTo() != null ? getParametersValidTo().hashCode() : 0);
    }

    public void setImportToken(ByteBuffer byteBuffer) {
        this.importToken = byteBuffer;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setParametersValidTo(Date date) {
        this.parametersValidTo = date;
    }

    public void setPublicKey(ByteBuffer byteBuffer) {
        this.publicKey = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getImportToken() != null) {
            sb.append("ImportToken: " + getImportToken() + ",");
        }
        if (getPublicKey() != null) {
            sb.append("PublicKey: " + getPublicKey() + ",");
        }
        if (getParametersValidTo() != null) {
            sb.append("ParametersValidTo: " + getParametersValidTo());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetParametersForImportResult withImportToken(ByteBuffer byteBuffer) {
        this.importToken = byteBuffer;
        return this;
    }

    public GetParametersForImportResult withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public GetParametersForImportResult withParametersValidTo(Date date) {
        this.parametersValidTo = date;
        return this;
    }

    public GetParametersForImportResult withPublicKey(ByteBuffer byteBuffer) {
        this.publicKey = byteBuffer;
        return this;
    }
}
