package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class AnalyticsCollector$$ExternalSyntheticLambda48 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AnalyticsCollector$$ExternalSyntheticLambda48(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        String generateDefaultSessionId;
        String generateDefaultSessionId2;
        switch (this.$r8$classId) {
            case 0:
                return new AnalyticsListener.Events();
            case 1:
                generateDefaultSessionId = androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.generateDefaultSessionId();
                return generateDefaultSessionId;
            default:
                generateDefaultSessionId2 = DefaultPlaybackSessionManager.generateDefaultSessionId();
                return generateDefaultSessionId2;
        }
    }
}
