package com.amazon.appmanager.lib.metrics;

import android.content.Context;
import android.util.Log;
import com.amazon.alexa.voice.ui.VoiceActivity$$ExternalSyntheticLambda4;
import com.amazon.maft.metrics.PreloadMetrics;
import com.amazon.maft.metrics.PreloadMetricsFactory;
import com.amazon.minerva.client.common.api.AmazonMinerva;
import com.amazon.minerva.client.common.api.AmazonMinervaClientBuilder;
import com.amazon.minerva.client.common.api.MetricEvent;
import com.amazon.minerva.client.common.api.MinervaVersion;
import com.amazon.minerva.client.common.api.MinervaVersionChecker;
import com.amazon.minerva.client.common.api.Predefined;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MaftPreloadMetricsFactory implements PreloadMetricsFactory {
    public static final String DEVICE_TYPE = "A1MPSLFC7L5AFK";
    public static final String REGION = "us-east-1";
    static Context appContext;
    private AmazonMinerva minervaClient;

    public MaftPreloadMetricsFactory(Context context) {
        synchronized (MaftPreloadMetricsFactory.class) {
            try {
                if (this.minervaClient == null) {
                    MinervaVersionChecker minervaVersionChecker = MinervaVersionChecker.getInstance(context);
                    appContext = context.getApplicationContext();
                    if (minervaVersionChecker.isVersionSupported(MinervaVersion.BASE)) {
                        this.minervaClient = AmazonMinervaClientBuilder.standard(context).withRegion("us-east-1").withDeviceType(DEVICE_TYPE).withOAuthProvider(new VoiceActivity$$ExternalSyntheticLambda4(23)).withChildProfileVerifier(new MaftDefaultChildProfileVerifier()).withUserControlVerifier(new MaftDefaultUserControlVerifier()).withUseDES(true).withRunInitialUpload(true).build();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0() throws Exception {
        throw new Exception("No Access token");
    }

    public void flush() {
        AmazonMinerva amazonMinerva = this.minervaClient;
        if (amazonMinerva != null) {
            amazonMinerva.flush();
        }
    }

    @Override // com.amazon.maft.metrics.PreloadMetricsFactory
    public PreloadMetrics newPreloadMetrics(String... strArr) {
        final MetricEvent metricEvent = new MetricEvent(strArr[0], strArr[1]);
        return new PreloadMetrics() { // from class: com.amazon.appmanager.lib.metrics.MaftPreloadMetricsFactory.1
            @Override // com.amazon.maft.metrics.PreloadMetrics
            public PreloadMetrics addCount(String str, double d) {
                metricEvent.addDouble(str, d);
                return this;
            }

            @Override // com.amazon.maft.metrics.PreloadMetrics
            public PreloadMetrics addCustomerId() {
                metricEvent.addPredefined(Predefined.CUSTOMER_ID);
                return this;
            }

            @Override // com.amazon.maft.metrics.PreloadMetrics
            public PreloadMetrics addDeviceId() {
                metricEvent.addPredefined(Predefined.DEVICE_ID);
                return this;
            }

            @Override // com.amazon.maft.metrics.PreloadMetrics
            public PreloadMetrics addDeviceType() {
                metricEvent.addPredefined(Predefined.DEVICE_TYPE);
                return this;
            }

            @Override // com.amazon.maft.metrics.PreloadMetrics
            public PreloadMetrics addProperty(String str, String str2) {
                metricEvent.addString(str, str2);
                return this;
            }

            @Override // com.amazon.maft.metrics.PreloadMetrics
            public PreloadMetrics addTime(String str, double d) {
                metricEvent.addDouble(str, d);
                return this;
            }

            @Override // com.amazon.maft.metrics.PreloadMetrics
            public void record() {
                if ((MaftPreloadMetricsFactory.appContext.getApplicationInfo().flags & 2) > 0) {
                    Log.i("MaftPreloadMetricsFactory", metricEvent.toString());
                }
                MaftPreloadMetricsFactory.this.minervaClient.record(metricEvent);
            }
        };
    }

    public void shutdown() {
        AmazonMinerva amazonMinerva = this.minervaClient;
        if (amazonMinerva != null) {
            amazonMinerva.shutdown();
        }
    }

    public MaftPreloadMetricsFactory() {
    }
}
