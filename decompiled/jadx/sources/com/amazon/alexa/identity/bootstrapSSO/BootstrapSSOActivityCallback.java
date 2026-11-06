package com.amazon.alexa.identity.bootstrapSSO;

import android.os.Bundle;
import android.util.Log;
import com.amazon.alexa.identity.Utils;
import com.amazon.alexa.identity.bootstrapSSO.model.BootstrapSSOAccount;
import com.amazon.alexa.identity.bootstrapSSO.model.BootstrapSSOOptionResult;
import com.amazon.alexa.identity.bootstrapSSO.model.BootstrapSSOOptions;
import com.amazon.identity.auth.device.api.Callback;
import rx.Subscriber;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class BootstrapSSOActivityCallback implements Callback {
    static final String TAG = Utils.tag(BootstrapSSOActivityCallback.class);
    private BootstrapSSOAccount bootstrapSSOAccount;
    private Subscriber<? super BootstrapSSOOptionResult> subscriber;

    public BootstrapSSOActivityCallback(Subscriber<? super BootstrapSSOOptionResult> subscriber, BootstrapSSOAccount bootstrapSSOAccount) {
        this.subscriber = subscriber;
        this.bootstrapSSOAccount = bootstrapSSOAccount;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onError(Bundle bundle) {
        Log.e(TAG, "IdentityV2 : in BootstrapSSOActivityCallback onError");
        this.subscriber.onNext(new BootstrapSSOOptionResult(BootstrapSSOOptions.BootstrapSSOSignInDeclined, null));
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onSuccess(Bundle bundle) {
        Log.i(TAG, "IdentityV2 : in BootstrapSSOActivityCallback onSuccess");
        this.subscriber.onNext(new BootstrapSSOOptionResult(BootstrapSSOOptions.BootstrapSSOSignInChosen, this.bootstrapSSOAccount));
    }
}
