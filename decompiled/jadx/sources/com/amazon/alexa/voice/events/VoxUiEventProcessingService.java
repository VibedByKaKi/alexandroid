package com.amazon.alexa.voice.events;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;
import com.amazon.alexa.voice.ui.onedesign.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoxUiEventProcessingService {
    private final List<VoxUiEventProcessor> eventProcessors;

    @VisibleForTesting
    public VoxUiEventProcessingService(VoxUiEventProcessor... voxUiEventProcessorArr) {
        this.eventProcessors = new ArrayList();
        for (VoxUiEventProcessor voxUiEventProcessor : voxUiEventProcessorArr) {
            this.eventProcessors.add(voxUiEventProcessor);
        }
    }

    private synchronized void processInternally(VoxUiEvent voxUiEvent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Logger.verbose("VoxUiEventProcessingService event received:" + voxUiEvent.getName());
        synchronized (this.eventProcessors) {
            try {
                Iterator<VoxUiEventProcessor> it2 = this.eventProcessors.iterator();
                while (it2.hasNext()) {
                    it2.next().process(voxUiEvent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Logger.verbose("VoxUiEventProcessingService.process() takes time(ms) : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void process(VoxUiEvent voxUiEvent) {
        processInternally(voxUiEvent);
    }

    public void registerEventProcessor(VoxUiEventProcessor voxUiEventProcessor) {
        synchronized (this.eventProcessors) {
            this.eventProcessors.add(voxUiEventProcessor);
        }
    }

    public void unregisterEventProcessor(VoxUiEventProcessor voxUiEventProcessor) {
        synchronized (this.eventProcessors) {
            this.eventProcessors.remove(voxUiEventProcessor);
        }
    }

    public VoxUiEventProcessingService(VoxMetricEventProcessingService voxMetricEventProcessingService) {
        this(new VoxUiEventToMetricEventProcessor(voxMetricEventProcessingService));
    }
}
