package androidx.camera.video.internal.encoder;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface EncoderCallback {
    public static final EncoderCallback EMPTY = new EncoderCallback() { // from class: androidx.camera.video.internal.encoder.EncoderCallback.1
        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStart() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStop() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeError(@NonNull EncodeException encodeException) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodedData(@NonNull EncodedData encodedData) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onOutputConfigUpdate(@NonNull OutputConfig outputConfig) {
        }
    };

    void onEncodeError(@NonNull EncodeException encodeException);

    void onEncodeStart();

    void onEncodeStop();

    void onEncodedData(@NonNull EncodedData encodedData);

    void onOutputConfigUpdate(@NonNull OutputConfig outputConfig);

    default void onEncodePaused() {
    }
}
