package com.amazon.alexa.mosaic.apl.dependencies.glide;

import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.dependencies.IImageLoader;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class GlideRequestListener implements RequestListener<File> {
    private static final int ERROR_CODE_UNKNOWN = -1;
    private final IImageLoader.DownloadImageParams mParams;

    public GlideRequestListener(IImageLoader.DownloadImageParams downloadImageParams) {
        this.mParams = downloadImageParams;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(GlideException glideException, Object obj, Target<File> target, boolean z) {
        this.mParams.callback().onError(glideException, parseErrorCodeFromException(glideException), this.mParams.path());
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(File file, Object obj, Target<File> target, DataSource dataSource, boolean z) {
        this.mParams.callback().onSuccess(file, this.mParams.path());
        return false;
    }

    @VisibleForTesting
    public int parseErrorCodeFromException(GlideException glideException) {
        if (glideException == null) {
            return -1;
        }
        for (Throwable th : glideException.getRootCauses()) {
            if (th instanceof HttpException) {
                return ((HttpException) th).getStatusCode();
            }
            if (th instanceof FileNotFoundException) {
                return 404;
            }
            if (th instanceof SocketTimeoutException) {
                return 408;
            }
        }
        return -1;
    }
}
