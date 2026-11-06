package org.jetbrains.kotlin.gradle.plugin;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi;
import org.jetbrains.kotlin.konan.library.NativeLibraryConstantsKt;
import org.jetbrains.kotlin.konan.target.KonanTargetKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KotlinTargetsDsl
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b-\bg\u0018\u00002\u00020\u0001:\u0001:J!\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006H\u0016J \u0010\u0007\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\u0005H&J \u0010\u000b\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\u0005H\u0017J+\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006H&J\b\u0010\u000f\u001a\u00020\u0003H'J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J \u0010\u0017\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\u0005H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H'J\b\u0010!\u001a\u00020\u0003H&J\b\u0010\"\u001a\u00020\u0003H'J\b\u0010#\u001a\u00020\u0003H'J\b\u0010$\u001a\u00020\u0003H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\b\u0010'\u001a\u00020\u0003H&J\b\u0010(\u001a\u00020\u0003H&J\b\u0010)\u001a\u00020\u0003H&J\b\u0010*\u001a\u00020\u0003H'J\b\u0010+\u001a\u00020\u0003H&J\b\u0010,\u001a\u00020\u0003H&J\b\u0010-\u001a\u00020\u0003H&J\b\u0010.\u001a\u00020\u0003H&J\b\u0010/\u001a\u00020\u0003H&J\b\u00100\u001a\u00020\u0003H&J\b\u00101\u001a\u00020\u0003H'J\b\u00102\u001a\u00020\u0003H&J\b\u00103\u001a\u00020\u0003H&J\b\u00104\u001a\u00020\u0003H&J\b\u00105\u001a\u00020\u0003H&J\b\u00106\u001a\u00020\u0003H&J\b\u00107\u001a\u00020\u0003H&J\b\u00108\u001a\u00020\u0003H'J \u00109\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\u0005H\u0017¨\u0006;"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyBuilder;", "", NativeLibraryConstantsKt.KONAN_DISTRIBUTION_COMMON_LIBS_DIR, "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "excludeCompilations", "predicate", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "", "filterCompilations", "group", "name", "", "withAndroid", "withAndroidNative", "withAndroidNativeArm32", "withAndroidNativeArm64", "withAndroidNativeX64", "withAndroidNativeX86", "withAndroidTarget", "withApple", "withCompilations", "withIos", "withIosArm32", "withIosArm64", "withIosSimulatorArm64", "withIosX64", "withJs", "withJvm", "withLinux", "withLinuxArm32Hfp", "withLinuxArm64", "withLinuxMips32", "withLinuxMipsel32", "withLinuxX64", "withMacos", "withMacosArm64", "withMacosX64", "withMingw", "withMingwX64", "withMingwX86", "withNative", "withTvos", "withTvosArm64", "withTvosSimulatorArm64", "withTvosX64", "withWasm", "withWasm32", "withWatchos", "withWatchosArm32", "withWatchosArm64", "withWatchosDeviceArm64", "withWatchosSimulatorArm64", "withWatchosX64", "withWatchosX86", "withoutCompilations", "Root", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
@ExperimentalKotlinGradlePluginApi
/* loaded from: classes11.dex */
public interface KotlinHierarchyBuilder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void common(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder, @NotNull Function1<? super KotlinHierarchyBuilder, Unit> function1) {
            function1.getClass();
            kotlinHierarchyBuilder.group(NativeLibraryConstantsKt.KONAN_DISTRIBUTION_COMMON_LIBS_DIR, function1);
        }

        @Deprecated(message = "Use plain 'withoutCompilations(!predicate) instead'", replaceWith = @ReplaceWith(expression = "withoutCompilations { !predicate(it) }", imports = {}))
        public static void filterCompilations(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder, @NotNull final Function1<? super KotlinCompilation<?>, Boolean> function1) {
            function1.getClass();
            kotlinHierarchyBuilder.excludeCompilations(new Function1<KotlinCompilation<?>, Boolean>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyBuilder$filterCompilations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull KotlinCompilation<?> kotlinCompilation) {
                    kotlinCompilation.getClass();
                    return Boolean.valueOf(!function1.invoke(kotlinCompilation).booleanValue());
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void group$default(KotlinHierarchyBuilder kotlinHierarchyBuilder, String str, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: group");
                return;
            }
            if ((i & 2) != 0) {
                function1 = new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyBuilder$group$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder2) {
                        invoke2(kotlinHierarchyBuilder2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder2) {
                        kotlinHierarchyBuilder2.getClass();
                    }
                };
            }
            kotlinHierarchyBuilder.group(str, function1);
        }

        @Deprecated(message = "Use 'excludeCompilations' instead", replaceWith = @ReplaceWith(expression = "excludeCompilations(predicate)", imports = {}))
        public static void withoutCompilations(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder, @NotNull Function1<? super KotlinCompilation<?>, Boolean> function1) {
            function1.getClass();
            kotlinHierarchyBuilder.excludeCompilations(function1);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @KotlinTargetsDsl
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&¢\u0006\u0002\u0010\u0007J!\u0010\t\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyBuilder$Root;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyBuilder;", "excludeSourceSetTree", "", "tree", "", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinSourceSetTree;", "([Lorg/jetbrains/kotlin/gradle/plugin/KotlinSourceSetTree;)V", "sourceSetTrees", "withSourceSetTree", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @ExperimentalKotlinGradlePluginApi
    public interface Root extends KotlinHierarchyBuilder {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class DefaultImpls {
            public static void common(@NotNull Root root, @NotNull Function1<? super KotlinHierarchyBuilder, Unit> function1) {
                function1.getClass();
                DefaultImpls.common(root, function1);
            }

            @Deprecated(message = "Use plain 'withoutCompilations(!predicate) instead'", replaceWith = @ReplaceWith(expression = "withoutCompilations { !predicate(it) }", imports = {}))
            public static void filterCompilations(@NotNull Root root, @NotNull Function1<? super KotlinCompilation<?>, Boolean> function1) {
                function1.getClass();
                DefaultImpls.filterCompilations(root, function1);
            }

            @Deprecated(message = "Use 'excludeCompilations' instead", replaceWith = @ReplaceWith(expression = "excludeCompilations(predicate)", imports = {}))
            public static void withoutCompilations(@NotNull Root root, @NotNull Function1<? super KotlinCompilation<?>, Boolean> function1) {
                function1.getClass();
                DefaultImpls.withoutCompilations(root, function1);
            }
        }

        void excludeSourceSetTree(@NotNull KotlinSourceSetTree... tree);

        void sourceSetTrees(@NotNull KotlinSourceSetTree... tree);

        void withSourceSetTree(@NotNull KotlinSourceSetTree... tree);
    }

    void common(@NotNull Function1<? super KotlinHierarchyBuilder, Unit> build);

    void excludeCompilations(@NotNull Function1<? super KotlinCompilation<?>, Boolean> predicate);

    @Deprecated(message = "Use plain 'withoutCompilations(!predicate) instead'", replaceWith = @ReplaceWith(expression = "withoutCompilations { !predicate(it) }", imports = {}))
    void filterCompilations(@NotNull Function1<? super KotlinCompilation<?>, Boolean> predicate);

    void group(@NotNull String name, @NotNull Function1<? super KotlinHierarchyBuilder, Unit> build);

    @Deprecated(message = "Renamed to 'withAndroidTarget''", replaceWith = @ReplaceWith(expression = "withAndroidTarget()", imports = {}))
    void withAndroid();

    void withAndroidNative();

    void withAndroidNativeArm32();

    void withAndroidNativeArm64();

    void withAndroidNativeX64();

    void withAndroidNativeX86();

    void withAndroidTarget();

    void withApple();

    void withCompilations(@NotNull Function1<? super KotlinCompilation<?>, Boolean> predicate);

    void withIos();

    void withIosArm32();

    void withIosArm64();

    void withIosSimulatorArm64();

    void withIosX64();

    void withJs();

    void withJvm();

    void withLinux();

    @Deprecated(level = DeprecationLevel.ERROR, message = KonanTargetKt.DEPRECATED_TARGET_MESSAGE)
    void withLinuxArm32Hfp();

    void withLinuxArm64();

    @Deprecated(level = DeprecationLevel.ERROR, message = KonanTargetKt.DEPRECATED_TARGET_MESSAGE)
    void withLinuxMips32();

    @Deprecated(level = DeprecationLevel.ERROR, message = KonanTargetKt.DEPRECATED_TARGET_MESSAGE)
    void withLinuxMipsel32();

    void withLinuxX64();

    void withMacos();

    void withMacosArm64();

    void withMacosX64();

    void withMingw();

    void withMingwX64();

    @Deprecated(level = DeprecationLevel.ERROR, message = KonanTargetKt.DEPRECATED_TARGET_MESSAGE)
    void withMingwX86();

    void withNative();

    void withTvos();

    void withTvosArm64();

    void withTvosSimulatorArm64();

    void withTvosX64();

    void withWasm();

    @Deprecated(level = DeprecationLevel.ERROR, message = KonanTargetKt.DEPRECATED_TARGET_MESSAGE)
    void withWasm32();

    void withWatchos();

    void withWatchosArm32();

    void withWatchosArm64();

    void withWatchosDeviceArm64();

    void withWatchosSimulatorArm64();

    void withWatchosX64();

    @Deprecated(level = DeprecationLevel.ERROR, message = KonanTargetKt.DEPRECATED_TARGET_MESSAGE)
    void withWatchosX86();

    @Deprecated(message = "Use 'excludeCompilations' instead", replaceWith = @ReplaceWith(expression = "excludeCompilations(predicate)", imports = {}))
    void withoutCompilations(@NotNull Function1<? super KotlinCompilation<?>, Boolean> predicate);
}
