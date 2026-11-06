package org.jetbrains.kotlin.gradle.dsl;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.gradle.api.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH&J\u0016\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&J!\u0010\u000e\u001a\u00020\u00162\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u001d\"\u00020\u0010H&¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001bH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeArtifactConfig;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinArtifactConfig;", "isStatic", "", "()Z", "setStatic", "(Z)V", "linkerOptions", "", "", "getLinkerOptions", "()Ljava/util/List;", "setLinkerOptions", "(Ljava/util/List;)V", "modes", "", "Lorg/jetbrains/kotlin/gradle/plugin/mpp/NativeBuildType;", "getModes", "()Ljava/util/Set;", "setModes", "(Ljava/util/Set;)V", "binaryOption", "", "name", "value", "kotlinOptions", "fn", "Lorg/gradle/api/Action;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonToolOptions;", "", "([Lorg/jetbrains/kotlin/gradle/plugin/mpp/NativeBuildType;)V", "toolOptions", "configure", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerToolOptions;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinNativeArtifactConfig extends KotlinArtifactConfig {
    void binaryOption(@NotNull String name, @NotNull String value);

    @NotNull
    List<String> getLinkerOptions();

    @NotNull
    Set<NativeBuildType> getModes();

    boolean isStatic();

    void kotlinOptions(@NotNull Action<KotlinCommonToolOptions> fn);

    void modes(@NotNull NativeBuildType... modes);

    void setLinkerOptions(@NotNull List<String> list);

    void setModes(@NotNull Set<? extends NativeBuildType> set);

    void setStatic(boolean z);

    void toolOptions(@NotNull Action<KotlinCommonCompilerToolOptions> configure);
}
