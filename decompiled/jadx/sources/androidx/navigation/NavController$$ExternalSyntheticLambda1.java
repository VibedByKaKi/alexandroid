package androidx.navigation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import com.mapbox.maps.plugin.lifecycle.ViewLifecycleOwner;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class NavController$$ExternalSyntheticLambda1 implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ NavController$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                NavController.lifecycleObserver$lambda$2((NavController) obj, lifecycleOwner, event);
                break;
            case 1:
                SavedStateRegistryImpl.performAttach$lambda$12((SavedStateRegistryImpl) obj, lifecycleOwner, event);
                break;
            default:
                ViewLifecycleOwner.hostingLifecycleObserver$lambda$0((ViewLifecycleOwner) obj, lifecycleOwner, event);
                break;
        }
    }
}
