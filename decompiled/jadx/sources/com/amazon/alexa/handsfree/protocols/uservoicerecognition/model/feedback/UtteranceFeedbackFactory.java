package com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.feedback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UtteranceFeedbackFactory {
    public UtteranceFeedback getPcmDataFeedback(short[] sArr) {
        return new PcmDataUtteranceFeedback(sArr);
    }

    public UtteranceFeedback getVolumeFeedback(int i, int i2, int i3) {
        return new VolumeUtteranceFeedback(i, i2, i3);
    }
}
