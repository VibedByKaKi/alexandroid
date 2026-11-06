package com.amazon.alexa.accessory.registration.deviceaccount;

import com.amazon.alexa.accessory.User;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FileSystemDeviceAccountSupplier$$ExternalSyntheticLambda3 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FileSystemDeviceAccountSupplier f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ FileSystemDeviceAccountSupplier$$ExternalSyntheticLambda3(FileSystemDeviceAccountSupplier fileSystemDeviceAccountSupplier, String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = fileSystemDeviceAccountSupplier;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$getDeviceAccount$3;
        ObservableSource lambda$awaitDeviceAccount$7;
        SingleSource lambda$fetchOrGetPrimaryDeviceAccount$5;
        switch (this.$r8$classId) {
            case 0:
                lambda$getDeviceAccount$3 = this.f$0.lambda$getDeviceAccount$3(this.f$1, this.f$2, (User) obj);
                return lambda$getDeviceAccount$3;
            case 1:
                lambda$awaitDeviceAccount$7 = this.f$0.lambda$awaitDeviceAccount$7(this.f$1, this.f$2, (User) obj);
                return lambda$awaitDeviceAccount$7;
            default:
                lambda$fetchOrGetPrimaryDeviceAccount$5 = this.f$0.lambda$fetchOrGetPrimaryDeviceAccount$5(this.f$1, this.f$2, (User) obj);
                return lambda$fetchOrGetPrimaryDeviceAccount$5;
        }
    }
}
