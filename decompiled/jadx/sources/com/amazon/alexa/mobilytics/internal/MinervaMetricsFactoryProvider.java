package com.amazon.alexa.mobilytics.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.minerva.client.common.api.AmazonMinerva;
import com.amazon.minerva.client.common.api.AmazonMinervaClientBuilder;
import com.amazon.minerva.client.common.api.AmazonMinervaServiceInitializer;
import com.amazon.minerva.client.common.api.AmazonMinervaV2;
import com.amazon.minerva.client.common.api.provider.CustomerInfoProvider;
import com.amazon.minerva.client.common.compliance.ChildProfileVerifier;
import com.amazon.minerva.client.common.compliance.NonAnonymousCustomerIdProvider;
import com.amazon.minerva.client.common.compliance.UserControlVerifier;
import com.amazon.minerva.client.common.transport.OAuthProvider;
import com.google.common.base.Preconditions;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class MinervaMetricsFactoryProvider {
    private static final String DEVICE_TYPE = "A2TF17PFR55MTB";
    private static final String GAMMA_ARCUS_ID = "arn:aws:remote-config:us-west-2:998582633060:appConfig:ai049ytq";
    private static final String PROD_ARCUS_ID = "arn:aws:remote-config:us-west-2:998582633060:appConfig:ao6jwx12";
    public static final String REGION = "us-east-1";
    private final Context context;
    private final int domain;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultChildProfileVerifier implements ChildProfileVerifier {
        @Override // com.amazon.minerva.client.common.compliance.ChildProfileVerifier
        public boolean isChildProfile() throws Exception {
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultCustomerInfoProvider implements CustomerInfoProvider {
        public static final String UNKNOWN = "UNKNOWN";
        private String countryOfResidence = "UNKNOWN";
        private String marketplaceId = "UNKNOWN";

        @Override // com.amazon.minerva.client.common.api.provider.CustomerInfoProvider
        public String getCountryOfResidence() {
            return this.countryOfResidence;
        }

        @Override // com.amazon.minerva.client.common.api.provider.CustomerInfoProvider
        public String getMarketplaceId() {
            return this.marketplaceId;
        }

        public void setCountryOfResidence(String str) {
            this.countryOfResidence = str;
        }

        public void setMarketplaceId(String str) {
            this.marketplaceId = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultNonAnonymousCustomerIdProvider implements NonAnonymousCustomerIdProvider {
        public static final String UNKNOWN = "UNKNOWN";
        private String customerId;

        @Override // com.amazon.minerva.client.common.compliance.NonAnonymousCustomerIdProvider
        public String getNonAnonymousCustomerId() {
            return this.customerId;
        }

        public void setCustomerId(@NonNull String str) {
            this.customerId = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultOAuthProvider implements OAuthProvider {
        private static final String TAG = Log.tag((Class<?>) DefaultOAuthProvider.class);
        private IdentityService identityService;
        private final Context mContext;

        public DefaultOAuthProvider(Context context) {
            this.identityService = null;
            this.mContext = context;
            ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
            if (componentRegistry == null || !componentRegistry.get(IdentityService.class).isPresent()) {
                return;
            }
            this.identityService = (IdentityService) componentRegistry.get(IdentityService.class).get();
        }

        @Override // com.amazon.minerva.client.common.transport.OAuthProvider
        public String getAccessToken() throws Exception {
            if (this.identityService == null) {
                ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
                if (componentRegistry == null || !componentRegistry.get(IdentityService.class).isPresent()) {
                    Log.d(TAG, "Access token is null.");
                    return null;
                }
                this.identityService = (IdentityService) componentRegistry.get(IdentityService.class).get();
            }
            String accessToken = this.identityService.getAccessToken(DefaultOAuthProvider.class.getName());
            Log.d(TAG, "Returning access token %s", accessToken);
            return accessToken;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultUserControlVerifier implements UserControlVerifier {
        @Override // com.amazon.minerva.client.common.compliance.UserControlVerifier
        public boolean isUsageCollectionEnabled() throws Exception {
            return true;
        }
    }

    @Inject
    public MinervaMetricsFactoryProvider(@NonNull Context context, int i) {
        this.context = (Context) Preconditions.checkNotNull(context);
        this.domain = i;
    }

    public AmazonMinerva getMetricsFactory(NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, CustomerInfoProvider customerInfoProvider, String str, String str2) {
        AmazonMinervaServiceInitializer amazonMinervaServiceInitializer = AmazonMinervaServiceInitializer.getInstance();
        boolean isInitialized = amazonMinervaServiceInitializer.isInitialized();
        String str3 = GAMMA_ARCUS_ID;
        if (!isInitialized) {
            amazonMinervaServiceInitializer.initialize(this.context, "A2TF17PFR55MTB", new DefaultOAuthProvider(this.context), new DefaultChildProfileVerifier(), new DefaultUserControlVerifier(), this.domain == 2 ? PROD_ARCUS_ID : GAMMA_ARCUS_ID, nonAnonymousCustomerIdProvider, str2, str, customerInfoProvider);
        }
        Context context = this.context;
        if (this.domain == 2) {
            str3 = PROD_ARCUS_ID;
        }
        return AmazonMinervaClientBuilder.standard(context, str3).withRegion("us-east-1").withDeviceType("A2TF17PFR55MTB").withOAuthProvider(new DefaultOAuthProvider(this.context)).withChildProfileVerifier(new DefaultChildProfileVerifier()).withUserControlVerifier(new DefaultUserControlVerifier()).withNonAnonymousCustomerIdProvider(nonAnonymousCustomerIdProvider).withMarketplaceId(str).withNonAnonymousDeviceId(str2).withRunInitialUpload(true).build();
    }

    public AmazonMinervaV2 getMetricsV2Factory(NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, CustomerInfoProvider customerInfoProvider, String str, String str2) {
        AmazonMinervaServiceInitializer amazonMinervaServiceInitializer = AmazonMinervaServiceInitializer.getInstance();
        boolean isInitialized = amazonMinervaServiceInitializer.isInitialized();
        String str3 = GAMMA_ARCUS_ID;
        if (!isInitialized) {
            amazonMinervaServiceInitializer.initialize(this.context, "A2TF17PFR55MTB", new DefaultOAuthProvider(this.context), new DefaultChildProfileVerifier(), new DefaultUserControlVerifier(), this.domain == 2 ? PROD_ARCUS_ID : GAMMA_ARCUS_ID, nonAnonymousCustomerIdProvider, str2, str, customerInfoProvider);
        }
        Context context = this.context;
        if (this.domain == 2) {
            str3 = PROD_ARCUS_ID;
        }
        return AmazonMinervaClientBuilder.standard(context, str3).withRegion("us-east-1").withDeviceType("A2TF17PFR55MTB").withOAuthProvider(new DefaultOAuthProvider(this.context)).withChildProfileVerifier(new DefaultChildProfileVerifier()).withUserControlVerifier(new DefaultUserControlVerifier()).withNonAnonymousCustomerIdProvider(nonAnonymousCustomerIdProvider).withMarketplaceId(str).withNonAnonymousDeviceId(str2).withRunInitialUpload(true).buildV2();
    }
}
