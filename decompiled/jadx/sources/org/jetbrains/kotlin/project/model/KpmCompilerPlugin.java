package org.jetbrains.kotlin.project.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmCompilerPlugin;", "", "forMetadataCompilation", "Lorg/jetbrains/kotlin/project/model/PluginData;", "fragment", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "forNativeMetadataCompilation", "forPlatformCompilation", "variant", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KpmCompilerPlugin {
    @Nullable
    PluginData forMetadataCompilation(@NotNull KpmFragment fragment);

    @Nullable
    PluginData forNativeMetadataCompilation(@NotNull KpmFragment fragment);

    @Nullable
    PluginData forPlatformCompilation(@NotNull KpmVariant variant);
}
