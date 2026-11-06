package expo.modules;

import android.view.ViewGroup;
import com.facebook.react.ReactActivityDelegate;
import expo.modules.core.interfaces.ReactActivityHandler;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ReactActivityDelegateWrapper$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactActivityDelegateWrapper f$0;

    public /* synthetic */ ReactActivityDelegateWrapper$$ExternalSyntheticLambda0(ReactActivityDelegateWrapper reactActivityDelegateWrapper, int i) {
        this.$r8$classId = i;
        this.f$0 = reactActivityDelegateWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ReactActivityDelegate onCreate$lambda$7;
        ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler_delegate$lambda$5$lambda$4;
        ViewGroup loadAppImpl$lambda$18;
        int i = this.$r8$classId;
        ReactActivityDelegateWrapper reactActivityDelegateWrapper = this.f$0;
        ReactActivityHandler reactActivityHandler = (ReactActivityHandler) obj;
        switch (i) {
            case 0:
                onCreate$lambda$7 = ReactActivityDelegateWrapper.onCreate$lambda$7(reactActivityDelegateWrapper, reactActivityHandler);
                return onCreate$lambda$7;
            case 1:
                delayLoadAppHandler_delegate$lambda$5$lambda$4 = ReactActivityDelegateWrapper.delayLoadAppHandler_delegate$lambda$5$lambda$4(reactActivityDelegateWrapper, reactActivityHandler);
                return delayLoadAppHandler_delegate$lambda$5$lambda$4;
            default:
                loadAppImpl$lambda$18 = ReactActivityDelegateWrapper.loadAppImpl$lambda$18(reactActivityDelegateWrapper, reactActivityHandler);
                return loadAppImpl$lambda$18;
        }
    }
}
