package com.amazon.alexa.api;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum DriveModeState {
    ACCESSORY,
    AUTOBLUETOOTH,
    MANUAL,
    NONE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DriveModeStateAdapter implements BundleAdapter<DriveModeState> {
        private static final String KEY_DRIVE_MODE_STATE = "driveModeState";
        private static final String TAG = "DriveModeStateAdapter";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        @Nullable
        public DriveModeState createFromBundle(Bundle bundle) {
            Preconditions.notNull(bundle, "Bundle can't be null");
            String string = bundle.getString(KEY_DRIVE_MODE_STATE);
            if (!TextUtils.isEmpty(string)) {
                return DriveModeState.valueOf(string);
            }
            Log.w(TAG, "Unable to create driveModeState from bundle: " + bundle);
            return null;
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(DriveModeState driveModeState) {
            Preconditions.notNull(driveModeState, "driveModeState can't be null");
            Bundle bundle = new Bundle();
            bundle.putString(KEY_DRIVE_MODE_STATE, driveModeState.name());
            return bundle;
        }
    }
}
