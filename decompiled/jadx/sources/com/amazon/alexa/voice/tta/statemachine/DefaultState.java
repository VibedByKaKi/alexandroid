package com.amazon.alexa.voice.tta.statemachine;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R2\u0010\b\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u000b0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/DefaultState;", "Lcom/amazon/alexa/voice/tta/statemachine/State;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "transitions", "", "Ljava/lang/Class;", "", "Lcom/amazon/alexa/voice/tta/statemachine/Action;", "getTransitions", "()Ljava/util/Map;", "handle", "D", "event", "Lcom/amazon/alexa/voice/tta/statemachine/Event;", "isEventSupported", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStateMachineImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateMachineImpl.kt\ncom/amazon/alexa/voice/tta/statemachine/DefaultState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1#2:96\n1863#3,2:97\n*S KotlinDebug\n*F\n+ 1 StateMachineImpl.kt\ncom/amazon/alexa/voice/tta/statemachine/DefaultState\n*L\n78#1:97,2\n*E\n"})
/* loaded from: classes19.dex */
public class DefaultState implements State {

    @NotNull
    private final String name;

    @NotNull
    private final Map<Class<?>, List<Action<?, ?>>> transitions;

    public DefaultState(@NotNull String str) {
        str.getClass();
        this.name = str;
        this.transitions = new LinkedHashMap();
    }

    @Override // com.amazon.alexa.voice.tta.statemachine.State
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.amazon.alexa.voice.tta.statemachine.State
    @NotNull
    public Map<Class<?>, List<Action<?, ?>>> getTransitions() {
        return this.transitions;
    }

    @Override // com.amazon.alexa.voice.tta.statemachine.State
    @NotNull
    public <D> State handle(@NotNull Event<D> event) {
        event.getClass();
        List<Action<?, ?>> emptyList = CollectionsKt.emptyList();
        List<Action<?, ?>> list = getTransitions().get(event.getClass());
        if (list != null) {
            emptyList = list;
        }
        emptyList.getClass();
        Iterator<T> it2 = emptyList.iterator();
        State state = null;
        while (it2.hasNext()) {
            Action action = (Action) it2.next();
            action.getExecute().invoke(this, event);
            State targetState = state == null ? action.getTargetState() : state;
            if (targetState != null) {
                state = targetState;
            }
        }
        return state == null ? this : state;
    }

    @Override // com.amazon.alexa.voice.tta.statemachine.State
    public boolean isEventSupported(@NotNull Event<?> event) {
        event.getClass();
        return getTransitions().containsKey(event.getClass());
    }
}
