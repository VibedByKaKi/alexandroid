package com.amazon.alexa.voice.tta;

import android.os.Bundle;
import android.view.ViewGroup;
import com.amazon.regulator.ControllerTransaction;
import com.amazon.regulator.Router;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class RouterDelegate {
    private final Router router;

    public RouterDelegate(Router router) {
        this.router = router;
    }

    public void addOnPopTransactionListener(Router.OnTransactionListener onTransactionListener) {
        this.router.addOnPopTransactionListener(onTransactionListener);
    }

    public void attach(ViewGroup viewGroup) {
        this.router.attach(viewGroup);
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
