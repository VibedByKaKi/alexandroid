package androidx.javascriptengine.common;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.media3.ui.PlayerView$$ExternalSyntheticLambda1;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class Utils {
    private static final String TAG = "JavaScriptEngineUtils";

    private Utils() {
        throw new AssertionError();
    }

    public static void checkAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor, boolean z) {
        if (assetFileDescriptor.getStartOffset() < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("AssetFileDescriptor offset should be >= 0");
            return;
        }
        if (assetFileDescriptor.getLength() != -1 && assetFileDescriptor.getLength() < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("AssetFileDescriptor should have valid length");
            return;
        }
        if (assetFileDescriptor.getDeclaredLength() != -1 && assetFileDescriptor.getDeclaredLength() < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("AssetFileDescriptor should have valid declared length");
            return;
        }
        if (assetFileDescriptor.getLength() == -1 && assetFileDescriptor.getStartOffset() != 0) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("AssetFileDescriptor offset should be 0 for unknown length");
        } else {
            if (z || assetFileDescriptor.getLength() != -1) {
                return;
            }
            Buffer$$ExternalSyntheticBUOutline0.m$1("AssetFileDescriptor should have known length");
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static RuntimeException exceptionToRuntimeException(Exception exc) {
        return exc instanceof RuntimeException ? (RuntimeException) exc : new RuntimeException(exc);
    }

    public static int getLastUTF8StartingByteIndex(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (!isUTF8ContinuationByte(bArr[length])) {
                return length;
            }
        }
        return -1;
    }

    public static boolean isUTF8ContinuationByte(byte b) {
        return (b & (-64)) == -128;
    }

    public static int readNBytes(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static byte[] readToBytes(AssetFileDescriptor assetFileDescriptor, int i, boolean z) throws IOException, LengthLimitExceededException {
        try {
            checkAssetFileDescriptor(assetFileDescriptor, false);
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor.getLength() <= i) {
                i = length;
            } else if (!z) {
                throw new LengthLimitExceededException("AssetFileDescriptor.getLength() should be <= " + i);
            }
            byte[] bArr = new byte[i];
            ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptor.getParcelFileDescriptor();
            try {
                if (readNBytes(new FileInputStream(parcelFileDescriptor.getFileDescriptor()), bArr, 0, i) == i) {
                    parcelFileDescriptor.close();
                    assetFileDescriptor.close();
                    return bArr;
                }
                throw new IOException("Couldn't read " + i + " bytes from the AssetFileDescriptor");
            } finally {
            }
        } catch (Throwable th) {
            assetFileDescriptor.close();
            throw th;
        }
    }

    public static String readToString(AssetFileDescriptor assetFileDescriptor, int i, boolean z) throws IOException, LengthLimitExceededException {
        byte[] readToBytes = readToBytes(assetFileDescriptor, i, z);
        int length = readToBytes.length;
        if (z) {
            length = getLastUTF8StartingByteIndex(readToBytes);
        }
        return new String(readToBytes, 0, length, StandardCharsets.UTF_8);
    }

    public static void writeByteArrayToStream(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            outputStream.flush();
        } catch (IOException e) {
            Log.e(TAG, "Writing to outputStream failed", e);
        } finally {
            closeQuietly(outputStream);
        }
    }

    public static AssetFileDescriptor writeBytesIntoPipeAsync(byte[] bArr, ExecutorService executorService) throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
        try {
            executorService.execute(new PlayerView$$ExternalSyntheticLambda1(bArr, autoCloseOutputStream, 13));
            return new AssetFileDescriptor(parcelFileDescriptor, 0L, bArr.length);
        } catch (RejectedExecutionException e) {
            closeQuietly(autoCloseOutputStream);
            throw e;
        }
    }
}
