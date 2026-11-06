package com.facebook.react.uimanager;

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;
import com.amazon.alexa.ra.android.smartfragment.crypto.SandboxCryptoModule;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ViewManagerRegistry$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ViewManagerRegistry$$ExternalSyntheticLambda4(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onSurfaceStopped$lambda$6;
        String generateLoremIpsum$lambda$0;
        Unit digestStringAsync$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                onSurfaceStopped$lambda$6 = ViewManagerRegistry.onSurfaceStopped$lambda$6((ArrayList) this.f$0, this.f$1);
                return onSurfaceStopped$lambda$6;
            case 1:
                generateLoremIpsum$lambda$0 = LoremIpsum.generateLoremIpsum$lambda$0((Ref.IntRef) this.f$0, this.f$1);
                return generateLoremIpsum$lambda$0;
            default:
                digestStringAsync$lambda$0 = SandboxCryptoModule.digestStringAsync$lambda$0((SandboxCryptoModule) this.f$0, this.f$1);
                return digestStringAsync$lambda$0;
        }
    }
}
