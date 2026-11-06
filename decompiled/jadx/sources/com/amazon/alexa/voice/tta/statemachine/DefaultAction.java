package com.amazon.alexa.voice.tta.statemachine;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.tta.statemachine.Event;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CombinedContext$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004BO\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012:\b\u0002\u0010\u0007\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J;\u0010\u0019\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\bHÆ\u0003J]\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062:\b\u0002\u0010\u0007\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013RL\u0010\u0007\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/DefaultAction;", ExifInterface.LONGITUDE_EAST, "Lcom/amazon/alexa/voice/tta/statemachine/Event;", "D", "Lcom/amazon/alexa/voice/tta/statemachine/Action;", "targetState", "Lcom/amazon/alexa/voice/tta/statemachine/State;", "execute", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "state", "event", "", "<init>", "(Lcom/amazon/alexa/voice/tta/statemachine/State;Lkotlin/jvm/functions/Function2;)V", "getTargetState", "()Lcom/amazon/alexa/voice/tta/statemachine/State;", "setTargetState", "(Lcom/amazon/alexa/voice/tta/statemachine/State;)V", "getExecute", "()Lkotlin/jvm/functions/Function2;", "setExecute", "(Lkotlin/jvm/functions/Function2;)V", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class DefaultAction<E extends Event<D>, D> implements Action<E, D> {

    @NotNull
    private Function2<? super State, ? super E, Unit> execute;

    @Nullable
    private State targetState;

    public /* synthetic */ DefaultAction(State state, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : state, (i & 2) != 0 ? new CombinedContext$$ExternalSyntheticLambda1(7) : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(State state, Event event) {
        state.getClass();
        event.getClass();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultAction copy$default(DefaultAction defaultAction, State state, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            state = defaultAction.targetState;
        }
        if ((i & 2) != 0) {
            function2 = defaultAction.execute;
        }
        return defaultAction.copy(state, function2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final State getTargetState() {
        return this.targetState;
    }

    @NotNull
    public final Function2<State, E, Unit> component2() {
        return this.execute;
    }

    @NotNull
    public final DefaultAction<E, D> copy(@Nullable State targetState, @NotNull Function2<? super State, ? super E, Unit> execute) {
        execute.getClass();
        return new DefaultAction<>(targetState, execute);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultAction)) {
            return false;
        }
        DefaultAction defaultAction = (DefaultAction) other;
        return Intrinsics.areEqual(this.targetState, defaultAction.targetState) && Intrinsics.areEqual(this.execute, defaultAction.execute);
    }

    @Override // com.amazon.alexa.voice.tta.statemachine.Action
    @NotNull
    public Function2<State, E, Unit> getExecute() {
        return this.execute;
    }

    @Override // com.amazon.alexa.voice.tta.statemachine.Action
    @Nullable
    public State getTargetState() {
        return this.targetState;
    }

    public int hashCode() {
        State state = this.targetState;
        return this.execute.hashCode() + ((state == null ? 0 : state.hashCode()) * 31);
    }

    @Override // com.amazon.alexa.voice.tta.statemachine.Action
    public void setExecute(@NotNull Function2<? super State, ? super E, Unit> function2) {
        function2.getClass();
        this.execute = function2;
    }

    @Override // com.amazon.alexa.voice.tta.statemachine.Action
    public void setTargetState(@Nullable State state) {
        this.targetState = state;
    }

    @NotNull
    public String toString() {
        return "DefaultAction(targetState=" + this.targetState + ", execute=" + this.execute + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public DefaultAction(@Nullable State state, @NotNull Function2<? super State, ? super E, Unit> function2) {
        function2.getClass();
        this.targetState = state;
        this.execute = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultAction() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
