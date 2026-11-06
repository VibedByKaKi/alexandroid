package com.amazon.alexa.voiceui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.ui.permissions.AndroidPermissionsRequester;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class BottomSheetAndroidPermissionsRequester implements AndroidPermissionsRequester {

    @VisibleForTesting
    static final String ACTION_REQUEST_PERMISSIONS_BOTTOM_SHEET = "com.amazon.alexa.intent.action.REQUEST_REQUIRED_PERMISSIONS_BOTTOM_SHEET";

    @VisibleForTesting
    static final String ACTION_REQUEST_PERMISSIONS_REMARKABLE_ALEXA = "com.amazon.alexa.intent.action.REQUEST_REQUIRED_PERMISSIONS_REMARKABLE_ALEXA";
    private static final String TAG = "BottomSheetAndroidPermissionsRequester";
    private final Context context;
    private boolean isRequestFromRemarkableAlexa = false;

    @Inject
    public BottomSheetAndroidPermissionsRequester(Context context) {
        this.context = context;
    }

    @Override // com.amazon.alexa.voice.ui.permissions.AndroidPermissionsRequester
    public void requestPermissions() {
        Intent intent = new Intent(this.isRequestFromRemarkableAlexa ? ACTION_REQUEST_PERMISSIONS_REMARKABLE_ALEXA : ACTION_REQUEST_PERMISSIONS_BOTTOM_SHEET);
        intent.setPackage(this.context.getPackageName());
        try {
            this.context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, "requestPermissions: failed to start activity", e);
        }
    }

    public void setRequestFromRemarkableAlexa(boolean z) {
        this.isRequestFromRemarkableAlexa = z;
    }
}
