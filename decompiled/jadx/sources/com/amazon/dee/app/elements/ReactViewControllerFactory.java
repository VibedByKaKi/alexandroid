package com.amazon.dee.app.elements;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.viewmanagement.api.ViewController;
import com.amazon.alexa.viewmanagement.api.ViewControllerFactory;
import com.amazon.alexa.viewmanagement.api.ViewManagerEventNotifier;
import com.facebook.react.ReactHost;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public abstract class ReactViewControllerFactory implements ViewControllerFactory<ViewController> {
    @Override // com.amazon.alexa.viewmanagement.api.ViewControllerFactory
    public final ViewController createView(@NonNull Context context, @NonNull RouteContext routeContext, @NonNull ViewManagerEventNotifier viewManagerEventNotifier) {
        throw new UnsupportedOperationException("Constructor not supported for ReactViewControllerFactory");
    }

    public abstract ViewController createView(@NonNull Context context, @NonNull RouteContext routeContext, @NonNull ViewManagerEventNotifier viewManagerEventNotifier, @NonNull Provider<ReactHost> provider);
}
