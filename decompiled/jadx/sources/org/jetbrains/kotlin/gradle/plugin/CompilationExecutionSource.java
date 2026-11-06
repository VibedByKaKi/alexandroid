package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation;
import org.jetbrains.kotlin.gradle.plugin.KotlinExecution;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/CompilationExecutionSource;", "CompilationType", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinExecution$ExecutionSource;", "compilation", "getCompilation", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface CompilationExecutionSource<CompilationType extends KotlinCompilation<?>> extends KotlinExecution.ExecutionSource {
    @NotNull
    CompilationType getCompilation();
}
