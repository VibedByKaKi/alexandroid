package com.amazon.alexa.redesign.view.homeFeed;

import com.amazon.alexa.ra.plugin.RaUiOptionsPluginExtensionsKt;
import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CardLoadingStatusMap$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CardLoadingStatusMap$$ExternalSyntheticLambda0(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit addCardToThisEvent$lambda$1;
        RaUiOptions buildContainerRestoreOptions;
        switch (this.$r8$classId) {
            case 0:
                addCardToThisEvent$lambda$1 = CardLoadingStatusMap.addCardToThisEvent$lambda$1(this.f$0, this.f$1);
                return addCardToThisEvent$lambda$1;
            default:
                buildContainerRestoreOptions = RaUiOptionsPluginExtensionsKt.buildContainerRestoreOptions(this.f$0, this.f$1);
                return buildContainerRestoreOptions;
        }
    }
}
