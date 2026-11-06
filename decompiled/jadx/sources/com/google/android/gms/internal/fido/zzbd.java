package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzbd {
    private final String zza = ",\n  ";

    private zzbd(String str) {
    }

    public static zzbd zza(String str) {
        return new zzbd(",\n  ");
    }

    public static final CharSequence zzd(@CheckForNull Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder zzc(StringBuilder sb, Iterator it2) {
        try {
            if (it2.hasNext()) {
                sb.append(zzd(it2.next()));
                while (it2.hasNext()) {
                    sb.append((CharSequence) this.zza);
                    sb.append(zzd(it2.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) e);
            return null;
        }
    }
}
