package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultBandwidthMeter$$ExternalSyntheticLambda0 implements NetworkTypeObserver.Listener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultBandwidthMeter$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
    public final void onNetworkTypeChanged(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                ((DefaultBandwidthMeter) obj).onNetworkTypeChanged(i);
                break;
            default:
                ((ExperimentalBandwidthMeter) obj).onNetworkTypeChanged(i);
                break;
        }
    }
}
