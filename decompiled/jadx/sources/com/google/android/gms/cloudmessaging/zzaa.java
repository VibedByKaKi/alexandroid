package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzaa extends com.google.android.gms.internal.cloudmessaging.zzf {
    final /* synthetic */ Rpc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(Rpc rpc, Looper looper) {
        super(looper);
        this.zza = rpc;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Rpc.zzc(this.zza, message);
    }
}
