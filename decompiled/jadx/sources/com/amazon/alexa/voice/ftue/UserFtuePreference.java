package com.amazon.alexa.voice.ftue;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.alexa.voice.ra.BmclPreference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UserFtuePreference implements FtuePreference, BmclPreference {

    @VisibleForTesting
    static final String BMCL_ENTITLEMENT_STATUS = "bmcl_entitlement_status";

    @VisibleForTesting
    static final String BOTTOMSHEET_PRIMER = "bottomsheet_primer";

    @VisibleForTesting
    static final String ENTITLED_BENEFIT = "entitled_benefit";

    @VisibleForTesting
    static final String HANDS_FREE_PRIMER = "hands_free_primer";

    @VisibleForTesting
    static final String PREMIUM_BENEFIT_LABELS = "premium_benefit_labels";

    @VisibleForTesting
    static final String PRIMER_SHOWN = "primer";

    @VisibleForTesting
    static final String VISUAL_EXPERIENCE_ENTITLED = "visual_experience_entitled";

    @VisibleForTesting
    static final String VOICE_STORAGE = "voice";
    private final PersistentStorage storage;

    public UserFtuePreference(PersistentStorage.Factory factory) {
        this.storage = factory.create("voice");
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    @Deprecated
    public void clearBmclEntitlementStatus() {
        this.storage.edit().remove(BMCL_ENTITLEMENT_STATUS).commit();
    }

    @Override // com.amazon.alexa.voice.ftue.FtuePreference
    public void clearBottomSheetFtuePreference() {
        this.storage.edit().remove(BOTTOMSHEET_PRIMER).commit();
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    public void clearEntitledBenefit() {
        this.storage.edit().remove("entitled_benefit").commit();
    }

    @Override // com.amazon.alexa.voice.ftue.FtuePreference
    public void clearLegacyFtuePreference() {
        this.storage.edit().remove(PRIMER_SHOWN).commit();
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    public void clearPremiumBenefitLabels() {
        this.storage.edit().remove(PREMIUM_BENEFIT_LABELS).commit();
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    public void clearVisualExperienceEntitled() {
        this.storage.edit().remove("visual_experience_entitled").commit();
    }

    @Override // com.amazon.alexa.voice.ftue.FtuePreference
    public void clearWakewordFtuePreference() {
        this.storage.edit().remove(HANDS_FREE_PRIMER).commit();
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    @Deprecated
    public boolean getBmclEntitlementStatus() {
        return this.storage.getBoolean(BMCL_ENTITLEMENT_STATUS, false);
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    @Nullable
    public String getEntitledBenefit() {
        return this.storage.getString("entitled_benefit", null);
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    @NonNull
    public List<String> getPremiumBenefitLabels() {
        String string = this.storage.getString(PREMIUM_BENEFIT_LABELS, null);
        return (string == null || string.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(Arrays.asList(string.split(","))));
    }

    @Override // com.amazon.alexa.voice.ftue.FtuePreference
    public boolean hasCompletedBottomSheetFtue() {
        return this.storage.getBoolean(BOTTOMSHEET_PRIMER, false);
    }

    @Override // com.amazon.alexa.voice.ftue.FtuePreference
    public boolean hasCompletedLegacyFtue() {
        return this.storage.getBoolean(PRIMER_SHOWN, false);
    }

    @Override // com.amazon.alexa.voice.ftue.FtuePreference
    public boolean hasCompletedWakewordFtue() {
        return this.storage.getBoolean(HANDS_FREE_PRIMER, false);
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    public boolean isVisualExperienceEntitled() {
        return this.storage.getBoolean("visual_experience_entitled", false);
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    @Deprecated
    public void setBmclEntitlementStatus(boolean z) {
        this.storage.edit().set(BMCL_ENTITLEMENT_STATUS, z).commit();
    }

    @Override // com.amazon.alexa.voice.ftue.FtuePreference
    public void setBottomSheetFtueCompleted() {
        this.storage.edit().set(BOTTOMSHEET_PRIMER, true).commit();
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    public void setEntitledBenefit(@NonNull String str) {
        this.storage.edit().set("entitled_benefit", str).commit();
    }

    @Override // com.amazon.alexa.voice.ftue.FtuePreference
    public void setLegacyFtueCompleted() {
        this.storage.edit().set(PRIMER_SHOWN, true).commit();
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    public void setPremiumBenefitLabels(@NonNull List<String> list) {
        this.storage.edit().set(PREMIUM_BENEFIT_LABELS, String.join(",", list)).commit();
    }

    @Override // com.amazon.alexa.voice.ra.BmclPreference
    public void setVisualExperienceEntitled(boolean z) {
        this.storage.edit().set("visual_experience_entitled", z).commit();
    }

    @Override // com.amazon.alexa.voice.ftue.FtuePreference
    public void setWakewordFtueCompleted() {
        this.storage.edit().set(HANDS_FREE_PRIMER, true).commit();
    }
}
