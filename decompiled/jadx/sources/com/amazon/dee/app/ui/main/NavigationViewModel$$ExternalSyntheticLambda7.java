package com.amazon.dee.app.ui.main;

import com.amazon.alexa.digitalcommerce.api.GetProductDetailsResponse;
import java.lang.ref.WeakReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NavigationViewModel$$ExternalSyntheticLambda7 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavigationViewModel f$0;

    public /* synthetic */ NavigationViewModel$$ExternalSyntheticLambda7(NavigationViewModel navigationViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = navigationViewModel;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        NavigationViewModel navigationViewModel = this.f$0;
        switch (i) {
            case 0:
                navigationViewModel.lambda$trySetProfileInitial$5((String) obj);
                break;
            case 1:
                navigationViewModel.lambda$updatePersistentAlexaPlusUpsellVisibility$9((GetProductDetailsResponse) obj);
                break;
            default:
                navigationViewModel.lambda$cleanup$0((WeakReference) obj);
                break;
        }
    }
}
