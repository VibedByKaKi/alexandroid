package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/records/IsNotEmptyDoubleArrayValidator;", "Lexpo/modules/kotlin/records/FieldValidator;", "", "<init>", "()V", "validate", "", "value", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IsNotEmptyDoubleArrayValidator implements FieldValidator<double[]> {
    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(@NotNull double[] value) {
        value.getClass();
        if (value.length == 0) {
            throw new ValidationException("Array is empty");
        }
    }
}
