package com.amazon.identity.auth.device;

import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final String f454a;
    public final long b;
    public final String c;

    public ad(long j, String str, String str2) {
        this.f454a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f454a.equals(adVar.f454a) && this.b == adVar.b && this.c.equals(adVar.c);
    }

    public final int hashCode() {
        int hashCode = this.f454a.hashCode() + 177573;
        long j = this.b;
        int i = (hashCode << 5) + ((int) (j ^ (j >>> 32))) + hashCode;
        return this.c.hashCode() + (i << 5) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmationRecord{action=");
        sb.append(this.f454a);
        sb.append(", confirmationTimestamp=");
        sb.append(this.b);
        sb.append(", transitionId=");
        return cg.a(sb, this.c, StringSubstitutor.DEFAULT_VAR_END);
    }
}
