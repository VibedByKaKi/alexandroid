package com.amazon.deecomms.common.network.acmsrecipes;

import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.calling.model.CallQualityMetricsModel;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.ACMSClient;
import com.amazon.deecomms.common.network.AppUrl;
import com.amazon.deecomms.common.network.ServiceException;
import java.text.MessageFormat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CaptureCallQualityMetrics {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CaptureCallQualityMetrics.class);
    private final ACMSClient client = new ACMSClient("comms.api.bizmetrics.callQuality.capture");

    public String execute(String str, CallQualityMetricsModel callQualityMetricsModel) throws ServiceException {
        if (str == null || callQualityMetricsModel == null) {
            return null;
        }
        LOG.d("Sending call quality metrics for " + callQualityMetricsModel.getCallId());
        return this.client.request(MessageFormat.format(AppUrl.CAPTURE_CALL_QUALITY_BIZ_METRICS, str)).authenticatedAsCurrentCommsUser().postJson(callQualityMetricsModel).execute().getBody();
    }

    public String executeSwallowException(String str, CallQualityMetricsModel callQualityMetricsModel) {
        try {
            return execute(str, callQualityMetricsModel);
        } catch (ServiceException e) {
            LOG.e("Error while CaptureCallQualityMetrics", e);
            return null;
        }
    }
}
