package com.amazon.alexa.accessory.frames.media.autoimport;

import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/AutoImportTrigger;", "", "metricSuffix", "", "enabled", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getMetricSuffix", "()Ljava/lang/String;", "getEnabled", "()Z", "ASSET_NOTIFICATION", "DEVICE_CONNECTED", AlexaMetricsConstants.MetricEvents.APP_RESUME, "DEVICE_CHARGING", "POST_IMPORT_RECHECK", "SETTINGS_ENABLED", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoImportTrigger {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AutoImportTrigger[] $VALUES;
    private final boolean enabled;

    @NotNull
    private final String metricSuffix;
    public static final AutoImportTrigger ASSET_NOTIFICATION = new AutoImportTrigger("ASSET_NOTIFICATION", 0, "_asset_notification", true);
    public static final AutoImportTrigger DEVICE_CONNECTED = new AutoImportTrigger("DEVICE_CONNECTED", 1, "_device_connected", true);
    public static final AutoImportTrigger APP_RESUME = new AutoImportTrigger(AlexaMetricsConstants.MetricEvents.APP_RESUME, 2, "_app_resume", true);
    public static final AutoImportTrigger DEVICE_CHARGING = new AutoImportTrigger("DEVICE_CHARGING", 3, "_device_charging", true);
    public static final AutoImportTrigger POST_IMPORT_RECHECK = new AutoImportTrigger("POST_IMPORT_RECHECK", 4, "_post_import_recheck", true);
    public static final AutoImportTrigger SETTINGS_ENABLED = new AutoImportTrigger("SETTINGS_ENABLED", 5, "_settings_enabled", true);

    private static final /* synthetic */ AutoImportTrigger[] $values() {
        return new AutoImportTrigger[]{ASSET_NOTIFICATION, DEVICE_CONNECTED, APP_RESUME, DEVICE_CHARGING, POST_IMPORT_RECHECK, SETTINGS_ENABLED};
    }

    static {
        AutoImportTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AutoImportTrigger(String str, int i, String str2, boolean z) {
        this.metricSuffix = str2;
        this.enabled = z;
    }

    @NotNull
    public static EnumEntries<AutoImportTrigger> getEntries() {
        return $ENTRIES;
    }

    public static AutoImportTrigger valueOf(String str) {
        return (AutoImportTrigger) Enum.valueOf(AutoImportTrigger.class, str);
    }

    public static AutoImportTrigger[] values() {
        return (AutoImportTrigger[]) $VALUES.clone();
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getMetricSuffix() {
        return this.metricSuffix;
    }
}
