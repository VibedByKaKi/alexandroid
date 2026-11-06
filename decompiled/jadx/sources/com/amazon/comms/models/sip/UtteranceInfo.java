package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonInclude;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes20.dex */
public class UtteranceInfo {
    private Long endOfSpeechAbsoluteTimestampInMillis;
    private Long endOfSpeechRelativeTimestampInMillis;
    private String requestId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UtteranceInfoBuilder {
        private Long endOfSpeechAbsoluteTimestampInMillis;
        private Long endOfSpeechRelativeTimestampInMillis;
        private String requestId;

        public UtteranceInfo build() {
            return new UtteranceInfo(this.requestId, this.endOfSpeechAbsoluteTimestampInMillis, this.endOfSpeechRelativeTimestampInMillis, 0);
        }

        public UtteranceInfoBuilder endOfSpeechAbsoluteTimestampInMillis(Long l) {
            this.endOfSpeechAbsoluteTimestampInMillis = l;
            return this;
        }

        public UtteranceInfoBuilder endOfSpeechRelativeTimestampInMillis(Long l) {
            this.endOfSpeechRelativeTimestampInMillis = l;
            return this;
        }

        public UtteranceInfoBuilder requestId(String str) {
            this.requestId = str;
            return this;
        }

        public String toString() {
            return "UtteranceInfo.UtteranceInfoBuilder(requestId=" + this.requestId + ", endOfSpeechAbsoluteTimestampInMillis=" + this.endOfSpeechAbsoluteTimestampInMillis + ", endOfSpeechRelativeTimestampInMillis=" + this.endOfSpeechRelativeTimestampInMillis + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    private UtteranceInfo(String str, Long l, Long l2) {
        this.requestId = str;
        this.endOfSpeechAbsoluteTimestampInMillis = l;
        this.endOfSpeechRelativeTimestampInMillis = l2;
    }

    public static UtteranceInfoBuilder builder() {
        return new UtteranceInfoBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof UtteranceInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UtteranceInfo)) {
            return false;
        }
        UtteranceInfo utteranceInfo = (UtteranceInfo) obj;
        if (!utteranceInfo.canEqual(this)) {
            return false;
        }
        Long endOfSpeechAbsoluteTimestampInMillis = getEndOfSpeechAbsoluteTimestampInMillis();
        Long endOfSpeechAbsoluteTimestampInMillis2 = utteranceInfo.getEndOfSpeechAbsoluteTimestampInMillis();
        if (endOfSpeechAbsoluteTimestampInMillis != null ? !endOfSpeechAbsoluteTimestampInMillis.equals(endOfSpeechAbsoluteTimestampInMillis2) : endOfSpeechAbsoluteTimestampInMillis2 != null) {
            return false;
        }
        Long endOfSpeechRelativeTimestampInMillis = getEndOfSpeechRelativeTimestampInMillis();
        Long endOfSpeechRelativeTimestampInMillis2 = utteranceInfo.getEndOfSpeechRelativeTimestampInMillis();
        if (endOfSpeechRelativeTimestampInMillis != null ? !endOfSpeechRelativeTimestampInMillis.equals(endOfSpeechRelativeTimestampInMillis2) : endOfSpeechRelativeTimestampInMillis2 != null) {
            return false;
        }
        String requestId = getRequestId();
        String requestId2 = utteranceInfo.getRequestId();
        return requestId != null ? requestId.equals(requestId2) : requestId2 == null;
    }

    public Long getEndOfSpeechAbsoluteTimestampInMillis() {
        return this.endOfSpeechAbsoluteTimestampInMillis;
    }

    public Long getEndOfSpeechRelativeTimestampInMillis() {
        return this.endOfSpeechRelativeTimestampInMillis;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        Long endOfSpeechAbsoluteTimestampInMillis = getEndOfSpeechAbsoluteTimestampInMillis();
        int hashCode = endOfSpeechAbsoluteTimestampInMillis == null ? 43 : endOfSpeechAbsoluteTimestampInMillis.hashCode();
        Long endOfSpeechRelativeTimestampInMillis = getEndOfSpeechRelativeTimestampInMillis();
        int i = (hashCode + 59) * 59;
        int hashCode2 = endOfSpeechRelativeTimestampInMillis == null ? 43 : endOfSpeechRelativeTimestampInMillis.hashCode();
        String requestId = getRequestId();
        return ((i + hashCode2) * 59) + (requestId != null ? requestId.hashCode() : 43);
    }

    public void setEndOfSpeechAbsoluteTimestampInMillis(Long l) {
        this.endOfSpeechAbsoluteTimestampInMillis = l;
    }

    public void setEndOfSpeechRelativeTimestampInMillis(Long l) {
        this.endOfSpeechRelativeTimestampInMillis = l;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public String toString() {
        return "UtteranceInfo(requestId=" + getRequestId() + ", endOfSpeechAbsoluteTimestampInMillis=" + getEndOfSpeechAbsoluteTimestampInMillis() + ", endOfSpeechRelativeTimestampInMillis=" + getEndOfSpeechRelativeTimestampInMillis() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public UtteranceInfo() {
    }

    public /* synthetic */ UtteranceInfo(String str, Long l, Long l2, int i) {
        this(str, l, l2);
    }
}
