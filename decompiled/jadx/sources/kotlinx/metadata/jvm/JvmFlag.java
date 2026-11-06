package kotlinx.metadata.jvm;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.metadata.Flag;
import kotlinx.metadata.internal.metadata.deserialization.Flags;
import kotlinx.metadata.internal.metadata.jvm.deserialization.JvmFlags;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lkotlinx/metadata/jvm/JvmFlag;", "", "()V", "booleanFlag", "Lkotlinx/metadata/Flag;", "f", "Lkotlinx/metadata/internal/metadata/deserialization/Flags$BooleanFlagField;", "Class", "Property", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class JvmFlag {

    @NotNull
    public static final JvmFlag INSTANCE = new JvmFlag();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/metadata/jvm/JvmFlag$Class;", "", "()V", "HAS_METHOD_BODIES_IN_INTERFACE", "Lkotlinx/metadata/Flag;", "IS_COMPILED_IN_COMPATIBILITY_MODE", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Class {

        @JvmField
        @NotNull
        public static final Flag HAS_METHOD_BODIES_IN_INTERFACE;

        @NotNull
        public static final Class INSTANCE = new Class();

        @JvmField
        @NotNull
        public static final Flag IS_COMPILED_IN_COMPATIBILITY_MODE;

        static {
            JvmFlag jvmFlag = JvmFlag.INSTANCE;
            JvmFlags jvmFlags = JvmFlags.INSTANCE;
            Flags.BooleanFlagField is_compiled_in_jvm_default_mode = jvmFlags.getIS_COMPILED_IN_JVM_DEFAULT_MODE();
            is_compiled_in_jvm_default_mode.getClass();
            HAS_METHOD_BODIES_IN_INTERFACE = jvmFlag.booleanFlag(is_compiled_in_jvm_default_mode);
            Flags.BooleanFlagField is_compiled_in_compatibility_mode = jvmFlags.getIS_COMPILED_IN_COMPATIBILITY_MODE();
            is_compiled_in_compatibility_mode.getClass();
            IS_COMPILED_IN_COMPATIBILITY_MODE = jvmFlag.booleanFlag(is_compiled_in_compatibility_mode);
        }

        private Class() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/metadata/jvm/JvmFlag$Property;", "", "()V", "IS_MOVED_FROM_INTERFACE_COMPANION", "Lkotlinx/metadata/Flag;", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Property {

        @NotNull
        public static final Property INSTANCE = new Property();

        @JvmField
        @NotNull
        public static final Flag IS_MOVED_FROM_INTERFACE_COMPANION;

        static {
            JvmFlag jvmFlag = JvmFlag.INSTANCE;
            Flags.BooleanFlagField is_moved_from_interface_companion = JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
            is_moved_from_interface_companion.getClass();
            IS_MOVED_FROM_INTERFACE_COMPANION = jvmFlag.booleanFlag(is_moved_from_interface_companion);
        }

        private Property() {
        }
    }

    private JvmFlag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flag booleanFlag(Flags.BooleanFlagField f) {
        return new Flag(f.offset, f.bitWidth, 1);
    }
}
