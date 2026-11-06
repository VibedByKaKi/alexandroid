package com.amazon.alexa.handsfree.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import com.amazon.alexa.handsfree.ui.utils.ResultReceiverWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ManagedActivity extends AppCompatActivity {
    public static final String EXTRA_FINISH_ACTIVITY_RESULT_RECEIVER = "receiveResultOnFinishingTheActivity";
    public static final String EXTRA_ONSTEPFINISH_RESULT_RECEIVER = "onStepFinishedResultReceiver";
    public static final String EXTRA_STEP_RESULT = "stepResult";
    private Intent mCallerIntent;
    private ResultReceiver mOnStepFinishResultReceiver;
    private boolean mSetFinished;
    private StepResult mStepResult;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum StepResult {
        CONTINUE,
        EXIT
    }

    public void finishStep(@NonNull StepResult stepResult) {
        this.mStepResult = stepResult;
        if (this.mOnStepFinishResultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putAll(this.mCallerIntent.getExtras());
            bundle.putSerializable(EXTRA_STEP_RESULT, this.mStepResult);
            bundle.putParcelable(EXTRA_FINISH_ACTIVITY_RESULT_RECEIVER, getOnStartNextActivityResultReceiver(this));
            this.mOnStepFinishResultReceiver.send(0, bundle);
        }
        this.mSetFinished = true;
    }

    @VisibleForTesting
    public Handler getMainHandler(@NonNull Context context) {
        return new Handler(context.getMainLooper());
    }

    @VisibleForTesting
    public ResultReceiver getOnStartNextActivityResultReceiver(@NonNull Context context) {
        return ResultReceiverWrapper.getReceiverOf(new ResultReceiver(getMainHandler(context)) { // from class: com.amazon.alexa.handsfree.ui.ManagedActivity.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, @NonNull Bundle bundle) {
                ManagedActivity.this.finish();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setup(getIntent());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.mSetFinished || this.mOnStepFinishResultReceiver == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putAll(this.mCallerIntent.getExtras());
        bundle.putSerializable(EXTRA_STEP_RESULT, StepResult.EXIT);
        bundle.putParcelable(EXTRA_FINISH_ACTIVITY_RESULT_RECEIVER, getOnStartNextActivityResultReceiver(this));
        this.mOnStepFinishResultReceiver.send(0, bundle);
    }

    @VisibleForTesting
    public void setup(@Nullable Intent intent) {
        this.mCallerIntent = intent;
        this.mStepResult = StepResult.EXIT;
        if (intent != null && intent.hasExtra(EXTRA_ONSTEPFINISH_RESULT_RECEIVER)) {
            this.mOnStepFinishResultReceiver = (ResultReceiver) intent.getParcelableExtra(EXTRA_ONSTEPFINISH_RESULT_RECEIVER);
        }
        this.mSetFinished = false;
    }
}
