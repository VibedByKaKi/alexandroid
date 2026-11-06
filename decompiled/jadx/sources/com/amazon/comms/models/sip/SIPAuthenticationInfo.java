package com.amazon.comms.models.sip;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.application.service.common.logging.RedactInLogs;
import com.fasterxml.jackson.annotation.JsonInclude;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RedactInLogs
/* loaded from: classes20.dex */
public class SIPAuthenticationInfo {
    private String authToken;
    private String password;
    private String realm;
    private String user;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SIPAuthenticationInfoBuilder {
        private String authToken;
        private String password;
        private String realm;
        private String user;

        public SIPAuthenticationInfoBuilder authToken(String str) {
            this.authToken = str;
            return this;
        }

        public SIPAuthenticationInfo build() {
            return new SIPAuthenticationInfo(this.realm, this.user, this.password, this.authToken, 0);
        }

        public SIPAuthenticationInfoBuilder password(String str) {
            this.password = str;
            return this;
        }

        public SIPAuthenticationInfoBuilder realm(String str) {
            this.realm = str;
            return this;
        }

        public String toString() {
            String str = this.realm;
            String str2 = this.user;
            return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("SIPAuthenticationInfo.SIPAuthenticationInfoBuilder(realm=", str, ", user=", str2, ", password="), this.password, ", authToken=", this.authToken, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public SIPAuthenticationInfoBuilder user(String str) {
            this.user = str;
            return this;
        }
    }

    private SIPAuthenticationInfo(String str, String str2, String str3, String str4) {
        this.realm = str;
        this.user = str2;
        this.password = str3;
        this.authToken = str4;
    }

    public static SIPAuthenticationInfoBuilder builder() {
        return new SIPAuthenticationInfoBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SIPAuthenticationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SIPAuthenticationInfo)) {
            return false;
        }
        SIPAuthenticationInfo sIPAuthenticationInfo = (SIPAuthenticationInfo) obj;
        if (!sIPAuthenticationInfo.canEqual(this)) {
            return false;
        }
        String realm = getRealm();
        String realm2 = sIPAuthenticationInfo.getRealm();
        if (realm != null ? !realm.equals(realm2) : realm2 != null) {
            return false;
        }
        String user = getUser();
        String user2 = sIPAuthenticationInfo.getUser();
        if (user != null ? !user.equals(user2) : user2 != null) {
            return false;
        }
        String password = getPassword();
        String password2 = sIPAuthenticationInfo.getPassword();
        if (password != null ? !password.equals(password2) : password2 != null) {
            return false;
        }
        String authToken = getAuthToken();
        String authToken2 = sIPAuthenticationInfo.getAuthToken();
        return authToken != null ? authToken.equals(authToken2) : authToken2 == null;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRealm() {
        return this.realm;
    }

    public String getUser() {
        return this.user;
    }

    public int hashCode() {
        String realm = getRealm();
        int hashCode = realm == null ? 43 : realm.hashCode();
        String user = getUser();
        int hashCode2 = ((hashCode + 59) * 59) + (user == null ? 43 : user.hashCode());
        String password = getPassword();
        int i = hashCode2 * 59;
        int hashCode3 = password == null ? 43 : password.hashCode();
        String authToken = getAuthToken();
        return ((i + hashCode3) * 59) + (authToken != null ? authToken.hashCode() : 43);
    }

    public void setAuthToken(String str) {
        this.authToken = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setRealm(String str) {
        this.realm = str;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("SIPAuthenticationInfo(realm=", getRealm(), ", user=", getUser(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public SIPAuthenticationInfo() {
    }

    public /* synthetic */ SIPAuthenticationInfo(String str, String str2, String str3, String str4, int i) {
        this(str, str2, str3, str4);
    }
}
