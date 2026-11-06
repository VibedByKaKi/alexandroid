package com.google.android.gms.internal.fido;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    private zzdk(String str, Class cls, boolean z, boolean z2) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        System.identityHashCode(this);
        for (int i = 0; i < 5; i++) {
        }
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        return DoubleList$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m1m(name, "/"), this.zza, MarkdownConstants.LEFT_BRACKET, cls.getName(), MarkdownConstants.RIGHT_BRACKET);
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public zzdk(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }
}
