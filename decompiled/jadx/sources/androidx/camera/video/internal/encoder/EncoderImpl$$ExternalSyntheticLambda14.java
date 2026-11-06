package androidx.camera.video.internal.encoder;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class EncoderImpl$$ExternalSyntheticLambda14 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AtomicReference f$0;

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda14(AtomicReference atomicReference, int i) {
        this.$r8$classId = i;
        this.f$0 = atomicReference;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$acquireInputBuffer$13;
        Object lambda$new$0;
        Object lambda$new$02;
        Object lambda$new$03;
        Object lambda$new$04;
        int i = this.$r8$classId;
        AtomicReference atomicReference = this.f$0;
        switch (i) {
            case 0:
                lambda$acquireInputBuffer$13 = EncoderImpl.lambda$acquireInputBuffer$13(atomicReference, completer);
                return lambda$acquireInputBuffer$13;
            case 1:
                lambda$new$0 = InputBufferImpl.lambda$new$0(atomicReference, completer);
                return lambda$new$0;
            case 2:
                lambda$new$02 = BufferCopiedEncodedData.lambda$new$0(atomicReference, completer);
                return lambda$new$02;
            case 3:
                lambda$new$03 = EncodedDataImpl.lambda$new$0(atomicReference, completer);
                return lambda$new$03;
            default:
                lambda$new$04 = EncoderImpl.lambda$new$0(atomicReference, completer);
                return lambda$new$04;
        }
    }
}
