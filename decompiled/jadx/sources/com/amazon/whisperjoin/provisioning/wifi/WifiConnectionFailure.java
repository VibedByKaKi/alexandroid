package com.amazon.whisperjoin.provisioning.wifi;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class WifiConnectionFailure {
    public final String failureMessage;
    public final Reason reason;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Reason {
        AUTHENTICATION_FAILURE,
        UNKNOWN_FAILURE
    }

    public WifiConnectionFailure(Reason reason, String str) {
        this.reason = reason;
        this.failureMessage = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WifiConnectionFailure;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiConnectionFailure)) {
            return false;
        }
        WifiConnectionFailure wifiConnectionFailure = (WifiConnectionFailure) obj;
        if (!wifiConnectionFailure.canEqual(this)) {
            return false;
        }
        Reason reason = getReason();
        Reason reason2 = wifiConnectionFailure.getReason();
        if (reason != null ? !reason.equals(reason2) : reason2 != null) {
            return false;
        }
        String failureMessage = getFailureMessage();
        String failureMessage2 = wifiConnectionFailure.getFailureMessage();
        return failureMessage != null ? failureMessage.equals(failureMessage2) : failureMessage2 == null;
    }

    public String getFailureMessage() {
        return this.failureMessage;
    }

    public Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        Reason reason = getReason();
        int hashCode = reason == null ? 43 : reason.hashCode();
        String failureMessage = getFailureMessage();
        return ((hashCode + 59) * 59) + (failureMessage != null ? failureMessage.hashCode() : 43);
    }

    public String toString() {
        return "WifiConnectionFailure(reason=" + getReason() + ", failureMessage=" + getFailureMessage() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
