package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SourceDebugExtension({"SMAP\nSpecialNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialNames.kt\norg/jetbrains/kotlin/name/SpecialNames\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes10.dex */
public final class SpecialNames {

    @JvmField
    @NotNull
    public static final Name ANONYMOUS;

    @JvmField
    @NotNull
    public static final FqName ANONYMOUS_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name ARRAY;

    @JvmField
    @NotNull
    public static final Name DEFAULT_NAME_FOR_COMPANION_OBJECT;

    @JvmField
    @NotNull
    public static final Name DESTRUCT;

    @JvmField
    @NotNull
    public static final Name ENUM_GET_ENTRIES;

    @JvmField
    @NotNull
    public static final Name IMPLICIT_SET_PARAMETER;

    @JvmField
    @NotNull
    public static final Name INIT;

    @NotNull
    public static final SpecialNames INSTANCE = new SpecialNames();

    @JvmField
    @NotNull
    public static final Name ITERATOR;

    @JvmField
    @NotNull
    public static final Name LOCAL;

    @JvmField
    @NotNull
    public static final Name NO_NAME_PROVIDED;

    @JvmField
    @NotNull
    public static final Name RECEIVER;

    @JvmField
    @NotNull
    public static final Name ROOT_PACKAGE;

    @JvmField
    @NotNull
    public static final Name SAFE_IDENTIFIER_FOR_NO_NAME;

    @JvmField
    @NotNull
    public static final Name THIS;

    @JvmField
    @NotNull
    public static final Name UNARY;

    @JvmField
    @NotNull
    public static final Name UNDERSCORE_FOR_UNUSED_VAR;

    static {
        Name special = Name.special("<no name provided>");
        special.getClass();
        NO_NAME_PROVIDED = special;
        Name special2 = Name.special("<root package>");
        special2.getClass();
        ROOT_PACKAGE = special2;
        Name identifier = Name.identifier("Companion");
        identifier.getClass();
        DEFAULT_NAME_FOR_COMPANION_OBJECT = identifier;
        Name identifier2 = Name.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        identifier2.getClass();
        SAFE_IDENTIFIER_FOR_NO_NAME = identifier2;
        Name special3 = Name.special("<anonymous>");
        special3.getClass();
        ANONYMOUS = special3;
        FqName.Companion companion = FqName.Companion;
        Name special4 = Name.special("<anonymous>");
        special4.getClass();
        ANONYMOUS_FQ_NAME = companion.topLevel(special4);
        Name special5 = Name.special("<unary>");
        special5.getClass();
        UNARY = special5;
        Name special6 = Name.special("<this>");
        special6.getClass();
        THIS = special6;
        Name special7 = Name.special("<init>");
        special7.getClass();
        INIT = special7;
        Name special8 = Name.special("<iterator>");
        special8.getClass();
        ITERATOR = special8;
        Name special9 = Name.special("<destruct>");
        special9.getClass();
        DESTRUCT = special9;
        Name special10 = Name.special("<local>");
        special10.getClass();
        LOCAL = special10;
        Name special11 = Name.special("<unused var>");
        special11.getClass();
        UNDERSCORE_FOR_UNUSED_VAR = special11;
        Name special12 = Name.special("<set-?>");
        special12.getClass();
        IMPLICIT_SET_PARAMETER = special12;
        Name special13 = Name.special("<array>");
        special13.getClass();
        ARRAY = special13;
        Name special14 = Name.special("<receiver>");
        special14.getClass();
        RECEIVER = special14;
        Name special15 = Name.special("<get-entries>");
        special15.getClass();
        ENUM_GET_ENTRIES = special15;
    }

    private SpecialNames() {
    }

    @JvmStatic
    @NotNull
    public static final Name safeIdentifier(@Nullable Name name) {
        return (name == null || name.isSpecial()) ? SAFE_IDENTIFIER_FOR_NO_NAME : name;
    }

    public final boolean isSafeIdentifier(@NotNull Name name) {
        name.getClass();
        String asString = name.asString();
        asString.getClass();
        return asString.length() > 0 && !name.isSpecial();
    }
}
