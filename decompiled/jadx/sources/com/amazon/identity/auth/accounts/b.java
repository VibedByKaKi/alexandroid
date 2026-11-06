package com.amazon.identity.auth.accounts;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class b implements Callback {
    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        Log.e(yf.a("CentralAccountManagerCommunication"), "Failed to deregister the device after detecting child device type change.");
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        Log.i(yf.a("CentralAccountManagerCommunication"), "Device was deregistered due to the child device type change.");
    }
}
