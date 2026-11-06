package com.amazon.alexa.voice.ui.onedesign.ftue.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.R;
import com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BottomSheetGoToSettingsController extends ViewController {
    private BottomSheetGoToSettingsContract.Interactor interactor;
    private BottomSheetGoToSettingsContract.Presenter presenter;

    private int getThemeId() {
        return R.style.Alexa_Voice_OneDesign_Moasic_BottomSheet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        this.presenter.settingsClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(View view) {
        this.presenter.laterClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$2(View view) {
        this.presenter.learnMoreClicked();
    }

    @Override // com.amazon.regulator.ViewController
    public void onAttach(@NonNull View view) {
        super.onAttach(view);
        this.presenter.start();
    }

    @Override // com.amazon.regulator.ViewController
    public void onCreate() {
        super.onCreate();
        overrideTheme(getThemeId());
        BottomSheetGoToSettingsInteractor bottomSheetGoToSettingsInteractor = new BottomSheetGoToSettingsInteractor(new BottomSheetGoToSettingsMediator(this));
        this.interactor = bottomSheetGoToSettingsInteractor;
        this.presenter = new BottomSheetGoToSettingsPresenter(bottomSheetGoToSettingsInteractor);
    }

    @Override // com.amazon.regulator.ViewController
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.bottmsheet_go_to_settings, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.settings);
        View findViewById2 = inflate.findViewById(R.id.later);
        View findViewById3 = inflate.findViewById(R.id.learn_more);
        final int i = 0;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsController$$ExternalSyntheticLambda0
            public final /* synthetic */ BottomSheetGoToSettingsController f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                BottomSheetGoToSettingsController bottomSheetGoToSettingsController = this.f$0;
                switch (i2) {
                    case 0:
                        bottomSheetGoToSettingsController.lambda$onCreateView$0(view);
                        break;
                    case 1:
                        bottomSheetGoToSettingsController.lambda$onCreateView$1(view);
                        break;
                    default:
                        bottomSheetGoToSettingsController.lambda$onCreateView$2(view);
                        break;
                }
            }
        });
        final int i2 = 1;
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsController$$ExternalSyntheticLambda0
            public final /* synthetic */ BottomSheetGoToSettingsController f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                BottomSheetGoToSettingsController bottomSheetGoToSettingsController = this.f$0;
                switch (i22) {
                    case 0:
                        bottomSheetGoToSettingsController.lambda$onCreateView$0(view);
                        break;
                    case 1:
                        bottomSheetGoToSettingsController.lambda$onCreateView$1(view);
                        break;
                    default:
                        bottomSheetGoToSettingsController.lambda$onCreateView$2(view);
                        break;
                }
            }
        });
        final int i3 = 2;
        findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsController$$ExternalSyntheticLambda0
            public final /* synthetic */ BottomSheetGoToSettingsController f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                BottomSheetGoToSettingsController bottomSheetGoToSettingsController = this.f$0;
                switch (i22) {
                    case 0:
                        bottomSheetGoToSettingsController.lambda$onCreateView$0(view);
                        break;
                    case 1:
                        bottomSheetGoToSettingsController.lambda$onCreateView$1(view);
                        break;
                    default:
                        bottomSheetGoToSettingsController.lambda$onCreateView$2(view);
                        break;
                }
            }
        });
        return inflate;
    }
}
