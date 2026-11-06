package com.amazon.identity.auth.device.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.accounts.w;
import com.amazon.identity.auth.device.dh;
import com.amazon.identity.auth.device.g8;
import com.amazon.identity.auth.device.gl;
import com.amazon.identity.auth.device.hl;
import com.amazon.identity.auth.device.i4;
import com.amazon.identity.auth.device.nq;
import com.amazon.identity.auth.device.pq;
import com.amazon.identity.auth.device.qg;
import com.amazon.identity.auth.device.t7;
import com.amazon.identity.auth.device.tn;
import com.amazon.identity.auth.device.u7;
import com.amazon.identity.auth.device.utils.AccountConstants;
import com.amazon.identity.auth.device.yf;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MultipleAccountManager {

    /* renamed from: a, reason: collision with root package name */
    private final qg f512a;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class AccountMappingType {

        /* renamed from: a, reason: collision with root package name */
        private final String f513a;
        private final String b;

        public AccountMappingType(String str, String str2) {
            this.f513a = str;
            this.b = str2;
        }

        @FireOsSdk
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                AccountMappingType accountMappingType = (AccountMappingType) obj;
                if (TextUtils.equals(this.f513a, accountMappingType.f513a) && TextUtils.equals(this.b, accountMappingType.b)) {
                    return true;
                }
            }
            return false;
        }

        public String getAccountMappingType() {
            return this.f513a;
        }

        public String getAccountMappingValue() {
            return this.b;
        }

        @FireOsSdk
        public int hashCode() {
            String str = this.f513a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CustomKeyMappingType extends AccountMappingType {
        @FireOsSdk
        public CustomKeyMappingType(String str) {
            super("com.amazon.dcp.sso.property.account.extratokens.custom_keys", str);
        }

        public static boolean isSupportedOnThisPlatform(Context context) {
            Context context2 = ((hl) tn.a(context).getSystemService("sso_platform")).f707a;
            HashSet hashSet = gl.f684a;
            t7 a2 = u7.a(context2);
            if (a2 == null) {
                return true;
            }
            return gl.b.contains(a2.f969a);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PackageMappingType extends AccountMappingType {
        @FireOsSdk
        public PackageMappingType(String str) {
            super("com.amazon.dcp.sso.property.account.extratokens.account_packages", str);
        }

        @FireOsSdk
        public static PackageMappingType createCurrentPackageMapping(Context context) {
            return new PackageMappingType(context.getPackageName());
        }

        public static boolean isSupportedOnThisPlatform(Context context) {
            Context context2 = ((hl) tn.a(context).getSystemService("sso_platform")).f707a;
            HashSet hashSet = gl.f684a;
            t7 a2 = u7.a(context2);
            if (a2 == null) {
                return true;
            }
            return gl.b.contains(a2.f969a);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static class ProfileMappingType extends PrimaryUserMappingType {
        public ProfileMappingType(int i) {
            super(i, 0);
        }

        public static ProfileMappingType createCurrentProfile(Context context) {
            return new ProfileMappingType(0);
        }

        public static ProfileMappingType createCurrentViewableProfile(Context context) {
            return new ProfileMappingType(0);
        }

        public static boolean isSupportedOnThisPlatform(Context context) {
            Log.e(yf.a("MultipleAccountManager"), "ProfileMappingType is deprecated. Please use PrimaryUserMappingType instead");
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SessionPackageMappingAlreadySetException extends RuntimeException {
        private final String mOwner;

        @FireOsSdk
        public SessionPackageMappingAlreadySetException(String str) {
            this.mOwner = str;
        }

        @FireOsSdk
        public String getOwner() {
            return this.mOwner;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SessionUserMappingType extends AccountMappingType {
        @FireOsSdk
        public SessionUserMappingType() {
            super(AccountConstants.KEY_SESSION_USER_AMAZON_ACCOUNT, "true");
        }

        public static boolean isSupportedOnThisPlatform(Context context) {
            hl hlVar = (hl) tn.a(context).getSystemService("sso_platform");
            Context context2 = hlVar.f707a;
            HashSet hashSet = gl.f684a;
            t7 a2 = u7.a(context2);
            if (!(a2 == null ? true : gl.b.contains(a2.f969a))) {
                Context context3 = hlVar.f707a;
                ConcurrentHashMap concurrentHashMap = gl.d;
                Boolean bool = (Boolean) concurrentHashMap.get(AccountConstants.INTENT_ACTION_SESSION_USER_CHANGE_SERVICE);
                if (bool == null) {
                    boolean z = new pq(context3, false).a(0, new Intent(AccountConstants.INTENT_ACTION_SESSION_USER_CHANGE_SERVICE)).size() > 0;
                    bool = (Boolean) concurrentHashMap.putIfAbsent(AccountConstants.INTENT_ACTION_SESSION_USER_CHANGE_SERVICE, Boolean.valueOf(z));
                    if (bool == null) {
                        bool = Boolean.valueOf(z);
                    }
                }
                if (!bool.booleanValue()) {
                    return false;
                }
            }
            return true;
        }
    }

    @FireOsSdk
    public MultipleAccountManager(Context context) {
        MAPInit.getInstance(context).initialize();
        tn a2 = tn.a(context);
        HashSet hashSet = gl.f684a;
        this.f512a = gl.a(u7.a(a2)) ? new w(a2) : dh.a(a2);
    }

    @FireOsSdk
    public boolean doesAccountHaveMapping(String str, AccountMappingType accountMappingType) {
        nq nqVar = new nq("MultipleAccountManager:doesAccountHaveMapping");
        try {
            return this.f512a.a(str, accountMappingType);
        } finally {
            nqVar.a();
        }
    }

    @FireOsSdk
    public String getAccountForMapping(AccountMappingType... accountMappingTypeArr) {
        return this.f512a.a(accountMappingTypeArr);
    }

    @FireOsSdk
    public String getAccountMappingOwner(AccountMappingType accountMappingType) {
        nq nqVar = new nq("MultipleAccountManager:getAccountMappingOwner");
        try {
            return this.f512a.a(accountMappingType);
        } finally {
            nqVar.a();
        }
    }

    @FireOsSdk
    public Intent getIntentToRemoveAccountMapping(AccountMappingType accountMappingType) {
        nq nqVar = new nq("MultipleAccountManager:getIntentToRemoveAccountMapping");
        try {
            return this.f512a.b(accountMappingType);
        } finally {
            nqVar.a();
        }
    }

    @FireOsSdk
    public boolean removeAccountMappings(String str, AccountMappingType... accountMappingTypeArr) {
        nq nqVar = new nq("MultipleAccountManager:removeAccountMappings");
        try {
            return this.f512a.a(str, accountMappingTypeArr);
        } finally {
            nqVar.a();
        }
    }

    @FireOsSdk
    public boolean setAccountMappings(String str, AccountMappingType... accountMappingTypeArr) {
        nq nqVar = new nq("MultipleAccountManager:setAccountMappings");
        try {
            return this.f512a.b(str, accountMappingTypeArr);
        } finally {
            nqVar.a();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PrimaryUserMappingType extends AccountMappingType {
        @FireOsSdk
        public PrimaryUserMappingType() {
            super("com.amazon.dcp.sso.property.account.extratokens.account_profiles", Integer.toString(i4.a()));
        }

        @FireOsSdk
        public static PrimaryUserMappingType createPrimaryMappingForProfile(int i) {
            return new PrimaryUserMappingType(i);
        }

        public static boolean isSupportedOnThisPlatform(Context context) {
            return true;
        }

        public /* synthetic */ PrimaryUserMappingType(int i, int i2) {
            this(i);
        }

        private PrimaryUserMappingType(int i) {
            super("com.amazon.dcp.sso.property.account.extratokens.account_profiles", Integer.toString(i));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SessionPackageMappingType extends AccountMappingType {
        public static final String JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER = "owner";
        public static final String JSON_KEY_SESSION_PACKAGE_MAPPING_PACKAGES = "packages";
        public static final String JSON_KEY_SESSION_PACKAGE_MAPPING_REMOVE_ACTIVITY_CLASS_NAME = "activity";
        private final String c;
        private final Set d;
        private final String e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SessionPackageMappingType(android.content.Context r5, java.util.Set r6, java.lang.String r7) {
            /*
                r4 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "owner"
                java.lang.String r2 = r5.getPackageName()     // Catch: org.json.JSONException -> L2d
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L2d
                java.lang.String r1 = "activity"
                r0.put(r1, r7)     // Catch: org.json.JSONException -> L2d
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L2d
                r1.<init>()     // Catch: org.json.JSONException -> L2d
                java.util.Iterator r2 = r6.iterator()     // Catch: org.json.JSONException -> L2d
            L1d:
                boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> L2d
                if (r3 == 0) goto L2f
                java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> L2d
                java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L2d
                r1.put(r3)     // Catch: org.json.JSONException -> L2d
                goto L1d
            L2d:
                r1 = move-exception
                goto L36
            L2f:
                java.lang.String r2 = "packages"
                r0.put(r2, r1)     // Catch: org.json.JSONException -> L2d
                goto L41
            L36:
                java.lang.String r2 = "Unable to create session package mapping json."
                java.lang.String r3 = "MultipleAccountManager"
                java.lang.String r3 = com.amazon.identity.auth.device.yf.a(r3)
                android.util.Log.e(r3, r2, r1)
            L41:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "com.amazon.dcp.sso.property.account.extratokens.account_session_packages"
                r4.<init>(r1, r0)
                r4.d = r6
                java.lang.String r5 = r5.getPackageName()
                r4.c = r5
                r4.e = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.api.MultipleAccountManager.SessionPackageMappingType.<init>(android.content.Context, java.util.Set, java.lang.String):void");
        }

        @FireOsSdk
        public static SessionPackageMappingType createNewSessionPackageMapping(Context context, Set<String> set, String str) {
            if (context != null && !g8.a(set) && !TextUtils.isEmpty(str)) {
                return new SessionPackageMappingType(context, set, str);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("You cannot pass empty or null parameters when construct a new session package mapping.");
            return null;
        }

        @FireOsSdk
        public static SessionPackageMappingType createSessionPackageMappingInstance(Context context) {
            if (context != null) {
                return new SessionPackageMappingType(context.getPackageName());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("You cannot pass null context when construct session package mapping.");
            return null;
        }

        @FireOsSdk
        public static boolean isSupportedOnThisPlatform(Context context) {
            Context context2 = ((hl) tn.a(context).getSystemService("sso_platform")).f707a;
            HashSet hashSet = gl.f684a;
            return !u7.b(context2);
        }

        @FireOsSdk
        public String getCallingPackage() {
            return this.c;
        }

        @FireOsSdk
        public String getRemoveActivityClassName() {
            return this.e;
        }

        @FireOsSdk
        public Set<String> getSessionPackages() {
            return this.d;
        }

        private SessionPackageMappingType(String str) {
            super("com.amazon.dcp.sso.property.account.extratokens.account_session_packages", null);
            this.d = null;
            this.c = str;
            this.e = null;
        }
    }
}
