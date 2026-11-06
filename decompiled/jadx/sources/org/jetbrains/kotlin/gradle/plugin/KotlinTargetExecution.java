package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.plugin.KotlinExecution;
import org.jetbrains.kotlin.gradle.plugin.KotlinExecution.ExecutionSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetExecution;", "SourceType", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinExecution$ExecutionSource;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinExecution;", "target", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "getTarget", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinTargetExecution<SourceType extends KotlinExecution.ExecutionSource> extends KotlinExecution<SourceType> {
    @NotNull
    KotlinTarget getTarget();
}
