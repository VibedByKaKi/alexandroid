package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplate;", "", "Templates", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplateImpl;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinHierarchyTemplate {

    /* renamed from: Templates, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplate$Templates;", "", "()V", "default", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplate;", "getDefault", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplate;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplate$Templates, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KotlinHierarchyTemplate getDefault() {
            KotlinHierarchyTemplate kotlinHierarchyTemplate;
            kotlinHierarchyTemplate = KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate;
            return kotlinHierarchyTemplate;
        }
    }
}
