package com.amazon.alexa.accessory.registration;

import com.amazon.alexa.accessory.User;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FileSystemRegistrationSupplier$$ExternalSyntheticLambda11 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FileSystemRegistrationSupplier f$0;
    public final /* synthetic */ DeviceRegistrationRequest f$1;

    public /* synthetic */ FileSystemRegistrationSupplier$$ExternalSyntheticLambda11(FileSystemRegistrationSupplier fileSystemRegistrationSupplier, DeviceRegistrationRequest deviceRegistrationRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = fileSystemRegistrationSupplier;
        this.f$1 = deviceRegistrationRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getOrCreateDeviceRegistration$6(this.f$1, (Throwable) obj);
                break;
            case 1:
                this.f$0.lambda$getOrCreateDeviceRegistration$7(this.f$1, (User) obj);
                break;
            default:
                this.f$0.lambda$registerCloudAndPersistForFRO$24(this.f$1, (Throwable) obj);
                break;
        }
    }
}
