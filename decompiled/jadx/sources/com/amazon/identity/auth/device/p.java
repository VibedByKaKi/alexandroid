package com.amazon.identity.auth.device;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Parcel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class p {
    public static AccountAuthenticatorResponse a(ig igVar) {
        o oVar = new o(igVar);
        Parcel obtain = Parcel.obtain();
        obtain.writeStrongBinder(oVar.asBinder());
        obtain.setDataPosition(0);
        return new AccountAuthenticatorResponse(obtain);
    }
}
