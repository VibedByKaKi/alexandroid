package com.amazon.deecomms.common.network.acmsrecipes;

import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.calling.model.CallingMetricsModel;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.ACMSClient;
import com.amazon.deecomms.common.network.AppUrl;
import com.amazon.deecomms.common.network.ServiceException;
import java.text.MessageFormat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CaptureCallingMetrics {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CaptureCallingMetrics.class);
    private final ACMSClient client = new ACMSClient("comms.api.bizmetrics.calling.capture");

    public String execute(String str, CallingMetricsModel callingMetricsModel) throws ServiceException {
        if (str == null || callingMetricsModel == null) {
            return null;
        }
        LOG.d("Sending calling metrics for " + callingMetricsModel.getCallId());
        return this.client.request(MessageFormat.format(AppUrl.CAPTURE_CALLING_BIZ_METRICS, str)).authenticatedAsCurrentCommsUser().postJson(callingMetricsModel).execute().getBody();
    }

    public String executeSwallowException(String str, CallingMetricsModel callingMetricsModel) {
        try {
            return execute(str, callingMetricsModel);
        } catch (ServiceException e) {
            LOG.e("Error while CaptureCallingMetrics", e);
            return null;
        }
    }
}
