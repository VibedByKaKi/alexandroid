package androidx.databinding;

import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class ViewDataBindingKtx$$ExternalSyntheticLambda0 implements CreateWeakListener {
    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    @Override // androidx.databinding.CreateWeakListener
    public WeakListener create(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
        WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0;
        CREATE_STATE_FLOW_LISTENER$lambda$0 = ViewDataBindingKtx.CREATE_STATE_FLOW_LISTENER$lambda$0(viewDataBinding, i, referenceQueue);
        return CREATE_STATE_FLOW_LISTENER$lambda$0;
    }
}
