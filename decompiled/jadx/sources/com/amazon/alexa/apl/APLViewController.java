package com.amazon.alexa.apl;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.Navigation$$ExternalSyntheticLambda0;
import com.amazon.alexa.apl.uioptions.AplViewUiParams;
import com.amazon.regulator.ViewController;
import com.dee.app.contacts.common.constants.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\u0017\u001a\u00020\u0007J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0005J\u0006\u0010\"\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/amazon/alexa/apl/APLViewController;", "Lcom/amazon/regulator/ViewController;", "()V", "viewControllerListeners", "", "Lcom/amazon/alexa/apl/ViewControllerListener;", "addStatusBarHeightAsTopPadding", "", "view", "Landroid/view/View;", "createContextWithConfigurationAsDeviceDensityStable", "Landroid/content/Context;", "context", "getLayoutInflatorWithUpdatedContextConfiguration", "Landroid/view/LayoutInflater;", "inflater", "getParams", "Lcom/amazon/alexa/apl/uioptions/AplViewUiParams;", "isDeviceDarkThemeEnabled", "", "isFOS8AndAbove", "isFireOS", "onAttach", "onClose", "onCreateView", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onDetach", "onHandleBack", "pause", "registerViewListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "resume", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class APLViewController extends ViewController {

    @NotNull
    private static final String ANDROID = "android";

    @NotNull
    private static final String APL_VIEW_UI_PARAMS = "aplViewUiParams";

    @NotNull
    private static final String DIMEN = "dimen";

    @NotNull
    private static final String STATUS_BAR_HEIGHT = "status_bar_height";
    public static AplViewUiParams mAplViewUiParams;

    @NotNull
    private final List<ViewControllerListener> viewControllerListeners = new ArrayList();

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "APLViewController";

    @Inject
    public APLViewController() {
    }

    private final void addStatusBarHeightAsTopPadding(View view) {
        Resources resources = view.getResources();
        int identifier = resources.getIdentifier(STATUS_BAR_HEIGHT, DIMEN, ANDROID);
        view.setPadding(0, identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0, 0, 0);
    }

    private final Context createContextWithConfigurationAsDeviceDensityStable(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.densityDpi = DisplayMetrics.DENSITY_DEVICE_STABLE;
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        createConfigurationContext.getClass();
        return createConfigurationContext;
    }

    private final LayoutInflater getLayoutInflatorWithUpdatedContextConfiguration(LayoutInflater inflater) {
        Context context = inflater.getContext();
        context.getClass();
        LayoutInflater cloneInContext = inflater.cloneInContext(createContextWithConfigurationAsDeviceDensityStable(context));
        cloneInContext.getClass();
        return cloneInContext;
    }

    private final boolean isDeviceDarkThemeEnabled(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 48) == 32;
        } catch (Exception e) {
            Log.e(TAG, "Error on retrieving the device's theme, defaulting to light theme", e);
            return false;
        }
    }

    private final boolean isFireOS() {
        return "Amazon".equals(Build.MANUFACTURER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(APLViewController aPLViewController, View view) {
        aPLViewController.getClass();
        aPLViewController.onClose();
    }

    @NotNull
    public final AplViewUiParams getParams() {
        return INSTANCE.getMAplViewUiParams();
    }

    public final boolean isFOS8AndAbove() {
        return isFireOS();
    }

    @Override // com.amazon.regulator.ViewController
    public void onAttach(@NotNull View view) {
        view.getClass();
        Log.i(TAG, "onAttach");
        super.onAttach(view);
        Iterator<ViewControllerListener> it2 = this.viewControllerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onStart(view, this);
        }
    }

    public final void onClose() {
        Log.i(TAG, "onClose");
        getRouter().popCurrentController();
    }

    @Override // com.amazon.regulator.ViewController
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup container) {
        View inflate;
        inflater.getClass();
        container.getClass();
        Log.i(TAG, "onCreateView");
        for (ViewControllerListener viewControllerListener : this.viewControllerListeners) {
            viewControllerListener.onStop(this);
            viewControllerListener.onCreate();
        }
        if (isFOS8AndAbove()) {
            inflater = getLayoutInflatorWithUpdatedContextConfiguration(inflater);
        }
        Context context = inflater.getContext();
        context.getClass();
        if (isDeviceDarkThemeEnabled(context)) {
            inflate = inflater.inflate(R.layout.dark_apl_view_layout, container, false);
            inflate.getClass();
        } else {
            inflate = inflater.inflate(R.layout.light_apl_view_layout, container, false);
            inflate.getClass();
        }
        Bundle arguments = getArguments();
        AplViewUiParams aplViewUiParams = arguments != null ? (AplViewUiParams) arguments.getParcelable(APL_VIEW_UI_PARAMS) : null;
        if (aplViewUiParams == null) {
            aplViewUiParams = new AplViewUiParams.Builder().build();
        }
        if (aplViewUiParams.getIsStatusBarPaddingNeeded()) {
            addStatusBarHeightAsTopPadding(inflate);
        }
        View findViewById = inflate.findViewById(R.id.apl_close);
        findViewById.getClass();
        if (!aplViewUiParams.getIsCloseButtonNeeded()) {
            findViewById.setVisibility(8);
            return inflate;
        }
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new Navigation$$ExternalSyntheticLambda0(this, 4));
        return inflate;
    }

    @Override // com.amazon.regulator.ViewController
    public void onDestroy() {
        Log.i(TAG, "onDestroy");
        super.onDestroy();
        this.viewControllerListeners.clear();
    }

    @Override // com.amazon.regulator.ViewController
    public void onDestroyView(@NotNull View view) {
        view.getClass();
        Log.i(TAG, "onDestroyView");
        super.onDestroyView(view);
        if (getRouter().hasRootController()) {
            return;
        }
        Iterator<ViewControllerListener> it2 = this.viewControllerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
    }

    @Override // com.amazon.regulator.ViewController
    public void onDetach(@NotNull View view) {
        view.getClass();
        Log.i(TAG, "onDetach");
        super.onDetach(view);
        if (getRouter().hasRootController()) {
            return;
        }
        Iterator<ViewControllerListener> it2 = this.viewControllerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onStop(this);
        }
    }

    @Override // com.amazon.regulator.ViewController
    public boolean onHandleBack() {
        boolean z;
        Log.i(TAG, "onHandleBack");
        while (true) {
            for (ViewControllerListener viewControllerListener : this.viewControllerListeners) {
                z = z || viewControllerListener.onBackPressed();
            }
            return z;
        }
    }

    public final void pause() {
        Iterator<ViewControllerListener> it2 = this.viewControllerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().pause();
        }
    }

    public final void registerViewListener(@NotNull ViewControllerListener listener) {
        listener.getClass();
        Log.i(TAG, "registerViewListener");
        this.viewControllerListeners.add(listener);
    }

    public final void resume() {
        Iterator<ViewControllerListener> it2 = this.viewControllerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().resume();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/apl/APLViewController$Companion;", "", "()V", "ANDROID", "", "APL_VIEW_UI_PARAMS", "DIMEN", "STATUS_BAR_HEIGHT", Constants.LOG_TAG, "kotlin.jvm.PlatformType", "mAplViewUiParams", "Lcom/amazon/alexa/apl/uioptions/AplViewUiParams;", "getMAplViewUiParams", "()Lcom/amazon/alexa/apl/uioptions/AplViewUiParams;", "setMAplViewUiParams", "(Lcom/amazon/alexa/apl/uioptions/AplViewUiParams;)V", "create", "Lcom/amazon/alexa/apl/APLViewController;", APLViewController.APL_VIEW_UI_PARAMS, "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final APLViewController create(@NotNull AplViewUiParams aplViewUiParams) {
            aplViewUiParams.getClass();
            Bundle bundle = new Bundle();
            setMAplViewUiParams(aplViewUiParams);
            bundle.putParcelable(APLViewController.APL_VIEW_UI_PARAMS, aplViewUiParams);
            APLViewController aPLViewController = new APLViewController();
            aPLViewController.setArguments(bundle);
            return aPLViewController;
        }

        @NotNull
        public final AplViewUiParams getMAplViewUiParams() {
            AplViewUiParams aplViewUiParams = APLViewController.mAplViewUiParams;
            if (aplViewUiParams != null) {
                return aplViewUiParams;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mAplViewUiParams");
            return null;
        }

        public final void setMAplViewUiParams(@NotNull AplViewUiParams aplViewUiParams) {
            aplViewUiParams.getClass();
            APLViewController.mAplViewUiParams = aplViewUiParams;
        }

        private Companion() {
        }
    }
}
