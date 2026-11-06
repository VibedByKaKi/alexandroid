package kotlinx.metadata.internal.metadata.deserialization;

import kotlinx.metadata.internal.metadata.ProtoBuf;
import kotlinx.metadata.internal.protobuf.Internal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class Flags {
    public static final FlagField<ProtoBuf.Class.Kind> CLASS_KIND;
    public static final BooleanFlagField DECLARES_DEFAULT_VALUE;
    public static final BooleanFlagField DEFINITELY_NOT_NULL_TYPE;
    public static final BooleanFlagField HAS_ANNOTATIONS;
    public static final BooleanFlagField HAS_CONSTANT;
    public static final BooleanFlagField HAS_GETTER;
    public static final BooleanFlagField HAS_SETTER;
    public static final BooleanFlagField IS_CONST;
    public static final BooleanFlagField IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final BooleanFlagField IS_CROSSINLINE;
    public static final BooleanFlagField IS_DATA;
    public static final BooleanFlagField IS_DELEGATED;
    public static final BooleanFlagField IS_EXPECT_CLASS;
    public static final BooleanFlagField IS_EXPECT_FUNCTION;
    public static final BooleanFlagField IS_EXPECT_PROPERTY;
    public static final BooleanFlagField IS_EXTERNAL_ACCESSOR;
    public static final BooleanFlagField IS_EXTERNAL_CLASS;
    public static final BooleanFlagField IS_EXTERNAL_FUNCTION;
    public static final BooleanFlagField IS_EXTERNAL_PROPERTY;
    public static final BooleanFlagField IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final BooleanFlagField IS_FUN_INTERFACE;
    public static final BooleanFlagField IS_INFIX;
    public static final BooleanFlagField IS_INLINE;
    public static final BooleanFlagField IS_INLINE_ACCESSOR;
    public static final BooleanFlagField IS_INNER;
    public static final BooleanFlagField IS_LATEINIT;
    public static final BooleanFlagField IS_NEGATED;
    public static final BooleanFlagField IS_NOINLINE;
    public static final BooleanFlagField IS_NOT_DEFAULT;
    public static final BooleanFlagField IS_NULL_CHECK_PREDICATE;
    public static final BooleanFlagField IS_OPERATOR;
    public static final BooleanFlagField IS_SECONDARY;
    public static final BooleanFlagField IS_SUSPEND;
    public static final BooleanFlagField IS_TAILREC;
    public static final BooleanFlagField IS_UNSIGNED;
    public static final BooleanFlagField IS_VALUE_CLASS;
    public static final BooleanFlagField IS_VAR;
    public static final FlagField<ProtoBuf.MemberKind> MEMBER_KIND;
    public static final FlagField<ProtoBuf.Modality> MODALITY;
    public static final BooleanFlagField SUSPEND_TYPE;
    public static final FlagField<ProtoBuf.Visibility> VISIBILITY;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BooleanFlagField extends FlagField<Boolean> {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalStateException("@NotNull method kotlinx/metadata/internal/metadata/deserialization/Flags$BooleanFlagField.get must not return null");
        }

        public BooleanFlagField(int i) {
            super(i, 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.metadata.internal.metadata.deserialization.Flags.FlagField
        @NotNull
        public Boolean get(int i) {
            return Boolean.valueOf(((1 << this.offset) & i) != 0);
        }

        public int invert(int i) {
            return (1 << this.offset) ^ i;
        }

        @Override // kotlinx.metadata.internal.metadata.deserialization.Flags.FlagField
        public int toFlags(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.offset;
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EnumLiteFlagField<E extends Internal.EnumLite> extends FlagField<E> {
        private final E[] values;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlinx/metadata/internal/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }

        public EnumLiteFlagField(int i, E[] eArr) {
            super(i, bitWidth(eArr));
            this.values = eArr;
        }

        private static <E> int bitWidth(@NotNull E[] eArr) {
            if (eArr == null) {
                $$$reportNull$$$0(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            Single$$ExternalSyntheticBUOutline0.m(eArr.getClass(), "Empty enum: ");
            return 0;
        }

        @Override // kotlinx.metadata.internal.metadata.deserialization.Flags.FlagField
        @Nullable
        public E get(int i) {
            int i2 = (1 << this.bitWidth) - 1;
            int i3 = this.offset;
            int i4 = (i & (i2 << i3)) >> i3;
            for (E e : this.values) {
                if (e.getNumber() == i4) {
                    return e;
                }
            }
            return null;
        }

        @Override // kotlinx.metadata.internal.metadata.deserialization.Flags.FlagField
        public int toFlags(E e) {
            return e.getNumber() << this.offset;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class FlagField<E> {
        public final int bitWidth;
        public final int offset;

        private FlagField(int i, int i2) {
            this.offset = i;
            this.bitWidth = i2;
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlinx/metadata/internal/protobuf/Internal$EnumLite;>(Lkotlinx/metadata/internal/metadata/deserialization/Flags$FlagField<*>;[TE;)Lkotlinx/metadata/internal/metadata/deserialization/Flags$FlagField<TE;>; */
        public static FlagField after(FlagField flagField, Internal.EnumLite[] enumLiteArr) {
            return new EnumLiteFlagField(flagField.offset + flagField.bitWidth, enumLiteArr);
        }

        public static BooleanFlagField booleanAfter(FlagField<?> flagField) {
            return new BooleanFlagField(flagField.offset + flagField.bitWidth);
        }

        public static BooleanFlagField booleanFirst() {
            return new BooleanFlagField(0);
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlinx/metadata/internal/protobuf/Internal$EnumLite;>([TE;)Lkotlinx/metadata/internal/metadata/deserialization/Flags$FlagField<TE;>; */
        public static FlagField first(Internal.EnumLite[] enumLiteArr) {
            return new EnumLiteFlagField(0, enumLiteArr);
        }

        public abstract E get(int i);

        public abstract int toFlags(E e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlinx/metadata/internal/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.metadata.internal.metadata.deserialization.Flags.$$$reportNull$$$0(int):void");
    }

    static {
        BooleanFlagField booleanFirst = FlagField.booleanFirst();
        SUSPEND_TYPE = booleanFirst;
        DEFINITELY_NOT_NULL_TYPE = FlagField.booleanAfter(booleanFirst);
        BooleanFlagField booleanFirst2 = FlagField.booleanFirst();
        HAS_ANNOTATIONS = booleanFirst2;
        FlagField<ProtoBuf.Visibility> after = FlagField.after(booleanFirst2, ProtoBuf.Visibility.values());
        VISIBILITY = after;
        FlagField<ProtoBuf.Modality> after2 = FlagField.after(after, ProtoBuf.Modality.values());
        MODALITY = after2;
        FlagField<ProtoBuf.Class.Kind> after3 = FlagField.after(after2, ProtoBuf.Class.Kind.values());
        CLASS_KIND = after3;
        BooleanFlagField booleanAfter = FlagField.booleanAfter(after3);
        IS_INNER = booleanAfter;
        BooleanFlagField booleanAfter2 = FlagField.booleanAfter(booleanAfter);
        IS_DATA = booleanAfter2;
        BooleanFlagField booleanAfter3 = FlagField.booleanAfter(booleanAfter2);
        IS_EXTERNAL_CLASS = booleanAfter3;
        BooleanFlagField booleanAfter4 = FlagField.booleanAfter(booleanAfter3);
        IS_EXPECT_CLASS = booleanAfter4;
        BooleanFlagField booleanAfter5 = FlagField.booleanAfter(booleanAfter4);
        IS_VALUE_CLASS = booleanAfter5;
        IS_FUN_INTERFACE = FlagField.booleanAfter(booleanAfter5);
        BooleanFlagField booleanAfter6 = FlagField.booleanAfter(after);
        IS_SECONDARY = booleanAfter6;
        IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES = FlagField.booleanAfter(booleanAfter6);
        FlagField<ProtoBuf.MemberKind> after4 = FlagField.after(after2, ProtoBuf.MemberKind.values());
        MEMBER_KIND = after4;
        BooleanFlagField booleanAfter7 = FlagField.booleanAfter(after4);
        IS_OPERATOR = booleanAfter7;
        BooleanFlagField booleanAfter8 = FlagField.booleanAfter(booleanAfter7);
        IS_INFIX = booleanAfter8;
        BooleanFlagField booleanAfter9 = FlagField.booleanAfter(booleanAfter8);
        IS_INLINE = booleanAfter9;
        BooleanFlagField booleanAfter10 = FlagField.booleanAfter(booleanAfter9);
        IS_TAILREC = booleanAfter10;
        BooleanFlagField booleanAfter11 = FlagField.booleanAfter(booleanAfter10);
        IS_EXTERNAL_FUNCTION = booleanAfter11;
        BooleanFlagField booleanAfter12 = FlagField.booleanAfter(booleanAfter11);
        IS_SUSPEND = booleanAfter12;
        BooleanFlagField booleanAfter13 = FlagField.booleanAfter(booleanAfter12);
        IS_EXPECT_FUNCTION = booleanAfter13;
        IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES = FlagField.booleanAfter(booleanAfter13);
        BooleanFlagField booleanAfter14 = FlagField.booleanAfter(after4);
        IS_VAR = booleanAfter14;
        BooleanFlagField booleanAfter15 = FlagField.booleanAfter(booleanAfter14);
        HAS_GETTER = booleanAfter15;
        BooleanFlagField booleanAfter16 = FlagField.booleanAfter(booleanAfter15);
        HAS_SETTER = booleanAfter16;
        BooleanFlagField booleanAfter17 = FlagField.booleanAfter(booleanAfter16);
        IS_CONST = booleanAfter17;
        BooleanFlagField booleanAfter18 = FlagField.booleanAfter(booleanAfter17);
        IS_LATEINIT = booleanAfter18;
        BooleanFlagField booleanAfter19 = FlagField.booleanAfter(booleanAfter18);
        HAS_CONSTANT = booleanAfter19;
        BooleanFlagField booleanAfter20 = FlagField.booleanAfter(booleanAfter19);
        IS_EXTERNAL_PROPERTY = booleanAfter20;
        BooleanFlagField booleanAfter21 = FlagField.booleanAfter(booleanAfter20);
        IS_DELEGATED = booleanAfter21;
        IS_EXPECT_PROPERTY = FlagField.booleanAfter(booleanAfter21);
        BooleanFlagField booleanAfter22 = FlagField.booleanAfter(booleanFirst2);
        DECLARES_DEFAULT_VALUE = booleanAfter22;
        BooleanFlagField booleanAfter23 = FlagField.booleanAfter(booleanAfter22);
        IS_CROSSINLINE = booleanAfter23;
        IS_NOINLINE = FlagField.booleanAfter(booleanAfter23);
        BooleanFlagField booleanAfter24 = FlagField.booleanAfter(after2);
        IS_NOT_DEFAULT = booleanAfter24;
        BooleanFlagField booleanAfter25 = FlagField.booleanAfter(booleanAfter24);
        IS_EXTERNAL_ACCESSOR = booleanAfter25;
        IS_INLINE_ACCESSOR = FlagField.booleanAfter(booleanAfter25);
        BooleanFlagField booleanFirst3 = FlagField.booleanFirst();
        IS_NEGATED = booleanFirst3;
        IS_NULL_CHECK_PREDICATE = FlagField.booleanAfter(booleanFirst3);
        IS_UNSIGNED = FlagField.booleanFirst();
    }

    public static int getAccessorFlags(boolean z, @NotNull ProtoBuf.Visibility visibility, @NotNull ProtoBuf.Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            $$$reportNull$$$0(10);
        }
        if (modality == null) {
            $$$reportNull$$$0(11);
        }
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | MODALITY.toFlags(modality) | VISIBILITY.toFlags(visibility) | IS_NOT_DEFAULT.toFlags(Boolean.valueOf(z2)) | IS_EXTERNAL_ACCESSOR.toFlags(Boolean.valueOf(z3)) | IS_INLINE_ACCESSOR.toFlags(Boolean.valueOf(z4));
    }

    public static int getClassFlags(boolean z, @NotNull ProtoBuf.Visibility visibility, @NotNull ProtoBuf.Modality modality, @NotNull ProtoBuf.Class.Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (visibility == null) {
            $$$reportNull$$$0(0);
        }
        if (modality == null) {
            $$$reportNull$$$0(1);
        }
        if (kind == null) {
            $$$reportNull$$$0(2);
        }
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | MODALITY.toFlags(modality) | VISIBILITY.toFlags(visibility) | CLASS_KIND.toFlags(kind) | IS_INNER.toFlags(Boolean.valueOf(z2)) | IS_DATA.toFlags(Boolean.valueOf(z3)) | IS_EXTERNAL_CLASS.toFlags(Boolean.valueOf(z4)) | IS_EXPECT_CLASS.toFlags(Boolean.valueOf(z5)) | IS_VALUE_CLASS.toFlags(Boolean.valueOf(z6)) | IS_FUN_INTERFACE.toFlags(Boolean.valueOf(z7));
    }

    public static int getConstructorFlags(boolean z, @NotNull ProtoBuf.Visibility visibility, boolean z2, boolean z3) {
        if (visibility == null) {
            $$$reportNull$$$0(3);
        }
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | VISIBILITY.toFlags(visibility) | IS_SECONDARY.toFlags(Boolean.valueOf(z2)) | IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.toFlags(Boolean.valueOf(!z3));
    }

    public static int getContractExpressionFlags(boolean z, boolean z2) {
        return IS_NEGATED.toFlags(Boolean.valueOf(z)) | IS_NULL_CHECK_PREDICATE.toFlags(Boolean.valueOf(z2));
    }

    public static int getFunctionFlags(boolean z, @NotNull ProtoBuf.Visibility visibility, @NotNull ProtoBuf.Modality modality, @NotNull ProtoBuf.MemberKind memberKind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        if (visibility == null) {
            $$$reportNull$$$0(4);
        }
        if (modality == null) {
            $$$reportNull$$$0(5);
        }
        if (memberKind == null) {
            $$$reportNull$$$0(6);
        }
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | VISIBILITY.toFlags(visibility) | MODALITY.toFlags(modality) | MEMBER_KIND.toFlags(memberKind) | IS_OPERATOR.toFlags(Boolean.valueOf(z2)) | IS_INFIX.toFlags(Boolean.valueOf(z3)) | IS_INLINE.toFlags(Boolean.valueOf(z4)) | IS_TAILREC.toFlags(Boolean.valueOf(z5)) | IS_EXTERNAL_FUNCTION.toFlags(Boolean.valueOf(z6)) | IS_SUSPEND.toFlags(Boolean.valueOf(z7)) | IS_EXPECT_FUNCTION.toFlags(Boolean.valueOf(z8)) | IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.toFlags(Boolean.valueOf(!z9));
    }

    public static int getPropertyFlags(boolean z, @NotNull ProtoBuf.Visibility visibility, @NotNull ProtoBuf.Modality modality, @NotNull ProtoBuf.MemberKind memberKind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        if (visibility == null) {
            $$$reportNull$$$0(7);
        }
        if (modality == null) {
            $$$reportNull$$$0(8);
        }
        if (memberKind == null) {
            $$$reportNull$$$0(9);
        }
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | VISIBILITY.toFlags(visibility) | MODALITY.toFlags(modality) | MEMBER_KIND.toFlags(memberKind) | IS_VAR.toFlags(Boolean.valueOf(z2)) | HAS_GETTER.toFlags(Boolean.valueOf(z3)) | HAS_SETTER.toFlags(Boolean.valueOf(z4)) | IS_CONST.toFlags(Boolean.valueOf(z6)) | IS_LATEINIT.toFlags(Boolean.valueOf(z7)) | HAS_CONSTANT.toFlags(Boolean.valueOf(z5)) | IS_EXTERNAL_PROPERTY.toFlags(Boolean.valueOf(z8)) | IS_DELEGATED.toFlags(Boolean.valueOf(z9)) | IS_EXPECT_PROPERTY.toFlags(Boolean.valueOf(z10));
    }

    public static int getTypeAliasFlags(boolean z, ProtoBuf.Visibility visibility) {
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | VISIBILITY.toFlags(visibility);
    }

    public static int getTypeFlags(boolean z, boolean z2) {
        return SUSPEND_TYPE.toFlags(Boolean.valueOf(z)) | DEFINITELY_NOT_NULL_TYPE.toFlags(Boolean.valueOf(z2));
    }

    public static int getValueParameterFlags(boolean z, boolean z2, boolean z3, boolean z4) {
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | DECLARES_DEFAULT_VALUE.toFlags(Boolean.valueOf(z2)) | IS_CROSSINLINE.toFlags(Boolean.valueOf(z3)) | IS_NOINLINE.toFlags(Boolean.valueOf(z4));
    }
}
