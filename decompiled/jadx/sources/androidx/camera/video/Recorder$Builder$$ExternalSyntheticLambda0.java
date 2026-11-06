package androidx.camera.video;

import androidx.camera.video.AudioSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Recorder$Builder$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ Recorder$Builder$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                Recorder.Builder.lambda$setTargetVideoEncodingBitRate$1(i2, (VideoSpec.Builder) obj);
                break;
            case 1:
                ((AudioSpec.Builder) obj).setSource(i2);
                break;
            default:
                ((VideoSpec.Builder) obj).setAspectRatio(i2);
                break;
        }
    }
}
