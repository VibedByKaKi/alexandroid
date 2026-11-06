package org.jetbrains.kotlin.gradle.plugin;

import java.util.List;
import kotlin.Metadata;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.provider.Provider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&¨\u0006\u0013"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilerPluginSupportPlugin;", "Lorg/gradle/api/Plugin;", "Lorg/gradle/api/Project;", "apply", "", "target", "applyToCompilation", "Lorg/gradle/api/provider/Provider;", "", "Lorg/jetbrains/kotlin/gradle/plugin/SubpluginOption;", "kotlinCompilation", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "getCompilerPluginId", "", "getPluginArtifact", "Lorg/jetbrains/kotlin/gradle/plugin/SubpluginArtifact;", "getPluginArtifactForNative", "isApplicable", "", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinCompilerPluginSupportPlugin extends Plugin<Project> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void apply(@NotNull KotlinCompilerPluginSupportPlugin kotlinCompilerPluginSupportPlugin, @NotNull Project project) {
            project.getClass();
        }

        @Nullable
        public static SubpluginArtifact getPluginArtifactForNative(@NotNull KotlinCompilerPluginSupportPlugin kotlinCompilerPluginSupportPlugin) {
            return null;
        }
    }

    void apply(@NotNull Project target);

    @NotNull
    Provider<List<SubpluginOption>> applyToCompilation(@NotNull KotlinCompilation<?> kotlinCompilation);

    @NotNull
    String getCompilerPluginId();

    @NotNull
    SubpluginArtifact getPluginArtifact();

    @Nullable
    SubpluginArtifact getPluginArtifactForNative();

    boolean isApplicable(@NotNull KotlinCompilation<?> kotlinCompilation);
}
