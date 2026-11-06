package com.amazon.identity.auth.device.framework.webauthn;

import android.app.Activity;
import androidx.credentials.CredentialManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f667a;
    public final CredentialManager b;

    public c(Activity activity) {
        this.f667a = activity;
        this.b = CredentialManager.INSTANCE.create(activity);
    }
}
