package com.amazon.alexa.accessory.notificationpublisher.providers;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.notificationpublisher.notificationlistener.NotificationServiceCommunicator;
import com.amazon.alexa.accessory.notificationpublisher.storage.AsyncLocalStorage;
import com.amazon.alexa.accessory.notificationpublisher.storage.NativeLocalStorageModule;
import com.amazon.alexa.accessory.notificationpublisher.utils.AvsProperties;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.amazon.alexa.accessoryclient.client.accessories.Accessories;
import com.amazon.alexa.api.AlexaServicesConnection;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.device.api.DeviceInformationException;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.externalnotifications.capability.ExternalNotificationsCapabilityAgent;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.dee.app.data.api.ElementLocalStorage;
import com.dee.app.metrics.MetricsService;
import dagger.Lazy;
import java.util.HashMap;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DependencyProvider {
    private static final String TAG = "DependencyProvider";
    private static AvsProperties avsProperties;
    private static Accessories clientAccessories;
    private static Context context;
    private static Lazy<DeviceInformation> deviceInformation;
    private static Lazy<EnvironmentService> environmentService;
    private static Lazy<EventBus> eventBus;
    private static ExternalNotificationsCapabilityAgent externalNotificationsCapabilityAgent;
    private static Lazy<FeatureServiceV2> featureServiceV2;
    private static Lazy<OkHttpClient> httpClient;
    private static Lazy<IdentityService> identityService;
    private static Lazy<MetricsService> metricsService;
    private static Lazy<NativeLocalStorageModule> nativeLocalStorageModule;
    private static NotificationServiceCommunicator notificationServiceCommunicator;

    private DependencyProvider() {
    }

    public static void create(@NonNull Context context2, @NonNull final Lazy<ElementLocalStorage> lazy, @NonNull Lazy<OkHttpClient> lazy2) {
        context = context2;
        deviceInformation = new Lazy<DeviceInformation>() { // from class: com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // dagger.Lazy
            public DeviceInformation get() {
                Object obj;
                obj = ComponentRegistry.getInstance().get(DeviceInformation.class).get();
                return (DeviceInformation) obj;
            }
        };
        environmentService = new Lazy<EnvironmentService>() { // from class: com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // dagger.Lazy
            public EnvironmentService get() {
                Object obj;
                obj = ComponentRegistry.getInstance().get(EnvironmentService.class).get();
                return (EnvironmentService) obj;
            }
        };
        eventBus = new Lazy<EventBus>() { // from class: com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // dagger.Lazy
            public EventBus get() {
                Object obj;
                obj = ComponentRegistry.getInstance().get(EventBus.class).get();
                return (EventBus) obj;
            }
        };
        featureServiceV2 = new Lazy<FeatureServiceV2>() { // from class: com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // dagger.Lazy
            public FeatureServiceV2 get() {
                Object obj;
                obj = ComponentRegistry.getInstance().get(FeatureServiceV2.class).get();
                return (FeatureServiceV2) obj;
            }
        };
        identityService = new Lazy<IdentityService>() { // from class: com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // dagger.Lazy
            public IdentityService get() {
                Object obj;
                obj = ComponentRegistry.getInstance().get(IdentityService.class).get();
                return (IdentityService) obj;
            }
        };
        metricsService = new Lazy<MetricsService>() { // from class: com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // dagger.Lazy
            public MetricsService get() {
                Object obj;
                obj = ComponentRegistry.getInstance().get(MetricsService.class).get();
                return (MetricsService) obj;
            }
        };
        nativeLocalStorageModule = new Lazy<NativeLocalStorageModule>() { // from class: com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // dagger.Lazy
            public NativeLocalStorageModule get() {
                return new NativeLocalStorageModule((ElementLocalStorage) Lazy.this.get());
            }
        };
        httpClient = lazy2;
        avsProperties = new AvsProperties(context2);
    }

    public static AlexaServicesConnection createAlexaServiceConnection() {
        return new AlexaServicesConnection(getContext());
    }

    public static AsyncLocalStorage createAsyncLocalStorage(String str) {
        return new AsyncLocalStorage(getNativeLocalStorageModule(), str);
    }

    public static String getAccessToken(String str) {
        return getIdentityService().getAccessToken(str);
    }

    public static AvsProperties getAvsProperties() {
        return avsProperties;
    }

    public static Accessories getClientAccessories() {
        return clientAccessories;
    }

    public static Context getContext() {
        return context;
    }

    public static String getCookie(String str) {
        CookieManager cookieManager = getCookieManager();
        return cookieManager == null ? "" : cookieManager.getCookie(str);
    }

    public static CookieManager getCookieManager() {
        try {
            return CookieManager.getInstance();
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put(MetricsConstants.CUSTOM_VALUES_KEY, MetricsRecorder.customAttributesForException(e, 512));
            MetricsRecorder.getInstance().recordCounter("FocusFilter_cookieManager_exception_".concat(e.getClass().getSimpleName()), hashMap);
            Log.e(TAG, "Caught Exception when call CookieManager.getInstance().", e);
            return null;
        }
    }

    public static DeviceInformation getDeviceInformation() {
        return deviceInformation.get();
    }

    public static String getDeviceType() throws DeviceInformationException {
        return getDeviceInformation().getDeviceType();
    }

    public static EnvironmentService getEnvironmentService() {
        return environmentService.get();
    }

    public static EventBus getEventBus() {
        return eventBus.get();
    }

    @Nullable
    public static ExternalNotificationsCapabilityAgent getExternalNotificationsCapabilityAgent() {
        return externalNotificationsCapabilityAgent;
    }

    public static FeatureServiceV2 getFeatureServiceV2() {
        return featureServiceV2.get();
    }

    public static OkHttpClient getHttpClient() {
        return httpClient.get();
    }

    public static IdentityService getIdentityService() {
        return identityService.get();
    }

    public static Handler getMainHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static MetricsService getMetricsService() {
        return metricsService.get();
    }

    public static NativeLocalStorageModule getNativeLocalStorageModule() {
        return nativeLocalStorageModule.get();
    }

    public static NotificationServiceCommunicator getNotificationServiceCommunicator() {
        return notificationServiceCommunicator;
    }

    public static String getSerialNumber() throws DeviceInformationException {
        return getDeviceInformation().getDeviceSerialNumber();
    }

    public static void setAccessoriesClient(@NonNull Context context2) {
        clientAccessories = Accessories.Shared.INSTANCE.get(context2);
    }

    public static void setExternalNotificationsCapabilityAgent(ExternalNotificationsCapabilityAgent externalNotificationsCapabilityAgent2) {
        externalNotificationsCapabilityAgent = externalNotificationsCapabilityAgent2;
    }

    public static void setNotificationServiceCommunicator(NotificationServiceCommunicator notificationServiceCommunicator2) {
        notificationServiceCommunicator = notificationServiceCommunicator2;
    }
}
