package com.amazon.alexa.accessory.speechapi.vision;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSourceModule;", "", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSourceModuleListener;", "configureCapture", "newConfiguration", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureConfiguration;", "callback", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSourceModuleCallback;", "pauseCapture", "removeListener", "resumeCapture", "startCapture", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "configuration", "stopCapture", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface VisionCaptureSourceModule {
    void addListener(@NotNull VisionCaptureSourceModuleListener listener);

    void configureCapture(@NotNull VisionCaptureConfiguration newConfiguration, @NotNull VisionCaptureSourceModuleCallback callback);

    void pauseCapture(@NotNull VisionCaptureSourceModuleCallback callback);

    void removeListener(@NotNull VisionCaptureSourceModuleListener listener);

    void resumeCapture(@NotNull VisionCaptureSourceModuleCallback callback);

    void startCapture(@NotNull String sessionId, @NotNull VisionCaptureConfiguration configuration, @NotNull VisionCaptureSourceModuleCallback callback);

    void stopCapture(@NotNull VisionCaptureSourceModuleCallback callback);
}
