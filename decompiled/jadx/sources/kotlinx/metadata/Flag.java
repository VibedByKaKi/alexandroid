package kotlinx.metadata;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.metadata.internal.metadata.ProtoBuf;
import kotlinx.metadata.internal.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00132\u00020\u0001:\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u001b\b\u0010\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u000fH\u0086\u0002J\u001e\u0010\u0010\u001a\u00060\u0005j\u0002`\u000f2\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u000fH\u0080\u0002¢\u0006\u0002\b\u0011R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/metadata/Flag;", "", "field", "Lkotlinx/metadata/internal/metadata/deserialization/Flags$FlagField;", "value", "", "(Lorg/jetbrains/kotlin/metadata/deserialization/Flags$FlagField;I)V", "Lkotlinx/metadata/internal/metadata/deserialization/Flags$BooleanFlagField;", "(Lorg/jetbrains/kotlin/metadata/deserialization/Flags$BooleanFlagField;)V", "offset", "bitWidth", "(III)V", "invoke", "", "flags", "Lkotlinx/metadata/Flags;", "plus", "plus$kotlinx_metadata", "Class", "Common", "Constructor", "EffectExpression", "Function", "Property", "PropertyAccessor", "Type", "TypeParameter", "ValueParameter", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class Flag {

    @JvmField
    @NotNull
    public static final Flag HAS_ANNOTATIONS;

    @JvmField
    @NotNull
    public static final Flag IS_ABSTRACT;

    @JvmField
    @NotNull
    public static final Flag IS_FINAL;

    @JvmField
    @NotNull
    public static final Flag IS_INTERNAL;

    @JvmField
    @NotNull
    public static final Flag IS_LOCAL;

    @JvmField
    @NotNull
    public static final Flag IS_OPEN;

    @JvmField
    @NotNull
    public static final Flag IS_PRIVATE;

    @JvmField
    @NotNull
    public static final Flag IS_PRIVATE_TO_THIS;

    @JvmField
    @NotNull
    public static final Flag IS_PROTECTED;

    @JvmField
    @NotNull
    public static final Flag IS_PUBLIC;

    @JvmField
    @NotNull
    public static final Flag IS_SEALED;
    private final int bitWidth;
    private final int offset;
    private final int value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/metadata/Flag$EffectExpression;", "", "()V", "IS_NEGATED", "Lkotlinx/metadata/Flag;", "IS_NULL_CHECK_PREDICATE", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class EffectExpression {

        @NotNull
        public static final EffectExpression INSTANCE = new EffectExpression();

        @JvmField
        @NotNull
        public static final Flag IS_NEGATED;

        @JvmField
        @NotNull
        public static final Flag IS_NULL_CHECK_PREDICATE;

        static {
            Flags.BooleanFlagField booleanFlagField = Flags.IS_NEGATED;
            booleanFlagField.getClass();
            IS_NEGATED = new Flag(booleanFlagField);
            Flags.BooleanFlagField booleanFlagField2 = Flags.IS_NULL_CHECK_PREDICATE;
            booleanFlagField2.getClass();
            IS_NULL_CHECK_PREDICATE = new Flag(booleanFlagField2);
        }

        private EffectExpression() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/metadata/Flag$Function;", "", "()V", "HAS_NON_STABLE_PARAMETER_NAMES", "Lkotlinx/metadata/Flag;", "IS_DECLARATION", "IS_DELEGATION", "IS_EXPECT", "IS_EXTERNAL", "IS_FAKE_OVERRIDE", "IS_INFIX", "IS_INLINE", "IS_OPERATOR", "IS_SUSPEND", "IS_SYNTHESIZED", "IS_TAILREC", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Function {

        @JvmField
        @NotNull
        public static final Flag HAS_NON_STABLE_PARAMETER_NAMES;

        @NotNull
        public static final Function INSTANCE = new Function();

        @JvmField
        @NotNull
        public static final Flag IS_DECLARATION;

        @JvmField
        @NotNull
        public static final Flag IS_DELEGATION;

        @JvmField
        @NotNull
        public static final Flag IS_EXPECT;

        @JvmField
        @NotNull
        public static final Flag IS_EXTERNAL;

        @JvmField
        @NotNull
        public static final Flag IS_FAKE_OVERRIDE;

        @JvmField
        @NotNull
        public static final Flag IS_INFIX;

        @JvmField
        @NotNull
        public static final Flag IS_INLINE;

        @JvmField
        @NotNull
        public static final Flag IS_OPERATOR;

        @JvmField
        @NotNull
        public static final Flag IS_SUSPEND;

        @JvmField
        @NotNull
        public static final Flag IS_SYNTHESIZED;

        @JvmField
        @NotNull
        public static final Flag IS_TAILREC;

        static {
            Flags.FlagField<ProtoBuf.MemberKind> flagField = Flags.MEMBER_KIND;
            flagField.getClass();
            IS_DECLARATION = new Flag(flagField, 0);
            IS_FAKE_OVERRIDE = new Flag(flagField, 1);
            IS_DELEGATION = new Flag(flagField, 2);
            IS_SYNTHESIZED = new Flag(flagField, 3);
            Flags.BooleanFlagField booleanFlagField = Flags.IS_OPERATOR;
            booleanFlagField.getClass();
            IS_OPERATOR = new Flag(booleanFlagField);
            Flags.BooleanFlagField booleanFlagField2 = Flags.IS_INFIX;
            booleanFlagField2.getClass();
            IS_INFIX = new Flag(booleanFlagField2);
            Flags.BooleanFlagField booleanFlagField3 = Flags.IS_INLINE;
            booleanFlagField3.getClass();
            IS_INLINE = new Flag(booleanFlagField3);
            Flags.BooleanFlagField booleanFlagField4 = Flags.IS_TAILREC;
            booleanFlagField4.getClass();
            IS_TAILREC = new Flag(booleanFlagField4);
            Flags.BooleanFlagField booleanFlagField5 = Flags.IS_EXTERNAL_FUNCTION;
            booleanFlagField5.getClass();
            IS_EXTERNAL = new Flag(booleanFlagField5);
            Flags.BooleanFlagField booleanFlagField6 = Flags.IS_SUSPEND;
            booleanFlagField6.getClass();
            IS_SUSPEND = new Flag(booleanFlagField6);
            Flags.BooleanFlagField booleanFlagField7 = Flags.IS_EXPECT_FUNCTION;
            booleanFlagField7.getClass();
            IS_EXPECT = new Flag(booleanFlagField7);
            Flags.BooleanFlagField booleanFlagField8 = Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
            booleanFlagField8.getClass();
            HAS_NON_STABLE_PARAMETER_NAMES = new Flag(booleanFlagField8);
        }

        private Function() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/metadata/Flag$Property;", "", "()V", "HAS_CONSTANT", "Lkotlinx/metadata/Flag;", "HAS_GETTER", "HAS_SETTER", "IS_CONST", "IS_DECLARATION", "IS_DELEGATED", "IS_DELEGATION", "IS_EXPECT", "IS_EXTERNAL", "IS_FAKE_OVERRIDE", "IS_LATEINIT", "IS_SYNTHESIZED", "IS_VAR", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Property {

        @JvmField
        @NotNull
        public static final Flag HAS_CONSTANT;

        @JvmField
        @NotNull
        public static final Flag HAS_GETTER;

        @JvmField
        @NotNull
        public static final Flag HAS_SETTER;

        @NotNull
        public static final Property INSTANCE = new Property();

        @JvmField
        @NotNull
        public static final Flag IS_CONST;

        @JvmField
        @NotNull
        public static final Flag IS_DECLARATION;

        @JvmField
        @NotNull
        public static final Flag IS_DELEGATED;

        @JvmField
        @NotNull
        public static final Flag IS_DELEGATION;

        @JvmField
        @NotNull
        public static final Flag IS_EXPECT;

        @JvmField
        @NotNull
        public static final Flag IS_EXTERNAL;

        @JvmField
        @NotNull
        public static final Flag IS_FAKE_OVERRIDE;

        @JvmField
        @NotNull
        public static final Flag IS_LATEINIT;

        @JvmField
        @NotNull
        public static final Flag IS_SYNTHESIZED;

        @JvmField
        @NotNull
        public static final Flag IS_VAR;

        static {
            Flags.FlagField<ProtoBuf.MemberKind> flagField = Flags.MEMBER_KIND;
            flagField.getClass();
            IS_DECLARATION = new Flag(flagField, 0);
            IS_FAKE_OVERRIDE = new Flag(flagField, 1);
            IS_DELEGATION = new Flag(flagField, 2);
            IS_SYNTHESIZED = new Flag(flagField, 3);
            Flags.BooleanFlagField booleanFlagField = Flags.IS_VAR;
            booleanFlagField.getClass();
            IS_VAR = new Flag(booleanFlagField);
            Flags.BooleanFlagField booleanFlagField2 = Flags.HAS_GETTER;
            booleanFlagField2.getClass();
            HAS_GETTER = new Flag(booleanFlagField2);
            Flags.BooleanFlagField booleanFlagField3 = Flags.HAS_SETTER;
            booleanFlagField3.getClass();
            HAS_SETTER = new Flag(booleanFlagField3);
            Flags.BooleanFlagField booleanFlagField4 = Flags.IS_CONST;
            booleanFlagField4.getClass();
            IS_CONST = new Flag(booleanFlagField4);
            Flags.BooleanFlagField booleanFlagField5 = Flags.IS_LATEINIT;
            booleanFlagField5.getClass();
            IS_LATEINIT = new Flag(booleanFlagField5);
            Flags.BooleanFlagField booleanFlagField6 = Flags.HAS_CONSTANT;
            booleanFlagField6.getClass();
            HAS_CONSTANT = new Flag(booleanFlagField6);
            Flags.BooleanFlagField booleanFlagField7 = Flags.IS_EXTERNAL_PROPERTY;
            booleanFlagField7.getClass();
            IS_EXTERNAL = new Flag(booleanFlagField7);
            Flags.BooleanFlagField booleanFlagField8 = Flags.IS_DELEGATED;
            booleanFlagField8.getClass();
            IS_DELEGATED = new Flag(booleanFlagField8);
            Flags.BooleanFlagField booleanFlagField9 = Flags.IS_EXPECT_PROPERTY;
            booleanFlagField9.getClass();
            IS_EXPECT = new Flag(booleanFlagField9);
        }

        private Property() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/metadata/Flag$PropertyAccessor;", "", "()V", "IS_EXTERNAL", "Lkotlinx/metadata/Flag;", "IS_INLINE", "IS_NOT_DEFAULT", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PropertyAccessor {

        @NotNull
        public static final PropertyAccessor INSTANCE = new PropertyAccessor();

        @JvmField
        @NotNull
        public static final Flag IS_EXTERNAL;

        @JvmField
        @NotNull
        public static final Flag IS_INLINE;

        @JvmField
        @NotNull
        public static final Flag IS_NOT_DEFAULT;

        static {
            Flags.BooleanFlagField booleanFlagField = Flags.IS_NOT_DEFAULT;
            booleanFlagField.getClass();
            IS_NOT_DEFAULT = new Flag(booleanFlagField);
            Flags.BooleanFlagField booleanFlagField2 = Flags.IS_EXTERNAL_ACCESSOR;
            booleanFlagField2.getClass();
            IS_EXTERNAL = new Flag(booleanFlagField2);
            Flags.BooleanFlagField booleanFlagField3 = Flags.IS_INLINE_ACCESSOR;
            booleanFlagField3.getClass();
            IS_INLINE = new Flag(booleanFlagField3);
        }

        private PropertyAccessor() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/metadata/Flag$Type;", "", "()V", "IS_DEFINITELY_NON_NULL", "Lkotlinx/metadata/Flag;", "IS_NULLABLE", "IS_SUSPEND", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Type {

        @JvmField
        @NotNull
        public static final Flag IS_DEFINITELY_NON_NULL;

        @JvmField
        @NotNull
        public static final Flag IS_SUSPEND;

        @NotNull
        public static final Type INSTANCE = new Type();

        @JvmField
        @NotNull
        public static final Flag IS_NULLABLE = new Flag(0, 1, 1);

        static {
            Flags.BooleanFlagField booleanFlagField = Flags.SUSPEND_TYPE;
            IS_SUSPEND = new Flag(booleanFlagField.offset + 1, booleanFlagField.bitWidth, 1);
            Flags.BooleanFlagField booleanFlagField2 = Flags.DEFINITELY_NOT_NULL_TYPE;
            IS_DEFINITELY_NON_NULL = new Flag(booleanFlagField2.offset + 1, booleanFlagField2.bitWidth, 1);
        }

        private Type() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/metadata/Flag$TypeParameter;", "", "()V", "IS_REIFIED", "Lkotlinx/metadata/Flag;", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TypeParameter {

        @NotNull
        public static final TypeParameter INSTANCE = new TypeParameter();

        @JvmField
        @NotNull
        public static final Flag IS_REIFIED = new Flag(0, 1, 1);

        private TypeParameter() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/metadata/Flag$ValueParameter;", "", "()V", "DECLARES_DEFAULT_VALUE", "Lkotlinx/metadata/Flag;", "IS_CROSSINLINE", "IS_NOINLINE", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ValueParameter {

        @JvmField
        @NotNull
        public static final Flag DECLARES_DEFAULT_VALUE;

        @NotNull
        public static final ValueParameter INSTANCE = new ValueParameter();

        @JvmField
        @NotNull
        public static final Flag IS_CROSSINLINE;

        @JvmField
        @NotNull
        public static final Flag IS_NOINLINE;

        static {
            Flags.BooleanFlagField booleanFlagField = Flags.DECLARES_DEFAULT_VALUE;
            booleanFlagField.getClass();
            DECLARES_DEFAULT_VALUE = new Flag(booleanFlagField);
            Flags.BooleanFlagField booleanFlagField2 = Flags.IS_CROSSINLINE;
            booleanFlagField2.getClass();
            IS_CROSSINLINE = new Flag(booleanFlagField2);
            Flags.BooleanFlagField booleanFlagField3 = Flags.IS_NOINLINE;
            booleanFlagField3.getClass();
            IS_NOINLINE = new Flag(booleanFlagField3);
        }

        private ValueParameter() {
        }
    }

    static {
        Flags.BooleanFlagField booleanFlagField = Flags.HAS_ANNOTATIONS;
        booleanFlagField.getClass();
        HAS_ANNOTATIONS = new Flag(booleanFlagField);
        Flags.FlagField<ProtoBuf.Visibility> flagField = Flags.VISIBILITY;
        flagField.getClass();
        IS_INTERNAL = new Flag(flagField, 0);
        flagField.getClass();
        IS_PRIVATE = new Flag(flagField, 1);
        flagField.getClass();
        IS_PROTECTED = new Flag(flagField, 2);
        flagField.getClass();
        IS_PUBLIC = new Flag(flagField, 3);
        flagField.getClass();
        IS_PRIVATE_TO_THIS = new Flag(flagField, 4);
        flagField.getClass();
        IS_LOCAL = new Flag(flagField, 5);
        Flags.FlagField<ProtoBuf.Modality> flagField2 = Flags.MODALITY;
        flagField2.getClass();
        IS_FINAL = new Flag(flagField2, 0);
        flagField2.getClass();
        IS_OPEN = new Flag(flagField2, 1);
        flagField2.getClass();
        IS_ABSTRACT = new Flag(flagField2, 2);
        flagField2.getClass();
        IS_SEALED = new Flag(flagField2, 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Flag(@NotNull Flags.FlagField<?> flagField, int i) {
        this(flagField.offset, flagField.bitWidth, i);
        flagField.getClass();
    }

    public final boolean invoke(int flags) {
        return ((flags >>> this.offset) & ((1 << this.bitWidth) - 1)) == this.value;
    }

    public final int plus$kotlinx_metadata(int flags) {
        int i = (1 << this.bitWidth) - 1;
        int i2 = this.offset;
        return (flags & (~(i << i2))) + (this.value << i2);
    }

    public Flag(int i, int i2, int i3) {
        this.offset = i;
        this.bitWidth = i2;
        this.value = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Flag(@NotNull Flags.BooleanFlagField booleanFlagField) {
        this(booleanFlagField, 1);
        booleanFlagField.getClass();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0010\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/metadata/Flag$Class;", "", "()V", "IS_ANNOTATION_CLASS", "Lkotlinx/metadata/Flag;", "IS_CLASS", "IS_COMPANION_OBJECT", "IS_DATA", "IS_ENUM_CLASS", "IS_ENUM_ENTRY", "IS_EXPECT", "IS_EXTERNAL", "IS_FUN", "IS_INLINE", "getIS_INLINE$annotations", "IS_INNER", "IS_INTERFACE", "IS_OBJECT", "IS_VALUE", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Class {

        @NotNull
        public static final Class INSTANCE = new Class();

        @JvmField
        @NotNull
        public static final Flag IS_ANNOTATION_CLASS;

        @JvmField
        @NotNull
        public static final Flag IS_CLASS;

        @JvmField
        @NotNull
        public static final Flag IS_COMPANION_OBJECT;

        @JvmField
        @NotNull
        public static final Flag IS_DATA;

        @JvmField
        @NotNull
        public static final Flag IS_ENUM_CLASS;

        @JvmField
        @NotNull
        public static final Flag IS_ENUM_ENTRY;

        @JvmField
        @NotNull
        public static final Flag IS_EXPECT;

        @JvmField
        @NotNull
        public static final Flag IS_EXTERNAL;

        @JvmField
        @NotNull
        public static final Flag IS_FUN;

        @JvmField
        @NotNull
        public static final Flag IS_INLINE;

        @JvmField
        @NotNull
        public static final Flag IS_INNER;

        @JvmField
        @NotNull
        public static final Flag IS_INTERFACE;

        @JvmField
        @NotNull
        public static final Flag IS_OBJECT;

        @JvmField
        @NotNull
        public static final Flag IS_VALUE;

        static {
            Flags.FlagField<ProtoBuf.Class.Kind> flagField = Flags.CLASS_KIND;
            flagField.getClass();
            IS_CLASS = new Flag(flagField, 0);
            IS_INTERFACE = new Flag(flagField, 1);
            IS_ENUM_CLASS = new Flag(flagField, 2);
            IS_ENUM_ENTRY = new Flag(flagField, 3);
            IS_ANNOTATION_CLASS = new Flag(flagField, 4);
            IS_OBJECT = new Flag(flagField, 5);
            IS_COMPANION_OBJECT = new Flag(flagField, 6);
            Flags.BooleanFlagField booleanFlagField = Flags.IS_INNER;
            booleanFlagField.getClass();
            IS_INNER = new Flag(booleanFlagField);
            Flags.BooleanFlagField booleanFlagField2 = Flags.IS_DATA;
            booleanFlagField2.getClass();
            IS_DATA = new Flag(booleanFlagField2);
            Flags.BooleanFlagField booleanFlagField3 = Flags.IS_EXTERNAL_CLASS;
            booleanFlagField3.getClass();
            IS_EXTERNAL = new Flag(booleanFlagField3);
            Flags.BooleanFlagField booleanFlagField4 = Flags.IS_EXPECT_CLASS;
            booleanFlagField4.getClass();
            IS_EXPECT = new Flag(booleanFlagField4);
            Flags.BooleanFlagField booleanFlagField5 = Flags.IS_VALUE_CLASS;
            booleanFlagField5.getClass();
            IS_INLINE = new Flag(booleanFlagField5);
            IS_VALUE = new Flag(booleanFlagField5);
            Flags.BooleanFlagField booleanFlagField6 = Flags.IS_FUN_INTERFACE;
            booleanFlagField6.getClass();
            IS_FUN = new Flag(booleanFlagField6);
        }

        private Class() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Use IS_VALUE instead, which returns true if the class is either a pre-1.5 inline class, or a 1.5+ value class.")
        public static /* synthetic */ void getIS_INLINE$annotations() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/metadata/Flag$Constructor;", "", "()V", "HAS_NON_STABLE_PARAMETER_NAMES", "Lkotlinx/metadata/Flag;", "IS_PRIMARY", "getIS_PRIMARY$annotations", "IS_SECONDARY", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Constructor {

        @JvmField
        @NotNull
        public static final Flag HAS_NON_STABLE_PARAMETER_NAMES;

        @NotNull
        public static final Constructor INSTANCE = new Constructor();

        @JvmField
        @NotNull
        public static final Flag IS_PRIMARY;

        @JvmField
        @NotNull
        public static final Flag IS_SECONDARY;

        static {
            Flags.BooleanFlagField booleanFlagField = Flags.IS_SECONDARY;
            booleanFlagField.getClass();
            IS_PRIMARY = new Flag(booleanFlagField, 0);
            IS_SECONDARY = new Flag(booleanFlagField);
            Flags.BooleanFlagField booleanFlagField2 = Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
            booleanFlagField2.getClass();
            HAS_NON_STABLE_PARAMETER_NAMES = new Flag(booleanFlagField2);
        }

        private Constructor() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Use IS_SECONDARY which holds inverted value instead.")
        public static /* synthetic */ void getIS_PRIMARY$annotations() {
        }
    }
}
