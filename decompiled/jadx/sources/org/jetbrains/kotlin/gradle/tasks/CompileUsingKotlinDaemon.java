package org.jetbrains.kotlin.gradle.tasks;

import kotlin.Metadata;
import org.gradle.api.Task;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Internal;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/CompileUsingKotlinDaemon;", "Lorg/gradle/api/Task;", "compilerExecutionStrategy", "Lorg/gradle/api/provider/Property;", "Lorg/jetbrains/kotlin/gradle/tasks/KotlinCompilerExecutionStrategy;", "getCompilerExecutionStrategy", "()Lorg/gradle/api/provider/Property;", "kotlinDaemonJvmArguments", "Lorg/gradle/api/provider/ListProperty;", "", "getKotlinDaemonJvmArguments", "()Lorg/gradle/api/provider/ListProperty;", "useDaemonFallbackStrategy", "", "getUseDaemonFallbackStrategy", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface CompileUsingKotlinDaemon extends Task {
    @Internal
    @NotNull
    Property<KotlinCompilerExecutionStrategy> getCompilerExecutionStrategy();

    @Internal
    @NotNull
    ListProperty<String> getKotlinDaemonJvmArguments();

    @Internal
    @NotNull
    Property<Boolean> getUseDaemonFallbackStrategy();
}
