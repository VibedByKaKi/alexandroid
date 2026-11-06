package com.amazon.alexa.location;

import com.amazon.alexa.location.LocationSettingsRecorder;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.google.android.gms.location.LocationSettingsStates;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LocationManager$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LocationManager$$ExternalSyntheticLambda5(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((LocationManager) this.f$0).lambda$new$0((LazyComponent) this.f$1, (Throwable) obj);
                break;
            case 1:
                ((DefaultLocationService) this.f$0).lambda$sendTriggerEvent$21((String) this.f$1, (Throwable) obj);
                break;
            default:
                ((LocationSettingsRecorder) this.f$0).lambda$recordLocationSettings$0((LocationSettingsRecorder.LocationSettings) this.f$1, (LocationSettingsStates) obj);
                break;
        }
    }
}
