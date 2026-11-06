package org.jetbrains.kotlin.gradle.plugin;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.publish.maven.MavenPublication;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions;
import org.jetbrains.kotlin.gradle.plugin.KotlinExecution;
import org.jetbrains.kotlin.gradle.plugin.KotlinExecution.ExecutionSource;
import org.jetbrains.kotlin.gradle.plugin.KotlinTarget;
import org.jetbrains.kotlin.gradle.plugin.KotlinTargetTestRun;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001\nR\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetWithTests;", ExifInterface.LONGITUDE_EAST, "Lorg/jetbrains/kotlin/gradle/plugin/KotlinExecution$ExecutionSource;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetTestRun;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "testRuns", "Lorg/gradle/api/NamedDomainObjectContainer;", "getTestRuns", "()Lorg/gradle/api/NamedDomainObjectContainer;", "Companion", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinTargetWithTests<E extends KotlinExecution.ExecutionSource, T extends KotlinTargetTestRun<E>> extends KotlinTarget {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String DEFAULT_TEST_RUN_NAME = "test";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetWithTests$Companion;", "", "()V", "DEFAULT_TEST_RUN_NAME", "", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String DEFAULT_TEST_RUN_NAME = "test";

        private Companion() {
        }
    }

    @NotNull
    NamedDomainObjectContainer<T> getTestRuns();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <E extends KotlinExecution.ExecutionSource, T extends KotlinTargetTestRun<E>> void attributes(@NotNull KotlinTargetWithTests<E, T> kotlinTargetWithTests, @NotNull Function1<? super AttributeContainer, Unit> function1) {
            function1.getClass();
            KotlinTarget.DefaultImpls.attributes(kotlinTargetWithTests, function1);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin target level compiler options DSL is not available in this release!")
        public static <E extends KotlinExecution.ExecutionSource, T extends KotlinTargetTestRun<E>> void compilerOptions(@NotNull KotlinTargetWithTests<E, T> kotlinTargetWithTests, @NotNull Function1<? super KotlinCommonCompilerOptions, Unit> function1) {
            function1.getClass();
            KotlinTarget.DefaultImpls.compilerOptions(kotlinTargetWithTests, function1);
        }

        @Nullable
        public static <E extends KotlinExecution.ExecutionSource, T extends KotlinTargetTestRun<E>> String getDisambiguationClassifier(@NotNull KotlinTargetWithTests<E, T> kotlinTargetWithTests) {
            return KotlinTarget.DefaultImpls.getDisambiguationClassifier(kotlinTargetWithTests);
        }

        @NotNull
        public static <E extends KotlinExecution.ExecutionSource, T extends KotlinTargetTestRun<E>> String getName(@NotNull KotlinTargetWithTests<E, T> kotlinTargetWithTests) {
            return KotlinTarget.DefaultImpls.getName(kotlinTargetWithTests);
        }

        public static <E extends KotlinExecution.ExecutionSource, T extends KotlinTargetTestRun<E>> void mavenPublication(@NotNull KotlinTargetWithTests<E, T> kotlinTargetWithTests, @NotNull Function1<? super MavenPublication, Unit> function1) {
            function1.getClass();
            KotlinTarget.DefaultImpls.mavenPublication(kotlinTargetWithTests, function1);
        }

        public static <E extends KotlinExecution.ExecutionSource, T extends KotlinTargetTestRun<E>> void attributes(@NotNull KotlinTargetWithTests<E, T> kotlinTargetWithTests, @NotNull Action<AttributeContainer> action) {
            action.getClass();
            KotlinTarget.DefaultImpls.attributes(kotlinTargetWithTests, action);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin target level compiler options DSL is not available in this release!")
        public static <E extends KotlinExecution.ExecutionSource, T extends KotlinTargetTestRun<E>> void compilerOptions(@NotNull KotlinTargetWithTests<E, T> kotlinTargetWithTests, @NotNull Action<KotlinCommonCompilerOptions> action) {
            action.getClass();
            KotlinTarget.DefaultImpls.compilerOptions(kotlinTargetWithTests, action);
        }
    }
}
