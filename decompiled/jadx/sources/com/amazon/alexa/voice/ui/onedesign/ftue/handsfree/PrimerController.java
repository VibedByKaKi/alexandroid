package com.amazon.alexa.voice.ui.onedesign.ftue.handsfree;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.voice.ui.onedesign.ftue.R;
import com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract;
import com.amazon.alexa.voice.ui.onedesign.util.FontUtils;
import com.amazon.alexa.voice.ui.onedesign.util.ViewUtils;
import com.amazon.alexa.voice.ui.onedesign.widget.TextViewWithLink;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class PrimerController extends ViewController implements HandsfreePrimerContract.View {
    protected TextView allowButtonView;
    private ScrollView contentView;
    protected TextViewWithLink geoLocationInfoView;
    protected TextView handsfreeSettingsView;
    protected TextView laterButtonView;
    private HandsfreePrimerContract.Presenter presenter;
    private View primerView;
    protected TextViewWithLink rationaleView;
    private Context themeContext;
    protected TextView titleView;
    protected TextViewWithLink usageView;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        this.presenter.laterClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(View view) {
        this.presenter.allowClicked();
    }

    @Nullable
    public abstract TextViewWithLink.OnEmbeddedLinkClickListener getGeoLocationInfoClickListener();

    public abstract HandsfreePrimerContract.Presenter getPresenter();

    @Nullable
    public abstract TextViewWithLink.OnEmbeddedLinkClickListener getRationaleClickListener();

    @Nullable
    public abstract TextViewWithLink.OnEmbeddedLinkClickListener getUsageClickListener();

    @Override // com.amazon.regulator.ViewController
    public void onAttach(View view) {
        super.onAttach(view);
        this.presenter.start();
    }

    @Override // com.amazon.regulator.ViewController
    public void onCreate() {
        super.onCreate();
        overrideTheme(R.style.Alexa_Voice_OneDesign_Moasic);
    }

    @Override // com.amazon.regulator.ViewController
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        this.presenter = getPresenter();
        this.themeContext = layoutInflater.getContext();
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.voice_ui_od_handsfree_vox_primer, viewGroup, false);
        this.primerView = inflate;
        this.titleView = (TextView) inflate.findViewById(R.id.title);
        this.usageView = (TextViewWithLink) this.primerView.findViewById(R.id.usage);
        this.handsfreeSettingsView = (TextView) this.primerView.findViewById(R.id.handsfree_settings_info);
        this.rationaleView = (TextViewWithLink) this.primerView.findViewById(R.id.rationale);
        this.geoLocationInfoView = (TextViewWithLink) this.primerView.findViewById(R.id.geo_location_info_view);
        this.laterButtonView = (TextView) this.primerView.findViewById(R.id.later);
        this.allowButtonView = (TextView) this.primerView.findViewById(R.id.allow);
        this.contentView = (ScrollView) this.primerView.findViewById(R.id.vox_handsfree_primer_for_qa_content);
        FontUtils.apply(Font.AMAZON_EMBER_DISPLAY_BOLD, this.titleView);
        final int i2 = 1;
        FontUtils.apply(Font.AMAZON_EMBER_BOLD, this.usageView, this.rationaleView, this.geoLocationInfoView, this.allowButtonView, this.laterButtonView, this.handsfreeSettingsView);
        this.laterButtonView.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.PrimerController$$ExternalSyntheticLambda0
            public final /* synthetic */ PrimerController f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                PrimerController primerController = this.f$0;
                switch (i3) {
                    case 0:
                        primerController.lambda$onCreateView$0(view);
                        break;
                    default:
                        primerController.lambda$onCreateView$1(view);
                        break;
                }
            }
        });
        this.allowButtonView.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.PrimerController$$ExternalSyntheticLambda0
            public final /* synthetic */ PrimerController f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                PrimerController primerController = this.f$0;
                switch (i3) {
                    case 0:
                        primerController.lambda$onCreateView$0(view);
                        break;
                    default:
                        primerController.lambda$onCreateView$1(view);
                        break;
                }
            }
        });
        return this.primerView;
    }

    @Override // com.amazon.regulator.ViewController
    public void onDestroyView(@NonNull View view) {
        this.primerView = null;
        this.titleView = null;
        this.usageView = null;
        this.rationaleView = null;
        this.geoLocationInfoView = null;
        this.allowButtonView = null;
        this.laterButtonView = null;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void removeLaterButton() {
        this.laterButtonView.setVisibility(8);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void setAllowButtonText(@NonNull CharSequence charSequence) {
        this.allowButtonView.setText(charSequence);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void setGeoLocationInfo(@NonNull CharSequence charSequence) {
        this.geoLocationInfoView.setVisibility(0);
        this.geoLocationInfoView.setTextWithLink(charSequence, charSequence, getGeoLocationInfoClickListener());
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void setHandsfreeSettingsInfo(@NonNull CharSequence charSequence) {
        this.handsfreeSettingsView.setText(charSequence);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void setLaterButtonText(@NonNull CharSequence charSequence) {
        this.laterButtonView.setText(charSequence);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void setRationale(@NonNull CharSequence charSequence, CharSequence charSequence2) {
        if (TextUtils.isEmpty(charSequence)) {
            this.rationaleView.setVisibility(8);
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextViewWithLink textViewWithLink = this.rationaleView;
        if (!isEmpty) {
            textViewWithLink.setTextWithLink(charSequence, charSequence2, getRationaleClickListener());
        } else {
            textViewWithLink.setText(charSequence);
            this.rationaleView.setVisibility(0);
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void setStatusBarHeightAsTopPadding() {
        View view = this.primerView;
        if (view != null) {
            ViewUtils.addStatusBarHeightAsTopPadding(view);
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void setTitle(@NonNull CharSequence charSequence) {
        this.titleView.setText(charSequence);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void setUsage(@NonNull CharSequence charSequence, CharSequence charSequence2) {
        this.usageView.setTextWithLink(charSequence, charSequence2, getUsageClickListener());
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void showHandsfreeSettingsInfo(boolean z) {
        this.handsfreeSettingsView.setVisibility(z ? 0 : 8);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void shrinkTopMargin() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.contentView.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.contentView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.View
    public void floodBackgroundToStatusBar() {
    }
}
