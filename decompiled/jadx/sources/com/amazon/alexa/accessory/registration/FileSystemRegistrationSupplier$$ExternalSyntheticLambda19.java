package com.amazon.alexa.accessory.registration;

import com.amazon.alexa.accessory.User;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FileSystemRegistrationSupplier$$ExternalSyntheticLambda19 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FileSystemRegistrationSupplier f$0;
    public final /* synthetic */ DeviceGroup f$1;

    public /* synthetic */ FileSystemRegistrationSupplier$$ExternalSyntheticLambda19(FileSystemRegistrationSupplier fileSystemRegistrationSupplier, DeviceGroup deviceGroup, int i) {
        this.$r8$classId = i;
        this.f$0 = fileSystemRegistrationSupplier;
        this.f$1 = deviceGroup;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        CompletableSource lambda$deregister$0;
        DeviceRegistrationRequest lambda$createDeviceRegistrationRequest$18;
        switch (this.$r8$classId) {
            case 0:
                lambda$deregister$0 = this.f$0.lambda$deregister$0(this.f$1, (User) obj);
                return lambda$deregister$0;
            default:
                lambda$createDeviceRegistrationRequest$18 = this.f$0.lambda$createDeviceRegistrationRequest$18(this.f$1, (Map) obj);
                return lambda$createDeviceRegistrationRequest$18;
        }
    }
}
