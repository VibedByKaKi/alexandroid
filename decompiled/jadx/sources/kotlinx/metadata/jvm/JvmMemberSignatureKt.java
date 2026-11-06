package kotlinx.metadata.jvm;

import kotlin.Metadata;
import kotlinx.metadata.internal.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"wrapAsPublic", "Lkotlinx/metadata/jvm/JvmFieldSignature;", "Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMemberSignature$Field;", "Lkotlinx/metadata/jvm/JvmMethodSignature;", "Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMemberSignature$Method;", "kotlinx-metadata-jvm"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class JvmMemberSignatureKt {
    @NotNull
    public static final JvmMethodSignature wrapAsPublic(@NotNull JvmMemberSignature.Method method) {
        method.getClass();
        return new JvmMethodSignature(method.getName(), method.getDesc());
    }

    @NotNull
    public static final JvmFieldSignature wrapAsPublic(@NotNull JvmMemberSignature.Field field) {
        field.getClass();
        return new JvmFieldSignature(field.getName(), field.getDesc());
    }
}
