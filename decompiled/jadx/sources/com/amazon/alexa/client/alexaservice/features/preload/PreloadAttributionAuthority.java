package com.amazon.alexa.client.alexaservice.features.preload;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.core.device.PersistentStorage;
import com.amazon.alexa.client.metrics.core.PreloadAttributionProvider;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PreloadAttributionAuthority implements PreloadAttributionProvider {

    @VisibleForTesting
    static final String KEY_HOST_APP_ATTRIBUTION_TAG = "host_app_attribution_tag";
    private static final String TAG = "PreloadAttributionAuthority";
    private final Lazy<PersistentStorage> storageLazy;

    public PreloadAttributionAuthority(Lazy<PersistentStorage> lazy) {
        this.storageLazy = lazy;
    }

    @Override // com.amazon.alexa.client.metrics.core.PreloadAttributionProvider
    @Nullable
    public String getAttributionTag() {
        return this.storageLazy.get().getString(KEY_HOST_APP_ATTRIBUTION_TAG, null);
    }

    public void setAttributionTag(String str) {
        this.storageLazy.get().edit().set(KEY_HOST_APP_ATTRIBUTION_TAG, str).commitAsynchronously();
    }
}
