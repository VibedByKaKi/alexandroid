package org.jetbrains.kotlin.gradle.dsl;

import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.plugin.mpp.BitcodeEmbeddingMode;
import org.jetbrains.kotlin.konan.target.KonanTarget;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\b\u001a\u00020\u000f2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0010\"\u00020\nH&¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeFatFrameworkConfig;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeArtifactConfig;", "embedBitcode", "Lorg/jetbrains/kotlin/gradle/plugin/mpp/BitcodeEmbeddingMode;", "getEmbedBitcode", "()Lorg/jetbrains/kotlin/gradle/plugin/mpp/BitcodeEmbeddingMode;", "setEmbedBitcode", "(Lorg/jetbrains/kotlin/gradle/plugin/mpp/BitcodeEmbeddingMode;)V", "targets", "", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "getTargets", "()Ljava/util/Set;", "setTargets", "(Ljava/util/Set;)V", "", "", "([Lorg/jetbrains/kotlin/konan/target/KonanTarget;)V", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinNativeFatFrameworkConfig extends KotlinNativeArtifactConfig {
    @Nullable
    BitcodeEmbeddingMode getEmbedBitcode();

    @NotNull
    Set<KonanTarget> getTargets();

    void setEmbedBitcode(@Nullable BitcodeEmbeddingMode bitcodeEmbeddingMode);

    void setTargets(@NotNull Set<? extends KonanTarget> set);

    void targets(@NotNull KonanTarget... targets);
}
