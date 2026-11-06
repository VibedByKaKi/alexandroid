package com.amazon.alexa.ra.features.personality;

import com.amazon.alexa.ra.chrome.model.PersonalityId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public /* synthetic */ class PersonalitySource$register$1 extends FunctionReferenceImpl implements Function2<PersonalityId, String, Unit> {
    public PersonalitySource$register$1(Object obj) {
        super(2, obj, PersonalityListener.class, "onPersonalityUpdated", "onPersonalityUpdated(Lcom/amazon/alexa/ra/chrome/model/PersonalityId;Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PersonalityId personalityId, String str) {
        personalityId.getClass();
        ((PersonalityListener) this.receiver).onPersonalityUpdated(personalityId, str);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PersonalityId personalityId, String str) {
        invoke2(personalityId, str);
        return Unit.INSTANCE;
    }
}
