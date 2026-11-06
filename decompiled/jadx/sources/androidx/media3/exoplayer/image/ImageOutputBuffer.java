package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public abstract class ImageOutputBuffer extends DecoderOutputBuffer {

    @Nullable
    public Bitmap bitmap;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    @CallSuper
    public void clear() {
        this.bitmap = null;
        super.clear();
    }
}
