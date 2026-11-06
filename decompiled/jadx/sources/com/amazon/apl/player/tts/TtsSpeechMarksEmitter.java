package com.amazon.apl.player.tts;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.amazon.apl.android.RootContext$$ExternalSyntheticLambda2;
import com.amazon.apl.android.dependencies.ITtsPlayer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TtsSpeechMarksEmitter implements ITtsSpeechMarksEmitter {
    private static final String TAG = "TtsSpeechMarksEmitter";
    final Context mContext;
    Handler mEventFiringHandlerWrapper;
    long mStartTime;
    private final ITtsPlayer.ISpeechMarksListener mTtsSpeechMarksListener;
    Queue<ITtsPlayer.ISpeechMarksListener.SpeechMark> mMarksQueue = new LinkedList();
    final List<Runnable> mRunnablesPosted = new LinkedList();
    ICurrentTimeProvider mCurrentTimeProvider = new TtsSpeechMarksEmitter$$ExternalSyntheticLambda1();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ICurrentTimeProvider {
        long getCurrentTime();
    }

    public TtsSpeechMarksEmitter(ITtsPlayer.ISpeechMarksListener iSpeechMarksListener, Handler handler, Context context) {
        if (handler == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("HandlerWrapper must not be null.");
            throw null;
        }
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Context must not be null.");
            throw null;
        }
        this.mTtsSpeechMarksListener = iSpeechMarksListener;
        this.mEventFiringHandlerWrapper = handler;
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doScheduleSpeechMark$0(ITtsPlayer.ISpeechMarksListener.SpeechMark speechMark) {
        this.mTtsSpeechMarksListener.onSpeechMark(speechMark);
    }

    @Override // com.amazon.apl.player.tts.ITtsSpeechMarksEmitter
    public synchronized void clear() {
        this.mStartTime = 0L;
        this.mMarksQueue.clear();
        Iterator<Runnable> it2 = this.mRunnablesPosted.iterator();
        while (it2.hasNext()) {
            this.mEventFiringHandlerWrapper.removeCallbacks(it2.next());
        }
    }

    public void doScheduleSpeechMark(ITtsPlayer.ISpeechMarksListener.SpeechMark speechMark) {
        long currentTime = speechMark.time - (this.mCurrentTimeProvider.getCurrentTime() - this.mStartTime);
        if (currentTime < 0) {
            currentTime = 0;
        }
        RootContext$$ExternalSyntheticLambda2 rootContext$$ExternalSyntheticLambda2 = new RootContext$$ExternalSyntheticLambda2(this, speechMark, 8);
        this.mRunnablesPosted.add(rootContext$$ExternalSyntheticLambda2);
        this.mEventFiringHandlerWrapper.postDelayed(rootContext$$ExternalSyntheticLambda2, currentTime);
    }

    @Override // com.amazon.apl.player.tts.ITtsSpeechMarksEmitter
    public synchronized void scheduleSpeechMark(String str) {
        try {
            if (this.mTtsSpeechMarksListener != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        ITtsPlayer.ISpeechMarksListener.SpeechMark create = ITtsPlayer.ISpeechMarksListener.SpeechMark.create(jSONArray.getJSONObject(i));
                        if (0 == this.mStartTime) {
                            this.mMarksQueue.add(create);
                        } else {
                            doScheduleSpeechMark(create);
                        }
                    }
                } catch (JSONException unused) {
                    Log.w(TAG, "Could not parse speech mark");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.apl.player.tts.ITtsSpeechMarksEmitter
    public synchronized void start() {
        if (this.mStartTime > 0) {
            Log.w(TAG, "emitter already started, ignoring start()");
            return;
        }
        if (this.mTtsSpeechMarksListener != null) {
            this.mStartTime = this.mCurrentTimeProvider.getCurrentTime();
            while (!this.mMarksQueue.isEmpty()) {
                doScheduleSpeechMark(this.mMarksQueue.poll());
            }
        }
    }
}
