package org.jetbrains.kotlin.gradle.dsl;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\t8BX\u0082\u0004R\u000f\u0010\u001b\u001a\u00020\t*\u00020\u001a8BX\u0082\u0004¨\u0006\u001c"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinJvmOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "value", "", "javaParameters", "getJavaParameters", "()Z", "setJavaParameters", "(Z)V", "", "jvmTarget", "getJvmTarget", "()Ljava/lang/String;", "setJvmTarget", "(Ljava/lang/String;)V", "moduleName", "getModuleName", "setModuleName", "noJdk", "getNoJdk", "setNoJdk", "options", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinJvmCompilerOptions;", "getOptions", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinJvmCompilerOptions;", "jvmTargetCompilerOption", "Lorg/jetbrains/kotlin/gradle/dsl/JvmTarget;", "jvmTargetKotlinOption", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinJvmOptions extends KotlinCommonOptions {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getAllWarningsAsErrors(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            return KotlinCommonOptions.DefaultImpls.getAllWarningsAsErrors(kotlinJvmOptions);
        }

        @Nullable
        public static String getApiVersion(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            return KotlinCommonOptions.DefaultImpls.getApiVersion(kotlinJvmOptions);
        }

        @NotNull
        public static List<String> getFreeCompilerArgs(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            return KotlinCommonOptions.DefaultImpls.getFreeCompilerArgs(kotlinJvmOptions);
        }

        public static boolean getJavaParameters(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            Object obj = kotlinJvmOptions.getOptions().getJavaParameters().get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        @NotNull
        public static String getJvmTarget(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            Object obj = kotlinJvmOptions.getOptions().getJvmTarget().get();
            obj.getClass();
            return getJvmTargetKotlinOption(kotlinJvmOptions, (JvmTarget) obj);
        }

        private static JvmTarget getJvmTargetCompilerOption(KotlinJvmOptions kotlinJvmOptions, String str) {
            if (str != null) {
                return JvmTarget.INSTANCE.fromTarget(str);
            }
            return null;
        }

        private static String getJvmTargetKotlinOption(KotlinJvmOptions kotlinJvmOptions, JvmTarget jvmTarget) {
            return jvmTarget.getTarget();
        }

        @Nullable
        public static String getLanguageVersion(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            return KotlinCommonOptions.DefaultImpls.getLanguageVersion(kotlinJvmOptions);
        }

        @Nullable
        public static String getModuleName(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            return (String) kotlinJvmOptions.getOptions().getModuleName().getOrNull();
        }

        public static boolean getNoJdk(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            Object obj = kotlinJvmOptions.getOptions().getNoJdk().get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        public static boolean getSuppressWarnings(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            return KotlinCommonOptions.DefaultImpls.getSuppressWarnings(kotlinJvmOptions);
        }

        public static boolean getUseK2(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            return KotlinCommonOptions.DefaultImpls.getUseK2(kotlinJvmOptions);
        }

        public static boolean getVerbose(@NotNull KotlinJvmOptions kotlinJvmOptions) {
            return KotlinCommonOptions.DefaultImpls.getVerbose(kotlinJvmOptions);
        }

        public static void setAllWarningsAsErrors(@NotNull KotlinJvmOptions kotlinJvmOptions, boolean z) {
            KotlinCommonOptions.DefaultImpls.setAllWarningsAsErrors(kotlinJvmOptions, z);
        }

        public static void setApiVersion(@NotNull KotlinJvmOptions kotlinJvmOptions, @Nullable String str) {
            KotlinCommonOptions.DefaultImpls.setApiVersion(kotlinJvmOptions, str);
        }

        public static void setFreeCompilerArgs(@NotNull KotlinJvmOptions kotlinJvmOptions, @NotNull List<String> list) {
            list.getClass();
            KotlinCommonOptions.DefaultImpls.setFreeCompilerArgs(kotlinJvmOptions, list);
        }

        public static void setJavaParameters(@NotNull KotlinJvmOptions kotlinJvmOptions, boolean z) {
            kotlinJvmOptions.getOptions().getJavaParameters().set(Boolean.valueOf(z));
        }

        public static void setJvmTarget(@NotNull KotlinJvmOptions kotlinJvmOptions, @NotNull String str) {
            str.getClass();
            kotlinJvmOptions.getOptions().getJvmTarget().set(getJvmTargetCompilerOption(kotlinJvmOptions, str));
        }

        public static void setLanguageVersion(@NotNull KotlinJvmOptions kotlinJvmOptions, @Nullable String str) {
            KotlinCommonOptions.DefaultImpls.setLanguageVersion(kotlinJvmOptions, str);
        }

        public static void setModuleName(@NotNull KotlinJvmOptions kotlinJvmOptions, @Nullable String str) {
            kotlinJvmOptions.getOptions().getModuleName().set(str);
        }

        public static void setNoJdk(@NotNull KotlinJvmOptions kotlinJvmOptions, boolean z) {
            kotlinJvmOptions.getOptions().getNoJdk().set(Boolean.valueOf(z));
        }

        public static void setSuppressWarnings(@NotNull KotlinJvmOptions kotlinJvmOptions, boolean z) {
            KotlinCommonOptions.DefaultImpls.setSuppressWarnings(kotlinJvmOptions, z);
        }

        public static void setUseK2(@NotNull KotlinJvmOptions kotlinJvmOptions, boolean z) {
            KotlinCommonOptions.DefaultImpls.setUseK2(kotlinJvmOptions, z);
        }

        public static void setVerbose(@NotNull KotlinJvmOptions kotlinJvmOptions, boolean z) {
            KotlinCommonOptions.DefaultImpls.setVerbose(kotlinJvmOptions, z);
        }
    }

    boolean getJavaParameters();

    @NotNull
    String getJvmTarget();

    @Nullable
    String getModuleName();

    boolean getNoJdk();

    @Override // org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions, org.jetbrains.kotlin.gradle.dsl.KotlinCommonToolOptions
    @NotNull
    KotlinJvmCompilerOptions getOptions();

    void setJavaParameters(boolean z);

    void setJvmTarget(@NotNull String str);

    void setModuleName(@Nullable String str);

    void setNoJdk(boolean z);
}
