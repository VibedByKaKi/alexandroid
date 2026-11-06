package com.amazon.identity.auth.device;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import android.util.Log;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.identity.auth.device.api.MAPError;
import java.io.IOException;
import java.util.Stack;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ip implements AccountManagerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Stack f734a;
    public final /* synthetic */ lp b;
    public final /* synthetic */ np c;

    public ip(np npVar, Stack stack, lp lpVar) {
        this.c = npVar;
        this.f734a = stack;
        this.b = lpVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        String str = (String) this.f734a.peek();
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (!bundle.containsKey("authtoken")) {
                this.b.a(MAPError.TokenError.FETCH_TOKEN_FAILED, bundle);
                return;
            }
            this.c.a(str, bundle.getString("authtoken"));
            np npVar = this.c;
            Account account = npVar.c;
            if (npVar.a(this.f734a, this)) {
                return;
            }
            this.b.a();
        } catch (AuthenticatorException e) {
            this.b.a(MAPError.CommonError.INVALID_RESPONSE, "Authentication Exception occurred with message: " + e.getMessage(), 5, e.getMessage());
        } catch (OperationCanceledException e2) {
            this.b.a(MAPError.CommonError.OPERATION_CANCELLED, "Operation was cancelled with message: " + e2.getMessage(), 4, e2.getMessage());
        } catch (IOException e3) {
            String message = e3.getMessage();
            od.a(this.c.f842a, message);
            jg.a("NetworkError7:TokenCache");
            this.b.a(MAPError.CommonError.NETWORK_ERROR, Automotive$$ExternalSyntheticOutline0.m(e3, new StringBuilder("Network Error occurred with message: ")), 3, message);
        } catch (IllegalArgumentException e4) {
            this.b.a(MAPError.CommonError.BAD_REQUEST, "IllegalArgumentException occurred with message: " + e4.getMessage(), 7, e4.getMessage());
        } catch (RuntimeException e5) {
            Log.e(yf.a("TokenCache"), "Generic error while fetching Tokens", e5);
            this.b.a(MAPError.CommonError.INTERNAL_ERROR, "An internal error occurred while fetching token: " + e5.getMessage(), 1, e5.getMessage());
        }
    }
}
