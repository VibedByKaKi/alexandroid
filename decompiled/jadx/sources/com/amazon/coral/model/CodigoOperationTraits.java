package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.CodigoOperationTraitsValidator;
import com.amazon.coral.model.xml.CodigoOperationTraitsBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "codigooperation", targets = {OperationModel.class})
@UseTraitValidator(CodigoOperationTraitsValidator.class)
@UseTraitsBuilder(CodigoOperationTraitsBuilder.class)
/* loaded from: classes19.dex */
public class CodigoOperationTraits extends AbstractTraits {
    private final OperationMEP mep;
    private final String outputPartName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum OperationMEP {
        ONE_WAY,
        REQUEST_RESPONSE
    }

    public CodigoOperationTraits(String str, OperationMEP operationMEP) {
        this(CodigoOperationTraits.class, Model.Id.NONE, "", "N/A", str, operationMEP);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CodigoOperationTraits)) {
            return false;
        }
        CodigoOperationTraits codigoOperationTraits = (CodigoOperationTraits) obj;
        if (getOutputPartName() == null) {
            if (codigoOperationTraits.getOutputPartName() != null) {
                return false;
            }
        } else if (!getOutputPartName().equals(codigoOperationTraits.getOutputPartName())) {
            return false;
        }
        if (getMEP() == null) {
            if (codigoOperationTraits.getMEP() != null) {
                return false;
            }
        } else if (!getMEP().equals(codigoOperationTraits.getMEP())) {
            return false;
        }
        return super.equals(obj);
    }

    @TraitProperty(emitIfNull = false, name = "mep")
    public OperationMEP getMEP() {
        return this.mep;
    }

    @TraitProperty(emitIfNull = false, name = "outputpartname")
    public String getOutputPartName() {
        return this.outputPartName;
    }

    public CodigoOperationTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, String str3, OperationMEP operationMEP) {
        super(cls, id, str, str2);
        this.outputPartName = str3;
        this.mep = operationMEP;
    }
}
