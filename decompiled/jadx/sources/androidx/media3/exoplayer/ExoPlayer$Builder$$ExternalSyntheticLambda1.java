package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BandwidthMeter f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda1(BandwidthMeter bandwidthMeter, int i) {
        this.$r8$classId = i;
        this.f$0 = bandwidthMeter;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        BandwidthMeter lambda$setBandwidthMeter$20;
        BandwidthMeter lambda$new$12;
        int i = this.$r8$classId;
        BandwidthMeter bandwidthMeter = this.f$0;
        switch (i) {
            case 0:
                lambda$setBandwidthMeter$20 = ExoPlayer.Builder.lambda$setBandwidthMeter$20(bandwidthMeter);
                return lambda$setBandwidthMeter$20;
            default:
                lambda$new$12 = ExoPlayer.Builder.lambda$new$12(bandwidthMeter);
                return lambda$new$12;
        }
    }
}
