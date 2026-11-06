package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class UserPerceivedLatencyData {
    private final long actualUpl;
    private final long alexaSpeechStarted;
    private final String dialogRequestId;
    private final long endOfSpeechOffset;
    private final long estimatedUpl;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Bundler implements BundleAdapter<UserPerceivedLatencyData> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum UserPerceivedLatencyKey implements Bundles.Key {
            DIALOG_REQUEST_ID,
            ESTIMATED_UPL,
            END_OF_SPEECH_OFFSET,
            ACTUAL_UPL,
            ALEXA_SPEECH_STARTED
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public UserPerceivedLatencyData createFromBundle(Bundle bundle) {
            Preconditions.notNull(bundle, "bundle is null");
            return new UserPerceivedLatencyData(Bundles.getString(bundle, UserPerceivedLatencyKey.DIALOG_REQUEST_ID), Bundles.getLong(bundle, UserPerceivedLatencyKey.ESTIMATED_UPL), Bundles.getLong(bundle, UserPerceivedLatencyKey.END_OF_SPEECH_OFFSET), Bundles.getLong(bundle, UserPerceivedLatencyKey.ACTUAL_UPL), Bundles.getLong(bundle, UserPerceivedLatencyKey.ALEXA_SPEECH_STARTED));
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(UserPerceivedLatencyData userPerceivedLatencyData) {
            Preconditions.notNull(userPerceivedLatencyData, "UPL data is null");
            Bundle bundle = new Bundle();
            bundle.putString(UserPerceivedLatencyKey.DIALOG_REQUEST_ID.name(), userPerceivedLatencyData.getDialogRequestId());
            bundle.putLong(UserPerceivedLatencyKey.ESTIMATED_UPL.name(), userPerceivedLatencyData.getEstimatedUserPerceivedLatency());
            bundle.putLong(UserPerceivedLatencyKey.END_OF_SPEECH_OFFSET.name(), userPerceivedLatencyData.getEndOfSpeechOffset());
            bundle.putLong(UserPerceivedLatencyKey.ACTUAL_UPL.name(), userPerceivedLatencyData.getUserPerceivedLatency());
            bundle.putLong(UserPerceivedLatencyKey.ALEXA_SPEECH_STARTED.name(), userPerceivedLatencyData.getAlexaSpeechStarted());
            return bundle;
        }
    }

    public UserPerceivedLatencyData(String str, long j, long j2, long j3, long j4) {
        this.dialogRequestId = str;
        this.estimatedUpl = j;
        this.endOfSpeechOffset = j2;
        this.actualUpl = j3;
        this.alexaSpeechStarted = j4;
    }

    public static UserPerceivedLatencyData fromBundle(Bundle bundle) {
        return new Bundler().createFromBundle(bundle);
    }

    public static Bundle toBundle(UserPerceivedLatencyData userPerceivedLatencyData) {
        return new Bundler().toBundle(userPerceivedLatencyData);
    }

    public long getAlexaSpeechStarted() {
        return this.alexaSpeechStarted;
    }

    public String getDialogRequestId() {
        return this.dialogRequestId;
    }

    public long getEndOfSpeechOffset() {
        return this.endOfSpeechOffset;
    }

    public long getEstimatedUserPerceivedLatency() {
        return this.estimatedUpl;
    }

    public long getUserPerceivedLatency() {
        return this.actualUpl;
    }

    public boolean hasEndOfSpeechOffset() {
        return this.endOfSpeechOffset >= 0;
    }

    public boolean hasUserPerceivedLatency() {
        return this.actualUpl >= 0;
    }
}
