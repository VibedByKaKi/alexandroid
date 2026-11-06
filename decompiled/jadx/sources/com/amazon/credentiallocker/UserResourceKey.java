package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("UserResourceKey")
@Documentation("This structure represents a user identity and additional attributes that defines ownership\n        and scope of a resource")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class UserResourceKey {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.UserResourceKey");
    private List<ResourceScope> resourceScopes;
    private User user;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<ResourceScope> resourceScopes;
        protected User user;

        public UserResourceKey build() {
            UserResourceKey userResourceKey = new UserResourceKey();
            populate(userResourceKey);
            return userResourceKey;
        }

        public void populate(UserResourceKey userResourceKey) {
            userResourceKey.setUser(this.user);
            userResourceKey.setResourceScopes(this.resourceScopes);
        }

        public Builder withResourceScopes(List<ResourceScope> list) {
            this.resourceScopes = list;
            return this;
        }

        public Builder withUser(User user) {
            this.user = user;
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
        if (!(obj instanceof UserResourceKey)) {
            return false;
        }
        UserResourceKey userResourceKey = (UserResourceKey) obj;
        return Objects.equals(getUser(), userResourceKey.getUser()) && Objects.equals(getResourceScopes(), userResourceKey.getResourceScopes());
    }

    @Required
    public List<ResourceScope> getResourceScopes() {
        return this.resourceScopes;
    }

    @Required
    @Documentation("This structure represents a user identity for a specific identify provider")
    public User getUser() {
        return this.user;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getUser(), getResourceScopes());
    }

    public void setResourceScopes(List<ResourceScope> list) {
        this.resourceScopes = list;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withUser(getUser());
        builder.withResourceScopes(getResourceScopes());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserResourceKey(user=");
        sb.append(String.valueOf(this.user));
        sb.append(", resourceScopes=");
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.resourceScopes, sb);
    }
}
