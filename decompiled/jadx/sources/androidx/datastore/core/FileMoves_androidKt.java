package androidx.datastore.core;

import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"atomicMoveTo", "", "Ljava/io/File;", "toFile", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(@NotNull File file, @NotNull File file2) {
        file.getClass();
        file2.getClass();
        return Api26Impl.INSTANCE.move(file, file2);
    }
}
