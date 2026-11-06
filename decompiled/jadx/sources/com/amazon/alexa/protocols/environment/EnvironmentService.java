package com.amazon.alexa.protocols.environment;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.marketplace.api.Marketplace;
import com.amazon.alexa.marketplace.api.MarketplaceEndpoints;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface EnvironmentService {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum KnownUrlType {
        AUTH_PORTAL,
        AUTH_PORTAL_SIGN_IN,
        CANTILEVER,
        CANTILEVER_PREPROD,
        MESSAGE_US,
        HMD_SURVEY,
        AMAZON_ROOT,
        AMAZON_RETAIL_NON_ROOT,
        AMAZON_FORUM,
        AMAZON_FORUM_AUTH_SALESFORCE,
        AMAZON_FORUM_RETAIL,
        MAYDAY_SCREEN_SHARE
    }

    MarketplaceEndpoints forMarketplace(@NonNull Marketplace marketplace);

    @NonNull
    default String getApiGatewayEndpoint() {
        throw new UnsupportedOperationException("This operation is not implemented.");
    }

    @NonNull
    default String getApiGatewayHost() {
        throw new UnsupportedOperationException("This operation is not implemented.");
    }

    @NonNull
    String getAuthWebAssociationHandle();

    @NonNull
    String getAuthWebHost();

    @NonNull
    default String getBobEndpoint() {
        return "";
    }

    String getBuildFlavor();

    String getBuildStage();

    @NonNull
    String getCoralEndpoint();

    @NonNull
    String getCoralEndpoint(@NonNull String str);

    @NonNull
    String getCoralHost();

    String getCountryCode();

    com.amazon.alexa.device.api.DeviceInformation getDeviceInformation();

    @NonNull
    Marketplace getMarketplace();

    @Nullable
    default <T> T getMobilyticsEndpoint(@NonNull Map<String, T> map) {
        throw new UnsupportedOperationException("This operation is not implemented.");
    }

    @NonNull
    String getPrefetchUrl();

    @NonNull
    default String getRetailEndpoint() {
        throw new UnsupportedOperationException("This operation is not implemented.");
    }

    @NonNull
    default String getRetailHost() {
        throw new UnsupportedOperationException("This operation is not implemented.");
    }

    @NonNull
    default String getSkillsStoreEndpoint() {
        throw new UnsupportedOperationException("This operation is not implemented.");
    }

    String getVersionName();

    @NonNull
    String getWebEndpoint();

    @NonNull
    String getWebHost();

    @NonNull
    String getWebIndex();

    boolean isDebugBuild();

    boolean isDevelopmentFabric();

    default boolean isKnownUrl(KnownUrlType knownUrlType, String str) {
        return false;
    }

    boolean isOutsideWebAppUrl(String str);

    boolean isProductionFabric();

    boolean isWebAppUrl(String str);

    boolean isWebSigninUrl(String str);

    default boolean isWebTivUrl(Uri uri) {
        return false;
    }

    boolean isWebWarmSeatUrl(String str);

    boolean isWithinAlexaWebViewNonIndex(String str);

    boolean isWithinExternalUIWebView(String str, String str2);

    boolean isWithinHostList(String str, String[] strArr);

    boolean isWithinWebAppUrl(String str);

    void overrideHost(String str);

    void resetValues();

    void setAuthWebAssociationHandle(@NonNull String str);

    void setAuthWebHost(@NonNull String str);

    void setCoralHost(@NonNull String str);

    void setMarketplace(@NonNull Marketplace marketplace);

    void setWebHost(@NonNull String str);

    boolean shouldOverrideHosts();
}
