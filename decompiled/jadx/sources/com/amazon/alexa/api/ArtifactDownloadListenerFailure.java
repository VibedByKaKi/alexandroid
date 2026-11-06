package com.amazon.alexa.api;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum ArtifactDownloadListenerFailure {
    INTERRUPTION,
    DOWNLOAD;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ArtifactDownloadFailureAdapter implements BundleAdapter<ArtifactDownloadListenerFailure> {
        private static final String KEY_ARTIFACT_DOWNLOAD_FAILURE = "artifactDownloadFailureAdapter";
        private static final String TAG = "ArtifactDownloadFailureAdapter";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public ArtifactDownloadListenerFailure createFromBundle(@NonNull Bundle bundle) {
            Preconditions.notNull(bundle, "Bundle can't be null");
            String string = bundle.getString(KEY_ARTIFACT_DOWNLOAD_FAILURE);
            if (!TextUtils.isEmpty(string)) {
                return ArtifactDownloadListenerFailure.valueOf(string);
            }
            Log.w(TAG, "Unable to create ArtifactDownloadListenerFailure from bundle: " + bundle);
            return null;
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(@NonNull ArtifactDownloadListenerFailure artifactDownloadListenerFailure) {
            Preconditions.notNull(artifactDownloadListenerFailure, "ArtifactDownloadListenerFailure can't be null");
            Bundle bundle = new Bundle();
            bundle.putString(KEY_ARTIFACT_DOWNLOAD_FAILURE, artifactDownloadListenerFailure.name());
            return bundle;
        }
    }
}
