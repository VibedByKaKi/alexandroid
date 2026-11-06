package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GenerateRandomResult implements Serializable {
    private ByteBuffer plaintext;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GenerateRandomResult)) {
            return false;
        }
        GenerateRandomResult generateRandomResult = (GenerateRandomResult) obj;
        if ((generateRandomResult.getPlaintext() == null) ^ (getPlaintext() == null)) {
            return false;
        }
        return generateRandomResult.getPlaintext() == null || generateRandomResult.getPlaintext().equals(getPlaintext());
    }

    public ByteBuffer getPlaintext() {
        return this.plaintext;
    }

    public int hashCode() {
        return 31 + (getPlaintext() == null ? 0 : getPlaintext().hashCode());
    }

    public void setPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPlaintext() != null) {
            sb.append("Plaintext: " + getPlaintext());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GenerateRandomResult withPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
        return this;
    }
}
