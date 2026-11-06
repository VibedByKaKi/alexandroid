package com.amazon.identity.mobi.common.javascript.type;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.identity.mobi.common.utils.json.JSONUtils;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class JavaScriptBridgeErrorDetails {
    private String mMapErrorMessage;
    private String mPlatformExceptionMessage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class JavaScriptBridgeErrorDetailsBuilder {
        private String mapErrorMessage;
        private String platformExceptionMessage;

        public JavaScriptBridgeErrorDetails build() {
            return new JavaScriptBridgeErrorDetails(this.platformExceptionMessage, this.mapErrorMessage);
        }

        public JavaScriptBridgeErrorDetailsBuilder mapErrorMessage(String str) {
            this.mapErrorMessage = str;
            return this;
        }

        public JavaScriptBridgeErrorDetailsBuilder platformExceptionMessage(String str) {
            this.platformExceptionMessage = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("JavaScriptBridgeErrorDetails.JavaScriptBridgeErrorDetailsBuilder(platformExceptionMessage=");
            sb.append(this.platformExceptionMessage);
            sb.append(", mapErrorMessage=");
            return a$$ExternalSyntheticOutline0.m(sb, this.mapErrorMessage, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public JavaScriptBridgeErrorDetails(String str, String str2) {
        this.mPlatformExceptionMessage = str;
        this.mMapErrorMessage = str2;
    }

    public static JavaScriptBridgeErrorDetailsBuilder builder() {
        return new JavaScriptBridgeErrorDetailsBuilder();
    }

    public String getMapErrorMessage() {
        return this.mMapErrorMessage;
    }

    public String getPlatformExceptionMessage() {
        return this.mPlatformExceptionMessage;
    }

    public String toString() {
        return JSONUtils.serializeObjectToJson(this);
    }
}
