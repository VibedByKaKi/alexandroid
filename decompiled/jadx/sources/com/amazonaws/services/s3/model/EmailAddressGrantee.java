package com.amazonaws.services.s3.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class EmailAddressGrantee implements Grantee {
    private String emailAddress = null;

    public EmailAddressGrantee(String str) {
        setIdentifier(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.emailAddress;
        String str2 = ((EmailAddressGrantee) obj).emailAddress;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public String getIdentifier() {
        return this.emailAddress;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public String getTypeIdentifier() {
        return "emailAddress";
    }

    public int hashCode() {
        String str = this.emailAddress;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public void setIdentifier(String str) {
        this.emailAddress = str;
    }

    public String toString() {
        return this.emailAddress;
    }
}
