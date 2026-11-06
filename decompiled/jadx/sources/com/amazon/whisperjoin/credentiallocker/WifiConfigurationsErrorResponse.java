package com.amazon.whisperjoin.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class WifiConfigurationsErrorResponse {
    private String message;

    public boolean canEqual(Object obj) {
        return obj instanceof WifiConfigurationsErrorResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiConfigurationsErrorResponse)) {
            return false;
        }
        WifiConfigurationsErrorResponse wifiConfigurationsErrorResponse = (WifiConfigurationsErrorResponse) obj;
        if (!wifiConfigurationsErrorResponse.canEqual(this)) {
            return false;
        }
        String message = getMessage();
        String message2 = wifiConfigurationsErrorResponse.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String message = getMessage();
        return 59 + (message == null ? 43 : message.hashCode());
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("WifiConfigurationsErrorResponse(message="), getMessage(), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
