package com.amazon.alexa.voice.tta.statemachine;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0014\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&J)\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0002\b\u0010H&J)\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0002\b\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/StateMachine;", "", "currentState", "Lcom/amazon/alexa/voice/tta/statemachine/State;", "getCurrentState", "()Lcom/amazon/alexa/voice/tta/statemachine/State;", "start", "", "stop", "handle", "event", "Lcom/amazon/alexa/voice/tta/statemachine/Event;", "addInitialState", "state", "init", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "addState", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface StateMachine {
    void addInitialState(@NotNull State state, @NotNull Function1<? super State, Unit> init);

    void addState(@NotNull State state, @NotNull Function1<? super State, Unit> init);

    @NotNull
    State getCurrentState();

    void handle(@NotNull Event<?> event);

    void start();

    void stop();
}
