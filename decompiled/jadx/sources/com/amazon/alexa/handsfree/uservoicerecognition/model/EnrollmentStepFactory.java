package com.amazon.alexa.handsfree.uservoicerecognition.model;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.UtteranceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentStepFactory {
    public List<EnrollmentStep> createEnrollmentSteps(@NonNull List<UtteranceInfo> list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator<UtteranceInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new EnrollmentStep(it2.next(), i));
        }
        return arrayList;
    }
}
