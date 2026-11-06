package com.amazon.alexa.handsfree.protocols.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ArtifactDownloadStateProvider {

    @VisibleForTesting
    static final String SHARED_PREFERENCE_CURRENT_STARTER_KEY = "AMPD_%s_CURRENT_ARTIFACT_STARTER";

    @VisibleForTesting
    static final String SHARED_PREFERENCE_CURRENT_STATE_KEY = "AMPD_%s_CURRENT_ARTIFACT_STATE";

    @VisibleForTesting
    static final String SHARED_PREFERENCE_FILE = "AMPD_ARTIFACT_DOWNLOAD_STATE_PROVIDER";

    @VisibleForTesting
    static final String SHARED_PREFERENCE_PREVIOUS_STARTER_KEY = "AMPD_%s_PREVIOUS_ARTIFACT_STARTER";

    @VisibleForTesting
    static final String SHARED_PREFERENCE_PREVIOUS_STATE_KEY = "AMPD_%s_PREVIOUS_ARTIFACT_STATE";
    private static final String TAG = "ArtifactDownloadStateProvider";
    private final SharedPreferences mSharedPreferences;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ArtifactType {
        WAKE_WORD_MODEL,
        SV_MODEL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DownloadStarter {
        SIGN_IN,
        LANGUAGE_SELECTOR,
        UNKNOWN
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DownloadState {
        IN_PROGRESS,
        SUCCESS,
        FAILURE,
        UNKNOWN
    }

    public ArtifactDownloadStateProvider(@NonNull Context context) {
        this.mSharedPreferences = context.getSharedPreferences(SHARED_PREFERENCE_FILE, 0);
    }

    public DownloadStarter getDownloadStarter(@NonNull ArtifactType artifactType) {
        String str = "AMPD_" + artifactType + "_CURRENT_ARTIFACT_STARTER";
        String string = this.mSharedPreferences.getString(str, DownloadStarter.UNKNOWN.name());
        Log.d(TAG, "Artifact " + str + " started by: " + string);
        try {
            return DownloadStarter.valueOf(string);
        } catch (IllegalArgumentException unused) {
            return DownloadStarter.UNKNOWN;
        }
    }

    public DownloadState getDownloadState(@NonNull ArtifactType artifactType) {
        String str = "AMPD_" + artifactType + "_CURRENT_ARTIFACT_STATE";
        String string = this.mSharedPreferences.getString(str, DownloadState.UNKNOWN.name());
        Log.d(TAG, "Is Artifact " + str + " Download Ready: " + string);
        try {
            return DownloadState.valueOf(string);
        } catch (IllegalArgumentException unused) {
            return DownloadState.UNKNOWN;
        }
    }

    public void reportArtifactUpToDate(@NonNull ArtifactType artifactType) {
        String str = "AMPD_" + artifactType + "_CURRENT_ARTIFACT_STATE";
        String string = this.mSharedPreferences.getString("AMPD_" + artifactType + "_PREVIOUS_ARTIFACT_STATE", DownloadState.UNKNOWN.name());
        String string2 = this.mSharedPreferences.getString("AMPD_" + artifactType + "_PREVIOUS_ARTIFACT_STARTER", DownloadStarter.UNKNOWN.name());
        String str2 = TAG;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Already up to date. Retrieved previous state ", string, " started from ", string2, " for ");
        m.append(artifactType);
        Log.d(str2, m.toString());
        this.mSharedPreferences.edit().putString("AMPD_" + artifactType + "_CURRENT_ARTIFACT_STARTER", string2).putString(str, string).apply();
    }

    public void reportDownloadStarted(@NonNull ArtifactType artifactType, @NonNull DownloadStarter downloadStarter) {
        String str = "AMPD_" + artifactType + "_CURRENT_ARTIFACT_STARTER";
        String str2 = "AMPD_" + artifactType + "_CURRENT_ARTIFACT_STATE";
        String str3 = "AMPD_" + artifactType + "_PREVIOUS_ARTIFACT_STARTER";
        String string = this.mSharedPreferences.getString(str2, DownloadState.UNKNOWN.name());
        String string2 = this.mSharedPreferences.getString(str, DownloadStarter.UNKNOWN.name());
        Log.d(TAG, "Download for " + artifactType + " started from " + downloadStarter);
        this.mSharedPreferences.edit().putString("AMPD_" + artifactType + "_PREVIOUS_ARTIFACT_STATE", string).putString(str3, string2).putString(str, downloadStarter.name()).putString(str2, DownloadState.IN_PROGRESS.name()).apply();
    }

    public void updateDownloadState(@NonNull ArtifactType artifactType, @NonNull DownloadState downloadState) {
        Log.d(TAG, "Update for " + artifactType + " download. Status updated to: " + downloadState);
        this.mSharedPreferences.edit().putString("AMPD_" + artifactType + "_CURRENT_ARTIFACT_STATE", downloadState.name()).apply();
    }
}
