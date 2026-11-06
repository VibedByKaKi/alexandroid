package com.amazon.alexa.accessory.speechapi.vision;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.library.NativeLibraryConstantsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSourceProviderListener;", "", "onAvailabilityChanged", "", NativeLibraryConstantsKt.KONAN_DISTRIBUTION_SOURCES_DIR, "", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSource;", "onError", "error", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureError;", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface VisionCaptureSourceProviderListener {
    void onAvailabilityChanged(@NotNull List<VisionCaptureSource> sources);

    void onError(@NotNull VisionCaptureError error);
}
