package androidx.lifecycle;

import androidx.lifecycle.LiveDataPublisher;
import androidx.lifecycle.PublisherLiveData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ProcessLifecycleOwner$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ProcessLifecycleOwner$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) obj);
                break;
            case 1:
                LiveDataPublisher.LiveDataSubscription.cancel$lambda$0((LiveDataPublisher.LiveDataSubscription) obj);
                break;
            default:
                PublisherLiveData.LiveDataSubscriber.onError$lambda$0((Throwable) obj);
                break;
        }
    }
}
