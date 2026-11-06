package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/metadata/KmLambdaVisitor;", "", "delegate", "(Lkotlinx/metadata/KmLambdaVisitor;)V", "visitEnd", "", "visitFunction", "Lkotlinx/metadata/KmFunctionVisitor;", "flags", "", "Lkotlinx/metadata/Flags;", "name", "", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmLambdaVisitor {

    @Nullable
    private final KmLambdaVisitor delegate;

    public /* synthetic */ KmLambdaVisitor(KmLambdaVisitor kmLambdaVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmLambdaVisitor);
    }

    public void visitEnd() {
        KmLambdaVisitor kmLambdaVisitor = this.delegate;
        if (kmLambdaVisitor != null) {
            kmLambdaVisitor.visitEnd();
        }
    }

    @Nullable
    public KmFunctionVisitor visitFunction(int flags, @NotNull String name) {
        name.getClass();
        KmLambdaVisitor kmLambdaVisitor = this.delegate;
        if (kmLambdaVisitor != null) {
            return kmLambdaVisitor.visitFunction(flags, name);
        }
        return null;
    }

    @JvmOverloads
    public KmLambdaVisitor(@Nullable KmLambdaVisitor kmLambdaVisitor) {
        this.delegate = kmLambdaVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmLambdaVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
