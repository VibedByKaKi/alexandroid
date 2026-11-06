package com.amazon.alexa.ra.apl.deepbrowse.apis;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.api.compat.model.AlexaAplCommandListener;
import com.amazon.alexa.api.compat.model.AlexaAudioTask;
import com.amazon.alexa.api.compat.model.AlexaEvent;
import com.amazon.alexa.api.compat.model.AlexaVisualTask;
import com.amazon.alexa.api.compat.model.AplState;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bJ\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/apis/DeepBrowseVoiceApis;", "", "sdk", "Lcom/amazon/alexa/api/compat/AlexaMobileFrameworkApisV2;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaMobileFrameworkApisV2;)V", "start", "", "stop", "send", "event", "Lcom/amazon/alexa/api/compat/model/AlexaEvent;", "(Lcom/amazon/alexa/api/compat/model/AlexaEvent;)Lkotlin/Unit;", "state", "Lcom/amazon/alexa/api/compat/model/AplState;", "(Lcom/amazon/alexa/api/compat/model/AplState;)Lkotlin/Unit;", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/AlexaAplCommandListener;", "(Lcom/amazon/alexa/api/compat/model/AlexaAplCommandListener;)Lkotlin/Unit;", "deregister", "schedule", "visualTask", "Lcom/amazon/alexa/api/compat/model/AlexaVisualTask;", "unschedule", "audioTask", "Lcom/amazon/alexa/api/compat/model/AlexaAudioTask;", "(Lcom/amazon/alexa/api/compat/model/AlexaAudioTask;)Lkotlin/Unit;", "Companion", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DeepBrowseVoiceApis {

    @NotNull
    private static final String TAG = "DeepBrowseVoiceApis";

    @NotNull
    private final AlexaMobileFrameworkApisV2 sdk;
    public static final int $stable = 8;

    public DeepBrowseVoiceApis(@NotNull AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2) {
        alexaMobileFrameworkApisV2.getClass();
        this.sdk = alexaMobileFrameworkApisV2;
    }

    @Nullable
    public final Unit deregister(@Nullable AlexaAplCommandListener listener) {
        if (listener == null) {
            return null;
        }
        this.sdk.getCardsApi().deregisterAplCommandListener(listener);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Unit register(@Nullable AlexaAplCommandListener listener) {
        if (listener == null) {
            return null;
        }
        this.sdk.getCardsApi().registerAplCommandListener(listener);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object schedule(@Nullable AlexaVisualTask visualTask) {
        if (visualTask == null) {
            return null;
        }
        try {
            this.sdk.getVisualTaskApi().schedule(visualTask);
            return Unit.INSTANCE;
        } catch (UnsupportedOperationException unused) {
            return Integer.valueOf(Log.d(TAG, "Visual task scheduling not supported on current SDK"));
        }
    }

    @Nullable
    public final Unit send(@Nullable AlexaEvent event) {
        if (event == null) {
            return null;
        }
        this.sdk.getCapabilitiesApi().sendEvent(event, true);
        return Unit.INSTANCE;
    }

    public final void start() {
        this.sdk.start();
    }

    public final void stop() {
        this.sdk.stop();
    }

    @Nullable
    public final Object unschedule(@Nullable AlexaVisualTask visualTask) {
        if (visualTask == null) {
            return null;
        }
        try {
            this.sdk.getVisualTaskApi().unschedule(visualTask);
            return Unit.INSTANCE;
        } catch (UnsupportedOperationException unused) {
            return Integer.valueOf(Log.d(TAG, "Visual task unscheduling not supported on current SDK"));
        }
    }

    @Nullable
    public final Unit send(@Nullable AplState state) {
        if (state == null) {
            return null;
        }
        this.sdk.getCardsApi().reportAplState(state);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Unit schedule(@Nullable AlexaAudioTask audioTask) {
        if (audioTask == null) {
            return null;
        }
        this.sdk.getAudioTaskSchedulerApi().scheduleAudioTask(audioTask);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Unit unschedule(@Nullable AlexaAudioTask audioTask) {
        if (audioTask == null) {
            return null;
        }
        this.sdk.getAudioTaskSchedulerApi().unscheduleAudioTask(audioTask);
        return Unit.INSTANCE;
    }
}
