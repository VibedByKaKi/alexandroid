package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RetryUtils {
    public static boolean isClockSkewError(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        String errorCode = amazonServiceException.getErrorCode();
        return "RequestTimeTooSkewed".equals(errorCode) || "RequestExpired".equals(errorCode) || "InvalidSignatureException".equals(errorCode) || "SignatureDoesNotMatch".equals(errorCode);
    }

    public static boolean isInterrupted(Throwable th) {
        if (th instanceof AbortedException) {
            return true;
        }
        if (th.getCause() == null) {
            return false;
        }
        Throwable cause = th.getCause();
        return (cause instanceof InterruptedException) || ((cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException));
    }

    public static boolean isRequestEntityTooLargeException(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        return "Request entity too large".equals(amazonServiceException.getErrorCode());
    }

    public static boolean isThrottlingException(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        String errorCode = amazonServiceException.getErrorCode();
        return "Throttling".equals(errorCode) || "ThrottlingException".equals(errorCode) || "ProvisionedThroughputExceededException".equals(errorCode);
    }
}
