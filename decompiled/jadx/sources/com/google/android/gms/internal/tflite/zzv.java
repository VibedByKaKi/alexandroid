package com.google.android.gms.internal.tflite;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzv implements zzt {
    private static final zzt zza = zzu.zza;
    private volatile zzt zzb;

    public zzv(zzt zztVar) {
        this.zzb = zztVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned null>";
        }
        String valueOf = String.valueOf(obj);
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 19), "Suppliers.memoize(", valueOf, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
