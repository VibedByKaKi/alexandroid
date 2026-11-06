package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword;

import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.DefaultSpeechModelSource$subscribeToLocaleChanges$1;
import com.amazon.alexa.assistant.foundation.model.SystemLocale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultSpeechModelSource$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultSpeechModelSource f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DefaultSpeechModelSource$$ExternalSyntheticLambda1(DefaultSpeechModelSource defaultSpeechModelSource, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultSpeechModelSource;
        this.f$1 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit updateModel$lambda$5;
        Unit emit$lambda$3;
        switch (this.$r8$classId) {
            case 0:
                updateModel$lambda$5 = DefaultSpeechModelSource.updateModel$lambda$5(this.f$0, (Function1) this.f$1, (Result) obj);
                return updateModel$lambda$5;
            default:
                emit$lambda$3 = DefaultSpeechModelSource$subscribeToLocaleChanges$1.AnonymousClass1.emit$lambda$3(this.f$0, (SystemLocale) this.f$1, (Result) obj);
                return emit$lambda$3;
        }
    }
}
