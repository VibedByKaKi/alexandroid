package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface Check {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DefaultImpls {
        @Nullable
        public static String invoke(@NotNull Check check, @NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            if (check.check(functionDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }

    boolean check(@NotNull FunctionDescriptor functionDescriptor);

    @NotNull
    String getDescription();

    @Nullable
    String invoke(@NotNull FunctionDescriptor functionDescriptor);
}
