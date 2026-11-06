package org.apache.thrift.orig.transport.sasl;

import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import org.apache.thrift.orig.transport.TTransportException;
import org.apache.thrift.orig.transport.sasl.TSaslNegotiationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ServerSaslPeer implements SaslPeer {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) ServerSaslPeer.class);
    private static final String QOP_AUTH_CONF = "auth-conf";
    private static final String QOP_AUTH_INT = "auth-int";
    private final SaslServer saslServer;

    public ServerSaslPeer(SaslServer saslServer) {
        this.saslServer = saslServer;
    }

    @Override // org.apache.thrift.orig.transport.sasl.SaslPeer
    public void dispose() {
        try {
            this.saslServer.dispose();
        } catch (Exception e) {
            LOGGER.warn("Failed to close sasl server " + this.saslServer.getMechanismName(), (Throwable) e);
        }
    }

    @Override // org.apache.thrift.orig.transport.sasl.SaslPeer
    public byte[] evaluate(byte[] bArr) throws TSaslNegotiationException {
        try {
            return this.saslServer.evaluateResponse(bArr);
        } catch (SaslException e) {
            throw new TSaslNegotiationException(TSaslNegotiationException.ErrorType.AUTHENTICATION_FAILURE, "Authentication failed with " + this.saslServer.getMechanismName(), e);
        }
    }

    public SaslServer getSaslServer() {
        return this.saslServer;
    }

    @Override // org.apache.thrift.orig.transport.sasl.SaslPeer
    public boolean isAuthenticated() {
        return this.saslServer.isComplete();
    }

    @Override // org.apache.thrift.orig.transport.sasl.SaslPeer
    public boolean isDataProtected() {
        Object negotiatedProperty = this.saslServer.getNegotiatedProperty("javax.security.sasl.qop");
        if (negotiatedProperty == null) {
            return false;
        }
        for (String str : negotiatedProperty.toString().split("\\s*,\\s*")) {
            String lowerCase = str.toLowerCase();
            if (QOP_AUTH_INT.equals(lowerCase) || QOP_AUTH_CONF.equals(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.thrift.orig.transport.sasl.SaslPeer
    public byte[] unwrap(byte[] bArr, int i, int i2) throws TTransportException {
        try {
            return this.saslServer.unwrap(bArr, i, i2);
        } catch (SaslException e) {
            throw new TTransportException(5, "Failed to unwrap data", e);
        }
    }

    @Override // org.apache.thrift.orig.transport.sasl.SaslPeer
    public byte[] wrap(byte[] bArr, int i, int i2) throws TTransportException {
        try {
            return this.saslServer.wrap(bArr, i, i2);
        } catch (SaslException e) {
            throw new TTransportException("Failed to wrap data", (Throwable) e);
        }
    }
}
