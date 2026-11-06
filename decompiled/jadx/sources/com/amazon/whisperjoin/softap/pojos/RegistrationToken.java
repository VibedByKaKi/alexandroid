package com.amazon.whisperjoin.softap.pojos;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class RegistrationToken {

    @SerializedName("token")
    private String token;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RegistrationTokenBuilder {
        private String token;

        public RegistrationToken build() {
            return new RegistrationToken(this.token);
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m(new StringBuilder("RegistrationToken.RegistrationTokenBuilder(token="), this.token, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public RegistrationTokenBuilder token(String str) {
            this.token = str;
            return this;
        }
    }

    public RegistrationToken(String str) {
        this.token = str;
    }

    public static RegistrationTokenBuilder builder() {
        return new RegistrationTokenBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RegistrationToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegistrationToken)) {
            return false;
        }
        RegistrationToken registrationToken = (RegistrationToken) obj;
        if (!registrationToken.canEqual(this)) {
            return false;
        }
        String token = getToken();
        String token2 = registrationToken.getToken();
        return token != null ? token.equals(token2) : token2 == null;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        String token = getToken();
        return 59 + (token == null ? 43 : token.hashCode());
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "RegistrationToken(token=" + getToken() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
