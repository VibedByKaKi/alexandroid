package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateMetadataDatabaseResponse {
    private String mStatusUri;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mStatusUri.equals(((CreateMetadataDatabaseResponse) obj).mStatusUri);
    }

    public String getStatusUri() {
        return this.mStatusUri;
    }

    public int hashCode() {
        return this.mStatusUri.hashCode();
    }

    public void setStatusUri(String str) {
        this.mStatusUri = str;
    }
}
