package com.amazon.deecomms.common.network.acmsrecipes;

import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.network.ACMSClient;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GetPreferenceForContact {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, GetPreferenceForContact.class);
    private final ACMSClient mClient = new ACMSClient(MetricKeys.OP_GET_PREF_FOR_CONTACTS);
    private final String mCommsId;
    private final String mContactHGId;
    private final String mPreferenceName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetPreferenceForContactResponse {

        @JsonProperty("key")
        private String key;

        @JsonProperty("namespace")
        private String namespace;

        @JsonProperty("value")
        private String value;

        private GetPreferenceForContactResponse() {
        }

        public String getKey() {
            return this.key;
        }

        public String getNamespace() {
            return this.namespace;
        }

        public String getValue() {
            return this.value;
        }
    }

    public GetPreferenceForContact(String str, String str2, String str3) {
        this.mPreferenceName = str;
        this.mCommsId = str2;
        this.mContactHGId = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #3 {all -> 0x008f, blocks: (B:5:0x0047, B:12:0x0075, B:20:0x00a9, B:23:0x00ac, B:24:0x0085, B:27:0x0091), top: B:4:0x0047, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean getPreferenceForContact() throws com.amazon.deecomms.common.network.ServiceException {
        /*
            r10 = this;
            java.lang.String r0 = "Error while fetching value of contact preference "
            java.lang.String r1 = "Fetched value of contact preference "
            java.lang.String r2 = r10.mCommsId
            java.lang.String r3 = r10.mContactHGId
            java.lang.String r4 = r10.mPreferenceName
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r3 = "/users/{0}/contacts/{1}/preferences/{2}"
            java.lang.String r2 = java.text.MessageFormat.format(r3, r2)
            com.amazon.deecomms.common.network.ACMSClient r3 = r10.mClient
            com.amazon.deecomms.common.network.IHttpClient$Request r2 = r3.request(r2)
            com.amazon.comms.log.CommsLogger r3 = com.amazon.deecomms.common.network.acmsrecipes.GetPreferenceForContact.LOG
            java.lang.String r4 = r10.mPreferenceName
            java.lang.String r5 = r2.getRequestId()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Fetching value of contact preference "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = ", requestId "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r3.d(r5)
            com.amazon.deecomms.common.network.IHttpClient$Request r5 = r2.authenticatedAsCurrentCommsUser()     // Catch: java.io.IOException -> La5 com.amazon.deecomms.common.network.ServiceException -> La7
            com.amazon.deecomms.common.network.IHttpClient$Call r5 = r5.get()     // Catch: java.io.IOException -> La5 com.amazon.deecomms.common.network.ServiceException -> La7
            com.amazon.deecomms.common.network.IHttpClient$Response r5 = r5.execute()     // Catch: java.io.IOException -> La5 com.amazon.deecomms.common.network.ServiceException -> La7
            java.lang.Class<com.amazon.deecomms.common.network.acmsrecipes.GetPreferenceForContact$GetPreferenceForContactResponse> r6 = com.amazon.deecomms.common.network.acmsrecipes.GetPreferenceForContact.GetPreferenceForContactResponse.class
            java.lang.Object r6 = r5.convert(r6)     // Catch: java.lang.Throwable -> L8f
            com.amazon.deecomms.common.network.acmsrecipes.GetPreferenceForContact$GetPreferenceForContactResponse r6 = (com.amazon.deecomms.common.network.acmsrecipes.GetPreferenceForContact.GetPreferenceForContactResponse) r6     // Catch: java.lang.Throwable -> L8f
            java.lang.String r7 = r10.mPreferenceName     // Catch: java.lang.Throwable -> L8f
            java.lang.String r8 = r2.getRequestId()     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L8f
            r9.append(r7)     // Catch: java.lang.Throwable -> L8f
            r9.append(r4)     // Catch: java.lang.Throwable -> L8f
            r9.append(r8)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L8f
            r3.d(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = r6.getValue()     // Catch: java.lang.Throwable -> L8f
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L75
            goto La0
        L75:
            int r3 = r1.hashCode()     // Catch: java.lang.Throwable -> L8f
            r6 = -1609594047(0xffffffffa00f8b41, float:-1.2158646E-19)
            r7 = 1
            if (r3 == r6) goto L91
            r6 = 270940796(0x10263a7c, float:3.2782782E-29)
            if (r3 == r6) goto L85
            goto L9b
        L85:
            java.lang.String r3 = "disabled"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L9b
            r1 = r7
            goto L9c
        L8f:
            r1 = move-exception
            goto Lb2
        L91:
            java.lang.String r3 = "enabled"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L9b
            r1 = 0
            goto L9c
        L9b:
            r1 = -1
        L9c:
            if (r1 == 0) goto Lac
            if (r1 == r7) goto La9
        La0:
            r1 = 0
            r5.close()     // Catch: java.io.IOException -> La5 com.amazon.deecomms.common.network.ServiceException -> La7
            return r1
        La5:
            r1 = move-exception
            goto Lbd
        La7:
            r1 = move-exception
            goto Ld2
        La9:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8f
            goto Lae
        Lac:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8f
        Lae:
            r5.close()     // Catch: java.io.IOException -> La5 com.amazon.deecomms.common.network.ServiceException -> La7
            return r1
        Lb2:
            if (r5 == 0) goto Lbc
            r5.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lbc
        Lb8:
            r3 = move-exception
            r1.addSuppressed(r3)     // Catch: java.io.IOException -> La5 com.amazon.deecomms.common.network.ServiceException -> La7
        Lbc:
            throw r1     // Catch: java.io.IOException -> La5 com.amazon.deecomms.common.network.ServiceException -> La7
        Lbd:
            java.lang.String r10 = r10.mPreferenceName
            java.lang.String r2 = r2.getRequestId()
            java.lang.String r10 = defpackage.a$$ExternalSyntheticOutline0.m(r0, r10, r4, r2)
            com.amazon.comms.log.CommsLogger r0 = com.amazon.deecomms.common.network.acmsrecipes.GetPreferenceForContact.LOG
            r0.e(r10, r1)
            com.amazon.deecomms.common.network.ServiceException r0 = new com.amazon.deecomms.common.network.ServiceException
            r0.<init>(r10, r1)
            throw r0
        Ld2:
            com.amazon.comms.log.CommsLogger r3 = com.amazon.deecomms.common.network.acmsrecipes.GetPreferenceForContact.LOG
            java.lang.String r10 = r10.mPreferenceName
            java.lang.String r2 = r2.getRequestId()
            java.lang.String r10 = defpackage.a$$ExternalSyntheticOutline0.m(r0, r10, r4, r2)
            r3.e(r10, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.deecomms.common.network.acmsrecipes.GetPreferenceForContact.getPreferenceForContact():java.lang.Boolean");
    }
}
