package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.gradle.api.NamedDomainObjectCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.DeprecatedTargetPresetApi;
import org.jetbrains.kotlin.gradle.DeprecatedTargetPresetApiKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DeprecatedTargetPresetApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R$\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetsContainerWithPresets;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetsContainer;", "presets", "Lorg/gradle/api/NamedDomainObjectCollection;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetPreset;", "getPresets$annotations", "()V", "getPresets", "()Lorg/gradle/api/NamedDomainObjectCollection;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinTargetsContainerWithPresets extends KotlinTargetsContainer {
    @NotNull
    NamedDomainObjectCollection<KotlinTargetPreset<?>> getPresets();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.WARNING, message = DeprecatedTargetPresetApiKt.PRESETS_API_IS_DEPRECATED_MESSAGE)
        public static /* synthetic */ void getPresets$annotations() {
        }
    }
}
