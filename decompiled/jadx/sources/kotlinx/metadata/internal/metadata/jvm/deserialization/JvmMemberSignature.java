package kotlinx.metadata.internal.metadata.jvm.deserialization;

import com.amazon.alexa.enrollment.dialogs.DialogConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H&J\u0006\u0010\n\u001a\u00020\u0004R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMemberSignature;", "", "()V", DialogConstants.DESC, "", "getDesc", "()Ljava/lang/String;", "name", "getName", "asString", "toString", "Field", "Method", "Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMemberSignature$Field;", "Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMemberSignature$Method;", "metadata.jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class JvmMemberSignature {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMemberSignature$Field;", "Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMemberSignature;", "name", "", DialogConstants.DESC, "(Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getName", "asString", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "metadata.jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Field extends JvmMemberSignature {

        @NotNull
        private final String desc;

        @NotNull
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.name = str;
            this.desc = str2;
        }

        public static /* synthetic */ Field copy$default(Field field, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = field.getName();
            }
            if ((i & 2) != 0) {
                str2 = field.getDesc();
            }
            return field.copy(str, str2);
        }

        @Override // kotlinx.metadata.internal.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + AbstractJsonLexerKt.COLON + getDesc();
        }

        @NotNull
        public final String component1() {
            return getName();
        }

        @NotNull
        public final String component2() {
            return getDesc();
        }

        @NotNull
        public final Field copy(@NotNull String name, @NotNull String desc) {
            name.getClass();
            desc.getClass();
            return new Field(name, desc);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.areEqual(getName(), field.getName()) && Intrinsics.areEqual(getDesc(), field.getDesc());
        }

        @Override // kotlinx.metadata.internal.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getDesc() {
            return this.desc;
        }

        @Override // kotlinx.metadata.internal.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return getDesc().hashCode() + (getName().hashCode() * 31);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMemberSignature$Method;", "Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMemberSignature;", "name", "", DialogConstants.DESC, "(Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getName", "asString", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "metadata.jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Method extends JvmMemberSignature {

        @NotNull
        private final String desc;

        @NotNull
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.name = str;
            this.desc = str2;
        }

        public static /* synthetic */ Method copy$default(Method method, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = method.getName();
            }
            if ((i & 2) != 0) {
                str2 = method.getDesc();
            }
            return method.copy(str, str2);
        }

        @Override // kotlinx.metadata.internal.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + getDesc();
        }

        @NotNull
        public final String component1() {
            return getName();
        }

        @NotNull
        public final String component2() {
            return getDesc();
        }

        @NotNull
        public final Method copy(@NotNull String name, @NotNull String desc) {
            name.getClass();
            desc.getClass();
            return new Method(name, desc);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Method)) {
                return false;
            }
            Method method = (Method) other;
            return Intrinsics.areEqual(getName(), method.getName()) && Intrinsics.areEqual(getDesc(), method.getDesc());
        }

        @Override // kotlinx.metadata.internal.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getDesc() {
            return this.desc;
        }

        @Override // kotlinx.metadata.internal.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return getDesc().hashCode() + (getName().hashCode() * 31);
        }
    }

    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String asString();

    @NotNull
    public abstract String getDesc();

    @NotNull
    public abstract String getName();

    @NotNull
    public final String toString() {
        return asString();
    }

    private JvmMemberSignature() {
    }
}
