package com.amazon.alexa.client.alexaservice.base.userspeechprovider;

import android.util.Log;
import com.amazon.alexa.api.AlexaUserSpeechProviderScope;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.UserSpeechProvider;
import com.amazon.alexa.client.alexaservice.ui.core.LaunchSource;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class UserSpeechProviderArbitrator {
    private static final String TAG = "UserSpeechProviderArbitrator";
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;

    @Inject
    public UserSpeechProviderArbitrator(FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
    }

    private boolean canProvideWakeWord(UserSpeechProvider userSpeechProvider) {
        return userSpeechProvider.getMetadata().supportsWakeWord();
    }

    private UserSpeechProvider getAccessoryIfConnected(Set<UserSpeechProvider> set) {
        for (UserSpeechProvider userSpeechProvider : set) {
            if (isExternalWakeWordDevice(userSpeechProvider)) {
                return userSpeechProvider;
            }
        }
        return null;
    }

    private UserSpeechProvider getInAppWakeWordProvider(Set<UserSpeechProvider> set) {
        for (UserSpeechProvider userSpeechProvider : set) {
            if (isInAppWakeWordProvider(userSpeechProvider)) {
                return userSpeechProvider;
            }
        }
        return null;
    }

    private static AlexaUserSpeechProviderScope getProviderType(UserSpeechProvider userSpeechProvider) {
        return userSpeechProvider.getMetadata().getProviderScope();
    }

    private UserSpeechProvider getSystemWakeWordProvider(Set<UserSpeechProvider> set) {
        for (UserSpeechProvider userSpeechProvider : set) {
            if (isSystemWakeWordProvider(userSpeechProvider)) {
                return userSpeechProvider;
            }
        }
        return null;
    }

    private boolean hasInAppWakeWordProvider(Set<UserSpeechProvider> set) {
        Iterator<UserSpeechProvider> it2 = set.iterator();
        while (it2.hasNext()) {
            if (isInAppWakeWordProvider(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSystemWakeWordProvider(Set<UserSpeechProvider> set) {
        Iterator<UserSpeechProvider> it2 = set.iterator();
        while (it2.hasNext()) {
            if (isSystemWakeWordProvider(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWakeWordAccessoryConnected(Set<UserSpeechProvider> set) {
        Iterator<UserSpeechProvider> it2 = set.iterator();
        while (it2.hasNext()) {
            if (isExternalWakeWordDevice(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isExternalWakeWordDevice(UserSpeechProvider userSpeechProvider) {
        return getProviderType(userSpeechProvider) == AlexaUserSpeechProviderScope.EXTERNAL_DEVICE && userSpeechProvider.getMetadata().supportsWakeWord();
    }

    private static boolean isInAppWakeWordProvider(UserSpeechProvider userSpeechProvider) {
        return getProviderType(userSpeechProvider) == AlexaUserSpeechProviderScope.APPLICATION && userSpeechProvider.getMetadata().supportsWakeWord();
    }

    private static boolean isSystemWakeWordProvider(UserSpeechProvider userSpeechProvider) {
        return getProviderType(userSpeechProvider) == AlexaUserSpeechProviderScope.SYSTEM;
    }

    private boolean isWakeWordRequestAllowed(UserSpeechProvider userSpeechProvider, boolean z, boolean z2, boolean z3) {
        if (!userSpeechProvider.getMetadata().supportsWakeWord()) {
            Log.w(TAG, "got wake word request from user speech provider that does not support wake word");
            return false;
        }
        if (isExternalWakeWordDevice(userSpeechProvider)) {
            return true;
        }
        if (isInAppWakeWordProvider(userSpeechProvider)) {
            return !z;
        }
        if (isSystemWakeWordProvider(userSpeechProvider)) {
            return (z || z2) ? false : true;
        }
        Log.w(TAG, "Wake word is not expected for " + getProviderType(userSpeechProvider));
        return false;
    }

    public UserSpeechProvider getBestProviderForRequest(UserSpeechProviderRegistry userSpeechProviderRegistry) {
        Set<UserSpeechProvider> externalUserSpeechProviders = userSpeechProviderRegistry.getExternalUserSpeechProviders();
        UserSpeechProvider accessoryIfConnected = getAccessoryIfConnected(externalUserSpeechProviders);
        if (accessoryIfConnected != null && accessoryIfConnected.supportsRequestDialog()) {
            return accessoryIfConnected;
        }
        UserSpeechProvider systemWakeWordProvider = getSystemWakeWordProvider(externalUserSpeechProviders);
        if (systemWakeWordProvider != null && systemWakeWordProvider.supportsRequestDialog()) {
            return systemWakeWordProvider;
        }
        UserSpeechProvider inAppWakeWordProvider = getInAppWakeWordProvider(externalUserSpeechProviders);
        return (inAppWakeWordProvider == null || !inAppWakeWordProvider.supportsRequestDialog()) ? userSpeechProviderRegistry.getInternalUserSpeechProvider() : inAppWakeWordProvider;
    }

    public boolean isDialogRequestAllowed(UserSpeechProviderRegistry userSpeechProviderRegistry, UserSpeechProvider userSpeechProvider, LaunchSource launchSource) {
        if (getProviderType(userSpeechProvider) != AlexaUserSpeechProviderScope.EXTERNAL_DEVICE) {
            Set<UserSpeechProvider> all = userSpeechProviderRegistry.getAll();
            return launchSource != LaunchSource.WAKE_WORD || (canProvideWakeWord(userSpeechProvider) && isWakeWordRequestAllowed(userSpeechProvider, hasWakeWordAccessoryConnected(all), hasInAppWakeWordProvider(all), hasSystemWakeWordProvider(all)));
        }
        if (launchSource == LaunchSource.WAKE_WORD && !canProvideWakeWord(userSpeechProvider)) {
            Log.w(TAG, "EXTERNAL_DEVICE provider requesting WAKE_WORD dialog but metadata does not declare wake word support. Allowing request anyway.");
        }
        return true;
    }

    public void updateArbitration(UserSpeechProviderRegistry userSpeechProviderRegistry) {
        Set<UserSpeechProvider> all = userSpeechProviderRegistry.getAll();
        boolean hasWakeWordAccessoryConnected = hasWakeWordAccessoryConnected(all);
        boolean hasInAppWakeWordProvider = hasInAppWakeWordProvider(all);
        boolean hasSystemWakeWordProvider = hasSystemWakeWordProvider(all);
        for (UserSpeechProvider userSpeechProvider : all) {
            if (userSpeechProvider.getMetadata().supportsWakeWord()) {
                boolean isWakeWordRequestAllowed = isWakeWordRequestAllowed(userSpeechProvider, hasWakeWordAccessoryConnected, hasInAppWakeWordProvider, hasSystemWakeWordProvider);
                userSpeechProvider.setWakeWordDetectionEnabled(isWakeWordRequestAllowed);
                if (isWakeWordRequestAllowed) {
                    Log.i(TAG, "wake word detection is handled by " + userSpeechProvider.getMetadata().getProviderScope());
                }
            }
        }
    }
}
