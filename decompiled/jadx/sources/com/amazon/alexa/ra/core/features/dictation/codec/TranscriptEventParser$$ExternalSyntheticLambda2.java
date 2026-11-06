package com.amazon.alexa.ra.core.features.dictation.codec;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class TranscriptEventParser$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IllegalArgumentException f$0;

    public /* synthetic */ TranscriptEventParser$$ExternalSyntheticLambda2(IllegalArgumentException illegalArgumentException, int i) {
        this.$r8$classId = i;
        this.f$0 = illegalArgumentException;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        String extractExceptionMessage$lambda$4;
        String parse$lambda$2;
        int i = this.$r8$classId;
        IllegalArgumentException illegalArgumentException = this.f$0;
        switch (i) {
            case 0:
                extractExceptionMessage$lambda$4 = TranscriptEventParser.extractExceptionMessage$lambda$4(illegalArgumentException);
                return extractExceptionMessage$lambda$4;
            default:
                parse$lambda$2 = TranscriptEventParser.parse$lambda$2(illegalArgumentException);
                return parse$lambda$2;
        }
    }
}
