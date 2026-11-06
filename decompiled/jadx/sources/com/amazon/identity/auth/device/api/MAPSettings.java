package com.amazon.identity.auth.device.api;

import android.content.Context;
import com.amazon.identity.auth.device.le;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MAPSettings {

    /* renamed from: a, reason: collision with root package name */
    private final le f510a;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum StorageKeys {
        DOMAIN
    }

    public MAPSettings(Context context) {
        this.f510a = le.a(context, "map_shared_context_storage");
    }

    public String getDomain() {
        return this.f510a.a(StorageKeys.DOMAIN.name());
    }

    public void setDomain(String str) {
        this.f510a.a(StorageKeys.DOMAIN.name(), str);
    }
}
