package expo.modules.kotlin.exception;

import androidx.exifinterface.media.ExifInterface;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0086\b\u001a\u0015\u0010\u0003\u001a\u00020\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0001H\u0086\b¨\u0006\u0006"}, d2 = {"toCodedException", "Lexpo/modules/kotlin/exception/CodedException;", "", "errorCodeOf", "", ExifInterface.GPS_DIRECTION_TRUE, "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CodedExceptionKt {
    public static final /* synthetic */ <T extends CodedException> String errorCodeOf() {
        CodedException.Companion companion = CodedException.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return companion.inferCode(CodedException.class);
    }

    @NotNull
    public static final CodedException toCodedException(@Nullable Throwable th) {
        if (th == null) {
            return new UnexpectedException("Unknown error");
        }
        if (th instanceof CodedException) {
            return (CodedException) th;
        }
        if (!(th instanceof expo.modules.core.errors.CodedException)) {
            return new UnexpectedException(th);
        }
        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
        String code = codedException.getCode();
        code.getClass();
        return new CodedException(code, codedException.getMessage(), codedException.getCause());
    }
}
