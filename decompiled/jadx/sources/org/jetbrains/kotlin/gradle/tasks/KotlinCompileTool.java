package org.jetbrains.kotlin.gradle.tasks;

import java.util.Set;
import kotlin.Metadata;
import org.gradle.api.Task;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Classpath;
import org.gradle.api.tasks.IgnoreEmptyDirectories;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.PathSensitive;
import org.gradle.api.tasks.PathSensitivity;
import org.gradle.api.tasks.SkipWhenEmpty;
import org.gradle.api.tasks.util.PatternFilterable;
import org.gradle.work.Incremental;
import org.gradle.work.NormalizeLineEndings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.library.NativeLibraryConstantsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H'J!\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H&¢\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H&¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/KotlinCompileTool;", "Lorg/gradle/api/tasks/util/PatternFilterable;", "Lorg/gradle/api/Task;", "destinationDirectory", "Lorg/gradle/api/file/DirectoryProperty;", "getDestinationDirectory", "()Lorg/gradle/api/file/DirectoryProperty;", "libraries", "Lorg/gradle/api/file/ConfigurableFileCollection;", "getLibraries", "()Lorg/gradle/api/file/ConfigurableFileCollection;", NativeLibraryConstantsKt.KONAN_DISTRIBUTION_SOURCES_DIR, "Lorg/gradle/api/file/FileCollection;", "getSources", "()Lorg/gradle/api/file/FileCollection;", "getExcludes", "", "", "getIncludes", "setSource", "", "", "", "([Ljava/lang/Object;)V", "source", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinCompileTool extends PatternFilterable, Task {
    @OutputDirectory
    @NotNull
    DirectoryProperty getDestinationDirectory();

    @Internal
    @NotNull
    Set<String> getExcludes();

    @Internal
    @NotNull
    Set<String> getIncludes();

    @Incremental
    @Classpath
    @NotNull
    ConfigurableFileCollection getLibraries();

    @IgnoreEmptyDirectories
    @InputFiles
    @NotNull
    @NormalizeLineEndings
    @PathSensitive(PathSensitivity.RELATIVE)
    @SkipWhenEmpty
    FileCollection getSources();

    void setSource(@NotNull Object... sources);

    void source(@NotNull Object... sources);
}
