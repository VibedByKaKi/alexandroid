package com.bugsnag.android;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.TaskType;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tJ\b\u00102\u001a\u00020-H\u0007J\u000f\u00103\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0002\u00104J\u000f\u00105\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0002\u00104J\b\u00106\u001a\u00020 H\u0002J\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020-J\u000e\u0010<\u001a\u00020:2\u0006\u0010;\u001a\u00020-J\u0011\u0010=\u001a\b\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\u0010>J\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010@J\n\u0010A\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010B\u001a\u00020\tH\u0002J\u000f\u0010C\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\bDJ\u000f\u0010E\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0002\u0010FJ\u000f\u0010G\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010HJ\n\u0010I\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010J\u001a\u00020 H\u0002J\b\u0010K\u001a\u00020 H\u0002J\u001e\u0010L\u001a\u00020/2\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010'H\u0002J\u0012\u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010%H\u0002J\u0015\u0010O\u001a\u00020 2\u0006\u0010P\u001a\u00020\u001dH\u0000¢\u0006\u0002\bQR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u0004\u0018\u00010)X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/bugsnag/android/DeviceDataCollector;", "", "connectivity", "Lcom/bugsnag/android/Connectivity;", "appContext", "Landroid/content/Context;", "resources", "Landroid/content/res/Resources;", "deviceId", "", "internalDeviceId", "buildInfo", "Lcom/bugsnag/android/DeviceBuildInfo;", "dataDirectory", "Ljava/io/File;", "rootDetector", "Lcom/bugsnag/android/RootDetector;", "bgTaskService", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "logger", "Lcom/bugsnag/android/Logger;", "(Lcom/bugsnag/android/Connectivity;Landroid/content/Context;Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/DeviceBuildInfo;Ljava/io/File;Lcom/bugsnag/android/RootDetector;Lcom/bugsnag/android/internal/BackgroundTaskService;Lcom/bugsnag/android/Logger;)V", "cpuAbi", "", "[Ljava/lang/String;", "displayMetrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "dpi", "", "Ljava/lang/Integer;", "emulator", "", "locale", ModelSourceWrapper.ORIENTATION, "Ljava/util/concurrent/atomic/AtomicInteger;", "rootedFuture", "Ljava/util/concurrent/Future;", "runtimeVersions", "", "screenDensity", "", "Ljava/lang/Float;", "screenResolution", "totalMemoryFuture", "", "addRuntimeVersionInfo", "", "key", "value", "calculateFreeDisk", "calculateFreeMemory", "()Ljava/lang/Long;", "calculateTotalMemory", "checkIsRooted", "generateDevice", "Lcom/bugsnag/android/Device;", "generateDeviceWithState", "Lcom/bugsnag/android/DeviceWithState;", "now", "generateInternalDeviceWithState", "getCpuAbi", "()[Ljava/lang/String;", "getDeviceMetadata", "", "getLocationStatus", "getNetworkAccess", "getOrientationAsString", "getOrientationAsString$bugsnag_android_core_release", "getScreenDensity", "()Ljava/lang/Float;", "getScreenDensityDpi", "()Ljava/lang/Integer;", "getScreenResolution", "isEmulator", "isLocationEnabled", "populateBatteryInfo", "into", "retrieveTotalDeviceMemory", "updateOrientation", "newOrientation", "updateOrientation$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class DeviceDataCollector {
    private final Context appContext;
    private final BackgroundTaskService bgTaskService;
    private final DeviceBuildInfo buildInfo;
    private final Connectivity connectivity;
    private final String[] cpuAbi;
    private final File dataDirectory;
    private final String deviceId;
    private final DisplayMetrics displayMetrics;
    private final Integer dpi;
    private final boolean emulator;
    private final String internalDeviceId;
    private final String locale;
    private final Logger logger;
    private AtomicInteger orientation;
    private final Future<Boolean> rootedFuture;
    private Map<String, Object> runtimeVersions;
    private final Float screenDensity;
    private final String screenResolution;
    private final Future<Long> totalMemoryFuture;

    public DeviceDataCollector(@NotNull Connectivity connectivity, @NotNull Context context, @NotNull Resources resources, @Nullable String str, @Nullable String str2, @NotNull DeviceBuildInfo deviceBuildInfo, @NotNull File file, @NotNull final RootDetector rootDetector, @NotNull BackgroundTaskService backgroundTaskService, @NotNull Logger logger) {
        Future<Boolean> future;
        connectivity.getClass();
        context.getClass();
        resources.getClass();
        deviceBuildInfo.getClass();
        file.getClass();
        rootDetector.getClass();
        backgroundTaskService.getClass();
        logger.getClass();
        this.connectivity = connectivity;
        this.appContext = context;
        this.deviceId = str;
        this.internalDeviceId = str2;
        this.buildInfo = deviceBuildInfo;
        this.dataDirectory = file;
        this.bgTaskService = backgroundTaskService;
        this.logger = logger;
        this.displayMetrics = resources.getDisplayMetrics();
        this.emulator = isEmulator();
        this.screenDensity = getScreenDensity();
        this.dpi = getScreenDensityDpi();
        this.screenResolution = getScreenResolution();
        String locale = Locale.getDefault().toString();
        locale.getClass();
        this.locale = locale;
        this.cpuAbi = getCpuAbi();
        this.totalMemoryFuture = retrieveTotalDeviceMemory();
        this.orientation = new AtomicInteger(resources.getConfiguration().orientation);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer apiLevel = deviceBuildInfo.getApiLevel();
        if (apiLevel != null) {
            linkedHashMap.put("androidApiLevel", Integer.valueOf(apiLevel.intValue()));
        }
        String osBuild = deviceBuildInfo.getOsBuild();
        if (osBuild != null) {
            linkedHashMap.put("osBuild", osBuild);
        }
        this.runtimeVersions = linkedHashMap;
        try {
            future = backgroundTaskService.submitTask(TaskType.IO, new Callable<Boolean>() { // from class: com.bugsnag.android.DeviceDataCollector.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public final Boolean call() {
                    return Boolean.valueOf(RootDetector.this.isRooted());
                }
            });
        } catch (RejectedExecutionException e) {
            this.logger.w("Failed to perform root detection checks", e);
            future = null;
        }
        this.rootedFuture = future;
    }

    private final Long calculateFreeMemory() {
        Long l;
        Object m25294constructorimpl;
        ActivityManager activityManagerFrom = ContextExtensionsKt.getActivityManagerFrom(this.appContext);
        if (activityManagerFrom != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManagerFrom.getMemoryInfo(memoryInfo);
            l = Long.valueOf(memoryInfo.availMem);
        } else {
            l = null;
        }
        if (l != null) {
            return l;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl((Long) Process.class.getDeclaredMethod("getFreeMemory", null).invoke(null, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        return (Long) (Result.m25300isFailureimpl(m25294constructorimpl) ? null : m25294constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long calculateTotalMemory() {
        Long l;
        Object m25294constructorimpl;
        ActivityManager activityManagerFrom = ContextExtensionsKt.getActivityManagerFrom(this.appContext);
        if (activityManagerFrom != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManagerFrom.getMemoryInfo(memoryInfo);
            l = Long.valueOf(memoryInfo.totalMem);
        } else {
            l = null;
        }
        if (l != null) {
            return l;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl((Long) Process.class.getDeclaredMethod("getTotalMemory", null).invoke(null, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        return (Long) (Result.m25300isFailureimpl(m25294constructorimpl) ? null : m25294constructorimpl);
    }

    private final boolean checkIsRooted() {
        try {
            Future<Boolean> future = this.rootedFuture;
            if (future != null) {
                Boolean bool = future.get();
                bool.getClass();
                if (bool.booleanValue()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private final String getLocationStatus() {
        try {
            return isLocationEnabled() ? "allowed" : "disallowed";
        } catch (Exception unused) {
            this.logger.w("Could not get locationStatus");
            return null;
        }
    }

    private final String getNetworkAccess() {
        return this.connectivity.retrieveNetworkAccessState();
    }

    private final Float getScreenDensity() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics != null) {
            return Float.valueOf(displayMetrics.density);
        }
        return null;
    }

    private final Integer getScreenDensityDpi() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics != null) {
            return Integer.valueOf(displayMetrics.densityDpi);
        }
        return null;
    }

    private final String getScreenResolution() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics == null) {
            return null;
        }
        int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        DisplayMetrics displayMetrics2 = this.displayMetrics;
        int min = Math.min(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
        StringBuilder sb = new StringBuilder();
        sb.append(max);
        sb.append('x');
        sb.append(min);
        return sb.toString();
    }

    private final boolean isEmulator() {
        boolean startsWith$default;
        boolean contains$default;
        boolean contains$default2;
        String fingerprint = this.buildInfo.getFingerprint();
        if (fingerprint == null) {
            return false;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(fingerprint, "unknown", false, 2, null);
        if (startsWith$default) {
            return true;
        }
        contains$default = StringsKt__StringsKt.contains$default(fingerprint, "generic", false, 2, (Object) null);
        if (contains$default) {
            return true;
        }
        contains$default2 = StringsKt__StringsKt.contains$default(fingerprint, "vbox", false, 2, (Object) null);
        return contains$default2;
    }

    private final boolean isLocationEnabled() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.appContext;
        if (i >= 31) {
            LocationManager locationManager = ContextExtensionsKt.getLocationManager(context);
            return locationManager != null && locationManager.isLocationEnabled();
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed");
        return string != null && string.length() > 0;
    }

    private final void populateBatteryInfo(Map<String, Object> into) {
        boolean z;
        try {
            Intent registerReceiverSafe = ContextExtensionsKt.registerReceiverSafe(this.appContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), this.logger);
            if (registerReceiverSafe != null) {
                int intExtra = registerReceiverSafe.getIntExtra(ModelTransformer.KEY_BATTERY_LEVEL, -1);
                int intExtra2 = registerReceiverSafe.getIntExtra(ModelTransformer.KEY_BATTERY_SCALE, -1);
                if (intExtra != -1 || intExtra2 != -1) {
                    into.put("batteryLevel", Float.valueOf(intExtra / intExtra2));
                }
                int intExtra3 = registerReceiverSafe.getIntExtra("status", -1);
                if (intExtra3 != 2 && intExtra3 != 5) {
                    z = false;
                    into.put("charging", Boolean.valueOf(z));
                }
                z = true;
                into.put("charging", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
            this.logger.w("Could not get battery status");
        }
    }

    private final Future<Long> retrieveTotalDeviceMemory() {
        try {
            return this.bgTaskService.submitTask(TaskType.DEFAULT, new Callable<Long>() { // from class: com.bugsnag.android.DeviceDataCollector$retrieveTotalDeviceMemory$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                @Nullable
                public final Long call() {
                    Long calculateTotalMemory;
                    calculateTotalMemory = DeviceDataCollector.this.calculateTotalMemory();
                    return calculateTotalMemory;
                }
            });
        } catch (RejectedExecutionException e) {
            this.logger.w("Failed to lookup available device memory", e);
            return null;
        }
    }

    public final void addRuntimeVersionInfo(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.runtimeVersions);
        mutableMap.put(key, value);
        this.runtimeVersions = mutableMap;
    }

    @SuppressLint({"UsableSpace"})
    public final long calculateFreeDisk() {
        Object m25294constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl((Long) this.bgTaskService.submitTask(TaskType.IO, new Callable<Long>() { // from class: com.bugsnag.android.DeviceDataCollector$calculateFreeDisk$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public final Long call() {
                    File file;
                    file = DeviceDataCollector.this.dataDirectory;
                    return Long.valueOf(file.getUsableSpace());
                }
            }).get());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m25300isFailureimpl(m25294constructorimpl)) {
            m25294constructorimpl = 0L;
        }
        return ((Number) m25294constructorimpl).longValue();
    }

    @NotNull
    public final Device generateDevice() {
        Object m25294constructorimpl;
        DeviceBuildInfo deviceBuildInfo = this.buildInfo;
        String[] strArr = this.cpuAbi;
        Boolean valueOf = Boolean.valueOf(checkIsRooted());
        String str = this.deviceId;
        String str2 = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(future != null ? future.get() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        return new Device(deviceBuildInfo, strArr, valueOf, str, str2, (Long) (Result.m25300isFailureimpl(m25294constructorimpl) ? null : m25294constructorimpl), MapsKt.toMutableMap(this.runtimeVersions));
    }

    @NotNull
    public final DeviceWithState generateDeviceWithState(long now) {
        Object m25294constructorimpl;
        DeviceBuildInfo deviceBuildInfo = this.buildInfo;
        Boolean valueOf = Boolean.valueOf(checkIsRooted());
        String str = this.deviceId;
        String str2 = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(future != null ? future.get() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        return new DeviceWithState(deviceBuildInfo, valueOf, str, str2, (Long) (Result.m25300isFailureimpl(m25294constructorimpl) ? null : m25294constructorimpl), MapsKt.toMutableMap(this.runtimeVersions), Long.valueOf(calculateFreeDisk()), calculateFreeMemory(), getOrientationAsString$bugsnag_android_core_release(), new Date(now));
    }

    @NotNull
    public final DeviceWithState generateInternalDeviceWithState(long now) {
        Object m25294constructorimpl;
        DeviceBuildInfo deviceBuildInfo = this.buildInfo;
        Boolean valueOf = Boolean.valueOf(checkIsRooted());
        String str = this.internalDeviceId;
        String str2 = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(future != null ? future.get() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        return new DeviceWithState(deviceBuildInfo, valueOf, str, str2, (Long) (Result.m25300isFailureimpl(m25294constructorimpl) ? null : m25294constructorimpl), MapsKt.toMutableMap(this.runtimeVersions), Long.valueOf(calculateFreeDisk()), calculateFreeMemory(), getOrientationAsString$bugsnag_android_core_release(), new Date(now));
    }

    @NotNull
    public final String[] getCpuAbi() {
        String[] cpuAbis = this.buildInfo.getCpuAbis();
        return cpuAbis != null ? cpuAbis : new String[0];
    }

    @NotNull
    public final Map<String, Object> getDeviceMetadata() {
        HashMap hashMap = new HashMap();
        populateBatteryInfo(hashMap);
        hashMap.put("locationStatus", getLocationStatus());
        hashMap.put("networkAccess", getNetworkAccess());
        hashMap.put("brand", this.buildInfo.getBrand());
        hashMap.put("screenDensity", this.screenDensity);
        hashMap.put("dpi", this.dpi);
        hashMap.put("emulator", Boolean.valueOf(this.emulator));
        hashMap.put("screenResolution", this.screenResolution);
        return hashMap;
    }

    @Nullable
    public final String getOrientationAsString$bugsnag_android_core_release() {
        int i = this.orientation.get();
        if (i == 1) {
            return "portrait";
        }
        if (i != 2) {
            return null;
        }
        return "landscape";
    }

    public final boolean updateOrientation$bugsnag_android_core_release(int newOrientation) {
        return this.orientation.getAndSet(newOrientation) != newOrientation;
    }
}
