package com.amazon.deecomms.calling.controller;

import android.os.AsyncTask;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.calling.enums.EnhancedProcessingState;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.ServiceException;
import com.amazon.deecomms.common.network.acmsrecipes.GetMpuEnabled;
import com.amazon.deecomms.common.sip.SipClientState;
import com.amazon.deecomms.settings.IdentityPreferencesProvider;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MPUSettingHandler extends AsyncTask<Void, Void, Void> {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, MPUSettingHandler.class);
    private String callProvider;
    private String callerHGId;
    private GetMpuEnabled getMpuEnabled;
    private List<String> operations;
    private IdentityPreferencesProvider provider;
    private String remoteParticipantID;
    private Runnable runnable;
    private SipClientState sipClientState;

    public MPUSettingHandler(@NonNull String str, @NonNull SipClientState sipClientState, @NonNull List<String> list, @NonNull Runnable runnable) {
        this.callerHGId = str;
        this.sipClientState = sipClientState;
        this.runnable = runnable;
        this.operations = list;
        this.getMpuEnabled = this.getMpuEnabled;
        this.callProvider = this.callProvider;
        this.remoteParticipantID = this.remoteParticipantID;
        this.provider = new IdentityPreferencesProvider(IdentityPreferencesProvider.AuthenticationType.AS_COMMS_USER);
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void... voidArr) {
        String str;
        for (String str2 : this.operations) {
            try {
                if (Constants.GET_SETTING.equalsIgnoreCase(str2)) {
                    boolean parseBoolean = Boolean.parseBoolean(this.provider.get(this.callerHGId, "mpu_enabled"));
                    LOG.i("MPU Setting is " + parseBoolean);
                    this.sipClientState.setEnhancedProcessingSetting(parseBoolean);
                } else if (Constants.GET_MPU_ENABLED.equalsIgnoreCase(str2)) {
                    String str3 = this.remoteParticipantID;
                    if (str3 != null && (str = this.callProvider) != null && this.getMpuEnabled.getMpuEnabled(str3, str).isEnabled()) {
                        LOG.i("MPU should be used for the call");
                        this.sipClientState.setSrtpKey("DTLS");
                        this.sipClientState.setEnhancedProcessingState(EnhancedProcessingState.ON);
                    }
                } else if (Constants.SET_SETTING.equalsIgnoreCase(str2)) {
                    this.provider.set(this.callerHGId, "mpu_enabled", Boolean.TRUE);
                }
            } catch (ServiceException unused) {
                LOG.e("Error occurred while retrieving MPU settings");
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r1) {
        this.runnable.run();
    }

    public MPUSettingHandler(@NonNull String str, @NonNull SipClientState sipClientState, @NonNull List<String> list, @NonNull String str2, @NonNull String str3, @NonNull Runnable runnable) {
        this.callerHGId = str;
        this.sipClientState = sipClientState;
        this.runnable = runnable;
        this.operations = list;
        this.getMpuEnabled = new GetMpuEnabled();
        this.callProvider = str3;
        this.remoteParticipantID = str2;
        this.provider = new IdentityPreferencesProvider(IdentityPreferencesProvider.AuthenticationType.AS_COMMS_USER);
    }

    public MPUSettingHandler(@NonNull String str, @NonNull SipClientState sipClientState, @NonNull List<String> list, @NonNull String str2, @NonNull String str3, @NonNull GetMpuEnabled getMpuEnabled, @NonNull Runnable runnable) {
        this.callerHGId = str;
        this.sipClientState = sipClientState;
        this.runnable = runnable;
        this.operations = list;
        this.getMpuEnabled = getMpuEnabled;
        this.callProvider = str3;
        this.remoteParticipantID = str2;
        this.provider = new IdentityPreferencesProvider(IdentityPreferencesProvider.AuthenticationType.AS_COMMS_USER);
    }

    public MPUSettingHandler(@NonNull String str, @NonNull SipClientState sipClientState, @NonNull Runnable runnable, @NonNull List<String> list, @NonNull IdentityPreferencesProvider identityPreferencesProvider) {
        this.callerHGId = str;
        this.sipClientState = sipClientState;
        this.runnable = runnable;
        this.operations = list;
        this.provider = identityPreferencesProvider;
    }
}
