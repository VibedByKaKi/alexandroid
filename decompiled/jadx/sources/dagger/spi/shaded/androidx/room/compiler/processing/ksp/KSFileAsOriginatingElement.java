package dagger.spi.shaded.androidx.room.compiler.processing.ksp;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.devtools.ksp.symbol.KSFile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/ksp/KSFileAsOriginatingElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/ksp/OriginatingElementWrapper;", "ksFile", "Lcom/google/devtools/ksp/symbol/KSFile;", "(Lcom/google/devtools/ksp/symbol/KSFile;)V", "getKsFile", "()Lcom/google/devtools/ksp/symbol/KSFile;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class KSFileAsOriginatingElement extends OriginatingElementWrapper {

    @NotNull
    private final KSFile ksFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KSFileAsOriginatingElement(@NotNull KSFile kSFile) {
        super(kSFile.getFileName(), null);
        kSFile.getClass();
        this.ksFile = kSFile;
    }

    public static /* synthetic */ KSFileAsOriginatingElement copy$default(KSFileAsOriginatingElement kSFileAsOriginatingElement, KSFile kSFile, int i, Object obj) {
        if ((i & 1) != 0) {
            kSFile = kSFileAsOriginatingElement.ksFile;
        }
        return kSFileAsOriginatingElement.copy(kSFile);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final KSFile getKsFile() {
        return this.ksFile;
    }

    @NotNull
    public final KSFileAsOriginatingElement copy(@NotNull KSFile ksFile) {
        ksFile.getClass();
        return new KSFileAsOriginatingElement(ksFile);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KSFileAsOriginatingElement) && Intrinsics.areEqual(this.ksFile, ((KSFileAsOriginatingElement) other).ksFile);
    }

    @NotNull
    public final KSFile getKsFile() {
        return this.ksFile;
    }

    public int hashCode() {
        return this.ksFile.hashCode();
    }

    @NotNull
    public String toString() {
        return "KSFileAsOriginatingElement(ksFile=" + this.ksFile + ')';
    }
}
