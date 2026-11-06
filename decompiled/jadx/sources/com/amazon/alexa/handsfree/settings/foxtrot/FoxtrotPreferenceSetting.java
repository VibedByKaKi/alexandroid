package com.amazon.alexa.handsfree.settings.foxtrot;

import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.settings.contract.handsfreesettings.CustomPreferenceSetting;
import com.amazon.alexa.handsfree.settings.contract.handsfreesettings.vendor.VendorSettingContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FoxtrotPreferenceSetting implements CustomPreferenceSetting {
    @Override // com.amazon.alexa.handsfree.settings.contract.handsfreesettings.CustomPreferenceSetting
    @Nullable
    public String getMainSectionTitle() {
        return null;
    }

    @Override // com.amazon.alexa.handsfree.settings.contract.handsfreesettings.CustomPreferenceSetting
    @Nullable
    public VendorSettingContract getVendorSettings() {
        return null;
    }

    @Override // com.amazon.alexa.handsfree.settings.contract.handsfreesettings.CustomPreferenceSetting
    public boolean isLegalNoticeNeeded() {
        return false;
    }

    @Override // com.amazon.alexa.handsfree.settings.contract.handsfreesettings.CustomPreferenceSetting
    public boolean isShowOnLockScreenAvailable() {
        return true;
    }

    @Override // com.amazon.alexa.handsfree.settings.contract.handsfreesettings.CustomPreferenceSetting
    public boolean isUVRAvailable() {
        return false;
    }
}
