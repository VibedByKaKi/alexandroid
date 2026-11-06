package com.amazon.identity.auth.device.api;

import com.amazon.fireos.sdk.annotations.FireOsSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AccountChangeEvent {

    /* renamed from: a, reason: collision with root package name */
    private final String f466a;
    private final String b;

    public AccountChangeEvent(String str, String str2) {
        this.f466a = str;
        this.b = str2;
    }

    @FireOsSdk
    public String getCurrentAccount() {
        return this.b;
    }

    @FireOsSdk
    public String getPreviousAccount() {
        return this.f466a;
    }
}
