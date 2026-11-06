package com.amazon.alexa.mobilytics.integration.ama;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.mobilytics.identity.MobilyticsDeviceMonitor;
import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceCaptorOutput;
import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat;
import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStatType;
import com.amazon.alexa.mobilytics.integration.ama.resourcestat.cpu.CpuStat;
import com.amazon.alexa.mobilytics.integration.ama.resourcestat.cpu.MobilyticsCPUStatCaptor;
import com.amazon.alexa.mobilytics.integration.ama.resourcestat.memory.MemoryStat;
import com.amazon.alexa.mobilytics.integration.ama.resourcestat.memory.MobilyticsMemoryStatCaptor;
import com.amazon.alexa.mobilytics.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class DefaultMobilyticsDeviceMonitor implements MobilyticsDeviceMonitor {
    private static final String TAG = Log.tag((Class<?>) DefaultMobilyticsDeviceMonitor.class);
    private Intent batteryStatus;
    private MobilyticsCPUStatCaptor cpuStatCaptor;
    private IntentFilter ifilter;
    private MobilyticsMemoryStatCaptor memoryStatCaptor;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.mobilytics.integration.ama.DefaultMobilyticsDeviceMonitor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$mobilytics$identity$resourcestat$MobilyticsResourceStatType;

        static {
            int[] iArr = new int[MobilyticsResourceStatType.values().length];
            $SwitchMap$com$amazon$alexa$mobilytics$identity$resourcestat$MobilyticsResourceStatType = iArr;
            try {
                iArr[MobilyticsResourceStatType.MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$mobilytics$identity$resourcestat$MobilyticsResourceStatType[MobilyticsResourceStatType.CPU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public DefaultMobilyticsDeviceMonitor(@NonNull Context context, @NonNull MobilyticsMemoryStatCaptor mobilyticsMemoryStatCaptor, @NonNull MobilyticsCPUStatCaptor mobilyticsCPUStatCaptor) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        this.ifilter = intentFilter;
        this.batteryStatus = context.registerReceiver(null, intentFilter);
        this.memoryStatCaptor = mobilyticsMemoryStatCaptor;
        this.cpuStatCaptor = mobilyticsCPUStatCaptor;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceMonitor
    public float getBatteryLevel() {
        return (this.batteryStatus.getIntExtra(ModelTransformer.KEY_BATTERY_LEVEL, -1) * 100) / this.batteryStatus.getIntExtra(ModelTransformer.KEY_BATTERY_SCALE, -1);
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceMonitor
    public boolean isBatteryCharging() {
        return this.batteryStatus.getIntExtra(ModelTransformer.KEY_BATTERY_SCALE, -1) == 2;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceMonitor
    public MobilyticsResourceStat start(MobilyticsResourceStatType mobilyticsResourceStatType) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$mobilytics$identity$resourcestat$MobilyticsResourceStatType[mobilyticsResourceStatType.ordinal()];
        if (i == 1) {
            return this.memoryStatCaptor.start();
        }
        if (i != 2) {
            return null;
        }
        return this.cpuStatCaptor.start();
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceMonitor
    public MobilyticsResourceCaptorOutput stop(MobilyticsResourceStat mobilyticsResourceStat) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$mobilytics$identity$resourcestat$MobilyticsResourceStatType[mobilyticsResourceStat.getType().ordinal()];
        if (i == 1) {
            return this.memoryStatCaptor.stop((MemoryStat) mobilyticsResourceStat);
        }
        if (i != 2) {
            return null;
        }
        return this.cpuStatCaptor.stop((CpuStat) mobilyticsResourceStat);
    }
}
