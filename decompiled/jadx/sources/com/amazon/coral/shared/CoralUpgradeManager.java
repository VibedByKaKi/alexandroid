package com.amazon.coral.shared;

import defpackage.a$$ExternalSyntheticOutline0;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class CoralUpgradeManager {
    private static final ConcurrentMap<CacheKey, Boolean> HOST_CACHE = new ConcurrentHashMap();
    private static final ConcurrentMap<CacheKey, Boolean> SERVICE_CACHE = new ConcurrentHashMap();
    private static final CoralInternalLogger LOG = CoralInternalLoggerFactory.getLogger((Class<?>) CoralUpgradeManager.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CacheKey {
        private final String campaignId;
        private final String serviceName;
        private final double threshold;

        public CacheKey(String str, double d, String str2) {
            this.campaignId = str;
            this.threshold = d;
            this.serviceName = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CacheKey.class == obj.getClass()) {
                CacheKey cacheKey = (CacheKey) obj;
                if (Double.compare(cacheKey.threshold, this.threshold) == 0 && this.campaignId.equals(cacheKey.campaignId) && Objects.equals(this.serviceName, cacheKey.serviceName)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.campaignId, Double.valueOf(this.threshold), this.serviceName);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CacheKey{campaignId='");
            sb.append(this.campaignId);
            sb.append("', threshold=");
            sb.append(this.threshold);
            sb.append(", serviceName='");
            return a$$ExternalSyntheticOutline0.m(sb, this.serviceName, "'}");
        }
    }

    private CoralUpgradeManager() {
    }

    public static boolean currentHostShouldUpgrade(String str, double d) {
        CacheKey cacheKey = new CacheKey(str, d, null);
        ConcurrentMap<CacheKey, Boolean> concurrentMap = HOST_CACHE;
        Boolean bool = concurrentMap.get(cacheKey);
        return bool != null ? bool.booleanValue() : concurrentMap.computeIfAbsent(cacheKey, new CoralUpgradeManager$$ExternalSyntheticLambda0(1)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean currentHostShouldUpgrade0(CacheKey cacheKey) {
        String str = cacheKey.campaignId;
        double d = cacheKey.threshold;
        if (hasExplicitOverride(str)) {
            boolean explicitOverride = getExplicitOverride(str);
            LOG.info("Setting upgrade `{}` to `{}` due to explicit override", str, Boolean.valueOf(explicitOverride));
            return explicitOverride;
        }
        try {
            boolean randomDecision = randomDecision(str, d, InetAddress.getLocalHost().getAddress());
            LOG.info("Upgrade decision for `{}`: {}", cacheKey, Boolean.valueOf(randomDecision));
            return randomDecision;
        } catch (Throwable th) {
            LOG.error("Uncaught exception while deciding on upgrade `{}`", cacheKey, th);
            return false;
        }
    }

    public static boolean currentServiceShouldUpgrade(String str, double d, String str2) {
        CacheKey cacheKey = new CacheKey(str, d, str2);
        ConcurrentMap<CacheKey, Boolean> concurrentMap = SERVICE_CACHE;
        Boolean bool = concurrentMap.get(cacheKey);
        return bool != null ? bool.booleanValue() : concurrentMap.computeIfAbsent(cacheKey, new CoralUpgradeManager$$ExternalSyntheticLambda0(0)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean currentServiceShouldUpgrade0(CacheKey cacheKey) {
        try {
            boolean randomDecision = randomDecision(cacheKey.campaignId, cacheKey.threshold, cacheKey.serviceName.getBytes(StandardCharsets.UTF_8));
            LOG.info("Upgrade decision for `{}`: {}", cacheKey, Boolean.valueOf(randomDecision));
            return randomDecision;
        } catch (Throwable th) {
            LOG.error("Uncaught exception while deciding on upgrade `{}`", cacheKey, th);
            return false;
        }
    }

    public static boolean getExplicitOverride(String str) {
        return "ALWAYS".equalsIgnoreCase(System.getProperty(str));
    }

    public static boolean hasExplicitOverride(String str) {
        return System.getProperty(str) != null;
    }

    public static boolean randomDecision(String str, double d, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            messageDigest.update(bArr);
            return new Random(ByteBuffer.wrap(messageDigest.digest()).getLong()).nextDouble() < d;
        } catch (NoSuchAlgorithmException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m$2();
            return false;
        }
    }
}
