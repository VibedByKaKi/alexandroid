package com.amazon.alexa.assistant.ui.conversation.view.settings;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AuthenticatedWebViewScreenKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ AuthenticatedWebViewScreenKt$$ExternalSyntheticLambda0(List list, boolean z, Function0 function0, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = list;
        this.f$1 = z;
        this.f$2 = function0;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit AuthenticatedWebViewScreen$lambda$0;
        Unit AuthenticatedWebViewContent$lambda$17;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AuthenticatedWebViewScreen$lambda$0 = AuthenticatedWebViewScreenKt.AuthenticatedWebViewScreen$lambda$0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue);
                return AuthenticatedWebViewScreen$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                AuthenticatedWebViewContent$lambda$17 = AuthenticatedWebViewScreenKt.AuthenticatedWebViewContent$lambda$17(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue2);
                return AuthenticatedWebViewContent$lambda$17;
        }
    }
}
