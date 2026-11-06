package kotlin.reflect.jvm.internal.impl.builtins;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.mobilytics.configuration.KinesisEndpoint;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import okio.JvmSystemFileSystem$$ExternalSyntheticOutline2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class StandardNames {

    @JvmField
    @NotNull
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name BACKING_FIELD;

    @JvmField
    @NotNull
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;

    @JvmField
    @NotNull
    public static final Name BUILT_INS_PACKAGE_NAME;

    @JvmField
    @NotNull
    public static final Name CHAR_CODE;

    @JvmField
    @NotNull
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName CONCURRENT_ATOMICS_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName CONCURRENT_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;

    @JvmField
    @NotNull
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final String DATA_CLASS_COMPONENT_PREFIX;

    @JvmField
    @NotNull
    public static final Name DATA_CLASS_COPY;

    @JvmField
    @NotNull
    public static final Name DEFAULT_VALUE_PARAMETER;

    @JvmField
    @NotNull
    public static final FqName DYNAMIC_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name ENUM_ENTRIES;

    @JvmField
    @NotNull
    public static final Name ENUM_VALUES;

    @JvmField
    @NotNull
    public static final Name ENUM_VALUE_OF;

    @JvmField
    @NotNull
    public static final Name EQUALS_NAME;

    @JvmField
    @NotNull
    public static final Name HASHCODE_NAME;

    @JvmField
    @NotNull
    public static final Name IMPLICIT_LAMBDA_PARAMETER_NAME;

    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();

    @JvmField
    @NotNull
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName KOTLIN_REFLECT_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name MAIN;

    @JvmField
    @NotNull
    public static final Name NAME;

    @JvmField
    @NotNull
    public static final Name NEXT_CHAR;

    @NotNull
    private static final FqName NON_EXISTENT_CLASS;

    @JvmField
    @NotNull
    public static final List<String> PREFIXES;

    @JvmField
    @NotNull
    public static final FqName RANGES_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName RESULT_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name TO_STRING_NAME;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SourceDebugExtension({"SMAP\nStandardNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,330:1\n11563#2,3:331\n11563#2,3:334\n*S KotlinDebug\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n*L\n218#1:331,3\n222#1:334,3\n*E\n"})
    public static final class FqNames {

        @NotNull
        public static final FqNames INSTANCE;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _boolean;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _byte;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _char;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _double;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _enum;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _float;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _int;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _long;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _short;

        @JvmField
        @NotNull
        public static final FqName accessibleLateinitPropertyLiteral;

        @JvmField
        @NotNull
        public static final FqName annotation;

        @JvmField
        @NotNull
        public static final FqName annotationRetention;

        @JvmField
        @NotNull
        public static final FqName annotationTarget;

        @JvmField
        @NotNull
        public static final FqNameUnsafe any;

        @JvmField
        @NotNull
        public static final FqNameUnsafe array;

        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;

        @JvmField
        @NotNull
        public static final FqName atomicArray;

        @JvmField
        @NotNull
        public static final FqName atomicBoolean;

        @JvmField
        @NotNull
        public static final FqName atomicInt;

        @JvmField
        @NotNull
        public static final FqName atomicIntArray;

        @JvmField
        @NotNull
        public static final FqName atomicLong;

        @JvmField
        @NotNull
        public static final FqName atomicLongArray;

        @JvmField
        @NotNull
        public static final FqName atomicReference;

        @JvmField
        @NotNull
        public static final FqNameUnsafe charSequence;

        @JvmField
        @NotNull
        public static final FqNameUnsafe cloneable;

        @JvmField
        @NotNull
        public static final FqName collection;

        @JvmField
        @NotNull
        public static final FqName comparable;

        @JvmField
        @NotNull
        public static final FqName contextFunctionTypeParams;

        @JvmField
        @NotNull
        public static final FqName deprecated;

        @JvmField
        @NotNull
        public static final FqName deprecatedSinceKotlin;

        @JvmField
        @NotNull
        public static final FqName deprecationLevel;

        @JvmField
        @NotNull
        public static final FqName extensionFunctionType;

        @JvmField
        @NotNull
        public static final FqNameUnsafe findAssociatedObject;

        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;

        @JvmField
        @NotNull
        public static final FqNameUnsafe functionSupertype;

        @JvmField
        @NotNull
        public static final FqNameUnsafe intRange;

        @JvmField
        @NotNull
        public static final FqName iterable;

        @JvmField
        @NotNull
        public static final FqName iterator;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kCallable;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kClass;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kDeclarationContainer;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty0;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty1;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty2;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutablePropertyFqName;

        @JvmField
        @NotNull
        public static final ClassId kProperty;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty0;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty1;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty2;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kPropertyFqName;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kType;

        @JvmField
        @NotNull
        public static final FqName list;

        @JvmField
        @NotNull
        public static final FqName listIterator;

        @JvmField
        @NotNull
        public static final FqNameUnsafe longRange;

        @JvmField
        @NotNull
        public static final FqName map;

        @JvmField
        @NotNull
        public static final FqName mapEntry;

        @JvmField
        @NotNull
        public static final FqName mustBeDocumented;

        @JvmField
        @NotNull
        public static final FqName mutableCollection;

        @JvmField
        @NotNull
        public static final FqName mutableIterable;

        @JvmField
        @NotNull
        public static final FqName mutableIterator;

        @JvmField
        @NotNull
        public static final FqName mutableList;

        @JvmField
        @NotNull
        public static final FqName mutableListIterator;

        @JvmField
        @NotNull
        public static final FqName mutableMap;

        @JvmField
        @NotNull
        public static final FqName mutableMapEntry;

        @JvmField
        @NotNull
        public static final FqName mutableSet;

        @JvmField
        @NotNull
        public static final FqNameUnsafe nothing;

        @JvmField
        @NotNull
        public static final FqNameUnsafe number;

        @JvmField
        @NotNull
        public static final FqName parameterName;

        @JvmField
        @NotNull
        public static final ClassId parameterNameClassId;

        @JvmField
        @NotNull
        public static final FqName platformDependent;

        @JvmField
        @NotNull
        public static final ClassId platformDependentClassId;

        @JvmField
        @NotNull
        public static final Set<Name> primitiveArrayTypeShortNames;

        @JvmField
        @NotNull
        public static final Set<Name> primitiveTypeShortNames;

        @JvmField
        @NotNull
        public static final FqName publishedApi;

        @JvmField
        @NotNull
        public static final FqName repeatable;

        @JvmField
        @NotNull
        public static final ClassId repeatableClassId;

        @JvmField
        @NotNull
        public static final FqName replaceWith;

        @JvmField
        @NotNull
        public static final FqName retention;

        @JvmField
        @NotNull
        public static final ClassId retentionClassId;

        @JvmField
        @NotNull
        public static final FqName set;

        @JvmField
        @NotNull
        public static final FqNameUnsafe string;

        @JvmField
        @NotNull
        public static final FqName suppress;

        @JvmField
        @NotNull
        public static final FqName target;

        @JvmField
        @NotNull
        public static final ClassId targetClassId;

        @JvmField
        @NotNull
        public static final FqName throwable;

        @JvmField
        @NotNull
        public static final ClassId uByte;

        @JvmField
        @NotNull
        public static final FqName uByteArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uByteFqName;

        @JvmField
        @NotNull
        public static final ClassId uInt;

        @JvmField
        @NotNull
        public static final FqName uIntArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uIntFqName;

        @JvmField
        @NotNull
        public static final ClassId uLong;

        @JvmField
        @NotNull
        public static final FqName uLongArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uLongFqName;

        @JvmField
        @NotNull
        public static final ClassId uShort;

        @JvmField
        @NotNull
        public static final FqName uShortArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uShortFqName;

        @JvmField
        @NotNull
        public static final FqNameUnsafe unit;

        @JvmField
        @NotNull
        public static final FqName unsafeVariance;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.fqNameUnsafe(KinesisEndpoint.AppState.ANY);
            nothing = fqNames.fqNameUnsafe("Nothing");
            cloneable = fqNames.fqNameUnsafe("Cloneable");
            suppress = fqNames.fqName("Suppress");
            unit = fqNames.fqNameUnsafe("Unit");
            charSequence = fqNames.fqNameUnsafe("CharSequence");
            string = fqNames.fqNameUnsafe("String");
            array = fqNames.fqNameUnsafe("Array");
            _boolean = fqNames.fqNameUnsafe("Boolean");
            _char = fqNames.fqNameUnsafe("Char");
            _byte = fqNames.fqNameUnsafe("Byte");
            _short = fqNames.fqNameUnsafe("Short");
            _int = fqNames.fqNameUnsafe("Int");
            _long = fqNames.fqNameUnsafe("Long");
            _float = fqNames.fqNameUnsafe("Float");
            _double = fqNames.fqNameUnsafe("Double");
            number = fqNames.fqNameUnsafe("Number");
            _enum = fqNames.fqNameUnsafe("Enum");
            functionSupertype = fqNames.fqNameUnsafe("Function");
            throwable = fqNames.fqName("Throwable");
            comparable = fqNames.fqName("Comparable");
            intRange = fqNames.rangesFqName("IntRange");
            longRange = fqNames.rangesFqName("LongRange");
            deprecated = fqNames.fqName("Deprecated");
            deprecatedSinceKotlin = fqNames.fqName("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.fqName("DeprecationLevel");
            replaceWith = fqNames.fqName("ReplaceWith");
            extensionFunctionType = fqNames.fqName("ExtensionFunctionType");
            contextFunctionTypeParams = fqNames.fqName("ContextFunctionTypeParams");
            FqName fqName = fqNames.fqName("ParameterName");
            parameterName = fqName;
            ClassId.Companion companion = ClassId.Companion;
            parameterNameClassId = companion.topLevel(fqName);
            annotation = fqNames.fqName("Annotation");
            FqName annotationName = fqNames.annotationName("Target");
            target = annotationName;
            targetClassId = companion.topLevel(annotationName);
            annotationTarget = fqNames.annotationName("AnnotationTarget");
            annotationRetention = fqNames.annotationName("AnnotationRetention");
            FqName annotationName2 = fqNames.annotationName("Retention");
            retention = annotationName2;
            retentionClassId = companion.topLevel(annotationName2);
            FqName annotationName3 = fqNames.annotationName("Repeatable");
            repeatable = annotationName3;
            repeatableClassId = companion.topLevel(annotationName3);
            mustBeDocumented = fqNames.annotationName("MustBeDocumented");
            unsafeVariance = fqNames.fqName("UnsafeVariance");
            publishedApi = fqNames.fqName("PublishedApi");
            accessibleLateinitPropertyLiteral = fqNames.internalName("AccessibleLateinitPropertyLiteral");
            FqName fqName2 = new FqName("kotlin.internal.PlatformDependent");
            platformDependent = fqName2;
            platformDependentClassId = companion.topLevel(fqName2);
            iterator = fqNames.collectionsFqName("Iterator");
            iterable = fqNames.collectionsFqName("Iterable");
            collection = fqNames.collectionsFqName("Collection");
            list = fqNames.collectionsFqName("List");
            listIterator = fqNames.collectionsFqName("ListIterator");
            set = fqNames.collectionsFqName("Set");
            FqName collectionsFqName = fqNames.collectionsFqName("Map");
            map = collectionsFqName;
            mapEntry = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("Entry", collectionsFqName);
            mutableIterator = fqNames.collectionsFqName("MutableIterator");
            mutableIterable = fqNames.collectionsFqName("MutableIterable");
            mutableCollection = fqNames.collectionsFqName("MutableCollection");
            mutableList = fqNames.collectionsFqName("MutableList");
            mutableListIterator = fqNames.collectionsFqName("MutableListIterator");
            mutableSet = fqNames.collectionsFqName("MutableSet");
            FqName collectionsFqName2 = fqNames.collectionsFqName("MutableMap");
            mutableMap = collectionsFqName2;
            mutableMapEntry = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("MutableEntry", collectionsFqName2);
            kClass = reflect("KClass");
            kType = reflect("KType");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe reflect = reflect("KProperty");
            kPropertyFqName = reflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            kProperty = companion.topLevel(reflect.toSafe());
            kDeclarationContainer = reflect("KDeclarationContainer");
            findAssociatedObject = reflect("findAssociatedObject");
            FqName fqName3 = fqNames.fqName("UByte");
            uByteFqName = fqName3;
            FqName fqName4 = fqNames.fqName("UShort");
            uShortFqName = fqName4;
            FqName fqName5 = fqNames.fqName("UInt");
            uIntFqName = fqName5;
            FqName fqName6 = fqNames.fqName("ULong");
            uLongFqName = fqName6;
            uByte = companion.topLevel(fqName3);
            uShort = companion.topLevel(fqName4);
            uInt = companion.topLevel(fqName5);
            uLong = companion.topLevel(fqName6);
            uByteArrayFqName = fqNames.fqName("UByteArray");
            uShortArrayFqName = fqNames.fqName("UShortArray");
            uIntArrayFqName = fqNames.fqName("UIntArray");
            uLongArrayFqName = fqNames.fqName("ULongArray");
            atomicInt = fqNames.concurrentAtomics("AtomicInt");
            atomicLong = fqNames.concurrentAtomics("AtomicLong");
            atomicBoolean = fqNames.concurrentAtomics("AtomicBoolean");
            atomicReference = fqNames.concurrentAtomics("AtomicReference");
            atomicIntArray = fqNames.concurrentAtomics("AtomicIntArray");
            atomicLongArray = fqNames.concurrentAtomics("AtomicLongArray");
            atomicArray = fqNames.concurrentAtomics("AtomicArray");
            HashSet newHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                newHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = newHashSetWithExpectedSize;
            HashSet newHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                newHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = newHashSetWithExpectedSize2;
            HashMap newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String asString = primitiveType3.getTypeName().asString();
                asString.getClass();
                newHashMapWithExpectedSize.put(fqNames2.fqNameUnsafe(asString), primitiveType3);
            }
            fqNameToPrimitiveType = newHashMapWithExpectedSize;
            HashMap newHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = INSTANCE;
                String asString2 = primitiveType4.getArrayTypeName().asString();
                asString2.getClass();
                newHashMapWithExpectedSize2.put(fqNames3.fqNameUnsafe(asString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = newHashMapWithExpectedSize2;
        }

        private FqNames() {
        }

        private final FqName annotationName(String str) {
            return JvmSystemFileSystem$$ExternalSyntheticOutline2.m(str, StandardNames.ANNOTATION_PACKAGE_FQ_NAME);
        }

        private final FqName collectionsFqName(String str) {
            return JvmSystemFileSystem$$ExternalSyntheticOutline2.m(str, StandardNames.COLLECTIONS_PACKAGE_FQ_NAME);
        }

        private final FqName concurrentAtomics(String str) {
            return JvmSystemFileSystem$$ExternalSyntheticOutline2.m(str, StandardNames.CONCURRENT_ATOMICS_PACKAGE_FQ_NAME);
        }

        private final FqName fqName(String str) {
            return JvmSystemFileSystem$$ExternalSyntheticOutline2.m(str, StandardNames.BUILT_INS_PACKAGE_FQ_NAME);
        }

        private final FqNameUnsafe fqNameUnsafe(String str) {
            return fqName(str).toUnsafe();
        }

        private final FqName internalName(String str) {
            return JvmSystemFileSystem$$ExternalSyntheticOutline2.m(str, StandardNames.KOTLIN_INTERNAL_FQ_NAME);
        }

        private final FqNameUnsafe rangesFqName(String str) {
            FqName fqName = StandardNames.RANGES_PACKAGE_FQ_NAME;
            Name identifier = Name.identifier(str);
            identifier.getClass();
            return fqName.child(identifier).toUnsafe();
        }

        @JvmStatic
        @NotNull
        public static final FqNameUnsafe reflect(@NotNull String str) {
            str.getClass();
            FqName fqName = StandardNames.KOTLIN_REFLECT_FQ_NAME;
            Name identifier = Name.identifier(str);
            identifier.getClass();
            return fqName.child(identifier).toUnsafe();
        }
    }

    static {
        Name identifier = Name.identifier("field");
        identifier.getClass();
        BACKING_FIELD = identifier;
        Name identifier2 = Name.identifier("value");
        identifier2.getClass();
        DEFAULT_VALUE_PARAMETER = identifier2;
        Name identifier3 = Name.identifier("values");
        identifier3.getClass();
        ENUM_VALUES = identifier3;
        Name identifier4 = Name.identifier("entries");
        identifier4.getClass();
        ENUM_ENTRIES = identifier4;
        Name identifier5 = Name.identifier("valueOf");
        identifier5.getClass();
        ENUM_VALUE_OF = identifier5;
        Name identifier6 = Name.identifier("copy");
        identifier6.getClass();
        DATA_CLASS_COPY = identifier6;
        DATA_CLASS_COMPONENT_PREFIX = JsonFields.COMPONENT;
        Name identifier7 = Name.identifier("hashCode");
        identifier7.getClass();
        HASHCODE_NAME = identifier7;
        Name identifier8 = Name.identifier("toString");
        identifier8.getClass();
        TO_STRING_NAME = identifier8;
        Name identifier9 = Name.identifier("equals");
        identifier9.getClass();
        EQUALS_NAME = identifier9;
        Name identifier10 = Name.identifier("code");
        identifier10.getClass();
        CHAR_CODE = identifier10;
        Name identifier11 = Name.identifier("name");
        identifier11.getClass();
        NAME = identifier11;
        Name identifier12 = Name.identifier("main");
        identifier12.getClass();
        MAIN = identifier12;
        Name identifier13 = Name.identifier("nextChar");
        identifier13.getClass();
        NEXT_CHAR = identifier13;
        Name identifier14 = Name.identifier("it");
        identifier14.getClass();
        IMPLICIT_LAMBDA_PARAMETER_NAME = identifier14;
        Name identifier15 = Name.identifier("count");
        identifier15.getClass();
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = identifier15;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        CONTINUATION_INTERFACE_FQ_NAME = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("Continuation", fqName);
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = kotlin.collections.CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name identifier16 = Name.identifier("kotlin");
        identifier16.getClass();
        BUILT_INS_PACKAGE_NAME = identifier16;
        FqName fqName3 = FqName.Companion.topLevel(identifier16);
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName m = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("annotation", fqName3);
        ANNOTATION_PACKAGE_FQ_NAME = m;
        FqName m2 = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("collections", fqName3);
        COLLECTIONS_PACKAGE_FQ_NAME = m2;
        FqName m3 = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("ranges", fqName3);
        RANGES_PACKAGE_FQ_NAME = m3;
        TEXT_PACKAGE_FQ_NAME = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("text", fqName3);
        FqName m4 = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("internal", fqName3);
        KOTLIN_INTERNAL_FQ_NAME = m4;
        FqName m5 = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("concurrent", fqName3);
        CONCURRENT_PACKAGE_FQ_NAME = m5;
        FqName m6 = JvmSystemFileSystem$$ExternalSyntheticOutline2.m("atomics", m5);
        CONCURRENT_ATOMICS_PACKAGE_FQ_NAME = m6;
        NON_EXISTENT_CLASS = new FqName("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = SetsKt.setOf((Object[]) new FqName[]{fqName3, m2, m3, m, fqName2, m4, fqName, m6});
    }

    private StandardNames() {
    }

    @JvmStatic
    @NotNull
    public static final ClassId getFunctionClassId(int i) {
        FqName fqName = BUILT_INS_PACKAGE_FQ_NAME;
        Name identifier = Name.identifier(getFunctionName(i));
        identifier.getClass();
        return new ClassId(fqName, identifier);
    }

    @JvmStatic
    @NotNull
    public static final String getFunctionName(int i) {
        return a$$ExternalSyntheticOutline0.m(i, "Function");
    }

    @JvmStatic
    @NotNull
    public static final FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType) {
        primitiveType.getClass();
        return BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
    }

    @JvmStatic
    @NotNull
    public static final String getSuspendFunctionName(int i) {
        return FunctionTypeKind.SuspendFunction.INSTANCE.getClassNamePrefix() + i;
    }

    @JvmStatic
    public static final boolean isPrimitiveArray(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return FqNames.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe) != null;
    }
}
