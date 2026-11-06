package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class pd {

    /* renamed from: a, reason: collision with root package name */
    public final String f876a;
    public final String b;
    public final String c;

    public pd(String str, String str2) {
        this.f876a = lo.a(str, str2);
        this.b = str;
        this.c = str2;
    }

    public static pd a(String str) {
        String substring;
        String str2;
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            str2 = null;
            substring = str;
        } else {
            String substring2 = str.substring(0, indexOf);
            substring = str.substring(indexOf + 1);
            str2 = substring2;
        }
        return new pd(str, str2, substring);
    }

    public pd(String str, String str2, String str3) {
        this.f876a = str;
        this.b = str2;
        this.c = str3;
    }
}
