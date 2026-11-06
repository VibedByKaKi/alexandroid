package com.amazon.alexa.voice.ui.onedesign.ftue.primer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.metrics.MetricsBridge;
import com.amazon.alexa.voice.ui.onedesign.ftue.R;
import com.amazon.alexa.voice.ui.onedesign.ftue.metrics.VoxUiMetricEventName;
import com.amazon.alexa.voice.ui.onedesign.ftue.primer.PrimerContract;
import com.amazon.alexa.voice.ui.onedesign.util.Resources;
import com.amazon.regulator.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class PrimerPresenter implements PrimerContract.Presenter {
    private final PrimerContract.Interactor interactor;
    private final MetricsBridge metricsBridge;
    private final Resources resources;
    private final PrimerContract.View view;

    public PrimerPresenter(@NonNull PrimerContract.View view, @NonNull PrimerContract.Interactor interactor, @NonNull Resources resources, @Nullable MetricsBridge metricsBridge) {
        Preconditions.nonNull(view, "view argument must be non-null.");
        Preconditions.nonNull(interactor, "interactor argument must be non-null.");
        Preconditions.nonNull(resources, "resources argument must be non-null.");
        this.view = view;
        this.interactor = interactor;
        this.resources = resources;
        this.metricsBridge = metricsBridge;
    }

    private void reportEvent(String str) {
        MetricsBridge metricsBridge = this.metricsBridge;
        if (metricsBridge != null) {
            metricsBridge.reportEvent(str);
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.primer.PrimerContract.Presenter
    public void allowClicked() {
        reportEvent(VoxUiMetricEventName.PRIMER_ALLOWED);
        this.interactor.askForOsPermissions();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.primer.PrimerContract.Presenter
    public void closeClicked() {
        this.interactor.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.primer.PrimerContract.Presenter
    public void laterClicked() {
        reportEvent(VoxUiMetricEventName.PRIMER_DENIED);
        this.interactor.deferPrimer();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.primer.PrimerContract.Presenter
    public void permissionsResultReceived() {
        this.interactor.validatePermissions();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.primer.PrimerContract.Presenter
    public void start() {
        this.view.floodBackgroundToStatusBar();
        this.view.setPermissionsTitle(this.resources.getString(R.string.voice_ui_od_permissions_primer_title));
        this.view.setPermissionsRationale(this.resources.getString(R.string.voice_ui_od_permissions_primer_rationale_blurb));
        for (String str : this.resources.getStringArray(R.array.voice_ui_od_permissions_primer_rationale_list_items)) {
            this.view.setPermissionsListText(str);
        }
        this.view.setAllowButtonText(this.resources.getString(R.string.voice_ui_od_permissions_primer_button_allow));
        this.view.setLaterButtonText(this.resources.getString(R.string.voice_ui_od_permissions_primer_button_later));
        reportEvent(VoxUiMetricEventName.LEGACY_FTUE_SHOWN);
    }
}
