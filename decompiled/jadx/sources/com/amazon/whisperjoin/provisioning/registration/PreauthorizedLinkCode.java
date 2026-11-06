package com.amazon.whisperjoin.provisioning.registration;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import com.amazon.whisperjoin.utils.InputValidator;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class PreauthorizedLinkCode implements Validatable {
    private final long expiry;
    private final String linkCode;

    public PreauthorizedLinkCode(String str, long j) {
        this.linkCode = str;
        this.expiry = j;
        validate();
    }

    public long getExpiry() {
        return this.expiry;
    }

    public String getLinkCode() {
        return this.linkCode;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("PreauthorizedLinkCode(linkCode=", this.linkCode, ", expiry=", this.expiry);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    @Override // com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
        if (InputValidator.isValidPreauthorizedLinkCode(this.linkCode)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Registration link code cannot be empty. Please use InputValidator methods to validate parameters.");
    }
}
