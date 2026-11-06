package androidx.lifecycle;

import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Landroidx/lifecycle/LifecycleOwner;", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_START, "onResume", "onPause", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "onDestroy", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(@NotNull LifecycleOwner owner) {
        owner.getClass();
    }

    default void onDestroy(@NotNull LifecycleOwner owner) {
        owner.getClass();
    }

    default void onPause(@NotNull LifecycleOwner owner) {
        owner.getClass();
    }

    default void onResume(@NotNull LifecycleOwner owner) {
        owner.getClass();
    }

    default void onStart(@NotNull LifecycleOwner owner) {
        owner.getClass();
    }

    default void onStop(@NotNull LifecycleOwner owner) {
        owner.getClass();
    }
}
