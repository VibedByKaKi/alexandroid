package com.amazon.alexa.aamb.cbl;

import androidx.camera.core.CameraState;
import androidx.lifecycle.Observer;
import com.amazon.alexa.benefits.view.devmenu.BenefitsDevMenuViewController;
import com.amazon.alexa.biloba.model.CareActor;
import com.amazon.alexa.biloba.view.account.MembershipLeaveView;
import com.amazon.alexa.biloba.view.account.ProfileSettingsView;
import com.amazon.alexa.biloba.view.alertsv2.actions.AlertActivityView;
import com.amazon.alexa.biloba.view.tips.TipsView;
import com.amazon.alexa.ra.features.visualshare.CameraPreviewErrorReporter;
import com.amazon.alexa.ra.features.visualshare.CameraPreviewProviderImpl;
import com.amazon.photos.discovery.DiscoveryLiveWorkInfo;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class CblActivity$$ExternalSyntheticLambda3 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CblActivity$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((CblActivity) obj2).lambda$InitializeViewModel$0((Integer) obj);
                break;
            case 1:
                ((BenefitsDevMenuViewController) obj2).lambda$new$0((Set) obj);
                break;
            case 2:
                ((MembershipLeaveView) obj2).lambda$onConfirm$0((Boolean) obj);
                break;
            case 3:
                ((ProfileSettingsView) obj2).maybeNavigateToStartup((CareActor) obj);
                break;
            case 4:
                ((AlertActivityView) obj2).lambda$new$0((List) obj);
                break;
            case 5:
                ((TipsView) obj2).updateTips((List) obj);
                break;
            case 6:
                CameraPreviewProviderImpl.Render$lambda$15$lambda$14$lambda$10$lambda$8((CameraPreviewErrorReporter) obj2, (CameraState) obj);
                break;
            default:
                DiscoveryLiveWorkInfo.LiveDataWrapper.observe$lambda$0((DiscoveryLiveWorkInfo.LiveDataWrapper) obj2, (List) obj);
                break;
        }
    }
}
