package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.content.ComponentName;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.AutoValue_ExternalMediaPlayerRegistration;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.LocalPlayerIdentifier;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlayerCookie;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlayerVersion;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.SpiVersion;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ExternalMediaPlayerRegistration {
    private static final String COMPONENT_NAME = "Component";
    private static final String EMPTY_STRING = "";
    private static final String EXTERNAL_PLAYER_ID = "ExternalPlayerID";
    public static final ExternalMediaPlayerRegistration INVALID = create(ExternalPlayerIdentifier.UNKNOWN, "", "", SpiVersion.UNKNOWN, PlayerCookie.UNKNOWN, PlayerVersion.UNKNOWN, AuthorizedState.UNAUTHORIZED, Collections.EMPTY_SET);
    private static final String PLAYER_COOKIE_NAME = "Cookie";
    private static final String PLAYER_VERSION_NAME = "PlayerVersion";
    private static final String REGISTRATION_NAME = "Registration";
    private static final String SPI_VERSION_NAME = "Version";
    private static final String STATE = "State";
    private static final String TO_STRING_FORMAT = "{%s: %s, %s: %s, %s: %s, %s: %s, %s: %s, %s: %s, %s: %s}";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AuthorizedState {
        UNKNOWN,
        AUTHORIZED,
        UNAUTHORIZED
    }

    private static ExternalMediaPlayerRegistration create(ExternalPlayerIdentifier externalPlayerIdentifier, String str, String str2, SpiVersion spiVersion, PlayerCookie playerCookie, PlayerVersion playerVersion, AuthorizedState authorizedState, Set<String> set) {
        return new AutoValue_ExternalMediaPlayerRegistration(externalPlayerIdentifier, LocalPlayerIdentifier.create(str), new ComponentName(str, str2), spiVersion, playerCookie, playerVersion, authorizedState, set);
    }

    public static ExternalMediaPlayerRegistration createAuthorized(ExternalPlayerIdentifier externalPlayerIdentifier, ExternalMediaPlayerRegistration externalMediaPlayerRegistration) {
        return create(externalPlayerIdentifier, externalMediaPlayerRegistration.getComponentName().getPackageName(), externalMediaPlayerRegistration.getComponentName().getClassName(), externalMediaPlayerRegistration.getSpiVersion(), externalMediaPlayerRegistration.getPlayerCookie(), externalMediaPlayerRegistration.getPlayerVersion(), AuthorizedState.AUTHORIZED, externalMediaPlayerRegistration.getValidationData());
    }

    public static ExternalMediaPlayerRegistration createUnauthorized(ExternalMediaPlayerRegistration externalMediaPlayerRegistration) {
        return create(ExternalPlayerIdentifier.UNKNOWN, externalMediaPlayerRegistration.getComponentName().getPackageName(), externalMediaPlayerRegistration.getComponentName().getClassName(), externalMediaPlayerRegistration.getSpiVersion(), externalMediaPlayerRegistration.getPlayerCookie(), externalMediaPlayerRegistration.getPlayerVersion(), AuthorizedState.UNAUTHORIZED, externalMediaPlayerRegistration.getValidationData());
    }

    public static ExternalMediaPlayerRegistration createUnknown(String str, String str2, SpiVersion spiVersion, PlayerCookie playerCookie, PlayerVersion playerVersion, Set<String> set) {
        return create(ExternalPlayerIdentifier.UNKNOWN, str, str2, spiVersion, playerCookie, playerVersion, AuthorizedState.UNKNOWN, set);
    }

    public static TypeAdapter<ExternalMediaPlayerRegistration> typeAdapter(Gson gson) {
        return new AutoValue_ExternalMediaPlayerRegistration.GsonTypeAdapter(gson);
    }

    public boolean areStaticRegistrationValuesEqual(ExternalMediaPlayerRegistration externalMediaPlayerRegistration) {
        return externalMediaPlayerRegistration != null && Objects.equals(getComponentName(), externalMediaPlayerRegistration.getComponentName()) && Objects.equals(getSpiVersion(), externalMediaPlayerRegistration.getSpiVersion()) && Objects.equals(getPlayerCookie(), externalMediaPlayerRegistration.getPlayerCookie()) && Objects.equals(getPlayerVersion(), externalMediaPlayerRegistration.getPlayerVersion()) && externalMediaPlayerRegistration.getValidationData() != null && getValidationData().containsAll(externalMediaPlayerRegistration.getValidationData()) && externalMediaPlayerRegistration.getValidationData().containsAll(getValidationData());
    }

    public abstract AuthorizedState getAuthorizedState();

    public abstract ComponentName getComponentName();

    public abstract LocalPlayerIdentifier getLocalPlayerIdentifier();

    public abstract PlayerCookie getPlayerCookie();

    public abstract ExternalPlayerIdentifier getPlayerID();

    public abstract PlayerVersion getPlayerVersion();

    public abstract SpiVersion getSpiVersion();

    public abstract Set<String> getValidationData();

    public boolean isAuthorized() {
        return getAuthorizedState() == AuthorizedState.AUTHORIZED;
    }

    public String toString() {
        return String.format(Locale.US, TO_STRING_FORMAT, REGISTRATION_NAME, getLocalPlayerIdentifier(), "Version", getSpiVersion().getValue(), COMPONENT_NAME, getComponentName(), "Cookie", getPlayerCookie(), PLAYER_VERSION_NAME, getPlayerVersion(), EXTERNAL_PLAYER_ID, getPlayerID(), STATE, getAuthorizedState().name());
    }
}
