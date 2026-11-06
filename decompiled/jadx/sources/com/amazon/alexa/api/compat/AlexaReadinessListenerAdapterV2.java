package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.AlexaReadinessListenerV2;
import com.amazon.alexa.api.compat.model.AlexaReadyStateV2;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaReadinessListenerAdapterV2;", "Lcom/amazon/alexa/api/AlexaReadinessListener;", "modelListener", "Lcom/amazon/alexa/api/compat/model/AlexaReadinessListenerV2;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaReadinessListenerV2;)V", "onReadinessChanged", "", "alexaReadyState", "Lcom/amazon/alexa/api/AlexaReadyState;", "fromVoxSdk", "Lcom/amazon/alexa/api/compat/model/AlexaReadyStateV2;", "state", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlexaReadinessListenerAdapterV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaReadinessListenerAdapterV2.kt\ncom/amazon/alexa/api/compat/AlexaReadinessListenerAdapterV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/* loaded from: classes16.dex */
public final class AlexaReadinessListenerAdapterV2 implements com.amazon.alexa.api.AlexaReadinessListener {

    @NotNull
    private final AlexaReadinessListenerV2 modelListener;

    public AlexaReadinessListenerAdapterV2(@NotNull AlexaReadinessListenerV2 alexaReadinessListenerV2) {
        alexaReadinessListenerV2.getClass();
        this.modelListener = alexaReadinessListenerV2;
    }

    private final AlexaReadyStateV2 fromVoxSdk(com.amazon.alexa.api.AlexaReadyState state) {
        return new AlexaReadyStateV2(state.isConnected(), state.isReady());
    }

    @Override // com.amazon.alexa.api.AlexaReadinessListener
    public void onReadinessChanged(@Nullable com.amazon.alexa.api.AlexaReadyState alexaReadyState) {
        this.modelListener.onReadinessChanged(alexaReadyState != null ? fromVoxSdk(alexaReadyState) : null);
    }
}
