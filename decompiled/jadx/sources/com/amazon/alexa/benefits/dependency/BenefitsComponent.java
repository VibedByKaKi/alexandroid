package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.benefits.dependency.BenefitsViewComponent;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {ApplicationModule.class, ServiceModule.class})
@Singleton
/* loaded from: classes17.dex */
public interface BenefitsComponent {
    BenefitsViewComponent.Factory benefitsViewComponent();
}
