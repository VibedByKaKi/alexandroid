package com.amazon.alexa.hho.stickynotes;

import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Log;
import com.amazon.alexa.ra.core.data.model.TextFieldUploadManager;
import com.dee.app.http.CoralServiceException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
class ErrorMapper {
    private static final String TAG = "ErrorMapper";

    public String map(Throwable th) {
        if (th instanceof CompositeException) {
            CompositeException compositeException = (CompositeException) th;
            return compositeException.getExceptions().size() == 0 ? "UNKNOWN" : map(compositeException.getExceptions().get(0));
        }
        if (th instanceof CoralServiceException) {
            return "HTTP_ERROR:" + ((CoralServiceException) th).getStatusCode();
        }
        if (th instanceof DownloadCanceledException) {
            return "CANCELED";
        }
        if ((th instanceof SecurityException) || (th instanceof StorageException) || (th instanceof IOException)) {
            if ((th instanceof StorageException) && th.getCause() != null) {
                th = th.getCause();
            }
            return (th.getCause() != null && (th.getCause() instanceof ErrnoException) && ((ErrnoException) th.getCause()).errno == OsConstants.ENOSPC) ? "CACHE_ERROR:DISK_FULL" : "CACHE_ERROR";
        }
        if (!(th instanceof NetworkException)) {
            Log.e(TAG, "Unable to map error: ", th);
            return "UNKNOWN";
        }
        if (th.getCause() == null) {
            return TextFieldUploadManager.ERROR_CODE_NETWORK_ERROR;
        }
        Throwable cause = th.getCause();
        return cause instanceof UnknownHostException ? "NETWORK_ERROR:NO_CONNECTION" : ((cause instanceof SSLException) || (cause instanceof ProtocolException)) ? "NETWORK_ERROR:CONNECTION_LOST" : cause instanceof SocketTimeoutException ? "NETWORK_ERROR:TIMEOUT" : TextFieldUploadManager.ERROR_CODE_NETWORK_ERROR;
    }
}
