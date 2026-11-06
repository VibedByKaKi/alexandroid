package org.eclipse.paho.client.mqttv3.spi;

import java.net.URI;
import java.util.Set;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.internal.NetworkModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface NetworkModuleFactory {
    NetworkModule createNetworkModule(URI uri, MqttConnectOptions mqttConnectOptions, String str) throws MqttException;

    Set<String> getSupportedUriSchemes();

    void validateURI(URI uri) throws IllegalArgumentException;
}
