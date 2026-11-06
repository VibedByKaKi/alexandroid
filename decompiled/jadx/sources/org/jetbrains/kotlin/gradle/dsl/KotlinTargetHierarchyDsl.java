package org.jetbrains.kotlin.gradle.dsl;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi;
import org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyBuilder;
import org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "Use 'KotlinHierarchyTemplate' instead")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\tH&J!\u0010\n\u001a\u00020\u00032\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH&J%\u0010\f\u001a\u00020\u00032\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\tH&¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinTargetHierarchyDsl;", "", "apply", "", "hierarchyDescriptor", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplate;", "describeExtension", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyBuilder$Root;", "Lkotlin/ExtensionFunctionType;", "custom", "describe", "default", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
@ExperimentalKotlinGradlePluginApi
/* loaded from: classes11.dex */
public interface KotlinTargetHierarchyDsl {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void apply$default(KotlinTargetHierarchyDsl kotlinTargetHierarchyDsl, KotlinHierarchyTemplate kotlinHierarchyTemplate, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: apply");
                return;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            kotlinTargetHierarchyDsl.apply(kotlinHierarchyTemplate, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void default$default(KotlinTargetHierarchyDsl kotlinTargetHierarchyDsl, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: default");
                return;
            }
            if ((i & 1) != 0) {
                function1 = null;
            }
            kotlinTargetHierarchyDsl.m27385default(function1);
        }
    }

    void apply(@NotNull KotlinHierarchyTemplate hierarchyDescriptor, @Nullable Function1<? super KotlinHierarchyBuilder.Root, Unit> describeExtension);

    void custom(@NotNull Function1<? super KotlinHierarchyBuilder.Root, Unit> describe);

    /* renamed from: default, reason: not valid java name */
    void m27385default(@Nullable Function1<? super KotlinHierarchyBuilder.Root, Unit> describeExtension);
}
