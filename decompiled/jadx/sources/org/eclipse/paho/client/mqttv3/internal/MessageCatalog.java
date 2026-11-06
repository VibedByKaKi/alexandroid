package org.eclipse.paho.client.mqttv3.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class MessageCatalog {
    private static MessageCatalog INSTANCE;

    public static final String getMessage(int i) {
        if (INSTANCE == null) {
            if (ExceptionHelper.isClassAvailable("java.util.ResourceBundle")) {
                try {
                    INSTANCE = (MessageCatalog) ResourceBundleCatalog.class.newInstance();
                } catch (Exception unused) {
                    return "";
                }
            } else if (ExceptionHelper.isClassAvailable("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog")) {
                try {
                    INSTANCE = (MessageCatalog) Class.forName("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog").newInstance();
                } catch (Exception unused2) {
                    return "";
                }
            }
        }
        return INSTANCE.getLocalizedMessage(i);
    }

    public abstract String getLocalizedMessage(int i);
}
