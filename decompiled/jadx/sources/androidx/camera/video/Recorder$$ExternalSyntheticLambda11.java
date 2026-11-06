package androidx.camera.video;

import androidx.camera.core.impl.SessionConfig;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda11 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda11(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$updateEncoderCallbacks$10;
        Object lambda$updateEncoderCallbacks$12;
        Object lambda$setupSurfaceUpdateNotifier$6;
        switch (this.$r8$classId) {
            case 0:
                lambda$updateEncoderCallbacks$10 = ((Recorder) this.f$0).lambda$updateEncoderCallbacks$10((Recorder.RecordingRecord) this.f$1, completer);
                return lambda$updateEncoderCallbacks$10;
            case 1:
                lambda$updateEncoderCallbacks$12 = ((Recorder) this.f$0).lambda$updateEncoderCallbacks$12((Recorder.RecordingRecord) this.f$1, completer);
                return lambda$updateEncoderCallbacks$12;
            default:
                lambda$setupSurfaceUpdateNotifier$6 = ((VideoCapture) this.f$0).lambda$setupSurfaceUpdateNotifier$6((SessionConfig.Builder) this.f$1, completer);
                return lambda$setupSurfaceUpdateNotifier$6;
        }
    }
}
