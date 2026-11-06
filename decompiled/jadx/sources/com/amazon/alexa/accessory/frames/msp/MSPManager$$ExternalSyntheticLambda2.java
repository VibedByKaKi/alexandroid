package com.amazon.alexa.accessory.frames.msp;

import com.amazon.alexa.accessory.frames.msp.models.SkillDisplayMetadata;
import com.amazon.alexa.accessory.frames.msp.models.SupportedMSP;
import com.amazon.alexa.accessory.frames.smartPlay.v2.CustomMediaHelper;
import com.amazon.alexa.accessory.frames.smartPlay.v2.models.EntertainmentScreenSection;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MSPManager$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SupportedMSP f$0;

    public /* synthetic */ MSPManager$$ExternalSyntheticLambda2(int i, SupportedMSP supportedMSP) {
        this.$r8$classId = i;
        this.f$0 = supportedMSP;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$updateCurrentMSP$3;
        boolean lambda$getCurrentMSPSection$0;
        int i = this.$r8$classId;
        SupportedMSP supportedMSP = this.f$0;
        switch (i) {
            case 0:
                lambda$updateCurrentMSP$3 = MSPManager.lambda$updateCurrentMSP$3(supportedMSP, (SkillDisplayMetadata) obj);
                return lambda$updateCurrentMSP$3;
            default:
                lambda$getCurrentMSPSection$0 = CustomMediaHelper.lambda$getCurrentMSPSection$0(supportedMSP, (EntertainmentScreenSection) obj);
                return lambda$getCurrentMSPSection$0;
        }
    }
}
