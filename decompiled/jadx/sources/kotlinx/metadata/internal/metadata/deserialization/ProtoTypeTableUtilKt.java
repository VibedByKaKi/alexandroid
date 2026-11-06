package kotlinx.metadata.internal.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.metadata.internal.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\f\u001a\u00020\r*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\r*\u00020\b\u001a\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0015\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u001c"}, d2 = {"abbreviatedType", "Lkotlinx/metadata/internal/metadata/ProtoBuf$Type;", "typeTable", "Lkotlinx/metadata/internal/metadata/deserialization/TypeTable;", "contextReceiverTypes", "", "Lkotlinx/metadata/internal/metadata/ProtoBuf$Class;", "Lkotlinx/metadata/internal/metadata/ProtoBuf$Function;", "Lkotlinx/metadata/internal/metadata/ProtoBuf$Property;", "expandedType", "Lkotlinx/metadata/internal/metadata/ProtoBuf$TypeAlias;", "flexibleUpperBound", "hasReceiver", "", "inlineClassUnderlyingType", "isInstanceType", "Lkotlinx/metadata/internal/metadata/ProtoBuf$Expression;", "outerType", "receiverType", "returnType", "supertypes", "type", "Lkotlinx/metadata/internal/metadata/ProtoBuf$Type$Argument;", "Lkotlinx/metadata/internal/metadata/ProtoBuf$ValueParameter;", "underlyingType", "upperBounds", "Lkotlinx/metadata/internal/metadata/ProtoBuf$TypeParameter;", "varargElementType", "metadata"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class ProtoTypeTableUtilKt {
    @Nullable
    public static final ProtoBuf.Type abbreviatedType(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        type.getClass();
        typeTable.getClass();
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.get(type.getAbbreviatedTypeId());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<kotlinx.metadata.internal.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @NotNull
    public static final List<ProtoBuf.Type> contextReceiverTypes(@NotNull ProtoBuf.Class r2, @NotNull TypeTable typeTable) {
        r2.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = r2.getContextReceiverTypeList();
        boolean isEmpty = contextReceiverTypeList.isEmpty();
        ?? r0 = contextReceiverTypeList;
        if (isEmpty) {
            r0 = 0;
        }
        if (r0 == 0) {
            List<Integer> contextReceiverTypeIdList = r2.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            List<Integer> list = contextReceiverTypeIdList;
            r0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                r0.add(typeTable.get(num.intValue()));
            }
        }
        return r0;
    }

    @NotNull
    public static final ProtoBuf.Type expandedType(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        typeAlias.getClass();
        typeTable.getClass();
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            expandedType.getClass();
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type flexibleUpperBound(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        type.getClass();
        typeTable.getClass();
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.get(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean hasReceiver(@NotNull ProtoBuf.Function function) {
        function.getClass();
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    @Nullable
    public static final ProtoBuf.Type inlineClassUnderlyingType(@NotNull ProtoBuf.Class r1, @NotNull TypeTable typeTable) {
        r1.getClass();
        typeTable.getClass();
        if (r1.hasInlineClassUnderlyingType()) {
            return r1.getInlineClassUnderlyingType();
        }
        if (r1.hasInlineClassUnderlyingTypeId()) {
            return typeTable.get(r1.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type isInstanceType(@NotNull ProtoBuf.Expression expression, @NotNull TypeTable typeTable) {
        expression.getClass();
        typeTable.getClass();
        if (expression.hasIsInstanceType()) {
            return expression.getIsInstanceType();
        }
        if (expression.hasIsInstanceTypeId()) {
            return typeTable.get(expression.getIsInstanceTypeId());
        }
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type outerType(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        type.getClass();
        typeTable.getClass();
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.get(type.getOuterTypeId());
        }
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type receiverType(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.get(function.getReceiverTypeId());
        }
        return null;
    }

    @NotNull
    public static final ProtoBuf.Type returnType(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No returnType in ProtoBuf.Function");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<kotlinx.metadata.internal.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @NotNull
    public static final List<ProtoBuf.Type> supertypes(@NotNull ProtoBuf.Class r2, @NotNull TypeTable typeTable) {
        r2.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> supertypeList = r2.getSupertypeList();
        boolean isEmpty = supertypeList.isEmpty();
        ?? r0 = supertypeList;
        if (isEmpty) {
            r0 = 0;
        }
        if (r0 == 0) {
            List<Integer> supertypeIdList = r2.getSupertypeIdList();
            supertypeIdList.getClass();
            List<Integer> list = supertypeIdList;
            r0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                r0.add(typeTable.get(num.intValue()));
            }
        }
        return r0;
    }

    @NotNull
    public static final ProtoBuf.Type type(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        valueParameter.getClass();
        typeTable.getClass();
        if (valueParameter.hasType()) {
            ProtoBuf.Type type = valueParameter.getType();
            type.getClass();
            return type;
        }
        if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No type in ProtoBuf.ValueParameter");
        return null;
    }

    @NotNull
    public static final ProtoBuf.Type underlyingType(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        typeAlias.getClass();
        typeTable.getClass();
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            underlyingType.getClass();
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<kotlinx.metadata.internal.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @NotNull
    public static final List<ProtoBuf.Type> upperBounds(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull TypeTable typeTable) {
        typeParameter.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        boolean isEmpty = upperBoundList.isEmpty();
        ?? r0 = upperBoundList;
        if (isEmpty) {
            r0 = 0;
        }
        if (r0 == 0) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            upperBoundIdList.getClass();
            List<Integer> list = upperBoundIdList;
            r0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                r0.add(typeTable.get(num.intValue()));
            }
        }
        return r0;
    }

    @Nullable
    public static final ProtoBuf.Type varargElementType(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        valueParameter.getClass();
        typeTable.getClass();
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.get(valueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final boolean hasReceiver(@NotNull ProtoBuf.Property property) {
        property.getClass();
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    @Nullable
    public static final ProtoBuf.Type receiverType(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.get(property.getReceiverTypeId());
        }
        return null;
    }

    @NotNull
    public static final ProtoBuf.Type returnType(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No returnType in ProtoBuf.Property");
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type type(@NotNull ProtoBuf.Type.Argument argument, @NotNull TypeTable typeTable) {
        argument.getClass();
        typeTable.getClass();
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.get(argument.getTypeId());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<kotlinx.metadata.internal.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @NotNull
    public static final List<ProtoBuf.Type> contextReceiverTypes(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        boolean isEmpty = contextReceiverTypeList.isEmpty();
        ?? r0 = contextReceiverTypeList;
        if (isEmpty) {
            r0 = 0;
        }
        if (r0 == 0) {
            List<Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            List<Integer> list = contextReceiverTypeIdList;
            r0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                r0.add(typeTable.get(num.intValue()));
            }
        }
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<kotlinx.metadata.internal.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @NotNull
    public static final List<ProtoBuf.Type> contextReceiverTypes(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        boolean isEmpty = contextReceiverTypeList.isEmpty();
        ?? r0 = contextReceiverTypeList;
        if (isEmpty) {
            r0 = 0;
        }
        if (r0 == 0) {
            List<Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            List<Integer> list = contextReceiverTypeIdList;
            r0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                r0.add(typeTable.get(num.intValue()));
            }
        }
        return r0;
    }
}
