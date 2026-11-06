package com.amazon.alexa.voice.tta.statemachine;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.voice.tta.statemachine.Event;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nRJ\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\fX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/Action;", ExifInterface.LONGITUDE_EAST, "Lcom/amazon/alexa/voice/tta/statemachine/Event;", "D", "", "targetState", "Lcom/amazon/alexa/voice/tta/statemachine/State;", "getTargetState", "()Lcom/amazon/alexa/voice/tta/statemachine/State;", "setTargetState", "(Lcom/amazon/alexa/voice/tta/statemachine/State;)V", "execute", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "state", "event", "", "getExecute", "()Lkotlin/jvm/functions/Function2;", "setExecute", "(Lkotlin/jvm/functions/Function2;)V", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface Action<E extends Event<D>, D> {
    @NotNull
    Function2<State, E, Unit> getExecute();

    @Nullable
    State getTargetState();

    void setExecute(@NotNull Function2<? super State, ? super E, Unit> function2);

    void setTargetState(@Nullable State state);
}
