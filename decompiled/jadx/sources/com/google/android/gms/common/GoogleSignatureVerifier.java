package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes7.dex */
public class GoogleSignatureVerifier {

    @Nullable
    private static GoogleSignatureVerifier zza;

    @Nullable
    private static volatile Set zzd;

    @Nullable
    private static volatile Set zze;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.zzb = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzo.zza(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[Catch: IllegalArgumentException -> 0x00a2, TryCatch #0 {IllegalArgumentException -> 0x00a2, blocks: (B:19:0x002a, B:20:0x002f, B:22:0x0036, B:24:0x003c, B:27:0x0043, B:29:0x0052, B:31:0x005e, B:32:0x0067, B:34:0x006d, B:36:0x0078, B:37:0x0082, B:39:0x008a, B:48:0x009a, B:49:0x00a1, B:50:0x0063, B:51:0x002d), top: B:17:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a A[Catch: IllegalArgumentException -> 0x00a2, TryCatch #0 {IllegalArgumentException -> 0x00a2, blocks: (B:19:0x002a, B:20:0x002f, B:22:0x0036, B:24:0x003c, B:27:0x0043, B:29:0x0052, B:31:0x005e, B:32:0x0067, B:34:0x006d, B:36:0x0078, B:37:0x0082, B:39:0x008a, B:48:0x009a, B:49:0x00a1, B:50:0x0063, B:51:0x002d), top: B:17:0x0028 }] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zza(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r11 == 0) goto L28
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L21
        L1f:
            r11 = r0
            goto L28
        L21:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L1f
            r11 = r1
        L28:
            if (r11 == 0) goto L2d
            com.google.android.gms.internal.common.zzah r2 = com.google.android.gms.common.zzn.zzc     // Catch: java.lang.IllegalArgumentException -> La2
            goto L2f
        L2d:
            com.google.android.gms.internal.common.zzah r2 = com.google.android.gms.common.zzn.zzb     // Catch: java.lang.IllegalArgumentException -> La2
        L2f:
            com.google.android.gms.internal.common.zzr.zza(r1)     // Catch: java.lang.IllegalArgumentException -> La2
            android.content.pm.SigningInfo r3 = r10.signingInfo     // Catch: java.lang.IllegalArgumentException -> La2
            if (r3 == 0) goto L63
            boolean r4 = r3.hasMultipleSigners()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L63
            android.content.pm.Signature[] r4 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L43
            goto L63
        L43:
            int r4 = com.google.android.gms.internal.common.zzah.zzd     // Catch: java.lang.IllegalArgumentException -> La2
            com.google.android.gms.internal.common.zzad r4 = new com.google.android.gms.internal.common.zzad     // Catch: java.lang.IllegalArgumentException -> La2
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> La2
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La2
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La2
            r6 = r0
        L50:
            if (r6 >= r5) goto L5e
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La2
            r4.zzb(r7)     // Catch: java.lang.IllegalArgumentException -> La2
            int r6 = r6 + 1
            goto L50
        L5e:
            com.google.android.gms.internal.common.zzah r3 = r4.zzd()     // Catch: java.lang.IllegalArgumentException -> La2
            goto L67
        L63:
            com.google.android.gms.internal.common.zzah r3 = com.google.android.gms.internal.common.zzah.zzj()     // Catch: java.lang.IllegalArgumentException -> La2
        L67:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L9a
            com.google.android.gms.internal.common.zzah r3 = r3.zzh()     // Catch: java.lang.IllegalArgumentException -> La2
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La2
            r5 = r0
        L76:
            if (r5 >= r4) goto L99
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La2
            com.google.android.gms.internal.common.zzal r7 = r2.listIterator(r0)     // Catch: java.lang.IllegalArgumentException -> La2
        L82:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La2
            int r9 = r5 + 1
            if (r8 == 0) goto L97
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La2
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La2
            if (r8 == 0) goto L82
            return r1
        L97:
            r5 = r9
            goto L76
        L99:
            return r0
        L9a:
            java.lang.String r2 = "Unable to obtain package certificate history."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La2
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> La2
            throw r3     // Catch: java.lang.IllegalArgumentException -> La2
        La2:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r11 == 0) goto Lb2
            com.google.android.gms.common.zzj[] r11 = com.google.android.gms.common.zzn.zza
            com.google.android.gms.common.zzj r10 = zzc(r10, r11)
            goto Lbe
        Lb2:
            com.google.android.gms.common.zzj[] r11 = com.google.android.gms.common.zzn.zza
            r11 = r11[r0]
            com.google.android.gms.common.zzj[] r11 = new com.google.android.gms.common.zzj[]{r11}
            com.google.android.gms.common.zzj r10 = zzc(r10, r11)
        Lbe:
            if (r10 == 0) goto Lc1
            return r1
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zza(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.common.zzy zzb(@javax.annotation.Nullable java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L9
            com.google.android.gms.common.zzy r5 = com.google.android.gms.common.zzy.zzc(r7)
            return r5
        L9:
            java.lang.String r8 = r5.zzc
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto Lc4
            int r8 = com.google.android.gms.common.zzo.zzh
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskReads()
            r0 = 1
            com.google.android.gms.common.zzo.zzb()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L47
            com.google.android.gms.common.internal.zzad r1 = com.google.android.gms.common.zzo.zzg     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L47
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L47
            android.os.StrictMode.setThreadPolicy(r8)
            if (r1 == 0) goto L52
            com.google.android.gms.common.zzv r7 = new com.google.android.gms.common.zzv
            r8 = 0
            r7.<init>(r8)
            r7.zza(r6)
            android.content.Context r8 = r5.zzb
            boolean r8 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r8)
            r7.zzb(r8)
            r7.zzc(r0)
            com.google.android.gms.common.zzw r7 = r7.zzd()
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzo.zzc(r7)
            goto Lad
        L44:
            r5 = move-exception
            goto Lc0
        L47:
            r1 = move-exception
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r3 = "Failed to get Google certificates from remote"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L44
            android.os.StrictMode.setThreadPolicy(r8)
        L52:
            android.content.Context r8 = r5.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            r1 = 134217792(0x8000040, float:3.8518893E-34)
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            android.content.Context r1 = r5.zzb
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r1)
            if (r8 != 0) goto L6c
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzy.zzc(r7)
            goto Lad
        L6c:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto La7
            int r7 = r7.length
            if (r7 == r0) goto L74
            goto La7
        L74:
            com.google.android.gms.common.zzk r7 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r2 = r8.signatures
            r3 = 0
            r2 = r2[r3]
            byte[] r2 = r2.toByteArray()
            r7.<init>(r2)
            java.lang.String r2 = r8.packageName
            com.google.android.gms.common.zzy r1 = com.google.android.gms.common.zzo.zzd(r2, r7, r1, r3)
            boolean r4 = r1.zza
            if (r4 == 0) goto La5
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto La5
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto La5
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzo.zzd(r2, r7, r3, r0)
            boolean r7 = r7.zza
            if (r7 == 0) goto La5
            java.lang.String r7 = "debuggable release cert app rejected"
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzy.zzc(r7)
            goto Lad
        La5:
            r7 = r1
            goto Lad
        La7:
            java.lang.String r7 = "single cert required"
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzy.zzc(r7)
        Lad:
            boolean r8 = r7.zza
            if (r8 == 0) goto Lb3
            r5.zzc = r6
        Lb3:
            return r7
        Lb4:
            r5 = move-exception
            java.lang.String r7 = "no pkg "
            java.lang.String r6 = r7.concat(r6)
            com.google.android.gms.common.zzy r5 = com.google.android.gms.common.zzy.zzd(r6, r5)
            return r5
        Lc0:
            android.os.StrictMode.setThreadPolicy(r8)
            throw r5
        Lc4:
            com.google.android.gms.common.zzy r5 = com.google.android.gms.common.zzy.zzb()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(java.lang.String, boolean, boolean):com.google.android.gms.common.zzy");
    }

    @Nullable
    private static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(zzkVar)) {
                    return zzjVarArr[i];
                }
            }
        }
        return null;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@Nullable String str) {
        zzy zzb = zzb(str, false, false);
        zzb.zze();
        return zzb.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        zzy zzc;
        int length;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Preconditions.checkNotNull(zzc);
                    break;
                }
                zzc = zzb(packagesForUid[i2], false, false);
                if (zzc.zza) {
                    break;
                }
                i2++;
            }
        } else {
            zzc = zzy.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}
