package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class kf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f773a;
    public final /* synthetic */ uf b;

    public kf(uf ufVar, String str) {
        this.b = ufVar;
        this.f773a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isAmazonDomain;
        isAmazonDomain = this.b.isAmazonDomain("upgradeToken");
        if (isAmazonDomain) {
            this.b.c(this.f773a);
        }
    }
}
