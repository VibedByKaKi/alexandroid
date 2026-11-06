package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ProtobufEncoder$Builder$$ExternalSyntheticLambda0 implements ObjectEncoder {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ProtobufEncoder$Builder$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        switch (this.$r8$classId) {
            case 0:
                ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext);
                break;
            default:
                ProtobufDataEncoderContext.lambda$static$0((Map.Entry) obj, objectEncoderContext);
                break;
        }
    }
}
