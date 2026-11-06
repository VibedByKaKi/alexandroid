package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaCameraCaptureError;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "CAMERA_FAILURE", "OVERHEAT_PROTECTION", "PRIVACY_MODE_ON", "DEVICE_POWER_LOW", "DEVICE_STORAGE_FULL", "CAMERA_BLOCKED", "SHUTTER_CLOSED", "PERMISSION_ERROR", "CAMERA_IN_USE", "CAMERA_UNAVAILABLE", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaCameraCaptureError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaCameraCaptureError[] $VALUES;
    public static final AlexaCameraCaptureError UNKNOWN = new AlexaCameraCaptureError("UNKNOWN", 0);
    public static final AlexaCameraCaptureError CAMERA_FAILURE = new AlexaCameraCaptureError("CAMERA_FAILURE", 1);
    public static final AlexaCameraCaptureError OVERHEAT_PROTECTION = new AlexaCameraCaptureError("OVERHEAT_PROTECTION", 2);
    public static final AlexaCameraCaptureError PRIVACY_MODE_ON = new AlexaCameraCaptureError("PRIVACY_MODE_ON", 3);
    public static final AlexaCameraCaptureError DEVICE_POWER_LOW = new AlexaCameraCaptureError("DEVICE_POWER_LOW", 4);
    public static final AlexaCameraCaptureError DEVICE_STORAGE_FULL = new AlexaCameraCaptureError("DEVICE_STORAGE_FULL", 5);
    public static final AlexaCameraCaptureError CAMERA_BLOCKED = new AlexaCameraCaptureError("CAMERA_BLOCKED", 6);
    public static final AlexaCameraCaptureError SHUTTER_CLOSED = new AlexaCameraCaptureError("SHUTTER_CLOSED", 7);
    public static final AlexaCameraCaptureError PERMISSION_ERROR = new AlexaCameraCaptureError("PERMISSION_ERROR", 8);
    public static final AlexaCameraCaptureError CAMERA_IN_USE = new AlexaCameraCaptureError("CAMERA_IN_USE", 9);
    public static final AlexaCameraCaptureError CAMERA_UNAVAILABLE = new AlexaCameraCaptureError("CAMERA_UNAVAILABLE", 10);

    private static final /* synthetic */ AlexaCameraCaptureError[] $values() {
        return new AlexaCameraCaptureError[]{UNKNOWN, CAMERA_FAILURE, OVERHEAT_PROTECTION, PRIVACY_MODE_ON, DEVICE_POWER_LOW, DEVICE_STORAGE_FULL, CAMERA_BLOCKED, SHUTTER_CLOSED, PERMISSION_ERROR, CAMERA_IN_USE, CAMERA_UNAVAILABLE};
    }

    static {
        AlexaCameraCaptureError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AlexaCameraCaptureError(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaCameraCaptureError> getEntries() {
        return $ENTRIES;
    }

    public static AlexaCameraCaptureError valueOf(String str) {
        return (AlexaCameraCaptureError) Enum.valueOf(AlexaCameraCaptureError.class, str);
    }

    public static AlexaCameraCaptureError[] values() {
        return (AlexaCameraCaptureError[]) $VALUES.clone();
    }
}
