package com.amazon.alexa.photos.hva;

import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.photos.metrics.CloudDriveMetrics;
import com.amazon.alexa.photos.metrics.MetricsValidator;
import com.amazon.deecomms.core.ApplicationModule;
import com.dee.app.metrics.MetricsService;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class HVAManager$$ExternalSyntheticLambda1 implements Lazy {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HVAManager$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // dagger.Lazy
    public final Object get() {
        CloudDriveMetrics lambda$new$0;
        MetricsService lambda$new$1;
        DeviceInformation lambda$new$7;
        IdentityService lambda$new$12;
        DeviceInformation lambda$new$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$new$0 = HVAManager.lambda$new$0();
                return lambda$new$0;
            case 1:
                lambda$new$1 = HVAManager.lambda$new$1();
                return lambda$new$1;
            case 2:
                return new MetricsValidator();
            case 3:
                lambda$new$7 = ApplicationModule.lambda$new$7();
                return lambda$new$7;
            case 4:
                lambda$new$12 = ApplicationModule.lambda$new$1();
                return lambda$new$12;
            default:
                lambda$new$3 = ApplicationModule.lambda$new$3();
                return lambda$new$3;
        }
    }
}
