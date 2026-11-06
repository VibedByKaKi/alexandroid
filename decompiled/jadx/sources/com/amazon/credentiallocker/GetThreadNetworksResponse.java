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
@XmlName("GetThreadNetworksResponse")
@Documentation("Structure for GetThreadNetworksResponse")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetThreadNetworksResponse {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetThreadNetworksResponse");
    private String nextToken;
    private List<ThreadNetwork> threadNetworks;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String nextToken;
        protected List<ThreadNetwork> threadNetworks;

        public GetThreadNetworksResponse build() {
            GetThreadNetworksResponse getThreadNetworksResponse = new GetThreadNetworksResponse();
            populate(getThreadNetworksResponse);
            return getThreadNetworksResponse;
        }

        public void populate(GetThreadNetworksResponse getThreadNetworksResponse) {
            getThreadNetworksResponse.setThreadNetworks(this.threadNetworks);
            getThreadNetworksResponse.setNextToken(this.nextToken);
        }

        public Builder withNextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public Builder withThreadNetworks(List<ThreadNetwork> list) {
            this.threadNetworks = list;
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
        if (!(obj instanceof GetThreadNetworksResponse)) {
            return false;
        }
        GetThreadNetworksResponse getThreadNetworksResponse = (GetThreadNetworksResponse) obj;
        return Objects.equals(getThreadNetworks(), getThreadNetworksResponse.getThreadNetworks()) && Objects.equals(getNextToken(), getThreadNetworksResponse.getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    @Required
    public List<ThreadNetwork> getThreadNetworks() {
        return this.threadNetworks;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getThreadNetworks(), getNextToken());
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setThreadNetworks(List<ThreadNetwork> list) {
        this.threadNetworks = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withThreadNetworks(getThreadNetworks());
        builder.withNextToken(getNextToken());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetThreadNetworksResponse(threadNetworks=");
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", nextToken=", (List) this.threadNetworks, sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.nextToken, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
