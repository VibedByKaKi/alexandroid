package com.amazon.dee.app.ui.main;

import android.view.View;
import android.widget.ImageView;
import androidx.core.splashscreen.SplashScreenViewProvider;
import com.amazon.dee.app.ui.main.MainTabBarAnimator;
import com.amazon.deecomms.conversation.ConversationService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainViewModel$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MainViewModel$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((ConversationService) obj).initialize();
                break;
            case 1:
                ((MainTabBarAnimator.AnonymousClass3) obj).lambda$onAnimationEnd$0();
                break;
            case 2:
                ((SplashScreenViewProvider) obj).remove();
                break;
            case 3:
                KhSplashAnimation.fadeOutAndRemove$lambda$1((View) obj);
                break;
            case 4:
                MoreMenuSlideController.scheduleCleanup$lambda$21((MoreMenuSlideController) obj);
                break;
            case 5:
                ((ImageView) obj).setVisibility(8);
                break;
            default:
                ((StartupStateMachine) obj).lambda$navigateToDeeplinkIfReady$11();
                break;
        }
    }
}
