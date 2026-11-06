package com.amazon.alexa.pmi.implementation.fluidity;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.pmi.fluidity.FluidityMetricsRecorder;
import com.amazon.alexa.pmi.implementation.taplatency.FrameResponseTracker$$ExternalSyntheticLambda1;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar;
import com.amazon.alexa.protocols.service.api.ComponentGetter;
import com.amazon.alexa.protocols.service.api.InitializableComponent;
import com.amazon.alexa.routing.api.RoutingService;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class FluidityMetricsRecorderImpl implements FluidityMetricsRecorder, InitializableComponent {
    public static final double FROZEN_FRAME_TIME_MS = 700.0d;
    public static final String METRICS_COMPONENT_FLUIDITY = "fluidity";
    private static final String TAG = "FluidityMetricsRecorderImpl";

    @VisibleForTesting(otherwise = 2)
    Double expectedFrameTime;

    @VisibleForTesting(otherwise = 2)
    FeatureServiceV2 featureService;

    @VisibleForTesting(otherwise = 2)
    Handler frameMetricsHandler;

    @VisibleForTesting(otherwise = 2)
    Window.OnFrameMetricsAvailableListener frameMetricsListener;

    @VisibleForTesting(otherwise = 2)
    Double frozenFrameTime;

    @VisibleForTesting(otherwise = 2)
    LifeCycleObserver lifeCycleObserver;

    @VisibleForTesting(otherwise = 2)
    Mobilytics mobilytics;

    @VisibleForTesting(otherwise = 2)
    Double slowFrameTime;
    private Window window;
    private final Object lock = new Object();

    @VisibleForTesting(otherwise = 2)
    HashMap<String, AggregatedFrameMetrics> frameMetrics = new HashMap<>();

    @VisibleForTesting(otherwise = 2)
    Collection<FluidityMetricsUseCase> pausedUseCases = new HashSet();

    public FluidityMetricsRecorderImpl(ComponentGetter componentGetter, Context context) {
        this.mobilytics = (Mobilytics) componentGetter.get(Mobilytics.class).get();
        this.lifeCycleObserver = new LifeCycleObserver((ApplicationLifecycleService) componentGetter.get(ApplicationLifecycleService.class).get(), (MainActivityLifecycleObserverRegistrar) componentGetter.get(MainActivityLifecycleObserverRegistrar.class).get(), (RoutingService) componentGetter.get(RoutingService.class).get(), this);
        this.featureService = (FeatureServiceV2) componentGetter.get(FeatureServiceV2.class).get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$collectFrameData$1(long j, String str, AggregatedFrameMetrics aggregatedFrameMetrics) {
        aggregatedFrameMetrics.incrementFramesRendered();
        double d = j;
        if (d > this.slowFrameTime.doubleValue()) {
            aggregatedFrameMetrics.incrementSlowFrames();
        }
        if (d > this.frozenFrameTime.doubleValue()) {
            aggregatedFrameMetrics.incrementFrozenFrames();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupFrameMetricsListener$2(Window window, FrameMetrics frameMetrics, int i) {
        collectFrameData(new FrameMetrics(frameMetrics));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FluidityMetricsUseCase lambda$stopAllRecordings$0(AggregatedFrameMetrics aggregatedFrameMetrics) {
        return new FluidityMetricsUseCase(aggregatedFrameMetrics.getUseCaseName(), aggregatedFrameMetrics.getOwnerIdentifier());
    }

    private void recordMetric(String str, String str2, String str3, String str4, long j) {
        MobilyticsMetricsCounter createCounter = this.mobilytics.createCounter(str, str2, str3, str4);
        createCounter.incrementCounterByValue(j);
        this.mobilytics.recordCounter(createCounter);
    }

    @SuppressFBWarnings({"DCN_NULLPOINTER_EXCEPTION"})
    private void removeFrameMetricsListener() {
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.frameMetricsListener;
        if (onFrameMetricsAvailableListener != null) {
            try {
                this.window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
            } catch (IllegalArgumentException | NullPointerException e) {
                Log.e(TAG, "Failed to remove frameMetricsListener, no matching observer was found", e);
            }
            this.frameMetricsListener = null;
        }
    }

    private void setupFrameMetricsListener() {
        if (this.frameMetricsListener == null) {
            FrameResponseTracker$$ExternalSyntheticLambda1 frameResponseTracker$$ExternalSyntheticLambda1 = new FrameResponseTracker$$ExternalSyntheticLambda1(this, 1);
            this.frameMetricsListener = frameResponseTracker$$ExternalSyntheticLambda1;
            this.window.addOnFrameMetricsAvailableListener(frameResponseTracker$$ExternalSyntheticLambda1, this.frameMetricsHandler);
        }
    }

    @VisibleForTesting(otherwise = 2)
    public void collectFrameData(FrameMetrics frameMetrics) {
        final long metric = frameMetrics.getMetric(8) / 1000000;
        synchronized (this.lock) {
            this.frameMetrics.forEach(new BiConsumer() { // from class: com.amazon.alexa.pmi.implementation.fluidity.FluidityMetricsRecorderImpl$$ExternalSyntheticLambda1
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    FluidityMetricsRecorderImpl.this.lambda$collectFrameData$1(metric, (String) obj, (AggregatedFrameMetrics) obj2);
                }
            });
        }
    }

    public Window getWindow() {
        return this.window;
    }

    @Override // com.amazon.alexa.pmi.fluidity.FluidityMetricsRecorder
    public void initialize(Window window) {
        setWindow(window);
        this.lifeCycleObserver.start();
    }

    public boolean isRecording(String str) {
        boolean containsKey;
        synchronized (this.lock) {
            containsKey = this.frameMetrics.containsKey(str);
        }
        return containsKey;
    }

    public void pauseAllRecordings() {
        stopAllRecordings(true);
    }

    @VisibleForTesting(otherwise = 2)
    public void reportMetrics(String str, AggregatedFrameMetrics aggregatedFrameMetrics) {
        if (aggregatedFrameMetrics.hasSlowFrames()) {
            recordMetric("rendering.slow-frames", str, METRICS_COMPONENT_FLUIDITY, aggregatedFrameMetrics.getOwnerIdentifier(), aggregatedFrameMetrics.getSlowFrames());
            recordMetric("rendering.slow-frames-bps", str, METRICS_COMPONENT_FLUIDITY, aggregatedFrameMetrics.getOwnerIdentifier(), aggregatedFrameMetrics.slowFramesBps());
            recordMetric("rendering.frozen-frames", str, METRICS_COMPONENT_FLUIDITY, aggregatedFrameMetrics.getOwnerIdentifier(), aggregatedFrameMetrics.getFrozenFrames());
            recordMetric("rendering.frozen-frames-bps", str, METRICS_COMPONENT_FLUIDITY, aggregatedFrameMetrics.getOwnerIdentifier(), aggregatedFrameMetrics.frozenFramesBps());
        }
    }

    public void resumeAllRecordings() {
        synchronized (this.lock) {
            try {
                if (this.pausedUseCases.isEmpty()) {
                    return;
                }
                for (FluidityMetricsUseCase fluidityMetricsUseCase : this.pausedUseCases) {
                    startRecording(fluidityMetricsUseCase.name, fluidityMetricsUseCase.ownerIdentifier);
                }
                this.pausedUseCases.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setWindow(@NonNull Window window) {
        this.window = window;
        double refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        if (refreshRate <= 0.0d) {
            refreshRate = 60.0d;
        }
        Double valueOf = Double.valueOf(1000.0d / refreshRate);
        this.expectedFrameTime = valueOf;
        this.slowFrameTime = Double.valueOf(valueOf.doubleValue() * 1.1d);
        this.frozenFrameTime = Double.valueOf(700.0d);
    }

    @Override // com.amazon.alexa.pmi.fluidity.FluidityMetricsRecorder
    public void startRecording(String str, String str2) {
        if (this.window == null) {
            Log.w(TAG, "Cannot start recording for name " + str + " as window is not available.");
            return;
        }
        synchronized (this.lock) {
            try {
                if (this.frameMetricsHandler == null) {
                    this.frameMetricsHandler = new Handler(Looper.getMainLooper());
                }
                if (!this.frameMetrics.containsKey(str)) {
                    setupFrameMetricsListener();
                    this.frameMetrics.put(str, new AggregatedFrameMetrics(new FluidityMetricsUseCase(str, str2)));
                } else {
                    Log.w(TAG, "Fluidity metrics for " + str + " are already being recorded.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void stopAllRecordings(boolean z) {
        synchronized (this.lock) {
            try {
                Collection<FluidityMetricsUseCase> collection = (Collection) this.frameMetrics.values().stream().map(new FluidityMetricsRecorderImpl$$ExternalSyntheticLambda2()).collect(Collectors.toList());
                Iterator<FluidityMetricsUseCase> it2 = collection.iterator();
                while (it2.hasNext()) {
                    stopRecording(it2.next().name);
                }
                if (z) {
                    this.pausedUseCases = collection;
                } else {
                    this.pausedUseCases = new HashSet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.pmi.fluidity.FluidityMetricsRecorder
    public void stopRecording(String str) {
        synchronized (this.lock) {
            try {
                AggregatedFrameMetrics aggregatedFrameMetrics = this.frameMetrics.get(str);
                if (aggregatedFrameMetrics != null) {
                    reportMetrics(str, aggregatedFrameMetrics);
                    this.frameMetrics.remove(str);
                    if (this.frameMetrics.isEmpty()) {
                        removeFrameMetricsListener();
                    }
                    return;
                }
                Log.e(TAG, "Cannot stop recording for useCase " + str + " as it has not started recording.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.protocols.service.api.InitializableComponent
    public void initializeComponent(@NonNull ComponentGetter componentGetter, @NonNull Context context) {
    }

    public void stopAllRecordings() {
        stopAllRecordings(false);
    }
}
