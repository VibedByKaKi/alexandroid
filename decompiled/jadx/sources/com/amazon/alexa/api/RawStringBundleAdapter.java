package com.amazon.alexa.api;

import android.os.Bundle;
import android.util.Log;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class RawStringBundleAdapter implements BundleAdapter<String> {
    static final String KEY_STRING_VALUE = "STRING_VALUE";
    private static final String TAG = "RawStringBundleAdapter";

    @Override // com.amazon.alexa.api.BundleAdapter
    @Nullable
    public String createFromBundle(Bundle bundle) {
        Preconditions.notNull(bundle, "Bundle can't be null");
        if (bundle.containsKey(KEY_STRING_VALUE)) {
            return bundle.getString(KEY_STRING_VALUE);
        }
        Log.w(TAG, "Could not create String from Bundle");
        return null;
    }

    @Override // com.amazon.alexa.api.BundleAdapter
    public Bundle toBundle(String str) {
        Preconditions.notNull(str, "Input string can't be null");
        Bundle bundle = new Bundle();
        bundle.putString(KEY_STRING_VALUE, str);
        return bundle;
    }
}
