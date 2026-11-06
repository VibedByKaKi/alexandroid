package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.registration;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CBLRegistrationRequest {
    private final long mExpiration;
    private final String mLinkCode;

    public CBLRegistrationRequest(String str, long j) {
        this.mLinkCode = str;
        this.mExpiration = j;
        validate();
    }

    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    public long getExpiration() {
        return this.mExpiration;
    }

    public String getLinkCode() {
        return this.mLinkCode;
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CBLRegistrationRequest [code=");
        sb.append(this.mLinkCode);
        sb.append(", expiration=");
        return a$$ExternalSyntheticOutline0.m(this.mExpiration, MarkdownConstants.RIGHT_BRACKET, sb);
    }

    public void validate() {
        String str = this.mLinkCode;
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
