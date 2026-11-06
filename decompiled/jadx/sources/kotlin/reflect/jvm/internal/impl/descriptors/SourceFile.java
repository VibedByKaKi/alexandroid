package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface SourceFile {
    public static final SourceFile NO_SOURCE_FILE = new SourceFile() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.1
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceFile
        @Nullable
        public String getName() {
            return null;
        }
    };

    @Nullable
    String getName();
}
