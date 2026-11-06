package com.amazon.alexa.accessory.persistence;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FileBackedJsonRxMapStore$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FileBackedJsonRxMapStore f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ JsonObjectSerializable f$2;

    public /* synthetic */ FileBackedJsonRxMapStore$$ExternalSyntheticLambda0(FileBackedJsonRxMapStore fileBackedJsonRxMapStore, String str, JsonObjectSerializable jsonObjectSerializable, int i) {
        this.$r8$classId = i;
        this.f$0 = fileBackedJsonRxMapStore;
        this.f$1 = str;
        this.f$2 = jsonObjectSerializable;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource lambda$put$2;
        CompletableSource lambda$delete$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$put$2 = this.f$0.lambda$put$2(this.f$1, this.f$2);
                return lambda$put$2;
            default:
                lambda$delete$3 = this.f$0.lambda$delete$3(this.f$1, this.f$2);
                return lambda$delete$3;
        }
    }
}
