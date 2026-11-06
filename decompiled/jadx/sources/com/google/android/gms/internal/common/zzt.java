package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzt implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzw zzb;

    public zzt(zzw zzwVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzwVar);
        this.zzb = zzwVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zze(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        Iterator it2 = iterator();
        try {
            if (it2.hasNext()) {
                sb.append(zzq.zza(it2.next(), ", "));
                while (it2.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(zzq.zza(it2.next(), ", "));
                }
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) e);
            return null;
        }
    }
}
