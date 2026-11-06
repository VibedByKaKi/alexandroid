package org.jetbrains.kotlin.gradle.plugin;

import java.io.File;
import kotlin.Metadata;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.FileCollection;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0001X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilationOutput;", "", "allOutputs", "Lorg/gradle/api/file/FileCollection;", "getAllOutputs", "()Lorg/gradle/api/file/FileCollection;", "classesDirs", "Lorg/gradle/api/file/ConfigurableFileCollection;", "getClassesDirs", "()Lorg/gradle/api/file/ConfigurableFileCollection;", "resourcesDir", "Ljava/io/File;", "getResourcesDir", "()Ljava/io/File;", "resourcesDirProvider", "getResourcesDirProvider", "()Ljava/lang/Object;", "setResourcesDirProvider", "(Ljava/lang/Object;)V", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinCompilationOutput {
    @NotNull
    FileCollection getAllOutputs();

    @NotNull
    ConfigurableFileCollection getClassesDirs();

    @NotNull
    File getResourcesDir();

    @NotNull
    Object getResourcesDirProvider();

    void setResourcesDirProvider(@NotNull Object obj);
}
