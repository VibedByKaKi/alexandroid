package com.amazon.alexa.handsfree.uservoicerecognition.metrics;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilder;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.uservoicerecognition.model.UVRComponent;
import com.amazon.alexa.handsfree.uservoicerecognition.model.UVRComponentMetadata;
import com.amazon.alexa.handsfree.uservoicerecognition.model.UtteranceMetricMetadata;
import com.amazon.alexa.handsfree.uservoicerecognition.model.VerificationStage;
import com.amazon.alexa.handsfree.uservoicerecognition.model.VerificationStageMetadata;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UtteranceMetricReporter {
    private static final String SOURCE = "UtteranceMetricReporter";
    private static final String VERIFICATION_METRIC = "UserVoiceRecognition";

    public void reportUtteranceMetric(@NonNull Context context, @NonNull UtteranceMetricMetadata utteranceMetricMetadata) {
        MetricsBuilder newBuilder = MetricsBuilderProvider.getInstance(context).newBuilder();
        for (Map.Entry<VerificationStage, VerificationStageMetadata> entry : utteranceMetricMetadata.getVerificationLatencyMap().entrySet()) {
            newBuilder.withLatencyMetric(entry.getValue().getStageStartTimestamp(), entry.getValue().getStageEndTimestamp(), entry.getKey().toString());
        }
        for (Map.Entry<UVRComponent, UVRComponentMetadata> entry2 : utteranceMetricMetadata.getUserVerificationMetadataMap().entrySet()) {
            UVRComponent key = entry2.getKey();
            UVRComponentMetadata value = entry2.getValue();
            String str = SOURCE;
            newBuilder.withVoiceMetadataMetric(str, (String) key, (UVRComponent) UVRComponentMetadata.MetadataKey.CONFIDENCE, value.getConfidence()).withVoiceMetadataMetric(str, (String) key, (UVRComponent) UVRComponentMetadata.MetadataKey.SUCCESS, value.isSuccessful());
            if (entry2.getValue().isSuccessful()) {
                newBuilder.withPercentileMetricSuccess(str, "UserVoiceRecognition:" + key.getMetricName());
            } else {
                newBuilder.withPercentileMetricFailure(str, "UserVoiceRecognition:" + key.getMetricName());
            }
        }
        newBuilder.emit(context);
    }
}
