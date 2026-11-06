package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class TargetTracker implements LifecycleListener {
    private final Set<Target<?>> targets = Collections.newSetFromMap(new WeakHashMap());

    public void clear() {
        this.targets.clear();
    }

    @NonNull
    public List<Target<?>> getAll() {
        return Util.getSnapshot(this.targets);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
        Iterator it2 = Util.getSnapshot(this.targets).iterator();
        while (it2.hasNext()) {
            ((Target) it2.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        Iterator it2 = Util.getSnapshot(this.targets).iterator();
        while (it2.hasNext()) {
            ((Target) it2.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        Iterator it2 = Util.getSnapshot(this.targets).iterator();
        while (it2.hasNext()) {
            ((Target) it2.next()).onStop();
        }
    }

    public void track(@NonNull Target<?> target) {
        this.targets.add(target);
    }

    public void untrack(@NonNull Target<?> target) {
        this.targets.remove(target);
    }
}
