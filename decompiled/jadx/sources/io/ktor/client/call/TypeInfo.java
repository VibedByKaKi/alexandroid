package io.ktor.client.call;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\r\u0010\r\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/ktor/client/call/TypeInfo;", "", "type", "Lkotlin/reflect/KClass;", "reifiedType", "Ljava/lang/reflect/Type;", "Lio/ktor/client/call/Type;", "(Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;)V", "getReifiedType", "()Ljava/lang/reflect/Type;", "getType", "()Lkotlin/reflect/KClass;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ktor-client-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final /* data */ class TypeInfo {

    @NotNull
    private final Type reifiedType;

    @NotNull
    private final KClass<?> type;

    public TypeInfo(@NotNull KClass<?> kClass, @NotNull Type type) {
        kClass.getClass();
        type.getClass();
        this.type = kClass;
        this.reifiedType = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static /* synthetic */ TypeInfo copy$default(TypeInfo typeInfo, KClass kClass, Type type, int i, Object obj) {
        if ((i & 1) != 0) {
            kClass = typeInfo.type;
        }
        if ((i & 2) != 0) {
            type = typeInfo.reifiedType;
        }
        return typeInfo.copy(kClass, type);
    }

    @NotNull
    public final KClass<?> component1() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Type getReifiedType() {
        return this.reifiedType;
    }

    @NotNull
    public final TypeInfo copy(@NotNull KClass<?> type, @NotNull Type reifiedType) {
        type.getClass();
        reifiedType.getClass();
        return new TypeInfo(type, reifiedType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypeInfo)) {
            return false;
        }
        TypeInfo typeInfo = (TypeInfo) other;
        return Intrinsics.areEqual(this.type, typeInfo.type) && Intrinsics.areEqual(this.reifiedType, typeInfo.reifiedType);
    }

    @NotNull
    public final Type getReifiedType() {
        return this.reifiedType;
    }

    @NotNull
    public final KClass<?> getType() {
        return this.type;
    }

    public int hashCode() {
        KClass<?> kClass = this.type;
        int hashCode = (kClass != null ? kClass.hashCode() : 0) * 31;
        Type type = this.reifiedType;
        return hashCode + (type != null ? type.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TypeInfo(type=" + this.type + ", reifiedType=" + this.reifiedType + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
