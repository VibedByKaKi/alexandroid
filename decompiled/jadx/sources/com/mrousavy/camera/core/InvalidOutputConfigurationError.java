package com.mrousavy.camera.core;

import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/mrousavy/camera/core/InvalidOutputConfigurationError;", "Lcom/mrousavy/camera/core/CameraError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InvalidOutputConfigurationError extends CameraError {
    public InvalidOutputConfigurationError(@Nullable Throwable th) {
        super(OperationalEventType.SESSION, "invalid-output-configuration", "Failed to configure the Camera Session because the output/stream configurations are invalid!", th);
    }
}
