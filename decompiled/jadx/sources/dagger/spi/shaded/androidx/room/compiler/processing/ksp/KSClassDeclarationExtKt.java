package dagger.spi.shaded.androidx.room.compiler.processing.ksp;

import com.google.devtools.ksp.symbol.KSClassDeclaration;
import com.google.devtools.ksp.symbol.KSDeclaration;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"findCompanionObject", "Lcom/google/devtools/ksp/symbol/KSClassDeclaration;", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class KSClassDeclarationExtKt {
    @Nullable
    public static final KSClassDeclaration findCompanionObject(@NotNull KSClassDeclaration kSClassDeclaration) {
        KSDeclaration kSDeclaration;
        kSClassDeclaration.getClass();
        Iterator<KSDeclaration> it2 = kSClassDeclaration.getDeclarations().iterator();
        while (true) {
            if (!it2.hasNext()) {
                kSDeclaration = null;
                break;
            }
            kSDeclaration = it2.next();
            KSDeclaration kSDeclaration2 = kSDeclaration;
            if ((kSDeclaration2 instanceof KSClassDeclaration) && ((KSClassDeclaration) kSDeclaration2).isCompanionObject()) {
                break;
            }
        }
        if (kSDeclaration instanceof KSClassDeclaration) {
            return (KSClassDeclaration) kSDeclaration;
        }
        return null;
    }
}
