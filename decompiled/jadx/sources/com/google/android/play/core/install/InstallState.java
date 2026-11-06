package com.google.android.play.core.install;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class InstallState {
    public static InstallState zza(@InstallStatus int i, long j, long j2, @InstallErrorCode int i2, @NonNull String str) {
        return new zza(i, j, j2, i2, str);
    }

    public static InstallState zzb(@NonNull Intent intent, @NonNull zzm zzmVar) {
        zzmVar.zza("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        zzmVar.zza("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        zzmVar.zza("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
    }

    public abstract long bytesDownloaded();

    @InstallErrorCode
    public abstract int installErrorCode();

    @InstallStatus
    public abstract int installStatus();

    public abstract String packageName();

    public abstract long totalBytesToDownload();
}
