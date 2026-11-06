package org.eclipse.paho.client.mqttv3;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.UnsupportedEncodingException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.eclipse.paho.client.mqttv3.internal.ClientComms;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPublish;
import org.eclipse.paho.client.mqttv3.util.Strings;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MqttTopic {
    private static final int MAX_TOPIC_LEN = 65535;
    private static final int MIN_TOPIC_LEN = 1;
    public static final String MULTI_LEVEL_WILDCARD = "#";
    public static final String MULTI_LEVEL_WILDCARD_PATTERN = "/#";
    private static final char NUL = 0;
    public static final String SINGLE_LEVEL_WILDCARD = "+";
    public static final String TOPIC_LEVEL_SEPARATOR = "/";
    public static final String TOPIC_WILDCARDS = "#+";
    private ClientComms comms;
    private String name;

    public MqttTopic(String str, ClientComms clientComms) {
        this.comms = clientComms;
        this.name = str;
    }

    private MqttPublish createPublish(MqttMessage mqttMessage) {
        return new MqttPublish(getName(), mqttMessage);
    }

    public static boolean isMatched(String str, String str2) throws IllegalArgumentException {
        int length = str2.length();
        int length2 = str.length();
        validate(str, true);
        validate(str2, false);
        if (str.equals(str2)) {
            return true;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length2 || i2 >= length) {
                break;
            }
            if (str.charAt(i) != '#') {
                if ((str2.charAt(i2) == '/' && str.charAt(i) != '/') || (str.charAt(i) != '+' && str.charAt(i) != '#' && str.charAt(i) != str2.charAt(i2))) {
                    break;
                }
                if (str.charAt(i) == '+') {
                    int i3 = i2 + 1;
                    while (i3 < length && str2.charAt(i3) != '/') {
                        i3 = i2 + 2;
                        i2++;
                    }
                }
                i++;
                i2++;
            } else {
                i2 = length;
                i = length2;
                break;
            }
        }
        if (i2 == length && i == length2) {
            return true;
        }
        if (str.length() - i > 0 && i2 == length) {
            if (str2.charAt(i2 - 1) == '/' && str.charAt(i) == '#') {
                return true;
            }
            if (str.length() - i > 1 && str.substring(i, i + 2).equals(MULTI_LEVEL_WILDCARD_PATTERN)) {
                return true;
            }
        }
        return false;
    }

    public static void validate(String str, boolean z) throws IllegalArgumentException {
        try {
            int length = str.getBytes("UTF-8").length;
            if (length < 1 || length > 65535) {
                Buffer$$ExternalSyntheticBUOutline0.m("Invalid topic length, should be in range[%d, %d]!", new Object[]{1, 65535});
                return;
            }
            if (!z) {
                if (Strings.containsAny(str, TOPIC_WILDCARDS)) {
                    Single$$ExternalSyntheticBUOutline0.m$3("The topic name MUST NOT contain any wildcard characters (#+)");
                }
            } else {
                if (Strings.equalsAny(str, new String[]{"#", "+"})) {
                    return;
                }
                if (Strings.countMatches(str, "#") > 1 || (str.contains("#") && !str.endsWith(MULTI_LEVEL_WILDCARD_PATTERN))) {
                    Single$$ExternalSyntheticBUOutline0.m$3("Invalid usage of multi-level wildcard in topic string: ".concat(str));
                } else {
                    validateSingleLevelWildcard(str);
                }
            }
        } catch (UnsupportedEncodingException e) {
            Single$$ExternalSyntheticBUOutline0.m$2(e.getMessage());
        }
    }

    private static void validateSingleLevelWildcard(String str) {
        char charAt = "+".charAt(0);
        char charAt2 = "/".charAt(0);
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        while (i < length) {
            int i2 = i - 1;
            char c = i2 >= 0 ? charArray[i2] : (char) 0;
            int i3 = i + 1;
            char c2 = i3 < length ? charArray[i3] : (char) 0;
            if (charArray[i] == charAt && ((c != charAt2 && c != 0) || (c2 != charAt2 && c2 != 0))) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid usage of single-level wildcard in topic string '", str, "'!"));
                return;
            }
            i = i3;
        }
    }

    public String getName() {
        return this.name;
    }

    public MqttDeliveryToken publish(MqttMessage mqttMessage) throws MqttException, MqttPersistenceException {
        MqttDeliveryToken mqttDeliveryToken = new MqttDeliveryToken(this.comms.getClient().getClientId());
        mqttDeliveryToken.setMessage(mqttMessage);
        this.comms.sendNoWait(createPublish(mqttMessage), mqttDeliveryToken);
        mqttDeliveryToken.internalTok.waitUntilSent();
        return mqttDeliveryToken;
    }

    public String toString() {
        return getName();
    }

    public MqttDeliveryToken publish(byte[] bArr, int i, boolean z) throws MqttException, MqttPersistenceException {
        MqttMessage mqttMessage = new MqttMessage(bArr);
        mqttMessage.setQos(i);
        mqttMessage.setRetained(z);
        return publish(mqttMessage);
    }
}
