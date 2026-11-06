package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.client.annotations.NonNull;
import java.util.ArrayList;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class WakeWordState {
    private final boolean isListening;

    @NonNull
    private final List<String> wakeWords;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter implements BundleAdapter<WakeWordState> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum WakeWordStateKeys implements Bundles.Key {
            WAKE_WORDS,
            IS_LISTENING
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public WakeWordState createFromBundle(Bundle bundle) {
            return WakeWordState.builder().setWakeWords(Bundles.getStringList(bundle, WakeWordStateKeys.WAKE_WORDS)).setEnabled(Bundles.getBoolean(bundle, WakeWordStateKeys.IS_LISTENING)).build();
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(WakeWordState wakeWordState) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(WakeWordStateKeys.WAKE_WORDS.name(), new ArrayList<>(wakeWordState.wakeWords));
            bundle.putBoolean(WakeWordStateKeys.IS_LISTENING.name(), wakeWordState.isListening);
            return bundle;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private boolean isListening;
        private List<String> wakeWords;

        private Builder() {
            this.wakeWords = new ArrayList();
        }

        public WakeWordState build() {
            if (this.wakeWords != null) {
                return new WakeWordState(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("wakewords cannot be null");
            return null;
        }

        public Builder setEnabled(boolean z) {
            this.isListening = z;
            return this;
        }

        public Builder setWakeWords(List<String> list) {
            this.wakeWords = list;
            return this;
        }
    }

    private WakeWordState(Builder builder) {
        this.wakeWords = builder.wakeWords;
        this.isListening = builder.isListening;
    }

    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public List<String> getWakeWords() {
        return this.wakeWords;
    }

    public boolean isListening() {
        return this.isListening;
    }
}
