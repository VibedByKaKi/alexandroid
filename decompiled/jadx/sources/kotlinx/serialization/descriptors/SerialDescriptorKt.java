package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"elementDescriptors", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptors", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Iterable;", "elementNames", "", "getElementNames", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SerialDescriptorKt {
    @NotNull
    public static final Iterable<SerialDescriptor> getElementDescriptors(@NotNull SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return new SerialDescriptorKt$special$$inlined$Iterable$1(serialDescriptor);
    }

    @NotNull
    public static final Iterable<String> getElementNames(@NotNull SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return new SerialDescriptorKt$special$$inlined$Iterable$2(serialDescriptor);
    }
}
