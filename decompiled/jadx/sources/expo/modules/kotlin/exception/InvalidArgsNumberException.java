package expo.modules.kotlin.exception;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.core.interfaces.DoNotStrip;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/InvalidArgsNumberException;", "Lexpo/modules/kotlin/exception/CodedException;", "received", "", "expected", "required", "<init>", "(III)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
/* loaded from: classes9.dex */
public final class InvalidArgsNumberException extends CodedException {
    public InvalidArgsNumberException(int i, int i2, int i3) {
        super(i3 < i2 ? a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "Received ", " arguments, but ", " was expected and at least "), i3, " is required") : ErrorUtils$$ExternalSyntheticOutline0.m(i, i2, "Received ", " arguments, but ", " was expected"), null, 2, null);
    }

    public /* synthetic */ InvalidArgsNumberException(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? i2 : i3);
    }
}
