package com.amazon.alexa.client.alexaservice.base.userspeechprovider;

import android.util.Log;
import com.amazon.alexa.api.AlexaDialogTurn;
import com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy;
import com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator;
import com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks;
import com.amazon.alexa.api.AlexaNextDialogTurn;
import com.amazon.alexa.api.AlexaUserSpeechProvider;
import com.amazon.alexa.api.DialogData;
import com.amazon.alexa.api.DialogRequestDeniedReason;
import com.amazon.alexa.api.DialogTurnData;
import com.amazon.clouddrive.cdasdk.aps.account.FeatureState;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class LegacySystemWakeWordUserSpeechProvider implements AlexaUserSpeechProvider {
    private static final String TAG = "LegacySystemWakeWordUserSpeechProvider";

    @Inject
    public LegacySystemWakeWordUserSpeechProvider() {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void setWakeWordDetectionEnabled(boolean z) {
        Log.w(TAG, "System wakeword is expected to be ".concat(z ? "enabled" : FeatureState.DISABLED));
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void onDialogFinished(DialogData dialogData) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void onDialogRequestDenied(DialogRequestDeniedReason dialogRequestDeniedReason) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void onDialogRequested(AlexaDialogTurn alexaDialogTurn) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void onDialogStarted(DialogData dialogData) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void onDialogTurnFinished(DialogTurnData dialogTurnData) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void onDialogTurnRequested(AlexaNextDialogTurn alexaNextDialogTurn) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void onDialogTurnStarted(DialogTurnData dialogTurnData) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void pauseWakeWordDetection(String str) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void resumeWakeWordDetection(String str) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void onDialogTurnResponsePending(DialogTurnData dialogTurnData, AlexaDialogTurnResponseCoordinator alexaDialogTurnResponseCoordinator) {
    }

    @Override // com.amazon.alexa.api.AlexaUserSpeechProvider
    public void onDialogTurnReserveResponse(DialogTurnData dialogTurnData, long j, AlexaDialogTurnResponseCoordinationPolicy alexaDialogTurnResponseCoordinationPolicy, AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks) {
    }
}
