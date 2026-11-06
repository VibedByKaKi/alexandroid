package com.amazon.alexa.accessory.avsclient.context;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.avsclient.metrics.AccessoryMetricsConstants;
import com.amazon.alexa.accessory.metrics.MetricsConstants;
import com.amazon.alexa.accessory.registration.FileSystemRegistrationSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AlexaIOComponentsSupplier$$ExternalSyntheticLambda7 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ AlexaIOComponentsSupplier$$ExternalSyntheticLambda7(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                Automotive$$ExternalSyntheticOutline0.m(AccessoryMetricsConstants.IOComponent.IO_COMPONENTS_PRESENT, (String) obj, z, (Map) null);
                break;
            case 1:
                Automotive$$ExternalSyntheticOutline0.m(AccessoryMetricsConstants.IOComponent.IO_COMPONENTS_PRESENT, "Unknown", z, (Map) null);
                break;
            case 2:
                Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Dms.FRO_REGISTRATION_SUCCESS, (String) obj, z, (Map) null);
                break;
            case 3:
                FileSystemRegistrationSupplier.lambda$recordFRORegistrationMetric$26(z, (Throwable) obj);
                break;
            case 4:
                Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Dms.REGISTER_CLOUD_AND_PERSIST_ERROR, (String) obj, z, (Map) null);
                break;
            case 5:
                FileSystemRegistrationSupplier.lambda$recordRegisterCloudAndPersistErrorMetric$28(z, (Throwable) obj);
                break;
            case 6:
                Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Dms.DIRECTED_ID_IS_EQUAL, (String) obj, z, (Map) null);
                break;
            case 7:
                FileSystemRegistrationSupplier.lambda$recordDirectedIdIsEqual$30(z, (Throwable) obj);
                break;
            case 8:
                Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Dms.DIRECTED_ID_RETRIEVED_FOR_GET_OR_CREATE, (String) obj, z, (Map) null);
                break;
            default:
                FileSystemRegistrationSupplier.lambda$recordDirectedIdRetrievedForGetOrCreateRegistration$32(z, (Throwable) obj);
                break;
        }
    }
}
