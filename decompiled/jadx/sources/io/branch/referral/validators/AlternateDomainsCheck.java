package io.branch.referral.validators;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class AlternateDomainsCheck extends IntegrationValidatorCheck {
    JSONObject branchAppConfig;
    BranchIntegrationModel integrationModel;
    String name = "Alt Domains";
    String errorMessage = "Could not find intent filter to support alternate link domain. Please add intent filter for handling alternate link domain in your Android Manifest file";
    String moreInfoLink = IntegrationValidatorConstants.alternateDomainsMoreInfoDocsLink;

    public AlternateDomainsCheck(BranchIntegrationModel branchIntegrationModel, JSONObject jSONObject) {
        super.name = "Alt Domains";
        super.errorMessage = "Could not find intent filter to support alternate link domain. Please add intent filter for handling alternate link domain in your Android Manifest file";
        super.moreInfoLink = IntegrationValidatorConstants.alternateDomainsMoreInfoDocsLink;
        this.integrationModel = branchIntegrationModel;
        this.branchAppConfig = jSONObject;
    }

    private boolean checkIfIntentAddedForLinkDomain(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it2 = this.integrationModel.applinkScheme.iterator();
        while (it2.hasNext()) {
            if (str.equals(it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetOutput(Context context, boolean z) {
        return super.GetOutput(context, RunTests(context));
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public boolean RunTests(Context context) {
        String optString = this.branchAppConfig.optString("alternate_short_url_domain");
        return TextUtils.isEmpty(optString) || checkIfIntentAddedForLinkDomain(optString);
    }
}
