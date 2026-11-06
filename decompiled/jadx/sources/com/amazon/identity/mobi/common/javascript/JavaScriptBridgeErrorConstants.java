package com.amazon.identity.mobi.common.javascript;

import com.amazon.identity.mobi.common.javascript.type.JavaScriptBridgeError;
import com.amazon.identity.mobi.common.javascript.type.JavaScriptBridgeErrorDetails;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class JavaScriptBridgeErrorConstants {
    public static final JavaScriptBridgeError GENERAL_ERROR;
    public static final JavaScriptBridgeErrorDetails GENERAL_ERROR_DETAILS;
    public static final JavaScriptBridgeError INPUT_ERROR;
    public static final JavaScriptBridgeErrorDetails INPUT_ERROR_DETAILS;
    public static final JavaScriptBridgeError NOT_SUPPORTED_ERROR;
    public static final JavaScriptBridgeErrorDetails NOT_SUPPORTED_ERROR_DETAILS;
    public static final JavaScriptBridgeError SERVICE_ERROR;
    public static final JavaScriptBridgeErrorDetails SERVICE_ERROR_DETAILS;

    static {
        JavaScriptBridgeErrorDetails build = JavaScriptBridgeErrorDetails.builder().mapErrorMessage("The API input is invalid JSON").build();
        INPUT_ERROR_DETAILS = build;
        JavaScriptBridgeErrorDetails build2 = JavaScriptBridgeErrorDetails.builder().mapErrorMessage("An internal MAP error exception occurred").build();
        GENERAL_ERROR_DETAILS = build2;
        JavaScriptBridgeErrorDetails build3 = JavaScriptBridgeErrorDetails.builder().mapErrorMessage("This call is unsupported in MAP").build();
        NOT_SUPPORTED_ERROR_DETAILS = build3;
        JavaScriptBridgeErrorDetails build4 = JavaScriptBridgeErrorDetails.builder().mapErrorMessage("A backend service error occurred").build();
        SERVICE_ERROR_DETAILS = build4;
        INPUT_ERROR = JavaScriptBridgeError.builder().errorCode("Input_Error").errorDetails(build).build();
        GENERAL_ERROR = JavaScriptBridgeError.builder().errorCode("General_Error").errorDetails(build2).build();
        NOT_SUPPORTED_ERROR = JavaScriptBridgeError.builder().errorCode("Not_Supported").errorDetails(build3).build();
        SERVICE_ERROR = JavaScriptBridgeError.builder().errorCode("Service_Error").errorDetails(build4).build();
    }
}
