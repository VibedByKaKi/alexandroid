package androidx.camera.core.impl;

import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraRepository$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CameraRepository$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((CameraRepository) this.f$0).lambda$deinit$1((CameraInternal) this.f$1);
                break;
            case 1:
                ((LiveDataObservable) this.f$0).lambda$removeObserver$3((LiveDataObservable.LiveDataObserverAdapter) this.f$1);
                break;
            case 2:
                ((LiveDataObservable.LiveDataObserverAdapter) this.f$0).lambda$onChanged$0((LiveDataObservable.Result) this.f$1);
                break;
            case 3:
                ((ConstantObservable) this.f$0).lambda$addObserver$0((Observable.Observer) this.f$1);
                break;
            case 4:
                ((DeferrableSurface) this.f$0).lambda$new$2((String) this.f$1);
                break;
            default:
                ((LiveDataObservable) this.f$0).lambda$fetchData$0((CallbackToFutureAdapter.Completer) this.f$1);
                break;
        }
    }
}
