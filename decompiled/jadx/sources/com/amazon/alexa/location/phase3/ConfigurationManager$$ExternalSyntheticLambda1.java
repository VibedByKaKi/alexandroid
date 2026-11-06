package com.amazon.alexa.location.phase3;

import com.google.android.gms.location.LocationSettingsStates;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ConfigurationManager$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConfigurationManager f$0;

    public /* synthetic */ ConfigurationManager$$ExternalSyntheticLambda1(ConfigurationManager configurationManager, int i) {
        this.$r8$classId = i;
        this.f$0 = configurationManager;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        ConfigurationManager configurationManager = this.f$0;
        switch (i) {
            case 0:
                configurationManager.lambda$start$1((Configuration) obj);
                break;
            default:
                configurationManager.lambda$checkSettings$3((LocationSettingsStates) obj);
                break;
        }
    }
}
