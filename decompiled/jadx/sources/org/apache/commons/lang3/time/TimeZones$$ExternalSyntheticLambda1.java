package org.apache.commons.lang3.time;

import com.amazon.alexa.accessory.frames.accessproof.PartnerRoster;
import com.amazon.alexa.accessory.frames.media.MediaImportService;
import com.amazon.alexa.accessory.frames.provider.FeatureChecker;
import java.util.function.BooleanSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class TimeZones$$ExternalSyntheticLambda1 implements BooleanSupplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TimeZones$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        boolean lambda$mapShortIDs$0;
        boolean lambda$empty$3;
        boolean lambda$new$0;
        boolean lambda$buildAmaChannel$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$mapShortIDs$0 = TimeZones.lambda$mapShortIDs$0();
                return lambda$mapShortIDs$0;
            case 1:
                lambda$empty$3 = PartnerRoster.lambda$empty$3();
                return lambda$empty$3;
            case 2:
                lambda$new$0 = PartnerRoster.lambda$new$0();
                return lambda$new$0;
            case 3:
                return FeatureChecker.hasThirdPartyAuthAccess();
            default:
                lambda$buildAmaChannel$2 = MediaImportService.lambda$buildAmaChannel$2();
                return lambda$buildAmaChannel$2;
        }
    }
}
