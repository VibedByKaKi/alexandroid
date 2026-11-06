package io.ktor.util.internal;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.SendEventResultBundleKeys;
import io.ktor.util.InternalAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAPI
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&J\u0016\u0010\b\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H&¨\u0006\t"}, d2 = {"Lio/ktor/util/internal/AtomicDesc;", "", "()V", "complete", "", "op", "Lio/ktor/util/internal/AtomicOp;", SendEventResultBundleKeys.FAILURE, "prepare", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public abstract class AtomicDesc {
    public abstract void complete(@NotNull AtomicOp<?> op, @Nullable Object failure);

    @Nullable
    public abstract Object prepare(@NotNull AtomicOp<?> op);
}
