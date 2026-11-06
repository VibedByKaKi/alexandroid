package dagger.spi.shaded.androidx.room.compiler.processing.util;

import defpackage.a$$ExternalSyntheticOutline0;
import javax.lang.model.SourceVersion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"isValidJavaSourceName", "", "", "sanitizeAsJavaParameterName", "argIndex", "", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class NamingUtilsKt {
    public static final boolean isValidJavaSourceName(@NotNull String str) {
        str.getClass();
        return SourceVersion.isName(str);
    }

    @NotNull
    public static final String sanitizeAsJavaParameterName(@Nullable String str, int i) {
        return (str == null || !SourceVersion.isName(str)) ? a$$ExternalSyntheticOutline0.m(i, "p") : str;
    }
}
