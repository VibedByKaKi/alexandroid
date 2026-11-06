package com.amazon.alexa.api;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes16.dex */
public abstract class ApiName {
    public static final ApiName NONE = create("");
    public static final ApiName SET_LOCALES = create(AlexaServicesMessageType.SET_LOCALES);
    public static final ApiName SEND_ALEXA_EVENT = create(AlexaServicesMessageType.SEND_ALEXA_EVENT);
    public static final ApiName REGISTER_DRIVE_MODE_LISTENER = create(AlexaServicesMessageType.REGISTER_DRIVE_MODE_LISTENER);
    public static final ApiName DEREGISTER_DRIVE_MODE_LISTENER = create(AlexaServicesMessageType.DEREGISTER_DRIVE_MODE_LISTENER);
    public static final ApiName SET_DRIVE_MODE_ENABLED = create(AlexaServicesMessageType.SET_DRIVE_MODE_ENABLED);
    public static final ApiName SET_DRIVE_MODE_STATE = create(AlexaServicesMessageType.SET_DRIVE_MODE_STATE);
    public static final ApiName SET_DRIVE_MODE_THEME = create(AlexaServicesMessageType.SET_DRIVE_MODE_THEME);
    public static final ApiName REGISTER_TEXT_RESPONSE_LISTENER = create(AlexaServicesMessageType.REGISTER_TEXT_RESPONSE_LISTENER);
    public static final ApiName DEREGISTER_TEXT_RESPONSE_LISTENER = create(AlexaServicesMessageType.DEREGISTER_TEXT_RESPONSE_LISTENER);
    public static final ApiName SEND_TEXT_MESSAGE = create(AlexaServicesMessageType.SEND_TEXT_MESSAGE);
    public static final ApiName SEND_STREAMING_TEXT_MESSAGE = create(AlexaServicesMessageType.SEND_STREAMING_TEXT_MESSAGE);
    public static final ApiName SCHEDULE_VISUAL_TASK = create(AlexaServicesMessageType.SCHEDULE_VISUAL_TASK);
    public static final ApiName UNSCHEDULE_VISUAL_TASK = create(AlexaServicesMessageType.UNSCHEDULE_VISUAL_TASK);
    public static final ApiName REGISTER_MEDIA_PLAYBACK_LISTENER = create(AlexaServicesMessageType.REGISTER_MEDIA_PLAYBACK_LISTENER);
    public static final ApiName DEREGISTER_MEDIA_PLAYBACK_LISTENER = create(AlexaServicesMessageType.DEREGISTER_MEDIA_PLAYBACK_LISTENER);
    public static final ApiName REGISTER_WAKE_WORD_LISTENER = create(AlexaServicesMessageType.REGISTER_WAKE_WORD_LISTENER);
    public static final ApiName DEREGISTER_WAKE_WORD_LISTENER = create(AlexaServicesMessageType.DEREGISTER_WAKE_WORD_LISTENER);
    public static final ApiName SET_WAKE_WORDS = create(AlexaServicesMessageType.SET_WAKE_WORDS);
    public static final ApiName REGISTER_ARTIFACT_DOWNLOAD_LISTENER = create(AlexaServicesMessageType.REGISTER_ARTIFACT_DOWNLOAD_LISTENER);
    public static final ApiName DEREGISTER_ARTIFACT_DOWNLOAD_LISTENER = create(AlexaServicesMessageType.DEREGISTER_ARTIFACT_DOWNLOAD_LISTENER);
    public static final ApiName SET_MEDIA_NOTIFICATION_CONTENT_INTENT = create(AlexaServicesMessageType.SET_MEDIA_NOTIFICATION_CONTENT_INTENT);
    public static final ApiName ENABLE_EXTERNAL_CAPABILITY_AGENT = create(AlexaServicesMessageType.ENABLE_EXTERNAL_CAPABILITY_AGENT);
    public static final ApiName DISABLE_EXTERNAL_CAPABILITY_AGENT = create(AlexaServicesMessageType.DISABLE_EXTERNAL_CAPABILITY_AGENT);
    public static final ApiName REGISTER_EXPECT_TEXT_LISTENER = create(AlexaServicesMessageType.REGISTER_EXPECT_TEXT_LISTENER);
    public static final ApiName DEREGISTER_EXPECT_TEXT_LISTENER = create(AlexaServicesMessageType.DEREGISTER_EXPECT_TEXT_LISTENER);
    public static final ApiName REGISTER_APL_COMMAND_LISTENER = create(AlexaServicesMessageType.REGISTER_APL_COMMAND_LISTENER);
    public static final ApiName DEREGISTER_APL_COMMAND_LISTENER = create(AlexaServicesMessageType.DEREGISTER_APL_COMMAND_LISTENER);
    public static final ApiName REGISTER_LIVE_PREVIEW_LISTENER = create(AlexaServicesMessageType.REGISTER_LIVE_PREVIEW_LISTENER);
    public static final ApiName DEREGISTER_LIVE_PREVIEW_LISTENER = create(AlexaServicesMessageType.DEREGISTER_LIVE_PREVIEW_LISTENER);
    public static final ApiName REGISTER_CONFIGURATION_CHANGE_LISTENER = create(AlexaServicesMessageType.REGISTER_CONFIGURATION_CHANGE_LISTENER);
    public static final ApiName DEREGISTER_CONFIGURATION_CHANGE_LISTENER = create(AlexaServicesMessageType.DEREGISTER_CONFIGURATION_CHANGE_LISTENER);
    public static final ApiName UPDATE_CONVERSATIONS = create(AlexaServicesMessageType.UPDATE_CONVERSATIONS);
    public static final ApiName REGISTER_CONVERSATIONS_LISTENER = create(AlexaServicesMessageType.REGISTER_CONVERSATIONS_LISTENER);
    public static final ApiName DEREGISTER_CONVERSATIONS_LISTENER = create(AlexaServicesMessageType.DEREGISTER_CONVERSATIONS_LISTENER);
    public static final ApiName GET_FRAGMENTS = create(AlexaServicesMessageType.GET_FRAGMENTS);
    public static final ApiName GET_ITEM_FRAGMENTS = create(AlexaServicesMessageType.GET_ITEM_FRAGMENTS);
    public static final ApiName REGISTER_FRAGMENTS_LISTENER = create(AlexaServicesMessageType.REGISTER_FRAGMENTS_LISTENER);
    public static final ApiName DEREGISTER_FRAGMENTS_LISTENER = create(AlexaServicesMessageType.DEREGISTER_FRAGMENTS_LISTENER);
    public static final ApiName DELETE_CONVERSATIONS = create(AlexaServicesMessageType.DELETE_CONVERSATIONS);
    public static final ApiName DELETE_FRAGMENTS = create(AlexaServicesMessageType.DELETE_FRAGMENTS);
    public static final ApiName SEND_CONVERSATION_EVENT = create(AlexaServicesMessageType.SEND_CONVERSATION_EVENT);
    public static final ApiName SET_USER_PROFILE = create(AlexaServicesMessageType.SET_USER_PROFILE);
    public static final ApiName REGISTER_USER_PROFILE_LISTENER = create(AlexaServicesMessageType.REGISTER_USER_PROFILE_LISTENER);
    public static final ApiName DEREGISTER_USER_PROFILE_LISTENER = create(AlexaServicesMessageType.DEREGISTER_USER_PROFILE_LISTENER);
    public static final ApiName REGISTER_CAMERA = create(AlexaServicesMessageType.REGISTER_CAMERA);
    public static final ApiName DEREGISTER_CAMERA = create(AlexaServicesMessageType.DEREGISTER_CAMERA);
    public static final ApiName REGISTER_NATURAL_TURN_CONTROLLER = create(AlexaServicesMessageType.REGISTER_NATURAL_TURN_CONTROLLER);
    public static final ApiName DEREGISTER_NATURAL_TURN_CONTROLLER = create(AlexaServicesMessageType.DEREGISTER_NATURAL_TURN_CONTROLLER);
    public static final ApiName REQUEST_NATURAL_TURN_SESSION = create(AlexaServicesMessageType.REQUEST_NATURAL_TURN_SESSION);
    public static final ApiName REGISTER_ENDPOINT = create(AlexaServicesMessageType.REGISTER_ENDPOINT);
    public static final ApiName DEREGISTER_ENDPOINT = create(AlexaServicesMessageType.DEREGISTER_ENDPOINT);
    public static final ApiName SET_ENDPOINT_SOUND_ENABLED = create(AlexaServicesMessageType.SET_ENDPOINT_SOUND_ENABLED);
    public static final ApiName SET_WAKE_SOUND_ENABLED = create(AlexaServicesMessageType.SET_WAKE_SOUND_ENABLED);

    public static ApiName create(AlexaServicesMessageType alexaServicesMessageType) {
        return create(alexaServicesMessageType.name());
    }

    public abstract String getValue();

    public static ApiName create(String str) {
        return new AutoValue_ApiName(str);
    }
}
