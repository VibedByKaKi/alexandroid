package org.junit.experimental.theories.suppliers;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TestedOnSupplier extends ParameterSupplier {
    @Override // org.junit.experimental.theories.ParameterSupplier
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) {
        ArrayList arrayList = new ArrayList();
        for (int i : ((TestedOn) parameterSignature.getAnnotation(TestedOn.class)).ints()) {
            arrayList.add(PotentialAssignment.forValue("ints", Integer.valueOf(i)));
        }
        return arrayList;
    }
}
