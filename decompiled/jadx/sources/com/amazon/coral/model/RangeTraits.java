package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.RangeTraitsValidator;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "range", targets = {BigDecimalModel.class, BigIntegerModel.class, IntegerModel.class, LongModel.class, FloatModel.class, DoubleModel.class, ShortModel.class, ByteModel.class})
@UseTraitValidator(RangeTraitsValidator.class)
/* loaded from: classes19.dex */
public class RangeTraits extends AbstractTraits {
    private final String maxValue;
    private final String minValue;

    public RangeTraits(String str, String str2) {
        this(RangeTraits.class, Model.Id.NONE, "", "N/A", str, str2);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RangeTraits)) {
            return false;
        }
        RangeTraits rangeTraits = (RangeTraits) obj;
        String minValue = rangeTraits.getMinValue();
        String minValue2 = getMinValue();
        if (minValue != minValue2 && (minValue == null || minValue2 == null || !minValue.equals(minValue2))) {
            return false;
        }
        String maxValue = rangeTraits.getMaxValue();
        String maxValue2 = getMaxValue();
        if (maxValue == maxValue2 || !(maxValue == null || maxValue2 == null || !maxValue.equals(maxValue2))) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(emitIfNull = false, name = ReactProperties.GEOFENCE_MAXIMUM_RANGE)
    public String getMaxValue() {
        return this.maxValue;
    }

    @TraitProperty(emitIfNull = false, name = ReactProperties.GEOFENCE_MINIMUM_RANGE)
    public String getMinValue() {
        return this.minValue;
    }

    @ValidTraitOr({@ValidTrait(requires = {ReactProperties.GEOFENCE_MINIMUM_RANGE}), @ValidTrait(requires = {ReactProperties.GEOFENCE_MAXIMUM_RANGE}), @ValidTrait(requires = {ReactProperties.GEOFENCE_MINIMUM_RANGE, ReactProperties.GEOFENCE_MAXIMUM_RANGE})})
    public RangeTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "min") String str3, @TraitProperty(name = "max") String str4) {
        super(cls, id, str, str2);
        this.minValue = str3;
        this.maxValue = str4;
    }
}
