package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.gradle.api.file.FileCollection;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.TaskProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.dsl.KaptExtensionConfig;
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions;
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions;
import org.jetbrains.kotlin.gradle.dsl.KotlinTopLevelExtensionConfig;
import org.jetbrains.kotlin.gradle.tasks.Kapt;
import org.jetbrains.kotlin.gradle.tasks.KaptGenerateStubs;
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\f\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0018\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00162\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0018\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u00162\u0006\u0010\u0018\u001a\u00020\u0019H'J \u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinJvmFactory;", "", "kaptExtension", "Lorg/jetbrains/kotlin/gradle/dsl/KaptExtensionConfig;", "getKaptExtension", "()Lorg/jetbrains/kotlin/gradle/dsl/KaptExtensionConfig;", "kotlinExtension", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinTopLevelExtensionConfig;", "getKotlinExtension", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinTopLevelExtensionConfig;", "addCompilerPluginDependency", "", "dependency", "Lorg/gradle/api/provider/Provider;", "createCompilerJvmOptions", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinJvmCompilerOptions;", "createKotlinJvmOptions", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinJvmOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinJvmOptionsDeprecated;", "getCompilerPlugins", "Lorg/gradle/api/file/FileCollection;", "registerKaptGenerateStubsTask", "Lorg/gradle/api/tasks/TaskProvider;", "Lorg/jetbrains/kotlin/gradle/tasks/KaptGenerateStubs;", "taskName", "", "registerKaptTask", "Lorg/jetbrains/kotlin/gradle/tasks/Kapt;", "registerKotlinJvmCompileTask", "Lorg/jetbrains/kotlin/gradle/tasks/KotlinJvmCompile;", "moduleName", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinJvmFactory {
    void addCompilerPluginDependency(@NotNull Provider<Object> dependency);

    @NotNull
    KotlinJvmCompilerOptions createCompilerJvmOptions();

    @Deprecated(message = "Replaced by compilerJvmOptions", replaceWith = @ReplaceWith(expression = "createCompilerJvmOptions()", imports = {}))
    @NotNull
    KotlinJvmOptions createKotlinJvmOptions();

    @NotNull
    FileCollection getCompilerPlugins();

    @NotNull
    KaptExtensionConfig getKaptExtension();

    @NotNull
    KotlinTopLevelExtensionConfig getKotlinExtension();

    @NotNull
    TaskProvider<? extends KaptGenerateStubs> registerKaptGenerateStubsTask(@NotNull String taskName);

    @NotNull
    TaskProvider<? extends Kapt> registerKaptTask(@NotNull String taskName);

    @Deprecated(message = "Replaced by registerKotlinJvmCompileTask with module name", replaceWith = @ReplaceWith(expression = "registerKotlinJvmCompileTask(taskName: String, moduleName: String)", imports = {}))
    @NotNull
    TaskProvider<? extends KotlinJvmCompile> registerKotlinJvmCompileTask(@NotNull String taskName);

    @NotNull
    TaskProvider<? extends KotlinJvmCompile> registerKotlinJvmCompileTask(@NotNull String taskName, @NotNull String moduleName);
}
