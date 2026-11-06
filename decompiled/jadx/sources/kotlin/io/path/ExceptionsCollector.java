package kotlin.io.path;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\u0012\u0010\u001a\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\fj\u0002`\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lkotlin/io/path/ExceptionsCollector;", "", "limit", "", "<init>", "(I)V", "value", "totalExceptions", "getTotalExceptions", "()I", "collectedExceptions", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCollectedExceptions", "()Ljava/util/List;", "path", "Ljava/nio/file/Path;", "getPath", "()Ljava/nio/file/Path;", "setPath", "(Ljava/nio/file/Path;)V", "enterEntry", "", "name", "exitEntry", "collect", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ExceptionsCollector {

    @NotNull
    private final List<Exception> collectedExceptions;
    private final int limit;

    @Nullable
    private Path path;
    private int totalExceptions;

    public ExceptionsCollector(int i) {
        this.limit = i;
        this.collectedExceptions = new ArrayList();
    }

    public final void collect(@NotNull Exception exception) {
        exception.getClass();
        this.totalExceptions++;
        if (this.collectedExceptions.size() < this.limit) {
            if (this.path != null) {
                Throwable initCause = new FileSystemException(String.valueOf(this.path)).initCause(exception);
                initCause.getClass();
                exception = (FileSystemException) initCause;
            }
            this.collectedExceptions.add(exception);
        }
    }

    public final void enterEntry(@NotNull Path name) {
        name.getClass();
        Path path = this.path;
        this.path = path != null ? path.resolve(name) : null;
    }

    public final void exitEntry(@NotNull Path name) {
        name.getClass();
        Path path = this.path;
        if (!Intrinsics.areEqual(name, path != null ? path.getFileName() : null)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        } else {
            Path path2 = this.path;
            this.path = path2 != null ? path2.getParent() : null;
        }
    }

    @NotNull
    public final List<Exception> getCollectedExceptions() {
        return this.collectedExceptions;
    }

    @Nullable
    public final Path getPath() {
        return this.path;
    }

    public final int getTotalExceptions() {
        return this.totalExceptions;
    }

    public final void setPath(@Nullable Path path) {
        this.path = path;
    }

    public ExceptionsCollector() {
        this(0, 1, null);
    }

    public /* synthetic */ ExceptionsCollector(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 64 : i);
    }
}
