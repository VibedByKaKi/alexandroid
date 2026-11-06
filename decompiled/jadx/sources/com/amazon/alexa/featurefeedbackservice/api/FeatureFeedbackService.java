package com.amazon.alexa.featurefeedbackservice.api;

import com.amazon.alexa.featurefeedbackservice.api.model.showfeedback.ShowFeedbackPromptResponse;
import com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback.SubmitFeedbackRequest;
import com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback.SubmitFeedbackResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface FeatureFeedbackService {
    ShowFeedbackPromptResponse showFeedbackPromptIfEligible(String str);

    SubmitFeedbackResponse submitFeedback(SubmitFeedbackRequest submitFeedbackRequest);
}
