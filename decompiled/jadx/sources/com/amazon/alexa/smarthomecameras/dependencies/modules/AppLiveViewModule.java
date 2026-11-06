package com.amazon.alexa.smarthomecameras.dependencies.modules;

import android.content.Context;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.smarthomecameras.CameraViewContract;
import com.amazon.alexa.smarthomecameras.eventsender.LiveViewControllerEventSender;
import com.amazon.alexa.smarthomecameras.model.CameraViewModel;
import com.amazon.alexa.smarthomecameras.player.CameraAudioFocusManager;
import com.amazon.alexa.smarthomecameras.ptz.PtzListenerFactory;
import com.amazon.alexa.smarthomecameras.rtcsc.CamerasAppClient;
import com.amazon.alexa.smarthomecameras.service.CamerasMobilyticsService;
import com.amazon.alexa.smarthomecameras.session.CameraSessionManager;
import com.amazon.alexa.smarthomecameras.session.RtcscCameraSessionManager;
import com.amazon.alexa.smarthomecameras.util.AppLifecycleOwner;
import com.amazon.alexa.utils.concurrent.ExecutorFactory;
import com.amazon.rtcsc.interfaces.RtcscAppInfo;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public abstract class AppLiveViewModule {
    private static final String CAMERA_SESSION_MANAGER_EXECUTOR = "camera_session_manager_executor";

    @Provides
    @Singleton
    public static AppLifecycleOwner providesAppLifecycleOwner() {
        return new AppLifecycleOwner();
    }

    @Provides
    @Singleton
    public static CameraAudioFocusManager providesCameraAudioFocusManager(Context context) {
        return new CameraAudioFocusManager(context);
    }

    @Provides
    @Singleton
    public static CameraSessionManager providesCameraSessionManager(Context context, RtcscAppInfo rtcscAppInfo, CamerasAppClient camerasAppClient, @Named("camera_session_manager_executor") ScheduledExecutorService scheduledExecutorService, CamerasMobilyticsService camerasMobilyticsService, LiveViewControllerEventSender liveViewControllerEventSender, CameraAudioFocusManager cameraAudioFocusManager) {
        return new RtcscCameraSessionManager(context, rtcscAppInfo, camerasAppClient, scheduledExecutorService, camerasMobilyticsService, liveViewControllerEventSender, cameraAudioFocusManager);
    }

    @Provides
    @Singleton
    public static CamerasAppClient providesCamerasAppClient(Context context) {
        return new CamerasAppClient(context);
    }

    @Provides
    @Named(CAMERA_SESSION_MANAGER_EXECUTOR)
    public static ScheduledExecutorService providesExecutorService() {
        return ExecutorFactory.newSingleThreadScheduledExecutor(CAMERA_SESSION_MANAGER_EXECUTOR);
    }

    @Provides
    @Singleton
    public static LiveViewControllerEventSender providesLiveViewControllerEventSender(AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2, CamerasMobilyticsService camerasMobilyticsService) {
        return new LiveViewControllerEventSender(alexaMobileFrameworkApisV2, camerasMobilyticsService);
    }

    @Provides
    @Singleton
    public static CameraViewContract.Model providesModel() {
        return new CameraViewModel();
    }

    @Provides
    @Singleton
    public static PtzListenerFactory providesPtzListenerFactory() {
        return new PtzListenerFactory();
    }
}
