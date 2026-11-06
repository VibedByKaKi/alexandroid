package com.amazon.alexa.assistant.foundation.audio;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.foundation.audio.drm.WidevineInfo;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.contacts.common.constants.Constants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u0004./01Ba\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010#\u001a\u0002H$\"\u0004\b\u0000\u0010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H$0&¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u0002H$\"\u0006\b\u0000\u0010$\u0018\u0001H\u0086\b¢\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioItem;", "", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "", "token", "source", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source;", "startOffsetInMilliseconds", "", "fileUri", "Landroid/net/Uri;", "widevineInfo", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineInfo;", "streamedSource", "Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource;", "cachedFile", "Ljava/io/File;", "encodedContent", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source;ILandroid/net/Uri;Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineInfo;Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource;Ljava/io/File;Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "getMediaId", "()Ljava/lang/String;", "getToken", "getSource", "()Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source;", "getStartOffsetInMilliseconds", "()I", "getFileUri", "()Landroid/net/Uri;", "getWidevineInfo", "()Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineInfo;", "getStreamedSource", "()Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource;", "decodeContent", ExifInterface.GPS_DIRECTION_TRUE, "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "decodeContentTyped", "()Ljava/lang/Object;", "clearCachedItem", "", "hasCachedFile", "", AlexaMetricsConstants.EventConstants.SOURCE, "Builder", "Companion", "ContentException", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AudioItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "AudioItem";

    @Nullable
    private final File cachedFile;

    @Nullable
    private final String encodedContent;

    @NotNull
    private final Uri fileUri;

    @NotNull
    private final Logger logger;

    @NotNull
    private final String mediaId;

    @NotNull
    private final Source source;
    private final int startOffsetInMilliseconds;

    @Nullable
    private final StreamedAudioSource streamedSource;

    @NotNull
    private final String token;

    @Nullable
    private final WidevineInfo widevineInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000fJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Builder;", "", "source", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source;", "token", "", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source;Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "content", "startOffsetInMilliseconds", "", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "cacheDirectory", "Ljava/io/File;", "widevineInfo", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineInfo;", "streamedSource", "Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource;", "withContent", "withStartOffset", "offsetMs", "withMediaId", "id", "withCacheDirectory", "directory", "withWidevineInfo", LogLevel.INFO, "withStreamedSource", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAudioItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioItem.kt\ncom/amazon/alexa/assistant/foundation/audio/AudioItem$Builder\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,349:1\n29#2:350\n*S KotlinDebug\n*F\n+ 1 AudioItem.kt\ncom/amazon/alexa/assistant/foundation/audio/AudioItem$Builder\n*L\n233#1:350\n*E\n"})
    public static final class Builder {

        @Nullable
        private File cacheDirectory;

        @Nullable
        private String content;

        @NotNull
        private final Logger logger;

        @NotNull
        private String mediaId;

        @NotNull
        private final Source source;
        private int startOffsetInMilliseconds;

        @Nullable
        private StreamedAudioSource streamedSource;

        @NotNull
        private final String token;

        @Nullable
        private WidevineInfo widevineInfo;

        public Builder(@NotNull Source source, @NotNull String str, @NotNull Logger logger) {
            source.getClass();
            str.getClass();
            logger.getClass();
            this.source = source;
            this.token = str;
            this.logger = logger;
            this.mediaId = TableInfo$$ExternalSyntheticOutline0.m();
        }

        @NotNull
        public final AudioItem build() {
            Source source = this.source;
            if (!(source instanceof Source.StreamURL) && this.streamedSource != null) {
                Single$$ExternalSyntheticBUOutline0.m$3("streamedSource must be paired with Source.StreamURL, not Source.Data");
                return null;
            }
            String str = this.content;
            if (!(source instanceof Source.Data)) {
                if (!(source instanceof Source.StreamURL)) {
                    PathKt$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                String str2 = this.mediaId;
                String str3 = this.token;
                Source source2 = this.source;
                return new AudioItem(str2, str3, source2, this.startOffsetInMilliseconds, Uri.parse(((Source.StreamURL) source2).getUrl()), this.widevineInfo, this.streamedSource, null, str, this.logger, null);
            }
            File file = this.cacheDirectory;
            if (file == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("Cache directory must be set for Source.Data");
                return null;
            }
            if (!file.exists() && !file.mkdirs()) {
                PathKt$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m("Failed to create cache directory: ", file.getAbsolutePath()));
                return null;
            }
            File file2 = new File(file, UUID.randomUUID() + ".mp3");
            try {
                FilesKt.writeBytes(file2, ((Source.Data) this.source).getData());
                Logger.DefaultImpls.info$default(this.logger, AudioItem.TAG, "Cached audio to file: " + file2.getAbsolutePath() + " (" + ((Source.Data) this.source).getData().length + " bytes)", null, 4, null);
                String str4 = this.mediaId;
                String str5 = this.token;
                Source source3 = this.source;
                int i = this.startOffsetInMilliseconds;
                Uri fromFile = Uri.fromFile(file2);
                fromFile.getClass();
                return new AudioItem(str4, str5, source3, i, fromFile, this.widevineInfo, this.streamedSource, file2, str, this.logger, null);
            } catch (Exception e) {
                this.logger.error(AudioItem.TAG, "Failed to write audio to cache", e);
                file2.delete();
                throw e;
            }
        }

        @NotNull
        public final Builder withCacheDirectory(@NotNull File directory) {
            directory.getClass();
            this.cacheDirectory = directory;
            return this;
        }

        @NotNull
        public final Builder withContent(@NotNull String content) {
            content.getClass();
            this.content = content;
            return this;
        }

        @NotNull
        public final Builder withMediaId(@NotNull String id) {
            id.getClass();
            this.mediaId = id;
            return this;
        }

        @NotNull
        public final Builder withStartOffset(int offsetMs) {
            this.startOffsetInMilliseconds = offsetMs;
            return this;
        }

        @NotNull
        public final Builder withStreamedSource(@NotNull StreamedAudioSource source) {
            source.getClass();
            this.streamedSource = source;
            return this;
        }

        @NotNull
        public final Builder withWidevineInfo(@NotNull WidevineInfo info) {
            info.getClass();
            this.widevineInfo = info;
            return this;
        }
    }

    private AudioItem(String str, String str2, Source source, int i, Uri uri, WidevineInfo widevineInfo, StreamedAudioSource streamedAudioSource, File file, String str3, Logger logger) {
        this.mediaId = str;
        this.token = str2;
        this.source = source;
        this.startOffsetInMilliseconds = i;
        this.fileUri = uri;
        this.widevineInfo = widevineInfo;
        this.streamedSource = streamedAudioSource;
        this.cachedFile = file;
        this.encodedContent = str3;
        this.logger = logger;
    }

    public final void clearCachedItem() {
        File file = this.cachedFile;
        if (file != null) {
            try {
                if (file.exists()) {
                    boolean delete = file.delete();
                    Logger logger = this.logger;
                    if (delete) {
                        Logger.DefaultImpls.info$default(logger, TAG, "Deleted cached audio file: " + file.getAbsolutePath(), null, 4, null);
                    } else {
                        Logger.DefaultImpls.warn$default(logger, TAG, "Failed to delete cached audio file: " + file.getAbsolutePath(), null, 4, null);
                    }
                } else {
                    Logger.DefaultImpls.debug$default(this.logger, TAG, "Cached audio file already deleted: " + file.getAbsolutePath(), null, 4, null);
                }
            } catch (Exception e) {
                this.logger.error(TAG, "Error deleting cached audio file", e);
            }
        }
    }

    public final <T> T decodeContent(@NotNull Class<T> type) {
        type.getClass();
        String str = this.encodedContent;
        if (str == null) {
            throw new ContentException.MissingContent("No content was stored with this AudioItem");
        }
        try {
            Json.Companion companion = Json.INSTANCE;
            return (T) companion.decodeFromString(SerializersKt.serializer(companion.getSerializersModule(), type), str);
        } catch (Exception e) {
            this.logger.error(TAG, "Failed to decode content", e);
            throw e;
        }
    }

    public final /* synthetic */ <T> T decodeContentTyped() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) decodeContent(Object.class);
    }

    @NotNull
    public final Uri getFileUri() {
        return this.fileUri;
    }

    @NotNull
    public final String getMediaId() {
        return this.mediaId;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    public final int getStartOffsetInMilliseconds() {
        return this.startOffsetInMilliseconds;
    }

    @Nullable
    public final StreamedAudioSource getStreamedSource() {
        return this.streamedSource;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final WidevineInfo getWidevineInfo() {
        return this.widevineInfo;
    }

    public final boolean hasCachedFile() {
        File file = this.cachedFile;
        return file != null && file.exists();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "builder", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Builder;", "source", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source;", "token", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "getDefaultCacheDirectory", "Ljava/io/File;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder(@NotNull Source source, @NotNull String token, @NotNull Logger logger) {
            source.getClass();
            token.getClass();
            logger.getClass();
            return new Builder(source, token, logger);
        }

        @NotNull
        public final File getDefaultCacheDirectory() {
            File file = new File(System.getProperty("java.io.tmpdir"), "alexa_audio_cache");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            PathKt$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m("Failed to create cache directory: ", file.getAbsolutePath()));
            return null;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$ContentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "MissingContent", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$ContentException$MissingContent;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ContentException extends Exception {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$ContentException$MissingContent;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$ContentException;", "message", "", "<init>", "(Ljava/lang/String;)V", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MissingContent extends ContentException {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MissingContent(@NotNull String str) {
                super(str, null);
                str.getClass();
            }
        }

        public /* synthetic */ ContentException(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private ContentException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source;", "", "<init>", "()V", "Data", "StreamURL", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source$Data;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source$StreamURL;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Source {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source$StreamURL;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class StreamURL extends Source {

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StreamURL(@NotNull String str) {
                super(null);
                str.getClass();
                this.url = str;
            }

            public static /* synthetic */ StreamURL copy$default(StreamURL streamURL, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = streamURL.url;
                }
                return streamURL.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @NotNull
            public final StreamURL copy(@NotNull String url) {
                url.getClass();
                return new StreamURL(url);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StreamURL) && Intrinsics.areEqual(this.url, ((StreamURL) other).url);
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            @NotNull
            public String toString() {
                return a$$ExternalSyntheticOutline0.m("StreamURL(url=", this.url, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        public /* synthetic */ Source(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Source() {
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source$Data;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem$Source;", "data", "", "contentType", "", "<init>", "([BLjava/lang/String;)V", "getData", "()[B", "getContentType", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "component1", "component2", "copy", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Data extends Source {

            @NotNull
            private final String contentType;

            @NotNull
            private final byte[] data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Data(@NotNull byte[] bArr, @NotNull String str) {
                super(null);
                bArr.getClass();
                str.getClass();
                this.data = bArr;
                this.contentType = str;
            }

            public static /* synthetic */ Data copy$default(Data data, byte[] bArr, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    bArr = data.data;
                }
                if ((i & 2) != 0) {
                    str = data.contentType;
                }
                return data.copy(bArr, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final byte[] getData() {
                return this.data;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getContentType() {
                return this.contentType;
            }

            @NotNull
            public final Data copy(@NotNull byte[] data, @NotNull String contentType) {
                data.getClass();
                contentType.getClass();
                return new Data(data, contentType);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!Intrinsics.areEqual(Data.class, other != null ? other.getClass() : null)) {
                    return false;
                }
                other.getClass();
                Data data = (Data) other;
                return Arrays.equals(this.data, data.data) && Intrinsics.areEqual(this.contentType, data.contentType);
            }

            @NotNull
            public final String getContentType() {
                return this.contentType;
            }

            @NotNull
            public final byte[] getData() {
                return this.data;
            }

            public int hashCode() {
                return this.contentType.hashCode() + (Arrays.hashCode(this.data) * 31);
            }

            @NotNull
            public String toString() {
                return a$$ExternalSyntheticOutline0.m("Data(data=", Arrays.toString(this.data), ", contentType=", this.contentType, MarkdownConstants.RIGHT_PARENTHESIS);
            }

            public /* synthetic */ Data(byte[] bArr, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(bArr, (i & 2) != 0 ? "audio/mpeg" : str);
            }
        }
    }

    public /* synthetic */ AudioItem(String str, String str2, Source source, int i, Uri uri, WidevineInfo widevineInfo, StreamedAudioSource streamedAudioSource, File file, String str3, Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, source, i, uri, widevineInfo, streamedAudioSource, file, str3, logger);
    }
}
