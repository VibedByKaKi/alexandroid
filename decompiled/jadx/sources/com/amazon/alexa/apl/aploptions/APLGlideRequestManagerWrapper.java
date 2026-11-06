package com.amazon.alexa.apl.aploptions;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.dee.app.metrics.MetricsConstants;
import java.util.HashSet;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J2\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0007\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/apl/aploptions/APLGlideRequestManagerWrapper;", "", "mRequestManager", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", MetricsConstants.Method.CACHE_CLEAR, "", "target", "Lcom/bumptech/glide/request/target/Target;", "isPaused", "", "isUrlRequest", "path", "", "loadRequestBuilder", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "url", "headers", "", "Lcom/amazon/alexa/apl/aploptions/BitmapTarget;", "resumeRequests", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class APLGlideRequestManagerWrapper {

    @NotNull
    private static final HashSet<String> VALID_URL_SCHEMES = new HashSet<>(CollectionsKt.listOf("https"));

    @NotNull
    private final RequestManager mRequestManager;

    @Inject
    public APLGlideRequestManagerWrapper(@NotNull RequestManager requestManager) {
        requestManager.getClass();
        this.mRequestManager = requestManager;
    }

    public final void clear(@NotNull Target<?> target) {
        target.getClass();
        this.mRequestManager.clear(target);
    }

    public final boolean isPaused() {
        return this.mRequestManager.isPaused();
    }

    @VisibleForTesting
    public final boolean isUrlRequest(@NotNull String path) {
        path.getClass();
        String scheme = Uri.parse(path).getScheme();
        if (scheme == null) {
            return false;
        }
        HashSet<String> hashSet = VALID_URL_SCHEMES;
        String lowerCase = scheme.toLowerCase();
        lowerCase.getClass();
        return hashSet.contains(lowerCase);
    }

    public final void loadRequestBuilder(@NotNull RequestOptions requestOptions, @NotNull String url, @NotNull Map<String, String> headers, @NotNull BitmapTarget target) {
        RequestBuilder<Bitmap> load;
        requestOptions.getClass();
        url.getClass();
        headers.getClass();
        target.getClass();
        if (isUrlRequest(url)) {
            RequestBuilder<Bitmap> asBitmap = this.mRequestManager.setDefaultRequestOptions(requestOptions).asBitmap();
            asBitmap.getClass();
            if (headers.isEmpty()) {
                load = asBitmap.load(url);
                load.getClass();
            } else {
                load = asBitmap.load((Object) new GlideUrl(url, new APLGlideHeaders(headers)));
                load.getClass();
            }
            load.listener(target).into((RequestBuilder<Bitmap>) target);
        }
    }

    public final void resumeRequests() {
        this.mRequestManager.resumeRequests();
    }
}
