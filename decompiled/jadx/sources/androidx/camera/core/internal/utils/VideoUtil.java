package androidx.camera.core.internal.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class VideoUtil {
    private static final String TAG = "VideoUtil";

    private VideoUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getAbsolutePathFromUri(@androidx.annotation.NonNull android.content.ContentResolver r9, @androidx.annotation.NonNull android.net.Uri r10) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String r1 = "Failed in getting absolute path for Uri "
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L30 java.lang.RuntimeException -> L36
            r7 = 0
            r8 = 0
            r6 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L30 java.lang.RuntimeException -> L33
            java.lang.Object r9 = androidx.core.util.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L30 java.lang.RuntimeException -> L33
            android.database.Cursor r9 = (android.database.Cursor) r9     // Catch: java.lang.Throwable -> L30 java.lang.RuntimeException -> L33
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            r9.moveToFirst()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            r9.close()
            return r10
        L28:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L68
        L2c:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L39
        L30:
            r0 = move-exception
            r10 = r0
            goto L68
        L33:
            r0 = move-exception
        L34:
            r10 = r0
            goto L39
        L36:
            r0 = move-exception
            r4 = r10
            goto L34
        L39:
            java.lang.String r9 = "VideoUtil"
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L30
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L65
            r3.append(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = " with Exception "
            r3.append(r0)     // Catch: java.lang.Throwable -> L65
            r3.append(r10)     // Catch: java.lang.Throwable -> L65
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L65
            androidx.camera.core.Logger.e(r9, r10)     // Catch: java.lang.Throwable -> L30
            java.lang.String r9 = ""
            if (r2 == 0) goto L62
            r2.close()
        L62:
            return r9
        L63:
            r10 = r9
            goto L68
        L65:
            r0 = move-exception
            r9 = r0
            goto L63
        L68:
            if (r2 == 0) goto L6d
            r2.close()
        L6d:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.utils.VideoUtil.getAbsolutePathFromUri(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
