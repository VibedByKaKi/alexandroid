package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetMetadataDatabaseStatusRequest {
    private String mStatusURI;

    public GetMetadataDatabaseStatusRequest(String str) {
        this.mStatusURI = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mStatusURI.equals(((GetMetadataDatabaseStatusRequest) obj).mStatusURI);
    }

    public String getStatusURI() {
        return this.mStatusURI;
    }

    public int hashCode() {
        return this.mStatusURI.hashCode();
    }

    public void setStatusURI(String str) {
        this.mStatusURI = str;
    }
}
