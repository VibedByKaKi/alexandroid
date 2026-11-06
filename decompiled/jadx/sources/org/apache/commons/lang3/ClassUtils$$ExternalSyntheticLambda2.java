package org.apache.commons.lang3;

import com.amazon.alexa.featureservice.implementation.FeatureServiceViewModel;
import com.amazon.alexa.featureservice.repo.model.Feature;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.apache.commons.text.translate.CharSequenceTranslator;
import org.openjdk.tools.sjavac.pubapi.PubApi;
import org.openjdk.tools.sjavac.pubapi.PubType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ClassUtils$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ ClassUtils$$ExternalSyntheticLambda2(ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        switch (i) {
            case 0:
                ClassUtils.lambda$convertClassNamesToClasses$0(arrayList, (String) obj);
                break;
            case 1:
                FeatureServiceViewModel.lambda$getActiveFeaturesFromDb$7(arrayList, (Feature) obj);
                break;
            case 2:
                arrayList.add((String) obj);
                break;
            case 3:
                arrayList.add((CharSequenceTranslator) obj);
                break;
            default:
                PubApi.lambda$asListOfStrings$1(arrayList, (PubType) obj);
                break;
        }
    }
}
