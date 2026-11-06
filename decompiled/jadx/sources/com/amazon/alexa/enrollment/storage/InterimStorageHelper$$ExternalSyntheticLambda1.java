package com.amazon.alexa.enrollment.storage;

import com.amazon.alexa.enrollment.storage.InterimStorageHelper;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class InterimStorageHelper$$ExternalSyntheticLambda1 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InterimStorageHelper.Callback f$0;

    public /* synthetic */ InterimStorageHelper$$ExternalSyntheticLambda1(InterimStorageHelper.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        InterimStorageHelper.Callback callback = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                InterimStorageHelper.lambda$put$1(callback, th);
                break;
            default:
                InterimStorageHelper.lambda$get$3(callback, th);
                break;
        }
    }
}
