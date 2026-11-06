package com.amazon.identity.auth.device.utils;

import android.text.TextUtils;
import com.amazon.identity.auth.device.nc;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f1013a;
    public final String b;
    public final Class[] c;

    public a(Class cls, String str, Class... clsArr) {
        this.f1013a = cls;
        this.b = str;
        this.c = clsArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.b, aVar.b) && Arrays.equals(this.c, aVar.c) && nc.a(this.f1013a, aVar.f1013a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Class cls = this.f1013a;
        int hashCode = ((cls == null ? 0 : cls.hashCode()) + 31) * 31;
        String str = this.b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.c);
    }
}
