package com.amazon.deecomms.contacts.util;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.api.CommsIdentityManager;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.network.ACMSClient;
import com.amazon.deecomms.common.network.AppUrl;
import com.amazon.deecomms.common.network.IHttpClient;
import com.amazon.deecomms.common.network.ServiceException;
import com.amazon.deecomms.contacts.database.ContactEntry;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import java.text.MessageFormat;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ContactStatusManager {
    private static final String CONTACT_BLOCK_STATUS = "contactBlockStatus";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ContactStatusManager.class);
    private static final String MEDIA_TYPE = "application/json";

    @Inject
    CommsIdentityManager commsIdentityManager;

    @Inject
    Context context;
    private final ACMSClient mACMSClient;

    public ContactStatusManager() {
        CommsDaggerWrapper.getComponent().inject(this);
        this.mACMSClient = new ACMSClient(MetricKeys.OP_SET_CONTACT_BLOCK_STATUS);
    }

    public boolean setBlockStatus(@NonNull String str, boolean z, boolean z2) {
        if (!this.commsIdentityManager.isCommsIdPopulated("ContactStatusManager.setBlockStatus", false)) {
            LOG.e("Identity not present");
            return false;
        }
        if (z2) {
            ContactEntry fetchContactEntryForCommId = ContactsProviderUtils.fetchContactEntryForCommId(this.context, str);
            if (fetchContactEntryForCommId != null) {
                ContactsProviderUtils.updateContactBlockStatus(this.context, fetchContactEntryForCommId.getId(), z);
            } else {
                LOG.w("Contact is not present locally, cannot update local status.");
            }
        }
        CommsLogger commsLogger = LOG;
        commsLogger.i("Setting block status (" + z + "), commsId: " + commsLogger.sensitive(str));
        String format = MessageFormat.format(AppUrl.GET_OR_CREATE_URL, this.commsIdentityManager.getCommsId("ContactStatusManager.setBlockStatus", false), str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CONTACT_BLOCK_STATUS, z);
            IHttpClient.Response execute = this.mACMSClient.request(format).authenticatedAsCurrentCommsUser().patch("application/json", jSONObject.toString().getBytes()).execute();
            if (execute.code() < 200 || execute.code() >= 300) {
                commsLogger.w("Received setContactBlockStatus status code: " + execute.code());
                return false;
            }
            commsLogger.d("setContactBlockStatus returned success " + execute.code());
            return true;
        } catch (ServiceException e) {
            LOG.e("Patch failed", e);
            return false;
        } catch (JSONException e2) {
            LOG.e("Unable to create json body", e2);
            return false;
        }
    }

    public boolean setBlockStatus(@NonNull String str, boolean z) {
        return setBlockStatus(str, z, true);
    }
}
