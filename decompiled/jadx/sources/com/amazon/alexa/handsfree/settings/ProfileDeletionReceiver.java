package com.amazon.alexa.handsfree.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.CallbackErrorMetadata;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.UVRModule;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRVendorSettings;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.UserInfo;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ProfileDeletionReceiver extends BroadcastReceiver {
    private static final String TAG = "ProfileDeletionReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        Log.e(TAG, "onReceive: ProfileDeletionReceiver Received!");
        UVRVendorSettings vendorSettings = UVRModule.INSTANCE.getUVRContract().getVendorSettings();
        UserInfo userInfo = UserInfo.DEFAULT_USER;
        if (vendorSettings.isUVREnrolled(userInfo)) {
            vendorSettings.removeUVRModel(userInfo, new ResponseCallback() { // from class: com.amazon.alexa.handsfree.settings.ProfileDeletionReceiver.1
                @Override // com.amazon.alexa.handsfree.protocols.callback.ResponseCallback
                public void onError(@NonNull CallbackErrorMetadata callbackErrorMetadata) {
                    Log.e(ProfileDeletionReceiver.TAG, "onError: profile deletion from hacky broadcast FAILED!");
                }

                @Override // com.amazon.alexa.handsfree.protocols.callback.ResponseCallback
                public void onSuccess() {
                    Log.e(ProfileDeletionReceiver.TAG, "onSuccess: profile deletion from hacky broadcast SUCCEEDED!");
                }
            });
        }
    }
}
