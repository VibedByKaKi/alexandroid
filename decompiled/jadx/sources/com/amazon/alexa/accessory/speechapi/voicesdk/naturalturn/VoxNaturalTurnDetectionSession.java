package com.amazon.alexa.accessory.speechapi.voicesdk.naturalturn;

import com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSession;
import com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSessionError;
import com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSessionState;
import com.amazon.alexa.accessory.speechapi.voicesdk.mapper.NaturalTurnApiModelMapper;
import com.amazon.alexa.api.compat.model.NaturalTurnSession;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/naturalturn/VoxNaturalTurnDetectionSession;", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSession;", "id", "", OperationalEventType.SESSION, "Lcom/amazon/alexa/api/compat/model/NaturalTurnSession;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/api/compat/model/NaturalTurnSession;)V", "getId", "onStateChanged", "", "state", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionState;", "onError", "error", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionError;", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxNaturalTurnDetectionSession implements NaturalTurnDetectionSession {

    @NotNull
    private final String id;

    @NotNull
    private final NaturalTurnSession session;

    public VoxNaturalTurnDetectionSession(@NotNull String str, @NotNull NaturalTurnSession naturalTurnSession) {
        str.getClass();
        naturalTurnSession.getClass();
        this.id = str;
        this.session = naturalTurnSession;
    }

    @Override // com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSession
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSession
    public void onError(@NotNull NaturalTurnDetectionSessionError error) {
        error.getClass();
        this.session.onError(NaturalTurnApiModelMapper.INSTANCE.convertToNaturalTurnSessionError(error));
    }

    @Override // com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSession
    public void onStateChanged(@NotNull NaturalTurnDetectionSessionState state) {
        state.getClass();
        this.session.onStateChanged(NaturalTurnApiModelMapper.INSTANCE.convertToNaturalTurnSessionState(state));
    }
}
