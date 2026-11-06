package com.google.android.gms.internal.home;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Iterator;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzax extends zzak {
    final transient Object zza;

    public zzax(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.home.zzaf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.home.zzak, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.home.zzak, com.google.android.gms.internal.home.zzaf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzao(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return MarkdownConstants.LEFT_BRACKET + this.zza.toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.home.zzak, com.google.android.gms.internal.home.zzaf
    public final zzaj zzd() {
        return zzaj.zzn(this.zza);
    }

    @Override // com.google.android.gms.internal.home.zzak, com.google.android.gms.internal.home.zzaf
    /* renamed from: zze */
    public final zzba iterator() {
        return new zzao(this.zza);
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final boolean zzf() {
        throw null;
    }
}
