package rx.android.schedulers;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.android.plugins.RxAndroidPlugins;
import rx.annotations.Experimental;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class AndroidSchedulers {
    private static final AtomicReference<AndroidSchedulers> INSTANCE = new AtomicReference<>();
    private final Scheduler mainThreadScheduler;

    private AndroidSchedulers() {
        Scheduler mainThreadScheduler = RxAndroidPlugins.getInstance().getSchedulersHook().getMainThreadScheduler();
        if (mainThreadScheduler != null) {
            this.mainThreadScheduler = mainThreadScheduler;
        } else {
            this.mainThreadScheduler = new LooperScheduler(Looper.getMainLooper());
        }
    }

    public static Scheduler from(Looper looper) {
        if (looper != null) {
            return new LooperScheduler(looper);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("looper == null");
        return null;
    }

    private static AndroidSchedulers getInstance() {
        while (true) {
            AtomicReference<AndroidSchedulers> atomicReference = INSTANCE;
            AndroidSchedulers androidSchedulers = atomicReference.get();
            if (androidSchedulers != null) {
                return androidSchedulers;
            }
            AndroidSchedulers androidSchedulers2 = new AndroidSchedulers();
            while (!atomicReference.compareAndSet(null, androidSchedulers2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return androidSchedulers2;
        }
    }

    public static Scheduler mainThread() {
        return getInstance().mainThreadScheduler;
    }

    @Experimental
    public static void reset() {
        INSTANCE.set(null);
    }
}
