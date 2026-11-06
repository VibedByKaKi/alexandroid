package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda7 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsListener.EventTime f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda7(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = eventTime;
        this.f$1 = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((AnalyticsListener) obj).onSeekBackIncrementChanged(this.f$0, this.f$1);
                break;
            case 1:
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged(this.f$0, this.f$1);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioPositionAdvancing(this.f$0, this.f$1);
                break;
            default:
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(this.f$0, this.f$1);
                break;
        }
    }
}
