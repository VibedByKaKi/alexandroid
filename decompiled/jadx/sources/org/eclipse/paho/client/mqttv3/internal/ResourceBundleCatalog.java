package org.eclipse.paho.client.mqttv3.internal;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ResourceBundleCatalog extends MessageCatalog {
    private ResourceBundle bundle = ResourceBundle.getBundle("org.eclipse.paho.client.mqttv3.internal.nls.messages");

    @Override // org.eclipse.paho.client.mqttv3.internal.MessageCatalog
    public String getLocalizedMessage(int i) {
        try {
            return this.bundle.getString(Integer.toString(i));
        } catch (MissingResourceException unused) {
            return "MqttException";
        }
    }
}
