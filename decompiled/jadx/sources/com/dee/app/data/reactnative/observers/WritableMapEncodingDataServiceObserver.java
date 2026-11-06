package com.dee.app.data.reactnative.observers;

import com.dee.app.data.reactnative.ElementsDataRequest;
import com.dee.app.data.reactnative.ElementsDataResponse;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import rx.Observer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class WritableMapEncodingDataServiceObserver implements Observer<ElementsDataResponse> {
    private static final String TAG = "WritableMapEncodingDataServiceObserver";
    private final Observer<WritableMap> observer;
    private final ElementsDataRequest request;
    private final long startTimestamp = System.currentTimeMillis();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ElementsResponseKey {
        public static final String CONTENT_TYPE = "contentType";
        public static final String DATA = "data";
        public static final String HTTP = "http";
        public static final String REQUEST_ID = "requestId";
        public static final String STATUS = "status";
        public static final String STATUS_TEXT = "statusText";
        public static final String TEXT = "text";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE = "type";
        public static final String URI = "uri";

        private ElementsResponseKey() {
        }
    }

    public WritableMapEncodingDataServiceObserver(ElementsDataRequest elementsDataRequest, Observer<WritableMap> observer) {
        this.request = elementsDataRequest;
        this.observer = observer;
    }

    private static WritableMap serializeResponse(ElementsDataResponse elementsDataResponse) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("requestId", elementsDataResponse.id);
        writableNativeMap.putString("type", "data");
        if (elementsDataResponse.data != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("contentType", elementsDataResponse.data.contentType);
            writableNativeMap2.putString("text", elementsDataResponse.data.text);
            writableNativeMap.putMap("data", writableNativeMap2);
        }
        if (elementsDataResponse.cacheMetadata != null) {
            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
            writableNativeMap3.putDouble("timestamp", elementsDataResponse.cacheMetadata.timestamp);
            writableNativeMap.putMap("cache", writableNativeMap3);
        }
        WritableNativeMap writableNativeMap4 = new WritableNativeMap();
        writableNativeMap4.putInt("status", elementsDataResponse.statusCode);
        writableNativeMap4.putString(ElementsResponseKey.STATUS_TEXT, elementsDataResponse.statusText);
        writableNativeMap4.putString("uri", elementsDataResponse.uri);
        WritableNativeMap writableNativeMap5 = new WritableNativeMap();
        Map<String, String> map = elementsDataResponse.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writableNativeMap5.putString(entry.getKey(), entry.getValue());
            }
        }
        writableNativeMap4.putMap("headers", writableNativeMap5);
        writableNativeMap.putMap("http", writableNativeMap4);
        return writableNativeMap;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.observer.onCompleted();
        System.currentTimeMillis();
        String str = this.request.uri;
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.observer.onError(th);
        String str = this.request.uri;
        th.getMessage();
    }

    @Override // rx.Observer
    public void onNext(ElementsDataResponse elementsDataResponse) {
        this.observer.onNext(serializeResponse(elementsDataResponse));
        System.currentTimeMillis();
        String str = this.request.uri;
        Boolean.toString(elementsDataResponse.cacheMetadata != null);
        Thread.currentThread().getName();
    }
}
