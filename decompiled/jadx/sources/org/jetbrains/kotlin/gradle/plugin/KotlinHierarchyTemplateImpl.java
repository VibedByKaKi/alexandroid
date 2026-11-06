package org.jetbrains.kotlin.gradle.plugin;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001e\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0004R\u001f\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplateImpl;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplate;", "describe", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyBuilder$Root;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "layout", "builder", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class KotlinHierarchyTemplateImpl implements KotlinHierarchyTemplate {

    @NotNull
    private final Function1<KotlinHierarchyBuilder.Root, Unit> describe;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinHierarchyTemplateImpl(@NotNull Function1<? super KotlinHierarchyBuilder.Root, Unit> function1) {
        function1.getClass();
        this.describe = function1;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof KotlinHierarchyTemplateImpl) {
            return Intrinsics.areEqual(this.describe, ((KotlinHierarchyTemplateImpl) other).describe);
        }
        return false;
    }

    public int hashCode() {
        return this.describe.hashCode();
    }

    public final void layout(@NotNull KotlinHierarchyBuilder.Root builder) {
        builder.getClass();
        this.describe.invoke(builder);
    }
}
