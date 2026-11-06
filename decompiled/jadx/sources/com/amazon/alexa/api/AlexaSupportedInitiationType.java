package com.amazon.alexa.api;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaSupportedInitiationType {
    WAKE_WORD,
    TAP_TO_TALK,
    SERVER;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SupportedInitiationTypeAdapter implements BundleAdapter<AlexaSupportedInitiationType> {
        static final String KEY_SUPPORTED_INITIATION_TYPE = "suppressedInitiationType";
        private static final String TAG = "SupportedInitiationTypeAdapter";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        @Nullable
        public AlexaSupportedInitiationType createFromBundle(Bundle bundle) {
            Preconditions.notNull(bundle, "Bundle can't be null");
            String string = bundle.getString(KEY_SUPPORTED_INITIATION_TYPE);
            if (!TextUtils.isEmpty(string)) {
                return AlexaSupportedInitiationType.valueOf(string);
            }
            Log.w(TAG, "Unable to create AlexaSupportedInitiationType from bundle");
            return null;
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(AlexaSupportedInitiationType alexaSupportedInitiationType) {
            Preconditions.notNull(alexaSupportedInitiationType, "supportedInitiationType can't be null");
            Bundle bundle = new Bundle();
            bundle.putString(KEY_SUPPORTED_INITIATION_TYPE, alexaSupportedInitiationType.name());
            return bundle;
        }
    }
}
