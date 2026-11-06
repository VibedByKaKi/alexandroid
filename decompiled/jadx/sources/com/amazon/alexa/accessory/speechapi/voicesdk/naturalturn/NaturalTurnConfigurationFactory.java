package com.amazon.alexa.accessory.speechapi.voicesdk.naturalturn;

import com.amazon.alexa.api.compat.model.NaturalTurnControllerConfiguration;
import com.amazon.alexa.api.compat.model.SecondaryVadConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/naturalturn/NaturalTurnConfigurationFactory;", "", "<init>", "()V", "DEFAULT_SPEECH_THRESHOLD", "", "DEFAULT_VERIFICATION_TIMEOUT_MS", "", "defaultConfiguration", "Lcom/amazon/alexa/api/compat/model/NaturalTurnControllerConfiguration;", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NaturalTurnConfigurationFactory {
    private static final float DEFAULT_SPEECH_THRESHOLD = 0.95f;
    private static final long DEFAULT_VERIFICATION_TIMEOUT_MS = 1500;

    @NotNull
    public static final NaturalTurnConfigurationFactory INSTANCE = new NaturalTurnConfigurationFactory();

    private NaturalTurnConfigurationFactory() {
    }

    @NotNull
    public final NaturalTurnControllerConfiguration defaultConfiguration() {
        return new NaturalTurnControllerConfiguration(new SecondaryVadConfiguration(DEFAULT_SPEECH_THRESHOLD, 1500L), null, null, false, false, 22, null);
    }
}
