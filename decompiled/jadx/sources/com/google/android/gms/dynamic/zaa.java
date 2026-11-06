package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zaa implements OnDelegateCreatedListener {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        LinkedList linkedList;
        LinkedList linkedList2;
        LifecycleDelegate lifecycleDelegate2;
        this.zaa.zaa = lifecycleDelegate;
        linkedList = this.zaa.zac;
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            zah zahVar = (zah) it2.next();
            lifecycleDelegate2 = this.zaa.zaa;
            zahVar.zab(lifecycleDelegate2);
        }
        linkedList2 = this.zaa.zac;
        linkedList2.clear();
        this.zaa.zab = null;
    }
}
