package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.LengthTraitsValidator;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "length", targets = {ListModel.class, MapModel.class, StringModel.class, BlobModel.class})
@UseTraitValidator(LengthTraitsValidator.class)
/* loaded from: classes19.dex */
public class LengthTraits extends AbstractTraits {
    private final Integer maxLength;
    private final int minLength;

    public LengthTraits(int i, Integer num) {
        this(LengthTraits.class, Model.Id.NONE, "", "N/A", i, num);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LengthTraits)) {
            return false;
        }
        LengthTraits lengthTraits = (LengthTraits) obj;
        if (!Integer.valueOf(lengthTraits.getMinLength()).equals(Integer.valueOf(getMinLength()))) {
            return false;
        }
        Integer maxLength = lengthTraits.getMaxLength();
        Integer maxLength2 = getMaxLength();
        if (maxLength == maxLength2 || !(maxLength == null || maxLength2 == null || !maxLength.equals(maxLength2))) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(emitIfNull = false, name = ReactProperties.GEOFENCE_MAXIMUM_RANGE)
    public Integer getMaxLength() {
        return this.maxLength;
    }

    @TraitProperty(name = ReactProperties.GEOFENCE_MINIMUM_RANGE)
    public int getMinLength() {
        return this.minLength;
    }

    @ValidTraitOr({@ValidTrait(requires = {ReactProperties.GEOFENCE_MINIMUM_RANGE}), @ValidTrait(requires = {ReactProperties.GEOFENCE_MAXIMUM_RANGE}), @ValidTrait(requires = {ReactProperties.GEOFENCE_MINIMUM_RANGE, ReactProperties.GEOFENCE_MAXIMUM_RANGE})})
    public LengthTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "min") int i, @TraitProperty(name = "max") Integer num) {
        super(cls, id, str, str2);
        this.minLength = i;
        this.maxLength = num;
    }
}
