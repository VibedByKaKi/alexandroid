package com.amazon.identity.mobi.common.javascript.type;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.identity.mobi.common.utils.json.JSONUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class JavaScriptBridgeError {
    private String mErrorCode;
    private JavaScriptBridgeErrorDetails mErrorDetails;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class JavaScriptBridgeErrorBuilder {
        private String errorCode;
        private JavaScriptBridgeErrorDetails errorDetails;

        public JavaScriptBridgeError build() {
            return new JavaScriptBridgeError(this.errorCode, this.errorDetails);
        }

        public JavaScriptBridgeErrorBuilder errorCode(String str) {
            this.errorCode = str;
            return this;
        }

        public JavaScriptBridgeErrorBuilder errorDetails(JavaScriptBridgeErrorDetails javaScriptBridgeErrorDetails) {
            this.errorDetails = javaScriptBridgeErrorDetails;
            return this;
        }

        public String toString() {
            return "JavaScriptBridgeError.JavaScriptBridgeErrorBuilder(errorCode=" + this.errorCode + ", errorDetails=" + this.errorDetails + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public JavaScriptBridgeError(String str, JavaScriptBridgeErrorDetails javaScriptBridgeErrorDetails) {
        this.mErrorCode = str;
        this.mErrorDetails = javaScriptBridgeErrorDetails;
    }

    public static JavaScriptBridgeErrorBuilder builder() {
        return new JavaScriptBridgeErrorBuilder();
    }

    public String getErrorCode() {
        return this.mErrorCode;
    }

    public JavaScriptBridgeErrorDetails getErrorDetails() {
        return this.mErrorDetails;
    }

    public String toString() {
        return JSONUtils.serializeObjectToJson(this);
    }
}
