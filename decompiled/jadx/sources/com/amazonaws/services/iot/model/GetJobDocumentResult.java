package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetJobDocumentResult implements Serializable {
    private String document;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetJobDocumentResult)) {
            return false;
        }
        GetJobDocumentResult getJobDocumentResult = (GetJobDocumentResult) obj;
        if ((getJobDocumentResult.getDocument() == null) ^ (getDocument() == null)) {
            return false;
        }
        return getJobDocumentResult.getDocument() == null || getJobDocumentResult.getDocument().equals(getDocument());
    }

    public String getDocument() {
        return this.document;
    }

    public int hashCode() {
        return 31 + (getDocument() == null ? 0 : getDocument().hashCode());
    }

    public void setDocument(String str) {
        this.document = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDocument() != null) {
            sb.append("document: " + getDocument());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetJobDocumentResult withDocument(String str) {
        this.document = str;
        return this;
    }
}
