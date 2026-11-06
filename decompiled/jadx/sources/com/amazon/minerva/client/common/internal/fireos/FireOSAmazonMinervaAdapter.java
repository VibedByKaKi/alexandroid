package com.amazon.minerva.client.common.internal.fireos;

import android.content.Context;
import com.amazon.minerva.client.api.AmazonMinerva;
import com.amazon.minerva.client.api.AmazonMinervaClientBuilder;
import com.amazon.minerva.client.common.api.MetricEvent;
import com.amazon.minerva.client.common.internal.AmazonMinervaAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class FireOSAmazonMinervaAdapter implements AmazonMinervaAdapter {
    private AmazonMinerva mMinervaClient;

    public FireOSAmazonMinervaAdapter(Context context, String str) {
        this.mMinervaClient = createBuilder(context, str).build();
    }

    public AmazonMinervaClientBuilder createBuilder(Context context, String str) {
        return AmazonMinervaClientBuilder.standard(context).withRegion(str);
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaAdapter
    public void record(MetricEvent metricEvent) {
        this.mMinervaClient.record(((FireOSMetricEventAdapter) metricEvent.getMetricEventDelegate()).getFireOsMetricEvent());
    }

    public void setMinervaClient(AmazonMinerva amazonMinerva) {
        this.mMinervaClient = amazonMinerva;
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaAdapter
    public void shutdown() {
        this.mMinervaClient.shutdown();
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaAdapter
    public void shutdownWithUpload() {
        this.mMinervaClient.shutdown();
    }

    public FireOSAmazonMinervaAdapter() {
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaAdapter
    public void flush() {
    }
}
