package com.dee.app.contacts.common.dagger.modules;

import androidx.annotation.Nullable;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import com.dee.app.contacts.common.constants.coremodules.RemoteConfig;
import dagger.Module;
import dagger.Provides;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes6.dex */
public class NetworkModule {
    private static final String ACMS_HOST_CONFIG_KEY_FORMAT = "%s.%s";
    private static final String ACMS_HOST_CONFIG_PFM_DEFAULT_VALUE = "Default";
    private static final String CONTACTS_CLIENT_NAME = "amazon-contacts";

    @Provides
    @Named("ACMSHost")
    public String provideACMSHost(@Nullable AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService, @Nullable AlexaCommsCoreIdentityService alexaCommsCoreIdentityService) {
        String str;
        try {
            str = alexaCommsCoreIdentityService.getIdentity().getMarketplaceInfo().getPfmCode();
        } catch (Exception unused) {
            str = "Default";
        }
        RemoteConfig remoteConfig = RemoteConfig.ACMS_HOST;
        String m$1 = a$$ExternalSyntheticOutline0.m$1(remoteConfig.getKey(), ".", str);
        String defaultValue = remoteConfig.getDefaultValue();
        try {
            return alexaCommsCoreRemoteConfigurationService.getRemoteConfiguration(m$1, defaultValue).toString();
        } catch (Exception unused2) {
            return defaultValue;
        }
    }

    @Provides
    @Named("ClientId")
    public String provideClientId() {
        return "amazon-contacts";
    }
}
