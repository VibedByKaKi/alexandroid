package org.jetbrains.kotlin.gradle.dsl;

import com.amazon.alexa.apl.payload.RenderDocumentPayload;
import java.util.Set;
import kotlin.Metadata;
import org.gradle.api.plugins.ExtensionAware;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J!\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H&¢\u0006\u0002\u0010\u0013R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinArtifactConfig;", "", "artifactName", "", "getArtifactName", "()Ljava/lang/String;", "modules", "", "getModules", "()Ljava/util/Set;", "addModule", "", "project", "createArtifact", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinArtifact;", RenderDocumentPayload.FIELD_EXTENSIONS, "Lorg/gradle/api/plugins/ExtensionAware;", "setModules", "", "([Ljava/lang/Object;)V", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinArtifactConfig {
    void addModule(@NotNull Object project);

    @NotNull
    KotlinArtifact createArtifact(@NotNull ExtensionAware extensions);

    @NotNull
    String getArtifactName();

    @NotNull
    Set<Object> getModules();

    void setModules(@NotNull Object... project);
}
