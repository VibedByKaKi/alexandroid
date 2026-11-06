package com.facebook.react.modules.camera;

import android.net.Uri;
import android.util.Base64OutputStream;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ImageStoreManager")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/modules/camera/ImageStoreManager;", "Lcom/facebook/fbreact/specs/NativeImageStoreAndroidSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getBase64ForTag", "", "uri", "", "success", "Lcom/facebook/react/bridge/Callback;", "error", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "ImageStoreManager";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getBase64ForTag$lambda$0(ImageStoreManager imageStoreManager, String str, Callback callback, Callback callback2) {
        try {
            InputStream openInputStream = imageStoreManager.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
            openInputStream.getClass();
            try {
                try {
                    Companion companion = INSTANCE;
                    callback.invoke(companion.convertInputStreamToBase64OutputStream$ReactAndroid_release(openInputStream));
                    companion.closeQuietly(openInputStream);
                } catch (IOException e) {
                    callback2.invoke(e.getMessage());
                    INSTANCE.closeQuietly(openInputStream);
                }
            } catch (Throwable th) {
                INSTANCE.closeQuietly(openInputStream);
                throw th;
            }
        } catch (FileNotFoundException e2) {
            callback2.invoke(e2.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(@NotNull String uri, @NotNull Callback success, @NotNull Callback error) {
        uri.getClass();
        success.getClass();
        error.getClass();
        Executors.newSingleThreadExecutor().execute(new Schedulers$$ExternalSyntheticLambda1(28, this, uri, success, error));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/camera/ImageStoreManager$Companion;", "", "<init>", "()V", "NAME", "", "BUFFER_SIZE", "", "closeQuietly", "", "closeable", "Ljava/io/Closeable;", "convertInputStreamToBase64OutputStream", "inputStream", "Ljava/io/InputStream;", "convertInputStreamToBase64OutputStream$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nImageStoreManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageStoreManager.kt\ncom/facebook/react/modules/camera/ImageStoreManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void closeQuietly(Closeable closeable) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }

        @NotNull
        public final String convertInputStreamToBase64OutputStream$ReactAndroid_release(@NotNull InputStream inputStream) throws IOException {
            inputStream.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
            byte[] bArr = new byte[8192];
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= -1) {
                        closeQuietly(base64OutputStream);
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        byteArrayOutputStream2.getClass();
                        return byteArrayOutputStream2;
                    }
                    base64OutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    closeQuietly(base64OutputStream);
                    throw th;
                }
            }
        }

        private Companion() {
        }
    }
}
