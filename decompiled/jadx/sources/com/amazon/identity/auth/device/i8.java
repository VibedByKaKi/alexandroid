package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class i8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j8 f720a;

    public i8(j8 j8Var) {
        this.f720a = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f720a.a();
        } finally {
            this.f720a.c.countDown();
        }
    }
}
