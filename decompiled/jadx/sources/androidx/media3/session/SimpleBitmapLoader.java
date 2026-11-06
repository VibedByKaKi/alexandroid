package androidx.media3.session;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.io.ByteStreams;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
@Deprecated
/* loaded from: classes14.dex */
public final class SimpleBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    private static final Supplier<ListeningExecutorService> DEFAULT_EXECUTOR_SERVICE = Suppliers.memoize(new SimpleBitmapLoader$$ExternalSyntheticLambda2());
    private static final String FILE_URI_EXCEPTION_MESSAGE = "Could not read image from file";
    private final ListeningExecutorService executorService;

    public SimpleBitmapLoader() {
        this((ExecutorService) Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap decode(byte[] bArr) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Assertions.checkArgument(decodeByteArray != null, "Could not decode image data");
        return decodeByteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListeningExecutorService lambda$static$0() {
        return MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap load(Uri uri) throws IOException {
        if ("file".equals(uri.getScheme())) {
            String path = uri.getPath();
            if (path == null) {
                Single$$ExternalSyntheticBUOutline0.m$3(FILE_URI_EXCEPTION_MESSAGE);
                return null;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(path);
            if (decodeFile != null) {
                return decodeFile;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(FILE_URI_EXCEPTION_MESSAGE);
            return null;
        }
        URLConnection openConnection = new URL(uri.toString()).openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            MediaSessionStub$$ExternalSyntheticLambda5.m(uri.getScheme(), "Unsupported scheme: ");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(responseCode, "Invalid response status code: "));
            return null;
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            Bitmap decode = decode(ByteStreams.toByteArray(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            return decode;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public ListenableFuture<Bitmap> decodeBitmap(byte[] bArr) {
        return this.executorService.submit((Callable) new SimpleBitmapLoader$$ExternalSyntheticLambda1(bArr, 1));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public ListenableFuture<Bitmap> loadBitmap(Uri uri) {
        return this.executorService.submit((Callable) new SimpleBitmapLoader$$ExternalSyntheticLambda1(uri, 0));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    public SimpleBitmapLoader(ExecutorService executorService) {
        this.executorService = MoreExecutors.listeningDecorator(executorService);
    }
}
