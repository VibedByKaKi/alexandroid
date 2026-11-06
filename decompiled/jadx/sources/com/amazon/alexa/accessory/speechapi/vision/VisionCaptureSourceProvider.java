package com.amazon.alexa.accessory.speechapi.vision;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSourceProvider;", "", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSourceProviderListener;", "getAvailableCaptureSources", "callback", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSourceProviderCallback;", "getCaptureSourceCapabilities", "captureSource", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSource;", "getId", "makeModule", "removeListener", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface VisionCaptureSourceProvider {
    void addListener(@NotNull VisionCaptureSourceProviderListener listener);

    void getAvailableCaptureSources(@NotNull VisionCaptureSourceProviderCallback callback);

    void getCaptureSourceCapabilities(@NotNull VisionCaptureSource captureSource, @NotNull VisionCaptureSourceProviderCallback callback);

    void getId(@NotNull VisionCaptureSourceProviderCallback callback);

    void makeModule(@NotNull VisionCaptureSource captureSource, @NotNull VisionCaptureSourceProviderCallback callback);

    void removeListener(@NotNull VisionCaptureSourceProviderListener listener);
}
