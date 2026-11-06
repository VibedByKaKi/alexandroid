package org.jetbrains.kotlin.library;

import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/library/SerializedIrModule;", "", "files", "", "Lorg/jetbrains/kotlin/library/SerializedIrFile;", "(Ljava/util/Collection;)V", "getFiles", "()Ljava/util/Collection;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class SerializedIrModule {

    @NotNull
    private final Collection<SerializedIrFile> files;

    public SerializedIrModule(@NotNull Collection<SerializedIrFile> collection) {
        collection.getClass();
        this.files = collection;
    }

    @NotNull
    public final Collection<SerializedIrFile> getFiles() {
        return this.files;
    }
}
