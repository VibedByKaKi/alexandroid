package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class LocationManagerCompat$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Consumer f$0;
    public final /* synthetic */ Location f$1;

    public /* synthetic */ LocationManagerCompat$$ExternalSyntheticLambda0(Consumer consumer, Location location, int i) {
        this.$r8$classId = i;
        this.f$0 = consumer;
        this.f$1 = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.accept(this.f$1);
                break;
            default:
                this.f$0.accept(this.f$1);
                break;
        }
    }
}
