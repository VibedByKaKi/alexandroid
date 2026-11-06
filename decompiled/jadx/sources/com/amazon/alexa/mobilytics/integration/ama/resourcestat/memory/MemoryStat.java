package com.amazon.alexa.mobilytics.integration.ama.resourcestat.memory;

import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat;
import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStatType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MemoryStat implements MobilyticsResourceStat {
    private long stat;

    public MemoryStat(long j) {
        this.stat = j;
    }

    @Override // com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat
    public MobilyticsResourceStatType getType() {
        return MobilyticsResourceStatType.MEMORY;
    }

    @Override // com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat
    public Long getValue() {
        return Long.valueOf(this.stat);
    }

    @Override // com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat
    public boolean isValid() {
        return this.stat > 0;
    }
}
