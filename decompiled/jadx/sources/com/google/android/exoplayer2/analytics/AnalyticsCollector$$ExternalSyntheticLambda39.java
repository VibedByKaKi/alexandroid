package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class AnalyticsCollector$$ExternalSyntheticLambda39 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsListener.EventTime f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ AnalyticsCollector$$ExternalSyntheticLambda39(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
        this.$r8$classId = i;
        this.f$0 = eventTime;
        this.f$1 = str;
        this.f$2 = j;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AnalyticsCollector.lambda$onAudioDecoderInitialized$6(this.f$0, this.f$1, this.f$2, (AnalyticsListener) obj);
                break;
            default:
                AnalyticsCollector.lambda$onVideoDecoderInitialized$18(this.f$0, this.f$1, this.f$2, (AnalyticsListener) obj);
                break;
        }
    }
}
