package com.amazon.alexa.client.core.device;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface PersistentStorage {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Transaction {
        Transaction clear();

        void commitAsynchronously();

        void commitSynchronously();

        Transaction remove(@NonNull String str);

        Transaction set(@NonNull String str, long j);

        Transaction set(@NonNull String str, @Nullable String str2);

        Transaction set(@NonNull String str, boolean z);
    }

    boolean contains(@NonNull String str);

    @CheckResult
    Transaction edit();

    Map<String, ?> getAll();

    boolean getBoolean(@NonNull String str);

    boolean getBoolean(@NonNull String str, boolean z);

    Set<String> getKeys();

    long getLong(@NonNull String str, long j);

    @Nullable
    String getString(@NonNull String str);

    @Nullable
    String getString(@NonNull String str, @Nullable String str2);

    boolean isUserSpecific();

    boolean removeAll();
}
