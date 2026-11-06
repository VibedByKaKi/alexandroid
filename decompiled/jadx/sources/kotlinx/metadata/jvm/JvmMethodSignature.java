package kotlinx.metadata.jvm;

import com.amazon.alexa.enrollment.dialogs.DialogConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lkotlinx/metadata/jvm/JvmMethodSignature;", "Lkotlinx/metadata/jvm/JvmMemberSignature;", "name", "", DialogConstants.DESC, "(Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getName", "asString", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JvmMethodSignature extends JvmMemberSignature {

    @NotNull
    private final String desc;

    @NotNull
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMethodSignature(@NotNull String str, @NotNull String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.desc = str2;
    }

    public static /* synthetic */ JvmMethodSignature copy$default(JvmMethodSignature jvmMethodSignature, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jvmMethodSignature.getName();
        }
        if ((i & 2) != 0) {
            str2 = jvmMethodSignature.getDesc();
        }
        return jvmMethodSignature.copy(str, str2);
    }

    @Override // kotlinx.metadata.jvm.JvmMemberSignature
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
    public final JvmMethodSignature copy(@NotNull String name, @NotNull String desc) {
        name.getClass();
        desc.getClass();
        return new JvmMethodSignature(name, desc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JvmMethodSignature)) {
            return false;
        }
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) other;
        return Intrinsics.areEqual(getName(), jvmMethodSignature.getName()) && Intrinsics.areEqual(getDesc(), jvmMethodSignature.getDesc());
    }

    @Override // kotlinx.metadata.jvm.JvmMemberSignature
    @NotNull
    public String getDesc() {
        return this.desc;
    }

    @Override // kotlinx.metadata.jvm.JvmMemberSignature
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return getDesc().hashCode() + (getName().hashCode() * 31);
    }
}
