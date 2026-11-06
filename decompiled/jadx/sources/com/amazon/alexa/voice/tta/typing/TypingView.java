package com.amazon.alexa.voice.tta.typing;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.tta.RouterDelegate;
import com.amazon.alexa.voice.tta.ViewDismissedListener;
import com.amazon.alexa.voice.ui.onedesign.transitions.DismissContentTransition;
import com.amazon.alexa.voice.ui.onedesign.transitions.PushContentTransition;
import com.amazon.alexa.voice.ui.onedesign.tta.TtaScreenController;
import com.amazon.alexa.voice.ui.onedesign.tta.TtaScreenParameters;
import com.amazon.regulator.ControllerTransaction;
import com.amazon.regulator.Router;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class TypingView {
    private static final String TAG = "TypingView";

    @VisibleForTesting
    static final String TYPING_CONTROLLER = "typing";
    private final Handler mainHandler;
    private TtaScreenParameters ttaScreenParameters;
    private final RouterDelegate typingRouter;
    private ViewDismissedListener viewDismissedListener;

    @VisibleForTesting
    public TypingView(RouterDelegate routerDelegate, Handler handler) {
        this.typingRouter = routerDelegate;
        this.mainHandler = handler;
        routerDelegate.addOnPopTransactionListener(new Router.OnTransactionAdapter() { // from class: com.amazon.alexa.voice.tta.typing.TypingView.1
            @Override // com.amazon.regulator.Router.OnTransactionAdapter, com.amazon.regulator.Router.OnTransactionListener
            public void onAfterTransition(ControllerTransaction controllerTransaction) {
                if (TypingView.this.viewDismissedListener != null) {
                    TypingView.this.viewDismissedListener.onViewDismissed();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideKeyboardInstantaneously$1() {
        if (!isVisible() || this.typingRouter.getControllerWithTag(TYPING_CONTROLLER) == null) {
            return;
        }
        try {
            if (this.typingRouter.isAttached()) {
                ((TtaScreenController) this.typingRouter.getControllerWithTag(TYPING_CONTROLLER)).hideKeyboardInstantaneously();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTypingView$0() {
        if (this.typingRouter.getControllerWithTag(TYPING_CONTROLLER) != null) {
            return;
        }
        try {
            if (this.typingRouter.isAttached()) {
                TtaScreenParameters ttaScreenParameters = this.ttaScreenParameters;
                this.typingRouter.pushController(new ControllerTransaction(ttaScreenParameters != null ? TtaScreenController.create(ttaScreenParameters) : TtaScreenController.create(), new DismissContentTransition(), new PushContentTransition(), TYPING_CONTROLLER));
            }
        } catch (Exception unused) {
        }
    }

    public boolean backButtonPressed() {
        return this.typingRouter.handleBack();
    }

    public void cleanup() {
        this.typingRouter.destroy();
    }

    @MainThread
    public void hideKeyboardInstantaneously() {
        this.mainHandler.post(new TypingView$$ExternalSyntheticLambda0(this, 0));
    }

    public boolean isVisible() {
        return this.typingRouter.hasRootController();
    }

    public void prepareForConfigurationChange() {
        this.typingRouter.detach();
    }

    public void registerViewDismissedListener(ViewDismissedListener viewDismissedListener) {
        this.viewDismissedListener = viewDismissedListener;
    }

    public void saveInstanceState(Bundle bundle) {
        this.typingRouter.saveInstanceState(bundle);
    }

    public void setScreenParameters(TtaScreenParameters ttaScreenParameters) {
        this.ttaScreenParameters = ttaScreenParameters;
    }

    @MainThread
    public void showTypingView() {
        this.mainHandler.post(new TypingView$$ExternalSyntheticLambda0(this, 1));
    }

    @Inject
    public TypingView(@Named("typingRouterDelegate") RouterDelegate routerDelegate) {
        this(routerDelegate, new Handler(Looper.getMainLooper()));
    }
}
