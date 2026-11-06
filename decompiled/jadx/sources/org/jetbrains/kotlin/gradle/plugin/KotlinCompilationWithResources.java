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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions;
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "Scheduled for removal with Kotlin 2.0")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000*\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilationWithResources;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptionsDeprecated;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "processResourcesTaskName", "", "getProcessResourcesTaskName", "()Ljava/lang/String;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinCompilationWithResources<T extends KotlinCommonOptions> extends KotlinCompilation<T> {
    @NotNull
    String getProcessResourcesTaskName();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends KotlinCommonOptions> void attributes(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources, @NotNull Function1<? super AttributeContainer, Unit> function1) {
            function1.getClass();
            KotlinCompilation.DefaultImpls.attributes(kotlinCompilationWithResources, function1);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin compilation level compiler options DSL is not available in this release!")
        public static <T extends KotlinCommonOptions> void compilerOptions(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources, @NotNull Function1<? super KotlinCommonCompilerOptions, Unit> function1) {
            function1.getClass();
            KotlinCompilation.DefaultImpls.compilerOptions(kotlinCompilationWithResources, function1);
        }

        public static <T extends KotlinCommonOptions> void defaultSourceSet(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources, @NotNull Action<KotlinSourceSet> action) {
            action.getClass();
            KotlinCompilation.DefaultImpls.defaultSourceSet(kotlinCompilationWithResources, action);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> List<KotlinCompilation<?>> getAssociateWith(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources) {
            return KotlinCompilation.DefaultImpls.getAssociateWith(kotlinCompilationWithResources);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> String getDefaultSourceSetName(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources) {
            return KotlinCompilation.DefaultImpls.getDefaultSourceSetName(kotlinCompilationWithResources);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> String getDisambiguatedName(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources) {
            return KotlinCompilation.DefaultImpls.getDisambiguatedName(kotlinCompilationWithResources);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> String getName(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources) {
            return KotlinCompilation.DefaultImpls.getName(kotlinCompilationWithResources);
        }

        @NotNull
        public static <T extends KotlinCommonOptions> KotlinPlatformType getPlatformType(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources) {
            return KotlinCompilation.DefaultImpls.getPlatformType(kotlinCompilationWithResources);
        }

        public static <T extends KotlinCommonOptions> void kotlinOptions(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources, @NotNull Function1<? super T, Unit> function1) {
            function1.getClass();
            KotlinCompilation.DefaultImpls.kotlinOptions(kotlinCompilationWithResources, function1);
        }

        public static <T extends KotlinCommonOptions> void attributes(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources, @NotNull Action<AttributeContainer> action) {
            action.getClass();
            KotlinCompilation.DefaultImpls.attributes(kotlinCompilationWithResources, action);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin compilation level compiler options DSL is not available in this release!")
        public static <T extends KotlinCommonOptions> void compilerOptions(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources, @NotNull Action<KotlinCommonCompilerOptions> action) {
            action.getClass();
            KotlinCompilation.DefaultImpls.compilerOptions(kotlinCompilationWithResources, action);
        }

        public static <T extends KotlinCommonOptions> void kotlinOptions(@NotNull KotlinCompilationWithResources<T> kotlinCompilationWithResources, @NotNull Action<T> action) {
            action.getClass();
            KotlinCompilation.DefaultImpls.kotlinOptions(kotlinCompilationWithResources, action);
        }
    }
}
