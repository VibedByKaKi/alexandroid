package org.eclipse.paho.client.mqttv3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MqttPersistenceException extends MqttException {
    public static final short REASON_CODE_PERSISTENCE_IN_USE = 32200;
    private static final long serialVersionUID = 300;

    public MqttPersistenceException() {
        super(0);
    }

    public MqttPersistenceException(int i) {
        super(i);
    }

    public MqttPersistenceException(Throwable th) {
        super(th);
    }

    public MqttPersistenceException(int i, Throwable th) {
        super(i, th);
    }
}
