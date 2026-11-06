package com.google.android.gms.internal.fido;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzht {
    private final Deque zza = new ArrayDeque(16);

    private zzht(boolean z) {
    }

    public static zzht zza() {
        return new zzht(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0L;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j));
    }

    public final void zzb() throws IOException {
        if (this.zza.isEmpty()) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(ParcelCompat$$ExternalSyntheticOutline0.m(zzh(), "data item not completed, stackSize: ", this.zza.size(), " scope: "));
    }

    public final void zzc() throws IOException {
        long zzh = zzh();
        if (zzh >= 0) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(ArcMode$$ExternalSyntheticOutline0.m(zzh, "expected indefinite length scope but found "));
        } else if (zzh != -5) {
            this.zza.pop();
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$2("expected a value for dangling key in indefinite-length map");
        }
    }

    public final void zzd() throws IOException {
        long zzh = zzh();
        if (zzh != -1) {
            if (zzh != -2) {
                return;
            } else {
                zzh = -2;
            }
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(ArcMode$$ExternalSyntheticOutline0.m(zzh, "expected non-string scope but found "));
    }

    public final void zze(long j) throws IOException {
        long zzh = zzh();
        if (zzh != j) {
            if (zzh != -1) {
                if (zzh != -2) {
                    return;
                } else {
                    zzh = -2;
                }
            }
            StringBuilder m = a$$ExternalSyntheticOutline0.m("expected non-string scope or scope ", j, " but found ");
            m.append(zzh);
            throw new IOException(m.toString());
        }
    }

    public final void zzf() {
        long zzh = zzh();
        if (zzh == 1) {
            this.zza.pop();
            return;
        }
        if (zzh > 1) {
            zzi(zzh - 1);
        } else if (zzh == -4) {
            zzi(-5L);
        } else if (zzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j) {
        this.zza.push(Long.valueOf(j));
    }
}
