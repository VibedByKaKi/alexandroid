package com.amazon.alexa.handsfree.settings.voxsettings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaAudioProviderConnection;
import com.amazon.alexa.api.AlexaPreferences;
import com.amazon.alexa.api.DevicePreferences;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoxSettingsSetRequestHandler implements VoxSettingsRequestHandler {
    static final String EXTRA_RETRY_ATTEMPT = "retryAttempt";
    static final int NO_RETRY_INFO = -1;
    static final String RESULT_RECEIVER_EXTRA = "com.amazon.alexa.handsfree.voxconfig.SET_RESULT_RECEIVER";
    static final int RESULT_RECEIVER_FAILURE = 500;
    static final int RESULT_RECEIVER_SUCCESS = 200;
    private static final String TAG = "VoxSettingsSetRequestHandler";
    private final AlexaAudioProviderConnection mAlexaAudioProviderConnection;
    private ResultReceiver mResultReceiver;
    private int mRetryAttempt;
    private final SharedPreferences mSharedPreferences;
    private boolean mShowOnLockscreenValue;
    private final VoxSettingsSetRequestRetryPolicy mVoxSettingsSetRequestRetryPolicy;

    @VisibleForTesting
    public VoxSettingsSetRequestHandler(@NonNull AlexaAudioProviderConnection alexaAudioProviderConnection, @NonNull SharedPreferences sharedPreferences, @NonNull VoxSettingsSetRequestRetryPolicy voxSettingsSetRequestRetryPolicy, int i, @Nullable ResultReceiver resultReceiver) {
        this.mAlexaAudioProviderConnection = alexaAudioProviderConnection;
        this.mSharedPreferences = sharedPreferences;
        this.mVoxSettingsSetRequestRetryPolicy = voxSettingsSetRequestRetryPolicy;
        this.mRetryAttempt = i;
        this.mResultReceiver = resultReceiver;
    }

    @Override // com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsRequestHandler
    public boolean initialize(@NonNull Intent intent) {
        this.mRetryAttempt = intent.getIntExtra(EXTRA_RETRY_ATTEMPT, -1);
        if (intent.hasExtra(RESULT_RECEIVER_EXTRA) && (intent.getParcelableExtra(RESULT_RECEIVER_EXTRA) instanceof ResultReceiver)) {
            this.mResultReceiver = (ResultReceiver) intent.getParcelableExtra(RESULT_RECEIVER_EXTRA);
        }
        if (intent.hasExtra(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY)) {
            this.mShowOnLockscreenValue = intent.getBooleanExtra(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY, false);
            return true;
        }
        if (!this.mSharedPreferences.contains(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY)) {
            return false;
        }
        this.mShowOnLockscreenValue = this.mSharedPreferences.getBoolean(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY, false);
        return true;
    }

    @Override // com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsRequestHandler
    public boolean onConnectedToService() {
        DevicePreferences.updatePreferences(this.mAlexaAudioProviderConnection, AlexaPreferences.builder().setPreferDisplayOverLockscreenWithVerifiedVoice(this.mShowOnLockscreenValue).build());
        return true;
    }

    @Override // com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsRequestHandler
    public void onRequestFailed() {
        Log.w(TAG, "Failed to update preference. Storing in shared prefs for retrying.");
        Bundle bundle = new Bundle();
        this.mSharedPreferences.edit().putBoolean(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY, this.mShowOnLockscreenValue).apply();
        bundle.putBoolean(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY, this.mShowOnLockscreenValue);
        int i = this.mRetryAttempt;
        if (i != -1) {
            this.mVoxSettingsSetRequestRetryPolicy.scheduleRetry(i + 1);
        }
        ResultReceiver resultReceiver = this.mResultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(500, bundle);
        }
    }

    @Override // com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsRequestHandler
    public void onRequestSucceeded(boolean z) {
        Log.v(TAG, "Successfully synced preference to Vox.");
        Bundle bundle = new Bundle();
        bundle.putBoolean(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY, z);
        if (this.mSharedPreferences.contains(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY)) {
            this.mSharedPreferences.edit().remove(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY).apply();
        }
        ResultReceiver resultReceiver = this.mResultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(200, bundle);
        }
    }

    public VoxSettingsSetRequestHandler(@NonNull AlexaAudioProviderConnection alexaAudioProviderConnection, @NonNull SharedPreferences sharedPreferences, @NonNull VoxSettingsSetRequestRetryPolicy voxSettingsSetRequestRetryPolicy) {
        this(alexaAudioProviderConnection, sharedPreferences, voxSettingsSetRequestRetryPolicy, -1, null);
    }
}
