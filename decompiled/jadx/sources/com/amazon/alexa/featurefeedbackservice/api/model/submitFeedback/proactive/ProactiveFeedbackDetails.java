package com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback.proactive;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ProactiveFeedbackDetails {
    private ProactiveFeedbackType type;

    public ProactiveFeedbackDetails(ProactiveFeedbackType proactiveFeedbackType) {
        this.type = proactiveFeedbackType;
    }

    public static ProactiveFeedbackDetails deepCopy(ProactiveFeedbackDetails proactiveFeedbackDetails) {
        if (proactiveFeedbackDetails == null) {
            return null;
        }
        return new ProactiveFeedbackDetails(proactiveFeedbackDetails.getFeedbackType());
    }

    public ProactiveFeedbackType getFeedbackType() {
        return this.type;
    }
}
