package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface SourceElement {
    public static final SourceElement NO_SOURCE = new SourceElement() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.1
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1.getContainingFile must not return null");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        @NotNull
        public SourceFile getContainingFile() {
            SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
            if (sourceFile == null) {
                $$$reportNull$$$0(0);
            }
            return sourceFile;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    };

    @NotNull
    SourceFile getContainingFile();
}
