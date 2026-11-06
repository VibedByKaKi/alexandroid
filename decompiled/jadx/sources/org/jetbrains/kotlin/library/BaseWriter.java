package org.jetbrains.kotlin.library;

import java.util.List;
import java.util.Properties;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\f\u001a\u00060\rj\u0002`\u000eH&J\b\u0010\u000f\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/library/BaseWriter;", "", "versions", "Lorg/jetbrains/kotlin/library/KotlinLibraryVersioning;", "getVersions", "()Lorg/jetbrains/kotlin/library/KotlinLibraryVersioning;", "addLinkDependencies", "", "libraries", "", "Lorg/jetbrains/kotlin/library/KotlinLibrary;", "addManifestAddend", "properties", "Ljava/util/Properties;", "Lorg/jetbrains/kotlin/konan/properties/Properties;", "commit", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface BaseWriter {
    void addLinkDependencies(@NotNull List<? extends KotlinLibrary> libraries);

    void addManifestAddend(@NotNull Properties properties);

    void commit();

    @NotNull
    KotlinLibraryVersioning getVersions();
}
