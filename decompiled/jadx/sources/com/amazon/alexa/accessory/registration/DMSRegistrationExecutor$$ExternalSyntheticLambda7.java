package com.amazon.alexa.accessory.registration;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import com.amazon.alexa.accessory.notificationpublisher.ConnectedAccessory;
import com.amazon.alexa.accessory.notificationpublisher.ConnectivityModule;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DMSRegistrationExecutor$$ExternalSyntheticLambda7 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ DMSRegistrationExecutor$$ExternalSyntheticLambda7(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((DMSRegistrationExecutor) this.f$0).lambda$register$2((DeviceRegistrationRequest) this.f$1, this.f$2, (Throwable) obj);
                break;
            case 1:
                DefaultAccessoryExplorer.lambda$recordAccessoryExplorerMetrics$21((String) this.f$0, (String) this.f$1, this.f$2, (String) obj);
                break;
            default:
                ConnectivityModule.lambda$registerSuccessiveInputBehaviorConfigSetListener$17((ConnectedAccessory) this.f$0, (Accessory) this.f$1, this.f$2, (List) obj);
                break;
        }
    }
}
