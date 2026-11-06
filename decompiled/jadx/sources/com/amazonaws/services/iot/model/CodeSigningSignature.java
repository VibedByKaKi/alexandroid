package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CodeSigningSignature implements Serializable {
    private ByteBuffer inlineDocument;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CodeSigningSignature)) {
            return false;
        }
        CodeSigningSignature codeSigningSignature = (CodeSigningSignature) obj;
        if ((codeSigningSignature.getInlineDocument() == null) ^ (getInlineDocument() == null)) {
            return false;
        }
        return codeSigningSignature.getInlineDocument() == null || codeSigningSignature.getInlineDocument().equals(getInlineDocument());
    }

    public ByteBuffer getInlineDocument() {
        return this.inlineDocument;
    }

    public int hashCode() {
        return 31 + (getInlineDocument() == null ? 0 : getInlineDocument().hashCode());
    }

    public void setInlineDocument(ByteBuffer byteBuffer) {
        this.inlineDocument = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getInlineDocument() != null) {
            sb.append("inlineDocument: " + getInlineDocument());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CodeSigningSignature withInlineDocument(ByteBuffer byteBuffer) {
        this.inlineDocument = byteBuffer;
        return this;
    }
}
