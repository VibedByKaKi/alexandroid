package com.amazon.deecomms.common.network.acmsrecipes;

import com.amazon.alexa.app.notification.actions.NotificationActionConstants;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.calling.incallexperiences.model.TriggerActionResponse;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.network.ACMSClient;
import com.amazon.deecomms.common.network.AppUrl;
import com.amazon.deecomms.common.network.IHttpClient;
import com.amazon.deecomms.common.network.ServiceException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.text.MessageFormat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TriggerAction {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, TriggerAction.class);
    private final ACMSClient mClient = new ACMSClient(MetricKeys.OP_TRIGGER_ACTION);
    private String mRequestId;

    public String getRequestId() {
        return this.mRequestId;
    }

    public TriggerActionResponse triggerAction(String str, String str2, String str3) throws ServiceException {
        String format = MessageFormat.format(AppUrl.TRIGGER_ACTION, str2);
        LOG.d("Calling: " + format);
        IHttpClient.Request request = this.mClient.request(format);
        this.mRequestId = request.getRequestId();
        ObjectNode createObjectNode = new ObjectMapper().createObjectNode();
        createObjectNode.put("participantId", str);
        createObjectNode.put(NotificationActionConstants.ACTION_ID_KEY, str3);
        try {
            IHttpClient.Response execute = request.authenticatedAsCurrentCommsUser().postJson(createObjectNode).execute();
            try {
                TriggerActionResponse triggerActionResponse = (TriggerActionResponse) execute.convert(TriggerActionResponse.class);
                execute.close();
                return triggerActionResponse;
            } finally {
            }
        } catch (IOException e) {
            LOG.e("IO Exception while retrieving devices list", e);
            return null;
        }
    }
}
