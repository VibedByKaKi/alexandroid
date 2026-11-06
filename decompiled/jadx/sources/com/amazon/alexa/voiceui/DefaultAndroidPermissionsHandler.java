package com.amazon.alexa.voiceui;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.voice.ui.permissions.AndroidPermissionsChecker;
import com.amazon.alexa.voice.ui.permissions.AndroidPermissionsRequester;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
class DefaultAndroidPermissionsHandler implements AndroidPermissionsRequester, AndroidPermissionsChecker {

    @VisibleForTesting
    static final String ACTION_REQUEST_PERMISSIONS = "com.amazon.alexa.intent.action.REQUEST_REQUIRED_PERMISSIONS";
    private static final String[] MINIMUM_PERMISSIONS = {"android.permission.RECORD_AUDIO"};
    private final Context context;

    @Inject
    public DefaultAndroidPermissionsHandler(Context context) {
        this.context = context;
    }

    private boolean hasPermissions(@NonNull String[] strArr) {
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(this.context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.alexa.voice.ui.permissions.AndroidPermissionsChecker
    public boolean hasMinimumRequiredPermission() {
        return hasPermissions(MINIMUM_PERMISSIONS);
    }

    @Override // com.amazon.alexa.voice.ui.permissions.AndroidPermissionsRequester
    public void requestPermissions() {
        Intent intent = new Intent(ACTION_REQUEST_PERMISSIONS);
        intent.setPackage(this.context.getPackageName());
        this.context.startActivity(intent);
    }
}
