package org.apache.thrift.orig.transport.sasl;

import java.util.Map;
import javax.security.auth.callback.CallbackHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TSaslServerDefinition {
    public final CallbackHandler cbh;
    public final String mechanism;
    public final Map<String, String> props;
    public final String protocol;
    public final String serverName;

    public TSaslServerDefinition(String str, String str2, String str3, Map<String, String> map, CallbackHandler callbackHandler) {
        this.mechanism = str;
        this.protocol = str2;
        this.serverName = str3;
        this.props = map;
        this.cbh = callbackHandler;
    }
}
