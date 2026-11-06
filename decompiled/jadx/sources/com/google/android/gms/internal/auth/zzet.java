package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class zzet<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {
    protected zzev zza;
    private final zzev zzb;

    public zzet(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzm()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Default instance must be immutable.");
            throw null;
        }
        this.zza = messagetype.zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzet clone() {
        zzet zzetVar = (zzet) this.zzb.zzn(5, null, null);
        zzetVar.zza = zzd();
        return zzetVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfw
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public MessageType zzd() {
        boolean zzm = this.zza.zzm();
        MessageType messagetype = (MessageType) this.zza;
        if (!zzm) {
            return messagetype;
        }
        messagetype.zzi();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* bridge */ /* synthetic */ zzfx zze() {
        throw null;
    }
}
