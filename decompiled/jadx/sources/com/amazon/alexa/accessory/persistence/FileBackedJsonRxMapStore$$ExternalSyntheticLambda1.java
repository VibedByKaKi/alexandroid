package com.amazon.alexa.accessory.persistence;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FileBackedJsonRxMapStore$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FileBackedJsonRxMapStore f$0;

    public /* synthetic */ FileBackedJsonRxMapStore$$ExternalSyntheticLambda1(FileBackedJsonRxMapStore fileBackedJsonRxMapStore, int i) {
        this.$r8$classId = i;
        this.f$0 = fileBackedJsonRxMapStore;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        CompletableSource lambda$clear$0;
        ObservableSource lambda$queryValues$4;
        int i = this.$r8$classId;
        FileBackedJsonRxMapStore fileBackedJsonRxMapStore = this.f$0;
        switch (i) {
            case 0:
                lambda$clear$0 = fileBackedJsonRxMapStore.lambda$clear$0();
                return lambda$clear$0;
            default:
                lambda$queryValues$4 = fileBackedJsonRxMapStore.lambda$queryValues$4();
                return lambda$queryValues$4;
        }
    }
}
