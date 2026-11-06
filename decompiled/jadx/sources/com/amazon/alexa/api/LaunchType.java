package com.amazon.alexa.api;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum LaunchType {
    WAKE_WORD,
    TAP_TO_TALK,
    TEXT,
    UNKNOWN,
    NATURAL_TURN;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LaunchTypeAdapter implements BundleAdapter<LaunchType> {
        private static final String KEY_LAUNCH_TYPE = "launchType";
        private static final String TAG = "LaunchTypeAdapter";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        @Nullable
        public LaunchType createFromBundle(Bundle bundle) {
            Preconditions.notNull(bundle, "Bundle can't be null");
            String string = bundle.getString("launchType");
            if (!TextUtils.isEmpty(string)) {
                return LaunchType.valueOf(string);
            }
            Log.w(TAG, "Unable to create launchType from bundle: " + bundle);
            return null;
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(LaunchType launchType) {
            Preconditions.notNull(launchType, "launchType can't be null");
            Bundle bundle = new Bundle();
            bundle.putString("launchType", launchType.name());
            return bundle;
        }
    }

    public static LaunchType fromString(String str) {
        for (LaunchType launchType : values()) {
            if (launchType.name().equals(str)) {
                return launchType;
            }
        }
        return UNKNOWN;
    }
}
