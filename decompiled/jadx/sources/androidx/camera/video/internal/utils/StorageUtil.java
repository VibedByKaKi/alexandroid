package androidx.camera.video.internal.utils;

import android.os.StatFs;
import com.dee.app.contacts.common.constants.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/camera/video/internal/utils/StorageUtil;", "", "()V", Constants.LOG_TAG, "", "formatSize", "bytes", "", "getAvailableBytes", "file", "Ljava/io/File;", "path", "getAvailableBytesForMediaStoreUri", "uri", "Landroid/net/Uri;", "isStorageFullException", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "camera-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStorageUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageUtil.kt\nandroidx/camera/video/internal/utils/StorageUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
/* loaded from: classes.dex */
public final class StorageUtil {

    @NotNull
    public static final StorageUtil INSTANCE = new StorageUtil();

    @NotNull
    private static final String TAG = "StorageUtil";

    private StorageUtil() {
    }

    @JvmStatic
    @NotNull
    public static final String formatSize(long bytes) {
        if (bytes < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Bytes cannot be negative");
            return null;
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = bytes;
        int i = 0;
        double d2 = d;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            return decimalFormat.format(d2) + ' ' + strArr[i];
        }
        StringBuilder sb = new StringBuilder();
        while (-1 < i) {
            double pow = Math.pow(1024.0d, i);
            double floor = Math.floor(d / pow);
            if (floor > 0.0d) {
                sb.append(decimalFormat.format(floor));
                sb.append(" ");
                sb.append(strArr[i]);
                sb.append(" ");
                d -= floor * pow;
            }
            i--;
        }
        return StringsKt.trim(sb).toString();
    }

    @JvmStatic
    public static final long getAvailableBytes(@NotNull File file) {
        file.getClass();
        String path = file.getPath();
        path.getClass();
        return getAvailableBytes(path);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r0.equals(com.amazon.alexa.voice.utils.RouteHelper.ROUTE_ORIGIN_EXTERNAL) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r3 = android.os.Environment.getExternalStorageDirectory();
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return getAvailableBytes(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r0.equals("external_primary") != false) goto L23;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long getAvailableBytesForMediaStoreUri(@org.jetbrains.annotations.NotNull android.net.Uri r3) {
        /*
            r3.getClass()
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L80
            java.util.List r0 = r3.getPathSegments()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L66
            int r1 = r0.hashCode()
            r2 = -1921573490(0xffffffff8d771d8e, float:-7.6148327E-31)
            if (r1 == r2) goto L51
            r2 = -1820761141(0xffffffff937963cb, float:-3.147742E-27)
            if (r1 == r2) goto L47
            r2 = 570410685(0x21ffc6bd, float:1.7332078E-18)
            if (r1 == r2) goto L31
            goto L66
        L31:
            java.lang.String r1 = "internal"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L66
        L3b:
            java.io.File r3 = android.os.Environment.getDataDirectory()
            r3.getClass()
            long r0 = getAvailableBytes(r3)
            return r0
        L47:
            java.lang.String r1 = "external"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            goto L66
        L51:
            java.lang.String r1 = "external_primary"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L66
        L5a:
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            r3.getClass()
            long r0 = getAvailableBytes(r3)
            return r0
        L66:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown MediaStore URI: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "StorageUtil"
            androidx.camera.core.Logger.w(r0, r3)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L80:
            java.lang.String r0 = "Not a content uri: "
            java.lang.String r3 = androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0.m(r3, r0)
            io.ktor.util.PathKt$$ExternalSyntheticBUOutline0.m(r3)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.utils.StorageUtil.getAvailableBytesForMediaStoreUri(android.net.Uri):long");
    }

    @JvmStatic
    public static final boolean isStorageFullException(@NotNull Exception e) {
        String message;
        boolean contains$default;
        e.getClass();
        if (!(e instanceof FileNotFoundException) || (message = e.getMessage()) == null) {
            return false;
        }
        contains$default = StringsKt__StringsKt.contains$default(message, "No space left on device", false, 2, (Object) null);
        return contains$default;
    }

    @JvmStatic
    public static final long getAvailableBytes(@NotNull String path) {
        path.getClass();
        return new StatFs(path).getAvailableBytes();
    }
}
