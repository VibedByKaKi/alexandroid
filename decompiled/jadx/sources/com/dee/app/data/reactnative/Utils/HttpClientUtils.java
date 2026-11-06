package com.dee.app.data.reactnative.Utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.dee.app.data.reactnative.DataBlob;
import com.dee.app.data.reactnative.ElementsDataRequest;
import com.dee.app.data.reactnative.ElementsDataRequestAuthentication;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class HttpClientUtils {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ElementsBodyKey {
        public static final String COMPRESS = "compress";
        public static final String CONTENT_TYPE = "contentType";
        public static final String TEXT = "text";

        private ElementsBodyKey() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ElementsCacheKey {
        public static final String RETRIEVE = "retrieve";
        public static final String STORE = "store";
        public static final String TTL = "ttl";

        private ElementsCacheKey() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ElementsRequestKey {
        public static final String AUTH = "auth";
        public static final String AUTH_HEADER_KEY = "authHeaderKey";
        public static final String BEARER = "bearer";
        public static final String BODY = "body";
        public static final String CACHE = "cache";
        public static final String CONNECTION_TIMEOUT = "connection_timeout";
        public static final String DIRECTED_ID = "directedId";
        public static final String FORCE_REFRESH = "forceRefresh";
        public static final String HEADERS = "headers";
        public static final String MODULE = "module";
        public static final String OPERATION_NAME = "operationName";
        public static final String READ_TIMEOUT = "read_timeout";
        public static final String REQUEST_ID = "requestId";
        public static final String SINGLE_RESULT = "singleResult";
        public static final String SUPPRESS_BEARER = "suppressBearer";
        public static final String TYPE = "type";
        public static final String USE_DELEGATED_TOKEN = "useDelegatedToken";
        public static final String WEB = "web";

        private ElementsRequestKey() {
        }
    }

    private HttpClientUtils() {
    }

    @NonNull
    public static ElementsDataRequest createRequest(ElementsDataRequest.Method method, String str, ReadableMap readableMap) {
        ReadableMap map;
        ElementsDataRequest elementsDataRequest = new ElementsDataRequest();
        elementsDataRequest.id = readableMap.getString("requestId");
        elementsDataRequest.method = method;
        elementsDataRequest.uri = str;
        if (readableMap.hasKey(ElementsRequestKey.OPERATION_NAME)) {
            elementsDataRequest.operationName = readableMap.getString(ElementsRequestKey.OPERATION_NAME);
        }
        if (readableMap.hasKey("module")) {
            elementsDataRequest.domain = readableMap.getString("module");
        }
        ReadableMap map2 = readableMap.getMap("headers");
        if (map2 != null) {
            ReadableMapKeySetIterator keySetIterator = map2.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                elementsDataRequest.headers.put(nextKey, map2.getString(nextKey));
            }
        }
        if (readableMap.hasKey("body") && (map = readableMap.getMap("body")) != null) {
            String string = map.getString("text");
            if (map.hasKey(ElementsBodyKey.COMPRESS) && map.getBoolean(ElementsBodyKey.COMPRESS)) {
                elementsDataRequest.headers.put("gzipBody", "true");
            }
            elementsDataRequest.body = new DataBlob(string, map.getString("contentType"));
        }
        if (readableMap.hasKey(ElementsRequestKey.AUTH)) {
            ReadableMap map3 = readableMap.getMap(ElementsRequestKey.AUTH);
            String string2 = map3.getString("type");
            if ("web".equals(string2)) {
                elementsDataRequest.getAuth().type = ElementsDataRequestAuthentication.ELEMENTS_AUTH_HEADER_TYPE_COOKIES;
                if (map3.hasKey("directedId")) {
                    elementsDataRequest.getAuth().directedId = map3.getString("directedId");
                }
                if (map3.hasKey(ElementsRequestKey.FORCE_REFRESH)) {
                    elementsDataRequest.getAuth().forceRefresh = map3.getBoolean(ElementsRequestKey.FORCE_REFRESH);
                }
            } else if (ElementsRequestKey.BEARER.equals(string2)) {
                if (map3.hasKey(ElementsRequestKey.SUPPRESS_BEARER) && map3.getBoolean(ElementsRequestKey.SUPPRESS_BEARER)) {
                    elementsDataRequest.getAuth().type = ElementsDataRequestAuthentication.ELEMENTS_AUTH_HEADER_TYPE_PLAIN;
                } else {
                    elementsDataRequest.getAuth().type = ElementsDataRequestAuthentication.ELEMENTS_AUTH_HEADER_TYPE_BEARER;
                }
                if (map3.hasKey(ElementsRequestKey.AUTH_HEADER_KEY)) {
                    String string3 = map3.getString(ElementsRequestKey.AUTH_HEADER_KEY);
                    if (!TextUtils.isEmpty(string3)) {
                        elementsDataRequest.getAuth().authHeaderKey = string3;
                    }
                }
            }
            if (map3.hasKey(ElementsRequestKey.USE_DELEGATED_TOKEN) && map3.getBoolean(ElementsRequestKey.USE_DELEGATED_TOKEN)) {
                elementsDataRequest.getAuth().useDelegatedToken = true;
            }
        }
        if (readableMap.hasKey(ElementsRequestKey.SINGLE_RESULT)) {
            elementsDataRequest.singleResult = readableMap.getBoolean(ElementsRequestKey.SINGLE_RESULT);
        }
        if (readableMap.hasKey("cache")) {
            ReadableMap map4 = readableMap.getMap("cache");
            if (map4.hasKey("ttl")) {
                elementsDataRequest.cache.ttl = map4.getInt("ttl");
            }
            if (map4.hasKey(ElementsCacheKey.RETRIEVE)) {
                elementsDataRequest.cache.retrieve = map4.getBoolean(ElementsCacheKey.RETRIEVE);
            }
            if (map4.hasKey(ElementsCacheKey.STORE)) {
                elementsDataRequest.cache.store = map4.getBoolean(ElementsCacheKey.STORE);
            }
        }
        if (readableMap.hasKey(ElementsRequestKey.CONNECTION_TIMEOUT)) {
            elementsDataRequest.connectionTimeout = Integer.valueOf(readableMap.getInt(ElementsRequestKey.CONNECTION_TIMEOUT));
        }
        if (readableMap.hasKey(ElementsRequestKey.READ_TIMEOUT)) {
            elementsDataRequest.readTimeout = Integer.valueOf(readableMap.getInt(ElementsRequestKey.READ_TIMEOUT));
        }
        return elementsDataRequest;
    }
}
