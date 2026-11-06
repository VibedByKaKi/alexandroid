package com.amazon.clouddrive.extended.auth;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class BlockingMAPListener implements Callback {
    private static final String TAG = "BlockingMAPListener";
    private static final long TIMEOUT = 5000;
    private boolean resultDelivered;
    private Bundle results;

    private void notifyResultDelivered() {
        synchronized (this) {
            this.resultDelivered = true;
            notify();
        }
    }

    public Bundle getResults() {
        while (!this.resultDelivered) {
            synchronized (this) {
                try {
                    wait(TIMEOUT);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!this.resultDelivered) {
                Log.e(TAG, "Failed to retrieve MAP credentials in timeout window.");
                return null;
            }
        }
        return this.results;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onError(Bundle bundle) {
        this.results = bundle;
        notifyResultDelivered();
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onSuccess(Bundle bundle) {
        this.results = bundle;
        notifyResultDelivered();
    }
}
