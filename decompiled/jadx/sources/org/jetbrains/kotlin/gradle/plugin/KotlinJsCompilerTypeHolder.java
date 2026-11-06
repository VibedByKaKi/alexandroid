package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinJsCompilerTypeHolder;", "", "BOTH", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinJsCompilerType;", "getBOTH$annotations", "()V", "getBOTH", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinJsCompilerType;", "IR", "getIR", "LEGACY", "getLEGACY$annotations", "getLEGACY", "compilerTypeFromProperties", "getCompilerTypeFromProperties$annotations", "getCompilerTypeFromProperties", "defaultJsCompilerType", "getDefaultJsCompilerType", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinJsCompilerTypeHolder {
    @NotNull
    KotlinJsCompilerType getBOTH();

    @Nullable
    KotlinJsCompilerType getCompilerTypeFromProperties();

    @NotNull
    KotlinJsCompilerType getDefaultJsCompilerType();

    @NotNull
    KotlinJsCompilerType getIR();

    @NotNull
    KotlinJsCompilerType getLEGACY();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static KotlinJsCompilerType getBOTH(@NotNull KotlinJsCompilerTypeHolder kotlinJsCompilerTypeHolder) {
            return KotlinJsCompilerType.BOTH;
        }

        @NotNull
        public static KotlinJsCompilerType getDefaultJsCompilerType(@NotNull KotlinJsCompilerTypeHolder kotlinJsCompilerTypeHolder) {
            KotlinJsCompilerType compilerTypeFromProperties = kotlinJsCompilerTypeHolder.getCompilerTypeFromProperties();
            return compilerTypeFromProperties == null ? KotlinJsCompilerType.IR : compilerTypeFromProperties;
        }

        @NotNull
        public static KotlinJsCompilerType getIR(@NotNull KotlinJsCompilerTypeHolder kotlinJsCompilerTypeHolder) {
            return KotlinJsCompilerType.IR;
        }

        @NotNull
        public static KotlinJsCompilerType getLEGACY(@NotNull KotlinJsCompilerTypeHolder kotlinJsCompilerTypeHolder) {
            return KotlinJsCompilerType.LEGACY;
        }

        @Deprecated(message = "Legacy compiler is deprecated. Migrate your project to the new IR-based compiler")
        public static /* synthetic */ void getBOTH$annotations() {
        }

        @Deprecated(message = "Because only IR compiler is left, no more necessary to know about compiler type in properties")
        public static /* synthetic */ void getCompilerTypeFromProperties$annotations() {
        }

        @Deprecated(message = "Legacy compiler is deprecated. Migrate your project to the new IR-based compiler")
        public static /* synthetic */ void getLEGACY$annotations() {
        }
    }
}
