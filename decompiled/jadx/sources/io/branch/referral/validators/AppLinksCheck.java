package io.branch.referral.validators;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class AppLinksCheck extends IntegrationValidatorCheck {
    JSONObject branchAppConfig;
    BranchIntegrationModel integrationModel;
    String name = "App Links";
    String errorMessage = "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file";
    String moreInfoLink = IntegrationValidatorConstants.appLinksMoreInfoDocsLink;

    public AppLinksCheck(BranchIntegrationModel branchIntegrationModel, JSONObject jSONObject) {
        super.name = "App Links";
        super.errorMessage = "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file";
        super.moreInfoLink = IntegrationValidatorConstants.appLinksMoreInfoDocsLink;
        this.integrationModel = branchIntegrationModel;
        this.branchAppConfig = jSONObject;
    }

    private boolean checkIfIntentAddedForLinkDomain(String str) {
        List<String> list;
        if (TextUtils.isEmpty(str) || (list = this.integrationModel.applinkScheme) == null) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
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
        String optString = this.branchAppConfig.optString("default_short_url_domain");
        return (this.integrationModel.applinkScheme.isEmpty() || TextUtils.isEmpty(optString) || !checkIfIntentAddedForLinkDomain(optString)) ? false : true;
    }
}
