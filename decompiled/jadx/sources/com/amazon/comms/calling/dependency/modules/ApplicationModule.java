package com.amazon.comms.calling.dependency.modules;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.comms.calling.data.util.Constants;
import com.amazon.comms.calling.foundation.features.FeatureCheck;
import com.amazon.comms.calling.foundation.features.implementations.AlexaAppFeatureCheck;
import com.amazon.comms.calling.foundation.features.providers.AlexaAppFeatureServiceV2Provider;
import com.amazon.comms.calling.foundation.features.providers.FeatureCheckProvider;
import com.amazon.comms.calling.sdk.CallingAPI;
import com.amazon.comms.log.CommsLogger;
import com.amazon.identity.auth.device.api.DeviceDataKeys;
import com.amazon.identity.auth.device.api.DeviceDataStore;
import com.amazon.identity.auth.device.api.DeviceDataStoreException;
import dagger.Module;
import dagger.Provides;
import java.util.Calendar;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0003H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0018\u001a\u00020\u0016H\u0007J\u0015\u0010\u0019\u001a\n \b*\u0004\u0018\u00010\u00160\u0016H\u0007¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006#"}, d2 = {"Lcom/amazon/comms/calling/dependency/modules/ApplicationModule;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "kotlin.jvm.PlatformType", "Lcom/amazon/comms/log/CommsLogger;", "providesApplicationContext", "Landroid/app/Application;", "providesContext", "provideComponentRegistry", "Lcom/amazon/alexa/protocols/service/api/ComponentRegistry;", "providesFeatureCheckProvider", "Lcom/amazon/comms/calling/foundation/features/providers/FeatureCheckProvider;", "componentRegistry", "providesFeatureCheck", "Lcom/amazon/comms/calling/foundation/features/FeatureCheck;", "provider", "providesDeviceSerialNumber", "", "providesAppVersion", "providesClientId", "providesDefaultLocale", "()Ljava/lang/String;", "providesCallingAPI", "Lcom/amazon/comms/calling/sdk/CallingAPI;", "providesScreenSize", "", "providesCalendar", "Ljava/util/Calendar;", "providesActivityManager", "Landroid/app/ActivityManager;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes20.dex */
public final class ApplicationModule {
    private final CommsLogger LOG;

    @NotNull
    private final Context context;

    public ApplicationModule(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.LOG = CommsLogger.getLogger(Constants.LOG_TAG, ApplicationModule.class);
    }

    @Provides
    @Singleton
    @NotNull
    public final ComponentRegistry provideComponentRegistry() {
        ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
        componentRegistry.getClass();
        return componentRegistry;
    }

    @Provides
    @Singleton
    @NotNull
    public final ActivityManager providesActivityManager(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        return (ActivityManager) systemService;
    }

    @Provides
    @Named("AppVersion")
    @NotNull
    @Singleton
    public final String providesAppVersion(@NotNull Context context) {
        context.getClass();
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @Provides
    @Singleton
    @NotNull
    public final Application providesApplicationContext() {
        Context context = this.context;
        context.getClass();
        return (Application) context;
    }

    @Provides
    @NotNull
    public final Calendar providesCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        return calendar;
    }

    @Provides
    @Singleton
    @NotNull
    public final CallingAPI providesCallingAPI(@NotNull Context context) {
        context.getClass();
        return new CallingAPI(context);
    }

    @Provides
    @Named("clientId")
    @NotNull
    @Singleton
    public final String providesClientId() {
        return TableInfo$$ExternalSyntheticOutline0.m();
    }

    @Provides
    @Singleton
    @NotNull
    /* renamed from: providesContext, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Provides
    @Singleton
    @Named("defaultLocale")
    public final String providesDefaultLocale() {
        return LocaleList.getDefault().get(0).getLanguage();
    }

    @Provides
    @Named("deviceSerialNumber")
    @NotNull
    @Singleton
    public final String providesDeviceSerialNumber(@NotNull Context context) {
        context.getClass();
        try {
            String value = DeviceDataStore.getInstance(context).getValue(DeviceDataKeys.KEY_DEVICE_SERIAL_NUMBER);
            return value == null ? "UNKNOWN_CLIENT_ID" : value;
        } catch (DeviceDataStoreException unused) {
            this.LOG.e("Unable to obtain DSN from MAP");
            return "UNKNOWN_CLIENT_ID";
        }
    }

    @Provides
    @Singleton
    @NotNull
    public final FeatureCheck providesFeatureCheck(@NotNull FeatureCheckProvider provider) {
        provider.getClass();
        return new AlexaAppFeatureCheck(provider);
    }

    @Provides
    @Singleton
    @NotNull
    public final FeatureCheckProvider providesFeatureCheckProvider(@NotNull ComponentRegistry componentRegistry) {
        componentRegistry.getClass();
        return new AlexaAppFeatureServiceV2Provider(componentRegistry);
    }

    @Provides
    @Singleton
    @Named(Constants.ScreenSize)
    public final double providesScreenSize(@NotNull Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        double d = displayMetrics.widthPixels;
        double d2 = displayMetrics.densityDpi;
        return Math.sqrt(Math.pow(displayMetrics.heightPixels / d2, 2.0d) + Math.pow(d / d2, 2.0d));
    }
}
