package com.amazon.comms.calling.sipclient;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RealTimeTextMetrics {
    private String enablementState;
    private String requestState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RealTimeTextEnablementState {
        DISABLED,
        ENABLED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RealTimeTextRequestState {
        NOT_REQUESTED,
        REQUESTED
    }

    public RealTimeTextMetrics(String str, String str2) {
        this.requestState = str;
        this.enablementState = str2;
    }

    public String getEnablementState() {
        return this.enablementState;
    }

    public String getRequestState() {
        return this.requestState;
    }

    public void setEnablementState(String str) {
        this.enablementState = str;
    }

    public void setRequestState(String str) {
        this.requestState = str;
    }

    public String toString() {
        return "RealTimeTextMetrics(requestState=" + getRequestState() + ", enablementState=" + getEnablementState() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
