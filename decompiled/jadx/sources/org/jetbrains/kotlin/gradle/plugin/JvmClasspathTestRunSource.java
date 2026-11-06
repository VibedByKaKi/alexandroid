package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Metadata;
import org.gradle.api.file.FileCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.plugin.KotlinExecution;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/JvmClasspathTestRunSource;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinExecution$ExecutionSource;", "classpath", "Lorg/gradle/api/file/FileCollection;", "getClasspath", "()Lorg/gradle/api/file/FileCollection;", "testClassesDirs", "getTestClassesDirs", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface JvmClasspathTestRunSource extends KotlinExecution.ExecutionSource {
    @NotNull
    FileCollection getClasspath();

    @NotNull
    FileCollection getTestClassesDirs();
}
