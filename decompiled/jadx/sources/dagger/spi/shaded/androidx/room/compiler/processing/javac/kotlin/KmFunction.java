package dagger.spi.shaded.androidx.room.compiler.processing.javac.kotlin;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.metadata.Flag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\r\u0010!\u001a\u00060\u0007j\u0002`\bHÂ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0011HÆ\u0003Ju\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\u0006\u0010,\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020\u0011J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019¨\u0006/"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/KmFunction;", "Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/KmExecutable;", "jvmName", "", "name", "descriptor", "flags", "", "Lkotlinx/metadata/Flags;", "typeArguments", "", "Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/KmType;", "parameters", "Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/KmValueParameter;", "returnType", "receiverType", "isPropertyFunction", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Landroidx/room/compiler/processing/javac/kotlin/KmType;Landroidx/room/compiler/processing/javac/kotlin/KmType;Z)V", "getDescriptor", "()Ljava/lang/String;", "()Z", "getJvmName", "getName", "getParameters", "()Ljava/util/List;", "getReceiverType", "()Landroidx/room/compiler/processing/javac/kotlin/KmType;", "getReturnType", "getTypeArguments", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "isExtension", "isSuspend", "toString", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class KmFunction implements KmExecutable {

    @NotNull
    private final String descriptor;
    private final int flags;
    private final boolean isPropertyFunction;

    @NotNull
    private final String jvmName;

    @NotNull
    private final String name;

    @NotNull
    private final List<KmValueParameter> parameters;

    @Nullable
    private final KmType receiverType;

    @NotNull
    private final KmType returnType;

    @NotNull
    private final List<KmType> typeArguments;

    public KmFunction(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull List<KmType> list, @NotNull List<KmValueParameter> list2, @NotNull KmType kmType, @Nullable KmType kmType2, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        kmType.getClass();
        this.jvmName = str;
        this.name = str2;
        this.descriptor = str3;
        this.flags = i;
        this.typeArguments = list;
        this.parameters = list2;
        this.returnType = kmType;
        this.receiverType = kmType2;
        this.isPropertyFunction = z;
    }

    /* renamed from: component4, reason: from getter */
    private final int getFlags() {
        return this.flags;
    }

    public static /* synthetic */ KmFunction copy$default(KmFunction kmFunction, String str, String str2, String str3, int i, List list, List list2, KmType kmType, KmType kmType2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = kmFunction.jvmName;
        }
        if ((i2 & 2) != 0) {
            str2 = kmFunction.name;
        }
        if ((i2 & 4) != 0) {
            str3 = kmFunction.descriptor;
        }
        if ((i2 & 8) != 0) {
            i = kmFunction.flags;
        }
        if ((i2 & 16) != 0) {
            list = kmFunction.typeArguments;
        }
        if ((i2 & 32) != 0) {
            list2 = kmFunction.getParameters();
        }
        if ((i2 & 64) != 0) {
            kmType = kmFunction.returnType;
        }
        if ((i2 & 128) != 0) {
            kmType2 = kmFunction.receiverType;
        }
        if ((i2 & 256) != 0) {
            z = kmFunction.isPropertyFunction;
        }
        KmType kmType3 = kmType2;
        boolean z2 = z;
        List list3 = list2;
        KmType kmType4 = kmType;
        List list4 = list;
        String str4 = str3;
        return kmFunction.copy(str, str2, str4, i, list4, list3, kmType4, kmType3, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getJvmName() {
        return this.jvmName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescriptor() {
        return this.descriptor;
    }

    @NotNull
    public final List<KmType> component5() {
        return this.typeArguments;
    }

    @NotNull
    public final List<KmValueParameter> component6() {
        return getParameters();
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final KmType getReturnType() {
        return this.returnType;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final KmType getReceiverType() {
        return this.receiverType;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsPropertyFunction() {
        return this.isPropertyFunction;
    }

    @NotNull
    public final KmFunction copy(@NotNull String jvmName, @NotNull String name, @NotNull String descriptor, int flags, @NotNull List<KmType> typeArguments, @NotNull List<KmValueParameter> parameters, @NotNull KmType returnType, @Nullable KmType receiverType, boolean isPropertyFunction) {
        jvmName.getClass();
        name.getClass();
        descriptor.getClass();
        typeArguments.getClass();
        parameters.getClass();
        returnType.getClass();
        return new KmFunction(jvmName, name, descriptor, flags, typeArguments, parameters, returnType, receiverType, isPropertyFunction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KmFunction)) {
            return false;
        }
        KmFunction kmFunction = (KmFunction) other;
        return Intrinsics.areEqual(this.jvmName, kmFunction.jvmName) && Intrinsics.areEqual(this.name, kmFunction.name) && Intrinsics.areEqual(this.descriptor, kmFunction.descriptor) && this.flags == kmFunction.flags && Intrinsics.areEqual(this.typeArguments, kmFunction.typeArguments) && Intrinsics.areEqual(getParameters(), kmFunction.getParameters()) && Intrinsics.areEqual(this.returnType, kmFunction.returnType) && Intrinsics.areEqual(this.receiverType, kmFunction.receiverType) && this.isPropertyFunction == kmFunction.isPropertyFunction;
    }

    @NotNull
    public final String getDescriptor() {
        return this.descriptor;
    }

    @NotNull
    public final String getJvmName() {
        return this.jvmName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.javac.kotlin.KmExecutable
    @NotNull
    public List<KmValueParameter> getParameters() {
        return this.parameters;
    }

    @Nullable
    public final KmType getReceiverType() {
        return this.receiverType;
    }

    @NotNull
    public final KmType getReturnType() {
        return this.returnType;
    }

    @NotNull
    public final List<KmType> getTypeArguments() {
        return this.typeArguments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.returnType.hashCode() + ((getParameters().hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.typeArguments, ArcMode$$ExternalSyntheticOutline0.m(this.flags, ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.jvmName.hashCode() * 31, 31, this.name), 31, this.descriptor), 31), 31)) * 31)) * 31;
        KmType kmType = this.receiverType;
        int hashCode2 = (hashCode + (kmType == null ? 0 : kmType.hashCode())) * 31;
        boolean z = this.isPropertyFunction;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final boolean isExtension() {
        return this.receiverType != null;
    }

    public final boolean isPropertyFunction() {
        return this.isPropertyFunction;
    }

    public final boolean isSuspend() {
        return Flag.Function.IS_SUSPEND.invoke(this.flags);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("KmFunction(jvmName=");
        sb.append(this.jvmName);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", descriptor=");
        sb.append(this.descriptor);
        sb.append(", flags=");
        sb.append(this.flags);
        sb.append(", typeArguments=");
        sb.append(this.typeArguments);
        sb.append(", parameters=");
        sb.append(getParameters());
        sb.append(", returnType=");
        sb.append(this.returnType);
        sb.append(", receiverType=");
        sb.append(this.receiverType);
        sb.append(", isPropertyFunction=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.isPropertyFunction, ')');
    }

    public /* synthetic */ KmFunction(String str, String str2, String str3, int i, List list, List list2, KmType kmType, KmType kmType2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, list, list2, kmType, kmType2, (i2 & 256) != 0 ? false : z);
    }
}
