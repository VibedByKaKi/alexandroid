package com.amazon.devicesetup.provisioning.data.registration;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CBLRegistrationRequest {
    private final long expiration;
    private final String linkCode;

    public CBLRegistrationRequest(String str, long j) {
        this.linkCode = str;
        this.expiration = j;
        validate();
    }

    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    public long getExpiration() {
        return this.expiration;
    }

    public String getLinkCode() {
        return this.linkCode;
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public String toString() {
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("CBLRegistrationRequest [code=", this.linkCode, ", expiration=", this.expiration);
        m.append(MarkdownConstants.RIGHT_BRACKET);
        return m.toString();
    }

    public void validate() {
        String str = this.linkCode;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Link code cannot be null.");
        } else {
            if (str.length() != 0) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Link code cannot be empty.");
        }
    }
}
