package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class AnalyticsCollector$$ExternalSyntheticLambda2 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsListener.EventTime f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ AnalyticsCollector$$ExternalSyntheticLambda2(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = eventTime;
        this.f$1 = i;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((AnalyticsListener) obj).onAudioSessionIdChanged(this.f$0, this.f$1);
                break;
            case 1:
                ((AnalyticsListener) obj).onTimelineChanged(this.f$0, this.f$1);
                break;
            case 2:
                ((AnalyticsListener) obj).onPlaybackStateChanged(this.f$0, this.f$1);
                break;
            case 3:
                ((AnalyticsListener) obj).onPositionDiscontinuity(this.f$0, this.f$1);
                break;
            case 4:
                ((AnalyticsListener) obj).onRepeatModeChanged(this.f$0, this.f$1);
                break;
            default:
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.f$0, this.f$1);
                break;
        }
    }
}
