package org.jetbrains.kotlin.gradle.dsl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.gradle.api.Action;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H'J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H'J\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H'J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H'¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeArtifactDSL;", "", "FatFramework", "", "name", "", "configure", "Lorg/gradle/api/Action;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeFatFrameworkConfig;", "Framework", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeFrameworkConfig;", "Library", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeLibraryConfig;", "XCFramework", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeXCFrameworkConfig;", "ExperimentalArtifactDsl", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinNativeArtifactDSL {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.METHOD})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeArtifactDSL$ExperimentalArtifactDsl;", "", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @RequiresOptIn(level = RequiresOptIn.Level.WARNING, message = "This API is experimental. It may be changed in the future.")
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface ExperimentalArtifactDsl {
    }

    @ExperimentalArtifactDsl
    void FatFramework(@NotNull String name, @NotNull Action<KotlinNativeFatFrameworkConfig> configure);

    @ExperimentalArtifactDsl
    void FatFramework(@NotNull Action<KotlinNativeFatFrameworkConfig> configure);

    @ExperimentalArtifactDsl
    void Framework(@NotNull String name, @NotNull Action<KotlinNativeFrameworkConfig> configure);

    @ExperimentalArtifactDsl
    void Framework(@NotNull Action<KotlinNativeFrameworkConfig> configure);

    @ExperimentalArtifactDsl
    void Library(@NotNull String name, @NotNull Action<KotlinNativeLibraryConfig> configure);

    @ExperimentalArtifactDsl
    void Library(@NotNull Action<KotlinNativeLibraryConfig> configure);

    @ExperimentalArtifactDsl
    void XCFramework(@NotNull String name, @NotNull Action<KotlinNativeXCFrameworkConfig> configure);

    @ExperimentalArtifactDsl
    void XCFramework(@NotNull Action<KotlinNativeXCFrameworkConfig> configure);
}
