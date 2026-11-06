package com.amazon.deecomms.common.network.acmsrecipes;

import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.ACMSClient;
import com.amazon.deecomms.common.network.AppUrl;
import com.amazon.deecomms.common.network.ServiceException;
import java.text.MessageFormat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DeregisterForPushNotifications {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, DeregisterForPushNotifications.class);
    private final ACMSClient client;

    public DeregisterForPushNotifications(String str) {
        this.client = new ACMSClient(str);
    }

    public String execute(String str, String str2, String str3) throws ServiceException {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        return this.client.request(MessageFormat.format(AppUrl.PUSH_NOTIFICATION_DEREGISTER, str, str2, str3)).authenticatedAsCurrentCommsUser().delete().execute().getBody();
    }

    public String executeSwallowException(String str, String str2, String str3) {
        try {
            return execute(str, str2, str3);
        } catch (ServiceException e) {
            LOG.e("Error while DeregisterForPushNotifications", e);
            return null;
        }
    }
}
