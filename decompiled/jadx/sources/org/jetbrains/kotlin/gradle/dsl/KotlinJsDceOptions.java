package org.jetbrains.kotlin.gradle.dsl;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonToolOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR.\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\r8V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinJsDceOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonToolOptions;", "value", "", "devMode", "getDevMode", "()Z", "setDevMode", "(Z)V", "options", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinJsDceCompilerToolOptions;", "getOptions", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinJsDceCompilerToolOptions;", "", "outputDirectory", "getOutputDirectory$annotations", "()V", "getOutputDirectory", "()Ljava/lang/String;", "setOutputDirectory", "(Ljava/lang/String;)V", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinJsDceOptions extends KotlinCommonToolOptions {
    boolean getDevMode();

    @Override // org.jetbrains.kotlin.gradle.dsl.KotlinCommonToolOptions
    @NotNull
    KotlinJsDceCompilerToolOptions getOptions();

    @Nullable
    String getOutputDirectory();

    void setDevMode(boolean z);

    void setOutputDirectory(@Nullable String str);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getAllWarningsAsErrors(@NotNull KotlinJsDceOptions kotlinJsDceOptions) {
            return KotlinCommonToolOptions.DefaultImpls.getAllWarningsAsErrors(kotlinJsDceOptions);
        }

        public static boolean getDevMode(@NotNull KotlinJsDceOptions kotlinJsDceOptions) {
            Object obj = kotlinJsDceOptions.getOptions().getDevMode().get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        @NotNull
        public static List<String> getFreeCompilerArgs(@NotNull KotlinJsDceOptions kotlinJsDceOptions) {
            return KotlinCommonToolOptions.DefaultImpls.getFreeCompilerArgs(kotlinJsDceOptions);
        }

        @Nullable
        public static String getOutputDirectory(@NotNull KotlinJsDceOptions kotlinJsDceOptions) {
            return (String) kotlinJsDceOptions.getOptions().getOutputDirectory().getOrNull();
        }

        public static boolean getSuppressWarnings(@NotNull KotlinJsDceOptions kotlinJsDceOptions) {
            return KotlinCommonToolOptions.DefaultImpls.getSuppressWarnings(kotlinJsDceOptions);
        }

        public static boolean getVerbose(@NotNull KotlinJsDceOptions kotlinJsDceOptions) {
            return KotlinCommonToolOptions.DefaultImpls.getVerbose(kotlinJsDceOptions);
        }

        public static void setAllWarningsAsErrors(@NotNull KotlinJsDceOptions kotlinJsDceOptions, boolean z) {
            KotlinCommonToolOptions.DefaultImpls.setAllWarningsAsErrors(kotlinJsDceOptions, z);
        }

        public static void setDevMode(@NotNull KotlinJsDceOptions kotlinJsDceOptions, boolean z) {
            kotlinJsDceOptions.getOptions().getDevMode().set(Boolean.valueOf(z));
        }

        public static void setFreeCompilerArgs(@NotNull KotlinJsDceOptions kotlinJsDceOptions, @NotNull List<String> list) {
            list.getClass();
            KotlinCommonToolOptions.DefaultImpls.setFreeCompilerArgs(kotlinJsDceOptions, list);
        }

        public static void setOutputDirectory(@NotNull KotlinJsDceOptions kotlinJsDceOptions, @Nullable String str) {
            kotlinJsDceOptions.getOptions().getOutputDirectory().set(str);
        }

        public static void setSuppressWarnings(@NotNull KotlinJsDceOptions kotlinJsDceOptions, boolean z) {
            KotlinCommonToolOptions.DefaultImpls.setSuppressWarnings(kotlinJsDceOptions, z);
        }

        public static void setVerbose(@NotNull KotlinJsDceOptions kotlinJsDceOptions, boolean z) {
            KotlinCommonToolOptions.DefaultImpls.setVerbose(kotlinJsDceOptions, z);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Use task 'destinationDirectory' to configure output directory")
        public static /* synthetic */ void getOutputDirectory$annotations() {
        }
    }
}
