package androidx.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.amazon.alexa.accessory.frames.ota.OTAHelper;
import com.google.common.util.concurrent.ListenableFuture;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Futures$$ExternalSyntheticLambda7 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ Futures$$ExternalSyntheticLambda7(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean lambda$makeTimeoutFuture$1;
        Boolean lambda$transferFirmwareZipToDevice$27;
        switch (this.$r8$classId) {
            case 0:
                lambda$makeTimeoutFuture$1 = Futures.lambda$makeTimeoutFuture$1((CallbackToFutureAdapter.Completer) this.f$0, (ListenableFuture) this.f$1, this.f$2);
                return lambda$makeTimeoutFuture$1;
            default:
                lambda$transferFirmwareZipToDevice$27 = OTAHelper.lambda$transferFirmwareZipToDevice$27((CompositeDisposable) this.f$0, (File) this.f$1, this.f$2);
                return lambda$transferFirmwareZipToDevice$27;
        }
    }
}
