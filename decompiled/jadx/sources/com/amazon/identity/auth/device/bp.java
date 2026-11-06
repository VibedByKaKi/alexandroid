package com.amazon.identity.auth.device;

import java.util.Timer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    public final Timer f547a = new Timer();
    public boolean b = false;
    public boolean c = false;

    public final synchronized boolean a() {
        return this.c;
    }

    public final synchronized void b() {
        this.c = true;
    }
}
