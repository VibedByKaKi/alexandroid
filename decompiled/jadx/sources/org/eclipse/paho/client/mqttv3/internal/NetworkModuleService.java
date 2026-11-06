package org.eclipse.paho.client.mqttv3.internal;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.cookie.ClientCookie;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;
import org.eclipse.paho.client.mqttv3.spi.NetworkModuleFactory;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class NetworkModuleService {
    private static final int AUTH_GROUP_HOST = 3;
    private static final int AUTH_GROUP_PORT = 5;
    private static final int AUTH_GROUP_USERINFO = 2;
    private static Logger LOG = LoggerFactory.getLogger(LoggerFactory.MQTT_CLIENT_MSG_CAT, "NetworkModuleService");
    private static final ServiceLoader<NetworkModuleFactory> FACTORY_SERVICE_LOADER = ServiceLoader.load(NetworkModuleFactory.class, NetworkModuleService.class.getClassLoader());
    private static final Pattern AUTHORITY_PATTERN = Pattern.compile("((.+)@)?([^:]*)(:(\\d+))?");

    private NetworkModuleService() {
    }

    public static void applyRFC3986AuthorityPatch(URI uri) {
        if (uri == null || uri.getHost() != null || uri.getAuthority() == null || uri.getAuthority().isEmpty()) {
            return;
        }
        Matcher matcher = AUTHORITY_PATTERN.matcher(uri.getAuthority());
        if (matcher.find()) {
            setURIField(uri, "userInfo", matcher.group(2));
            setURIField(uri, "host", matcher.group(3));
            String group = matcher.group(5);
            setURIField(uri, ClientCookie.PORT_ATTR, Integer.valueOf(group != null ? Integer.parseInt(group) : -1));
        }
    }

    public static NetworkModule createInstance(String str, MqttConnectOptions mqttConnectOptions, String str2) throws MqttException, IllegalArgumentException {
        try {
            URI uri = new URI(str);
            applyRFC3986AuthorityPatch(uri);
            String lowerCase = uri.getScheme().toLowerCase();
            ServiceLoader<NetworkModuleFactory> serviceLoader = FACTORY_SERVICE_LOADER;
            synchronized (serviceLoader) {
                try {
                    Iterator<NetworkModuleFactory> it2 = serviceLoader.iterator();
                    while (it2.hasNext()) {
                        NetworkModuleFactory next = it2.next();
                        if (next.getSupportedUriSchemes().contains(lowerCase)) {
                            return next.createNetworkModule(uri, mqttConnectOptions, str2);
                        }
                    }
                    throw new IllegalArgumentException(uri.toString());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (URISyntaxException e) {
            Single$$ExternalSyntheticBUOutline0.m(str, e);
            return null;
        }
    }

    private static void setURIField(URI uri, String str, Object obj) {
        try {
            Field declaredField = URI.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(uri, obj);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e) {
            LOG.warning(NetworkModuleService.class.getName(), "setURIField", "115", new Object[]{uri.toString()}, e);
        }
    }

    public static void validateURI(String str) throws IllegalArgumentException {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme == null || scheme.isEmpty()) {
                throw new IllegalArgumentException("missing scheme in broker URI: " + str);
            }
            String lowerCase = scheme.toLowerCase();
            ServiceLoader<NetworkModuleFactory> serviceLoader = FACTORY_SERVICE_LOADER;
            synchronized (serviceLoader) {
                try {
                    Iterator<NetworkModuleFactory> it2 = serviceLoader.iterator();
                    while (it2.hasNext()) {
                        NetworkModuleFactory next = it2.next();
                        if (next.getSupportedUriSchemes().contains(lowerCase)) {
                            next.validateURI(uri);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("no NetworkModule installed for scheme \"" + lowerCase + "\" of URI \"" + str + DeviceConfigConstants.DOUBLE_QUOTE);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (URISyntaxException e) {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Can't parse string to URI \"", str, DeviceConfigConstants.DOUBLE_QUOTE), e);
        }
    }
}
