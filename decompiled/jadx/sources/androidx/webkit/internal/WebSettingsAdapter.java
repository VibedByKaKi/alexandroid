package androidx.webkit.internal;

import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class WebSettingsAdapter {
    private final WebSettingsBoundaryInterface mBoundaryInterface;

    public WebSettingsAdapter(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.mBoundaryInterface = webSettingsBoundaryInterface;
    }

    public int getAttributionRegistrationBehavior() {
        return this.mBoundaryInterface.getAttributionBehavior();
    }

    public boolean getBackForwardCacheEnabled() {
        return this.mBoundaryInterface.getBackForwardCacheEnabled();
    }

    public int getDisabledActionModeMenuItems() {
        return this.mBoundaryInterface.getDisabledActionModeMenuItems();
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return this.mBoundaryInterface.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int getForceDark() {
        return this.mBoundaryInterface.getForceDark();
    }

    public int getForceDarkStrategy() {
        return this.mBoundaryInterface.getForceDarkBehavior();
    }

    public boolean getHasEnrolledInstrumentEnabled() {
        return this.mBoundaryInterface.getHasEnrolledInstrumentEnabled();
    }

    public boolean getOffscreenPreRaster() {
        return this.mBoundaryInterface.getOffscreenPreRaster();
    }

    public boolean getPaymentRequestEnabled() {
        return this.mBoundaryInterface.getPaymentRequestEnabled();
    }

    public Set<String> getRequestedWithHeaderOriginAllowList() {
        return this.mBoundaryInterface.getRequestedWithHeaderOriginAllowList();
    }

    public boolean getSafeBrowsingEnabled() {
        return this.mBoundaryInterface.getSafeBrowsingEnabled();
    }

    public int getSpeculativeLoadingStatus() {
        return this.mBoundaryInterface.getSpeculativeLoadingStatus();
    }

    public UserAgentMetadata getUserAgentMetadata() {
        return UserAgentMetadataInternal.getUserAgentMetadataFromMap(this.mBoundaryInterface.getUserAgentMetadataMap());
    }

    public int getWebAuthenticationSupport() {
        return this.mBoundaryInterface.getWebauthnSupport();
    }

    public WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
        return new WebViewMediaIntegrityApiStatusConfig.Builder(this.mBoundaryInterface.getWebViewMediaIntegrityApiDefaultStatus()).setOverrideRules(this.mBoundaryInterface.getWebViewMediaIntegrityApiOverrideRules()).build();
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return this.mBoundaryInterface.isAlgorithmicDarkeningAllowed();
    }

    public void setAlgorithmicDarkeningAllowed(boolean z) {
        this.mBoundaryInterface.setAlgorithmicDarkeningAllowed(z);
    }

    public void setAttributionRegistrationBehavior(int i) {
        this.mBoundaryInterface.setAttributionBehavior(i);
    }

    public void setBackForwardCacheEnabled(boolean z) {
        this.mBoundaryInterface.setBackForwardCacheEnabled(z);
    }

    public void setDisabledActionModeMenuItems(int i) {
        this.mBoundaryInterface.setDisabledActionModeMenuItems(i);
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z) {
        this.mBoundaryInterface.setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    public void setForceDark(int i) {
        this.mBoundaryInterface.setForceDark(i);
    }

    public void setForceDarkStrategy(int i) {
        this.mBoundaryInterface.setForceDarkBehavior(i);
    }

    public void setHasEnrolledInstrumentEnabled(boolean z) {
        this.mBoundaryInterface.setHasEnrolledInstrumentEnabled(z);
    }

    public void setOffscreenPreRaster(boolean z) {
        this.mBoundaryInterface.setOffscreenPreRaster(z);
    }

    public void setPaymentRequestEnabled(boolean z) {
        this.mBoundaryInterface.setPaymentRequestEnabled(z);
    }

    public void setRequestedWithHeaderOriginAllowList(Set<String> set) {
        this.mBoundaryInterface.setRequestedWithHeaderOriginAllowList(set);
    }

    public void setSafeBrowsingEnabled(boolean z) {
        this.mBoundaryInterface.setSafeBrowsingEnabled(z);
    }

    public void setSpeculativeLoadingStatus(int i) {
        this.mBoundaryInterface.setSpeculativeLoadingStatus(i);
    }

    public void setUserAgentMetadata(UserAgentMetadata userAgentMetadata) {
        this.mBoundaryInterface.setUserAgentMetadataFromMap(UserAgentMetadataInternal.convertUserAgentMetadataToMap(userAgentMetadata));
    }

    public void setWebAuthenticationSupport(int i) {
        this.mBoundaryInterface.setWebauthnSupport(i);
    }

    public void setWebViewMediaIntegrityApiStatus(WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
        this.mBoundaryInterface.setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig.getDefaultStatus(), webViewMediaIntegrityApiStatusConfig.getOverrideRules());
    }
}
