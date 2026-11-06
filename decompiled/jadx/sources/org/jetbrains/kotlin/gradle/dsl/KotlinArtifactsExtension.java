package org.jetbrains.kotlin.gradle.dsl;

import kotlin.Metadata;
import org.gradle.api.DomainObjectSet;
import org.gradle.api.NamedDomainObjectSet;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinArtifactsExtension;", "", "Native", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeArtifactDSL;", "getNative", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeArtifactDSL;", "artifactConfigs", "Lorg/gradle/api/DomainObjectSet;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinArtifactConfig;", "getArtifactConfigs", "()Lorg/gradle/api/DomainObjectSet;", "artifacts", "Lorg/gradle/api/NamedDomainObjectSet;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinArtifact;", "getArtifacts", "()Lorg/gradle/api/NamedDomainObjectSet;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinArtifactsExtension {
    @NotNull
    DomainObjectSet<KotlinArtifactConfig> getArtifactConfigs();

    @NotNull
    NamedDomainObjectSet<KotlinArtifact> getArtifacts();

    @NotNull
    KotlinNativeArtifactDSL getNative();
}
