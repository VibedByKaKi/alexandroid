package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Executor f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3(Object obj, Executor executor, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = executor;
        this.f$2 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LocationManagerCompat.GpsStatusTransport) this.f$0).lambda$onGpsStatusChanged$3(this.f$1, (GnssStatusCompat) this.f$2);
                break;
            case 1:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f$0).lambda$onGnssMeasurementsReceived$0(this.f$1, (GnssMeasurementsEvent) this.f$2);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f$0).lambda$onSatelliteStatusChanged$3(this.f$1, (GnssStatus) this.f$2);
                break;
        }
    }
}
