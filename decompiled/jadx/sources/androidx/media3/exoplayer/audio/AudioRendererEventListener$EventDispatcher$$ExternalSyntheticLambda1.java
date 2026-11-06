package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1(Object obj, long j, long j2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = j;
        this.f$3 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.f$0).lambda$underrun$4(this.f$1, this.f$2, this.f$3);
                break;
            default:
                ((AudioRendererEventListener.EventDispatcher) this.f$0).lambda$underrun$4(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
