package com.amazon.identity.auth.device;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.util.Date;
import java.util.Locale;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class y9 implements xl {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1086a;
    public final Date b;
    public boolean c;
    public final boolean d;

    public y9(Object obj, Date date, boolean z, boolean z2) {
        qe.a(date, "dateTime");
        this.f1086a = obj;
        this.b = (Date) date.clone();
        this.c = z;
        this.d = z2;
    }

    @Override // com.amazon.identity.auth.device.xl
    public final xl a() {
        try {
            return new y9(nc.a(this.f1086a), (Date) this.b.clone(), this.c, this.d);
        } catch (CloneNotSupportedException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y9.class == obj.getClass()) {
            y9 y9Var = (y9) obj;
            if (this.d == y9Var.d && this.c == y9Var.c && ((Date) this.b.clone()).equals((Date) this.b.clone()) && nc.a(this.f1086a, y9Var.f1086a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Date date = this.b;
        int hashCode = ((((((date == null ? 0 : date.hashCode()) + 31) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31;
        Object obj = this.f1086a;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object obj = this.f1086a;
        String obj2 = obj != null ? obj.toString() : "None";
        long time = this.b.getTime();
        boolean z = this.d;
        boolean z2 = this.c;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("Value: ", obj2, ", TimeStamp: ", time);
        m.append(", Deleted: ");
        m.append(z);
        m.append(", Dirty: ");
        m.append(z2);
        return m.toString();
    }

    public final void a(Date date) {
        if (this.b.equals(date)) {
            this.c = false;
        }
    }
}
