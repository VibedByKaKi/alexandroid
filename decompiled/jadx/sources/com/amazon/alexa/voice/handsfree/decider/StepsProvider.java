package com.amazon.alexa.voice.handsfree.decider;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.FalcoProtocolComponent;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentType;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentTypeResolver;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.settings.contract.SetupFlow;
import com.amazon.alexa.handsfree.vendor.bridge.VoiceAppPackageInfo;
import com.amazon.alexa.handsfree.vendor.bridge.VoiceAppPackageInfoProvider;
import com.amazon.alexa.voice.handsfree.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class StepsProvider {
    private static final String TAG = "StepsProvider";
    private static StepsProvider sInstance;
    private SetupFlow mSetupFlow;
    private List<String> mStepStrings = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepsProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$handsfree$settings$contract$SetupFlow;

        static {
            int[] iArr = new int[SetupFlow.values().length];
            $SwitchMap$com$amazon$alexa$handsfree$settings$contract$SetupFlow = iArr;
            try {
                iArr[SetupFlow.DOUBLE_MICROPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$handsfree$settings$contract$SetupFlow[SetupFlow.DOUBLE_MICROPHONE_1PSV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$handsfree$settings$contract$SetupFlow[SetupFlow.DOUBLE_MICROPHONE_AIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    private List<String> getAISProfileStepStrings(@NonNull Context context) {
        SetupFlow setupFlow;
        if (this.mStepStrings == null || ((setupFlow = this.mSetupFlow) != SetupFlow.DOUBLE_MICROPHONE_AIS && setupFlow != SetupFlow.SINGLE_MICROPHONE_AIS)) {
            VoiceAppPackageInfo voiceAppPackageInfo = getVoiceAppPackageInfo(context);
            if (voiceAppPackageInfo == null || !voiceAppPackageInfo.hasRecordAudioPermissions(context)) {
                this.mStepStrings = Arrays.asList(context.getResources().getStringArray(R.array.ais_double_microphone_decider_steps));
                this.mSetupFlow = SetupFlow.DOUBLE_MICROPHONE_AIS;
            } else {
                this.mStepStrings = Arrays.asList(context.getResources().getStringArray(R.array.ais_single_microphone_decider_steps));
                this.mSetupFlow = SetupFlow.SINGLE_MICROPHONE_AIS;
            }
            Log.d(TAG, "getAISProfileStepStrings: " + this.mSetupFlow);
        }
        return this.mStepStrings;
    }

    @NonNull
    public static synchronized StepsProvider getInstance() {
        StepsProvider stepsProvider;
        synchronized (StepsProvider.class) {
            try {
                if (sInstance == null) {
                    sInstance = new StepsProvider();
                }
                stepsProvider = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stepsProvider;
    }

    @NonNull
    private List<String> getStepStrings(@NonNull Context context) {
        SetupFlow setupFlow;
        if (this.mStepStrings == null || (setupFlow = this.mSetupFlow) == SetupFlow.DOUBLE_MICROPHONE_AIS || setupFlow == SetupFlow.SINGLE_MICROPHONE_AIS || setupFlow == SetupFlow.DEFAULT) {
            VoiceAppPackageInfo voiceAppPackageInfo = getVoiceAppPackageInfo(context);
            EnrollmentTypeResolver enrollmentTypeResolver = getEnrollmentTypeResolver(context);
            if (enrollmentTypeResolver == null || enrollmentTypeResolver.getSpeakerVerificationEnrollmentType() != EnrollmentType._1PSV) {
                if (voiceAppPackageInfo == null || !voiceAppPackageInfo.hasRecordAudioPermissions(context)) {
                    this.mStepStrings = Arrays.asList(context.getResources().getStringArray(R.array.double_microphone_decider_steps));
                    this.mSetupFlow = SetupFlow.DOUBLE_MICROPHONE;
                } else {
                    this.mStepStrings = Arrays.asList(context.getResources().getStringArray(R.array.single_microphone_decider_steps));
                    this.mSetupFlow = SetupFlow.SINGLE_MICROPHONE;
                }
            } else if (voiceAppPackageInfo == null || !voiceAppPackageInfo.hasRecordAudioPermissions(context)) {
                this.mStepStrings = Arrays.asList(context.getResources().getStringArray(R.array.edgesv_double_microphone_decider_steps));
                this.mSetupFlow = SetupFlow.DOUBLE_MICROPHONE_1PSV;
            } else {
                this.mStepStrings = Arrays.asList(context.getResources().getStringArray(R.array.edgesv_single_microphone_decider_steps));
                this.mSetupFlow = SetupFlow.SINGLE_MICROPHONE_1PSV;
            }
            Log.d(TAG, "getStepStrings: " + this.mSetupFlow);
        }
        return this.mStepStrings;
    }

    @NonNull
    private List<StepType> getStepsFromStepStrings(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(StepType.valueOf(it2.next()));
        }
        return arrayList;
    }

    @NonNull
    public void decacheStepStrings() {
        this.mStepStrings = null;
        this.mSetupFlow = null;
    }

    @NonNull
    public List<StepType> getAISProfileSteps(@NonNull Context context) {
        return getStepsFromStepStrings(getAISProfileStepStrings(context));
    }

    @NonNull
    @VisibleForTesting
    public EnrollmentTypeResolver getEnrollmentTypeResolver(@NonNull Context context) {
        return ((FalcoProtocolComponent) AhfComponentsProvider.getComponent(context, FalcoProtocolComponent.class)).enrollmentTypeResolverLazy().get();
    }

    public SetupFlow getSetupFlow() {
        return this.mSetupFlow;
    }

    @NonNull
    public List<StepType> getSteps(@NonNull Context context) {
        return getStepsFromStepStrings(getStepStrings(context));
    }

    @VisibleForTesting
    public VoiceAppPackageInfo getVoiceAppPackageInfo(@NonNull Context context) {
        return new VoiceAppPackageInfoProvider(context).getSupportedVoiceApp();
    }

    public boolean isDoubleMicrophoneFlow() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$handsfree$settings$contract$SetupFlow[this.mSetupFlow.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    @NonNull
    public void updateSetupFlow(@NonNull SetupFlow setupFlow) {
        this.mSetupFlow = setupFlow;
    }
}
