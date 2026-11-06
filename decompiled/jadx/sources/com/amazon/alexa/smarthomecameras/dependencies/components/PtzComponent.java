package com.amazon.alexa.smarthomecameras.dependencies.components;

import com.amazon.alexa.smarthomecameras.dependencies.modules.CameraMetricsModule;
import com.amazon.alexa.smarthomecameras.dependencies.modules.ContextModule;
import com.amazon.alexa.smarthomecameras.dependencies.modules.FeatureServiceV2Module;
import com.amazon.alexa.smarthomecameras.dependencies.modules.GsonModule;
import com.amazon.alexa.smarthomecameras.dependencies.modules.PtzModule;
import com.amazon.alexa.smarthomecameras.handlers.LiveViewPtzListener;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {PtzModule.class, GsonModule.class, ContextModule.class, CameraMetricsModule.class, FeatureServiceV2Module.class})
@Singleton
/* loaded from: classes19.dex */
public interface PtzComponent {
    @Singleton
    LiveViewPtzListener getPtzListener();
}
