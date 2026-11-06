package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
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
@XmlName("ResourceScope")
@Documentation("Optional generic scope assigned to a resource.\n        Samples: User's location, resource [sub-]stage or region, etc.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class ResourceScope {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.ResourceScope");
    private String type;
    private String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String type;
        protected String value;

        public ResourceScope build() {
            ResourceScope resourceScope = new ResourceScope();
            populate(resourceScope);
            return resourceScope;
        }

        public void populate(ResourceScope resourceScope) {
            resourceScope.setType(this.type);
            resourceScope.setValue(this.value);
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withValue(String str) {
            this.value = str;
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
        if (!(obj instanceof ResourceScope)) {
            return false;
        }
        ResourceScope resourceScope = (ResourceScope) obj;
        return Objects.equals(getType(), resourceScope.getType()) && Objects.equals(getValue(), resourceScope.getValue());
    }

    @EnumValues({"Location", ResourceScopeType.STAGE})
    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getType(), getValue());
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withType(getType());
        builder.withValue(getValue());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResourceScope(type=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.type, ", value=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.value, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
