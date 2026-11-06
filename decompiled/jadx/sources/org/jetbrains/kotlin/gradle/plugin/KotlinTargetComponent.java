package org.jetbrains.kotlin.gradle.plugin;

import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.gradle.api.artifacts.PublishArtifact;
import org.gradle.api.component.SoftwareComponent;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetComponent;", "Lorg/gradle/api/component/SoftwareComponent;", "defaultArtifactId", "", "getDefaultArtifactId", "()Ljava/lang/String;", "publishable", "", "getPublishable", "()Z", "publishableOnCurrentHost", "getPublishableOnCurrentHost", "sourcesArtifacts", "", "Lorg/gradle/api/artifacts/PublishArtifact;", "getSourcesArtifacts$annotations", "()V", "getSourcesArtifacts", "()Ljava/util/Set;", "target", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "getTarget", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinTargetComponent extends SoftwareComponent {
    @NotNull
    String getDefaultArtifactId();

    boolean getPublishable();

    boolean getPublishableOnCurrentHost();

    @NotNull
    Set<PublishArtifact> getSourcesArtifacts();

    @NotNull
    KotlinTarget getTarget();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(message = "Sources artifacts are now published as separate variant use target.sourcesElementsConfigurationName to obtain necessary information", replaceWith = @ReplaceWith(expression = "target.sourcesElementsConfigurationName", imports = {}))
        public static /* synthetic */ void getSourcesArtifacts$annotations() {
        }
    }
}
