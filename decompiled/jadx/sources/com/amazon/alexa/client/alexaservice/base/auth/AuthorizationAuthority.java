package com.amazon.alexa.client.alexaservice.base.auth;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.auth.AccessToken;
import com.amazon.alexa.auth.AccountManager;
import com.amazon.alexa.auth.AuthorizationException;
import com.amazon.alexa.auth.DeviceSerialNumberProvider;
import com.amazon.alexa.auth.TokenProvider;
import com.amazon.alexa.client.alexaservice.base.events.AccountManagerEvent;
import com.amazon.alexa.client.alexaservice.base.events.UserLoggedInEvent;
import com.amazon.alexa.client.alexaservice.base.events.UserLoggedOutEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.AuthorizationFailureEvent;
import com.amazon.alexa.client.metrics.core.DirectedIDProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AuthorizationAuthority implements TokenProvider, DirectedIDProvider, DeviceSerialNumberProvider {
    private static final long REQUEST_TIMEOUT_MILLISECONDS = 10000;
    private static final String TAG = "AuthorizationAuthority";
    static final String UNKNOWN_DIRECTED_ID = "unknown";
    private final AccountManager accountManager;
    private volatile String directedID;
    private final AlexaClientEventBus eventBus;
    private volatile boolean isUserLoggedIn;
    private volatile boolean loginStatusIsCached;

    @Inject
    public AuthorizationAuthority(AlexaClientEventBus alexaClientEventBus, AccountManager accountManager) {
        Log.i(TAG, "using accountManager: " + accountManager.getClass());
        this.eventBus = alexaClientEventBus;
        this.accountManager = accountManager;
        alexaClientEventBus.register(this);
    }

    private synchronized void clearLoginCache() {
        this.loginStatusIsCached = false;
        this.isUserLoggedIn = false;
    }

    private void refreshAccountStatusSilently() {
        try {
            getToken();
        } catch (AuthorizationException e) {
            Log.e(TAG, String.format("Failed to refresh account status with error: %s", e));
        }
    }

    @VisibleForTesting
    public synchronized void cacheLoginStatus(boolean z) {
        try {
            if (this.loginStatusIsCached) {
                if (this.isUserLoggedIn != z) {
                }
            }
            this.loginStatusIsCached = true;
            this.isUserLoggedIn = z;
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public ConditionVariable createConditionVariable() {
        return new ConditionVariable(false);
    }

    public void forceAccountRefresh() {
        this.accountManager.clearCache();
        clearLoginCache();
        cacheLoginStatus(isLoggedIn());
    }

    @Override // com.amazon.alexa.auth.DeviceSerialNumberProvider
    public String getDeviceSerialNumber() {
        String str = TAG;
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final ConditionVariable createConditionVariable = createConditionVariable();
        this.accountManager.getDeviceSerialNumber(new AccountManager.ResultCallback<String>() { // from class: com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority.4
            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onError(Exception exc) {
                atomicReference2.set(exc);
                createConditionVariable.open();
            }

            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onResult(String str2) {
                atomicReference.set(str2);
                createConditionVariable.open();
            }
        });
        if (createConditionVariable.block(REQUEST_TIMEOUT_MILLISECONDS)) {
            return atomicReference2.get() == null ? (String) atomicReference.get() : "unknown";
        }
        Log.e(str, "getDeviceSerialNumber: Request timed out. Returning null");
        return "unknown";
    }

    @Override // com.amazon.alexa.client.metrics.core.DirectedIDProvider
    public String getDirectedID() {
        String str = TAG;
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final ConditionVariable createConditionVariable = createConditionVariable();
        this.accountManager.getDirectedID(new AccountManager.ResultCallback<String>() { // from class: com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority.3
            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onError(Exception exc) {
                atomicReference2.set(exc);
                createConditionVariable.open();
            }

            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onResult(String str2) {
                atomicReference.set(str2);
                createConditionVariable.open();
            }
        });
        if (createConditionVariable.block(REQUEST_TIMEOUT_MILLISECONDS)) {
            return atomicReference2.get() == null ? (String) atomicReference.get() : "unknown";
        }
        Log.e(str, "getDirectedID: Request timed out. Returning null");
        return "unknown";
    }

    @Override // com.amazon.alexa.auth.TokenProvider
    public AccessToken getToken() throws AuthorizationException {
        String str = TAG;
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        boolean z = false;
        final ConditionVariable conditionVariable = new ConditionVariable(false);
        getToken(new AccountManager.ResultCallback<AccessToken>() { // from class: com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority.1
            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onError(Exception exc) {
                Log.e(AuthorizationAuthority.TAG, "Caught error in getToken callback: ", exc);
                atomicReference2.set(exc);
                conditionVariable.open();
            }

            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onResult(AccessToken accessToken) {
                atomicReference.set(accessToken);
                conditionVariable.open();
            }
        });
        if (conditionVariable.block(REQUEST_TIMEOUT_MILLISECONDS)) {
            if (atomicReference.get() != null && ((AccessToken) atomicReference.get()).getValue() != null) {
                z = true;
            }
            cacheLoginStatus(z);
        } else {
            Log.e(str, "getToken request timed out");
            this.eventBus.post(AccountManagerEvent.GetTokenTimeOutEvent.create());
        }
        if (atomicReference2.get() == null) {
            return (AccessToken) atomicReference.get();
        }
        throw new AuthorizationException((Throwable) atomicReference2.get());
    }

    public boolean isChildProfile() {
        String str = TAG;
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final ConditionVariable createConditionVariable = createConditionVariable();
        this.accountManager.isChildProfile(new AccountManager.ResultCallback<Boolean>() { // from class: com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority.5
            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onError(Exception exc) {
                atomicReference2.set(exc);
                createConditionVariable.open();
            }

            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onResult(Boolean bool) {
                atomicReference.set(bool);
                createConditionVariable.open();
            }
        });
        if (!createConditionVariable.block(REQUEST_TIMEOUT_MILLISECONDS)) {
            Log.e(str, "isChildProfile: Request timed out. Returning false");
            return false;
        }
        if (atomicReference2.get() == null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        return false;
    }

    public boolean isLoggedIn() {
        String str = TAG;
        synchronized (this) {
            try {
                if (this.loginStatusIsCached) {
                    if (this.isUserLoggedIn) {
                        return this.isUserLoggedIn;
                    }
                    this.accountManager.clearCache();
                }
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                final AtomicReference atomicReference = new AtomicReference();
                final ConditionVariable createConditionVariable = createConditionVariable();
                this.accountManager.isLoggedIn(new AccountManager.ResultCallback<Boolean>() { // from class: com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority.2
                    @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
                    public void onError(Exception exc) {
                        Log.e(AuthorizationAuthority.TAG, "Caught error in getToken callback: ", exc);
                        atomicReference.set(exc);
                        AuthorizationAuthority.this.eventBus.post(AccountManagerEvent.IsLoggedInErrorEvent.create());
                        createConditionVariable.open();
                    }

                    @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
                    public void onResult(Boolean bool) {
                        atomicBoolean.set(bool.booleanValue());
                        createConditionVariable.open();
                    }
                });
                if (!createConditionVariable.block(REQUEST_TIMEOUT_MILLISECONDS)) {
                    Log.e(str, "isLoggedIn request timed out. Returning false");
                    this.eventBus.post(AccountManagerEvent.IsLoggedInTimeOutEvent.create());
                    return false;
                }
                if (atomicReference.get() != null) {
                    return false;
                }
                cacheLoginStatus(atomicBoolean.get());
                atomicBoolean.get();
                return atomicBoolean.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Subscribe
    public void on(UserLoggedOutEvent userLoggedOutEvent) {
        this.accountManager.clearCache();
        cacheLoginStatus(false);
        refreshAccountStatusSilently();
    }

    public void teardown() {
        this.accountManager.teardown();
    }

    @Subscribe
    public void on(UserLoggedInEvent userLoggedInEvent) {
        refreshAccountStatusSilently();
    }

    @Subscribe
    public void on(AuthorizationFailureEvent authorizationFailureEvent) {
        try {
            forceAccountRefresh();
        } catch (Exception unused) {
            clearLoginCache();
        }
    }

    public void getToken(AccountManager.ResultCallback<AccessToken> resultCallback) {
        this.accountManager.getToken(resultCallback);
    }
}
