package com.amazon.identity.auth.device;

import android.text.TextUtils;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class u implements xl {

    /* renamed from: a, reason: collision with root package name */
    public final String f994a;
    public final String b;
    public final Map c;
    public final Map d;

    public u(String str, String str2) {
        this(str, str2, new HashMap(), new HashMap());
    }

    @Override // com.amazon.identity.auth.device.xl
    public final xl a() {
        return new u(this.f994a, this.b, nc.a(this.c), nc.a(this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f994a, uVar.f994a) && TextUtils.equals(this.b, uVar.b) && nc.a(this.c, uVar.c) && nc.a(this.d, uVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f994a;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.d;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.c;
        return hashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f994a;
        String str2 = this.b;
        return ErrorUtils$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("DirectedId: ", str, ", Display Name: ", str2, ", userdata: "), this.c.toString(), ", tokens: ", this.d.toString());
    }

    public u(String str, String str2, Map map, Map map2) {
        this.f994a = str;
        this.b = str2;
        this.c = map;
        this.d = map2;
    }
}
