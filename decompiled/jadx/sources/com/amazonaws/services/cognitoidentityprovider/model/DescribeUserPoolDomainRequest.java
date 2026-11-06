package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeUserPoolDomainRequest extends AmazonWebServiceRequest implements Serializable {
    private String domain;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeUserPoolDomainRequest)) {
            return false;
        }
        DescribeUserPoolDomainRequest describeUserPoolDomainRequest = (DescribeUserPoolDomainRequest) obj;
        if ((describeUserPoolDomainRequest.getDomain() == null) ^ (getDomain() == null)) {
            return false;
        }
        return describeUserPoolDomainRequest.getDomain() == null || describeUserPoolDomainRequest.getDomain().equals(getDomain());
    }

    public String getDomain() {
        return this.domain;
    }

    public int hashCode() {
        return 31 + (getDomain() == null ? 0 : getDomain().hashCode());
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDomain() != null) {
            sb.append("Domain: " + getDomain());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeUserPoolDomainRequest withDomain(String str) {
        this.domain = str;
        return this;
    }
}
