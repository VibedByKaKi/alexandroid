package com.amazon.alexa.auth;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AccessToken {
    private final String token;

    private AccessToken(String str) {
        this.token = str;
    }

    public static AccessToken create(String str) {
        return new AccessToken(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.token, ((AccessToken) obj).token);
    }

    public String getValue() {
        return this.token;
    }

    public int hashCode() {
        return Objects.hash(this.token);
    }
}
