package com.amazon.deecomms.calling.ui.ep.audio;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.R;
import com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract;
import com.amazon.deecomms.calling.contracts.outgoing.OutgoingCallPresenterContract;
import com.amazon.deecomms.calling.ui.DialPad;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.core.CapabilitiesManager;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.util.DeviceInfo;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class OutgoingEnhancedProcessingAudioCallFragment extends Fragment implements OutgoingAudioCallViewContract<OutgoingCallPresenterContract>, DialPad.DialPadShowCallback {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, OutgoingEnhancedProcessingAudioCallFragment.class);
    private TextView callStatus;

    @Inject
    CapabilitiesManager capabilitiesManager;
    private ImageButton dialPadButton;
    private DialPad dialPadView;
    private View mainOutgoingCallView;
    private ImageButton micIcon;
    private OutgoingCallPresenterContract outgoingCallPresenterContract;
    private ImageView progressDots;
    private ImageButton rejectButton;
    private TextView remoteParticipantName;
    private View rootView;
    private TextView screenTitle;
    private ImageButton speakerButton;

    private int determineLayoutToInflate() {
        return (getContext() == null || DeviceInfo.isPhone(getContext())) ? this.capabilitiesManager.isMosaicThemingEnabled() ? R.layout.mosaic_outgoing_call_view : R.layout.fiesta_outgoing_call_view : this.capabilitiesManager.isMosaicThemingEnabled() ? R.layout.mosaic_outgoing_call_view_tablet : R.layout.outgoing_call_view_tablet;
    }

    private void initializeUIWidgets() {
        this.mainOutgoingCallView = this.rootView.findViewById(R.id.main_outgoing_call_view);
        this.dialPadButton = (ImageButton) this.rootView.findViewById(R.id.dialPadToggleButton);
        this.dialPadView = (DialPad) this.rootView.findViewById(R.id.dial_pad_view);
        this.remoteParticipantName = (TextView) this.rootView.findViewById(R.id.callParticipantName);
        this.speakerButton = (ImageButton) this.rootView.findViewById(R.id.speakerButton);
        this.micIcon = (ImageButton) this.rootView.findViewById(R.id.muteButton);
        this.callStatus = (TextView) this.rootView.findViewById(R.id.callStatus);
        this.rejectButton = (ImageButton) this.rootView.findViewById(R.id.callFinishButton);
        this.progressDots = (ImageView) this.rootView.findViewById(R.id.progress_dots);
        this.screenTitle = (TextView) this.rootView.findViewById(R.id.screen_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$activateCallControls$0(View view) {
        this.outgoingCallPresenterContract.toggleSpeaker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$activateCallControls$1(View view) {
        this.outgoingCallPresenterContract.endCall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDialpad$2(View view) {
        showDialPad(true);
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void activateCallControls() {
        this.speakerButton.setOnClickListener(new OutgoingEnhancedProcessingAudioCallFragment$$ExternalSyntheticLambda0(this, 0));
        this.rejectButton.setOnClickListener(new OutgoingEnhancedProcessingAudioCallFragment$$ExternalSyntheticLambda0(this, 1));
        this.dialPadView.setShowCallback(this);
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void hideCallScreenTitleMessage() {
        this.screenTitle.setVisibility(4);
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void hideCallStatus() {
        this.callStatus.setVisibility(4);
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void hideDialpad() {
        this.dialPadButton.setVisibility(8);
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void hideRemoteParticipantName() {
        this.remoteParticipantName.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.outgoingCallPresenterContract.onViewCreated();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LOG.d(" onCreateView of Outgoing call Fragment");
        CommsDaggerWrapper.getComponent().inject(this);
        this.rootView = layoutInflater.inflate(determineLayoutToInflate(), viewGroup, false);
        initializeUIWidgets();
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.outgoingCallPresenterContract.onViewDestroyed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MetricsHelper.recordSingleOccurrenceClickstream(MetricKeys.SCREEN_CALL_OUT_SHOWN);
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void showCallScreenTitleMessage(String str) {
        this.screenTitle.setText(str);
        this.screenTitle.setVisibility(0);
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void showCallStatus(String str) {
        this.callStatus.setText(str);
        this.callStatus.setVisibility(0);
    }

    @Override // com.amazon.deecomms.calling.ui.DialPad.DialPadShowCallback
    public void showDialPad(boolean z) {
        if (z) {
            this.mainOutgoingCallView.setVisibility(8);
            this.dialPadView.setVisibility(0);
        } else {
            this.dialPadView.setVisibility(8);
            this.mainOutgoingCallView.setVisibility(0);
        }
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void showDialpad() {
        this.dialPadButton.setEnabled(true);
        this.dialPadButton.setOnClickListener(new OutgoingEnhancedProcessingAudioCallFragment$$ExternalSyntheticLambda0(this, 2));
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void showOutgoingCallIsInProgress() {
        this.progressDots.setVisibility(0);
        ((AnimationDrawable) this.progressDots.getBackground()).start();
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void showRemoteParticipantName(String str) {
        this.remoteParticipantName.setText(str);
        this.remoteParticipantName.setVisibility(0);
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void showSpeakerOff() {
        this.speakerButton.setImageResource(R.drawable.fiesta_ic_volume_on);
        this.speakerButton.setColorFilter(getResources().getColor(R.color.fiesta_btn_on));
        this.speakerButton.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.fiesta_btn_enabled_default));
        this.speakerButton.setSelected(false);
    }

    @Override // com.amazon.deecomms.calling.contracts.outgoing.OutgoingAudioCallViewContract
    public void showSpeakerOn() {
        this.speakerButton.setImageResource(R.drawable.fiesta_ic_volume_on);
        this.speakerButton.setColorFilter(getResources().getColor(R.color.fiesta_btn_off));
        this.speakerButton.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.fiesta_btn_enabled_selected));
        this.speakerButton.setSelected(true);
    }

    @Override // com.amazon.deecomms.calling.contracts.BaseViewContract
    public void setPresenter(OutgoingCallPresenterContract outgoingCallPresenterContract) {
        this.outgoingCallPresenterContract = outgoingCallPresenterContract;
    }
}
