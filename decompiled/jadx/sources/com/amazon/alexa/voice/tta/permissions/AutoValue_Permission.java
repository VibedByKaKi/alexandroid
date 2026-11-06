package com.amazon.alexa.voice.tta.permissions;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.tta.permissions.Permission;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AutoValue_Permission extends Permission {
    private final String message;
    private final PermissionType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Permission.Builder {
        private String message;
        private PermissionType type;

        @Override // com.amazon.alexa.voice.tta.permissions.Permission.Builder
        public Permission build() {
            String str;
            PermissionType permissionType = this.type;
            if (permissionType != null && (str = this.message) != null) {
                return new AutoValue_Permission(permissionType, str, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.type == null) {
                sb.append(" type");
            }
            if (this.message == null) {
                sb.append(" message");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.tta.permissions.Permission.Builder
        public Permission.Builder message(String str) {
            if (str != null) {
                this.message = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null message");
            return null;
        }

        @Override // com.amazon.alexa.voice.tta.permissions.Permission.Builder
        public Permission.Builder type(PermissionType permissionType) {
            if (permissionType != null) {
                this.type = permissionType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }
    }

    private AutoValue_Permission(PermissionType permissionType, String str) {
        this.type = permissionType;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Permission) {
            Permission permission = (Permission) obj;
            if (this.type.equals(permission.getType()) && this.message.equals(permission.getMessage())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.tta.permissions.Permission
    public String getMessage() {
        return this.message;
    }

    @Override // com.amazon.alexa.voice.tta.permissions.Permission
    public PermissionType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.message.hashCode() ^ ((this.type.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Permission{type=");
        sb.append(this.type);
        sb.append(", message=");
        return a$$ExternalSyntheticOutline0.m(sb, this.message, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_Permission(PermissionType permissionType, String str, int i) {
        this(permissionType, str);
    }
}
