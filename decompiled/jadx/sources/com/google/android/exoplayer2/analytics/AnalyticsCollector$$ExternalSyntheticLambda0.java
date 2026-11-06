package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class AnalyticsCollector$$ExternalSyntheticLambda0 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnalyticsListener.EventTime f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ AnalyticsCollector$$ExternalSyntheticLambda0(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = eventTime;
        this.f$1 = z;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(this.f$0, this.f$1);
                break;
            case 1:
                ((AnalyticsListener) obj).onIsLoadingChanged(this.f$0, this.f$1);
                break;
            case 2:
                ((AnalyticsListener) obj).onShuffleModeChanged(this.f$0, this.f$1);
                break;
            default:
                ((AnalyticsListener) obj).onIsPlayingChanged(this.f$0, this.f$1);
                break;
        }
    }
}
