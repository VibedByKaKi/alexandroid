package com.amazon.alexa.handsfree.foxtrot.audio;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.compat.model.AlexaAttentionSystemListener;
import com.amazon.alexa.api.compat.model.AlexaStateExtras;
import com.amazon.alexa.api.compat.model.AlexaStateV2;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.asp.AudioSignalProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FoxtrotAttentionSystemListener implements AlexaAttentionSystemListener {

    @VisibleForTesting
    static final int ASP_CMD_NOTIFY_ASR_STREAM_ERROR = 15;

    @VisibleForTesting
    static final int ASP_CMD_NOTIFY_ASR_STREAM_STOPPED = 14;

    @VisibleForTesting
    static final int ASP_CMD_NOTIFY_TTS = 1;

    @VisibleForTesting
    static final int ASP_CMD_REQUEST_ARBITRATION_JSON = 23;

    @VisibleForTesting
    static final int ASP_CMD_SET_LISTENING_MODE = 146;
    private static final int ASP_COMMAND_SIZE = 4;
    private static final int ASP_MAX_ARBITRATION_BUFFER_SIZE = 256;

    @VisibleForTesting
    static final long PIPELINE_HANDLER = 0;
    private static final String TAG = "FoxtrotAttentionSystemListener";
    private AudioSignalProcessor mAudioSignalProcessor;
    private Context mContext;
    private AlexaStateV2 mPreviousAlexaState;

    @VisibleForTesting
    static final byte[] REPLY = new byte[0];

    @VisibleForTesting
    static final byte[] STOP_CMD = {0, 0, 0, 0};

    @VisibleForTesting
    static final byte[] START_CMD = {1, 0, 0, 0};

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.handsfree.foxtrot.audio.FoxtrotAttentionSystemListener$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$AlexaStateV2;

        static {
            int[] iArr = new int[AlexaStateV2.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$AlexaStateV2 = iArr;
            try {
                iArr[AlexaStateV2.SPEAKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$AlexaStateV2[AlexaStateV2.LISTENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FoxtrotAttentionSystemListener(Context context) {
        this.mContext = context;
        this.mAudioSignalProcessor = new AudioSignalProcessor(context);
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAttentionSystemListener
    public void onAlexaStateChanged(AlexaStateV2 alexaStateV2, AlexaStateExtras alexaStateExtras) {
        String str = TAG;
        Log.d(str, "onAlexaStateChanged: \nstate: " + alexaStateV2);
        AlexaStateV2 alexaStateV22 = this.mPreviousAlexaState;
        AlexaStateV2 alexaStateV23 = AlexaStateV2.SPEAKING;
        if (alexaStateV22 == alexaStateV23 && alexaStateV2 != alexaStateV23) {
            Log.i(str, "Alexa stopped speaking, sending ASP_COMMAND_NOTIFY_TTS_PLAYBACK_STOP");
            this.mAudioSignalProcessor.command(0L, 1, STOP_CMD, REPLY);
        }
        AlexaStateV2 alexaStateV24 = this.mPreviousAlexaState;
        AlexaStateV2 alexaStateV25 = AlexaStateV2.LISTENING;
        if (alexaStateV24 == alexaStateV25 && alexaStateV2 != alexaStateV25) {
            Log.i(str, "Alexa stopped listening, sending ASP_CMD_SET_LISTENING_MODE");
            AudioSignalProcessor audioSignalProcessor = this.mAudioSignalProcessor;
            byte[] bArr = STOP_CMD;
            byte[] bArr2 = REPLY;
            audioSignalProcessor.command(0L, 146, bArr, bArr2);
            if (alexaStateV2 == AlexaStateV2.THINKING) {
                Log.i(str, "Alexa finished listening successfully, sending NOTIFY_ASR_STREAM_STOPPED");
                this.mAudioSignalProcessor.command(0L, 14, bArr, bArr2);
            } else if (alexaStateV2 == AlexaStateV2.ERROR) {
                Log.i(str, "Alexa encountered error while listening; sending NOTIFY_ASR_STREAM_ERROR");
                this.mAudioSignalProcessor.command(0L, 15, bArr, bArr2);
            }
        }
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$AlexaStateV2[alexaStateV2.ordinal()];
        if (i == 1) {
            Log.i(str, "Alexa is now speaking; sending ASP_COMMAND_NOTIFY_TTS_PLAYBACK_START");
            this.mAudioSignalProcessor.command(0L, 1, START_CMD, REPLY);
        } else if (i == 2) {
            Log.i(str, "Alexa started listening; sending ASP_CMD_SET_LISTENING_MODE_STREAMING_START");
            this.mAudioSignalProcessor.command(0L, 146, START_CMD, REPLY);
            Log.i(str, "sending ASP_CMD_REQUEST_ARBITRATION_JSON");
            ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.nativeOrder());
            order.putInt(256);
            this.mAudioSignalProcessor.command(0L, 23, order.array(), new byte[256]);
        }
        this.mPreviousAlexaState = alexaStateV2;
    }
}
