package com.amazon.alexa.identity.bootstrapInvitation.helpers;

import android.os.Bundle;
import android.util.Log;
import com.amazon.alexa.identity.Utils;
import com.amazon.alexa.identity.bootstrapInvitation.model.BootstrapInvitationOptionResult;
import com.amazon.alexa.identity.bootstrapInvitation.model.BootstrapInvitationOptions;
import com.amazon.identity.auth.device.api.Callback;
import rx.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class BootstrapInvitationActivityCallback implements Callback {
    static final String TAG = Utils.tag(BootstrapInvitationActivityCallback.class);
    private final PublishSubject<BootstrapInvitationOptionResult> subscriber;

    public BootstrapInvitationActivityCallback(PublishSubject<BootstrapInvitationOptionResult> publishSubject) {
        this.subscriber = publishSubject;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onError(Bundle bundle) {
        Log.e(TAG, "IdentityV2 : in BootstrapInvitationActivityCallback onError");
        this.subscriber.onNext(new BootstrapInvitationOptionResult(BootstrapInvitationOptions.BootstrapInvitationSignInDeclined));
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onSuccess(Bundle bundle) {
        Log.i(TAG, "IdentityV2 : in BootstrapInvitationActivityCallback onSuccess");
        this.subscriber.onNext(new BootstrapInvitationOptionResult(BootstrapInvitationOptions.BootstrapInvitationSignInChosen));
    }
}
