package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public interface ImageOutput {
    public static final ImageOutput NO_OP = new ImageOutput() { // from class: androidx.media3.exoplayer.image.ImageOutput.1
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onDisabled() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j, Bitmap bitmap) {
        }
    };

    void onDisabled();

    void onImageAvailable(long j, Bitmap bitmap);
}
