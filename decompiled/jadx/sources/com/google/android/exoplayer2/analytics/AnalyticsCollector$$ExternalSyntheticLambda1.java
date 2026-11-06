package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class AnalyticsCollector$$ExternalSyntheticLambda1 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsListener.EventTime f$0;

    public /* synthetic */ AnalyticsCollector$$ExternalSyntheticLambda1(AnalyticsListener.EventTime eventTime, int i) {
        this.$r8$classId = i;
        this.f$0 = eventTime;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.$r8$classId;
        AnalyticsListener.EventTime eventTime = this.f$0;
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (i) {
            case 0:
                analyticsListener.onDrmKeysRemoved(eventTime);
                break;
            case 1:
                analyticsListener.onSeekStarted(eventTime);
                break;
            case 2:
                analyticsListener.onDrmSessionAcquired(eventTime);
                break;
            case 3:
                analyticsListener.onDrmKeysLoaded(eventTime);
                break;
            case 4:
                analyticsListener.onSeekProcessed(eventTime);
                break;
            case 5:
                analyticsListener.onDrmKeysRestored(eventTime);
                break;
            case 6:
                analyticsListener.onDrmSessionReleased(eventTime);
                break;
            default:
                analyticsListener.onPlayerReleased(eventTime);
                break;
        }
    }
}
