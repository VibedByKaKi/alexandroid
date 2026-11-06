package org.jetbrains.kotlin.gradle.dsl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinTopLevelExtensionConfig;", "", "coreLibrariesVersion", "", "getCoreLibrariesVersion", "()Ljava/lang/String;", "setCoreLibrariesVersion", "(Ljava/lang/String;)V", "explicitApi", "Lorg/jetbrains/kotlin/gradle/dsl/ExplicitApiMode;", "getExplicitApi", "()Lorg/jetbrains/kotlin/gradle/dsl/ExplicitApiMode;", "setExplicitApi", "(Lorg/jetbrains/kotlin/gradle/dsl/ExplicitApiMode;)V", "", "explicitApiWarning", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinTopLevelExtensionConfig {
    void explicitApi();

    void explicitApiWarning();

    @NotNull
    String getCoreLibrariesVersion();

    @Nullable
    ExplicitApiMode getExplicitApi();

    void setCoreLibrariesVersion(@NotNull String str);

    void setExplicitApi(@Nullable ExplicitApiMode explicitApiMode);
}
