package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.app.job.JobScheduler;
import android.content.Context;
import android.net.wifi.WifiManager;
import com.amazon.whisperjoin.deviceprovisioningservice.util.SharedPreferencesProvider;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.BluetoothSupportProvider;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class ContextModule {
    private final Context mContext;

    public ContextModule(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Provides
    @Singleton
    public BluetoothSupportProvider providesBluetoothSupportProvider(Context context) {
        return new BluetoothSupportProvider.DefaultBluetoothSupportProvider(context);
    }

    @Provides
    @Singleton
    public Context providesContext() {
        return this.mContext;
    }

    @Provides
    @Singleton
    public Gson providesGson() {
        return new Gson();
    }

    @Provides
    @Singleton
    public JobScheduler providesJobScheduler(Context context) {
        return (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Provides
    @Singleton
    public SharedPreferencesProvider providesSharedPreferencesProvider(Context context) {
        return new SharedPreferencesProvider(context);
    }

    @Provides
    @Singleton
    public WifiManager providesWifiManager(Context context) {
        return (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
