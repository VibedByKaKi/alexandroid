package com.amazon.alexa.identity.bootstrapInvitation.helpers;

import android.os.Bundle;
import android.util.Log;
import com.amazon.alexa.identity.Utils;
import com.amazon.identity.auth.device.api.Callback;
import rx.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class BootstrapInvitationActivityLogoutToContinueCallback implements Callback {
    public static final String LOGOUT_TO_CONTINUE_CANCELLED = "logoutToContinueCancelled";
    public static final String LOGOUT_TO_CONTINUE_TAPPED = "logoutToContinueTapped";
    static final String TAG = Utils.tag(BootstrapInvitationActivityLogoutToContinueCallback.class);
    private final PublishSubject<String> subscriber;

    public BootstrapInvitationActivityLogoutToContinueCallback(PublishSubject<String> publishSubject) {
        this.subscriber = publishSubject;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onError(Bundle bundle) {
        Log.e(TAG, "IdentityV2 : in BootstrapInvitationActivityCallback onError");
        this.subscriber.onNext(LOGOUT_TO_CONTINUE_CANCELLED);
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onSuccess(Bundle bundle) {
        Log.i(TAG, "IdentityV2 : in BootstrapInvitationActivityCallback onSuccess");
        this.subscriber.onNext(LOGOUT_TO_CONTINUE_TAPPED);
    }
}
