package com.amazon.regulator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.regulator.internal.Preconditions;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class ViewController {
    private static final String EXTRA_ARGUMENTS = "arguments";
    private static final String EXTRA_CHILD_ROUTER_KEYS = "childRouterKeys";
    private static final String EXTRA_CHILD_ROUTER_VALUES = "childRouterValues";
    private static final String EXTRA_ID = "id";
    private static final String EXTRA_KEEP_VIEW_IN_BACK_STACK = "keepViewWhenInBackStack";
    private static final String EXTRA_VIEW = "view";
    private static final String EXTRA_VIEW_HIERARCHY = "viewHierarchy";
    private Bundle arguments;
    private boolean hasAttached;
    private boolean hasCreated;
    private boolean keepViewWhenInBackStack;
    private Bundle pendingViewStateToRestore;
    private Router router;
    private SparseArray<Parcelable> savedViewHierarchyState;
    private int themeResId;
    private View view;
    private final ArrayMap<String, Router> childRouters = new ArrayMap<>();
    private final ArrayMap<String, Bundle> childRouteStateToRestore = new ArrayMap<>();
    private String id = UUID.randomUUID().toString();

    public ViewController() {
        ensureRequiredConstructor();
    }

    private void ensureRequiredConstructor() {
        for (Constructor<?> constructor : getClass().getConstructors()) {
            if (constructor.getParameterTypes().length == 0) {
                return;
            }
        }
        throw new RuntimeException(getClass() + " has to have a public constructor without any parameters");
    }

    public final void attach(ViewGroup viewGroup, int i) {
        Preconditions.nonNull(viewGroup, "container == null");
        View view = this.view;
        if (view != null && (view.getParent() == null || this.view.getParent() != viewGroup)) {
            detach();
        }
        if (this.view == null) {
            Context context = viewGroup.getContext();
            if (this.themeResId != 0) {
                context = new ContextThemeWrapper(viewGroup.getContext(), this.themeResId);
            }
            View onCreateView = onCreateView(LayoutInflater.from(context), viewGroup);
            this.view = onCreateView;
            Preconditions.nonNull(onCreateView, "view == null");
            this.view.setSaveFromParentEnabled(false);
            SparseArray<Parcelable> sparseArray = this.savedViewHierarchyState;
            if (sparseArray != null) {
                this.view.restoreHierarchyState(sparseArray);
                this.savedViewHierarchyState = null;
            }
            Bundle bundle = this.pendingViewStateToRestore;
            if (bundle != null) {
                onRestoreViewState(this.view, bundle);
                this.pendingViewStateToRestore = null;
            }
        }
        if (this.hasAttached) {
            return;
        }
        this.hasAttached = true;
        View view2 = this.view;
        if (i == -1) {
            viewGroup.addView(view2);
        } else {
            viewGroup.addView(view2, i);
        }
        onAttach(this.view);
    }

    public final int checkSelfPermission(String str) {
        Router router = this.router;
        if (router != null) {
            return router.checkSelfPermission(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot check permission before a controller is created");
        return 0;
    }

    public final void create(Router router) {
        Preconditions.nonNull(router, "router == null");
        this.router = router;
        if (this.hasCreated) {
            return;
        }
        this.hasCreated = true;
        onCreate();
    }

    public final void destroy() {
        if (this.hasCreated) {
            destroyView();
            Iterator<Router> it2 = this.childRouters.values().iterator();
            while (it2.hasNext()) {
                it2.next().destroy();
            }
            onDestroy();
            this.hasCreated = false;
        }
    }

    public final void destroyView() {
        if (this.view == null) {
            return;
        }
        detach();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.savedViewHierarchyState = sparseArray;
        this.view.saveHierarchyState(sparseArray);
        Iterator<Router> it2 = this.childRouters.values().iterator();
        while (it2.hasNext()) {
            it2.next().detach();
        }
        onDestroyView(this.view);
        this.view = null;
    }

    public final void detach() {
        if (this.hasAttached) {
            this.hasAttached = false;
            ViewGroup viewGroup = (ViewGroup) this.view.getParent();
            if (viewGroup != null) {
                onDetach(this.view);
                viewGroup.removeView(this.view);
            }
        }
    }

    public final ViewController findControllerById(String str) {
        if (str.equals(this.id)) {
            return this;
        }
        Iterator<Router> it2 = this.childRouters.values().iterator();
        while (it2.hasNext()) {
            ViewController findControllerById = it2.next().findControllerById(str);
            if (findControllerById != null) {
                return findControllerById;
            }
        }
        return null;
    }

    public final Bundle getArguments() {
        return this.arguments;
    }

    public final Router getChildRouter(String str) {
        Preconditions.nonNull(str, "name == null");
        if (this.router == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot obtain child router if not a controller is not created");
            return null;
        }
        Router router = this.childRouters.get(str);
        if (router != null) {
            return router;
        }
        Router router2 = new Router(this.router.getContext(), this.router.getComponent(), this.childRouteStateToRestore.get(str));
        router2.setParentController(this);
        this.childRouters.put(str, router2);
        return router2;
    }

    public final Component getComponent() {
        Router router = this.router;
        if (router != null) {
            return router.getComponent();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot get component before a controller is created");
        return null;
    }

    public final Context getContext() {
        Router router = this.router;
        if (router != null) {
            return router.getContext();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot get context before a controller is created");
        return null;
    }

    public final String getId() {
        return this.id;
    }

    public ViewController getParentController() {
        Router router = this.router;
        if (router != null) {
            return router.getParentController();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot obtain child router if a controller is not created");
        return null;
    }

    public final Router getRouter() {
        return this.router;
    }

    public final View getView() {
        return this.view;
    }

    public final boolean handleBack() {
        return onHandleBack();
    }

    public boolean isAttached() {
        return this.hasAttached;
    }

    public final boolean isCreated() {
        return this.hasCreated;
    }

    public final boolean keepViewWhenInBackStack() {
        return this.keepViewWhenInBackStack;
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public boolean onHandleBack() {
        Iterator<Router> it2 = this.childRouters.values().iterator();
        while (it2.hasNext()) {
            if (it2.next().handleBack()) {
                return true;
            }
        }
        return false;
    }

    public void overrideTheme(int i) {
        this.themeResId = i;
    }

    public final boolean removeChildRouter(Router router) {
        Preconditions.nonNull(router, "router == null");
        int size = this.childRouters.size();
        for (int i = 0; i < size; i++) {
            if (this.childRouters.valueAt(i) == router) {
                String keyAt = this.childRouters.keyAt(i);
                router.destroy();
                this.childRouters.removeAt(i);
                this.childRouteStateToRestore.remove(keyAt);
                return true;
            }
        }
        return false;
    }

    public final void requestPermissions(String[] strArr, int i) {
        Router router = this.router;
        if (router != null) {
            router.requestPermissions(this, strArr, i);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot request permissions before a controller is created");
        }
    }

    public final void restoreState(Bundle bundle) {
        Preconditions.nonNull(bundle, "state == null");
        this.id = bundle.getString("id");
        this.arguments = bundle.getBundle("arguments");
        this.keepViewWhenInBackStack = bundle.getBoolean(EXTRA_KEEP_VIEW_IN_BACK_STACK);
        Bundle bundle2 = bundle.getBundle("view");
        if (bundle2 != null) {
            bundle2.setClassLoader(getClass().getClassLoader());
        }
        String[] stringArray = bundle.getStringArray(EXTRA_CHILD_ROUTER_KEYS);
        Parcelable[] parcelableArray = bundle.getParcelableArray(EXTRA_CHILD_ROUTER_VALUES);
        if (stringArray != null && parcelableArray != null) {
            int length = stringArray.length;
            for (int i = 0; i < length; i++) {
                String str = stringArray[i];
                Bundle bundle3 = (Bundle) parcelableArray[i];
                bundle3.setClassLoader(getClass().getClassLoader());
                this.childRouteStateToRestore.put(str, bundle3);
                Router router = this.childRouters.get(str);
                if (router != null) {
                    router.restoreInstanceState(bundle3);
                }
            }
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(EXTRA_VIEW_HIERARCHY);
        View view = this.view;
        if (view == null) {
            this.pendingViewStateToRestore = bundle2;
            this.savedViewHierarchyState = sparseParcelableArray;
        } else {
            view.restoreHierarchyState(sparseParcelableArray);
            if (bundle2 != null) {
                onRestoreViewState(this.view, bundle2);
            }
        }
    }

    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.id);
        bundle.putBundle("arguments", this.arguments);
        bundle.putBoolean(EXTRA_KEEP_VIEW_IN_BACK_STACK, this.keepViewWhenInBackStack);
        if (!this.childRouters.isEmpty()) {
            String[] strArr = new String[this.childRouters.size()];
            Bundle[] bundleArr = new Bundle[this.childRouters.size()];
            int size = this.childRouters.size();
            for (int i = 0; i < size; i++) {
                strArr[i] = this.childRouters.keyAt(i);
                bundleArr[i] = new Bundle(getClass().getClassLoader());
                this.childRouters.valueAt(i).saveInstanceState(bundleArr[i]);
            }
            bundle.putStringArray(EXTRA_CHILD_ROUTER_KEYS, strArr);
            bundle.putParcelableArray(EXTRA_CHILD_ROUTER_VALUES, bundleArr);
        }
        SparseArray<Parcelable> sparseArray = this.savedViewHierarchyState;
        if (this.view != null) {
            Bundle bundle2 = new Bundle(getClass().getClassLoader());
            onSaveViewState(this.view, bundle2);
            bundle.putBundle("view", bundle2);
            sparseArray = new SparseArray<>();
            this.view.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(EXTRA_VIEW_HIERARCHY, sparseArray);
        return bundle;
    }

    public final void setArguments(Bundle bundle) {
        this.arguments = bundle;
    }

    public void setKeepViewWhenInBackStack(boolean z) {
        this.keepViewWhenInBackStack = z;
    }

    public final boolean shouldShowRequestPermissionRationale(String str) {
        Router router = this.router;
        if (router != null) {
            return router.shouldShowRequestPermissionRationale(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot check to show request permissions rationale before a controller is created");
        return false;
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        Router router = this.router;
        if (router != null) {
            router.startActivityForResult(this, intent, i, bundle);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot start an activity before a controller is created");
        }
    }

    public final void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onAttach(View view) {
    }

    public void onDestroyView(View view) {
    }

    public void onDetach(View view) {
    }

    public void onRestoreViewState(View view, Bundle bundle) {
    }

    public void onSaveViewState(View view, Bundle bundle) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public final void attach(ViewGroup viewGroup) {
        attach(viewGroup, -1);
    }
}
