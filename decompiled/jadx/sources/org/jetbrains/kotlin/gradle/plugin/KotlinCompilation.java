package org.jetbrains.kotlin.gradle.plugin;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.gradle.api.Named;
import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.attributes.HasAttributes;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.TaskProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions;
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile;
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask;
import org.jetbrains.kotlin.tooling.core.HasMutableExtras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 d*\u000e\b\u0000\u0010\u0001 \u0001*\u00060\u0002j\u0002`\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001dJ\u0014\u0010\u0012\u001a\u00020X2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030\u0000H&J\u0016\u0010Z\u001a\u00020X2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0016J!\u0010Z\u001a\u00020X2\u0017\u0010[\u001a\u0013\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020X0^¢\u0006\u0002\b_H\u0016J\u0016\u00107\u001a\u00020X2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020`0\\H\u0017J!\u00107\u001a\u00020X2\u0017\u0010[\u001a\u0013\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020X0^¢\u0006\u0002\b_H\u0017J\u0016\u0010;\u001a\u00020X2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00100\\H\u0016J!\u0010;\u001a\u00020X2\u0017\u0010[\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020X0^¢\u0006\u0002\b_H&J\b\u0010a\u001a\u00020\u001aH\u0016J!\u0010C\u001a\u00020X2\u0017\u0010[\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020X0^¢\u0006\u0002\b_H\u0016J\u0016\u0010C\u001a\u00020X2\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\\H\u0016J\u0010\u0010b\u001a\u00020X2\u0006\u0010c\u001a\u00020\u0010H'R$\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\n8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00138VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0012\u0010\u0019\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0012\u0010\u001f\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0018\u0010!\u001a\u00020\"X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010'\u001a\u0012\u0012\u0004\u0012\u00028\u00000(j\b\u0012\u0004\u0012\u00028\u0000`)8&X§\u0004¢\u0006\f\u0012\u0004\b*\u0010\f\u001a\u0004\b+\u0010,R\u0012\u0010-\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR2\u0010/\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0004\u0012\u00028\u00000(j\b\u0012\u0004\u0012\u00028\u0000`)008&X§\u0004¢\u0006\f\u0012\u0004\b1\u0010\f\u001a\u0004\b2\u00103R\u001e\u00104\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030500X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00103R\u0016\u00107\u001a\u0006\u0012\u0002\b\u000308X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0012\u0010;\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u001a8VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010\f\u001a\u0004\b@\u0010\u001cR\u0014\u0010A\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u001cR\u0012\u0010C\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100\nX¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u000eR\u0012\u0010H\u001a\u00020IX¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010P\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u001cR\u0014\u0010R\u001a\u0004\u0018\u00010\"X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010$R\u0012\u0010T\u001a\u00020UX¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006e"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptionsDeprecated;", "Lorg/gradle/api/Named;", "Lorg/jetbrains/kotlin/gradle/plugin/HasProject;", "Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;", "Lorg/gradle/api/attributes/HasAttributes;", "Lorg/jetbrains/kotlin/gradle/plugin/HasKotlinDependencies;", "allAssociatedCompilations", "", "getAllAssociatedCompilations$annotations", "()V", "getAllAssociatedCompilations", "()Ljava/util/Set;", "allKotlinSourceSets", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinSourceSet;", "getAllKotlinSourceSets", "associateWith", "", "getAssociateWith$annotations", "getAssociateWith", "()Ljava/util/List;", "associatedCompilations", "getAssociatedCompilations", "compilationName", "", "getCompilationName", "()Ljava/lang/String;", "compileAllTaskName", "getCompileAllTaskName", "compileDependencyConfigurationName", "getCompileDependencyConfigurationName", "compileDependencyFiles", "Lorg/gradle/api/file/FileCollection;", "getCompileDependencyFiles", "()Lorg/gradle/api/file/FileCollection;", "setCompileDependencyFiles", "(Lorg/gradle/api/file/FileCollection;)V", "compileKotlinTask", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCompile;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCompileDeprecated;", "getCompileKotlinTask$annotations", "getCompileKotlinTask", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinCompile;", "compileKotlinTaskName", "getCompileKotlinTaskName", "compileKotlinTaskProvider", "Lorg/gradle/api/tasks/TaskProvider;", "getCompileKotlinTaskProvider$annotations", "getCompileKotlinTaskProvider", "()Lorg/gradle/api/tasks/TaskProvider;", "compileTaskProvider", "Lorg/jetbrains/kotlin/gradle/tasks/KotlinCompilationTask;", "getCompileTaskProvider", "compilerOptions", "Lorg/jetbrains/kotlin/gradle/plugin/HasCompilerOptions;", "getCompilerOptions", "()Lorg/jetbrains/kotlin/gradle/plugin/HasCompilerOptions;", "defaultSourceSet", "getDefaultSourceSet", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinSourceSet;", "defaultSourceSetName", "getDefaultSourceSetName$annotations", "getDefaultSourceSetName", "disambiguatedName", "getDisambiguatedName", "kotlinOptions", "getKotlinOptions", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "kotlinSourceSets", "getKotlinSourceSets", ContactsModuleConstants.OUTPUT, "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilationOutput;", "getOutput", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilationOutput;", "platformType", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType;", "getPlatformType", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType;", "runtimeDependencyConfigurationName", "getRuntimeDependencyConfigurationName", "runtimeDependencyFiles", "getRuntimeDependencyFiles", "target", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "getTarget", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "attributes", "configure", "Lorg/gradle/api/Action;", "Lorg/gradle/api/attributes/AttributeContainer;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerOptions;", "getName", "source", "sourceSet", "Companion", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinCompilation<T extends KotlinCommonOptions> extends Named, HasProject, HasMutableExtras, HasAttributes, HasKotlinDependencies {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String MAIN_COMPILATION_NAME = "main";

    @NotNull
    public static final String TEST_COMPILATION_NAME = "test";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation$Companion;", "", "()V", "MAIN_COMPILATION_NAME", "", "TEST_COMPILATION_NAME", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String MAIN_COMPILATION_NAME = "main";

        @NotNull
        public static final String TEST_COMPILATION_NAME = "test";

        private Companion() {
        }
    }

    void associateWith(@NotNull KotlinCompilation<?> other);

    void attributes(@NotNull Function1<? super AttributeContainer, Unit> configure);

    void attributes(@NotNull Action<AttributeContainer> configure);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin compilation level compiler options DSL is not available in this release!")
    void compilerOptions(@NotNull Function1<? super KotlinCommonCompilerOptions, Unit> configure);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin compilation level compiler options DSL is not available in this release!")
    void compilerOptions(@NotNull Action<KotlinCommonCompilerOptions> configure);

    void defaultSourceSet(@NotNull Function1<? super KotlinSourceSet, Unit> configure);

    void defaultSourceSet(@NotNull Action<KotlinSourceSet> configure);

    @NotNull
    Set<KotlinCompilation<?>> getAllAssociatedCompilations();

    @NotNull
    Set<KotlinSourceSet> getAllKotlinSourceSets();

    @NotNull
    List<KotlinCompilation<?>> getAssociateWith();

    @NotNull
    Set<KotlinCompilation<?>> getAssociatedCompilations();

    @NotNull
    String getCompilationName();

    @NotNull
    String getCompileAllTaskName();

    @NotNull
    String getCompileDependencyConfigurationName();

    @NotNull
    FileCollection getCompileDependencyFiles();

    @NotNull
    KotlinCompile<T> getCompileKotlinTask();

    @NotNull
    String getCompileKotlinTaskName();

    @NotNull
    TaskProvider<? extends KotlinCompile<T>> getCompileKotlinTaskProvider();

    @NotNull
    TaskProvider<? extends KotlinCompilationTask<?>> getCompileTaskProvider();

    @NotNull
    HasCompilerOptions<?> getCompilerOptions();

    @NotNull
    KotlinSourceSet getDefaultSourceSet();

    @NotNull
    String getDefaultSourceSetName();

    @NotNull
    String getDisambiguatedName();

    @NotNull
    T getKotlinOptions();

    @NotNull
    Set<KotlinSourceSet> getKotlinSourceSets();

    @NotNull
    String getName();

    @NotNull
    KotlinCompilationOutput getOutput();

    @NotNull
    KotlinPlatformType getPlatformType();

    @Nullable
    String getRuntimeDependencyConfigurationName();

    @Nullable
    FileCollection getRuntimeDependencyFiles();

    @NotNull
    KotlinTarget getTarget();

    void kotlinOptions(@NotNull Function1<? super T, Unit> configure);

    void kotlinOptions(@NotNull Action<T> configure);

    void setCompileDependencyFiles(@NotNull FileCollection fileCollection);

    @Deprecated(message = "scheduled for removal with Kotlin 2.0")
    void source(@NotNull KotlinSourceSet sourceSet);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends KotlinCommonOptions> void attributes(@NotNull KotlinCompilation<? extends T> kotlinCompilation, @NotNull Function1<? super AttributeContainer, Unit> function1) {
            function1.getClass();
            AttributeContainer attributes = kotlinCompilation.getAttributes();
            attributes.getClass();
            function1.invoke(attributes);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin compilation level compiler options DSL is not available in this release!")
        public static <T extends KotlinCommonOptions> void compilerOptions(@NotNull KotlinCompilation<? extends T> kotlinCompilation, @NotNull Function1<? super KotlinCommonCompilerOptions, Unit> function1) {
            function1.getClass();
            throw new UnsupportedOperationException("Kotlin compilation level compiler options DSL is not available in this release!");
        }

        public static <T extends KotlinCommonOptions> void defaultSourceSet(@NotNull KotlinCompilation<? extends T> kotlinCompilation, @NotNull final Action<KotlinSourceSet> action) {
            action.getClass();
            kotlinCompilation.defaultSourceSet(new Function1<KotlinSourceSet, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinCompilation$defaultSourceSet$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KotlinSourceSet kotlinSourceSet) {
                    kotlinSourceSet.getClass();
                    action.execute(kotlinSourceSet);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KotlinSourceSet kotlinSourceSet) {
                    invoke2(kotlinSourceSet);
                    return Unit.INSTANCE;
                }
            });
        }

        @NotNull
        public static <T extends KotlinCommonOptions> List<KotlinCompilation<?>> getAssociateWith(@NotNull KotlinCompilation<? extends T> kotlinCompilation) {
            return CollectionsKt.toList(kotlinCompilation.getAssociatedCompilations());
        }

        @NotNull
        public static <T extends KotlinCommonOptions> String getDefaultSourceSetName(@NotNull KotlinCompilation<? extends T> kotlinCompilation) {
            String name = kotlinCompilation.getDefaultSourceSet().getName();
            name.getClass();
            return name;
        }

        @NotNull
        public static <T extends KotlinCommonOptions> String getDisambiguatedName(@NotNull KotlinCompilation<? extends T> kotlinCompilation) {
            return kotlinCompilation.getTarget().getDisambiguationClassifier() + kotlinCompilation.getName();
        }

        @NotNull
        public static <T extends KotlinCommonOptions> String getName(@NotNull KotlinCompilation<? extends T> kotlinCompilation) {
            return kotlinCompilation.getCompilationName();
        }

        @NotNull
        public static <T extends KotlinCommonOptions> KotlinPlatformType getPlatformType(@NotNull KotlinCompilation<? extends T> kotlinCompilation) {
            return kotlinCompilation.getTarget().getPlatformType();
        }

        public static <T extends KotlinCommonOptions> void kotlinOptions(@NotNull KotlinCompilation<? extends T> kotlinCompilation, @NotNull Function1<? super T, Unit> function1) {
            function1.getClass();
            function1.invoke(kotlinCompilation.getKotlinOptions());
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin compilation level compiler options DSL is not available in this release!")
        public static <T extends KotlinCommonOptions> void compilerOptions(@NotNull KotlinCompilation<? extends T> kotlinCompilation, @NotNull Action<KotlinCommonCompilerOptions> action) {
            action.getClass();
            throw new UnsupportedOperationException("Kotlin compilation level compiler options DSL is not available in this release!");
        }

        public static <T extends KotlinCommonOptions> void kotlinOptions(@NotNull KotlinCompilation<? extends T> kotlinCompilation, @NotNull Action<T> action) {
            action.getClass();
            action.execute(kotlinCompilation.getKotlinOptions());
        }

        public static <T extends KotlinCommonOptions> void attributes(@NotNull KotlinCompilation<? extends T> kotlinCompilation, @NotNull final Action<AttributeContainer> action) {
            action.getClass();
            kotlinCompilation.attributes((Function1<? super AttributeContainer, Unit>) new Function1<AttributeContainer, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinCompilation$attributes$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AttributeContainer attributeContainer) {
                    attributeContainer.getClass();
                    action.execute(attributeContainer);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AttributeContainer attributeContainer) {
                    invoke2(attributeContainer);
                    return Unit.INSTANCE;
                }
            });
        }

        @ExperimentalKotlinGradlePluginApi
        public static /* synthetic */ void getAllAssociatedCompilations$annotations() {
        }

        @Deprecated(message = "Use 'associatedCompilations' instead", replaceWith = @ReplaceWith(expression = "associatedCompilations.toList()", imports = {}))
        public static /* synthetic */ void getAssociateWith$annotations() {
        }

        @Deprecated(message = "Accessing task instance directly is deprecated", replaceWith = @ReplaceWith(expression = "compileTaskProvider", imports = {}))
        public static /* synthetic */ void getCompileKotlinTask$annotations() {
        }

        @Deprecated(message = "Replaced with compileTaskProvider", replaceWith = @ReplaceWith(expression = "compileTaskProvider", imports = {}))
        public static /* synthetic */ void getCompileKotlinTaskProvider$annotations() {
        }

        @Deprecated(message = "Use defaultSourceSet.name instead", replaceWith = @ReplaceWith(expression = "defaultSourceSet.name", imports = {}))
        public static /* synthetic */ void getDefaultSourceSetName$annotations() {
        }
    }
}
