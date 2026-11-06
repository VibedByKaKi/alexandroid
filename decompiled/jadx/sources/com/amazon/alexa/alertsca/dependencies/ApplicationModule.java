package com.amazon.alexa.alertsca.dependencies;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.amazon.alexa.api.AlexaServicesConnection;
import com.amazon.alexa.bluetooth.sco.BluetoothScoController;
import dagger.Module;
import dagger.Provides;
import java.time.Clock;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes16.dex */
public class ApplicationModule {
    public static final String ALERTS_DATA_STORE = "ALERTS_DATA_STORE";
    private final Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public AlarmManager providesAlarmManager() {
        return (AlarmManager) this.context.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @Provides
    @Singleton
    public AlexaServicesConnection providesAlexaServicesConnection() {
        return new AlexaServicesConnection(this.context);
    }

    @Provides
    @Singleton
    public NotificationManager providesAndroidNotificationManager() {
        return (NotificationManager) this.context.getSystemService("notification");
    }

    @Provides
    @Singleton
    public Context providesApplicationContext() {
        return this.context;
    }

    @Provides
    @Singleton
    public AudioManager providesAudioManager() {
        return (AudioManager) this.context.getSystemService("audio");
    }

    @Provides
    @Singleton
    public Clock providesClock() {
        return Clock.systemUTC();
    }

    @Provides
    @Singleton
    public ConnectivityManager providesConnectivityManager() {
        return (ConnectivityManager) this.context.getSystemService("connectivity");
    }

    @Provides
    @Singleton
    public Handler providesMainThreadHandler() {
        return new Handler(Looper.getMainLooper());
    }

    @Provides
    @Singleton
    public PackageManager providesPackageManager() {
        return this.context.getPackageManager();
    }

    @Provides
    @Singleton
    public PowerManager providesPowerManager() {
        return (PowerManager) this.context.getSystemService("power");
    }

    @Provides
    @Singleton
    public BluetoothScoController providesScoController(Context context, AudioManager audioManager, TelephonyManager telephonyManager) {
        return new BluetoothScoController(audioManager, telephonyManager, context);
    }

    @Provides
    @Singleton
    @Named(ALERTS_DATA_STORE)
    public SharedPreferences providesSharedPreferences() {
        return this.context.getSharedPreferences(ALERTS_DATA_STORE, 0);
    }

    @Provides
    @Singleton
    public TelephonyManager providesTelephonyManager() {
        return (TelephonyManager) this.context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }
}
