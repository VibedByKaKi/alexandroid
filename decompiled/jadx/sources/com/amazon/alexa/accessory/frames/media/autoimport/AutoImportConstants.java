package com.amazon.alexa.accessory.frames.media.autoimport;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/AutoImportConstants;", "", "<init>", "()V", "CRITICAL_DEVICE_BATTERY", "", "CRITICAL_PHONE_BATTERY", "DEFAULT_MIN_BATTERY_LEVEL", "CRITICAL_STORAGE_THRESHOLD", "", "DEVICE_THERMAL_STATE_FEATURE", "UNSAFE_DEVICE_THERMAL_LEVEL", "THERMAL_STATE_READ_TIMEOUT_SECONDS", "ZEN_DEVICE_TYPE", "", "ZION_DEVICE_TYPE", "PREF_NAME", "PREF_AUTO_IMPORT_ENABLED", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoImportConstants {
    public static final int CRITICAL_DEVICE_BATTERY = 15;
    public static final int CRITICAL_PHONE_BATTERY = 15;
    public static final long CRITICAL_STORAGE_THRESHOLD = 500000000;
    public static final int DEFAULT_MIN_BATTERY_LEVEL = 20;
    public static final int DEVICE_THERMAL_STATE_FEATURE = 1812;

    @NotNull
    public static final AutoImportConstants INSTANCE = new AutoImportConstants();

    @NotNull
    public static final String PREF_AUTO_IMPORT_ENABLED = "auto_import_enabled";

    @NotNull
    public static final String PREF_NAME = "auto_import_preferences";
    public static final long THERMAL_STATE_READ_TIMEOUT_SECONDS = 5;
    public static final int UNSAFE_DEVICE_THERMAL_LEVEL = 3;

    @NotNull
    public static final String ZEN_DEVICE_TYPE = "ZEN";

    @NotNull
    public static final String ZION_DEVICE_TYPE = "ZION";

    private AutoImportConstants() {
    }
}
