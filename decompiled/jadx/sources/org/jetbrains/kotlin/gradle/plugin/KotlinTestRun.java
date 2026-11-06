package org.jetbrains.kotlin.gradle.plugin;

import groovy.lang.Closure;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.tasks.testing.TestFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.plugin.KotlinExecution;
import org.jetbrains.kotlin.gradle.plugin.KotlinExecution.ExecutionSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H&J!\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\nH&¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTestRun;", "SourceType", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinExecution$ExecutionSource;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinExecution;", "filter", "", "configureFilter", "Lgroovy/lang/Closure;", "Lkotlin/Function1;", "Lorg/gradle/api/tasks/testing/TestFilter;", "Lkotlin/ExtensionFunctionType;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinTestRun<SourceType extends KotlinExecution.ExecutionSource> extends KotlinExecution<SourceType> {
    void filter(@NotNull Closure<?> configureFilter);

    void filter(@NotNull Function1<? super TestFilter, Unit> configureFilter);
}
