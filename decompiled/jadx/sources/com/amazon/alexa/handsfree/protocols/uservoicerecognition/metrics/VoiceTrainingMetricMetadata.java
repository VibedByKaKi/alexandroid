package com.amazon.alexa.handsfree.protocols.uservoicerecognition.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface VoiceTrainingMetricMetadata {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Component {
        VOICE_TRAINING
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EventType {
        UTTERANCE,
        CLICK,
        DISMISS,
        NEXT_STEP,
        PAGE_LOAD,
        BACK_BUTTON,
        LEAVE,
        NONE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PageType {
        TRAINING_START,
        TRAINING_PRIMER,
        TRAINING_PRIMER_SKIP_DIALOG,
        TRAINING_PRIMER_INTERNET_DIALOG,
        TRAINING_PRIMER_SPEAKER_ID_ALREADY_ENROLLED,
        TRAINING_START_CONFIRM_DIALOG,
        TRAINING_PRIMER_CONFIRM_DIALOG,
        TRAINING_MAIN,
        TRAINING_CANCEL_DIALOG,
        TRAINING_INTERNET_DIALOG,
        LOCK_SCREEN_CONFIRM_DIALOG,
        TRAINING_FINISH,
        TRAINING_GETTING_READY,
        TRAINING_GETTING_READY_GENERIC_TIMEOUT_ALERT,
        TRAINING_GETTING_READY_INTERNET_ALERT,
        TRAINING_PRIMER_START_ENROLLMENT_ERROR_DIALOG
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SubPageType {
        START_BUTTON,
        ALERT_DIALOG_POSITIVE_BUTTON,
        ALERT_DIALOG_NEGATIVE_BUTTON,
        ALERT_DIALOG_DISMISS,
        START_LATER_BUTTON,
        CONFIRM_START_BUTTON,
        CONFIRM_BACK_BUTTON,
        MAX_ERRORS_DIALOG,
        FINISH_LATER_BUTTON,
        DIALOG_CONFIRM_BUTTON,
        DIALOG_RETRY_BUTTON,
        DIALOG_SKIP_BUTTON,
        DONE_BUTTON,
        LOCK_SCREEN_ALLOW_BUTTON,
        LOCK_SCREEN_DENY_BUTTON,
        RADIO_LOCK_SCREEN_OFF,
        RADIO_LOCK_SCREEN_ON,
        TERMINAL_ERROR_DIALOG,
        DISCLAIMER_TEXT,
        VOICE_PRIVACY,
        NONE
    }
}
