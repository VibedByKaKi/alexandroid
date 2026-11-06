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
@XmlName("DeleteWifiNetworksInput")
@Documentation("Input for DeleteWifiNetworks operation\n        The scope filters are optional and applied individually.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class DeleteWifiNetworksInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.DeleteWifiNetworksInput");
    private List<ResourceScope> resourceScopeFilters;
    private User user;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<ResourceScope> resourceScopeFilters;
        protected User user;

        public DeleteWifiNetworksInput build() {
            DeleteWifiNetworksInput deleteWifiNetworksInput = new DeleteWifiNetworksInput();
            populate(deleteWifiNetworksInput);
            return deleteWifiNetworksInput;
        }

        public void populate(DeleteWifiNetworksInput deleteWifiNetworksInput) {
            deleteWifiNetworksInput.setUser(this.user);
            deleteWifiNetworksInput.setResourceScopeFilters(this.resourceScopeFilters);
        }

        public Builder withResourceScopeFilters(List<ResourceScope> list) {
            this.resourceScopeFilters = list;
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
        if (!(obj instanceof DeleteWifiNetworksInput)) {
            return false;
        }
        DeleteWifiNetworksInput deleteWifiNetworksInput = (DeleteWifiNetworksInput) obj;
        return Objects.equals(getUser(), deleteWifiNetworksInput.getUser()) && Objects.equals(getResourceScopeFilters(), deleteWifiNetworksInput.getResourceScopeFilters());
    }

    public List<ResourceScope> getResourceScopeFilters() {
        return this.resourceScopeFilters;
    }

    @Required
    @Documentation("This structure represents a user identity for a specific identify provider")
    public User getUser() {
        return this.user;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getUser(), getResourceScopeFilters());
    }

    public void setResourceScopeFilters(List<ResourceScope> list) {
        this.resourceScopeFilters = list;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withUser(getUser());
        builder.withResourceScopeFilters(getResourceScopeFilters());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteWifiNetworksInput(user=");
        sb.append(String.valueOf(this.user));
        sb.append(", resourceScopeFilters=");
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.resourceScopeFilters, sb);
    }
}
