package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MediaOperations {

    @VisibleForTesting
    static final int ACTION_SET_SHUFFLE_MODE = 2097152;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Favorite {
        FAVORITED,
        UNFAVORITED,
        NOT_RATED;

        public static Favorite valueOf(RatingCompat ratingCompat) {
            if (ratingCompat != null && ratingCompat.isRated() && ratingCompat.getRatingStyle() == 2) {
                if (ratingCompat.isThumbUp()) {
                    return FAVORITED;
                }
                if (!ratingCompat.isThumbUp()) {
                    return UNFAVORITED;
                }
            }
            return NOT_RATED;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MediaType {
        TRACK,
        PODCAST,
        STATION,
        AD,
        SAMPLE,
        OTHER;

        @Nullable
        public static MediaType safeValueOf(String str) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Repeat {
        REPEATED,
        ONE_REPEATED,
        NOT_REPEATED;

        public static Repeat valueOf(int i) {
            return i != 1 ? (i == 2 || i == 3) ? REPEATED : NOT_REPEATED : ONE_REPEATED;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Shuffle {
        SHUFFLED,
        NOT_SHUFFLED;

        public static Shuffle valueOf(int i) {
            return (i == 1 || i == 2) ? SHUFFLED : NOT_SHUFFLED;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        IDLE,
        PLAYING,
        PAUSED,
        STOPPED,
        FAST_FORWARDING,
        REWINDING,
        BUFFER_UNDERRUN;

        public static State valueOf(PlaybackStateCompat playbackStateCompat, boolean z) {
            if (playbackStateCompat == null) {
                return IDLE;
            }
            switch (playbackStateCompat.getState()) {
                case 9:
                case 10:
                case 11:
                    if (!z) {
                        break;
                    } else {
                        break;
                    }
            }
            return IDLE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SupportedOperations {
        Play,
        Pause,
        Stop,
        StartOver,
        Previous,
        Next,
        Rewind,
        FastForward,
        AdjustSeekPosition,
        SetSeekPosition,
        Favorite,
        Unfavorite,
        EnableShuffle,
        DisableShuffle,
        EnableRepeat,
        EnableRepeatOne,
        DisableRepeat;

        public static Set<SupportedOperations> getDefaults() {
            return new LinkedHashSet<SupportedOperations>(1) { // from class: com.amazon.alexa.client.alexaservice.features.externalmediaplayer.MediaOperations.SupportedOperations.1
                {
                    add(SupportedOperations.Play);
                }
            };
        }
    }

    public static Set<SupportedOperations> getSupportedOperations(long j) {
        HashSet hashSet = new HashSet();
        if ((4 & j) != 0) {
            hashSet.add(SupportedOperations.Play);
        }
        if ((2 & j) != 0) {
            hashSet.add(SupportedOperations.Pause);
        }
        if ((1 & j) != 0) {
            hashSet.add(SupportedOperations.Stop);
        }
        if ((16 & j) != 0) {
            hashSet.add(SupportedOperations.Previous);
        }
        if ((32 & j) != 0) {
            hashSet.add(SupportedOperations.Next);
        }
        if ((8 & j) != 0) {
            hashSet.add(SupportedOperations.Rewind);
        }
        if ((64 & j) != 0) {
            hashSet.add(SupportedOperations.FastForward);
        }
        if ((256 & j) != 0) {
            hashSet.add(SupportedOperations.AdjustSeekPosition);
            hashSet.add(SupportedOperations.SetSeekPosition);
            hashSet.add(SupportedOperations.StartOver);
        }
        if ((128 & j) != 0) {
            hashSet.add(SupportedOperations.Favorite);
            hashSet.add(SupportedOperations.Unfavorite);
        }
        if ((524288 & j) != 0 || (2097152 & j) != 0) {
            hashSet.add(SupportedOperations.EnableShuffle);
            hashSet.add(SupportedOperations.DisableShuffle);
        }
        if ((j & 262144) != 0) {
            hashSet.add(SupportedOperations.EnableRepeat);
            hashSet.add(SupportedOperations.DisableRepeat);
            hashSet.add(SupportedOperations.EnableRepeatOne);
        }
        return hashSet;
    }
}
