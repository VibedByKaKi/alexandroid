package com.amazon.alexa.ra.core.features.dictation.codec;

import java.util.function.Supplier;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class TranscriptEventParser$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SerializationException f$0;

    public /* synthetic */ TranscriptEventParser$$ExternalSyntheticLambda1(SerializationException serializationException, int i) {
        this.$r8$classId = i;
        this.f$0 = serializationException;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        String extractExceptionMessage$lambda$3;
        String parse$lambda$1;
        int i = this.$r8$classId;
        SerializationException serializationException = this.f$0;
        switch (i) {
            case 0:
                extractExceptionMessage$lambda$3 = TranscriptEventParser.extractExceptionMessage$lambda$3(serializationException);
                return extractExceptionMessage$lambda$3;
            default:
                parse$lambda$1 = TranscriptEventParser.parse$lambda$1(serializationException);
                return parse$lambda$1;
        }
    }
}
