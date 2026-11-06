package com.amazon.alexa.mosaic.apl.dependencies.glide;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.dependencies.IImageLoader;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import java.io.FileNotFoundException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class GlideImageViewTarget extends SimpleTarget<Bitmap> implements RequestListener<Bitmap> {
    public static final int ERROR_CODE_UNKNOWN = -1;
    private final IImageLoader.LoadImageParams mParams;

    public GlideImageViewTarget(IImageLoader.LoadImageParams loadImageParams) {
        super(loadImageParams.needsScaling() ? loadImageParams.imageView().getLayoutParams().width : Integer.MIN_VALUE, loadImageParams.needsScaling() ? loadImageParams.imageView().getLayoutParams().height : Integer.MIN_VALUE);
        this.mParams = loadImageParams;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable GlideException glideException, Object obj, Target<Bitmap> target, boolean z) {
        this.mParams.callback().onError(glideException, parseErrorCodeFromException(glideException), this.mParams.path());
        return false;
    }

    public void onResourceReady(@Nullable Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
        this.mParams.callback().onSuccess(bitmap, this.mParams.path());
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

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(@Nullable Object obj, @Nullable Transition transition) {
        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(Bitmap bitmap, Object obj, Target<Bitmap> target, DataSource dataSource, boolean z) {
        return false;
    }
}
