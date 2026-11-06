package com.amazon.apl.devtools.views;

import android.view.MotionEvent;
import com.amazon.apl.android.LiveData;
import com.amazon.apl.devtools.enums.DTError;
import com.amazon.apl.devtools.executers.SessionRecorderRecordCommandRequest;
import com.amazon.apl.devtools.models.view.ExecuteCommandStatus;
import com.amazon.apl.devtools.util.IDTCallback;
import com.amazon.apl.devtools.util.RequestStatus;
import com.amazon.apl.viewhost.config.DocumentOptions;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IAPLView {
    void documentCommandRequest(int i, String str, JSONObject jSONObject, IDTCallback<String> iDTCallback);

    default void enqueueMotionEvents(List<MotionEvent> list, IDTCallback<Boolean> iDTCallback) {
        iDTCallback.execute(RequestStatus.failed(0, DTError.METHOD_NOT_IMPLEMENTED));
    }

    default void executeCommands(String str, IDTCallback<ExecuteCommandStatus> iDTCallback) {
        iDTCallback.execute(RequestStatus.failed(0, DTError.METHOD_NOT_IMPLEMENTED));
    }

    default float getDisplayRefreshRate() {
        return 60.0f;
    }

    boolean post(Runnable runnable);

    void replaySessionRecorderRecording(int i, IDTCallback<String> iDTCallback, JSONArray jSONArray);

    void startFrameMetricsRecording(int i, IDTCallback<String> iDTCallback);

    void startSessionRecorderRecording(int i, IDTCallback<String> iDTCallback, SessionRecorderRecordCommandRequest sessionRecorderRecordCommandRequest);

    void stopFrameMetricsRecording(int i, IDTCallback<List<JSONObject>> iDTCallback);

    void stopSessionRecorderRecording(int i, IDTCallback<List<JSONObject>> iDTCallback);

    void unbind();

    default void updateDataSource(String str, String str2, IDTCallback<Boolean> iDTCallback) {
        iDTCallback.execute(RequestStatus.failed(0, DTError.METHOD_NOT_IMPLEMENTED));
    }

    default void updateLiveData(String str, List<LiveData.Update> list, IDTCallback<Boolean> iDTCallback) {
        iDTCallback.execute(RequestStatus.failed(0, DTError.METHOD_NOT_IMPLEMENTED));
    }

    default void clearMotionEvents() {
    }

    default void addLiveData(String str, LiveData liveData) {
    }

    default void renderAPLDocument(String str, String str2, DocumentOptions.Builder builder) {
    }
}
