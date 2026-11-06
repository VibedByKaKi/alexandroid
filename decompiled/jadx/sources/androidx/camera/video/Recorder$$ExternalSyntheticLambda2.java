package androidx.camera.video;

import android.net.Uri;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Recorder.lambda$composeRecorderMediaSpec$8((VideoSpec.Builder) obj);
                break;
            default:
                Recorder.RecordingRecord.lambda$new$0((Uri) obj);
                break;
        }
    }
}
