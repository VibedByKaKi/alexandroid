package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Executor f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2(Object obj, Executor executor, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = executor;
        this.f$2 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LocationManagerCompat.GpsStatusTransport) this.f$0).lambda$onGpsStatusChanged$2(this.f$1, this.f$2);
                break;
            case 1:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f$0).lambda$onStatusChanged$1(this.f$1, this.f$2);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f$0).lambda$onFirstFix$2(this.f$1, this.f$2);
                break;
        }
    }
}
