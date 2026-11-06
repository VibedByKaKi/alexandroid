package expo.modules.core.interfaces.services;

import android.view.View;
import androidx.annotation.Nullable;
import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.LifecycleEventListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface UIManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GroupUIBlock {
        void execute(ViewHolder viewHolder);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UIBlock<T> {
        void reject(Throwable th);

        void resolve(T t);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ViewHolder {
        View get(Object obj);
    }

    @Deprecated
    <T> void addUIBlock(int i, UIBlock<T> uIBlock, Class<T> cls);

    @Deprecated
    void addUIBlock(GroupUIBlock groupUIBlock);

    void registerActivityEventListener(ActivityEventListener activityEventListener);

    void registerLifecycleEventListener(LifecycleEventListener lifecycleEventListener);

    @Nullable
    @Deprecated
    View resolveView(int i);

    void runOnClientCodeQueueThread(Runnable runnable);

    void runOnNativeModulesQueueThread(Runnable runnable);

    void runOnUiQueueThread(Runnable runnable);

    void unregisterActivityEventListener(ActivityEventListener activityEventListener);

    void unregisterLifecycleEventListener(LifecycleEventListener lifecycleEventListener);
}
