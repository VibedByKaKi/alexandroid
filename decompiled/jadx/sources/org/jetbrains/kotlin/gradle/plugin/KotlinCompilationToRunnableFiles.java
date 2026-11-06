package org.jetbrains.kotlin.gradle.plugin;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.file.FileCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions;
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "Scheduled for removal with Kotlin 2.0")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000*\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilationToRunnableFiles;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptionsDeprecated;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "runtimeDependencyConfigurationName", "", "getRuntimeDependencyConfigurationName", "()Ljava/lang/String;", "runtimeDependencyFiles", "Lorg/gradle/api/file/FileCollection;", "getRuntimeDependencyFiles", "()Lorg/gradle/api/file/FileCollection;", "setRuntimeDependencyFiles", "(Lorg/gradle/api/file/FileCollection;)V", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinCompilationToRunnableFiles<T extends KotlinCommonOptions> extends KotlinCompilation<T> {
    @Override // org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
    @NotNull
    String getRuntimeDependencyConfigurationName();

    @Override // org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
    @NotNull
    FileCollection getRuntimeDependencyFiles();

    void setRuntimeDependencyFiles(@NotNull FileCollection fileCollection);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends KotlinCommonOptions> void attributes(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles, @NotNull Function1<? super AttributeContainer, Unit> function1) {
            function1.getClass();
            KotlinCompilation.DefaultImpls.attributes(kotlinCompilationToRunnableFiles, function1);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin compilation level compiler options DSL is not available in this release!")
        public static <T extends KotlinCommonOptions> void compilerOptions(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles, @NotNull Function1<? super KotlinCommonCompilerOptions, Unit> function1) {
            function1.getClass();
            KotlinCompilation.DefaultImpls.compilerOptions(kotlinCompilationToRunnableFiles, function1);
        }

        public static <T extends KotlinCommonOptions> void defaultSourceSet(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles, @NotNull Action<KotlinSourceSet> action) {
            action.getClass();
            KotlinCompilation.DefaultImpls.defaultSourceSet(kotlinCompilationToRunnableFiles, action);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> List<KotlinCompilation<?>> getAssociateWith(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles) {
            return KotlinCompilation.DefaultImpls.getAssociateWith(kotlinCompilationToRunnableFiles);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> String getDefaultSourceSetName(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles) {
            return KotlinCompilation.DefaultImpls.getDefaultSourceSetName(kotlinCompilationToRunnableFiles);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> String getDisambiguatedName(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles) {
            return KotlinCompilation.DefaultImpls.getDisambiguatedName(kotlinCompilationToRunnableFiles);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> String getName(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles) {
            return KotlinCompilation.DefaultImpls.getName(kotlinCompilationToRunnableFiles);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> KotlinPlatformType getPlatformType(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles) {
            return KotlinCompilation.DefaultImpls.getPlatformType(kotlinCompilationToRunnableFiles);
        }

        public static <T extends KotlinCommonOptions> void kotlinOptions(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles, @NotNull Function1<? super T, Unit> function1) {
            function1.getClass();
            KotlinCompilation.DefaultImpls.kotlinOptions(kotlinCompilationToRunnableFiles, function1);
        }

        public static <T extends KotlinCommonOptions> void attributes(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles, @NotNull Action<AttributeContainer> action) {
            action.getClass();
            KotlinCompilation.DefaultImpls.attributes(kotlinCompilationToRunnableFiles, action);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin compilation level compiler options DSL is not available in this release!")
        public static <T extends KotlinCommonOptions> void compilerOptions(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles, @NotNull Action<KotlinCommonCompilerOptions> action) {
            action.getClass();
            KotlinCompilation.DefaultImpls.compilerOptions(kotlinCompilationToRunnableFiles, action);
        }

        public static <T extends KotlinCommonOptions> void kotlinOptions(@NotNull KotlinCompilationToRunnableFiles<T> kotlinCompilationToRunnableFiles, @NotNull Action<T> action) {
            action.getClass();
            KotlinCompilation.DefaultImpls.kotlinOptions(kotlinCompilationToRunnableFiles, action);
        }
    }
}
