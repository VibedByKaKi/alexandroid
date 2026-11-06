package com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.metrics.MetricsBridge;
import com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.EducationPrimerContract;
import com.amazon.alexa.voice.ui.onedesign.ftue.metrics.VoxUiMetricEventName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EducationPrimerPresenter implements EducationPrimerContract.Presenter {
    private final EducationPrimerContract.Interactor interactor;
    private final MetricsBridge metricsBridge;

    public EducationPrimerPresenter(@NonNull EducationPrimerContract.Interactor interactor, @NonNull MetricsBridge metricsBridge) {
        this.interactor = interactor;
        this.metricsBridge = metricsBridge;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.EducationPrimerContract.Presenter
    public void start() {
        this.metricsBridge.reportEvent(VoxUiMetricEventName.BS_EDUCATION_SHOWN);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.EducationPrimerContract.Presenter
    public void startClicked() {
        this.metricsBridge.reportEvent(VoxUiMetricEventName.PRIMER_ALLOWED);
        this.interactor.completeStep();
    }
}
