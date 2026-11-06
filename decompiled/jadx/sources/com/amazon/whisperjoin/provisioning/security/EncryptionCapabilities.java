package com.amazon.whisperjoin.provisioning.security;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class EncryptionCapabilities implements Validatable {
    private int[] schemes;

    public boolean canEqual(Object obj) {
        return obj instanceof EncryptionCapabilities;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncryptionCapabilities)) {
            return false;
        }
        EncryptionCapabilities encryptionCapabilities = (EncryptionCapabilities) obj;
        return encryptionCapabilities.canEqual(this) && Arrays.equals(getSchemes(), encryptionCapabilities.getSchemes());
    }

    public int[] getSchemes() {
        return this.schemes;
    }

    public int hashCode() {
        return Arrays.hashCode(getSchemes()) + 59;
    }

    public void setSchemes(int[] iArr) {
        this.schemes = iArr;
    }

    public String toString() {
        return "EncryptionCapabilities(schemes=" + Arrays.toString(getSchemes()) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
    }
}
