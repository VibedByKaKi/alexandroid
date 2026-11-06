package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda30 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsListener.EventTime f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda30(AnalyticsListener.EventTime eventTime, String str, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = eventTime;
        this.f$1 = str;
        this.f$2 = j;
        this.f$3 = j2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$5(this.f$0, this.f$1, this.f$2, this.f$3, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$17(this.f$0, this.f$1, this.f$2, this.f$3, (AnalyticsListener) obj);
                break;
        }
    }
}
