package com.amazon.alexa.handsfree.protocols.wakewordsettings.connection;

import android.content.ServiceConnection;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class WakeWordSettingsServiceConnection implements ServiceConnection {
    public abstract void deregisterHandsFreeCapableApp(@NonNull String str, @NonNull ResultCallback resultCallback) throws RemoteException;

    public abstract void endConnection();

    public abstract List<String> getHandsFreeCapableAppList() throws RemoteException;

    public abstract String getLocale() throws Exception;

    public abstract String getPreferredAmazonApp() throws RemoteException;

    public abstract List<String> getSupportedLocales() throws Exception;

    public abstract Integer getWakeWordConfidenceThreshold() throws Exception;

    public abstract boolean isWakeWordRecognitionEnabled() throws Exception;

    public abstract void registerHandsFreeCapableApp(@NonNull String str, @NonNull ResultCallback resultCallback) throws RemoteException;

    public abstract void setLocale(@NonNull String str, @NonNull ResultCallback resultCallback) throws Exception;

    public abstract void setPreferredAmazonApp(@NonNull String str, @NonNull ResultCallback resultCallback) throws RemoteException;

    public abstract void setWakeWordConfidenceThreshold(@NonNull Integer num, @NonNull ResultCallback resultCallback) throws Exception;

    public abstract void setWakeWordRecognitionEnabled(boolean z, @NonNull ResultCallback resultCallback) throws Exception;

    public abstract void startConnection();
}
