package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.content.Context;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.MediaPlaybackAuthority;
import com.amazon.alexa.client.alexaservice.base.device.EncryptedPreferencesStorage;
import com.amazon.alexa.client.alexaservice.base.device.PreferencesStorage;
import com.amazon.alexa.client.alexaservice.base.device.data.EncryptionAuthority;
import com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.core.device.PersistentStorage;
import com.amazon.alexa.client.metrics.core.DeviceInformation;
import com.amazon.alexa.utils.TimeProvider;
import com.google.gson.Gson;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ExternalMediaPlayerModule {
    public static final String PLAYBACK_STATE_LOADER = "playback_state_loader";
    public static final String PLAYBACK_STATE_STORE = "playback_state_store";
    public static final String PLAYER_IN_FOCUS_LOADER = "player_in_focus_loader";
    public static final String PLAYER_IN_FOCUS_STORE = "player_in_focus_store";
    public static final String PLAYER_REGISTRATION_LOADER = "player_registration_loader";
    public static final String PLAYER_REGISTRATION_STORE = "player_registration_store";
    public static final String PLAYER_RUNTIME_STATE_LOADER = "player_runtime_state_loader";
    public static final String PLAYER_RUNTIME_STATE_STORE = "player_runtime_state_store";
    public static final String PLAYER_STATE_LOADER = "player_state_loader";
    public static final String PLAYER_STATE_STORE = "player_state_store";

    @Provides
    @Singleton
    @Named(PLAYBACK_STATE_LOADER)
    public PersistedDataLoader providesPlaybackStateLoader(@Named("playback_state_store") Lazy<PersistentStorage> lazy, TimeProvider timeProvider, Gson gson) {
        return new PersistedDataLoader(PLAYBACK_STATE_LOADER, lazy, timeProvider, gson);
    }

    @Provides
    @Singleton
    @Named(PLAYBACK_STATE_STORE)
    public PersistentStorage providesPlaybackStateStore(Context context, @Named("encryption_with_aes") Lazy<EncryptionAuthority> lazy, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, AlexaClientEventBus alexaClientEventBus) {
        return new EncryptedPreferencesStorage(context.getSharedPreferences(PLAYBACK_STATE_STORE, 0), PLAYBACK_STATE_STORE, lazy, featureFlagConfigurationAuthority, alexaClientEventBus, context, Boolean.TRUE);
    }

    @Provides
    @Singleton
    @Named(PLAYER_IN_FOCUS_LOADER)
    public PersistedDataLoader providesPlayerInFocusLoader(@Named("player_in_focus_store") Lazy<PersistentStorage> lazy, TimeProvider timeProvider, Gson gson) {
        return new PersistedDataLoader(PLAYER_IN_FOCUS_LOADER, lazy, timeProvider, gson);
    }

    @Provides
    @Singleton
    @Named(PLAYER_IN_FOCUS_STORE)
    public PersistentStorage providesPlayerInFocusStore(Context context) {
        return new PreferencesStorage(context.getSharedPreferences(PLAYER_IN_FOCUS_STORE, 0), false);
    }

    @Provides
    @Singleton
    @Named(PLAYER_REGISTRATION_LOADER)
    public PersistedDataLoader providesPlayerRegistrationLoader(@Named("player_registration_store") Lazy<PersistentStorage> lazy, TimeProvider timeProvider, Gson gson) {
        return new PersistedDataLoader(PLAYER_REGISTRATION_LOADER, lazy, timeProvider, gson);
    }

    @Provides
    @Singleton
    @Named(PLAYER_REGISTRATION_STORE)
    public PersistentStorage providesPlayerRegistrationStore(Context context) {
        return new PreferencesStorage(context.getSharedPreferences(PLAYER_REGISTRATION_STORE, 0), false);
    }

    @Provides
    @Singleton
    @Named(PLAYER_RUNTIME_STATE_LOADER)
    public PersistedDataLoader providesPlayerRuntimeStateLoader(@Named("player_runtime_state_store") Lazy<PersistentStorage> lazy, TimeProvider timeProvider, Gson gson) {
        return new PersistedDataLoader(PLAYER_RUNTIME_STATE_STORE, lazy, timeProvider, gson);
    }

    @Provides
    @Singleton
    @Named(PLAYER_RUNTIME_STATE_STORE)
    public PersistentStorage providesPlayerRuntimeStateStore(Context context) {
        return new PreferencesStorage(context.getSharedPreferences(PLAYER_RUNTIME_STATE_STORE, 0), false);
    }

    @Provides
    @Singleton
    @Named(PLAYER_STATE_LOADER)
    public PersistedDataLoader providesPlayerStateLoader(@Named("player_state_store") Lazy<PersistentStorage> lazy, TimeProvider timeProvider, Gson gson) {
        return new PersistedDataLoader(PLAYER_STATE_LOADER, lazy, timeProvider, gson);
    }

    @Provides
    @Singleton
    @Named(PLAYER_STATE_STORE)
    public PersistentStorage providesPlayerStateStore(Context context) {
        return new PreferencesStorage(context.getSharedPreferences(PLAYER_STATE_STORE, 0), false);
    }

    @Provides
    @Singleton
    public UnnamedMediaPlayer providesUnnamedMediaPlayer(Context context, AlexaClientEventBus alexaClientEventBus, Lazy<MediaPlaybackAuthority> lazy, @Named("shared_scheduler") ScheduledExecutorService scheduledExecutorService, ExternalMediaPlayerPlaybackAuthority externalMediaPlayerPlaybackAuthority, DeviceInformation deviceInformation) {
        return deviceInformation.isFireOS() ? new AVRCPUnnamedMediaPlayer(context, alexaClientEventBus, lazy, externalMediaPlayerPlaybackAuthority, scheduledExecutorService) : new NoOpUnnamedPlayer();
    }
}
