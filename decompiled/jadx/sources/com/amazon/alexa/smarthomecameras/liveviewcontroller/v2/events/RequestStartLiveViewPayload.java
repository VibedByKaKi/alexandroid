package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.events;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.LvcTimestamp;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.LiveViewSessionType;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview.enums.SelectionCriteria;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class RequestStartLiveViewPayload implements Serializable {

    @SerializedName("deviceRequestStartTime")
    private final String deviceRequestStartTime;

    @NonNull
    @SerializedName("requestId")
    private final String requestId;

    @SerializedName("selectionCriteria")
    private final SelectionCriteria selectionCriteria;

    @NonNull
    @SerializedName(BizMetricsConstants.SESSION_TYPE)
    private final LiveViewSessionType sessionType;

    @SerializedName("targets")
    private final List<String> targets;

    public RequestStartLiveViewPayload(@NonNull LiveViewSessionType liveViewSessionType, @Nullable List<String> list, @NonNull String str, @Nullable SelectionCriteria selectionCriteria, @Nullable String str2) {
        this.sessionType = liveViewSessionType;
        this.targets = list;
        this.requestId = str;
        this.selectionCriteria = selectionCriteria;
        this.deviceRequestStartTime = str2;
    }

    @Nullable
    public String getDeviceRequestStartTime() {
        return this.deviceRequestStartTime;
    }

    @NonNull
    public String getRequestId() {
        return this.requestId;
    }

    public SelectionCriteria getSelectionCriteria() {
        return this.selectionCriteria;
    }

    @NonNull
    public LiveViewSessionType getSessionType() {
        return this.sessionType;
    }

    public List<String> getTargets() {
        return this.targets;
    }

    public RequestStartLiveViewPayload(@NonNull LiveViewSessionType liveViewSessionType, @Nullable List<String> list, @NonNull String str, @Nullable SelectionCriteria selectionCriteria) {
        this(liveViewSessionType, list, str, selectionCriteria, LvcTimestamp.now());
    }

    public RequestStartLiveViewPayload(@NonNull LiveViewSessionType liveViewSessionType, @NonNull List<String> list, @NonNull String str) {
        this(liveViewSessionType, list, str, null, LvcTimestamp.now());
    }
}
