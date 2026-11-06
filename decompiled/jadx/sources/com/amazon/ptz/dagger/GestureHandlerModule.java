package com.amazon.ptz.dagger;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.amazon.alexa.rangecontroller.lib.model.serialization.RcSerializer;
import com.amazon.ptz.digital.DigitalPtzGestureHandler;
import com.amazon.ptz.digital.DigitalZoomState;
import com.amazon.ptz.gestures.handlers.GestureHandler;
import com.amazon.ptz.gestures.handlers.GestureRouter;
import com.amazon.ptz.metrics.MetricRecorder;
import com.amazon.ptz.physical.PhysicalPtzGestureHandler;
import com.amazon.ptz.physical.communication.PhysicalPtzCommandCache;
import com.amazon.ptz.physical.communication.PhysicalPtzDirectiveSender;
import com.amazon.ptzcontroller.lib.model.api.ptz.directive.CameraPtzInstance;
import dagger.Module;
import dagger.Provides;
import java.util.List;
import javax.inject.Singleton;
import org.greenrobot.eventbus.EventBus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public class GestureHandlerModule {
    @Provides
    @Singleton
    public DigitalPtzGestureHandler provideDigitalPtzGestureHandler(View view, DigitalZoomState digitalZoomState, MetricRecorder metricRecorder, EventBus eventBus) {
        return new DigitalPtzGestureHandler(view, digitalZoomState, metricRecorder, eventBus);
    }

    @Provides
    @Singleton
    public DigitalZoomState provideDigitalZoomState(View view) {
        return new DigitalZoomState(view);
    }

    @Provides
    @Singleton
    public DisplayMetrics provideDisplayMetrics(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    @Provides
    @Singleton
    @GestureHandler.Router
    public GestureHandler provideGestureRouter(DigitalPtzGestureHandler digitalPtzGestureHandler, PhysicalPtzGestureHandler physicalPtzGestureHandler) {
        return new GestureRouter(digitalPtzGestureHandler, physicalPtzGestureHandler);
    }

    @Provides
    @Singleton
    public PhysicalPtzGestureHandler providePhysicalPtzGestureHandler(PhysicalPtzDirectiveSender physicalPtzDirectiveSender, List<CameraPtzInstance> list, DigitalZoomState digitalZoomState, PhysicalPtzCommandCache physicalPtzCommandCache, DisplayMetrics displayMetrics, RcSerializer rcSerializer, MetricRecorder metricRecorder) {
        return new PhysicalPtzGestureHandler(physicalPtzDirectiveSender, list, digitalZoomState, physicalPtzCommandCache, displayMetrics.heightPixels, displayMetrics.widthPixels, rcSerializer, metricRecorder);
    }
}
