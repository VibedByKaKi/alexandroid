package com.amazon.alexa.ra.core.features.feedback;

import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.data.model.UserReaction;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H&¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/feedback/FeedbackSourceApi;", "", "getUserReactions", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/amazon/alexa/ra/core/data/model/UserReaction;", "recordFeedback", "", "selectedFragmentId", "", "selectedOption", "", Constants.SubmitFeedback.REQUEST_FEEDBACK_TYPE, "", "feedbackText", "fragmentsData", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface FeedbackSourceApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void recordFeedback$default(FeedbackSourceApi feedbackSourceApi, String str, int i, boolean z, String str2, List list, int i2, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: recordFeedback");
            return;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        feedbackSourceApi.recordFeedback(str, i, z, str2, list);
    }

    @NotNull
    StateFlow<List<UserReaction>> getUserReactions();

    void recordFeedback(@NotNull String selectedFragmentId, int selectedOption, boolean feedbackType, @NotNull String feedbackText, @NotNull List<FragmentData> fragmentsData);
}
