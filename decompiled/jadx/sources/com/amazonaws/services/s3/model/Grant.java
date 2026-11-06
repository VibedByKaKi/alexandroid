package com.amazonaws.services.s3.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Grant {
    private Grantee grantee;
    private Permission permission;

    public Grant(Grantee grantee, Permission permission) {
        this.grantee = grantee;
        this.permission = permission;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant grant = (Grant) obj;
        Grantee grantee = this.grantee;
        Grantee grantee2 = grant.grantee;
        if (grantee == null) {
            if (grantee2 != null) {
                return false;
            }
        } else if (!grantee.equals(grantee2)) {
            return false;
        }
        return this.permission == grant.permission;
    }

    public Grantee getGrantee() {
        return this.grantee;
    }

    public Permission getPermission() {
        return this.permission;
    }

    public int hashCode() {
        Grantee grantee = this.grantee;
        int hashCode = ((grantee == null ? 0 : grantee.hashCode()) + 31) * 31;
        Permission permission = this.permission;
        return hashCode + (permission != null ? permission.hashCode() : 0);
    }

    public String toString() {
        return "Grant [grantee=" + this.grantee + ", permission=" + this.permission + MarkdownConstants.RIGHT_BRACKET;
    }
}
