package com.amazon.comms.models.sip.payloads;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.models.sip.SIPAuthenticationInfo;
import com.amazon.comms.models.sip.SIPProxyEndpoint;
import com.amazon.dee.application.service.common.logging.RedactInLogs;
import com.fasterxml.jackson.annotation.JsonInclude;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RedactInLogs
/* loaded from: classes20.dex */
public class SIPRegisterInfo {
    private SIPAuthenticationInfo authenticationInfo;
    private String domain;
    private Integer expires;
    private SIPProxyEndpoint proxyEndpoint;
    private String scheme;
    private String sipInstance;
    private String user;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SIPRegisterInfoBuilder {
        private SIPAuthenticationInfo authenticationInfo;
        private String domain;
        private Integer expires;
        private SIPProxyEndpoint proxyEndpoint;
        private String scheme;
        private String sipInstance;
        private String user;

        public SIPRegisterInfoBuilder authenticationInfo(SIPAuthenticationInfo sIPAuthenticationInfo) {
            this.authenticationInfo = sIPAuthenticationInfo;
            return this;
        }

        public SIPRegisterInfo build() {
            return new SIPRegisterInfo(this.scheme, this.domain, this.user, this.sipInstance, this.expires, this.authenticationInfo, this.proxyEndpoint, 0);
        }

        public SIPRegisterInfoBuilder domain(String str) {
            this.domain = str;
            return this;
        }

        public SIPRegisterInfoBuilder expires(Integer num) {
            this.expires = num;
            return this;
        }

        public SIPRegisterInfoBuilder proxyEndpoint(SIPProxyEndpoint sIPProxyEndpoint) {
            this.proxyEndpoint = sIPProxyEndpoint;
            return this;
        }

        public SIPRegisterInfoBuilder scheme(String str) {
            this.scheme = str;
            return this;
        }

        public SIPRegisterInfoBuilder sipInstance(String str) {
            this.sipInstance = str;
            return this;
        }

        public String toString() {
            String str = this.scheme;
            String str2 = this.domain;
            String str3 = this.user;
            String str4 = this.sipInstance;
            Integer num = this.expires;
            String valueOf = String.valueOf(this.authenticationInfo);
            String valueOf2 = String.valueOf(this.proxyEndpoint);
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SIPRegisterInfo.SIPRegisterInfoBuilder(scheme=", str, ", domain=", str2, ", user=");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", sipInstance=", str4, ", expires=");
            m.append(num);
            m.append(", authenticationInfo=");
            m.append(valueOf);
            m.append(", proxyEndpoint=");
            return a$$ExternalSyntheticOutline0.m(m, valueOf2, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public SIPRegisterInfoBuilder user(String str) {
            this.user = str;
            return this;
        }
    }

    private SIPRegisterInfo(String str, String str2, String str3, String str4, Integer num, SIPAuthenticationInfo sIPAuthenticationInfo, SIPProxyEndpoint sIPProxyEndpoint) {
        this.scheme = str;
        this.domain = str2;
        this.user = str3;
        this.sipInstance = str4;
        this.expires = num;
        this.authenticationInfo = sIPAuthenticationInfo;
        this.proxyEndpoint = sIPProxyEndpoint;
    }

    public static SIPRegisterInfoBuilder builder() {
        return new SIPRegisterInfoBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SIPRegisterInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SIPRegisterInfo)) {
            return false;
        }
        SIPRegisterInfo sIPRegisterInfo = (SIPRegisterInfo) obj;
        if (!sIPRegisterInfo.canEqual(this)) {
            return false;
        }
        Integer expires = getExpires();
        Integer expires2 = sIPRegisterInfo.getExpires();
        if (expires != null ? !expires.equals(expires2) : expires2 != null) {
            return false;
        }
        String scheme = getScheme();
        String scheme2 = sIPRegisterInfo.getScheme();
        if (scheme != null ? !scheme.equals(scheme2) : scheme2 != null) {
            return false;
        }
        String domain = getDomain();
        String domain2 = sIPRegisterInfo.getDomain();
        if (domain != null ? !domain.equals(domain2) : domain2 != null) {
            return false;
        }
        String user = getUser();
        String user2 = sIPRegisterInfo.getUser();
        if (user != null ? !user.equals(user2) : user2 != null) {
            return false;
        }
        String sipInstance = getSipInstance();
        String sipInstance2 = sIPRegisterInfo.getSipInstance();
        if (sipInstance != null ? !sipInstance.equals(sipInstance2) : sipInstance2 != null) {
            return false;
        }
        SIPAuthenticationInfo authenticationInfo = getAuthenticationInfo();
        SIPAuthenticationInfo authenticationInfo2 = sIPRegisterInfo.getAuthenticationInfo();
        if (authenticationInfo != null ? !authenticationInfo.equals(authenticationInfo2) : authenticationInfo2 != null) {
            return false;
        }
        SIPProxyEndpoint proxyEndpoint = getProxyEndpoint();
        SIPProxyEndpoint proxyEndpoint2 = sIPRegisterInfo.getProxyEndpoint();
        return proxyEndpoint != null ? proxyEndpoint.equals(proxyEndpoint2) : proxyEndpoint2 == null;
    }

    public SIPAuthenticationInfo getAuthenticationInfo() {
        return this.authenticationInfo;
    }

    public String getDomain() {
        return this.domain;
    }

    public Integer getExpires() {
        return this.expires;
    }

    public SIPProxyEndpoint getProxyEndpoint() {
        return this.proxyEndpoint;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getSipInstance() {
        return this.sipInstance;
    }

    public String getUser() {
        return this.user;
    }

    public int hashCode() {
        Integer expires = getExpires();
        int hashCode = expires == null ? 43 : expires.hashCode();
        String scheme = getScheme();
        int hashCode2 = ((hashCode + 59) * 59) + (scheme == null ? 43 : scheme.hashCode());
        String domain = getDomain();
        int hashCode3 = (hashCode2 * 59) + (domain == null ? 43 : domain.hashCode());
        String user = getUser();
        int hashCode4 = (hashCode3 * 59) + (user == null ? 43 : user.hashCode());
        String sipInstance = getSipInstance();
        int hashCode5 = (hashCode4 * 59) + (sipInstance == null ? 43 : sipInstance.hashCode());
        SIPAuthenticationInfo authenticationInfo = getAuthenticationInfo();
        int i = hashCode5 * 59;
        int hashCode6 = authenticationInfo == null ? 43 : authenticationInfo.hashCode();
        SIPProxyEndpoint proxyEndpoint = getProxyEndpoint();
        return ((i + hashCode6) * 59) + (proxyEndpoint != null ? proxyEndpoint.hashCode() : 43);
    }

    public void setAuthenticationInfo(SIPAuthenticationInfo sIPAuthenticationInfo) {
        this.authenticationInfo = sIPAuthenticationInfo;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setExpires(Integer num) {
        this.expires = num;
    }

    public void setProxyEndpoint(SIPProxyEndpoint sIPProxyEndpoint) {
        this.proxyEndpoint = sIPProxyEndpoint;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setSipInstance(String str) {
        this.sipInstance = str;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public String toString() {
        String scheme = getScheme();
        String domain = getDomain();
        String user = getUser();
        String sipInstance = getSipInstance();
        Integer expires = getExpires();
        String valueOf = String.valueOf(getAuthenticationInfo());
        String valueOf2 = String.valueOf(getProxyEndpoint());
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SIPRegisterInfo(scheme=", scheme, ", domain=", domain, ", user=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, user, ", sipInstance=", sipInstance, ", expires=");
        m.append(expires);
        m.append(", authenticationInfo=");
        m.append(valueOf);
        m.append(", proxyEndpoint=");
        return a$$ExternalSyntheticOutline0.m(m, valueOf2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public SIPRegisterInfo() {
    }

    public /* synthetic */ SIPRegisterInfo(String str, String str2, String str3, String str4, Integer num, SIPAuthenticationInfo sIPAuthenticationInfo, SIPProxyEndpoint sIPProxyEndpoint, int i) {
        this(str, str2, str3, str4, num, sIPAuthenticationInfo, sIPProxyEndpoint);
    }
}
