package com.amazon.dee.app.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.amazon.dee.app.core.R;
import com.amazon.dee.app.ui.main.MainHandler;
import com.amazon.dee.app.ui.main.MainViewModel;
import com.amazon.dee.app.ui.main.NavigationViewModel;
import com.amazon.dee.app.ui.view.LoadingView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public abstract class MainBinding extends ViewDataBinding {

    @NonNull
    public final View bottomBarCoachmarkAnchor;

    @NonNull
    public final FrameLayout contentBackdrop;

    @NonNull
    public final FrameLayout conversationContainer;

    @NonNull
    public final ConstraintLayout drawerLayout;

    @NonNull
    public final FrameLayout driveModeFooter;

    @NonNull
    public final FrameLayout driveModeHeader;

    @NonNull
    public final FrameLayout fullscreenContainer;

    @NonNull
    public final FrameLayout homeContainer;

    @Bindable
    protected MainHandler mHandler;

    @Bindable
    protected NavigationViewModel mNavigationViewModel;

    @Bindable
    protected MainViewModel mViewModel;

    @NonNull
    public final FrameLayout mainContent;

    @NonNull
    public final FrameLayout player;

    @NonNull
    public final FrameLayout primaryContainer;

    @NonNull
    public final LoadingView progress;

    @NonNull
    public final FrameLayout raConversationContainer;

    @NonNull
    public final FrameLayout rnContainer;

    @NonNull
    public final ConstraintLayout rootContainer;

    @NonNull
    public final ViewSwitcher tabLayoutContainerStub;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final FrameLayout toolbarLayoutContainer;

    @NonNull
    public final FrameLayout transparentNavContainer;

    @NonNull
    public final FrameLayout transportBar;

    @NonNull
    public final View transportBarTopAnchor;

    @NonNull
    public final ViewStubProxy webviewstub;

    public MainBinding(Object obj, View view, int i, View view2, FrameLayout frameLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, FrameLayout frameLayout6, FrameLayout frameLayout7, FrameLayout frameLayout8, FrameLayout frameLayout9, LoadingView loadingView, FrameLayout frameLayout10, FrameLayout frameLayout11, ConstraintLayout constraintLayout2, ViewSwitcher viewSwitcher, Toolbar toolbar, FrameLayout frameLayout12, FrameLayout frameLayout13, FrameLayout frameLayout14, View view3, ViewStubProxy viewStubProxy) {
        super(obj, view, i);
        this.bottomBarCoachmarkAnchor = view2;
        this.contentBackdrop = frameLayout;
        this.conversationContainer = frameLayout2;
        this.drawerLayout = constraintLayout;
        this.driveModeFooter = frameLayout3;
        this.driveModeHeader = frameLayout4;
        this.fullscreenContainer = frameLayout5;
        this.homeContainer = frameLayout6;
        this.mainContent = frameLayout7;
        this.player = frameLayout8;
        this.primaryContainer = frameLayout9;
        this.progress = loadingView;
        this.raConversationContainer = frameLayout10;
        this.rnContainer = frameLayout11;
        this.rootContainer = constraintLayout2;
        this.tabLayoutContainerStub = viewSwitcher;
        this.toolbar = toolbar;
        this.toolbarLayoutContainer = frameLayout12;
        this.transparentNavContainer = frameLayout13;
        this.transportBar = frameLayout14;
        this.transportBarTopAnchor = view3;
        this.webviewstub = viewStubProxy;
    }

    public static MainBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static MainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (MainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.main, null, false, obj);
    }

    @Nullable
    public MainHandler getHandler() {
        return this.mHandler;
    }

    @Nullable
    public NavigationViewModel getNavigationViewModel() {
        return this.mNavigationViewModel;
    }

    @Nullable
    public MainViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setHandler(@Nullable MainHandler mainHandler);

    public abstract void setNavigationViewModel(@Nullable NavigationViewModel navigationViewModel);

    public abstract void setViewModel(@Nullable MainViewModel mainViewModel);

    @Deprecated
    public static MainBinding bind(@NonNull View view, @Nullable Object obj) {
        return (MainBinding) ViewDataBinding.bind(obj, view, R.layout.main);
    }

    @NonNull
    @Deprecated
    public static MainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (MainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.main, viewGroup, z, obj);
    }

    @NonNull
    public static MainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static MainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }
}
