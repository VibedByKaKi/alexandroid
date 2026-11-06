package androidx.media3.exoplayer;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import com.google.common.base.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda10 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsCollector f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda10(AnalyticsCollector analyticsCollector, int i) {
        this.$r8$classId = i;
        this.f$0 = analyticsCollector;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        AnalyticsCollector lambda$setAnalyticsCollector$21;
        AnalyticsCollector lambda$new$13;
        int i = this.$r8$classId;
        AnalyticsCollector analyticsCollector = this.f$0;
        Clock clock = (Clock) obj;
        switch (i) {
            case 0:
                lambda$setAnalyticsCollector$21 = ExoPlayer.Builder.lambda$setAnalyticsCollector$21(analyticsCollector, clock);
                return lambda$setAnalyticsCollector$21;
            default:
                lambda$new$13 = ExoPlayer.Builder.lambda$new$13(analyticsCollector, clock);
                return lambda$new$13;
        }
    }
}
