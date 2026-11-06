package org.jetbrains.kotlin.gradle.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.gradle.api.Task;
import org.gradle.api.tasks.Nested;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerToolOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J!\u0010\u0004\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0016J\u0018\u0010\u0004\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000bH\u0016R\u0014\u0010\u0004\u001a\u00028\u00008gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/KotlinToolTask;", "TO", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerToolOptions;", "Lorg/gradle/api/Task;", "toolOptions", "getToolOptions", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerToolOptions;", "", "configure", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Lorg/gradle/api/Action;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinToolTask<TO extends KotlinCommonCompilerToolOptions> extends Task {
    @Nested
    @NotNull
    TO getToolOptions();

    void toolOptions(@NotNull Function1<? super TO, Unit> configure);

    void toolOptions(@NotNull Action<? super TO> configure);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <TO extends KotlinCommonCompilerToolOptions> void toolOptions(@NotNull KotlinToolTask<? extends TO> kotlinToolTask, @NotNull Function1<? super TO, Unit> function1) {
            function1.getClass();
            function1.invoke(kotlinToolTask.getToolOptions());
        }

        public static <TO extends KotlinCommonCompilerToolOptions> void toolOptions(@NotNull KotlinToolTask<? extends TO> kotlinToolTask, @NotNull Action<? super TO> action) {
            action.getClass();
            action.execute(kotlinToolTask.getToolOptions());
        }
    }
}
