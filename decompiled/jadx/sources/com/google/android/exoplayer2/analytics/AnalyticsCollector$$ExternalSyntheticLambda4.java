package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class AnalyticsCollector$$ExternalSyntheticLambda4 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsListener.EventTime f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ AnalyticsCollector$$ExternalSyntheticLambda4(AnalyticsListener.EventTime eventTime, int i, long j, long j2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = eventTime;
        this.f$1 = i;
        this.f$2 = j;
        this.f$3 = j2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((AnalyticsListener) obj).onAudioUnderrun(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                ((AnalyticsListener) obj).onBandwidthEstimate(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
