package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class AnalyticsCollector$$ExternalSyntheticLambda8 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsListener.EventTime f$0;
    public final /* synthetic */ DecoderCounters f$1;

    public /* synthetic */ AnalyticsCollector$$ExternalSyntheticLambda8(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        this.$r8$classId = i;
        this.f$0 = eventTime;
        this.f$1 = decoderCounters;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AnalyticsCollector.lambda$onVideoEnabled$17(this.f$0, this.f$1, (AnalyticsListener) obj);
                break;
            case 1:
                AnalyticsCollector.lambda$onAudioDisabled$11(this.f$0, this.f$1, (AnalyticsListener) obj);
                break;
            case 2:
                AnalyticsCollector.lambda$onVideoDisabled$22(this.f$0, this.f$1, (AnalyticsListener) obj);
                break;
            default:
                AnalyticsCollector.lambda$onAudioEnabled$5(this.f$0, this.f$1, (AnalyticsListener) obj);
                break;
        }
    }
}
