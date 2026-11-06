package org.eclipse.paho.client.mqttv3;

import java.util.Enumeration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface MqttClientPersistence extends AutoCloseable {
    void clear() throws MqttPersistenceException;

    @Override // java.lang.AutoCloseable
    void close() throws MqttPersistenceException;

    boolean containsKey(String str) throws MqttPersistenceException;

    MqttPersistable get(String str) throws MqttPersistenceException;

    Enumeration keys() throws MqttPersistenceException;

    void open(String str, String str2) throws MqttPersistenceException;

    void put(String str, MqttPersistable mqttPersistable) throws MqttPersistenceException;

    void remove(String str) throws MqttPersistenceException;
}
