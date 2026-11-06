package kotlinx.serialization.internal;

import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"jsonCachedSerialNames", "", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class JsonInternalDependenciesKt {
    @CoreFriendModuleApi
    @NotNull
    public static final Set<String> jsonCachedSerialNames(@NotNull SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return Platform_commonKt.cachedSerialNames(serialDescriptor);
    }
}
