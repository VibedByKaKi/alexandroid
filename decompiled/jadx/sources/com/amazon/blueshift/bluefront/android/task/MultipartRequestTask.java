package com.amazon.blueshift.bluefront.android.task;

import android.os.AsyncTask;
import com.amazon.blueshift.bluefront.android.SpeechClientException;
import com.amazon.blueshift.bluefront.android.http.MultipartRequest;
import com.google.common.base.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MultipartRequestTask extends AsyncTask<Void, Progress<AudioStreamingTaskState>, byte[]> {
    private static final String TAG = "com.amazon.blueshift.bluefront.android.task.MultipartRequestTask";
    private final MultipartRequestTaskListener mListener;
    private final MultipartRequest mRequest;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.blueshift.bluefront.android.task.MultipartRequestTask$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$blueshift$bluefront$android$task$MultipartRequestTask$AudioStreamingTaskState;

        static {
            int[] iArr = new int[AudioStreamingTaskState.values().length];
            $SwitchMap$com$amazon$blueshift$bluefront$android$task$MultipartRequestTask$AudioStreamingTaskState = iArr;
            try {
                iArr[AudioStreamingTaskState.Streaming.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$blueshift$bluefront$android$task$MultipartRequestTask$AudioStreamingTaskState[AudioStreamingTaskState.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioStreamingTaskState {
        Streaming,
        Error
    }

    public MultipartRequestTask(MultipartRequest multipartRequest, MultipartRequestTaskListener multipartRequestTaskListener) {
        this.mRequest = (MultipartRequest) Preconditions.checkNotNull(multipartRequest, "Request cannot be null.");
        this.mListener = (MultipartRequestTaskListener) Preconditions.checkNotNull(multipartRequestTaskListener, "Listener cannot be null.");
    }

    @Override // android.os.AsyncTask
    public byte[] doInBackground(Void... voidArr) {
        try {
            return this.mRequest.execute();
        } catch (SpeechClientException e) {
            this.publishProgress(new Progress(AudioStreamingTaskState.Error, e));
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(byte[] bArr) {
        if (bArr != null) {
            this.mListener.onResponse(bArr);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Progress<AudioStreamingTaskState>... progressArr) {
        Preconditions.checkNotNull(progressArr, "States cannot be null.");
        Preconditions.checkArgument(progressArr.length == 1, "Only one update is allowed.");
        Progress<AudioStreamingTaskState> progress = progressArr[0];
        Objects.toString(progress.getState());
        Object payload = progress.getPayload();
        int i = AnonymousClass1.$SwitchMap$com$amazon$blueshift$bluefront$android$task$MultipartRequestTask$AudioStreamingTaskState[progress.getState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.mListener.onError(new SpeechClientException("Received an unknown progress update state"));
            } else {
                if (payload == null || !(payload instanceof SpeechClientException)) {
                    return;
                }
                this.mListener.onError((SpeechClientException) payload);
            }
        }
    }
}
