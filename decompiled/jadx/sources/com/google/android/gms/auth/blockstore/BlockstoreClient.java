package com.google.android.gms.auth.blockstore;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface BlockstoreClient extends HasApiKey<Api.ApiOptions.NoOptions> {

    @NonNull
    public static final String DEFAULT_BYTES_DATA_KEY = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
    public static final int MAX_ENTRY_COUNT = 16;
    public static final int MAX_SIZE = 4096;

    @NonNull
    Task<Boolean> deleteBytes(@NonNull DeleteBytesRequest deleteBytesRequest);

    @NonNull
    Task<Boolean> isEndToEndEncryptionAvailable();

    @NonNull
    @Deprecated
    Task<byte[]> retrieveBytes();

    @NonNull
    Task<RetrieveBytesResponse> retrieveBytes(@NonNull RetrieveBytesRequest retrieveBytesRequest);

    @NonNull
    Task<Integer> storeBytes(@NonNull StoreBytesData storeBytesData);
}
