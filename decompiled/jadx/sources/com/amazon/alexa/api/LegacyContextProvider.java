package com.amazon.alexa.api;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class LegacyContextProvider implements AlexaContextsProvider {
    private final AlexaContextProviderProxy alexaContextProviderProxy;

    public LegacyContextProvider(AlexaContextProviderProxy alexaContextProviderProxy) {
        this.alexaContextProviderProxy = alexaContextProviderProxy;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LegacyContextProvider) && getBinder().equals(((LegacyContextProvider) obj).getBinder());
        }
        return true;
    }

    @Override // com.amazon.alexa.api.AlexaContextsProvider
    public Set<AlexaContext> getAlexaContexts() {
        try {
            return Collections.singleton(this.alexaContextProviderProxy.getAlexaContext());
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.EMPTY_SET;
        }
    }

    public IBinder getBinder() {
        return this.alexaContextProviderProxy.asBinder();
    }

    public int hashCode() {
        return Objects.hashCode(getBinder());
    }
}
