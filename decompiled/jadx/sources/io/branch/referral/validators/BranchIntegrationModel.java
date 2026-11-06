package io.branch.referral.validators;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.branch.referral.BranchAsyncTask;
import io.branch.referral.BranchUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class BranchIntegrationModel {
    boolean appSettingsAvailable = false;
    final List<String> applinkScheme = new ArrayList();
    private final String branchKeyLive;
    private final String branchKeyTest;
    JSONObject deeplinkUriScheme;
    final String packageName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class getDeepLinkSchemeTasks extends BranchAsyncTask<Context, Void, JSONObject> {
        private getDeepLinkSchemeTasks() {
        }

        @Override // android.os.AsyncTask
        public JSONObject doInBackground(Context... contextArr) {
            return BranchUtil.getDeepLinkSchemes(contextArr[0]);
        }
    }

    public BranchIntegrationModel(Context context) {
        String str;
        String str2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.packageName = context.getPackageName();
        String str3 = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            bundle = applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            str = null;
        }
        if (bundle == null) {
            str2 = null;
            this.branchKeyLive = str3;
            this.branchKeyTest = str2;
            updateDeepLinkSchemes(context);
        }
        str = bundle.getString("io.branch.sdk.BranchKey");
        try {
            str3 = applicationInfo.metaData.getString("io.branch.sdk.BranchKey.test");
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            e.printStackTrace();
            str2 = str3;
            str3 = str;
            this.branchKeyLive = str3;
            this.branchKeyTest = str2;
            updateDeepLinkSchemes(context);
        }
        str2 = str3;
        str3 = str;
        this.branchKeyLive = str3;
        this.branchKeyTest = str2;
        updateDeepLinkSchemes(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateDeepLinkSchemes(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 0
            io.branch.referral.validators.BranchIntegrationModel$getDeepLinkSchemeTasks r1 = new io.branch.referral.validators.BranchIntegrationModel$getDeepLinkSchemeTasks     // Catch: java.lang.Exception -> L1e
            r1.<init>()     // Catch: java.lang.Exception -> L1e
            android.content.Context[] r6 = new android.content.Context[]{r6}     // Catch: java.lang.Exception -> L1e
            android.os.AsyncTask r6 = r1.executeTask(r6)     // Catch: java.lang.Exception -> L1e
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L1e
            r2 = 2500(0x9c4, double:1.235E-320)
            java.lang.Object r6 = r6.get(r2, r1)     // Catch: java.lang.Exception -> L1e
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: java.lang.Exception -> L1e
            r0 = 1
            r5.appSettingsAvailable = r0     // Catch: java.lang.Exception -> L1c
            goto L29
        L1c:
            r0 = move-exception
            goto L22
        L1e:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L22:
            java.lang.String r0 = r0.getMessage()
            io.branch.referral.BranchLogger.d(r0)
        L29:
            if (r6 == 0) goto L56
            io.branch.referral.Defines$Jsonkey r0 = io.branch.referral.Defines.Jsonkey.URIScheme
            java.lang.String r0 = r0.getKey()
            org.json.JSONObject r0 = r6.optJSONObject(r0)
            r5.deeplinkUriScheme = r0
            io.branch.referral.Defines$Jsonkey r0 = io.branch.referral.Defines.Jsonkey.AppLinks
            java.lang.String r0 = r0.getKey()
            org.json.JSONArray r6 = r6.optJSONArray(r0)
            if (r6 == 0) goto L56
            r0 = 0
        L44:
            int r1 = r6.length()
            if (r0 >= r1) goto L56
            java.util.List<java.lang.String> r1 = r5.applinkScheme
            java.lang.String r2 = r6.optString(r0)
            r1.add(r2)
            int r0 = r0 + 1
            goto L44
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.validators.BranchIntegrationModel.updateDeepLinkSchemes(android.content.Context):void");
    }
}
