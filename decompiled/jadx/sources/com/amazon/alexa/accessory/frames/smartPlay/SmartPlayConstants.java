package com.amazon.alexa.accessory.frames.smartPlay;

import com.amazon.alexa.accessory.frames.msp.models.SupportedMSP;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class SmartPlayConstants {
    public static final String ASSETS_FOLDER_PATH = "/assets/";
    public static final String LOOP_BACK_EARCON = "loop_back_earcon.mp3";
    public static final String LOOP_BACK_INSTRUCTION_TTS = "loop_back_tts.mp3";
    public static final String LOOP_BACK_INSTRUCTION_V2_TTS = "loop_back_v2_tts.mp3";
    public static final String SMART_PLAY_ACTION_PLAY_TYPE_KEY = "play";
    public static final String SMART_PLAY_CONTENT_TOKEN_TYPE_AMAZON_KEY = "identifierType";
    public static final String SMART_PLAY_CONTENT_TOKEN_TYPE_PANDORA_KEY = "si";
    public static final String SMART_PLAY_CONTENT_TOKEN_TYPE_PLAYLIST_PREFIX_AMAZON = "PLAYLIST_ID";
    public static final String SMART_PLAY_CONTENT_TOKEN_TYPE_PLAYLIST_PREFIX_PANDORA = "PL";
    public static final String SMART_PLAY_CONTENT_TOKEN_TYPE_STATION_PREFIX_AMAZON = "STATION_KEY";
    public static final String SMART_PLAY_CONTENT_TOKEN_TYPE_STATION_PREFIX_PANDORA = "ST";
    public static final String SMART_PLAY_EARCON = "smart_play_earcon.mp3";
    public static final String SMART_PLAY_FEATURE_EDUCATION_COMPLETE_KEY = "SmartPlayFeatureEducationComplete";
    public static final String SMART_PLAY_INSTRUCTION_TTS = "smart_play_tts.mp3";
    public static final String SMART_PLAY_INSTRUCTION_V2_TTS = "smart_play_v2_tts.mp3";
    public static final String SMART_PLAY_JSON_PAYLOAD_FIELD_DEVICETYPE = "deviceType";
    public static final String SMART_PLAY_JSON_PAYLOAD_FIELD_DSN = "deviceSerialNumber";
    public static final String SMART_PLAY_LOOP_EDUCATION_COMPLETE_KEY = "SmartPlayLoopEducationComplete";
    public static final String SMART_PLAY_MEDIALIST_JSON_FIELD_MEDIAS = "medias";
    public static final String SMART_PLAY_MEDIALIST_JSON_FIELD_NEXTPAGETOKEN = "nextPageToken";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_ACTIONURL = "actionUrl";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_IMAGESINFO = "imagesInfo";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_IMAGETYPE = "type";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_IMAGEURL = "url";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_ISPRESET = "isPreset";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_MEDIATOKEN = "mediaToken";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_PAYLOADTEMPLATE = "payloadTemplate";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_PROVIDERID = "providerId";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_SUBTITLE = "subtitle";
    public static final String SMART_PLAY_MEDIA_JSON_FIELD_TITLE = "title";
    public static final String SMART_PLAY_NOT_CONDITION_PREFIX = "not";
    public static final String SMART_PLAY_SCREEN_PAYLOAD_RECENTLY_PLAYED_SECTION = "RECENTLY_PLAYED";
    public static final Integer DURATION_GAP_OF_30_SECONDS = Integer.valueOf(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT);
    public static final Set<SupportedMSP> MSP_SUPPORTED_SMART_PLAY_CUSTOM = ImmutableSet.of(SupportedMSP.AMAZON_MUSIC, SupportedMSP.PANDORA);

    private SmartPlayConstants() {
    }
}
