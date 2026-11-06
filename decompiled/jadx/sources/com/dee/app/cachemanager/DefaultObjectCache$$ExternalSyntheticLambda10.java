package com.dee.app.cachemanager;

import android.util.Log;
import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DefaultObjectCache$$ExternalSyntheticLambda10 implements Action0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultObjectCache$$ExternalSyntheticLambda10(int i) {
        this.$r8$classId = i;
    }

    @Override // rx.functions.Action0
    public final void call() {
        switch (this.$r8$classId) {
            case 0:
                DefaultObjectCache.lambda$clear$12();
                break;
            default:
                Log.i(DefaultObjectCache.TAG, "Cleared cache.");
                break;
        }
    }
}
