package org.jetbrains.kotlin.gradle.tasks;

import kotlin.Metadata;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Nested;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/UsesKotlinJavaToolchain;", "Lorg/gradle/api/Task;", "kotlinJavaToolchain", "Lorg/jetbrains/kotlin/gradle/tasks/KotlinJavaToolchain;", "getKotlinJavaToolchain", "()Lorg/jetbrains/kotlin/gradle/tasks/KotlinJavaToolchain;", "kotlinJavaToolchainProvider", "Lorg/gradle/api/provider/Provider;", "getKotlinJavaToolchainProvider", "()Lorg/gradle/api/provider/Provider;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface UsesKotlinJavaToolchain extends Task {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Internal
        @NotNull
        public static KotlinJavaToolchain getKotlinJavaToolchain(@NotNull UsesKotlinJavaToolchain usesKotlinJavaToolchain) {
            Object obj = usesKotlinJavaToolchain.getKotlinJavaToolchainProvider().get();
            obj.getClass();
            return (KotlinJavaToolchain) obj;
        }
    }

    @Internal
    @NotNull
    KotlinJavaToolchain getKotlinJavaToolchain();

    @Nested
    @NotNull
    Provider<? extends KotlinJavaToolchain> getKotlinJavaToolchainProvider();
}
