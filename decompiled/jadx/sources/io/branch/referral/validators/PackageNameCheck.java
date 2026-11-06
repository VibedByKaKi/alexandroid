package io.branch.referral.validators;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PackageNameCheck extends IntegrationValidatorCheck {
    JSONObject branchAppConfig;
    BranchIntegrationModel integrationModel;
    String name = "Package Name";
    String errorMessage = "Incorrect package name in Branch dashboard. Please correct your package name in dashboard -> Configuration page.";
    String moreInfoLink = IntegrationValidatorConstants.packageNameMoreInfoDocsLink;

    public PackageNameCheck(BranchIntegrationModel branchIntegrationModel, JSONObject jSONObject) {
        super.name = "Package Name";
        super.errorMessage = "Incorrect package name in Branch dashboard. Please correct your package name in dashboard -> Configuration page.";
        super.moreInfoLink = IntegrationValidatorConstants.packageNameMoreInfoDocsLink;
        this.integrationModel = branchIntegrationModel;
        this.branchAppConfig = jSONObject;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetOutput(Context context, boolean z) {
        return super.GetOutput(context, RunTests(context));
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public boolean RunTests(Context context) {
        return this.integrationModel.packageName.equals(this.branchAppConfig.optString("android_package_name"));
    }
}
