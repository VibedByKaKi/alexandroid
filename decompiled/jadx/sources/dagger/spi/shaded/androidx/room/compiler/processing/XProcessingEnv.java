package dagger.spi.shaded.androidx.room.compiler.processing;

import com.google.devtools.ksp.processing.CodeGenerator;
import com.google.devtools.ksp.processing.KSPLogger;
import com.google.devtools.ksp.processing.Resolver;
import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.kotlinpoet.ClassName;
import dagger.spi.shaded.androidx.room.compiler.codegen.XTypeName;
import dagger.spi.shaded.androidx.room.compiler.processing.javac.JavacProcessingEnv;
import dagger.spi.shaded.androidx.room.compiler.processing.ksp.KspProcessingEnv;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.ProcessingEnvironment;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.reflect.KClass;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalProcessingApi
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\bg\u0018\u0000 62\u00020\u0001:\u000256J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u0018H&J\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\u0018H&J\u0016\u0010$\u001a\u0004\u0018\u00010\u001c2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020'H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eH&J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 H\u0016J)\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001c2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0+\"\u00020\u001eH&¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0.2\u0006\u0010/\u001a\u00020\u0018H&J \u00100\u001a\u00020\u001e2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001eH&J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020'H\u0016J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0014\u00103\u001a\u00020\u001e2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0016J\u0010\u00104\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020'H\u0016J\u0010\u00104\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u00104\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0014\u00104\u001a\u00020\u001c2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnv;", "", "backend", "Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnv$Backend;", "getBackend", "()Landroidx/room/compiler/processing/XProcessingEnv$Backend;", "config", "Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnvConfig;", "getConfig", "()Landroidx/room/compiler/processing/XProcessingEnvConfig;", "filer", "Ldagger/spi/shaded/androidx/room/compiler/processing/XFiler;", "getFiler", "()Landroidx/room/compiler/processing/XFiler;", "jvmVersion", "", "getJvmVersion", "()I", "messager", "Ldagger/spi/shaded/androidx/room/compiler/processing/XMessager;", "getMessager", "()Landroidx/room/compiler/processing/XMessager;", "options", "", "", "getOptions", "()Ljava/util/Map;", "findGeneratedAnnotation", "Ldagger/spi/shaded/androidx/room/compiler/processing/XTypeElement;", "findType", "Ldagger/spi/shaded/androidx/room/compiler/processing/XType;", "typeName", "Lcom/squareup/javapoet/TypeName;", "qName", "klass", "Lkotlin/reflect/KClass;", "findTypeElement", "getArrayType", "Ldagger/spi/shaded/androidx/room/compiler/processing/XArrayType;", "Ldagger/spi/shaded/androidx/room/compiler/codegen/XTypeName;", "type", "getDeclaredType", "types", "", "(Landroidx/room/compiler/processing/XTypeElement;[Landroidx/room/compiler/processing/XType;)Landroidx/room/compiler/processing/XType;", "getTypeElementsFromPackage", "", "packageName", "getWildcardType", "consumerSuper", "producerExtends", "requireType", "requireTypeElement", "Backend", "Companion", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XProcessingEnv {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnv$Backend;", "", "(Ljava/lang/String;I)V", "JAVAC", "KSP", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Backend {
        JAVAC,
        KSP
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Backend.values().length];
            try {
                iArr[Backend.JAVAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Backend.KSP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[XNullability.values().length];
            try {
                iArr2[XNullability.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[XNullability.NONNULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[XNullability.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static XProcessingEnv create(@NotNull Map<String, String> map, @NotNull Resolver resolver, @NotNull CodeGenerator codeGenerator, @NotNull KSPLogger kSPLogger, @NotNull XProcessingEnvConfig xProcessingEnvConfig) {
        return INSTANCE.create(map, resolver, codeGenerator, kSPLogger, xProcessingEnvConfig);
    }

    static /* synthetic */ XType getWildcardType$default(XProcessingEnv xProcessingEnv, XType xType, XType xType2, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: getWildcardType");
            return null;
        }
        if ((i & 1) != 0) {
            xType = null;
        }
        if ((i & 2) != 0) {
            xType2 = null;
        }
        return xProcessingEnv.getWildcardType(xType, xType2);
    }

    @Nullable
    XTypeElement findGeneratedAnnotation();

    @Nullable
    default XType findType(@NotNull TypeName typeName) {
        typeName.getClass();
        if (!(typeName instanceof ArrayTypeName)) {
            String typeName2 = typeName.toString();
            typeName2.getClass();
            return findType(typeName2);
        }
        TypeName typeName3 = ((ArrayTypeName) typeName).componentType;
        typeName3.getClass();
        XType findType = findType(typeName3);
        if (findType != null) {
            return getArrayType(findType);
        }
        return null;
    }

    @Nullable
    XType findType(@NotNull String qName);

    @Nullable
    XTypeElement findTypeElement(@NotNull String qName);

    @Nullable
    default XTypeElement findTypeElement(@NotNull KClass<?> klass) {
        klass.getClass();
        String canonicalName = JvmClassMappingKt.getJavaClass((KClass) klass).getCanonicalName();
        canonicalName.getClass();
        return findTypeElement(canonicalName);
    }

    @NotNull
    default XArrayType getArrayType(@NotNull XTypeName typeName) {
        typeName.getClass();
        return getArrayType(requireType(typeName));
    }

    @NotNull
    XArrayType getArrayType(@NotNull XType type);

    @NotNull
    Backend getBackend();

    @NotNull
    XProcessingEnvConfig getConfig();

    @NotNull
    XType getDeclaredType(@NotNull XTypeElement xTypeElement, @NotNull XType... xTypeArr);

    @NotNull
    XFiler getFiler();

    int getJvmVersion();

    @NotNull
    XMessager getMessager();

    @NotNull
    Map<String, String> getOptions();

    @NotNull
    List<XTypeElement> getTypeElementsFromPackage(@NotNull String packageName);

    @NotNull
    XType getWildcardType(@Nullable XType consumerSuper, @Nullable XType producerExtends);

    @NotNull
    default XType requireType(@NotNull XTypeName typeName) {
        XType requireType;
        typeName.getClass();
        if (typeName.isPrimitive()) {
            return requireType(typeName.getJava());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getBackend().ordinal()];
        if (i == 1) {
            requireType = requireType(typeName.getJava());
        } else {
            if (i != 2) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            com.squareup.kotlinpoet.TypeName kotlin2 = typeName.getKotlin();
            ClassName className = kotlin2 instanceof ClassName ? (ClassName) kotlin2 : null;
            if (className == null) {
                PathKt$$ExternalSyntheticBUOutline0.m$4(typeName.getKotlin(), "cannot find required type ");
                return null;
            }
            requireType = requireType(className.getCanonicalName());
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[typeName.getNullability().ordinal()];
        if (i2 == 1) {
            return requireType.makeNullable();
        }
        if (i2 == 2) {
            return requireType.makeNonNullable();
        }
        if (i2 == 3) {
            return requireType;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    default XTypeElement requireTypeElement(@NotNull XTypeName typeName) {
        typeName.getClass();
        if (typeName.isPrimitive()) {
            return requireTypeElement(typeName.getJava());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getBackend().ordinal()];
        if (i == 1) {
            return requireTypeElement(typeName.getJava());
        }
        if (i != 2) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        com.squareup.kotlinpoet.TypeName kotlin2 = typeName.getKotlin();
        ClassName className = kotlin2 instanceof ClassName ? (ClassName) kotlin2 : null;
        if (className != null) {
            return requireTypeElement(className.getCanonicalName());
        }
        PathKt$$ExternalSyntheticBUOutline0.m$4(typeName.getKotlin(), "cannot find required type element ");
        return null;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static XProcessingEnv create(@NotNull Map<String, String> map, @NotNull Resolver resolver, @NotNull CodeGenerator codeGenerator, @NotNull KSPLogger kSPLogger) {
        return INSTANCE.create(map, resolver, codeGenerator, kSPLogger);
    }

    @NotNull
    default XArrayType getArrayType(@NotNull TypeName typeName) {
        typeName.getClass();
        return getArrayType(requireType(typeName));
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static XProcessingEnv create(@NotNull ProcessingEnvironment processingEnvironment) {
        return INSTANCE.create(processingEnvironment);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static XProcessingEnv create(@NotNull ProcessingEnvironment processingEnvironment, @NotNull XProcessingEnvConfig xProcessingEnvConfig) {
        return INSTANCE.create(processingEnvironment, xProcessingEnvConfig);
    }

    @Nullable
    default XTypeElement findTypeElement(@NotNull TypeName typeName) {
        typeName.getClass();
        String typeName2 = typeName.toString();
        typeName2.getClass();
        return findTypeElement(typeName2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J>\u0010\u0003\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0012"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnv$Companion;", "", "()V", "create", "Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnv;", StringLookupFactory.KEY_ENV, "Ljavax/annotation/processing/ProcessingEnvironment;", "config", "Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnvConfig;", "options", "", "", "resolver", "Lcom/google/devtools/ksp/processing/Resolver;", "codeGenerator", "Lcom/google/devtools/ksp/processing/CodeGenerator;", "logger", "Lcom/google/devtools/ksp/processing/KSPLogger;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ XProcessingEnv create$default(Companion companion, Map map, Resolver resolver, CodeGenerator codeGenerator, KSPLogger kSPLogger, XProcessingEnvConfig xProcessingEnvConfig, int i, Object obj) {
            if ((i & 16) != 0) {
                xProcessingEnvConfig = XProcessingEnvConfig.INSTANCE.getDEFAULT();
            }
            return companion.create(map, resolver, codeGenerator, kSPLogger, xProcessingEnvConfig);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final XProcessingEnv create(@NotNull Map<String, String> map, @NotNull Resolver resolver, @NotNull CodeGenerator codeGenerator, @NotNull KSPLogger kSPLogger) {
            map.getClass();
            resolver.getClass();
            codeGenerator.getClass();
            kSPLogger.getClass();
            return create$default(this, map, resolver, codeGenerator, kSPLogger, null, 16, null);
        }

        public static /* synthetic */ XProcessingEnv create$default(Companion companion, ProcessingEnvironment processingEnvironment, XProcessingEnvConfig xProcessingEnvConfig, int i, Object obj) {
            if ((i & 2) != 0) {
                xProcessingEnvConfig = XProcessingEnvConfig.INSTANCE.getDEFAULT();
            }
            return companion.create(processingEnvironment, xProcessingEnvConfig);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final XProcessingEnv create(@NotNull ProcessingEnvironment processingEnvironment) {
            processingEnvironment.getClass();
            return create$default(this, processingEnvironment, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final XProcessingEnv create(@NotNull ProcessingEnvironment env, @NotNull XProcessingEnvConfig config) {
            env.getClass();
            config.getClass();
            return new JavacProcessingEnv(env, config);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final XProcessingEnv create(@NotNull Map<String, String> options, @NotNull Resolver resolver, @NotNull CodeGenerator codeGenerator, @NotNull KSPLogger logger, @NotNull XProcessingEnvConfig config) {
            options.getClass();
            resolver.getClass();
            codeGenerator.getClass();
            logger.getClass();
            config.getClass();
            KspProcessingEnv kspProcessingEnv = new KspProcessingEnv(options, codeGenerator, logger, config);
            kspProcessingEnv.setResolver$room_compiler_processing(resolver);
            return kspProcessingEnv;
        }
    }

    @Nullable
    default XType findType(@NotNull KClass<?> klass) {
        klass.getClass();
        String canonicalName = JvmClassMappingKt.getJavaClass((KClass) klass).getCanonicalName();
        canonicalName.getClass();
        return findType(canonicalName);
    }

    @NotNull
    default XTypeElement requireTypeElement(@NotNull String qName) {
        qName.getClass();
        XTypeElement findTypeElement = findTypeElement(qName);
        if (findTypeElement != null) {
            return findTypeElement;
        }
        PathKt$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m("Cannot find required type element ", qName));
        return null;
    }

    @NotNull
    default XTypeElement requireTypeElement(@NotNull TypeName typeName) {
        typeName.getClass();
        String typeName2 = typeName.toString();
        typeName2.getClass();
        return requireTypeElement(typeName2);
    }

    @NotNull
    default XTypeElement requireTypeElement(@NotNull KClass<?> klass) {
        klass.getClass();
        String canonicalName = JvmClassMappingKt.getJavaClass((KClass) klass).getCanonicalName();
        canonicalName.getClass();
        return requireTypeElement(canonicalName);
    }

    @NotNull
    default XType requireType(@NotNull TypeName typeName) {
        typeName.getClass();
        XType findType = findType(typeName);
        if (findType != null) {
            return findType;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1(typeName, "cannot find required type ");
        return null;
    }

    @NotNull
    default XType requireType(@NotNull String qName) {
        qName.getClass();
        XType findType = findType(qName);
        if (findType != null) {
            return findType;
        }
        PathKt$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m("cannot find required type ", qName));
        return null;
    }

    @NotNull
    default XType requireType(@NotNull KClass<?> klass) {
        klass.getClass();
        String canonicalName = JvmClassMappingKt.getJavaClass((KClass) klass).getCanonicalName();
        canonicalName.getClass();
        return requireType(canonicalName);
    }
}
