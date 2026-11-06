package com.amazon.alexa.mobilytics.integration.ama;

import com.amazon.alexa.mobilytics.BuildConfig;
import com.amazon.alexa.mobilytics.identity.MobilyticsCredentialKeyProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class DefaultMobilyticsCredentialKeyProvider implements MobilyticsCredentialKeyProvider {
    private static final Map<MobilyticsCredentialKeyProvider.MobilyticsRegions, String> BETA_COGNITO_POOL;
    private static final Map<MobilyticsCredentialKeyProvider.MobilyticsRegions, String> GAMMA_COGNITO_POOL;
    private static final Map<MobilyticsCredentialKeyProvider.MobilyticsRegions, String> PROD_COGNITO_POOL;
    private final Map<MobilyticsCredentialKeyProvider.MobilyticsRegions, String> cognitoPool;

    static {
        HashMap hashMap = new HashMap();
        GAMMA_COGNITO_POOL = hashMap;
        HashMap hashMap2 = new HashMap();
        PROD_COGNITO_POOL = hashMap2;
        HashMap hashMap3 = new HashMap();
        BETA_COGNITO_POOL = hashMap3;
        MobilyticsCredentialKeyProvider.MobilyticsRegions mobilyticsRegions = MobilyticsCredentialKeyProvider.MobilyticsRegions.US_EAST_1;
        hashMap3.put(mobilyticsRegions, BuildConfig.BETA_COGNITO_ID);
        MobilyticsCredentialKeyProvider.MobilyticsRegions mobilyticsRegions2 = MobilyticsCredentialKeyProvider.MobilyticsRegions.EU_WEST_1;
        hashMap3.put(mobilyticsRegions2, BuildConfig.BETA_COGNITO_ID);
        MobilyticsCredentialKeyProvider.MobilyticsRegions mobilyticsRegions3 = MobilyticsCredentialKeyProvider.MobilyticsRegions.US_WEST_2;
        hashMap3.put(mobilyticsRegions3, BuildConfig.BETA_COGNITO_ID);
        hashMap.put(mobilyticsRegions, BuildConfig.GAMMA_COGNITO_ID_US_EAST_1);
        hashMap.put(mobilyticsRegions2, BuildConfig.GAMMA_COGNITO_ID_EU_WEST_1);
        hashMap.put(mobilyticsRegions3, BuildConfig.GAMMA_COGNITO_ID_US_WEST_2);
        MobilyticsCredentialKeyProvider.MobilyticsRegions mobilyticsRegions4 = MobilyticsCredentialKeyProvider.MobilyticsRegions.EU_SOUTH_2;
        hashMap.put(mobilyticsRegions4, BuildConfig.GAMMA_COGNITO_ID_EU_SOUTH_2);
        hashMap2.put(mobilyticsRegions, "us-east-1:a66fa265-6aba-402a-b891-8a8da83089ed");
        hashMap2.put(mobilyticsRegions2, "eu-west-1:4addaeae-ff16-4dca-b9e6-901034a37aa9");
        hashMap2.put(mobilyticsRegions3, "us-west-2:d370c009-6f35-4dac-9d76-e1f3d8d33e4b");
        hashMap2.put(mobilyticsRegions4, BuildConfig.PROD_COGNITO_ID_EU_SOUTH_2);
    }

    public DefaultMobilyticsCredentialKeyProvider(int i) {
        if (i == 2) {
            this.cognitoPool = Collections.unmodifiableMap(PROD_COGNITO_POOL);
        } else {
            this.cognitoPool = Collections.unmodifiableMap(GAMMA_COGNITO_POOL);
        }
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsCredentialKeyProvider
    public Map<MobilyticsCredentialKeyProvider.MobilyticsRegions, String> credentialKeys() {
        return this.cognitoPool;
    }
}
