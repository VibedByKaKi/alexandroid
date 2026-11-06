package com.amazon.coral.model.validation;

import com.amazon.coral.model.AwsErrorTraits;
import com.amazon.coral.model.AwsQueryErrorTraits;
import com.amazon.coral.model.AwsSoap11ErrorTraits;
import com.amazon.coral.model.AwsSoap12ErrorTraits;
import com.amazon.coral.model.BsfErrorTraits;
import com.amazon.coral.model.HttpErrorTraits;
import com.amazon.coral.model.StructureModel;
import com.amazon.coral.model.Traits;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FaultTraitsChecker {
    private final Set<Traits> faultTraitSet;
    private final Set<Traits> nonFaultTraitSet;

    public FaultTraitsChecker(StructureModel structureModel) {
        HashSet hashSet = new HashSet();
        this.faultTraitSet = hashSet;
        HashSet hashSet2 = new HashSet();
        this.nonFaultTraitSet = hashSet2;
        checkAwsErrorTraits((AwsQueryErrorTraits) structureModel.getTraits(AwsQueryErrorTraits.class));
        checkAwsErrorTraits((AwsSoap11ErrorTraits) structureModel.getTraits(AwsSoap11ErrorTraits.class));
        checkAwsErrorTraits((AwsSoap12ErrorTraits) structureModel.getTraits(AwsSoap12ErrorTraits.class));
        BsfErrorTraits bsfErrorTraits = (BsfErrorTraits) structureModel.getTraits(BsfErrorTraits.class);
        if (bsfErrorTraits != null) {
            if (BsfErrorTraits.Error.BadArgs.equals(bsfErrorTraits.getError())) {
                hashSet2.add(bsfErrorTraits);
            } else {
                hashSet.add(bsfErrorTraits);
            }
        }
        HttpErrorTraits httpErrorTraits = (HttpErrorTraits) structureModel.getTraits(HttpErrorTraits.class);
        if (httpErrorTraits != null) {
            if (httpErrorTraits.isSenderFault() || httpErrorTraits.getHttpResponseCode() < 500) {
                hashSet2.add(httpErrorTraits);
            } else {
                hashSet.add(httpErrorTraits);
            }
        }
    }

    private void checkAwsErrorTraits(AwsErrorTraits awsErrorTraits) {
        if (awsErrorTraits != null) {
            if (awsErrorTraits.isSenderFault()) {
                this.nonFaultTraitSet.add(awsErrorTraits);
            } else {
                this.faultTraitSet.add(awsErrorTraits);
            }
        }
    }

    public Set<Traits> getFaultTraitSet() {
        return this.faultTraitSet;
    }

    public Set<Traits> getNonFaultTraitSet() {
        return this.nonFaultTraitSet;
    }
}
