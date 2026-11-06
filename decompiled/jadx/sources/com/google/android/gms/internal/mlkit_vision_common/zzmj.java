package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzmj {

    @Nullable
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zzmc zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzmj(Context context, final SharedPrefManager sharedPrefManager, zzmc zzmcVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzmcVar;
        zzmw.zza();
        this.zzi = str;
        this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzmj.this.zza();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzrVar.get(str)) : -1;
    }

    @NonNull
    private static synchronized zzp zzd() {
        synchronized (zzmj.class) {
            try {
                zzp zzpVar = zza;
                if (zzpVar != null) {
                    return zzpVar;
                }
                LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                zzm zzmVar = new zzm();
                for (int i = 0; i < locales.size(); i++) {
                    zzmVar.zzb(CommonUtils.languageTagFromLocale(locales.get(i)));
                }
                zzp zzc = zzmVar.zzc();
                zza = zzc;
                return zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ String zza() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzb(zzmb zzmbVar, zziv zzivVar, String str) {
        zzmbVar.zza(zzivVar);
        String zzc = zzmbVar.zzc();
        zzky zzkyVar = new zzky();
        zzkyVar.zzb(this.zzc);
        zzkyVar.zzc(this.zzd);
        zzkyVar.zzh(zzd());
        zzkyVar.zzg(Boolean.TRUE);
        zzkyVar.zzl(zzc);
        zzkyVar.zzj(str);
        zzkyVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzkyVar.zzd(10);
        zzkyVar.zzk(Integer.valueOf(this.zzj));
        zzmbVar.zzb(zzkyVar);
        this.zze.zza(zzmbVar);
    }

    @WorkerThread
    public final void zzc(zzmt zzmtVar, final zziv zzivVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzivVar) != null && elapsedRealtime - ((Long) this.zzk.get(zzivVar)).longValue() <= 30000) {
            return;
        }
        this.zzk.put(zzivVar, Long.valueOf(elapsedRealtime));
        int i = zzmtVar.zza;
        int i2 = zzmtVar.zzb;
        int i3 = zzmtVar.zzc;
        int i4 = zzmtVar.zzd;
        int i5 = zzmtVar.zze;
        long j = zzmtVar.zzf;
        int i6 = zzmtVar.zzg;
        zzin zzinVar = new zzin();
        zzinVar.zzd(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21 : zzii.NV16 : zzii.YV12 : zzii.YUV_420_888 : zzii.BITMAP);
        zzinVar.zzf(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH : zzio.BYTEBUFFER : zzio.BYTEARRAY : zzio.BITMAP);
        zzinVar.zzc(Integer.valueOf(i3));
        zzinVar.zze(Integer.valueOf(i4));
        zzinVar.zzg(Integer.valueOf(i5));
        zzinVar.zzb(Long.valueOf(j));
        zzinVar.zzh(Integer.valueOf(i6));
        zziq zzj = zzinVar.zzj();
        zziw zziwVar = new zziw();
        zziwVar.zzd(zzj);
        final zzmb zze = zzmk.zze(zziwVar);
        final String version = this.zzg.isSuccessful() ? (String) this.zzg.getResult() : LibraryVersion.getInstance().getVersion(this.zzi);
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            @Override // java.lang.Runnable
            public final void run() {
                zzmj.this.zzb(zze, zzivVar, version);
            }
        });
    }
}
