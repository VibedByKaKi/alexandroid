package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface CallableDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility, Substitutable<CallableDescriptor> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UserDataKey<V> {
    }

    @NotNull
    List<ReceiverParameterDescriptor> getContextReceiverParameters();

    @Nullable
    ReceiverParameterDescriptor getDispatchReceiverParameter();

    @Nullable
    ReceiverParameterDescriptor getExtensionReceiverParameter();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    CallableDescriptor getOriginal();

    @NotNull
    Collection<? extends CallableDescriptor> getOverriddenDescriptors();

    @Nullable
    KotlinType getReturnType();

    @NotNull
    List<TypeParameterDescriptor> getTypeParameters();

    @Nullable
    <V> V getUserData(UserDataKey<V> userDataKey);

    @NotNull
    List<ValueParameterDescriptor> getValueParameters();

    boolean hasSynthesizedParameterNames();
}
