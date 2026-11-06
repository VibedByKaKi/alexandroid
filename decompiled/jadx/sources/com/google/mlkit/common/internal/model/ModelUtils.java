package com.google.mlkit.common.internal.model;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zzu;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
@WorkerThread
/* loaded from: classes8.dex */
public class ModelUtils {
    private static final GmsLogger zza = new GmsLogger("ModelUtils", "");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @KeepForSdk
    public static abstract class AutoMLManifest {
        @NonNull
        @KeepForSdk
        public abstract String getLabelsFile();

        @NonNull
        @KeepForSdk
        public abstract String getModelFile();

        @NonNull
        @KeepForSdk
        public abstract String getModelType();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @KeepForSdk
    public static abstract class ModelLoggingInfo {
        public static ModelLoggingInfo zza(long j, @Nullable String str, boolean z) {
            return new AutoValue_ModelUtils_ModelLoggingInfo(j, zzu.zzb(str), z);
        }

        @NonNull
        @KeepForSdk
        public abstract String getHash();

        @KeepForSdk
        public abstract long getSize();

        @KeepForSdk
        public abstract boolean isManifestModel();
    }

    private ModelUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo getModelLoggingInfo(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull com.google.mlkit.common.model.LocalModel r12) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.ModelUtils.getModelLoggingInfo(android.content.Context, com.google.mlkit.common.model.LocalModel):com.google.mlkit.common.internal.model.ModelUtils$ModelLoggingInfo");
    }

    @Nullable
    @KeepForSdk
    public static String getSHA256(@NonNull File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String zzc = zzc(fileInputStream);
                fileInputStream.close();
                return zzc;
            } finally {
            }
        } catch (IOException e) {
            zza.e("ModelUtils", "Failed to create FileInputStream for model: ".concat(e.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (new java.io.File(r6).exists() == false) goto L10;
     */
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile(@androidx.annotation.NonNull java.lang.String r6, boolean r7, @androidx.annotation.NonNull android.content.Context r8) {
        /*
            java.lang.String r0 = "Json string from the manifest file: "
            java.lang.String r1 = java.lang.String.valueOf(r6)
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r3 = "Manifest file path: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.String r3 = "ModelUtils"
            r2.d(r3, r1)
            r1 = 0
            if (r7 == 0) goto L24
            android.content.res.AssetManager r4 = r8.getAssets()     // Catch: java.io.IOException -> L2f
            java.io.InputStream r4 = r4.open(r6)     // Catch: java.io.IOException -> L2f
            if (r4 == 0) goto L37
            r4.close()     // Catch: java.io.IOException -> L2f
            goto L37
        L24:
            java.io.File r4 = new java.io.File
            r4.<init>(r6)
            boolean r4 = r4.exists()
            if (r4 != 0) goto L37
        L2f:
            com.google.android.gms.common.internal.GmsLogger r6 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r7 = "Manifest file does not exist."
            r6.e(r3, r7)
            return r1
        L37:
            boolean r4 = r6.isEmpty()     // Catch: java.lang.Throwable -> L41
            r5 = 0
            if (r4 == 0) goto L43
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L41
            goto L66
        L41:
            r6 = move-exception
            goto L9d
        L43:
            if (r7 == 0) goto L4e
            android.content.res.AssetManager r7 = r8.getAssets()     // Catch: java.lang.Throwable -> L41
            java.io.InputStream r6 = r7.open(r6)     // Catch: java.lang.Throwable -> L41
            goto L59
        L4e:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L41
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L41
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L41
            r6 = r7
        L59:
            int r7 = r6.available()     // Catch: java.lang.Throwable -> L91
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L91
            r6.read(r8, r5, r7)     // Catch: java.lang.Throwable -> L91
            r6.close()     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            r6 = r8
        L66:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            java.lang.String r8 = "UTF-8"
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            java.lang.String r6 = r0.concat(r7)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            r2.d(r3, r6)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            java.lang.String r7 = "modelType"
            java.lang.String r7 = r6.getString(r7)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            java.lang.String r8 = "modelFile"
            java.lang.String r8 = r6.getString(r8)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            java.lang.String r0 = "labelsFile"
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest r0 = new com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            r0.<init>(r7, r8, r6)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
            return r0
        L91:
            r7 = move-exception
            if (r6 == 0) goto L9c
            r6.close()     // Catch: java.lang.Throwable -> L98
            goto L9c
        L98:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
        L9c:
            throw r7     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L41
        L9d:
            com.google.android.gms.common.internal.GmsLogger r7 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r8 = "Error parsing the manifest file."
            r7.e(r3, r8, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.ModelUtils.parseManifestFile(java.lang.String, boolean, android.content.Context):com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest");
    }

    public static boolean zza(@NonNull File file, @NonNull String str) {
        String sha256 = getSHA256(file);
        zza.d("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
        return str.equals(sha256);
    }

    @Nullable
    private static String zzb(Context context, String str, boolean z) {
        AutoMLManifest parseManifestFile = parseManifestFile(str, z, context);
        if (parseManifestFile != null) {
            return new File(new File(str).getParent(), parseManifestFile.getModelFile()).toString();
        }
        zza.e("ModelUtils", "Failed to parse manifest file.");
        return null;
    }

    @Nullable
    private static String zzc(InputStream inputStream) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (IOException unused) {
            zza.e("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            zza.e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }
}
