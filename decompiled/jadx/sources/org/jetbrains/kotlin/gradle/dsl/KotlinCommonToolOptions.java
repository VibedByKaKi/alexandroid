package org.jetbrains.kotlin.gradle.dsl;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR$\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonToolOptions;", "", "value", "", "allWarningsAsErrors", "getAllWarningsAsErrors", "()Z", "setAllWarningsAsErrors", "(Z)V", "", "", "freeCompilerArgs", "getFreeCompilerArgs", "()Ljava/util/List;", "setFreeCompilerArgs", "(Ljava/util/List;)V", "options", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerToolOptions;", "getOptions", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerToolOptions;", "suppressWarnings", "getSuppressWarnings", "setSuppressWarnings", "verbose", "getVerbose", "setVerbose", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinCommonToolOptions {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getAllWarningsAsErrors(@NotNull KotlinCommonToolOptions kotlinCommonToolOptions) {
            Object obj = kotlinCommonToolOptions.getOptions().getAllWarningsAsErrors().get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        @NotNull
        public static List<String> getFreeCompilerArgs(@NotNull KotlinCommonToolOptions kotlinCommonToolOptions) {
            Object obj = kotlinCommonToolOptions.getOptions().getFreeCompilerArgs().get();
            obj.getClass();
            return (List) obj;
        }

        public static boolean getSuppressWarnings(@NotNull KotlinCommonToolOptions kotlinCommonToolOptions) {
            Object obj = kotlinCommonToolOptions.getOptions().getSuppressWarnings().get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        public static boolean getVerbose(@NotNull KotlinCommonToolOptions kotlinCommonToolOptions) {
            Object obj = kotlinCommonToolOptions.getOptions().getVerbose().get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        public static void setAllWarningsAsErrors(@NotNull KotlinCommonToolOptions kotlinCommonToolOptions, boolean z) {
            kotlinCommonToolOptions.getOptions().getAllWarningsAsErrors().set(Boolean.valueOf(z));
        }

        public static void setFreeCompilerArgs(@NotNull KotlinCommonToolOptions kotlinCommonToolOptions, @NotNull List<String> list) {
            list.getClass();
            kotlinCommonToolOptions.getOptions().getFreeCompilerArgs().set(list);
        }

        public static void setSuppressWarnings(@NotNull KotlinCommonToolOptions kotlinCommonToolOptions, boolean z) {
            kotlinCommonToolOptions.getOptions().getSuppressWarnings().set(Boolean.valueOf(z));
        }

        public static void setVerbose(@NotNull KotlinCommonToolOptions kotlinCommonToolOptions, boolean z) {
            kotlinCommonToolOptions.getOptions().getVerbose().set(Boolean.valueOf(z));
        }
    }

    boolean getAllWarningsAsErrors();

    @NotNull
    List<String> getFreeCompilerArgs();

    @NotNull
    KotlinCommonCompilerToolOptions getOptions();

    boolean getSuppressWarnings();

    boolean getVerbose();

    void setAllWarningsAsErrors(boolean z);

    void setFreeCompilerArgs(@NotNull List<String> list);

    void setSuppressWarnings(boolean z);

    void setVerbose(boolean z);
}
