package com.amazon.comms.models.sip;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.application.service.common.logging.RedactInLogs;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonDeserialize(builder = ICEConfigurationBuilder.class)
@RedactInLogs
/* loaded from: classes20.dex */
public final class ICEConfiguration {
    private final String credential;
    private final String url;
    private final String username;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonPOJOBuilder(withPrefix = "")
    public static class ICEConfigurationBuilder {
        private String credential;
        private String url;
        private String username;

        public ICEConfiguration build() {
            return new ICEConfiguration(this.url, this.username, this.credential, 0);
        }

        public ICEConfigurationBuilder credential(String str) {
            this.credential = str;
            return this;
        }

        public String toString() {
            String str = this.url;
            String str2 = this.username;
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("ICEConfiguration.ICEConfigurationBuilder(url=", str, ", username=", str2, ", credential="), this.credential, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public ICEConfigurationBuilder url(String str) {
            this.url = str;
            return this;
        }

        public ICEConfigurationBuilder username(String str) {
            this.username = str;
            return this;
        }
    }

    private ICEConfiguration(String str, String str2, String str3) {
        this.url = str;
        this.username = str2;
        this.credential = str3;
    }

    public static ICEConfigurationBuilder builder() {
        return new ICEConfigurationBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ICEConfiguration)) {
            return false;
        }
        ICEConfiguration iCEConfiguration = (ICEConfiguration) obj;
        String url = getUrl();
        String url2 = iCEConfiguration.getUrl();
        if (url != null ? !url.equals(url2) : url2 != null) {
            return false;
        }
        String username = getUsername();
        String username2 = iCEConfiguration.getUsername();
        if (username != null ? !username.equals(username2) : username2 != null) {
            return false;
        }
        String credential = getCredential();
        String credential2 = iCEConfiguration.getCredential();
        return credential != null ? credential.equals(credential2) : credential2 == null;
    }

    public String getCredential() {
        return this.credential;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String url = getUrl();
        int hashCode = url == null ? 43 : url.hashCode();
        String username = getUsername();
        int i = (hashCode + 59) * 59;
        int hashCode2 = username == null ? 43 : username.hashCode();
        String credential = getCredential();
        return ((i + hashCode2) * 59) + (credential != null ? credential.hashCode() : 43);
    }

    public String toString() {
        String url = getUrl();
        String username = getUsername();
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("ICEConfiguration(url=", url, ", username=", username, ", credential="), getCredential(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ ICEConfiguration(String str, String str2, String str3, int i) {
        this(str, str2, str3);
    }
}
