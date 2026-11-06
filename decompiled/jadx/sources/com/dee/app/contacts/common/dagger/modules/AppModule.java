package com.dee.app.contacts.common.dagger.modules;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazonaws.cognito.clientcontext.datacollection.DataRecordKey;
import com.dee.app.contacts.common.utils.ActivityLifecycleUtil;
import com.dee.app.contacts.common.utils.DeviceInfo;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes6.dex */
public class AppModule {
    private ActivityLifecycleUtil mActivityLifecycleUtil;
    private Context mContext;

    public AppModule(Context context) {
        this.mContext = context;
        this.mActivityLifecycleUtil = new ActivityLifecycleUtil(context);
    }

    @Provides
    @Singleton
    public ActivityLifecycleUtil provideActivityLifecycleUtil() {
        return this.mActivityLifecycleUtil;
    }

    @Provides
    @Named("ApplicationName")
    public String provideApplicationName(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return this.mContext;
    }

    @Provides
    @Named(DataRecordKey.DEVICE_AGENT)
    public String provideDeviceId(Context context) {
        return new DeviceInfo().getUniqueDeviceId(context);
    }

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences("SHARED_PREFS", 0);
    }
}
