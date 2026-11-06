package org.jetbrains.kotlin.gradle.dsl;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonToolOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R(\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00108V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\u00038BX\u0082\u0004R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00198BX\u0082\u0004R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\u00038BX\u0082\u0004R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00198BX\u0082\u0004¨\u0006\u001d"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonToolOptions;", "value", "", "apiVersion", "getApiVersion", "()Ljava/lang/String;", "setApiVersion", "(Ljava/lang/String;)V", "languageVersion", "getLanguageVersion", "setLanguageVersion", "options", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerOptions;", "getOptions", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerOptions;", "", "useK2", "getUseK2$annotations", "()V", "getUseK2", "()Z", "setUseK2", "(Z)V", "apiVersionCompilerOption", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinVersion;", "apiVersionKotlinOption", "languageVersionCompilerOption", "languageVersionKotlinOption", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinCommonOptions extends KotlinCommonToolOptions {
    @Nullable
    String getApiVersion();

    @Nullable
    String getLanguageVersion();

    @Override // org.jetbrains.kotlin.gradle.dsl.KotlinCommonToolOptions
    @NotNull
    KotlinCommonCompilerOptions getOptions();

    boolean getUseK2();

    void setApiVersion(@Nullable String str);

    void setLanguageVersion(@Nullable String str);

    void setUseK2(boolean z);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getAllWarningsAsErrors(@NotNull KotlinCommonOptions kotlinCommonOptions) {
            return KotlinCommonToolOptions.DefaultImpls.getAllWarningsAsErrors(kotlinCommonOptions);
        }

        @Nullable
        public static String getApiVersion(@NotNull KotlinCommonOptions kotlinCommonOptions) {
            return getApiVersionKotlinOption(kotlinCommonOptions, (KotlinVersion) kotlinCommonOptions.getOptions().getApiVersion().getOrNull());
        }

        private static KotlinVersion getApiVersionCompilerOption(KotlinCommonOptions kotlinCommonOptions, String str) {
            if (str != null) {
                return KotlinVersion.INSTANCE.fromVersion(str);
            }
            return null;
        }

        private static String getApiVersionKotlinOption(KotlinCommonOptions kotlinCommonOptions, KotlinVersion kotlinVersion) {
            if (kotlinVersion != null) {
                return kotlinVersion.getVersion();
            }
            return null;
        }

        @NotNull
        public static List<String> getFreeCompilerArgs(@NotNull KotlinCommonOptions kotlinCommonOptions) {
            return KotlinCommonToolOptions.DefaultImpls.getFreeCompilerArgs(kotlinCommonOptions);
        }

        @Nullable
        public static String getLanguageVersion(@NotNull KotlinCommonOptions kotlinCommonOptions) {
            return getLanguageVersionKotlinOption(kotlinCommonOptions, (KotlinVersion) kotlinCommonOptions.getOptions().getLanguageVersion().getOrNull());
        }

        private static KotlinVersion getLanguageVersionCompilerOption(KotlinCommonOptions kotlinCommonOptions, String str) {
            if (str != null) {
                return KotlinVersion.INSTANCE.fromVersion(str);
            }
            return null;
        }

        private static String getLanguageVersionKotlinOption(KotlinCommonOptions kotlinCommonOptions, KotlinVersion kotlinVersion) {
            if (kotlinVersion != null) {
                return kotlinVersion.getVersion();
            }
            return null;
        }

        public static boolean getSuppressWarnings(@NotNull KotlinCommonOptions kotlinCommonOptions) {
            return KotlinCommonToolOptions.DefaultImpls.getSuppressWarnings(kotlinCommonOptions);
        }

        public static boolean getUseK2(@NotNull KotlinCommonOptions kotlinCommonOptions) {
            Object obj = kotlinCommonOptions.getOptions().getUseK2().get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        public static boolean getVerbose(@NotNull KotlinCommonOptions kotlinCommonOptions) {
            return KotlinCommonToolOptions.DefaultImpls.getVerbose(kotlinCommonOptions);
        }

        public static void setAllWarningsAsErrors(@NotNull KotlinCommonOptions kotlinCommonOptions, boolean z) {
            KotlinCommonToolOptions.DefaultImpls.setAllWarningsAsErrors(kotlinCommonOptions, z);
        }

        public static void setApiVersion(@NotNull KotlinCommonOptions kotlinCommonOptions, @Nullable String str) {
            kotlinCommonOptions.getOptions().getApiVersion().set(getApiVersionCompilerOption(kotlinCommonOptions, str));
        }

        public static void setFreeCompilerArgs(@NotNull KotlinCommonOptions kotlinCommonOptions, @NotNull List<String> list) {
            list.getClass();
            KotlinCommonToolOptions.DefaultImpls.setFreeCompilerArgs(kotlinCommonOptions, list);
        }

        public static void setLanguageVersion(@NotNull KotlinCommonOptions kotlinCommonOptions, @Nullable String str) {
            kotlinCommonOptions.getOptions().getLanguageVersion().set(getLanguageVersionCompilerOption(kotlinCommonOptions, str));
        }

        public static void setSuppressWarnings(@NotNull KotlinCommonOptions kotlinCommonOptions, boolean z) {
            KotlinCommonToolOptions.DefaultImpls.setSuppressWarnings(kotlinCommonOptions, z);
        }

        public static void setUseK2(@NotNull KotlinCommonOptions kotlinCommonOptions, boolean z) {
            kotlinCommonOptions.getOptions().getUseK2().set(Boolean.valueOf(z));
        }

        public static void setVerbose(@NotNull KotlinCommonOptions kotlinCommonOptions, boolean z) {
            KotlinCommonToolOptions.DefaultImpls.setVerbose(kotlinCommonOptions, z);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Compiler flag -Xuse-k2 is deprecated; please use language version 2.0 instead")
        public static /* synthetic */ void getUseK2$annotations() {
        }
    }
}
