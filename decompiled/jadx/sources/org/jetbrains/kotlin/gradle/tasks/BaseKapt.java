package org.jetbrains.kotlin.gradle.tasks;

import java.util.List;
import kotlin.Metadata;
import org.gradle.api.Task;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Classpath;
import org.gradle.api.tasks.IgnoreEmptyDirectories;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.LocalState;
import org.gradle.api.tasks.Nested;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.PathSensitive;
import org.gradle.api.tasks.PathSensitivity;
import org.gradle.work.Incremental;
import org.gradle.work.NormalizeLineEndings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.tasks.UsesKotlinJavaToolchain;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00138gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140!8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000fR\u0014\u0010&\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000bR\u0014\u0010(\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u000fR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138gX¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0014\u0010,\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u000b¨\u0006."}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/BaseKapt;", "Lorg/gradle/api/Task;", "Lorg/jetbrains/kotlin/gradle/tasks/UsesKotlinJavaToolchain;", "annotationProcessorOptionProviders", "", "", "getAnnotationProcessorOptionProviders", "()Ljava/util/List;", "classesDir", "Lorg/gradle/api/file/DirectoryProperty;", "getClassesDir", "()Lorg/gradle/api/file/DirectoryProperty;", "classpath", "Lorg/gradle/api/file/ConfigurableFileCollection;", "getClasspath", "()Lorg/gradle/api/file/ConfigurableFileCollection;", "compiledSources", "getCompiledSources", "defaultJavaSourceCompatibility", "Lorg/gradle/api/provider/Property;", "", "getDefaultJavaSourceCompatibility", "()Lorg/gradle/api/provider/Property;", "destinationDir", "getDestinationDir", "incAptCache", "getIncAptCache", "includeCompileClasspath", "", "getIncludeCompileClasspath", "kaptClasspath", "getKaptClasspath", "kaptClasspathConfigurationNames", "Lorg/gradle/api/provider/ListProperty;", "getKaptClasspathConfigurationNames", "()Lorg/gradle/api/provider/ListProperty;", "kaptExternalClasspath", "getKaptExternalClasspath", "kotlinSourcesDestinationDir", "getKotlinSourcesDestinationDir", "source", "getSource", "sourceSetName", "getSourceSetName", "stubsDir", "getStubsDir", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface BaseKapt extends Task, UsesKotlinJavaToolchain {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Internal
        @NotNull
        public static KotlinJavaToolchain getKotlinJavaToolchain(@NotNull BaseKapt baseKapt) {
            return UsesKotlinJavaToolchain.DefaultImpls.getKotlinJavaToolchain(baseKapt);
        }
    }

    @Nested
    @NotNull
    List<Object> getAnnotationProcessorOptionProviders();

    @OutputDirectory
    @NotNull
    DirectoryProperty getClassesDir();

    @Internal("Task implementation adds correct input annotation.")
    @NotNull
    ConfigurableFileCollection getClasspath();

    @Internal
    @NotNull
    ConfigurableFileCollection getCompiledSources();

    @Internal("Used to compute javac option.")
    @NotNull
    Property<String> getDefaultJavaSourceCompatibility();

    @OutputDirectory
    @NotNull
    DirectoryProperty getDestinationDir();

    @LocalState
    @NotNull
    DirectoryProperty getIncAptCache();

    @Input
    @NotNull
    Property<Boolean> getIncludeCompileClasspath();

    @Classpath
    @NotNull
    ConfigurableFileCollection getKaptClasspath();

    @Internal
    @NotNull
    ListProperty<String> getKaptClasspathConfigurationNames();

    @Classpath
    @NotNull
    ConfigurableFileCollection getKaptExternalClasspath();

    @OutputDirectory
    @NotNull
    DirectoryProperty getKotlinSourcesDestinationDir();

    @IgnoreEmptyDirectories
    @InputFiles
    @NotNull
    @NormalizeLineEndings
    @PathSensitive(PathSensitivity.RELATIVE)
    @Incremental
    ConfigurableFileCollection getSource();

    @Internal
    @NotNull
    Property<String> getSourceSetName();

    @Internal
    @NotNull
    DirectoryProperty getStubsDir();
}
