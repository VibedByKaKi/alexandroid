package com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.metrics.MetricsBridge;
import com.amazon.alexa.voice.ui.onedesign.ftue.R;
import com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.EducationPrimerContract;
import com.amazon.apl.android.scenegraph.APLLayer$$ExternalSyntheticLambda0;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EducationPrimerController extends ViewController {
    private EducationPrimerContract.Presenter presenter;

    public static EducationPrimerController create() {
        return new EducationPrimerController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        this.presenter.startClicked();
    }

    @Override // com.amazon.regulator.ViewController
    public void onAttach(@NonNull View view) {
        super.onAttach(view);
        this.presenter.start();
    }

    @Override // com.amazon.regulator.ViewController
    public void onCreate() {
        EducationPrimerInteractor educationPrimerInteractor = new EducationPrimerInteractor(new EducationPrimerMediator(this));
        overrideTheme(R.style.Alexa_Voice_OneDesign_Moasic_BottomSheet);
        this.presenter = new EducationPrimerPresenter(educationPrimerInteractor, (MetricsBridge) getComponent().get(MetricsBridge.class));
    }

    @Override // com.amazon.regulator.ViewController
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.voice_ui_od_bottomsheet_education, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.allow)).setOnClickListener(new APLLayer$$ExternalSyntheticLambda0(this, 1));
        return inflate;
    }
}
