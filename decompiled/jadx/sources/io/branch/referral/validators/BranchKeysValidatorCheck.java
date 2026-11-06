package io.branch.referral.validators;

import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.BranchUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class BranchKeysValidatorCheck extends IntegrationValidatorCheck {
    String name = "Branch Keys";
    String errorMessage = "Unable to read Branch keys from your application. Did you forget to add Branch keys in your application?.";
    String moreInfoLink = IntegrationValidatorConstants.branchKeysMoreInfoDocsLink;

    public BranchKeysValidatorCheck() {
        super.name = "Branch Keys";
        super.errorMessage = "Unable to read Branch keys from your application. Did you forget to add Branch keys in your application?.";
        super.moreInfoLink = IntegrationValidatorConstants.branchKeysMoreInfoDocsLink;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetOutput(Context context, boolean z) {
        return super.GetOutput(context, RunTests(context));
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public boolean RunTests(Context context) {
        return !TextUtils.isEmpty(BranchUtil.readBranchKey(context));
    }
}
