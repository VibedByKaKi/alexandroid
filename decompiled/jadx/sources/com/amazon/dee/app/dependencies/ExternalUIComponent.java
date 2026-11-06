package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.ui.external.ExternalUIViewModel;
import dagger.Subcomponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExternalUIScope
@Subcomponent(modules = {ExternalUIModule.class})
/* loaded from: classes3.dex */
public interface ExternalUIComponent {
    ExternalUIViewModel inject(ExternalUIViewModel externalUIViewModel);
}
