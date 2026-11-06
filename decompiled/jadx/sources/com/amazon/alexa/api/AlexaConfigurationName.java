package com.amazon.alexa.api;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaConfigurationName {
    APL;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter implements BundleAdapter<AlexaConfigurationName> {
        private static final String ALEXA_CONFIGURATION_NAME = "alexaConfigurationName";
        private static final String TAG = "Adapter";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public AlexaConfigurationName createFromBundle(Bundle bundle) {
            Preconditions.notNull(bundle, "Bundle can't be null");
            String string = bundle.getString(ALEXA_CONFIGURATION_NAME);
            if (!TextUtils.isEmpty(string)) {
                return AlexaConfigurationName.valueOf(string);
            }
            Log.e(TAG, "Unable to create AlexaConfigurationName from bundle: " + bundle);
            return null;
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(AlexaConfigurationName alexaConfigurationName) {
            Preconditions.notNull(alexaConfigurationName, "AlexaConfigurationName can't be null");
            Bundle bundle = new Bundle();
            bundle.putString(ALEXA_CONFIGURATION_NAME, alexaConfigurationName.name());
            return bundle;
        }
    }
}
