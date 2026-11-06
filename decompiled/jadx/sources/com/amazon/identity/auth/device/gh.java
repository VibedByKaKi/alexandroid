package com.amazon.identity.auth.device;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class gh implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f682a;
    public final AtomicInteger b = new AtomicInteger(1);

    public gh(String str) {
        this.f682a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Locale locale = Locale.US;
        return new Thread(runnable, TableInfo$$ExternalSyntheticOutline0.m(this.b.getAndIncrement(), this.f682a, "#"));
    }
}
