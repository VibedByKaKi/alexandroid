package com.amazon.alexa.benefits.view.routing;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.benefits.dependency.BenefitsDependencies;
import com.amazon.alexa.benefits.view.devmenu.BenefitsDevMenuViewController;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.viewmanagement.api.ViewController;
import com.amazon.alexa.viewmanagement.api.ViewControllerFactory;
import com.amazon.alexa.viewmanagement.api.ViewManagerEventNotifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BenefitsViewControllerFactory implements ViewControllerFactory<ViewController> {
    @Override // com.amazon.alexa.viewmanagement.api.ViewControllerFactory
    public ViewController createView(@NonNull Context context, @NonNull RouteContext routeContext, @NonNull ViewManagerEventNotifier viewManagerEventNotifier) {
        BenefitsDependencies.initialize(context);
        return new BenefitsDevMenuViewController();
    }
}
