package com.amazon.alexa.client.alexaservice.base.application;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ContextModule {
    public static final String MAIN_THREAD_HANDLER_NAME = "MAIN_THREAD_HANDLER_NAME";
    private final Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public ActivityManager provideActivityManager(Context context) {
        return (ActivityManager) context.getSystemService("activity");
    }

    @Provides
    @Singleton
    public KeyguardManager provideKeyguardManager(Context context) {
        return (KeyguardManager) context.getSystemService("keyguard");
    }

    @Provides
    @Singleton
    public PowerManager providePowerManager(Context context) {
        return (PowerManager) context.getSystemService("power");
    }

    @Provides
    @Singleton
    public TelephonyManager provideTelephonyManager(Context context) {
        return (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    @Provides
    @Singleton
    public WifiManager provideWifiManager(Context context) {
        return (WifiManager) context.getSystemService("wifi");
    }

    @Provides
    @Singleton
    public WindowManager provideWindowManager(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    @Provides
    @Singleton
    public AlarmManager providesAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @Provides
    @Singleton
    public NotificationManager providesAndroidNotificationManager(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    @Provides
    @Singleton
    public Context providesApplicationContext() {
        return this.context.getApplicationContext();
    }

    @Provides
    @Singleton
    public AudioManager providesAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    @Provides
    @Singleton
    public ConnectivityManager providesConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Provides
    @Singleton
    public JobScheduler providesJobScheduler(Context context) {
        return (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Provides
    @Singleton
    public LocalBroadcastManager providesLocalBroadcastManager(Context context) {
        return LocalBroadcastManager.getInstance(context);
    }

    @Provides
    @Singleton
    public LocationManager providesLocationManager(Context context) {
        return (LocationManager) context.getSystemService("location");
    }

    @Provides
    @Singleton
    @Named(MAIN_THREAD_HANDLER_NAME)
    public Handler providesMainThreadHandler() {
        return new Handler(Looper.getMainLooper());
    }

    @Provides
    @Singleton
    public PackageManager providesPackageManager(Context context) {
        return context.getPackageManager();
    }
}
