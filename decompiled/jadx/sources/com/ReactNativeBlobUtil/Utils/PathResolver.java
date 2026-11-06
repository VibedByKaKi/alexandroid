package com.ReactNativeBlobUtil.Utils;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.ReactNativeBlobUtil.ReactNativeBlobUtilUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class PathResolver {
    private static String getContentName(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, null, null, null, null);
        query.moveToFirst();
        int columnIndex = query.getColumnIndex("_display_name");
        if (columnIndex < 0) {
            return null;
        }
        String string = query.getString(columnIndex);
        query.close();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getDataColumn(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            if (r8 == 0) goto L2b
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L28
            if (r9 == 0) goto L2b
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L28
            java.lang.String r7 = r8.getString(r9)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L28
            goto L2b
        L24:
            r0 = move-exception
            r9 = r0
            r7 = r8
            goto L40
        L28:
            r0 = move-exception
            r9 = r0
            goto L37
        L2b:
            if (r8 == 0) goto L30
            r8.close()
        L30:
            return r7
        L31:
            r0 = move-exception
            r9 = r0
            goto L40
        L34:
            r0 = move-exception
            r9 = r0
            r8 = r7
        L37:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L24
            if (r8 == 0) goto L3f
            r8.close()
        L3f:
            return r7
        L40:
            if (r7 == 0) goto L45
            r7.close()
        L45:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.Utils.PathResolver.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    @TargetApi(19)
    public static String getRealPathFromURI(Context context, Uri uri) {
        String contentName;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir == null) {
                        return "";
                    }
                    return externalFilesDir + "/" + split[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    try {
                        String documentId = DocumentsContract.getDocumentId(uri);
                        if (documentId == null || !documentId.startsWith("raw:/")) {
                            return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), ((documentId == null || !documentId.startsWith("msf:")) ? Long.valueOf(documentId) : Long.valueOf(documentId.split(":")[1])).longValue()), null, null);
                        }
                        return Uri.parse(documentId).getPath();
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (isMediaDocument(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
                }
                if ("content".equalsIgnoreCase(uri.getScheme())) {
                    return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null);
                }
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if (openInputStream != null && (contentName = getContentName(context.getContentResolver(), uri)) != null) {
                        File file = new File(context.getCacheDir(), contentName);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (openInputStream.read(bArr) > 0) {
                            fileOutputStream.write(bArr);
                        }
                        fileOutputStream.close();
                        openInputStream.close();
                        return file.getAbsolutePath();
                    }
                } catch (Exception e) {
                    ReactNativeBlobUtilUtils.emitWarningEvent(e.toString());
                    return null;
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
