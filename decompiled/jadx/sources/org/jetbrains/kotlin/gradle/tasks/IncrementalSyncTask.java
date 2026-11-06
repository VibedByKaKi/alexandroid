package org.jetbrains.kotlin.gradle.tasks;

import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.gradle.api.Task;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.IgnoreEmptyDirectories;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.PathSensitive;
import org.gradle.api.tasks.PathSensitivity;
import org.gradle.api.tasks.SkipWhenEmpty;
import org.gradle.work.NormalizeLineEndings;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/IncrementalSyncTask;", "Lorg/gradle/api/Task;", "destinationDir", "Ljava/io/File;", "getDestinationDir$annotations", "()V", "getDestinationDir", "()Ljava/io/File;", "destinationDirectory", "Lorg/gradle/api/provider/Property;", "getDestinationDirectory", "()Lorg/gradle/api/provider/Property;", "from", "Lorg/gradle/api/file/ConfigurableFileCollection;", "getFrom", "()Lorg/gradle/api/file/ConfigurableFileCollection;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface IncrementalSyncTask extends Task {
    @Internal
    @NotNull
    File getDestinationDir();

    @OutputDirectory
    @NotNull
    Property<File> getDestinationDirectory();

    @IgnoreEmptyDirectories
    @InputFiles
    @NotNull
    @NormalizeLineEndings
    @PathSensitive(PathSensitivity.ABSOLUTE)
    @SkipWhenEmpty
    ConfigurableFileCollection getFrom();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Internal
        @NotNull
        public static File getDestinationDir(@NotNull IncrementalSyncTask incrementalSyncTask) {
            Object obj = incrementalSyncTask.getDestinationDirectory().get();
            obj.getClass();
            return (File) obj;
        }

        @Deprecated(message = "Use destinationDirProperty with Provider API", replaceWith = @ReplaceWith(expression = "destinationDirProperty.get()", imports = {}))
        public static /* synthetic */ void getDestinationDir$annotations() {
        }
    }
}
