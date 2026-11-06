package com.amazon.alexa.assistant.toolkit.storage;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J \u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u000e\u0010\u0011\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/storage/Transaction;", "", "putString", "key", "", "value", "putBoolean", "", "putLong", "", "putInt", "", "putFloat", "", "putStringSet", "", BulkOperationType.remove, "commit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Transaction {
    @Nullable
    Object commit(@NotNull Continuation<? super Boolean> continuation);

    @NotNull
    Transaction putBoolean(@NotNull String key, boolean value);

    @NotNull
    Transaction putFloat(@NotNull String key, float value);

    @NotNull
    Transaction putInt(@NotNull String key, int value);

    @NotNull
    Transaction putLong(@NotNull String key, long value);

    @NotNull
    Transaction putString(@NotNull String key, @Nullable String value);

    @NotNull
    Transaction putStringSet(@NotNull String key, @Nullable Set<String> value);

    @NotNull
    Transaction remove(@NotNull String key);
}
