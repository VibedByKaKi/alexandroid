package com.amazon.alexa.client.alexaservice.base.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum ResponseRenderedType {
    EMPTY("Empty"),
    LOCAL_HANDLED("Local.Handled"),
    LOCAL_UNHANDLED("Local.Unhandled"),
    LOCAL_RESPONSE("Local.Response"),
    PREAMBLE("PreambleOnly"),
    ANSWER_TRUNCATED("TruncatedAnswer"),
    ANSWER_COMPLETE("CompleteAnswer");

    private final String responseRenderedType;

    ResponseRenderedType(String str) {
        this.responseRenderedType = str;
    }

    public String getValue() {
        return this.responseRenderedType;
    }
}
