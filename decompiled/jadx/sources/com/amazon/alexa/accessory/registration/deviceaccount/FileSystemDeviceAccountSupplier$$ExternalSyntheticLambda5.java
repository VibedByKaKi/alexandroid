package com.amazon.alexa.accessory.registration.deviceaccount;

import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FileSystemDeviceAccountSupplier$$ExternalSyntheticLambda5 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FileSystemDeviceAccountSupplier f$0;

    public /* synthetic */ FileSystemDeviceAccountSupplier$$ExternalSyntheticLambda5(FileSystemDeviceAccountSupplier fileSystemDeviceAccountSupplier, int i) {
        this.$r8$classId = i;
        this.f$0 = fileSystemDeviceAccountSupplier;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$fetchAndStoreDeviceAccount$2;
        SingleSource lambda$getDeviceIdentifier$8;
        int i = this.$r8$classId;
        FileSystemDeviceAccountSupplier fileSystemDeviceAccountSupplier = this.f$0;
        switch (i) {
            case 0:
                lambda$fetchAndStoreDeviceAccount$2 = fileSystemDeviceAccountSupplier.lambda$fetchAndStoreDeviceAccount$2((DeviceAccountRequest) obj);
                return lambda$fetchAndStoreDeviceAccount$2;
            default:
                lambda$getDeviceIdentifier$8 = fileSystemDeviceAccountSupplier.lambda$getDeviceIdentifier$8((DeviceAccount) obj);
                return lambda$getDeviceIdentifier$8;
        }
    }
}
