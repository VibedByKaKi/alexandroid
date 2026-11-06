package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class InviteAddress implements Comparable<InviteAddress> {

    @NonNull
    private final String target;

    @NonNull
    private final Type type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InviteAddressBuilder {
        private String target;
        private Type type;

        public InviteAddress build() {
            return new InviteAddress(this.type, this.target);
        }

        public InviteAddressBuilder target(String str) {
            this.target = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("InviteAddress.InviteAddressBuilder(type=");
            sb.append(this.type);
            sb.append(", target=");
            return a$$ExternalSyntheticOutline0.m(sb, this.target, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public InviteAddressBuilder type(Type type) {
            this.type = type;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        EMAIL,
        SMS,
        CUSTOMER_ID,
        UNKNOWN;

        public static Type valueOfOrDefault(String str, Type type) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                return type;
            }
        }
    }

    public InviteAddress(@NonNull Type type, @NonNull String str) {
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("type is null");
            throw null;
        }
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("target is null");
            throw null;
        }
        this.type = type;
        this.target = str;
    }

    public static InviteAddressBuilder builder() {
        return new InviteAddressBuilder();
    }

    @Override // java.lang.Comparable
    public int compareTo(InviteAddress inviteAddress) {
        if (this.type.compareTo(inviteAddress.type) < 0) {
            return -1;
        }
        if (this.type.compareTo(inviteAddress.type) > 0) {
            return 1;
        }
        if (this.target.compareTo(inviteAddress.target) < 0) {
            return -1;
        }
        return this.target.compareTo(inviteAddress.target) > 0 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteAddress)) {
            return false;
        }
        InviteAddress inviteAddress = (InviteAddress) obj;
        Type type = getType();
        Type type2 = inviteAddress.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String target = getTarget();
        String target2 = inviteAddress.getTarget();
        return target != null ? target.equals(target2) : target2 == null;
    }

    @NonNull
    public String getTarget() {
        return this.target;
    }

    @NonNull
    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type = getType();
        int hashCode = type == null ? 43 : type.hashCode();
        String target = getTarget();
        return ((hashCode + 59) * 59) + (target != null ? target.hashCode() : 43);
    }

    public String toString() {
        return "InviteAddress(type=" + getType() + ", target=" + getTarget() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
