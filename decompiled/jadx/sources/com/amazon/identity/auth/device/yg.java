package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.MAPAccountManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class yg {

    /* renamed from: a, reason: collision with root package name */
    public final String f1092a;
    public final String b;
    public final Bundle c;

    public yg() {
        this.b = MAPAccountManager.ACCOUNT_FOR_PACKAGE_HAS_CHANGED_INTENT_ACTION;
        this.f1092a = null;
        this.c = null;
    }

    public yg(String str, String str2, Bundle bundle) {
        this.b = str;
        this.f1092a = str2;
        this.c = bundle;
    }
}
