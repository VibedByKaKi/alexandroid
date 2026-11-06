package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.benefits.BenefitsServiceImpl;
import com.amazon.alexa.benefits.capability.BenefitCapability;
import com.amazon.alexa.benefits.capability.BenefitCapabilityV2;
import com.amazon.alexa.benefits.storage.PersistentBenefitsContentProvider;
import com.amazon.alexa.benefits.view.devmenu.BenefitsDevMenuViewController;
import com.amazon.alexa.benefits.view.devmenu.BenefitsDevMenuViewModel;
import dagger.Subcomponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Subcomponent
@BenefitsScope
/* loaded from: classes17.dex */
public interface BenefitsViewComponent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Subcomponent.Builder
    public interface Factory {
        BenefitsViewComponent create();
    }

    void inject(BenefitsServiceImpl benefitsServiceImpl);

    void inject(BenefitCapability benefitCapability);

    void inject(BenefitCapabilityV2 benefitCapabilityV2);

    void inject(PersistentBenefitsContentProvider persistentBenefitsContentProvider);

    void inject(BenefitsDevMenuViewController benefitsDevMenuViewController);

    void inject(BenefitsDevMenuViewModel benefitsDevMenuViewModel);
}
