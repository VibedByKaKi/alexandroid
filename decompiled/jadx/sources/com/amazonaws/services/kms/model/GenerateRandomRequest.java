package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GenerateRandomRequest extends AmazonWebServiceRequest implements Serializable {
    private String customKeyStoreId;
    private Integer numberOfBytes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GenerateRandomRequest)) {
            return false;
        }
        GenerateRandomRequest generateRandomRequest = (GenerateRandomRequest) obj;
        if ((generateRandomRequest.getNumberOfBytes() == null) ^ (getNumberOfBytes() == null)) {
            return false;
        }
        if (generateRandomRequest.getNumberOfBytes() != null && !generateRandomRequest.getNumberOfBytes().equals(getNumberOfBytes())) {
            return false;
        }
        if ((generateRandomRequest.getCustomKeyStoreId() == null) ^ (getCustomKeyStoreId() == null)) {
            return false;
        }
        return generateRandomRequest.getCustomKeyStoreId() == null || generateRandomRequest.getCustomKeyStoreId().equals(getCustomKeyStoreId());
    }

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    public int hashCode() {
        return (((getNumberOfBytes() == null ? 0 : getNumberOfBytes().hashCode()) + 31) * 31) + (getCustomKeyStoreId() != null ? getCustomKeyStoreId().hashCode() : 0);
    }

    public void setCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
    }

    public void setNumberOfBytes(Integer num) {
        this.numberOfBytes = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNumberOfBytes() != null) {
            sb.append("NumberOfBytes: " + getNumberOfBytes() + ",");
        }
        if (getCustomKeyStoreId() != null) {
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GenerateRandomRequest withCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
        return this;
    }

    public GenerateRandomRequest withNumberOfBytes(Integer num) {
        this.numberOfBytes = num;
        return this;
    }
}
