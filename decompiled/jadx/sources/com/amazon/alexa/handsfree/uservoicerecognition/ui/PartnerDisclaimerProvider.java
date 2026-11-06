package com.amazon.alexa.handsfree.uservoicerecognition.ui;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import com.amazon.alexa.handsfree.uservoicerecognition.R;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.QualcommIOComponentsStateProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum PartnerDisclaimerProvider {
    QUEBEC(QualcommIOComponentsStateProvider.QUALCOMM_PACKAGE_NAME, "Qualcomm", R.string.quebec_disclaimer_uri),
    METRO("com.magiear.handsfree.assistant", "MediaTek", R.string.metro_disclaimer_uri);


    @StringRes
    private final int mDisclaimerUriResId;
    private final String mPartnerName;
    private final String mVoiceAppPackageName;

    PartnerDisclaimerProvider(@NonNull String str, @NonNull String str2, @StringRes int i) {
        this.mVoiceAppPackageName = str;
        this.mPartnerName = str2;
        this.mDisclaimerUriResId = i;
    }

    @StringRes
    public int getDisclaimerUriID() {
        return this.mDisclaimerUriResId;
    }

    @NonNull
    public String getPartnerName() {
        return this.mPartnerName;
    }

    @NonNull
    public String getVoiceAppPackageName() {
        return this.mVoiceAppPackageName;
    }
}
