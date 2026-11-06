package com.amazon.alexa.voiceui.chrome;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaLocalesListener;
import com.amazon.alexa.api.AlexaStateListener;
import com.amazon.alexa.api.AlexaUserSpeechListener;
import com.amazon.alexa.voice.ui.speech.AttentionSystemContract;
import com.amazon.alexa.voice.ui.util.AlexaState;
import com.amazon.alexa.voice.ui.util.AlexaStateProperty;
import com.amazon.alexa.voice.ui.util.FloatProperty;
import com.amazon.alexa.voiceui.AlexaServicesApis;
import com.amazon.alexa.voiceui.cards.DefaultLocaleAuthority;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
class VoiceChromeModel implements AttentionSystemContract {
    private final AlexaServicesApis alexaServicesApis;
    private final DefaultLocaleAuthority localeAuthority;

    @VisibleForTesting
    final StateListener stateListener;

    @VisibleForTesting
    final UserSpeechListener userSpeechListener;
    private final AlexaStateProperty alexaStateProperty = new AlexaStateProperty(AlexaState.IDLE);
    private final FloatProperty soundLevelProperty = new FloatProperty();

    @VisibleForTesting
    final LocaleListener localeListener = new LocaleListener();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voiceui.chrome.VoiceChromeModel$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$AlexaState;

        static {
            int[] iArr = new int[com.amazon.alexa.api.AlexaState.values().length];
            $SwitchMap$com$amazon$alexa$api$AlexaState = iArr;
            try {
                iArr[com.amazon.alexa.api.AlexaState.PREPARING_TO_LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaState[com.amazon.alexa.api.AlexaState.LISTENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaState[com.amazon.alexa.api.AlexaState.FINISHING_LISTENING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaState[com.amazon.alexa.api.AlexaState.THINKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaState[com.amazon.alexa.api.AlexaState.SPEAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaState[com.amazon.alexa.api.AlexaState.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaState[com.amazon.alexa.api.AlexaState.IDLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LocaleListener implements AlexaLocalesListener {
        public LocaleListener() {
        }

        @Override // com.amazon.alexa.api.AlexaLocalesListener
        public void onLocales(List<Locale> list) {
            if (list.size() >= 1) {
                VoiceChromeModel.this.localeAuthority.setLocale(list.get(0));
            }
        }
    }

    @Inject
    public VoiceChromeModel(AlexaServicesApis alexaServicesApis, DefaultLocaleAuthority defaultLocaleAuthority) {
        int i = 0;
        this.stateListener = new StateListener(this, i);
        this.userSpeechListener = new UserSpeechListener(this, i);
        this.alexaServicesApis = alexaServicesApis;
        this.localeAuthority = defaultLocaleAuthority;
    }

    @Override // com.amazon.alexa.voice.ui.speech.AttentionSystemContract
    public AlexaStateProperty alexaState() {
        return this.alexaStateProperty;
    }

    public void initialize() {
        this.alexaServicesApis.registerLocalesListener(this.localeListener);
        this.alexaServicesApis.registerAlexaStateListener(this.stateListener);
        this.alexaServicesApis.registerUserSpeechListener(this.userSpeechListener);
    }

    public void release() {
        this.alexaServicesApis.deregisterLocalesListener(this.localeListener);
        this.alexaServicesApis.deregisterAlexaStateListener(this.stateListener);
        this.alexaServicesApis.deregisterUserSpeechListener(this.userSpeechListener);
        this.alexaStateProperty.set(AlexaState.IDLE);
    }

    @Override // com.amazon.alexa.voice.ui.speech.AttentionSystemContract
    public FloatProperty soundLevel() {
        return this.soundLevelProperty;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class StateListener implements AlexaStateListener {
        private StateListener() {
        }

        @Override // com.amazon.alexa.api.AlexaStateListener
        public void onAlexaStateChanged(@NonNull com.amazon.alexa.api.AlexaState alexaState) {
            switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$AlexaState[alexaState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    VoiceChromeModel.this.alexaStateProperty.set(AlexaState.LISTENING);
                    break;
                case 4:
                    VoiceChromeModel.this.alexaStateProperty.set(AlexaState.THINKING);
                    break;
                case 5:
                    VoiceChromeModel.this.alexaStateProperty.set(AlexaState.SPEAKING);
                    break;
                case 6:
                    VoiceChromeModel.this.alexaStateProperty.set(AlexaState.ERROR);
                    break;
                default:
                    VoiceChromeModel.this.alexaStateProperty.set(AlexaState.IDLE);
                    break;
            }
        }

        public /* synthetic */ StateListener(VoiceChromeModel voiceChromeModel, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class UserSpeechListener implements AlexaUserSpeechListener {
        private UserSpeechListener() {
        }

        @Override // com.amazon.alexa.api.AlexaUserSpeechListener
        public void onAlexaUserSpeechVolumeChanged(float f) {
            VoiceChromeModel.this.soundLevelProperty.set(f);
        }

        public /* synthetic */ UserSpeechListener(VoiceChromeModel voiceChromeModel, int i) {
            this();
        }
    }
}
