package com.amazon.alexa.voiceui;

import android.os.Bundle;
import com.amazon.regulator.ControllerTransaction;
import com.amazon.regulator.ControllerTransition;
import com.amazon.regulator.Router;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RouterDelegate {
    private final Router router;

    public RouterDelegate(Router router) {
        this.router = router;
    }

    public void addOnPopTransactionListener(Router.OnTransactionListener onTransactionListener) {
        this.router.addOnPopTransactionListener(onTransactionListener);
    }

    public void destroy() {
        this.router.destroy();
    }

    public void detach() {
        this.router.detach();
    }

    public ViewController getControllerWithTag(String str) {
        return this.router.getControllerWithTag(str);
    }

    public ViewController getCurrentController() {
        return this.router.getCurrentController();
    }

    public boolean handleBack() {
        return this.router.handleBack();
    }

    public boolean hasRootController() {
        return this.router.hasRootController();
    }

    public boolean isAttached() {
        return this.router.isAttached();
    }

    public boolean popControllerWithTag(String str) {
        return this.router.popControllerWithTag(str);
    }

    public void popCurrentController() {
        this.router.popCurrentController();
    }

    public void popRootController(ControllerTransition controllerTransition) {
        Router router = this.router;
        router.popController(router.getRootController(), controllerTransition);
    }

    public void pushController(ControllerTransaction controllerTransaction) {
        this.router.pushController(controllerTransaction);
    }

    public void replaceCurrentController(ControllerTransaction controllerTransaction) {
        this.router.replaceCurrentController(controllerTransaction);
    }

    public void saveInstanceState(Bundle bundle) {
        this.router.saveInstanceState(bundle);
    }
}
