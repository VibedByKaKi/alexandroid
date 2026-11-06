package com.amazon.alexa.redesign.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.amazon.alexa.redesign.HomeContract;
import com.amazon.alexa.redesign.view.ViewTypeFactory;
import com.amazon.alexa.redesign.view.templates.TemplateFactory;
import com.amazon.alexa.redesign.view.viewtypes.ViewType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ViewTypeFactory$$ExternalSyntheticLambda6 implements ViewTypeFactory.Factory {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ HomeContract.Presenter f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ViewTypeFactory$$ExternalSyntheticLambda6(Context context, LayoutInflater layoutInflater, HomeContract.Presenter presenter) {
        this.f$1 = context;
        this.f$2 = layoutInflater;
        this.f$0 = presenter;
    }

    @Override // com.amazon.alexa.redesign.view.ViewTypeFactory.Factory
    public final Object create(LinearLayout linearLayout) {
        ViewType lambda$new$15;
        ViewType lambda$new$9;
        switch (this.$r8$classId) {
            case 0:
                lambda$new$15 = ViewTypeFactory.lambda$new$15(this.f$0, (TemplateFactory) this.f$1, (HomeContract.View) this.f$2, linearLayout);
                return lambda$new$15;
            default:
                lambda$new$9 = ViewTypeFactory.lambda$new$9((Context) this.f$1, (LayoutInflater) this.f$2, this.f$0, linearLayout);
                return lambda$new$9;
        }
    }

    public /* synthetic */ ViewTypeFactory$$ExternalSyntheticLambda6(HomeContract.Presenter presenter, TemplateFactory templateFactory, HomeContract.View view) {
        this.f$0 = presenter;
        this.f$1 = templateFactory;
        this.f$2 = view;
    }
}
