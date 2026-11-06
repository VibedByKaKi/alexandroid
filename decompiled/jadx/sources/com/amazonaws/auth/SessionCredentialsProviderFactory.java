package com.amazonaws.auth;

import com.amazonaws.ClientConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SessionCredentialsProviderFactory {
    private static final Map<Key, STSSessionCredentialsProvider> cache = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Key {
        private final String awsAccessKeyId;
        private final String serviceEndpoint;

        public Key(String str, String str2) {
            this.awsAccessKeyId = str;
            this.serviceEndpoint = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Key.class != obj.getClass()) {
                return false;
            }
            Key key = (Key) obj;
            String str = this.awsAccessKeyId;
            String str2 = key.awsAccessKeyId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.serviceEndpoint;
            String str4 = key.serviceEndpoint;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.awsAccessKeyId;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            String str2 = this.serviceEndpoint;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public static synchronized STSSessionCredentialsProvider getSessionCredentialsProvider(AWSCredentials aWSCredentials, String str, ClientConfiguration clientConfiguration) {
        STSSessionCredentialsProvider sTSSessionCredentialsProvider;
        synchronized (SessionCredentialsProviderFactory.class) {
            try {
                Key key = new Key(aWSCredentials.getAWSAccessKeyId(), str);
                Map<Key, STSSessionCredentialsProvider> map = cache;
                if (!map.containsKey(key)) {
                    map.put(key, new STSSessionCredentialsProvider(aWSCredentials, clientConfiguration));
                }
                sTSSessionCredentialsProvider = map.get(key);
            } catch (Throwable th) {
                throw th;
            }
        }
        return sTSSessionCredentialsProvider;
    }
}
