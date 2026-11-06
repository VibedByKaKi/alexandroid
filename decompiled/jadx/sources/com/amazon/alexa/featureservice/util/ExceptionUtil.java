package com.amazon.alexa.featureservice.util;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ExceptionUtil {
    private ExceptionUtil() {
    }

    @VisibleForTesting
    public static boolean isNonActionableHTTPError(Exception exc) {
        if (exc.getCause() != null) {
            return (exc.getCause() instanceof SocketTimeoutException) || (exc.getCause() instanceof SSLHandshakeException) || (exc.getCause() instanceof SSLException) || (exc.getCause() instanceof ConnectException) || (exc.getCause() instanceof SSLPeerUnverifiedException) || (exc.getCause() instanceof IOException) || (exc.getCause() instanceof UnknownHostException) || (exc.getCause() instanceof SSLProtocolException) || (exc.getCause() instanceof SocketException) || (exc.getCause() instanceof NoRouteToHostException) || (exc.getCause() instanceof BindException) || (exc.getCause() instanceof ProtocolException) || (exc.getCause() instanceof ConnectionShutdownException) || (exc.getCause() instanceof StreamResetException);
        }
        return false;
    }
}
