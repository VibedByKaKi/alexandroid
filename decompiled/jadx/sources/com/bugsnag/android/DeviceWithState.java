package com.bugsnag.android;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.Date;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bs\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0015\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0010¢\u0006\u0002\b'R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/bugsnag/android/DeviceWithState;", "Lcom/bugsnag/android/Device;", "buildInfo", "Lcom/bugsnag/android/DeviceBuildInfo;", "jailbroken", "", "id", "", "locale", "totalMemory", "", "runtimeVersions", "", "", "freeDisk", "freeMemory", ModelSourceWrapper.ORIENTATION, "time", "Ljava/util/Date;", "(Lcom/bugsnag/android/DeviceBuildInfo;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Date;)V", "getFreeDisk", "()Ljava/lang/Long;", "setFreeDisk", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFreeMemory", "setFreeMemory", "getOrientation", "()Ljava/lang/String;", "setOrientation", "(Ljava/lang/String;)V", "getTime", "()Ljava/util/Date;", "setTime", "(Ljava/util/Date;)V", "serializeFields", "", "writer", "Lcom/bugsnag/android/JsonStream;", "serializeFields$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class DeviceWithState extends Device {

    @Nullable
    private Long freeDisk;

    @Nullable
    private Long freeMemory;

    @Nullable
    private String orientation;

    @Nullable
    private Date time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceWithState(@NotNull DeviceBuildInfo deviceBuildInfo, @Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable Long l, @NotNull Map<String, Object> map, @Nullable Long l2, @Nullable Long l3, @Nullable String str3, @Nullable Date date) {
        super(deviceBuildInfo, deviceBuildInfo.getCpuAbis(), bool, str, str2, l, map);
        deviceBuildInfo.getClass();
        map.getClass();
        this.freeDisk = l2;
        this.freeMemory = l3;
        this.orientation = str3;
        this.time = date;
    }

    @Nullable
    public final Long getFreeDisk() {
        return this.freeDisk;
    }

    @Nullable
    public final Long getFreeMemory() {
        return this.freeMemory;
    }

    @Nullable
    public final String getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final Date getTime() {
        return this.time;
    }

    @Override // com.bugsnag.android.Device
    public void serializeFields$bugsnag_android_core_release(@NotNull JsonStream writer) {
        writer.getClass();
        super.serializeFields$bugsnag_android_core_release(writer);
        writer.name("freeDisk").value((Number) this.freeDisk);
        writer.name("freeMemory").value((Number) this.freeMemory);
        writer.name(ModelSourceWrapper.ORIENTATION).value(this.orientation);
        if (this.time != null) {
            writer.name("time").value(this.time);
        }
    }

    public final void setFreeDisk(@Nullable Long l) {
        this.freeDisk = l;
    }

    public final void setFreeMemory(@Nullable Long l) {
        this.freeMemory = l;
    }

    public final void setOrientation(@Nullable String str) {
        this.orientation = str;
    }

    public final void setTime(@Nullable Date date) {
        this.time = date;
    }
}
