package com.amazon.comms.calling.dependency;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.amazon.comms.calling.foundation.features.providers.AppProcessCheckProvider;
import com.amazon.comms.calling.foundation.features.providers.AppProcessCheckProviderImpl;
import com.amazon.comms.calling.infrastructure.ConnectivityMonitor;
import com.amazon.comms.calling.infrastructure.ConnectivityMonitorImpl;
import com.amazon.comms.calling.infrastructure.telecom.TelephonyProvider;
import com.amazon.comms.calling.infrastructure.telecom.TelephonyProviderImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006\u001e"}, d2 = {"Lcom/amazon/comms/calling/dependency/AndroidModule;", "", "<init>", "()V", "providesConnectivityManager", "Landroid/net/ConnectivityManager;", "context", "Landroid/content/Context;", "providesAudioManager", "Landroid/media/AudioManager;", "providesNotificationManager", "Landroid/app/NotificationManager;", "providesConnectivityMonitor", "Lcom/amazon/comms/calling/infrastructure/ConnectivityMonitor;", "connectivityMonitorImpl", "Lcom/amazon/comms/calling/infrastructure/ConnectivityMonitorImpl;", "providesPowerManager", "Landroid/os/PowerManager;", "providesVibrator", "Landroid/os/Vibrator;", "providesTelephonyManager", "Landroid/telephony/TelephonyManager;", "providesTelephonyProvider", "Lcom/amazon/comms/calling/infrastructure/telecom/TelephonyProvider;", "telephonyProviderImpl", "Lcom/amazon/comms/calling/infrastructure/telecom/TelephonyProviderImpl;", "providesAppProcessCheckProvider", "Lcom/amazon/comms/calling/foundation/features/providers/AppProcessCheckProvider;", "activityManager", "Landroid/app/ActivityManager;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes20.dex */
public final class AndroidModule {
    @Provides
    @Singleton
    @NotNull
    public final AppProcessCheckProvider providesAppProcessCheckProvider(@NotNull ActivityManager activityManager) {
        activityManager.getClass();
        return new AppProcessCheckProviderImpl(activityManager);
    }

    @Provides
    @NotNull
    public final AudioManager providesAudioManager(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        return (AudioManager) systemService;
    }

    @Provides
    @NotNull
    public final ConnectivityManager providesConnectivityManager(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) ConnectivityManager.class);
        systemService.getClass();
        return (ConnectivityManager) systemService;
    }

    @Provides
    @Singleton
    @NotNull
    public final ConnectivityMonitor providesConnectivityMonitor(@NotNull ConnectivityMonitorImpl connectivityMonitorImpl) {
        connectivityMonitorImpl.getClass();
        return connectivityMonitorImpl;
    }

    @Provides
    @NotNull
    public final NotificationManager providesNotificationManager(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        return (NotificationManager) systemService;
    }

    @Provides
    @NotNull
    public final PowerManager providesPowerManager(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        return (PowerManager) systemService;
    }

    @Provides
    @NotNull
    public final TelephonyManager providesTelephonyManager(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        systemService.getClass();
        return (TelephonyManager) systemService;
    }

    @Provides
    @Singleton
    @NotNull
    public final TelephonyProvider providesTelephonyProvider(@NotNull TelephonyProviderImpl telephonyProviderImpl) {
        telephonyProviderImpl.getClass();
        return telephonyProviderImpl;
    }

    @Provides
    @NotNull
    public final Vibrator providesVibrator(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("vibrator");
        systemService.getClass();
        return (Vibrator) systemService;
    }
}
