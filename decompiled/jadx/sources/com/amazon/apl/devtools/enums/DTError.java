package com.amazon.apl.devtools.enums;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum DTError {
    METHOD_NOT_IMPLEMENTED(1, "Method Not Implemented."),
    INVALID_SESSION_ID(2, "Invalid Session Id."),
    NO_PERFORMANCE_METRICS(3, "No Performance Metrics."),
    TARGET_ALREADY_ATTACHED(100, "Target Already Attached."),
    TARGET_NOT_ATTACHED(101, "Target Not Attached."),
    NO_SUCH_TARGET(102, "No Such Target."),
    LOG_ALREADY_ENABLED(200, "Log Already Enabled."),
    LOG_ALREADY_DISABLED(201, "Log Already Disabled."),
    INVALID_DOCUMENT(300, "Invalid Document."),
    INVALID_COMMAND(301, "Invalid Command."),
    NETWORK_ALREADY_ENABLED(400, "Network Already Enabled."),
    NETWORK_ALREADY_DISABLED(401, "Network Already Disabled."),
    PERFORMANCE_ALREADY_ENABLED(500, "Performance Already Enabled."),
    PERFORMANCE_ALREADY_DISABLED(501, "Performance Already Disabled."),
    NO_DOCUMENT_RENDERED(502, "No Document Rendered."),
    UNKNOWN_ERROR(503, "Unknown Error."),
    METHOD_FAILURE(504, "Method Execution Failed.");

    private final int mErrorCode;
    private final String mErrorMsg;

    DTError(int i, String str) {
        this.mErrorCode = i;
        this.mErrorMsg = str;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }
}
