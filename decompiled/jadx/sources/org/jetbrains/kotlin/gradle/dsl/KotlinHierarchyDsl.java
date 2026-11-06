package org.jetbrains.kotlin.gradle.dsl;

import com.amazon.alexa.accessory.notificationpublisher.servicerequest.GetFocusFilterTemplatesFromS3RequestSender;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi;
import org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyBuilder;
import org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0007H'J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0007H'¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinHierarchyDsl;", "", "applyHierarchyTemplate", "", GetFocusFilterTemplatesFromS3RequestSender.TEMPLATE_KEY, "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyBuilder$Root;", "Lkotlin/ExtensionFunctionType;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplate;", "extension", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinHierarchyDsl {
    @ExperimentalKotlinGradlePluginApi
    void applyHierarchyTemplate(@NotNull Function1<? super KotlinHierarchyBuilder.Root, Unit> template);

    void applyHierarchyTemplate(@NotNull KotlinHierarchyTemplate template);

    @ExperimentalKotlinGradlePluginApi
    void applyHierarchyTemplate(@NotNull KotlinHierarchyTemplate template, @NotNull Function1<? super KotlinHierarchyBuilder.Root, Unit> extension);
}
