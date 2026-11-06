package com.amazon.alexa.benefits.view.routing;

import com.amazon.alexa.routing.api.Route;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class BenefitsRouting {
    private BenefitsRouting() {
    }

    public static List<Route> getAllRoutes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Route.Builder(Routes.BENEFITS_TEST_MENU, BenefitsViewControllerFactory.class.getCanonicalName()).asRoot().withParent("main").withTemplate(Routes.BENEFITS_TEST_MENU).build());
        return arrayList;
    }
}
