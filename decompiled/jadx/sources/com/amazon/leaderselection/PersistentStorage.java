package com.amazon.leaderselection;

import com.amazon.alexa.client.annotations.CheckResult;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
interface PersistentStorage {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Transaction {
        void commit();

        Transaction remove(@NonNull String str);

        Transaction set(@NonNull String str, long j);

        Transaction set(@NonNull String str, @Nullable String str2);

        Transaction set(@NonNull String str, boolean z);
    }

    boolean contains(@NonNull String str);

    @CheckResult
    Transaction edit();

    boolean getBoolean(@NonNull String str);

    boolean getBoolean(@NonNull String str, boolean z);

    long getLong(@NonNull String str, long j);

    @Nullable
    String getString(@NonNull String str);

    @Nullable
    String getString(@NonNull String str, @Nullable String str2);
}
