package com.amazon.regulator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.regulator.ControllerTransition;
import com.amazon.regulator.internal.BundleUtils;
import com.amazon.regulator.internal.Preconditions;
import com.amazon.regulator.transitions.InstantTransition;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Router {
    private static final String EXTRA_BACKSTACK;
    private static final String EXTRA_PREFIX;
    private static final String EXTRA_REQUESTS_PERMISSIONS;
    private static final String EXTRA_REQUESTS_START_ACTIVITY;
    private final Deque<ControllerTransaction> backstack;
    private final Component component;
    private ViewGroup container;
    private Context context;
    private ViewController parentController;
    private final List<OnTransactionListener> popTransitionListeners;
    private SparseArray<String> requestsPermissions;
    private SparseArray<String> requestsStartActivity;
    private final TransactionGarbage transactionGarbage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.regulator.Router$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        final /* synthetic */ ViewController val$controller;
        final /* synthetic */ String[] val$permissions;
        final /* synthetic */ int val$requestCode;

        public AnonymousClass5(String[] strArr, ViewController viewController, int i) {
            this.val$permissions = strArr;
            this.val$controller = viewController;
            this.val$requestCode = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String[] strArr = this.val$permissions;
            int[] iArr = new int[strArr.length];
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = Router.this.checkSelfPermission(this.val$permissions[i]);
            }
            this.val$controller.onRequestPermissionsResult(this.val$requestCode, this.val$permissions, iArr);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnTransactionListener {
        void onAfter(ControllerTransaction controllerTransaction);

        void onAfterTransition(ControllerTransaction controllerTransaction);

        void onBefore(ControllerTransaction controllerTransaction);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class TransactionGarbage {
        private final Deque<Item> queue = new ArrayDeque();

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class Item {
            private final boolean isReplaced;
            private final ControllerTransaction transaction;

            public Item(ControllerTransaction controllerTransaction, boolean z) {
                this.transaction = controllerTransaction;
                this.isReplaced = z;
            }

            public void destroy() {
                ViewController controller = this.transaction.getController();
                if (this.isReplaced) {
                    controller.destroy();
                    Router router = Router.this;
                    router.notifyOnAfterTransitionTransaction(router.popTransitionListeners, this.transaction);
                } else {
                    if (controller.keepViewWhenInBackStack()) {
                        return;
                    }
                    controller.destroyView();
                }
            }
        }

        public TransactionGarbage() {
        }

        public void destroy() {
            View view = Router.this.backstack.isEmpty() ? null : ((ControllerTransaction) Router.this.backstack.peek()).getController().getView();
            while (true) {
                Item pollFirst = this.queue.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                if (pollFirst.transaction.getController().getView() != view) {
                    pollFirst.destroy();
                }
            }
        }

        public void push(ControllerTransaction controllerTransaction, boolean z) {
            this.queue.addLast(new Item(controllerTransaction, z));
        }
    }

    static {
        String concat = Router.class.getName().concat(".");
        EXTRA_PREFIX = concat;
        EXTRA_BACKSTACK = BitVector$$ExternalSyntheticOutline0.m(concat, "backstack");
        EXTRA_REQUESTS_START_ACTIVITY = BitVector$$ExternalSyntheticOutline0.m(concat, "requestsStartActivity");
        EXTRA_REQUESTS_PERMISSIONS = BitVector$$ExternalSyntheticOutline0.m(concat, "requestsPermissions");
    }

    public Router(Context context, Component component, Bundle bundle) {
        Preconditions.nonNull(context, "context == null");
        Preconditions.nonNull(component, "component == null");
        this.context = context;
        this.component = component;
        this.backstack = new ArrayDeque();
        this.popTransitionListeners = new ArrayList();
        this.requestsStartActivity = new SparseArray<>(4);
        this.requestsPermissions = new SparseArray<>(4);
        restoreInstanceState(bundle);
        this.transactionGarbage = new TransactionGarbage();
    }

    private void notifyOnAfterTransaction(List<OnTransactionListener> list, ControllerTransaction controllerTransaction) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).onAfter(controllerTransaction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyOnAfterTransitionTransaction(List<OnTransactionListener> list, ControllerTransaction controllerTransaction) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).onAfterTransition(controllerTransaction);
        }
    }

    private void notifyOnBeforeTransaction(List<OnTransactionListener> list, ControllerTransaction controllerTransaction) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).onBefore(controllerTransaction);
        }
    }

    private void popTransaction(final ControllerTransaction controllerTransaction, ControllerTransition controllerTransition) {
        Preconditions.nonNull(controllerTransaction, "transaction == null");
        final ViewController controller = controllerTransaction.getController();
        if (this.container == null) {
            controller.destroy();
            notifyOnAfterTransitionTransaction(this.popTransitionListeners, controllerTransaction);
            return;
        }
        if (controllerTransition == null) {
            controllerTransition = controllerTransaction.getPopTransition();
        }
        if (controllerTransition == null) {
            controllerTransition = new InstantTransition();
        }
        ControllerTransaction peek = this.backstack.peek();
        View view = null;
        if (peek != null) {
            ViewController controller2 = peek.getController();
            if (!controller2.isAttached()) {
                controller2.create(this);
                ViewGroup viewGroup = this.container;
                controller2.attach(viewGroup, viewGroup.indexOfChild(controller.getView()));
                ControllerTransition pushTransition = peek.getPushTransition();
                if (pushTransition == null) {
                    pushTransition = new InstantTransition();
                }
                pushTransition.performTransition(this.container, null, controller.getView(), ControllerTransition.CompletionListener.NONE);
                pushTransition.completeTransition();
            }
            view = controller2.getView();
        }
        controllerTransition.performTransition(this.container, controller.getView(), view, new ControllerTransition.CompletionListener() { // from class: com.amazon.regulator.Router.4
            @Override // com.amazon.regulator.ControllerTransition.CompletionListener
            public void completeTransition() {
                controller.destroy();
                Router router = Router.this;
                router.notifyOnAfterTransitionTransaction(router.popTransitionListeners, controllerTransaction);
            }
        });
    }

    private void pushTransaction(ControllerTransaction controllerTransaction, boolean z) {
        View view;
        Preconditions.nonNull(controllerTransaction, "transaction == null");
        if (this.container == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Router is not attached to a layout");
            return;
        }
        ViewController controller = controllerTransaction.getController();
        if (controller.isCreated()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Controller is already in use");
            return;
        }
        ControllerTransition pushTransition = controllerTransaction.getPushTransition();
        if (pushTransition == null) {
            pushTransition = new InstantTransition();
        }
        ControllerTransaction peek = this.backstack.peek();
        if (peek != null) {
            view = peek.getController().getView();
            if (z) {
                notifyOnBeforeTransaction(this.popTransitionListeners, peek);
                this.backstack.remove(peek);
                notifyOnAfterTransaction(this.popTransitionListeners, peek);
            }
            this.transactionGarbage.push(peek, z);
        } else {
            view = null;
        }
        this.backstack.push(controllerTransaction);
        controller.create(this);
        controller.attach(this.container);
        pushTransition.performTransition(this.container, view, controller.getView(), new ControllerTransition.CompletionListener() { // from class: com.amazon.regulator.Router.3
            @Override // com.amazon.regulator.ControllerTransition.CompletionListener
            public void completeTransition() {
                Router.this.transactionGarbage.destroy();
            }
        });
    }

    public void addOnPopTransactionListener(OnTransactionListener onTransactionListener) {
        this.popTransitionListeners.add(onTransactionListener);
    }

    public void attach(ViewGroup viewGroup) {
        Preconditions.nonNull(viewGroup, "container == null");
        ViewGroup viewGroup2 = this.container;
        if (viewGroup2 == viewGroup) {
            return;
        }
        if (viewGroup2 != null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Router is already attached to a different container");
            return;
        }
        this.container = viewGroup;
        ControllerTransaction peek = this.backstack.peek();
        if (peek == null) {
            return;
        }
        ViewController controller = peek.getController();
        ControllerTransition pushTransition = peek.getPushTransition();
        if (pushTransition == null) {
            pushTransition = new InstantTransition();
        }
        controller.create(this);
        controller.attach(viewGroup);
        pushTransition.performTransition(viewGroup, null, controller.getView(), ControllerTransition.CompletionListener.NONE);
        pushTransition.completeTransition();
    }

    public void attachCurrentController() {
        ViewController currentController = getCurrentController();
        if (currentController != null) {
            currentController.attach(this.container);
        }
    }

    public int checkSelfPermission(String str) {
        return this.context.getPackageManager().checkPermission(str, this.context.getPackageName());
    }

    public void destroy() {
        detach();
        Iterator<ControllerTransaction> it2 = this.backstack.iterator();
        while (it2.hasNext()) {
            it2.next().getController().destroy();
        }
    }

    public void detach() {
        if (this.container == null) {
            return;
        }
        Iterator<ControllerTransaction> it2 = this.backstack.iterator();
        while (it2.hasNext()) {
            it2.next().getController().destroyView();
        }
        this.container = null;
    }

    public void detachCurrentController() {
        ViewController currentController = getCurrentController();
        if (currentController != null) {
            currentController.detach();
        }
    }

    public ViewController findControllerById(String str) {
        Iterator<ControllerTransaction> it2 = this.backstack.iterator();
        while (it2.hasNext()) {
            ViewController findControllerById = it2.next().getController().findControllerById(str);
            if (findControllerById != null) {
                return findControllerById;
            }
        }
        return null;
    }

    public int getBackStackSize() {
        return this.backstack.size();
    }

    public Component getComponent() {
        return this.component;
    }

    public Context getContext() {
        return this.context;
    }

    public ViewController getControllerWithTag(String str) {
        Preconditions.nonNull(str, "tag == null");
        for (ControllerTransaction controllerTransaction : this.backstack) {
            if (str.equals(controllerTransaction.getTag())) {
                return controllerTransaction.getController();
            }
        }
        return null;
    }

    public ViewController getCurrentController() {
        ControllerTransaction peek = this.backstack.peek();
        if (peek == null) {
            return null;
        }
        return peek.getController();
    }

    public ViewController getParentController() {
        return this.parentController;
    }

    public ViewController getRootController() {
        ControllerTransaction peekLast = this.backstack.peekLast();
        if (peekLast == null) {
            return null;
        }
        return peekLast.getController();
    }

    public boolean handleBack() {
        ControllerTransaction peek = this.backstack.peek();
        if (peek == null) {
            return false;
        }
        ViewController controller = peek.getController();
        if (controller.handleBack()) {
            return true;
        }
        popController(controller);
        return !this.backstack.isEmpty();
    }

    public boolean hasRootController() {
        return !this.backstack.isEmpty();
    }

    public boolean isAttached() {
        return this.container != null;
    }

    public void popController(ViewController viewController, ControllerTransition controllerTransition) {
        boolean z;
        Preconditions.nonNull(viewController, "controller == null");
        Iterator<ControllerTransaction> it2 = this.backstack.iterator();
        ControllerTransaction controllerTransaction = null;
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            ControllerTransaction next = it2.next();
            notifyOnBeforeTransaction(this.popTransitionListeners, next);
            it2.remove();
            notifyOnAfterTransaction(this.popTransitionListeners, next);
            if (controllerTransaction == null) {
                controllerTransaction = next;
            } else {
                next.getController().destroy();
                notifyOnAfterTransitionTransaction(this.popTransitionListeners, next);
            }
            if (next.getController() == viewController) {
                z = true;
                break;
            }
        }
        if (z) {
            popTransaction(controllerTransaction, controllerTransition);
        }
    }

    public boolean popControllerWithTag(String str, ControllerTransition controllerTransition) {
        Preconditions.nonNull(str, "tag == null");
        ViewController controllerWithTag = getControllerWithTag(str);
        if (controllerWithTag == null) {
            return false;
        }
        popController(controllerWithTag, controllerTransition);
        return true;
    }

    public boolean popCurrentController() {
        ControllerTransaction peek = this.backstack.peek();
        if (peek == null) {
            return false;
        }
        notifyOnBeforeTransaction(this.popTransitionListeners, peek);
        this.backstack.remove(peek);
        notifyOnAfterTransaction(this.popTransitionListeners, peek);
        popTransaction(peek, null);
        return true;
    }

    public void pushController(ControllerTransaction controllerTransaction) {
        pushTransaction(controllerTransaction, false);
    }

    public void removeOnPopTransactionListener(OnTransactionListener onTransactionListener) {
        this.popTransitionListeners.remove(onTransactionListener);
    }

    public void replaceCurrentController(ControllerTransaction controllerTransaction) {
        pushTransaction(controllerTransaction, true);
    }

    public void requestPermissions(ViewController viewController, String[] strArr, int i) {
        if (!(this.context instanceof Activity)) {
            Single$$ExternalSyntheticBUOutline0.m$2("Router is not attached to an activity");
        } else {
            this.requestsPermissions.put(i, viewController.getId());
            ((Activity) this.context).requestPermissions(strArr, i);
        }
    }

    public void restoreInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.container != null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Router cannot restore instance state when attached");
            return;
        }
        if (!this.backstack.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Router cannot restore instance state unless backstack is empty");
            return;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(EXTRA_BACKSTACK);
        if (parcelableArrayList != null) {
            this.backstack.addAll(parcelableArrayList);
        }
        SparseArray<String> sparseStringArray = BundleUtils.getSparseStringArray(bundle, EXTRA_REQUESTS_START_ACTIVITY);
        this.requestsStartActivity = sparseStringArray;
        if (sparseStringArray == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Saved instance state is corrupted");
            return;
        }
        SparseArray<String> sparseStringArray2 = BundleUtils.getSparseStringArray(bundle, EXTRA_REQUESTS_PERMISSIONS);
        this.requestsPermissions = sparseStringArray2;
        if (sparseStringArray2 != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Saved instance state is corrupted");
    }

    public void saveInstanceState(Bundle bundle) {
        Preconditions.nonNull(bundle, "outState == null");
        bundle.putParcelableArrayList(EXTRA_BACKSTACK, new ArrayList<>(this.backstack));
        BundleUtils.putSparseStringArray(bundle, EXTRA_REQUESTS_START_ACTIVITY, this.requestsStartActivity);
        BundleUtils.putSparseStringArray(bundle, EXTRA_REQUESTS_PERMISSIONS, this.requestsPermissions);
    }

    public void setActivityResult(int i, int i2, Intent intent) {
        String str = this.requestsStartActivity.get(i);
        if (str == null) {
            return;
        }
        this.requestsStartActivity.remove(i);
        ViewController findControllerById = findControllerById(str);
        if (findControllerById == null || !findControllerById.isAttached()) {
            return;
        }
        findControllerById.onActivityResult(i, i2, intent);
    }

    public void setBackstack(Collection<? extends ControllerTransaction> collection) {
        Preconditions.nonNull(collection, "backstack == null");
        Iterator<ControllerTransaction> it2 = this.backstack.iterator();
        final ControllerTransaction controllerTransaction = null;
        while (it2.hasNext()) {
            ControllerTransaction next = it2.next();
            notifyOnBeforeTransaction(this.popTransitionListeners, next);
            it2.remove();
            notifyOnAfterTransaction(this.popTransitionListeners, next);
            if (controllerTransaction == null) {
                controllerTransaction = next;
            } else {
                next.getController().destroy();
                notifyOnAfterTransitionTransaction(this.popTransitionListeners, next);
            }
        }
        Iterator<? extends ControllerTransaction> it3 = collection.iterator();
        while (it3.hasNext()) {
            if (it3.next().getController().isCreated()) {
                Single$$ExternalSyntheticBUOutline0.m$3("Controller is already in use");
                return;
            }
        }
        this.backstack.addAll(collection);
        ControllerTransaction peek = this.backstack.peek();
        if (peek == null && controllerTransaction == null) {
            return;
        }
        if (peek == null) {
            final ViewController controller = controllerTransaction.getController();
            ControllerTransition popTransition = controllerTransaction.getPopTransition();
            if (popTransition == null) {
                popTransition = new InstantTransition();
            }
            popTransition.performTransition(this.container, controller.getView(), null, new ControllerTransition.CompletionListener() { // from class: com.amazon.regulator.Router.1
                @Override // com.amazon.regulator.ControllerTransition.CompletionListener
                public void completeTransition() {
                    controller.destroy();
                    Router router = Router.this;
                    router.notifyOnAfterTransitionTransaction(router.popTransitionListeners, controllerTransaction);
                }
            });
            return;
        }
        View view = controllerTransaction != null ? controllerTransaction.getController().getView() : null;
        ViewController controller2 = peek.getController();
        ControllerTransition pushTransition = peek.getPushTransition();
        if (pushTransition == null) {
            pushTransition = new InstantTransition();
        }
        controller2.create(this);
        controller2.attach(this.container);
        pushTransition.performTransition(this.container, view, controller2.getView(), new ControllerTransition.CompletionListener() { // from class: com.amazon.regulator.Router.2
            @Override // com.amazon.regulator.ControllerTransition.CompletionListener
            public void completeTransition() {
                ControllerTransaction controllerTransaction2 = controllerTransaction;
                if (controllerTransaction2 != null) {
                    controllerTransaction2.getController().destroy();
                    Router router = Router.this;
                    router.notifyOnAfterTransitionTransaction(router.popTransitionListeners, controllerTransaction);
                }
            }
        });
    }

    public void setParentController(ViewController viewController) {
        this.parentController = viewController;
    }

    public void setRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str = this.requestsPermissions.get(i);
        if (str == null) {
            return;
        }
        this.requestsPermissions.remove(i);
        ViewController findControllerById = findControllerById(str);
        if (findControllerById == null || !findControllerById.isAttached()) {
            return;
        }
        findControllerById.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void setRootController(ControllerTransaction controllerTransaction) {
        Preconditions.nonNull(controllerTransaction, "transaction == null");
        setBackstack(Collections.singletonList(controllerTransaction));
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        Context context = this.context;
        if (context instanceof Activity) {
            return ((Activity) context).shouldShowRequestPermissionRationale(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Router is not attached to an activity");
        return false;
    }

    public void startActivityForResult(ViewController viewController, Intent intent, int i, Bundle bundle) {
        if (!(this.context instanceof Activity)) {
            Single$$ExternalSyntheticBUOutline0.m$2("Router is not attached to an activity");
        } else {
            this.requestsStartActivity.put(i, viewController.getId());
            ((Activity) this.context).startActivityForResult(intent, i, bundle);
        }
    }

    public boolean popControllerWithTag(String str) {
        return popControllerWithTag(str, null);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class OnTransactionAdapter implements OnTransactionListener {
        @Override // com.amazon.regulator.Router.OnTransactionListener
        public void onAfter(ControllerTransaction controllerTransaction) {
        }

        @Override // com.amazon.regulator.Router.OnTransactionListener
        public void onAfterTransition(ControllerTransaction controllerTransaction) {
        }

        @Override // com.amazon.regulator.Router.OnTransactionListener
        public void onBefore(ControllerTransaction controllerTransaction) {
        }
    }

    public Router(Context context, Component component) {
        this(context, component, null);
    }

    public Router(Context context, Bundle bundle) {
        this(context, new Component(), bundle);
    }

    public Router(Context context) {
        this(context, new Component(), null);
    }

    public void popController(ViewController viewController) {
        popController(viewController, null);
    }
}
