package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class nf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f834a;
    public final /* synthetic */ uf b;

    public nf(uf ufVar, String str) {
        this.b = ufVar;
        this.f834a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isAmazonDomain;
        isAmazonDomain = this.b.isAmazonDomain("switchActor");
        if (isAmazonDomain) {
            this.b.b(this.f834a);
        }
    }
}
