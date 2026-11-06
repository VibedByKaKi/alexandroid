package org.jetbrains.kotlin.gradle.dsl;

import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.plugin.mpp.BitcodeEmbeddingMode;
import org.jetbrains.kotlin.konan.target.KonanTarget;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeFatFramework;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeArtifact;", "embedBitcode", "Lorg/jetbrains/kotlin/gradle/plugin/mpp/BitcodeEmbeddingMode;", "getEmbedBitcode", "()Lorg/jetbrains/kotlin/gradle/plugin/mpp/BitcodeEmbeddingMode;", "targets", "", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "getTargets", "()Ljava/util/Set;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinNativeFatFramework extends KotlinNativeArtifact {
    @Nullable
    BitcodeEmbeddingMode getEmbedBitcode();

    @NotNull
    Set<KonanTarget> getTargets();
}
