package com.amazon.dee.app.ui.main;

import android.net.Uri;
import android.view.View;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.dee.app.ui.main.StartupStateMachine;
import rx.AsyncEmitter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda5(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MainActivity) this.f$0).lambda$initGlobalHeaderEventSubscriber$0((Message) this.f$1);
                break;
            case 1:
                ((StartupStateMachine.AnonymousClass2) this.f$0).lambda$run$0((StartupStateMachine.State) this.f$1);
                break;
            case 2:
                ((AuthenticationExceptionHandler) this.f$0).lambda$handle$0((AsyncEmitter) this.f$1);
                break;
            case 3:
                ((MainActivity) this.f$0).lambda$setNavigationBindings$12((View) this.f$1);
                break;
            case 4:
                ((MainViewModel) this.f$0).lambda$createRouteFromDeepLinkUri$9((Uri) this.f$1);
                break;
            default:
                ((MainViewModel) this.f$0).lambda$create$2((Runnable) this.f$1);
                break;
        }
    }
}
