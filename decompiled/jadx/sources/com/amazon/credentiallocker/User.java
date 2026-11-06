package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("User")
@Documentation("This structure represents a user identity for a specific identify provider")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class User {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.User");
    private String identityProvider;
    private String userId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String identityProvider;
        protected String userId;

        public User build() {
            User user = new User();
            populate(user);
            return user;
        }

        public void populate(User user) {
            user.setUserId(this.userId);
            user.setIdentityProvider(this.identityProvider);
        }

        public Builder withIdentityProvider(String str) {
            this.identityProvider = str;
            return this;
        }

        public Builder withUserId(String str) {
            this.userId = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return Objects.equals(getUserId(), user.getUserId()) && Objects.equals(getIdentityProvider(), user.getIdentityProvider());
    }

    @EnumValues({"Amazon", IdentityProvider.RING})
    @Required
    public String getIdentityProvider() {
        return this.identityProvider;
    }

    @Required
    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getUserId(), getIdentityProvider());
    }

    public void setIdentityProvider(String str) {
        this.identityProvider = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withUserId(getUserId());
        builder.withIdentityProvider(getIdentityProvider());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("User(userId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.userId, ", identityProvider=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.identityProvider, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
