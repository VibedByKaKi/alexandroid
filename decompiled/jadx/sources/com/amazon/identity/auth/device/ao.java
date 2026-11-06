package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    public final Long f464a;
    public final String b;

    public ao(Long l, String str) {
        this.f464a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        String str = this.b;
        String str2 = aoVar.b;
        if (str == null ? str2 == null : str.equals(str2)) {
            return this.f464a == null ? aoVar.b == null : this.b.equals(aoVar.b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Long l = this.f464a;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        Long l = this.f464a;
        return q1.a("Version: ", l == null ? "None" : l.toString(), ", ComponentId: ", this.b);
    }
}
