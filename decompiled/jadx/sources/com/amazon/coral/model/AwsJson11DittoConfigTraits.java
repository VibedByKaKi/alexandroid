package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "awsjson11dittotrait", targets = {ServiceModel.class, OperationModel.class})
@UseTraitValidator(DittoConfigTraitsValidator.class)
/* loaded from: classes19.dex */
public final class AwsJson11DittoConfigTraits extends DittoConfigTraits {
    public AwsJson11DittoConfigTraits(String str, Long l, Double d) {
        this(AwsJson11DittoConfigTraits.class, Model.Id.NONE, "", "N/A", str, l, d);
    }

    @ValidTraitOr({@ValidTrait(requires = {"dittomode", "durationbetweensampling", "dittostagingtrafficpercentage"}), @ValidTrait(requires = {"dittomode", "durationbetweensampling"}), @ValidTrait(requires = {"dittomode"})})
    public AwsJson11DittoConfigTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(emitIfNull = false, name = "dittomode") String str3, @TraitProperty(emitIfNull = false, name = "durationbetweensampling") Long l, @TraitProperty(emitIfNull = false, name = "dittostagingtrafficpercentage") Double d) {
        super(cls, id, str, str2, str3, l, d);
    }
}
