package com.amazon.deecomms.calling.ui.ep.audio;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.R;
import com.amazon.deecomms.calling.contracts.incoming.IncomingAudioCallViewContract;
import com.amazon.deecomms.calling.contracts.incoming.IncomingCallPresenterContract;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.AlertSource;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.core.CapabilitiesManager;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.perms.PermissionsHelper;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class IncomingEnhancedProcessingAudioCallFragment extends Fragment implements IncomingAudioCallViewContract<IncomingCallPresenterContract> {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, IncomingEnhancedProcessingAudioCallFragment.class);
    private ImageButton acceptCallButton;
    private TextView callerNameView;
    private TextView callerStatusView;

    @Inject
    CapabilitiesManager capabilitiesManager;
    private IncomingCallPresenterContract presenter;
    private ImageButton rejectButton;
    private View rootView;

    @VisibleForTesting
    public IncomingEnhancedProcessingAudioCallFragment(@NonNull CapabilitiesManager capabilitiesManager) {
        this.capabilitiesManager = capabilitiesManager;
    }

    private void initializeUIWidgets() {
        this.callerNameView = (TextView) this.rootView.findViewById(R.id.callParticipantName);
        this.callerStatusView = (TextView) this.rootView.findViewById(R.id.callStatus);
        this.acceptCallButton = (ImageButton) this.rootView.findViewById(R.id.acceptCallButton);
        this.rejectButton = (ImageButton) this.rootView.findViewById(R.id.callFinishButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$activateCallControls$0(View view) {
        this.presenter.checkForPermissionsAndAcceptCall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$activateCallControls$1(View view) {
        this.presenter.rejectCall();
    }

    @Override // com.amazon.deecomms.calling.contracts.incoming.IncomingAudioCallViewContract
    public void activateCallControls() {
        final int i = 0;
        this.acceptCallButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.deecomms.calling.ui.ep.audio.IncomingEnhancedProcessingAudioCallFragment$$ExternalSyntheticLambda0
            public final /* synthetic */ IncomingEnhancedProcessingAudioCallFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                IncomingEnhancedProcessingAudioCallFragment incomingEnhancedProcessingAudioCallFragment = this.f$0;
                switch (i2) {
                    case 0:
                        incomingEnhancedProcessingAudioCallFragment.lambda$activateCallControls$0(view);
                        break;
                    default:
                        incomingEnhancedProcessingAudioCallFragment.lambda$activateCallControls$1(view);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.rejectButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.deecomms.calling.ui.ep.audio.IncomingEnhancedProcessingAudioCallFragment$$ExternalSyntheticLambda0
            public final /* synthetic */ IncomingEnhancedProcessingAudioCallFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                IncomingEnhancedProcessingAudioCallFragment incomingEnhancedProcessingAudioCallFragment = this.f$0;
                switch (i22) {
                    case 0:
                        incomingEnhancedProcessingAudioCallFragment.lambda$activateCallControls$0(view);
                        break;
                    default:
                        incomingEnhancedProcessingAudioCallFragment.lambda$activateCallControls$1(view);
                        break;
                }
            }
        });
    }

    @VisibleForTesting
    public int determineLayoutToInflate() {
        return this.capabilitiesManager.isMosaicThemingEnabled() ? R.layout.mosaic_incoming_call_view : this.capabilitiesManager.isThemedUIEnabled() ? R.layout.fiesta_incoming_call_view : R.layout.incoming_call_view;
    }

    @Override // com.amazon.deecomms.calling.contracts.incoming.IncomingAudioCallViewContract
    public void hideCallControls() {
        this.acceptCallButton.setVisibility(4);
        this.rejectButton.setVisibility(4);
    }

    @Override // com.amazon.deecomms.calling.contracts.incoming.IncomingAudioCallViewContract
    public void hideCallStatus() {
        this.callerStatusView.setVisibility(4);
    }

    @Override // com.amazon.deecomms.calling.contracts.incoming.IncomingAudioCallViewContract
    public void hideRemoteParticipantName() {
        this.callerNameView.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.presenter.onViewCreated();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CommsDaggerWrapper.getComponent().inject(this);
        LOG.d("[Comms-calling]: onCreateView of IncomingCallFragment ");
        this.rootView = layoutInflater.inflate(determineLayoutToInflate(), viewGroup, false);
        getActivity().getWindow().addFlags(128);
        initializeUIWidgets();
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.onViewDestroyed();
        getActivity().getWindow().clearFlags(128);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MetricsHelper.recordSingleOccurrenceClickstream(MetricKeys.SCREEN_CALL_IN_SHOWN);
    }

    @Override // com.amazon.deecomms.calling.contracts.incoming.IncomingAudioCallViewContract
    public void showCallStatus(@NonNull String str) {
        this.callerStatusView.setText(str);
        this.callerStatusView.setVisibility(0);
    }

    @Override // com.amazon.deecomms.calling.contracts.incoming.IncomingAudioCallViewContract
    public void showIncomingCallPermissions(@NonNull String[] strArr) {
        PermissionsHelper.requestPermission((Activity) getActivity(), PermissionsHelper.getDeniedCallingPermissionsRationale(this.rootView.getContext(), false), strArr, 1, "comms.alert.perms.mic.open", MetricKeys.SCREEN_NAME_INCOMING_CALL, AlertSource.newClassSource(this), true, (DialogInterface.OnDismissListener) null);
    }

    @Override // com.amazon.deecomms.calling.contracts.incoming.IncomingAudioCallViewContract
    public void showRemoteParticipantName(@NonNull String str) {
        this.callerNameView.setText(str);
        this.callerNameView.setVisibility(0);
    }

    public IncomingEnhancedProcessingAudioCallFragment() {
    }

    @Override // com.amazon.deecomms.calling.contracts.BaseViewContract
    public void setPresenter(@NonNull IncomingCallPresenterContract incomingCallPresenterContract) {
        this.presenter = incomingCallPresenterContract;
    }
}
