package com.amazon.identity.auth.device;

import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class fc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f617a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ gc e;

    public fc(gc gcVar, String str, String str2, String str3, ArrayList arrayList) {
        this.e = gcVar;
        this.f617a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a(this.f617a, this.b, this.c, this.d);
    }
}
