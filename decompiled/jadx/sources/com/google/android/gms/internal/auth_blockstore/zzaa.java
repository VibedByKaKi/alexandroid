package com.google.android.gms.internal.auth_blockstore;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.BlockstoreClient;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzaa extends GoogleApi implements BlockstoreClient {
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzc = new Api("Blockstore.API", zzuVar, clientKey);
    }

    public zzaa(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final Task<Boolean> deleteBytes(final DeleteBytesRequest deleteBytesRequest) {
        Preconditions.checkNotNull(deleteBytesRequest, "DeleteBytesRequest cannot be null");
        return doWrite(TaskApiCall.builder().setFeatures(zzab.zzg).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zza(new zzy(zzaa.this, (TaskCompletionSource) obj2), deleteBytesRequest);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1669).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final Task<Boolean> isEndToEndEncryptionAvailable() {
        return doRead(TaskApiCall.builder().setFeatures(zzab.zze).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzb(new zzz(zzaa.this, (TaskCompletionSource) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1651).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final Task<RetrieveBytesResponse> retrieveBytes(final RetrieveBytesRequest retrieveBytesRequest) {
        Preconditions.checkNotNull(retrieveBytesRequest, "RetrieveBytesRequest cannot be null");
        return doRead(TaskApiCall.builder().setFeatures(zzab.zzh).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzd(new zzw(zzaa.this, (TaskCompletionSource) obj2), retrieveBytesRequest);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1668).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final Task<Integer> storeBytes(final StoreBytesData storeBytesData) {
        return doWrite(TaskApiCall.builder().setFeatures(zzab.zzd, zzab.zzf).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zze(new zzv(zzaa.this, (TaskCompletionSource) obj2), storeBytesData);
            }
        }).setMethodKey(1645).setAutoResolveMissingFeatures(false).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final Task<byte[]> retrieveBytes() {
        return doRead(TaskApiCall.builder().setFeatures(zzab.zza).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzc(new zzx(zzaa.this, (TaskCompletionSource) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1570).build());
    }
}
