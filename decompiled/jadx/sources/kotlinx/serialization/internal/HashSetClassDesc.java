package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/serialization/internal/HashSetClassDesc;", "Lkotlinx/serialization/internal/ListLikeDescriptor;", "elementDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "serialName", "", "getSerialName", "()Ljava/lang/String;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HashSetClassDesc extends ListLikeDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashSetClassDesc(@NotNull SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return CollectionDescriptorsKt.HASH_SET_NAME;
    }
}
