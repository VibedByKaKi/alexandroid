package com.amazon.alexa.voice.metrics;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.metrics.service.MetricsService;
import com.amazon.alexa.voice.ui.onedesign.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoxMetricEventProcessingService {
    private final List<VoxMetricEventProcessor> eventProcessors;

    public VoxMetricEventProcessingService(MetricsService metricsService) {
        ArrayList arrayList = new ArrayList();
        this.eventProcessors = arrayList;
        arrayList.add(new VoxScrimShownLatencyMetricsReporter(metricsService));
        arrayList.add(new VoxSingleEventMetricReporter(metricsService));
        arrayList.add(new VoxFtueMetricsReporter(metricsService));
        arrayList.add(new VoxLocaleMetricsReporter(metricsService));
        arrayList.add(new SDKReadinessMetricsReporter(metricsService));
    }

    private synchronized void processInternally(VoxMetricEvent voxMetricEvent) {
        Logger.verbose("VoxMetricEventProcessingService event received:" + voxMetricEvent.getName());
        Iterator<VoxMetricEventProcessor> it2 = this.eventProcessors.iterator();
        while (it2.hasNext()) {
            it2.next().process(voxMetricEvent);
        }
    }

    public void process(VoxMetricEvent voxMetricEvent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        processInternally(voxMetricEvent);
        Logger.verbose("VoxMetricEventProcessingService.process() takes time(ms) : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @VisibleForTesting
    public VoxMetricEventProcessingService(VoxMetricEventProcessor... voxMetricEventProcessorArr) {
        this.eventProcessors = new ArrayList();
        for (VoxMetricEventProcessor voxMetricEventProcessor : voxMetricEventProcessorArr) {
            this.eventProcessors.add(voxMetricEventProcessor);
        }
    }
}
