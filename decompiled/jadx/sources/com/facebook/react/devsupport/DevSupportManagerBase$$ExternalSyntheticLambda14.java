package com.facebook.react.devsupport;

import android.content.Context;
import androidx.core.util.Supplier;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.devsupport.ChangeBundleLocationDialog;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DevSupportManagerBase$$ExternalSyntheticLambda14 implements ShakeDetector.ShakeListener, Supplier, ChangeBundleLocationDialog.ChangeBundleLocationDialogListener, BundleLoadCallback {
    public final /* synthetic */ DevSupportManagerBase f$0;

    public /* synthetic */ DevSupportManagerBase$$ExternalSyntheticLambda14(DevSupportManagerBase devSupportManagerBase) {
        this.f$0 = devSupportManagerBase;
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        Context _init_$lambda$3;
        _init_$lambda$3 = DevSupportManagerBase._init_$lambda$3(this.f$0);
        return _init_$lambda$3;
    }

    @Override // com.facebook.react.devsupport.ChangeBundleLocationDialog.ChangeBundleLocationDialogListener
    public void onClick(String str) {
        DevSupportManagerBase.showDevOptionsDialog$lambda$10$lambda$9(this.f$0, str);
    }

    @Override // com.facebook.react.common.ShakeDetector.ShakeListener
    public void onShake() {
        this.f$0.showDevOptionsDialog();
    }

    @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
    public void onSuccess() {
        BridgeDevSupportManager.handleReloadJS$lambda$1((BridgeDevSupportManager) this.f$0);
    }
}
