package com.amazon.alexa.voice.ui.onedesign.local.detail;

import com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel;
import com.amazon.alexa.voice.ui.onedesign.local.LocalDelegate;
import com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LocalDetailInteractor implements LocalDetailContract.Interactor {
    private final LocalCardModel.BusinessModel business;
    private final LocalDelegate delegate;
    private final LocalDetailContract.Mediator mediator;

    public LocalDetailInteractor(LocalCardModel.BusinessModel businessModel, LocalDetailContract.Mediator mediator, LocalDelegate localDelegate) {
        this.business = businessModel;
        this.mediator = mediator;
        this.delegate = localDelegate;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Interactor
    public void back() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Interactor
    public void callBusiness() {
        this.mediator.dialPhoneNumber(String.valueOf(this.business.getPhoneNumber()));
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Interactor
    public void close() {
        this.delegate.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Interactor
    public LocalCardModel.BusinessModel getBusiness() {
        return this.business;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Interactor
    public void openLink() {
        this.mediator.openLinkUrl(this.business.goToActionUrl());
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Interactor
    public void showLocation() {
        CharSequence geoLocation = this.business.getGeoLocation();
        if (geoLocation == null || geoLocation.length() == 0) {
            this.mediator.mapAddress(this.business.getAddress().toString());
            return;
        }
        try {
            this.mediator.mapGeoLocation(this.business.getGeoLocation().toString());
        } catch (IllegalArgumentException unused) {
            this.mediator.mapAddress(this.business.getAddress().toString());
        }
    }
}
