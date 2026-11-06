package org.apache.thrift.orig.transport.sasl;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.Sasl;
import javax.security.sasl.SaslException;
import org.apache.thrift.orig.transport.sasl.TSaslNegotiationException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TSaslServerFactory {
    private final Map<String, TSaslServerDefinition> saslMechanisms = new HashMap();

    public void addSaslMechanism(String str, String str2, String str3, Map<String, String> map, CallbackHandler callbackHandler) {
        TSaslServerDefinition tSaslServerDefinition = new TSaslServerDefinition(str, str2, str3, map, callbackHandler);
        this.saslMechanisms.put(tSaslServerDefinition.mechanism, tSaslServerDefinition);
    }

    public ServerSaslPeer getSaslPeer(String str) throws TSaslNegotiationException {
        if (!this.saslMechanisms.containsKey(str)) {
            throw new TSaslNegotiationException(TSaslNegotiationException.ErrorType.MECHANISME_MISMATCH, a$$ExternalSyntheticOutline0.m("Unsupported mechanism ", str));
        }
        TSaslServerDefinition tSaslServerDefinition = this.saslMechanisms.get(str);
        try {
            return new ServerSaslPeer(Sasl.createSaslServer(tSaslServerDefinition.mechanism, tSaslServerDefinition.protocol, tSaslServerDefinition.serverName, tSaslServerDefinition.props, tSaslServerDefinition.cbh));
        } catch (SaslException e) {
            throw new TSaslNegotiationException(TSaslNegotiationException.ErrorType.PROTOCOL_ERROR, a$$ExternalSyntheticOutline0.m("Fail to create sasl server ", str), e);
        }
    }
}
