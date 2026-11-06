package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "sensitive", targets = {BigDecimalModel.class, BigIntegerModel.class, BooleanModel.class, ByteModel.class, BlobModel.class, TimestampModel.class, CharacterModel.class, DoubleModel.class, FloatModel.class, IntegerModel.class, ListModel.class, LongModel.class, MapModel.class, ShortModel.class, StringModel.class, StructureModel.class, EnvelopeModel.class})
/* loaded from: classes19.dex */
public class SensitiveTraits extends AbstractTraits {
    public SensitiveTraits() {
        this(SensitiveTraits.class, Model.Id.NONE, "", "N/A");
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SensitiveTraits) {
            return super.equals(obj);
        }
        return false;
    }

    @ValidTrait(requires = {})
    public SensitiveTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2) {
        super(cls, id, str, str2);
    }
}
