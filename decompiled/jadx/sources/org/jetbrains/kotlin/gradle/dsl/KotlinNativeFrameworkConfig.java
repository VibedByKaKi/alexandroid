package org.jetbrains.kotlin.gradle.dsl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.plugin.mpp.BitcodeEmbeddingMode;
import org.jetbrains.kotlin.konan.target.KonanTarget;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeFrameworkConfig;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeArtifactConfig;", "embedBitcode", "Lorg/jetbrains/kotlin/gradle/plugin/mpp/BitcodeEmbeddingMode;", "getEmbedBitcode", "()Lorg/jetbrains/kotlin/gradle/plugin/mpp/BitcodeEmbeddingMode;", "setEmbedBitcode", "(Lorg/jetbrains/kotlin/gradle/plugin/mpp/BitcodeEmbeddingMode;)V", "target", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "getTarget", "()Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "setTarget", "(Lorg/jetbrains/kotlin/konan/target/KonanTarget;)V", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinNativeFrameworkConfig extends KotlinNativeArtifactConfig {
    @Nullable
    BitcodeEmbeddingMode getEmbedBitcode();

    @NotNull
    KonanTarget getTarget();

    void setEmbedBitcode(@Nullable BitcodeEmbeddingMode bitcodeEmbeddingMode);

    void setTarget(@NotNull KonanTarget konanTarget);
}
