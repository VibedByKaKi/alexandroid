package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class zh {
    public static zh b;

    /* renamed from: a, reason: collision with root package name */
    public final le f1110a;

    public zh(tn tnVar) {
        this.f1110a = le.b(tnVar.getApplicationContext(), "map_p2a_server_metadata");
    }

    public final synchronized void a(String str, String str2) {
        this.f1110a.a("metadata_".concat(str), str2);
    }

    public final synchronized String b(String str) {
        return this.f1110a.a("metadata_".concat(str));
    }

    public final synchronized String c(String str) {
        return this.f1110a.a("pending_".concat(str));
    }

    public final synchronized void a(String str) {
        this.f1110a.b("pending_".concat(str));
    }

    public final synchronized void b(String str, String str2) {
        this.f1110a.a("pending_".concat(str), str2);
    }
}
