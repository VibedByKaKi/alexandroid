package com.amazon.alexa.accessory.frames.translation;

import com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class TranslationManager$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TranslationManager f$0;

    public /* synthetic */ TranslationManager$$ExternalSyntheticLambda2(TranslationManager translationManager, int i) {
        this.$r8$classId = i;
        this.f$0 = translationManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit startAccessoryInitiatedTranslationSession$lambda$25;
        Unit audioPlayer$lambda$6$lambda$5;
        Unit responseHandler$lambda$14$lambda$10;
        Unit responseHandler$lambda$14$lambda$11;
        Unit responseHandler$lambda$14$lambda$12;
        int i = this.$r8$classId;
        TranslationManager translationManager = this.f$0;
        switch (i) {
            case 0:
                startAccessoryInitiatedTranslationSession$lambda$25 = TranslationManager.startAccessoryInitiatedTranslationSession$lambda$25(translationManager, (Throwable) obj);
                return startAccessoryInitiatedTranslationSession$lambda$25;
            case 1:
                audioPlayer$lambda$6$lambda$5 = TranslationManager.audioPlayer$lambda$6$lambda$5(translationManager, (TranslationAudioPlayer.PlaybackErrorType) obj);
                return audioPlayer$lambda$6$lambda$5;
            case 2:
                responseHandler$lambda$14$lambda$10 = TranslationManager.responseHandler$lambda$14$lambda$10(translationManager, (String) obj);
                return responseHandler$lambda$14$lambda$10;
            case 3:
                responseHandler$lambda$14$lambda$11 = TranslationManager.responseHandler$lambda$14$lambda$11(translationManager, (String) obj);
                return responseHandler$lambda$14$lambda$11;
            default:
                responseHandler$lambda$14$lambda$12 = TranslationManager.responseHandler$lambda$14$lambda$12(translationManager, (byte[]) obj);
                return responseHandler$lambda$14$lambda$12;
        }
    }
}
