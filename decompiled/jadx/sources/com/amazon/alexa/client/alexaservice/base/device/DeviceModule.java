package com.amazon.alexa.client.alexaservice.base.device;

import android.content.Context;
import com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority;
import com.amazon.alexa.client.core.device.PersistentStorage;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class DeviceModule {
    public static final String ALEXA_DEVICE_PREFERENCES = "AlexaDevicePreferences";
    public static final String ALEXA_NOTIFICATION_PREFERENCES = "AlexaNotificationPreferences";
    public static final String ALEXA_SERVICE_SETTINGS_STORE = "AlexaServiceSettings";
    public static final String CAPABILITY_AGENT_STORE = "capability_agents";
    public static final String CAPABILITY_STORE = "capabilities";
    public static final String OFFLINE_PROMPTS = "offline_prompts";
    public static final String TWA_STORE = "TWA_SHARED_PREFS";

    @Provides
    @Singleton
    @Named(CAPABILITY_AGENT_STORE)
    public PersistentStorage provideCapabilityAgentStorage(Context context) {
        return new PreferencesStorage(context.getSharedPreferences(CAPABILITY_AGENT_STORE, 0), false);
    }

    @Provides
    @Singleton
    @Named("capabilities")
    public PersistentStorage provideCapabilityStorage(Context context) {
        return new PreferencesStorage(context.getSharedPreferences("capabilities", 0), true);
    }

    @Provides
    @Singleton
    @Named(ALEXA_DEVICE_PREFERENCES)
    public PersistentStorage provideDevicePreferencesStorage(Context context) {
        return new PreferencesStorage(context.getSharedPreferences(ALEXA_DEVICE_PREFERENCES, 0), true);
    }

    @Provides
    @Singleton
    @Named(ALEXA_NOTIFICATION_PREFERENCES)
    public PersistentStorage provideNotificationPreferencesStorage(Context context) {
        return new PreferencesStorage(context.getSharedPreferences(ALEXA_NOTIFICATION_PREFERENCES, 0), false);
    }

    @Provides
    @Singleton
    @Named(ALEXA_SERVICE_SETTINGS_STORE)
    public PersistentStorage provideServiceSettingsStorage(Context context) {
        return new PreferencesStorage(context.getSharedPreferences(ALEXA_SERVICE_SETTINGS_STORE, 0), true);
    }

    @Provides
    @Singleton
    @Named(TWA_STORE)
    public PersistentStorage provideTWAPreferenceStorage(Context context) {
        return new PreferencesStorage(context.getSharedPreferences(TWA_STORE, 0), true);
    }

    @Provides
    @Singleton
    public UserDependentStorage provideUserDependentStorage(@Named("TWA_SHARED_PREFS") PersistentStorage persistentStorage, @Named("AlexaServiceSettings") PersistentStorage persistentStorage2, @Named("capabilities") PersistentStorage persistentStorage3, @Named("playback_state_store") PersistentStorage persistentStorage4) {
        return new UserDependentStorage(persistentStorage, persistentStorage2, persistentStorage3, persistentStorage4);
    }

    @Provides
    @Singleton
    public AMPDInformationProvider providesAMPDInformationProvider(Context context) {
        return AMPDInformationProvider.getInstance(context);
    }

    @Provides
    @Singleton
    public DeviceInformationProvider providesDeviceInformationProvider(Context context, AuthorizationAuthority authorizationAuthority) {
        return new DeviceInformationProvider(context, authorizationAuthority);
    }
}
