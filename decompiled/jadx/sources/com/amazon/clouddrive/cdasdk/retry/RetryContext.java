package com.amazon.clouddrive.cdasdk.retry;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.IOException;
import lombok.Generated;
import okhttp3.Response;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RetryContext {

    @Nullable
    private IOException exception;
    private int numRetriesAttempted;

    @Nullable
    private Response response;

    public RetryContext(@NonNull RetryContext retryContext) {
        this.numRetriesAttempted = retryContext.numRetriesAttempted;
        this.exception = retryContext.exception;
        this.response = retryContext.response;
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof RetryContext;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetryContext)) {
            return false;
        }
        RetryContext retryContext = (RetryContext) obj;
        if (!retryContext.canEqual(this) || getNumRetriesAttempted() != retryContext.getNumRetriesAttempted()) {
            return false;
        }
        IOException exception = getException();
        IOException exception2 = retryContext.getException();
        if (exception != null ? !exception.equals(exception2) : exception2 != null) {
            return false;
        }
        Response response = getResponse();
        Response response2 = retryContext.getResponse();
        return response != null ? response.equals(response2) : response2 == null;
    }

    @Nullable
    @Generated
    public IOException getException() {
        return this.exception;
    }

    @Generated
    public int getNumRetriesAttempted() {
        return this.numRetriesAttempted;
    }

    @Nullable
    @Generated
    public Response getResponse() {
        return this.response;
    }

    @Generated
    public int hashCode() {
        int numRetriesAttempted = getNumRetriesAttempted() + 59;
        IOException exception = getException();
        int i = numRetriesAttempted * 59;
        int hashCode = exception == null ? 43 : exception.hashCode();
        Response response = getResponse();
        return ((i + hashCode) * 59) + (response != null ? response.hashCode() : 43);
    }

    @Generated
    public void setException(@Nullable IOException iOException) {
        this.exception = iOException;
    }

    @Generated
    public void setNumRetriesAttempted(int i) {
        this.numRetriesAttempted = i;
    }

    @Generated
    public void setResponse(@Nullable Response response) {
        this.response = response;
    }

    @Generated
    public String toString() {
        return "RetryContext(numRetriesAttempted=" + getNumRetriesAttempted() + ", exception=" + getException() + ", response=" + getResponse() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public RetryContext() {
    }
}
