package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/StartStopToken;", "", "id", "Landroidx/work/impl/model/WorkGenerationalId;", "(Landroidx/work/impl/model/WorkGenerationalId;)V", "getId", "()Landroidx/work/impl/model/WorkGenerationalId;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StartStopToken {

    @NotNull
    private final WorkGenerationalId id;

    public StartStopToken(@NotNull WorkGenerationalId workGenerationalId) {
        workGenerationalId.getClass();
        this.id = workGenerationalId;
    }

    @NotNull
    public final WorkGenerationalId getId() {
        return this.id;
    }
}
