package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaReadyState {
    public static final AlexaReadyState DEFAULT_STATE = create(false, false);
    private final boolean isConnected;
    private final boolean isReady;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AlexaReadyStateAdapter implements BundleAdapter<AlexaReadyState> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum AlexaReadyStateKey implements Bundles.Key {
            IS_CONNECTED,
            IS_READY
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public AlexaReadyState createFromBundle(Bundle bundle) {
            return new AlexaReadyState(bundle.getBoolean(AlexaReadyStateKey.IS_CONNECTED.name(), false), bundle.getBoolean(AlexaReadyStateKey.IS_READY.name(), false));
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(AlexaReadyState alexaReadyState) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(AlexaReadyStateKey.IS_CONNECTED.name(), alexaReadyState.isConnected());
            bundle.putBoolean(AlexaReadyStateKey.IS_READY.name(), alexaReadyState.isReady());
            return bundle;
        }
    }

    private AlexaReadyState(boolean z, boolean z2) {
        this.isConnected = z;
        this.isReady = z2;
    }

    public static AlexaReadyState create(boolean z, boolean z2) {
        return new AlexaReadyState(z, z2);
    }

    public boolean isConnected() {
        return this.isConnected;
    }

    public boolean isReady() {
        return this.isReady;
    }
}
