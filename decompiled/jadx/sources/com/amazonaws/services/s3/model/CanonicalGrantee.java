package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CanonicalGrantee implements Grantee, Serializable {
    private String id = null;
    private String displayName = null;

    public CanonicalGrantee(String str) {
        setIdentifier(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            return this.id.equals(((CanonicalGrantee) obj).id);
        }
        return false;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public String getIdentifier() {
        return this.id;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public String getTypeIdentifier() {
        return "id";
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public void setIdentifier(String str) {
        this.id = str;
    }
}
