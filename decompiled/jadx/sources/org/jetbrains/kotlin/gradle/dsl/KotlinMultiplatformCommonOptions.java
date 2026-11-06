package org.jetbrains.kotlin.gradle.dsl;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinMultiplatformCommonOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "options", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinMultiplatformCommonCompilerOptions;", "getOptions", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinMultiplatformCommonCompilerOptions;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinMultiplatformCommonOptions extends KotlinCommonOptions {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getAllWarningsAsErrors(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions) {
            return KotlinCommonOptions.DefaultImpls.getAllWarningsAsErrors(kotlinMultiplatformCommonOptions);
        }

        @Nullable
        public static String getApiVersion(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions) {
            return KotlinCommonOptions.DefaultImpls.getApiVersion(kotlinMultiplatformCommonOptions);
        }

        @NotNull
        public static List<String> getFreeCompilerArgs(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions) {
            return KotlinCommonOptions.DefaultImpls.getFreeCompilerArgs(kotlinMultiplatformCommonOptions);
        }

        @Nullable
        public static String getLanguageVersion(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions) {
            return KotlinCommonOptions.DefaultImpls.getLanguageVersion(kotlinMultiplatformCommonOptions);
        }

        public static boolean getSuppressWarnings(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions) {
            return KotlinCommonOptions.DefaultImpls.getSuppressWarnings(kotlinMultiplatformCommonOptions);
        }

        public static boolean getUseK2(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions) {
            return KotlinCommonOptions.DefaultImpls.getUseK2(kotlinMultiplatformCommonOptions);
        }

        public static boolean getVerbose(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions) {
            return KotlinCommonOptions.DefaultImpls.getVerbose(kotlinMultiplatformCommonOptions);
        }

        public static void setAllWarningsAsErrors(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions, boolean z) {
            KotlinCommonOptions.DefaultImpls.setAllWarningsAsErrors(kotlinMultiplatformCommonOptions, z);
        }

        public static void setApiVersion(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions, @Nullable String str) {
            KotlinCommonOptions.DefaultImpls.setApiVersion(kotlinMultiplatformCommonOptions, str);
        }

        public static void setFreeCompilerArgs(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions, @NotNull List<String> list) {
            list.getClass();
            KotlinCommonOptions.DefaultImpls.setFreeCompilerArgs(kotlinMultiplatformCommonOptions, list);
        }

        public static void setLanguageVersion(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions, @Nullable String str) {
            KotlinCommonOptions.DefaultImpls.setLanguageVersion(kotlinMultiplatformCommonOptions, str);
        }

        public static void setSuppressWarnings(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions, boolean z) {
            KotlinCommonOptions.DefaultImpls.setSuppressWarnings(kotlinMultiplatformCommonOptions, z);
        }

        public static void setUseK2(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions, boolean z) {
            KotlinCommonOptions.DefaultImpls.setUseK2(kotlinMultiplatformCommonOptions, z);
        }

        public static void setVerbose(@NotNull KotlinMultiplatformCommonOptions kotlinMultiplatformCommonOptions, boolean z) {
            KotlinCommonOptions.DefaultImpls.setVerbose(kotlinMultiplatformCommonOptions, z);
        }
    }

    @Override // org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions, org.jetbrains.kotlin.gradle.dsl.KotlinCommonToolOptions
    @NotNull
    KotlinMultiplatformCommonCompilerOptions getOptions();
}
