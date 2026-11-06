package com.amazon.apl.viewhost.internal;

import com.amazon.apl.devtools.enums.DTNetworkRequestType;
import com.amazon.apl.devtools.models.network.IDTNetworkRequestHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class DTNetworkRequestManager implements IDTNetworkRequestHandler {
    private IDTNetworkRequestHandler mDTNetworkRequestHandler;
    private final List<NetworkRequestInfo> mNetworkRequests = new ArrayList();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EventType {
        REQUEST_WILL_BE_SENT,
        LOADING_FINISHED,
        LOADING_FAILED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NetworkRequestInfo {
        private int mEncodedDataLength;
        private final EventType mEventType;
        private final int mRequestId;
        private final double mTimestamp;
        private String mUrl;

        public NetworkRequestInfo(int i, double d, EventType eventType) {
            this.mRequestId = i;
            this.mTimestamp = d;
            this.mEventType = eventType;
        }

        public int getEncodedDataLength() {
            return this.mEncodedDataLength;
        }

        public EventType getEventType() {
            return this.mEventType;
        }

        public int getRequestId() {
            return this.mRequestId;
        }

        public double getTimestamp() {
            return this.mTimestamp;
        }

        public String getUrl() {
            return this.mUrl;
        }

        public NetworkRequestInfo setEncodedDataLength(int i) {
            this.mEncodedDataLength = i;
            return this;
        }

        public NetworkRequestInfo setUrl(String str) {
            this.mUrl = str;
            return this;
        }
    }

    private void reportAndClearCachedNetworkEvents() {
        for (NetworkRequestInfo networkRequestInfo : this.mNetworkRequests) {
            int requestId = networkRequestInfo.getRequestId();
            double timestamp = networkRequestInfo.getTimestamp();
            String url = networkRequestInfo.getUrl();
            EventType eventType = networkRequestInfo.getEventType();
            if (EventType.REQUEST_WILL_BE_SENT.equals(eventType)) {
                this.mDTNetworkRequestHandler.requestWillBeSent(requestId, timestamp, url, DTNetworkRequestType.PACKAGE);
            } else {
                boolean equals = EventType.LOADING_FINISHED.equals(eventType);
                IDTNetworkRequestHandler iDTNetworkRequestHandler = this.mDTNetworkRequestHandler;
                if (equals) {
                    iDTNetworkRequestHandler.loadingFinished(requestId, timestamp, networkRequestInfo.getEncodedDataLength());
                } else {
                    iDTNetworkRequestHandler.loadingFailed(requestId, timestamp);
                }
            }
        }
        this.mNetworkRequests.clear();
    }

    public void bindDTNetworkRequest(IDTNetworkRequestHandler iDTNetworkRequestHandler) {
        this.mDTNetworkRequestHandler = iDTNetworkRequestHandler;
        reportAndClearCachedNetworkEvents();
    }

    @Override // com.amazon.apl.devtools.models.network.IDTNetworkRequestHandler
    public void loadingFailed(int i, double d) {
        IDTNetworkRequestHandler iDTNetworkRequestHandler = this.mDTNetworkRequestHandler;
        if (iDTNetworkRequestHandler == null) {
            this.mNetworkRequests.add(new NetworkRequestInfo(i, d, EventType.LOADING_FAILED));
        } else {
            iDTNetworkRequestHandler.loadingFailed(i, d);
        }
    }

    @Override // com.amazon.apl.devtools.models.network.IDTNetworkRequestHandler
    public void loadingFinished(int i, double d, int i2) {
        IDTNetworkRequestHandler iDTNetworkRequestHandler = this.mDTNetworkRequestHandler;
        if (iDTNetworkRequestHandler == null) {
            this.mNetworkRequests.add(new NetworkRequestInfo(i, d, EventType.LOADING_FINISHED).setEncodedDataLength(i2));
        } else {
            iDTNetworkRequestHandler.loadingFinished(i, d, i2);
        }
    }

    @Override // com.amazon.apl.devtools.models.network.IDTNetworkRequestHandler
    public void requestWillBeSent(int i, double d, String str, DTNetworkRequestType dTNetworkRequestType) {
        IDTNetworkRequestHandler iDTNetworkRequestHandler = this.mDTNetworkRequestHandler;
        if (iDTNetworkRequestHandler != null) {
            iDTNetworkRequestHandler.requestWillBeSent(i, d, str, dTNetworkRequestType);
        } else {
            this.mNetworkRequests.add(new NetworkRequestInfo(i, d, EventType.REQUEST_WILL_BE_SENT).setUrl(str));
        }
    }

    public void unbindDTNetworkRequest() {
        this.mDTNetworkRequestHandler = null;
    }
}
