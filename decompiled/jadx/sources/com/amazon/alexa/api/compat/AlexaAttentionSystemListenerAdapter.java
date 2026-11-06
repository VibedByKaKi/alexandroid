package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaAttentionSystemListener;
import com.amazon.alexa.api.AlexaStateExtras;
import com.amazon.alexa.api.compat.model.AlexaStateV2;
import com.amazon.alexa.mobile.assistant.client.observers.SystemUiChromeStateObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaAttentionSystemListenerAdapter;", "Lcom/amazon/alexa/api/AlexaAttentionSystemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/AlexaAttentionSystemListener;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaAttentionSystemListener;)V", "onAlexaStateChanged", "", SystemUiChromeStateObserver.CONTENT_KEY_ALEXA_STATE, "Lcom/amazon/alexa/api/AlexaState;", "alexaStateExtras", "Lcom/amazon/alexa/api/AlexaStateExtras;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlexaAttentionSystemListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaAttentionSystemListenerAdapter.kt\ncom/amazon/alexa/api/compat/AlexaAttentionSystemListenerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
/* loaded from: classes16.dex */
public final class AlexaAttentionSystemListenerAdapter implements AlexaAttentionSystemListener {

    @NotNull
    private final com.amazon.alexa.api.compat.model.AlexaAttentionSystemListener listener;

    public AlexaAttentionSystemListenerAdapter(@NotNull com.amazon.alexa.api.compat.model.AlexaAttentionSystemListener alexaAttentionSystemListener) {
        alexaAttentionSystemListener.getClass();
        this.listener = alexaAttentionSystemListener;
    }

    @Override // com.amazon.alexa.api.AlexaAttentionSystemListener
    public void onAlexaStateChanged(@Nullable com.amazon.alexa.api.AlexaState alexaState, @Nullable AlexaStateExtras alexaStateExtras) {
        AlexaStateV2 alexaStateV2;
        com.amazon.alexa.api.compat.model.AlexaAttentionSystemListener alexaAttentionSystemListener = this.listener;
        if (alexaState == null || (alexaStateV2 = AlexaStateV2.valueOf(alexaState.name())) == null) {
            alexaStateV2 = AlexaStateV2.UNKNOWN;
        }
        alexaAttentionSystemListener.onAlexaStateChanged(alexaStateV2, alexaStateExtras != null ? new com.amazon.alexa.api.compat.model.AlexaStateExtras(alexaStateExtras.getWakeword()) : new com.amazon.alexa.api.compat.model.AlexaStateExtras(null, 1, null));
    }
}
