package com.amazon.deecomms.common.network;

import androidx.annotation.NonNull;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.auth.AuthHeaderProvider;
import com.amazon.deecomms.calling.incallcommands.models.InCallCommandModel$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.CommsInternal;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.IHttpClient;
import com.amazon.deecomms.common.network.okhttp.OkHttpClientWrapper;
import com.amazon.deecomms.common.util.JacksonJSONConverter;
import com.amazon.deecomms.common.util.Utils;
import com.amazon.deecomms.core.CommsDaggerWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ACMSClient {
    private final String mClientId;
    private final CommsLogger mCommsLogger;
    private final IHttpClient mHttpClient;
    private final String mUrlPrefix;

    public ACMSClient(@NonNull String str) {
        this(new OkHttpClientWrapper(new JacksonJSONConverter(), new AuthHeaderProvider()), CommsDaggerWrapper.getComponent().getAppUrl().getACMSServiceURL(), CommsLogger.getLogger(Constants.LOG_TAG, ACMSClient.class), str);
    }

    private String getFullUrl(String str) {
        return InCallCommandModel$$ExternalSyntheticOutline0.m(new StringBuilder(), this.mUrlPrefix, str);
    }

    public IHttpClient.Request request(@NonNull String str) {
        String userAgent = Utils.getUserAgent();
        IHttpClient.Request addHeader = this.mHttpClient.request(getFullUrl(str)).addRequestIdToHeader().addHeader("X-Amzn-ClientId", this.mClientId).addHeader("User-Agent", userAgent).addHeader("Accept-Language", CommsInternal.getInstance().getLocale()).addHeader("Accept-PFM", CommsDaggerWrapper.getComponent().getCommsIdentityManager().getPreferredMarketplace(false));
        CommsLogger commsLogger = this.mCommsLogger;
        StringBuilder sb = new StringBuilder(" ACMS Request ID ");
        sb.append(addHeader.getRequestId());
        sb.append(", ACMS Client ID : ");
        ChatData$$ExternalSyntheticOutline0.m(sb, Utils.isFireOS() ? "*****" : this.mClientId, commsLogger);
        return addHeader;
    }

    public ACMSClient(OkHttpClientWrapper okHttpClientWrapper, String str, CommsLogger commsLogger, @NonNull String str2) {
        this.mHttpClient = okHttpClientWrapper;
        this.mUrlPrefix = str;
        this.mCommsLogger = commsLogger;
        this.mClientId = CommsInternal.getInstance().getClientID();
        okHttpClientWrapper.setOperationMetricNameRoot(str2);
    }
}
