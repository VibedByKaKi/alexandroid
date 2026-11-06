package dagger.internal.codegen.compileroption;

import java.util.Optional;
import javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public enum ValidationType {
    ERROR,
    WARNING,
    NONE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: dagger.internal.codegen.compileroption.ValidationType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$dagger$internal$codegen$compileroption$ValidationType;

        static {
            int[] iArr = new int[ValidationType.values().length];
            $SwitchMap$dagger$internal$codegen$compileroption$ValidationType = iArr;
            try {
                iArr[ValidationType.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$dagger$internal$codegen$compileroption$ValidationType[ValidationType.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Optional<Diagnostic.Kind> diagnosticKind() {
        int i = AnonymousClass1.$SwitchMap$dagger$internal$codegen$compileroption$ValidationType[ordinal()];
        return i != 1 ? i != 2 ? Optional.empty() : Optional.of(Diagnostic.Kind.WARNING) : Optional.of(Diagnostic.Kind.ERROR);
    }
}
