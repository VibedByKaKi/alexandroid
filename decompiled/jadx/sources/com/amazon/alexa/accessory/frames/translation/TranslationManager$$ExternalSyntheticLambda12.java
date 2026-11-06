package com.amazon.alexa.accessory.frames.translation;

import com.amazon.alexa.accessory.frames.translation.TranslationManager;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class TranslationManager$$ExternalSyntheticLambda12 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TranslationManager f$0;

    public /* synthetic */ TranslationManager$$ExternalSyntheticLambda12(TranslationManager translationManager, int i) {
        this.$r8$classId = i;
        this.f$0 = translationManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        TranslationManager.PersistedStartContext handleAccessoryStartTranslation$lambda$20;
        TranslationManager.PersistedStartContext resolveLanguagesForCloudStartDirective$lambda$19;
        int i = this.$r8$classId;
        TranslationManager translationManager = this.f$0;
        switch (i) {
            case 0:
                handleAccessoryStartTranslation$lambda$20 = TranslationManager.handleAccessoryStartTranslation$lambda$20(translationManager);
                return handleAccessoryStartTranslation$lambda$20;
            default:
                resolveLanguagesForCloudStartDirective$lambda$19 = TranslationManager.resolveLanguagesForCloudStartDirective$lambda$19(translationManager);
                return resolveLanguagesForCloudStartDirective$lambda$19;
        }
    }
}
