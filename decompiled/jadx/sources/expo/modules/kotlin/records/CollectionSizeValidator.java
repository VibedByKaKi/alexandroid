package expo.modules.kotlin.records;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import expo.modules.kotlin.exception.ValidationException;
import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/records/CollectionSizeValidator;", "Lexpo/modules/kotlin/records/FieldValidator;", "", ReactProperties.GEOFENCE_MINIMUM_RANGE, "", ReactProperties.GEOFENCE_MAXIMUM_RANGE, "<init>", "(II)V", "validate", "", "value", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CollectionSizeValidator implements FieldValidator<Collection<?>> {
    private final int max;
    private final int min;

    public CollectionSizeValidator(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(@NotNull Collection<?> value) {
        value.getClass();
        if (value.size() < this.min || value.size() > this.max) {
            int i = this.min;
            int i2 = this.max;
            int size = value.size();
            StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "Number of elements in the collection should be between ", " and ", ", got ");
            m29m.append(size);
            throw new ValidationException(m29m.toString());
        }
    }
}
