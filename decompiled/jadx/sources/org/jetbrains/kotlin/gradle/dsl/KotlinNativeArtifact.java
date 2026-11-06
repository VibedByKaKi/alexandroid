package org.jetbrains.kotlin.gradle.dsl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR#\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinNativeArtifact;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinArtifact;", "binaryOptions", "", "", "getBinaryOptions", "()Ljava/util/Map;", "isStatic", "", "()Z", "kotlinOptionsFn", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonToolOptions;", "", "Lkotlin/ExtensionFunctionType;", "getKotlinOptionsFn", "()Lkotlin/jvm/functions/Function1;", "linkerOptions", "", "getLinkerOptions", "()Ljava/util/List;", "modes", "", "Lorg/jetbrains/kotlin/gradle/plugin/mpp/NativeBuildType;", "getModes", "()Ljava/util/Set;", "toolOptionsConfigure", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerToolOptions;", "getToolOptionsConfigure", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinNativeArtifact extends KotlinArtifact {
    @NotNull
    Map<String, String> getBinaryOptions();

    @NotNull
    Function1<KotlinCommonToolOptions, Unit> getKotlinOptionsFn();

    @NotNull
    List<String> getLinkerOptions();

    @NotNull
    Set<NativeBuildType> getModes();

    @NotNull
    Function1<KotlinCommonCompilerToolOptions, Unit> getToolOptionsConfigure();

    boolean isStatic();
}
