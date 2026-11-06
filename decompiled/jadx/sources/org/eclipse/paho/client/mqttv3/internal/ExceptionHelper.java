package org.eclipse.paho.client.mqttv3.internal;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ExceptionHelper {
    private ExceptionHelper() {
    }

    public static MqttException createMqttException(Throwable th) {
        return th.getClass().getName().equals("java.security.GeneralSecurityException") ? new MqttSecurityException(th) : new MqttException(th);
    }

    public static boolean isClassAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static MqttException createMqttException(int i) {
        if (i != 4 && i != 5) {
            return new MqttException(i);
        }
        return new MqttSecurityException(i);
    }
}
