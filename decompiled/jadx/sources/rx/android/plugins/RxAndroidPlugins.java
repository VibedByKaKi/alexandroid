package rx.android.plugins;

import java.util.concurrent.atomic.AtomicReference;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.annotations.Experimental;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class RxAndroidPlugins {
    private static final RxAndroidPlugins INSTANCE = new RxAndroidPlugins();
    private final AtomicReference<RxAndroidSchedulersHook> schedulersHook = new AtomicReference<>();

    public static RxAndroidPlugins getInstance() {
        return INSTANCE;
    }

    public RxAndroidSchedulersHook getSchedulersHook() {
        if (this.schedulersHook.get() == null) {
            AtomicReference<RxAndroidSchedulersHook> atomicReference = this.schedulersHook;
            RxAndroidSchedulersHook defaultInstance = RxAndroidSchedulersHook.getDefaultInstance();
            while (!atomicReference.compareAndSet(null, defaultInstance) && atomicReference.get() == null) {
            }
        }
        return this.schedulersHook.get();
    }

    public void registerSchedulersHook(RxAndroidSchedulersHook rxAndroidSchedulersHook) {
        AtomicReference<RxAndroidSchedulersHook> atomicReference = this.schedulersHook;
        while (!atomicReference.compareAndSet(null, rxAndroidSchedulersHook)) {
            if (atomicReference.get() != null) {
                Single$$ExternalSyntheticBUOutline0.m(this.schedulersHook.get(), "Another strategy was already registered: ");
                return;
            }
        }
    }

    @Experimental
    public void reset() {
        this.schedulersHook.set(null);
    }
}
