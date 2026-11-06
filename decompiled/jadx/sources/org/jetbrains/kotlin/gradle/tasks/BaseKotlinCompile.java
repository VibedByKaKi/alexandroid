package org.jetbrains.kotlin.gradle.tasks;

import kotlin.Metadata;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Classpath;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Nested;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.plugin.CompilerPluginConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/BaseKotlinCompile;", "Lorg/jetbrains/kotlin/gradle/tasks/KotlinCompileTool;", "friendPaths", "Lorg/gradle/api/file/ConfigurableFileCollection;", "getFriendPaths", "()Lorg/gradle/api/file/ConfigurableFileCollection;", "moduleName", "Lorg/gradle/api/provider/Property;", "", "getModuleName", "()Lorg/gradle/api/provider/Property;", "multiPlatformEnabled", "", "getMultiPlatformEnabled", "pluginClasspath", "getPluginClasspath", "pluginOptions", "Lorg/gradle/api/provider/ListProperty;", "Lorg/jetbrains/kotlin/gradle/plugin/CompilerPluginConfig;", "getPluginOptions", "()Lorg/gradle/api/provider/ListProperty;", "sourceSetName", "getSourceSetName", "useModuleDetection", "getUseModuleDetection", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface BaseKotlinCompile extends KotlinCompileTool {
    @Internal
    @NotNull
    ConfigurableFileCollection getFriendPaths();

    @Input
    @NotNull
    Property<String> getModuleName();

    @Input
    @NotNull
    Property<Boolean> getMultiPlatformEnabled();

    @Classpath
    @NotNull
    ConfigurableFileCollection getPluginClasspath();

    @Nested
    @NotNull
    ListProperty<CompilerPluginConfig> getPluginOptions();

    @Internal
    @NotNull
    Property<String> getSourceSetName();

    @Input
    @NotNull
    Property<Boolean> getUseModuleDetection();
}
