package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J!\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\u000bH\u0016J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/HasCompilerOptions;", "CO", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerOptions;", "", "options", "getOptions", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerOptions;", "configure", "", "configuration", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Lorg/gradle/api/Action;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface HasCompilerOptions<CO extends KotlinCommonCompilerOptions> {
    void configure(@NotNull Function1<? super CO, Unit> configuration);

    void configure(@NotNull Action<CO> configuration);

    @NotNull
    CO getOptions();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <CO extends KotlinCommonCompilerOptions> void configure(@NotNull HasCompilerOptions<? extends CO> hasCompilerOptions, @NotNull Function1<? super CO, Unit> function1) {
            function1.getClass();
            function1.invoke(hasCompilerOptions.getOptions());
        }

        public static <CO extends KotlinCommonCompilerOptions> void configure(@NotNull HasCompilerOptions<? extends CO> hasCompilerOptions, @NotNull Action<CO> action) {
            action.getClass();
            action.execute(hasCompilerOptions.getOptions());
        }
    }
}
