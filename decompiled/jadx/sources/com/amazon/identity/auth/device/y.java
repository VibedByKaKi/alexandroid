package com.amazon.identity.auth.device;

import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import android.util.Log;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.identity.auth.device.api.MAPFuture;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class y implements MAPFuture {

    /* renamed from: a, reason: collision with root package name */
    public final AccountManagerFuture f1078a;

    public y(AccountManagerFuture accountManagerFuture) {
        this.f1078a = accountManagerFuture;
    }

    public abstract Bundle a(Object obj);

    @Override // com.amazon.identity.auth.device.api.MAPFuture
    public final Bundle get() {
        try {
            return a(this.f1078a.getResult());
        } catch (AuthenticatorException e) {
            Log.w(yf.a("AccountManagerFutureAdapter"), "AccountManager request failed because of AuthenticatorException: " + e.getMessage());
            throw new ExecutionException(e);
        } catch (OperationCanceledException e2) {
            Log.w(yf.a("AccountManagerFutureAdapter"), "AccountManager request failed because of OperationCanceledException: " + e2.getMessage());
            throw new ExecutionException(e2);
        } catch (IOException e3) {
            Log.w(yf.a("AccountManagerFutureAdapter"), Automotive$$ExternalSyntheticOutline0.m(e3, new StringBuilder("AccountManager request failed because of IOException: ")));
            throw new ExecutionException(e3);
        }
    }

    @Override // com.amazon.identity.auth.device.api.MAPFuture
    public final Bundle get(long j, TimeUnit timeUnit) {
        try {
            return a(this.f1078a.getResult(j, timeUnit));
        } catch (AuthenticatorException e) {
            Log.w(yf.a("AccountManagerFutureAdapter"), "AccountManager request failed because of AuthenticatorException: " + e.getMessage());
            throw new ExecutionException(e);
        } catch (OperationCanceledException e2) {
            Log.w(yf.a("AccountManagerFutureAdapter"), "AccountManager request failed because of OperationCanceledException: " + e2.getMessage());
            throw new ExecutionException(e2);
        } catch (IOException e3) {
            Log.w(yf.a("AccountManagerFutureAdapter"), Automotive$$ExternalSyntheticOutline0.m(e3, new StringBuilder("AccountManager request failed because of IOException: ")));
            throw new ExecutionException(e3);
        }
    }
}
