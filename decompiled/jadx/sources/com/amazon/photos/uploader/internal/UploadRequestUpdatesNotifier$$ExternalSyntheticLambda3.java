package com.amazon.photos.uploader.internal;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import com.amazon.photos.uploader.UploadRequest;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class UploadRequestUpdatesNotifier$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ UploadRequestUpdatesNotifier$$ExternalSyntheticLambda3(Object obj, Object obj2, int i, long j, long j2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                UploadRequestUpdatesNotifier.onUploadProgressUpdate$lambda$5$lambda$4((Map.Entry) this.f$0, (UploadRequest) this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) this.f$0).lambda$decoderInitialized$1((String) this.f$1, this.f$2, this.f$3);
                break;
            case 2:
                ((VideoRendererEventListener.EventDispatcher) this.f$0).lambda$decoderInitialized$1((String) this.f$1, this.f$2, this.f$3);
                break;
            case 3:
                ((AudioRendererEventListener.EventDispatcher) this.f$0).lambda$decoderInitialized$1((String) this.f$1, this.f$2, this.f$3);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f$0).lambda$decoderInitialized$1((String) this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
