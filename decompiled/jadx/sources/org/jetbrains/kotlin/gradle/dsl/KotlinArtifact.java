package org.jetbrains.kotlin.gradle.dsl;

import java.util.Set;
import kotlin.Metadata;
import org.gradle.api.Named;
import org.gradle.api.Project;
import org.gradle.api.plugins.ExtensionAware;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0012\u0010\u000e\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0014"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinArtifact;", "Lorg/gradle/api/Named;", "Lorg/gradle/api/plugins/ExtensionAware;", "artifactName", "", "getArtifactName", "()Ljava/lang/String;", "modules", "", "", "getModules", "()Ljava/util/Set;", "outDir", "getOutDir", "taskName", "getTaskName", "registerAssembleTask", "", "project", "Lorg/gradle/api/Project;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinArtifact extends Named, ExtensionAware {
    @NotNull
    String getArtifactName();

    @NotNull
    Set<Object> getModules();

    @NotNull
    String getOutDir();

    @NotNull
    String getTaskName();

    void registerAssembleTask(@NotNull Project project);
}
