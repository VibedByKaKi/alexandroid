package androidx.media3.session;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class CacheBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private BitmapLoadRequest lastBitmapLoadRequest;

    public CacheBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
        this.bitmapLoader = bitmapLoader;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public ListenableFuture<Bitmap> decodeBitmap(byte[] bArr) {
        BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(bArr)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        ListenableFuture<Bitmap> decodeBitmap = this.bitmapLoader.decodeBitmap(bArr);
        this.lastBitmapLoadRequest = new BitmapLoadRequest(bArr, decodeBitmap);
        return decodeBitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public ListenableFuture<Bitmap> loadBitmap(Uri uri) {
        BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(uri)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        ListenableFuture<Bitmap> loadBitmap = this.bitmapLoader.loadBitmap(uri);
        this.lastBitmapLoadRequest = new BitmapLoadRequest(uri, loadBitmap);
        return loadBitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return this.bitmapLoader.supportsMimeType(str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BitmapLoadRequest {

        @Nullable
        private final byte[] data;

        @Nullable
        private final ListenableFuture<Bitmap> future;

        @Nullable
        private final Uri uri;

        public BitmapLoadRequest(byte[] bArr, ListenableFuture<Bitmap> listenableFuture) {
            this.data = bArr;
            this.uri = null;
            this.future = listenableFuture;
        }

        public ListenableFuture<Bitmap> getFuture() {
            return (ListenableFuture) Assertions.checkStateNotNull(this.future);
        }

        public boolean matches(@Nullable byte[] bArr) {
            byte[] bArr2 = this.data;
            return bArr2 != null && Arrays.equals(bArr2, bArr);
        }

        public BitmapLoadRequest(Uri uri, ListenableFuture<Bitmap> listenableFuture) {
            this.data = null;
            this.uri = uri;
            this.future = listenableFuture;
        }

        public boolean matches(@Nullable Uri uri) {
            Uri uri2 = this.uri;
            return uri2 != null && uri2.equals(uri);
        }
    }
}
