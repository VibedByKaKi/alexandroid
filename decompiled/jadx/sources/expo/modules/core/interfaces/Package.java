package expo.modules.core.interfaces;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface Package {
    default List<? extends ApplicationLifecycleListener> createApplicationLifecycleListeners(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends InternalModule> createInternalModules(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends ReactActivityHandler> createReactActivityHandlers(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends ReactNativeHostHandler> createReactNativeHostHandlers(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends SingletonModule> createSingletonModules(Context context) {
        return Collections.EMPTY_LIST;
    }
}
