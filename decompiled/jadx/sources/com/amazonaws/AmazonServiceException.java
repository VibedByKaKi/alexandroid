package com.amazonaws;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class AmazonServiceException extends AmazonClientException {
    private static final long serialVersionUID = 1;
    private String errorCode;
    private String errorMessage;
    private ErrorType errorType;
    private String requestId;
    private String serviceName;
    private int statusCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public AmazonServiceException(String str, Exception exc) {
        super(null, exc);
        this.errorType = ErrorType.Unknown;
        this.errorMessage = str;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ErrorType getErrorType() {
        return this.errorType;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return getErrorMessage() + " (Service: " + getServiceName() + "; Status Code: " + getStatusCode() + "; Error Code: " + getErrorCode() + "; Request ID: " + getRequestId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public AmazonServiceException(String str) {
        super(str);
        this.errorType = ErrorType.Unknown;
        this.errorMessage = str;
    }
}
