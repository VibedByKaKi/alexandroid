package com.amazon.alexa.presence.service;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.identity.api.PersonIdProvider;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.presence.Presence;
import com.amazon.alexa.presence.bleconn.identity.IdentityClient;
import com.amazon.alexa.presence.bleconn.identity.IdentityController;
import com.amazon.alexa.presence.bleconn.identity.PlatformSupport;
import com.amazon.alexa.presence.bleconn.identity.clients.LocalResponseIdentityClient;
import com.amazon.alexa.presence.bleconn.identity.clients.PresenceIdentityClient;
import com.amazon.alexa.presence.bleconn.identity.encryption.EncryptionModuleFactory;
import com.amazon.alexa.presence.bleconn.identity.encryption.EncryptionModuleFactoryImpl;
import com.amazon.alexa.presence.bleconn.identity.model.IdentityRepo;
import com.dee.app.metrics.MetricsServiceV2;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/presence/service/BleConnIdentityComponent;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "config", "Lcom/amazon/alexa/presence/service/PresenceServiceConfiguration;", "identityController", "Lcom/amazon/alexa/presence/bleconn/identity/IdentityController;", "getIdentityController", "()Lcom/amazon/alexa/presence/bleconn/identity/IdentityController;", "metricsServiceV2", "Lcom/dee/app/metrics/MetricsServiceV2;", "getMetricsServiceV2", "()Lcom/dee/app/metrics/MetricsServiceV2;", "mobilytics", "Lcom/amazon/alexa/mobilytics/Mobilytics;", "getMobilytics", "()Lcom/amazon/alexa/mobilytics/Mobilytics;", "personIdProvider", "Lcom/amazon/alexa/identity/api/PersonIdProvider;", "getPersonIdProvider", "()Lcom/amazon/alexa/identity/api/PersonIdProvider;", "newIdentityClient", "Lcom/amazon/alexa/presence/bleconn/identity/IdentityClient;", "platformSupport", "Lcom/amazon/alexa/presence/bleconn/identity/PlatformSupport;", "relationshipVerificationEncryptionModuleFactory", "Lcom/amazon/alexa/presence/bleconn/identity/encryption/EncryptionModuleFactory;", "tokenEncryptionModuleFactory", "Companion", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class BleConnIdentityComponent {
    private static final String TAG = Presence.tag();

    @NotNull
    private final PresenceServiceConfiguration config;

    @NotNull
    private final IdentityController identityController;

    @Inject
    public BleConnIdentityComponent(@NotNull Context context) {
        context.getClass();
        PresenceServiceConfiguration defaultConfiguration = PresenceServiceConfiguration.defaultConfiguration();
        defaultConfiguration.getClass();
        this.config = defaultConfiguration;
        this.identityController = new IdentityController(new IdentityRepo(new PersistentMap(context)), newIdentityClient(), tokenEncryptionModuleFactory(), relationshipVerificationEncryptionModuleFactory(), platformSupport());
    }

    private final MetricsServiceV2 getMetricsServiceV2() {
        return (MetricsServiceV2) Automotive$$ExternalSyntheticOutline0.m(MetricsServiceV2.class);
    }

    private final Mobilytics getMobilytics() {
        return (Mobilytics) Automotive$$ExternalSyntheticOutline0.m(Mobilytics.class);
    }

    private final PersonIdProvider getPersonIdProvider() {
        return (PersonIdProvider) Automotive$$ExternalSyntheticOutline0.m(PersonIdProvider.class);
    }

    private final IdentityClient newIdentityClient() {
        if (this.config.shouldUseLocalShim()) {
            Log.i(TAG, "Using static identity shim");
            return new LocalResponseIdentityClient();
        }
        String identityEndpoint = this.config.getIdentityEndpoint();
        Log.i(TAG, "Setting Identity Token endpoint = " + identityEndpoint);
        return new PresenceIdentityClient(identityEndpoint, new MapAuthTokenProvider(), getPersonIdProvider(), getMetricsServiceV2(), getMobilytics());
    }

    private final PlatformSupport platformSupport() {
        return new BleConnIdentityComponent$$ExternalSyntheticLambda0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] platformSupport$lambda$0(String str) {
        return Base64.decode(str, 0);
    }

    private final EncryptionModuleFactory relationshipVerificationEncryptionModuleFactory() {
        return new EncryptionModuleFactoryImpl(EncryptionModuleFactoryImpl.EncryptionModes.RELATIONSHIP_TOKEN);
    }

    private final EncryptionModuleFactory tokenEncryptionModuleFactory() {
        return new EncryptionModuleFactoryImpl(EncryptionModuleFactoryImpl.EncryptionModes.IDENTITY_TOKEN);
    }

    @NotNull
    public final IdentityController getIdentityController() {
        return this.identityController;
    }
}
