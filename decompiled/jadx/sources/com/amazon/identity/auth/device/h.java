package com.amazon.identity.auth.device;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.amazon.dcp.sso.IAmazonAccountAuthenticator;
import com.amazon.dcp.sso.ISubAuthenticator;
import com.amazon.dcp.sso.ISubAuthenticatorResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class h extends ISubAuthenticator.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f689a;

    public h(i iVar) {
        this.f689a = iVar;
    }

    @Override // com.amazon.dcp.sso.ISubAuthenticator
    public final void getAccountRemovalAllowed(ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, String str2) {
        rn.a(this.f689a.f713a);
        i iVar = this.f689a;
        Account account = new Account(str2, str);
        ((com.amazon.identity.auth.accounts.v) iVar).a().getAccountRemovalAllowed(iSubAuthenticatorResponse, account.type, account.name);
    }

    @Override // com.amazon.dcp.sso.ISubAuthenticator
    public final void getAuthToken(ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, String str2, String str3, Bundle bundle, IAmazonAccountAuthenticator iAmazonAccountAuthenticator) {
        rn.a(this.f689a.f713a);
        if (iSubAuthenticatorResponse == null || iAmazonAccountAuthenticator == null) {
            Log.e(yf.a("AbstractSubAuthenticator"), "Invalid parameter passed to getAuthToken");
            return;
        }
        i iVar = this.f689a;
        Account account = new Account(str2, str);
        ((com.amazon.identity.auth.accounts.v) iVar).a().getAuthToken(iSubAuthenticatorResponse, account.type, account.name, str3, bundle, iAmazonAccountAuthenticator);
    }

    @Override // com.amazon.dcp.sso.ISubAuthenticator.Stub, android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (RuntimeException e) {
            Log.e(yf.a("AbstractSubAuthenticator"), "Unexpected Runtime Exception", e);
            throw e;
        }
    }

    @Override // com.amazon.dcp.sso.ISubAuthenticator
    public final void updateAuthToken(ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, String str2, String str3, Bundle bundle, IAmazonAccountAuthenticator iAmazonAccountAuthenticator) {
        rn.a(this.f689a.f713a);
        if (iSubAuthenticatorResponse == null || iAmazonAccountAuthenticator == null) {
            Log.e(yf.a("AbstractSubAuthenticator"), "Invalid parameter passed to updateAuthTokens");
            return;
        }
        i iVar = this.f689a;
        Account account = new Account(str2, str);
        ((com.amazon.identity.auth.accounts.v) iVar).a().updateAuthToken(iSubAuthenticatorResponse, account.type, account.name, str3, bundle, iAmazonAccountAuthenticator);
    }
}
