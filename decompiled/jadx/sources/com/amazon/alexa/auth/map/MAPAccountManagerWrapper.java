package com.amazon.alexa.auth.map;

import android.content.Context;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.auth.AccountManager;
import com.amazon.alexa.auth.AuthorizationException;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.CustomerAttributeKeys;
import com.amazon.identity.auth.device.api.CustomerAttributeStore;
import com.amazon.identity.auth.device.api.DeviceDataKeys;
import com.amazon.identity.auth.device.api.DeviceDataStore;
import com.amazon.identity.auth.device.api.DeviceDataStoreException;
import com.amazon.identity.auth.device.api.MAPInit;
import com.amazon.identity.auth.device.api.TokenKeys;
import com.amazon.identity.auth.device.api.TokenManagement;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MAPAccountManagerWrapper {
    private static final String TAG = "MAPAccountManagerWrapper";
    private static final long TIMEOUT_MS = 3000;
    private final Context context;
    private final CustomerAttributeStore customerAttributeStore;
    private final com.amazon.identity.auth.device.api.MAPAccountManager mapAccountManager;
    private final TokenManagement tokenManagement;

    @Inject
    public MAPAccountManagerWrapper(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        MAPInit.getInstance(applicationContext).initialize();
        this.mapAccountManager = new com.amazon.identity.auth.device.api.MAPAccountManager(applicationContext);
        this.tokenManagement = new TokenManagement(applicationContext);
        this.customerAttributeStore = CustomerAttributeStore.getInstance(context);
    }

    private void getAccountProperty(@NonNull final String str, @NonNull final AccountManager.ResultCallback<String> resultCallback) {
        this.customerAttributeStore.getAttribute(this.mapAccountManager.getAccount(), str, new Callback() { // from class: com.amazon.alexa.auth.map.MAPAccountManagerWrapper.4
            @Override // com.amazon.identity.auth.device.api.Callback
            public void onError(Bundle bundle) {
                if (bundle == null) {
                    resultCallback.onError(new AuthorizationException("Unknown error"));
                } else {
                    resultCallback.onError(new AuthorizationException(DoubleList$$ExternalSyntheticOutline0.m(bundle.getInt("error_code_key"), "Error ", ": ", bundle.getString("error_message_key"))));
                }
            }

            @Override // com.amazon.identity.auth.device.api.Callback
            public void onSuccess(Bundle bundle) {
                resultCallback.onResult(CustomerAttributeStore.getValueOrAttributeDefault(bundle));
            }
        });
    }

    public String getAccountPool() {
        if (!isLoggedIn()) {
            return null;
        }
        final ConditionVariable conditionVariable = new ConditionVariable();
        final AtomicReference atomicReference = new AtomicReference();
        getAccountProperty("com.amazon.dcp.sso.token.device.accountpool", new AccountManager.ResultCallback<String>() { // from class: com.amazon.alexa.auth.map.MAPAccountManagerWrapper.5
            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onError(@NonNull Exception exc) {
                Log.e(MAPAccountManagerWrapper.TAG, "Error getting marketplace", exc);
                conditionVariable.open();
            }

            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onResult(@NonNull String str) {
                atomicReference.set(str);
                conditionVariable.open();
            }
        });
        conditionVariable.block(3000L);
        return (String) atomicReference.get();
    }

    public String getActorToken(String str) {
        if (!isLoggedIn()) {
            return null;
        }
        final AtomicReference atomicReference = new AtomicReference();
        SystemClock.elapsedRealtime();
        String account = this.mapAccountManager.getAccount();
        String actorAccessTokenKeyForPackage = TokenKeys.getActorAccessTokenKeyForPackage(this.context.getPackageName());
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.tokenManagement.getTokenForActor(this.context, account, str, actorAccessTokenKeyForPackage, null, null, new Callback() { // from class: com.amazon.alexa.auth.map.MAPAccountManagerWrapper.3
            @Override // com.amazon.identity.auth.device.api.Callback
            public void onError(Bundle bundle) {
                int i = bundle.getInt("com.amazon.dcp.sso.ErrorCode");
                String string = bundle.getString("com.amazon.dcp.sso.ErrorMessage");
                Log.e(MAPAccountManagerWrapper.TAG, "Error getting actor token " + i + ": " + string);
                conditionVariable.open();
            }

            @Override // com.amazon.identity.auth.device.api.Callback
            public void onSuccess(Bundle bundle) {
                atomicReference.set(bundle.getString("value_key"));
                conditionVariable.open();
            }
        });
        conditionVariable.block(3000L);
        SystemClock.elapsedRealtime();
        return (String) atomicReference.get();
    }

    public String getDeviceSerialNumber() {
        try {
            return DeviceDataStore.getInstance(this.context).getValue(DeviceDataKeys.KEY_DEVICE_SERIAL_NUMBER);
        } catch (DeviceDataStoreException unused) {
            Log.e(TAG, "Error getting DSN");
            return null;
        }
    }

    public String getDirectedID() {
        return this.mapAccountManager.getAccount();
    }

    public String getMarketplace() {
        if (!isLoggedIn()) {
            return null;
        }
        final ConditionVariable conditionVariable = new ConditionVariable();
        final AtomicReference atomicReference = new AtomicReference();
        getAccountProperty(CustomerAttributeKeys.KEY_PFM, new AccountManager.ResultCallback<String>() { // from class: com.amazon.alexa.auth.map.MAPAccountManagerWrapper.1
            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onError(@NonNull Exception exc) {
                Log.e(MAPAccountManagerWrapper.TAG, "Error getting marketplace", exc);
                conditionVariable.open();
            }

            @Override // com.amazon.alexa.auth.AccountManager.ResultCallback
            public void onResult(@NonNull String str) {
                atomicReference.set(str);
                conditionVariable.open();
            }
        });
        conditionVariable.block(3000L);
        return (String) atomicReference.get();
    }

    public String getToken() {
        if (!isLoggedIn()) {
            return null;
        }
        final AtomicReference atomicReference = new AtomicReference();
        SystemClock.elapsedRealtime();
        String accessTokenKeyForPackage = TokenKeys.getAccessTokenKeyForPackage(this.context.getPackageName());
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.tokenManagement.getToken(this.mapAccountManager.getAccount(), accessTokenKeyForPackage, null, new Callback() { // from class: com.amazon.alexa.auth.map.MAPAccountManagerWrapper.2
            @Override // com.amazon.identity.auth.device.api.Callback
            public void onError(Bundle bundle) {
                Log.e(MAPAccountManagerWrapper.TAG, DoubleList$$ExternalSyntheticOutline0.m(bundle.getInt("com.amazon.dcp.sso.ErrorCode"), "Error ", ": ", bundle.getString("com.amazon.dcp.sso.ErrorMessage")));
                conditionVariable.open();
            }

            @Override // com.amazon.identity.auth.device.api.Callback
            public void onSuccess(Bundle bundle) {
                atomicReference.set(bundle.getString("value_key"));
                conditionVariable.open();
            }
        });
        conditionVariable.block(3000L);
        SystemClock.elapsedRealtime();
        atomicReference.get();
        return (String) atomicReference.get();
    }

    public boolean isLoggedIn() {
        return this.mapAccountManager.getAccount() != null;
    }

    @VisibleForTesting
    public MAPAccountManagerWrapper(Context context, com.amazon.identity.auth.device.api.MAPAccountManager mAPAccountManager, TokenManagement tokenManagement, CustomerAttributeStore customerAttributeStore) {
        this.context = context.getApplicationContext();
        this.mapAccountManager = mAPAccountManager;
        this.tokenManagement = tokenManagement;
        this.customerAttributeStore = customerAttributeStore;
    }
}
