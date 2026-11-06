package com.amazon.alexa.client.alexaservice.base.auth;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.amazon.alexa.auth.AccessToken;
import com.amazon.alexa.auth.AccountManager;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ActorTokenAuthority {
    private static final long REQUEST_TIMEOUT_MILLISECONDS = 10000;
    private static final String TAG = "ActorTokenAuthority";
    private final AccountManager accountManager;

    @Inject
    public ActorTokenAuthority(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Nullable
    private String awaitActorToken(String str) {
        AtomicReference<String> atomicReference = new AtomicReference<>();
        ConditionVariable conditionVariable = new ConditionVariable(false);
        this.accountManager.getActorToken(str, resultCallback(atomicReference, conditionVariable));
        if (conditionVariable.block(REQUEST_TIMEOUT_MILLISECONDS)) {
            return atomicReference.get();
        }
        Log.e(TAG, "Actor token request timed out");
        return null;
    }

    @Nullable
    private String blankToNull(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    private AccountManager.ResultCallback<AccessToken> resultCallback(final AtomicReference<String> atomicReference, final ConditionVariable conditionVariable) {
        return new AccountManager.ResultCallback<AccessToken>() { // from class: com.amazon.alexa.client.alexaservice.base.auth.ActorTokenAuthority.1
            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onError(Exception exc) {
                Log.e(ActorTokenAuthority.TAG, "Failed to mint an actor token", exc);
                conditionVariable.open();
            }

            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onResult(AccessToken accessToken) {
                if (accessToken != null) {
                    atomicReference.set(accessToken.getValue());
                }
                conditionVariable.open();
            }
        };
    }

    @Nullable
    @WorkerThread
    public String actorToken(@Nullable String str) {
        if (str == null) {
            Log.w(TAG, "No person id supplied; cannot mint an actor token");
            return null;
        }
        if (!str.isEmpty()) {
            return blankToNull(awaitActorToken(str));
        }
        Log.w(TAG, "Empty person id supplied; cannot mint an actor token");
        return null;
    }
}
