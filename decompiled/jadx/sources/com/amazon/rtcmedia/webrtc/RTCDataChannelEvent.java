package com.amazon.rtcmedia.webrtc;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RTCDataChannelEvent {
    private final Type eventType;
    private Map<String, Object> params;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RTCDataChannelEventBuilder {
        private Type eventType;
        private ArrayList<String> params$key;
        private ArrayList<Object> params$value;

        public RTCDataChannelEvent build() {
            Map map;
            ArrayList<String> arrayList = this.params$key;
            int size = arrayList == null ? 0 : arrayList.size();
            if (size == 0) {
                map = Collections.EMPTY_MAP;
            } else if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(this.params$key.size() < 1073741824 ? ((this.params$key.size() - 3) / 3) + this.params$key.size() + 1 : Integer.MAX_VALUE);
                for (int i = 0; i < this.params$key.size(); i++) {
                    linkedHashMap.put(this.params$key.get(i), this.params$value.get(i));
                }
                map = Collections.unmodifiableMap(linkedHashMap);
            } else {
                map = Collections.singletonMap(this.params$key.get(0), this.params$value.get(0));
            }
            return new RTCDataChannelEvent(this.eventType, map);
        }

        public RTCDataChannelEventBuilder clearParams() {
            ArrayList<String> arrayList = this.params$key;
            if (arrayList != null) {
                arrayList.clear();
                this.params$value.clear();
            }
            return this;
        }

        public RTCDataChannelEventBuilder eventType(Type type) {
            this.eventType = type;
            return this;
        }

        public RTCDataChannelEventBuilder param(String str, Object obj) {
            if (this.params$key == null) {
                this.params$key = new ArrayList<>();
                this.params$value = new ArrayList<>();
            }
            this.params$key.add(str);
            this.params$value.add(obj);
            return this;
        }

        public RTCDataChannelEventBuilder params(Map<? extends String, ? extends Object> map) {
            if (map == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("params cannot be null");
                return null;
            }
            if (this.params$key == null) {
                this.params$key = new ArrayList<>();
                this.params$value = new ArrayList<>();
            }
            for (Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
                this.params$key.add(entry.getKey());
                this.params$value.add(entry.getValue());
            }
            return this;
        }

        public String toString() {
            return "RTCDataChannelEvent.RTCDataChannelEventBuilder(eventType=" + this.eventType + ", params$key=" + this.params$key + ", params$value=" + this.params$value + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        RECEIVED_MESSAGE,
        STATE_CHANGED
    }

    public RTCDataChannelEvent(Type type, Map<String, Object> map) {
        this.eventType = type;
        this.params = map;
    }

    public static RTCDataChannelEventBuilder builder() {
        return new RTCDataChannelEventBuilder();
    }

    public Type getEventType() {
        return this.eventType;
    }

    public Map<String, Object> getParams() {
        return this.params;
    }
}
