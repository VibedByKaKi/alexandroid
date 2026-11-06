package com.facebook.cache.common;

import com.facebook.common.util.SecureHashUtil;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/facebook/cache/common/CacheKeyUtil;", "", "<init>", "()V", "getResourceIds", "", "", "key", "Lcom/facebook/cache/common/CacheKey;", "getFirstResourceId", "secureHashKey", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheKeyUtil {

    @NotNull
    public static final CacheKeyUtil INSTANCE = new CacheKeyUtil();

    private CacheKeyUtil() {
    }

    @JvmStatic
    @NotNull
    public static final String getFirstResourceId(@NotNull CacheKey key) {
        key.getClass();
        try {
            if (!(key instanceof MultiCacheKey)) {
                return INSTANCE.secureHashKey(key);
            }
            List<CacheKey> cacheKeys = ((MultiCacheKey) key).getCacheKeys();
            cacheKeys.getClass();
            CacheKeyUtil cacheKeyUtil = INSTANCE;
            CacheKey cacheKey = cacheKeys.get(0);
            cacheKey.getClass();
            return cacheKeyUtil.secureHashKey(cacheKey);
        } catch (UnsupportedEncodingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final List<String> getResourceIds(@NotNull CacheKey key) {
        key.getClass();
        try {
            if (!(key instanceof MultiCacheKey)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.isResourceIdForDebugging() ? key.getUriString() : INSTANCE.secureHashKey(key));
                return arrayList;
            }
            List<CacheKey> cacheKeys = ((MultiCacheKey) key).getCacheKeys();
            cacheKeys.getClass();
            ArrayList arrayList2 = new ArrayList(cacheKeys.size());
            int size = cacheKeys.size();
            for (int i = 0; i < size; i++) {
                CacheKeyUtil cacheKeyUtil = INSTANCE;
                CacheKey cacheKey = cacheKeys.get(i);
                cacheKey.getClass();
                arrayList2.add(cacheKeyUtil.secureHashKey(cacheKey));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    private final String secureHashKey(CacheKey key) throws UnsupportedEncodingException {
        String uriString = key.getUriString();
        uriString.getClass();
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        byte[] bytes = uriString.getBytes(forName);
        bytes.getClass();
        String makeSHA1HashBase64 = SecureHashUtil.makeSHA1HashBase64(bytes);
        makeSHA1HashBase64.getClass();
        return makeSHA1HashBase64;
    }
}
