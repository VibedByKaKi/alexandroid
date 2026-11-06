package com.amazon.dee.app.dependencies;

import com.amazon.alexa.transitions.TransitionDirectory;
import com.amazon.alexa.viewmanagement.api.ViewManagerEventNotifier;
import com.amazon.alexa.viewmanagement.api.ViewManagerLoadingDelegate;
import com.amazon.alexa.viewmanagement.impl.ReactNativeViewManager;
import com.amazon.alexa.viewmanagement.impl.ViewControllerFactoryProducer;
import com.amazon.alexa.viewmanagement.impl.ViewManagerDelegate;
import com.amazon.alexa.viewmanagement.impl.ViewManagerRoutingAdapter;
import com.amazon.alexa.viewmanagement.impl.ViewPresenter;
import com.amazon.dee.app.core.R;
import com.amazon.dee.app.ui.main.MainActivity;
import com.facebook.react.ReactHost;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class ViewManagerModule {
    @Provides
    @MainScope
    public ReactNativeViewManager provideReactNativeViewManager(ReactHost reactHost) {
        return new ReactNativeViewManager(new ServiceModule$$ExternalSyntheticLambda2(reactHost, 1));
    }

    @Provides
    @MainScope
    public ViewControllerFactoryProducer provideViewControllerFactoryProducer() {
        return new ViewControllerFactoryProducer();
    }

    @Provides
    @MainScope
    public ViewManagerRoutingAdapter provideViewManagerRoutingAdapter(ViewPresenter viewPresenter) {
        return new ViewManagerRoutingAdapter(viewPresenter);
    }

    @Provides
    @MainScope
    public ViewPresenter provideViewPresenter(MainActivity mainActivity, TransitionDirectory transitionDirectory) {
        return new ViewPresenter(mainActivity.getSupportFragmentManager(), R.id.primary_container, transitionDirectory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ReactHost lambda$provideReactNativeViewManager$0(ReactHost reactHost) {
        return reactHost;
    }

    @Provides
    @MainScope
    public ViewManagerDelegate provideViewManagerDelegate(MainActivity mainActivity) {
        return mainActivity;
    }

    @Provides
    @MainScope
    public ViewManagerEventNotifier provideViewManagerEventNotifier(ViewManagerDelegate viewManagerDelegate) {
        return viewManagerDelegate;
    }

    @Provides
    @MainScope
    public ViewManagerLoadingDelegate provideViewManagerLoadingDelegate(ViewManagerEventNotifier viewManagerEventNotifier) {
        return viewManagerEventNotifier;
    }
}
