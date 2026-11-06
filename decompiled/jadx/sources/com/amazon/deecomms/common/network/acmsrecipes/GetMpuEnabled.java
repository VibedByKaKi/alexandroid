package com.amazon.deecomms.common.network.acmsrecipes;

import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.calling.model.GetMPUEnabledModel;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.common.network.ACMSClient;
import com.amazon.deecomms.common.network.AppUrl;
import com.amazon.deecomms.common.network.IHttpClient;
import com.amazon.deecomms.common.network.ServiceException;
import java.io.IOException;
import java.text.MessageFormat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GetMpuEnabled {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, GetMpuEnabled.class);
    private final ACMSClient mClient = new ACMSClient("comms.api.calling.getMPUEnabled");
    private String mRequestId;

    public GetMPUEnabledModel getMpuEnabled(@NonNull String str, @NonNull String str2) throws ServiceException {
        IHttpClient.Request request = this.mClient.request(MessageFormat.format(AppUrl.MPU_ENABLED, str, str2));
        this.mRequestId = request.getRequestId();
        try {
            IHttpClient.Response execute = request.authenticatedAsCurrentCommsUser().get().execute();
            try {
                GetMPUEnabledModel getMPUEnabledModel = (GetMPUEnabledModel) execute.convert(GetMPUEnabledModel.class);
                execute.close();
                return getMPUEnabledModel;
            } finally {
            }
        } catch (IOException unused) {
            LOG.e("IO Exception while retrieving MPU Enabled status");
            MetricsHelper.recordSingleOccurrenceOperational("comms.api.calling.getMPUEnabled.ioexception");
            return null;
        }
    }

    public String getRequestId() {
        return this.mRequestId;
    }
}
