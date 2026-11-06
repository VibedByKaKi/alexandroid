package com.amazon.alexa.presence.service.dagger;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.amazon.alexa.presence.AndroidCompatibleThreadFactory;
import com.amazon.alexa.presence.library.MetricsRecorder;
import com.amazon.alexa.presence.locks.BLEInUseLock;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/presence/service/dagger/ForegroundServiceModule;", "", "()V", "bleInUseLock", "Lcom/amazon/alexa/presence/locks/BLEInUseLock;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothManager", "Landroid/bluetooth/BluetoothManager;", "applicationContext", "Landroid/content/Context;", "defaultExecutor", "Ljava/util/concurrent/ExecutorService;", "scheduledExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "metricsRecorder", "Lcom/amazon/alexa/presence/library/MetricsRecorder;", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes18.dex */
public final class ForegroundServiceModule {
    @Provides
    @Singleton
    @NotNull
    public final BLEInUseLock bleInUseLock() {
        return new BLEInUseLock(0L, 1, null);
    }

    @Provides
    @NotNull
    public final BluetoothAdapter bluetoothAdapter() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        defaultAdapter.getClass();
        return defaultAdapter;
    }

    @Provides
    @NotNull
    public final BluetoothManager bluetoothManager(@NotNull Context applicationContext) {
        applicationContext.getClass();
        Object systemService = applicationContext.getSystemService("bluetooth");
        systemService.getClass();
        return (BluetoothManager) systemService;
    }

    @Provides
    @Singleton
    @NotNull
    public final ExecutorService defaultExecutor(@NotNull ScheduledExecutorService scheduledExecutor) {
        scheduledExecutor.getClass();
        return scheduledExecutor;
    }

    @Provides
    @Singleton
    @NotNull
    public final MetricsRecorder metricsRecorder() {
        MetricsRecorder metricsUtil = MetricsRecorder.getMetricsUtil();
        metricsUtil.getClass();
        return metricsUtil;
    }

    @Provides
    @Singleton
    @NotNull
    public final ScheduledExecutorService scheduledExecutor() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5, new AndroidCompatibleThreadFactory("foreground-service-pool"));
        newScheduledThreadPool.getClass();
        return newScheduledThreadPool;
    }
}
