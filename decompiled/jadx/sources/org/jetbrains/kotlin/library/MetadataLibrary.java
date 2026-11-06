package org.jetbrains.kotlin.library;

import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/library/MetadataLibrary;", "", "moduleHeaderData", "", "getModuleHeaderData", "()[B", "packageMetadata", "fqName", "", "partName", "packageMetadataParts", "", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface MetadataLibrary {
    @NotNull
    byte[] getModuleHeaderData();

    @NotNull
    byte[] packageMetadata(@NotNull String fqName, @NotNull String partName);

    @NotNull
    Set<String> packageMetadataParts(@NotNull String fqName);
}
