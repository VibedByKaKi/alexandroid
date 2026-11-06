package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("CorrelationToken")
@Documentation("A structure containing information about if the Event was triggered\n        by some event in cloud. e.g. DSES service asking provisioner\n        to start scanning. In that case, this field will contain\n        info about the token it received from cloud which can then\n        be used to link the events together.\n        Example value:")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class CorrelationToken {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.CorrelationToken");
    private String id;
    private String source;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String id;
        protected String source;

        public CorrelationToken build() {
            CorrelationToken correlationToken = new CorrelationToken();
            populate(correlationToken);
            return correlationToken;
        }

        public void populate(CorrelationToken correlationToken) {
            correlationToken.setId(this.id);
            correlationToken.setSource(this.source);
        }

        public Builder withId(String str) {
            this.id = str;
            return this;
        }

        public Builder withSource(String str) {
            this.source = str;
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
        if (!(obj instanceof CorrelationToken)) {
            return false;
        }
        CorrelationToken correlationToken = (CorrelationToken) obj;
        return Objects.equals(getId(), correlationToken.getId()) && Objects.equals(getSource(), correlationToken.getSource());
    }

    public String getId() {
        return this.id;
    }

    public String getSource() {
        return this.source;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getId(), getSource());
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withId(getId());
        builder.withSource(getSource());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CorrelationToken(id=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.id, ", source=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.source, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
