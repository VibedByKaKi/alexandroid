package com.amazon.alexa.client.alexaservice.audio.core;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.AudioItemIdentifier;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.HttpHeaders;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.ProgressReport;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.Stream;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentIdentifier;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PlayItem {
    static final String CONTENT_ID_URI_PREFIX = "cid:";
    private final AudioItemIdentifier audioItemIdentifier;
    private final long endOffsetInMilliseconds;
    private final HttpHeaders httpHeaders;
    private final Stream.InterruptedBehavior interruptedBehavior;
    private final boolean isDrmContent;
    private final boolean isLoop;
    private final long position;
    private final ProgressReport progressReport;
    private final PlayToken token;
    private final Uri uri;

    public PlayItem(PlayToken playToken, Uri uri, long j, long j2, @Nullable AudioItemIdentifier audioItemIdentifier, @Nullable ProgressReport progressReport, @Nullable Stream.InterruptedBehavior interruptedBehavior, @Nullable HttpHeaders httpHeaders, boolean z, boolean z2) {
        this.token = playToken;
        if (audioItemIdentifier == null) {
            this.audioItemIdentifier = AudioItemIdentifier.EMPTY;
        } else {
            this.audioItemIdentifier = audioItemIdentifier;
        }
        this.uri = uri;
        this.position = j;
        this.endOffsetInMilliseconds = j2;
        this.progressReport = progressReport;
        this.httpHeaders = httpHeaders;
        if (interruptedBehavior == null) {
            this.interruptedBehavior = Stream.InterruptedBehavior.PAUSE;
        } else {
            this.interruptedBehavior = interruptedBehavior;
        }
        this.isLoop = z;
        this.isDrmContent = z2;
    }

    public static PlayItem create(PlayToken playToken, Uri uri, long j, long j2, @Nullable AudioItemIdentifier audioItemIdentifier, @Nullable ProgressReport progressReport, @Nullable Stream.InterruptedBehavior interruptedBehavior, @Nullable HttpHeaders httpHeaders, boolean z, boolean z2) {
        return new PlayItem(playToken, uri, j, j2, audioItemIdentifier, progressReport, interruptedBehavior, httpHeaders, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PlayItem playItem = (PlayItem) obj;
            if (this.position == playItem.position && this.endOffsetInMilliseconds == playItem.getEndOffsetInMilliseconds() && Objects.equals(this.token, playItem.token) && Objects.equals(this.uri, playItem.uri) && Objects.equals(this.audioItemIdentifier, playItem.audioItemIdentifier) && Objects.equals(this.progressReport, playItem.progressReport) && Objects.equals(this.interruptedBehavior, playItem.interruptedBehavior) && Objects.equals(this.httpHeaders, playItem.httpHeaders) && Boolean.valueOf(this.isDrmContent).equals(Boolean.valueOf(playItem.isDrmContent))) {
                return true;
            }
        }
        return false;
    }

    public AttachmentIdentifier getAttachmentIdentifier() {
        return AttachmentIdentifier.create(getUri().toString().substring(4));
    }

    public AudioItemIdentifier getAudioItemIdentifier() {
        return this.audioItemIdentifier;
    }

    public long getEndOffsetInMilliseconds() {
        return this.endOffsetInMilliseconds;
    }

    public HttpHeaders getHttpHeaders() {
        return this.httpHeaders;
    }

    public Stream.InterruptedBehavior getInterruptedBehavior() {
        return this.interruptedBehavior;
    }

    public long getPosition() {
        return this.position;
    }

    @Nullable
    public ProgressReport getProgressReport() {
        return this.progressReport;
    }

    public PlayToken getToken() {
        return this.token;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean hasAttachmentIdentifier() {
        return this.uri.toString().startsWith(CONTENT_ID_URI_PREFIX);
    }

    public boolean hasAudioItemIdentifier() {
        return this.audioItemIdentifier != null;
    }

    public boolean hasProgressReport() {
        return this.progressReport != null;
    }

    public int hashCode() {
        return Objects.hash(this.token, this.uri, Long.valueOf(this.position), this.progressReport, this.audioItemIdentifier, this.interruptedBehavior);
    }

    public boolean isDrmContent() {
        return this.isDrmContent;
    }

    public boolean isLoop() {
        return this.isLoop;
    }

    public static PlayItem create(PlayToken playToken, Uri uri, long j, @Nullable AudioItemIdentifier audioItemIdentifier, @Nullable ProgressReport progressReport, @Nullable Stream.InterruptedBehavior interruptedBehavior) {
        return create(playToken, uri, j, Long.MAX_VALUE, audioItemIdentifier, progressReport, interruptedBehavior, null, false, false);
    }

    public static PlayItem create(PlayToken playToken, Uri uri, long j) {
        return create(playToken, uri, j, Long.MAX_VALUE, null, null, Stream.InterruptedBehavior.PAUSE, null, false, false);
    }
}
