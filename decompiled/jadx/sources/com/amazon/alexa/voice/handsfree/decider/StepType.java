package com.amazon.alexa.voice.handsfree.decider;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.AISProfileHandsFreeIntroConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.AISUserVoiceRecognitionEnrollmentConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.AlexaAppLocationPermissionConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.AlexaAppSignInConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.ConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.DoubleMicrophonePermissionsConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.HandsFreeIntroConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.LanguageSelectorConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.LockScreenSettingsConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.ProfileSelectionConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.SingleMicrophonePermissionConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.UserVoiceRecognitionEnrollmentConditionalStep;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class StepType {
    private final String mKey;
    public static final StepType ALEXA_APP_SIGN_IN = new AnonymousClass1();
    public static final StepType PROFILE_SELECTION = new AnonymousClass2();
    public static final StepType HANDS_FREE_INTRO = new AnonymousClass3();
    public static final StepType ALEXA_APP_AUDIO_PERMISSION = new AnonymousClass4();
    public static final StepType ALEXA_APP_LOCATION_PERMISSION = new AnonymousClass5();
    public static final StepType HANDS_FREE_PERMISSIONS = new AnonymousClass6();
    public static final StepType LANGUAGE_SELECTOR = new AnonymousClass7();
    public static final StepType USER_VOICE_RECOGNITION_ENROLLMENT = new AnonymousClass8();
    public static final StepType AIS_USER_VOICE_RECOGNITION_ENROLLMENT = new AnonymousClass9();
    public static final StepType AIS_PROFILE_HANDS_FREE_INTRO = new AnonymousClass10();
    public static final StepType LOCK_SCREEN_SETTING = new AnonymousClass11();
    private static final /* synthetic */ StepType[] $VALUES = $values();

    private static /* synthetic */ StepType[] $values() {
        return new StepType[]{ALEXA_APP_SIGN_IN, PROFILE_SELECTION, HANDS_FREE_INTRO, ALEXA_APP_AUDIO_PERMISSION, ALEXA_APP_LOCATION_PERMISSION, HANDS_FREE_PERMISSIONS, LANGUAGE_SELECTOR, USER_VOICE_RECOGNITION_ENROLLMENT, AIS_USER_VOICE_RECOGNITION_ENROLLMENT, AIS_PROFILE_HANDS_FREE_INTRO, LOCK_SCREEN_SETTING};
    }

    private StepType(@NonNull String str, int i, String str2) {
        this.mKey = str2;
    }

    public static StepType valueOf(String str) {
        return (StepType) Enum.valueOf(StepType.class, str);
    }

    public static StepType[] values() {
        return (StepType[]) $VALUES.clone();
    }

    public String getKey() {
        return this.mKey;
    }

    public abstract ConditionalStep getStep(@NonNull Context context);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$1, reason: invalid class name */
    public enum AnonymousClass1 extends StepType {
        public /* synthetic */ AnonymousClass1() {
            this("ALEXA_APP_SIGN_IN", 0, "ALEXA_APP_SIGN_IN");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new AlexaAppSignInConditionalStep(context);
        }

        private AnonymousClass1(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$2, reason: invalid class name */
    public enum AnonymousClass2 extends StepType {
        public /* synthetic */ AnonymousClass2() {
            this("PROFILE_SELECTION", 1, "PROFILE_SELECTION");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new ProfileSelectionConditionalStep(context);
        }

        private AnonymousClass2(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$3, reason: invalid class name */
    public enum AnonymousClass3 extends StepType {
        public /* synthetic */ AnonymousClass3() {
            this("HANDS_FREE_INTRO", 2, "HANDS_FREE_INTRO");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new HandsFreeIntroConditionalStep(context);
        }

        private AnonymousClass3(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$4, reason: invalid class name */
    public enum AnonymousClass4 extends StepType {
        public /* synthetic */ AnonymousClass4() {
            this("ALEXA_APP_AUDIO_PERMISSION", 3, "ALEXA_APP_AUDIO_PERMISSION");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new SingleMicrophonePermissionConditionalStep(context);
        }

        private AnonymousClass4(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$5, reason: invalid class name */
    public enum AnonymousClass5 extends StepType {
        public /* synthetic */ AnonymousClass5() {
            this("ALEXA_APP_LOCATION_PERMISSION", 4, "ALEXA_APP_LOCATION_PERMISSION");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new AlexaAppLocationPermissionConditionalStep(context);
        }

        private AnonymousClass5(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$6, reason: invalid class name */
    public enum AnonymousClass6 extends StepType {
        public /* synthetic */ AnonymousClass6() {
            this("HANDS_FREE_PERMISSIONS", 5, "HANDS_FREE_PERMISSIONS");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new DoubleMicrophonePermissionsConditionalStep(context);
        }

        private AnonymousClass6(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$7, reason: invalid class name */
    public enum AnonymousClass7 extends StepType {
        public /* synthetic */ AnonymousClass7() {
            this("LANGUAGE_SELECTOR", 6, "LANGUAGE_SELECTOR");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new LanguageSelectorConditionalStep(context);
        }

        private AnonymousClass7(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$8, reason: invalid class name */
    public enum AnonymousClass8 extends StepType {
        public /* synthetic */ AnonymousClass8() {
            this("USER_VOICE_RECOGNITION_ENROLLMENT", 7, "USER_VOICE_RECOGNITION_ENROLLMENT");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new UserVoiceRecognitionEnrollmentConditionalStep(context);
        }

        private AnonymousClass8(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    public /* synthetic */ StepType(String str, int i, String str2, int i2) {
        this(str, i, str2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$10, reason: invalid class name */
    public enum AnonymousClass10 extends StepType {
        public /* synthetic */ AnonymousClass10() {
            this("AIS_PROFILE_HANDS_FREE_INTRO", 9, "AIS_PROFILE_HANDS_FREE_INTRO");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new AISProfileHandsFreeIntroConditionalStep(context);
        }

        private AnonymousClass10(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$11, reason: invalid class name */
    public enum AnonymousClass11 extends StepType {
        public /* synthetic */ AnonymousClass11() {
            this("LOCK_SCREEN_SETTING", 10, "LOCK_SCREEN_SETTING");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new LockScreenSettingsConditionalStep(context);
        }

        private AnonymousClass11(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.decider.StepType$9, reason: invalid class name */
    public enum AnonymousClass9 extends StepType {
        public /* synthetic */ AnonymousClass9() {
            this("AIS_USER_VOICE_RECOGNITION_ENROLLMENT", 8, "AIS_USER_VOICE_RECOGNITION_ENROLLMENT");
        }

        @Override // com.amazon.alexa.voice.handsfree.decider.StepType
        public ConditionalStep getStep(@NonNull Context context) {
            return new AISUserVoiceRecognitionEnrollmentConditionalStep(context);
        }

        private AnonymousClass9(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }
}
