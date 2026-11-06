package com.amazon.dee.app.framework;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Debug;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.multidex.MultiDexApplication;
import com.amazon.common.NativeBinding$$ExternalSyntheticLambda0;
import com.amazon.dee.app.dependencies.ApplicationComponent;
import com.amazon.dee.app.framework.DefaultApplicationImplementation;
import com.amazon.dee.app.services.logging.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.ApplicationLifecycleDispatcher;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class AlexaApplication extends MultiDexApplication implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = Log.tag((Class<?>) AlexaApplication.class);
    private static final Map<Integer, String> memoryTrimToString;
    private String accessoriesProcessName;
    private String alexaProcessName;

    @VisibleForTesting
    ApplicationImplementation applicationImplementation;
    private String mainProcessName;
    private final Random random = new SecureRandom();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(5, "TRIM_MEMORY_RUNNING_MODERATE: no risk of getting killed, we're foregrounded.");
        hashMap.put(10, "TRIM_MEMORY_RUNNING_LOW: no risk of getting killed, we're foregrounded.");
        hashMap.put(15, "TRIM_MEMORY_RUNNING_CRITICAL: We might not get killed, but we're using a lot of memory.");
        hashMap.put(20, "TRIM_MEMORY_UI_HIDDEN: There is another foreground process, no risk of getting killed.");
        hashMap.put(40, "TRIM_MEMORY_BACKGROUND: We're in the background, low risk of getting killed.");
        hashMap.put(60, "TRIM_MEMORY_MODERATE: Medium risk of getting killed.");
        hashMap.put(80, "TRIM_MEMORY_COMPLETE: High risk of getting killed, system is almost out of memory.");
        memoryTrimToString = Collections.unmodifiableMap(hashMap);
    }

    private void createMemoryMonitor() {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new NativeBinding$$ExternalSyntheticLambda0(this, 25), 30L, 300L, TimeUnit.SECONDS);
    }

    private String getCurrentProcess() {
        return Application.getProcessName();
    }

    @Nullable
    private ActivityManager.MemoryInfo getMemoryInfo() {
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    private String getMemoryWarningString(int i) {
        String str = memoryTrimToString.get(Integer.valueOf(i));
        return str != null ? str : a$$ExternalSyntheticOutline0.m(i, "Unknown trim level: ");
    }

    public static boolean isAppOnForeground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMemoryMonitor$0() {
        logDebugMemoryInfo();
        if (this.random.nextInt(144) == 0) {
            this.applicationImplementation.reportMemoryStats();
        }
    }

    private void logDebugMemoryInfo() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        Map<String, String> memoryStats = memoryInfo.getMemoryStats();
        Log.i(TAG, "MemoryStats nativeHeap=" + memoryStats.get("summary.native-heap") + "kB javaHeap=" + memoryStats.get("summary.java-heap") + "kB code=" + memoryStats.get("summary.code") + "kB stack=" + memoryStats.get("summary.stack") + "kB graphics=" + memoryStats.get("summary.graphics") + "kB privateOther=" + memoryStats.get("summary.private-other") + "kB totalPss=" + memoryStats.get("summary.total-pss") + "kB");
    }

    public ApplicationImplementation getApplicationImplementation(String str) {
        String str2 = this.mainProcessName;
        if (str2 == null) {
            str2 = getPackageName();
        }
        if (str2 == null) {
            str2 = "com.amazon.dee.app";
        }
        String str3 = this.alexaProcessName;
        if (str3 == null) {
            str3 = str2.concat(":alexa");
        }
        String str4 = this.accessoriesProcessName;
        if (str4 == null) {
            str4 = str2.concat(":alexa_accessories");
        }
        return (str == null || str.isEmpty() || str.equals(str2)) ? new MainApplicationImplementation() : str4.equals(str) ? new DefaultApplicationImplementation.AccessoriesApplicationImplementation(str) : str3.equals(str) ? new DefaultApplicationImplementation.VoiceApplicationImplementation(str) : new DefaultApplicationImplementation(str);
    }

    public ApplicationComponent getComponent() {
        return this.applicationImplementation.getComponent();
    }

    public boolean isColdStart() {
        return this.applicationImplementation.isColdStart();
    }

    public boolean isNoActivityVisible() {
        return this.applicationImplementation.isNoActivityVisible();
    }

    public boolean isSingleSignOnBuild() {
        return this.applicationImplementation.isSingleSignOnBuild();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.applicationImplementation.onActivityCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.applicationImplementation.onActivityDestroyed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.applicationImplementation.onActivityPaused(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.applicationImplementation.onActivityResumed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.applicationImplementation.onActivitySaveInstanceState(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.applicationImplementation.onActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.applicationImplementation.onActivityStopped(activity);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.applicationImplementation.onConfigurationChanged(configuration);
        ApplicationLifecycleDispatcher.onConfigurationChanged(this, configuration);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        this.mainProcessName = getPackageName();
        this.alexaProcessName = a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.mainProcessName, ":alexa");
        this.accessoriesProcessName = a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.mainProcessName, ":alexa_accessories");
        ApplicationLifecycleDispatcher.onApplicationCreate(this);
        ApplicationImplementation applicationImplementation = getApplicationImplementation(getCurrentProcess());
        this.applicationImplementation = applicationImplementation;
        applicationImplementation.onCreate(this);
        registerActivityLifecycleCallbacks(this.applicationImplementation);
        createMemoryMonitor();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        this.applicationImplementation.onTrimMemory(i);
    }
}
