package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda10 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsListener.EventTime f$0;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda10(AnalyticsListener.EventTime eventTime, int i) {
        this.$r8$classId = i;
        this.f$0 = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.$r8$classId;
        AnalyticsListener.EventTime eventTime = this.f$0;
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (i) {
            case 0:
                analyticsListener.onPlayerReleased(eventTime);
                break;
            case 1:
                analyticsListener.onDrmKeysRemoved(eventTime);
                break;
            case 2:
                analyticsListener.onDrmKeysRestored(eventTime);
                break;
            case 3:
                analyticsListener.onSeekStarted(eventTime);
                break;
            case 4:
                analyticsListener.onDrmKeysLoaded(eventTime);
                break;
            default:
                analyticsListener.onDrmSessionReleased(eventTime);
                break;
        }
    }
}
