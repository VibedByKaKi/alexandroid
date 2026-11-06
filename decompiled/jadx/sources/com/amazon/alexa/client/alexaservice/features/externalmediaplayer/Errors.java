package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import com.amazon.alexa.ra.core.ui.custom.AnimationConstants;
import com.google.common.collect.ImmutableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Errors {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CapabilityAgentErrors {
        public static final PlayerError PLAYER_UNKNOWN = PlayerError.create(PlayerErrorName.PLAYER_UNKNOWN, "Unknown player id", 100, false);
        public static final PlayerError PLAYER_NOT_FOUND = PlayerError.create(PlayerErrorName.PLAYER_NOT_FOUND, "Player not found", 200, false);
        public static final PlayerError PLAYER_CONNECTION_REJECTED = PlayerError.create(PlayerErrorName.PLAYER_CONNECTION_REJECTED, "Connection rejected", 300, false);
        public static final PlayerError PLAYER_CONNECTION_TIMEOUT = PlayerError.create(PlayerErrorName.PLAYER_CONNECTION_TIMEOUT, "Connection to the player timed out", 400, false);
        public static final PlayerError OPERATION_UNSUPPORTED = PlayerError.create(PlayerErrorName.OPERATION_UNSUPPORTED, "The operation was not attempted becauseit is currently not supported.", 1000, false);
        public static final PlayerError APP_SUSPENDED = PlayerError.create(PlayerErrorName.APP_SUSPENDED, "The Alexa App was suspended", 4000, false);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CustomMediaSessionErrorCode {
        public static final int ERROR_CODE_STREAMING_UNAVAILABLE = 2700;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PlayerErrors {
        private static final ImmutableMap<Integer, PlayerError> ERROR_CODE_MAPPING;
        public static final PlayerError INTERNAL_ERROR;
        public static final PlayerError OPERATION_REJECTED_END_OF_QUEUE;
        public static final PlayerError OPERATION_REJECTED_SKIP_LIMIT;
        public static final PlayerError OPERATION_REJECTED_UNINTERRUPTIBLE;
        public static final PlayerError OPERATION_UNSUPPORTED;
        public static final PlayerError STREAMING_UNAVAILABLE;
        public static final PlayerError UNKNOWN_ERROR;
        public static final PlayerError UNPLAYABLE_BY_ACCOUNT;
        public static final PlayerError UNPLAYABLE_BY_AUTHORIZATION;
        public static final PlayerError UNPLAYABLE_BY_PARENTAL_CONTROL;
        public static final PlayerError UNPLAYABLE_BY_REGION;
        public static final PlayerError UNPLAYABLE_BY_STREAM_CONCURRENCY;
        public static final PlayerError UNPLAYABLE_BY_SUBSCRIPTION;

        static {
            PlayerError create = PlayerError.create(PlayerErrorName.OPERATION_UNSUPPORTED, "The operation was attempted, but it is currently not supported.", 1000L, true);
            OPERATION_UNSUPPORTED = create;
            PlayerError create2 = PlayerError.create(PlayerErrorName.OPERATION_REJECTED_END_OF_QUEUE, "The requested operation would go beyond the bounds of the current play queue.", 1100L, true);
            OPERATION_REJECTED_END_OF_QUEUE = create2;
            PlayerError create3 = PlayerError.create(PlayerErrorName.OPERATION_REJECTED_SKIP_LIMIT, "This account has reached the allowed limit of skips.", 1200L, true);
            OPERATION_REJECTED_SKIP_LIMIT = create3;
            PlayerError create4 = PlayerError.create(PlayerErrorName.OPERATION_REJECTED_UNINTERRUPTIBLE, "The current media is not interruptible.", AnimationConstants.ACTIONBAR_ANIMATION_DELAY, true);
            OPERATION_REJECTED_UNINTERRUPTIBLE = create4;
            PlayerError create5 = PlayerError.create(PlayerErrorName.UNPLAYABLE_BY_AUTHORIZATION, "An account must be logged in to play the requested content.", 2000L, true, true);
            UNPLAYABLE_BY_AUTHORIZATION = create5;
            PlayerError create6 = PlayerError.create(PlayerErrorName.UNPLAYABLE_BY_ACCOUNT, "The requested content is not available on this account.", 2100L, true);
            UNPLAYABLE_BY_ACCOUNT = create6;
            PlayerError create7 = PlayerError.create(PlayerErrorName.UNPLAYABLE_BY_SUBSCRIPTION, "The requested content is not available on this account's subscription level.", 2300L, true);
            UNPLAYABLE_BY_SUBSCRIPTION = create7;
            PlayerError create8 = PlayerError.create(PlayerErrorName.UNPLAYABLE_BY_STREAM_CONCURRENCY, "This account has reached the allowed limit of concurrent streams.", 2400L, true);
            UNPLAYABLE_BY_STREAM_CONCURRENCY = create8;
            PlayerError create9 = PlayerError.create(PlayerErrorName.UNPLAYABLE_BY_REGION, "The requested content is not available in the current region.", 2500L, true);
            UNPLAYABLE_BY_REGION = create9;
            PlayerError create10 = PlayerError.create(PlayerErrorName.UNPLAYABLE_BY_PARENTAL_CONTROL, "The requested content is not allowed due to the parental controls that are currently set.", 2600L, true);
            UNPLAYABLE_BY_PARENTAL_CONTROL = create10;
            PlayerError create11 = PlayerError.create(PlayerErrorName.STREAMING_UNAVAILABLE, "The requested content is not available because streaming is currently unavailable.", 2700L, true);
            STREAMING_UNAVAILABLE = create11;
            PlayerError create12 = PlayerError.create(PlayerErrorName.INTERNAL_ERROR, "An error occurred in the player's application.", 3000L, true);
            INTERNAL_ERROR = create12;
            PlayerError create13 = PlayerError.create(PlayerErrorName.UNKNOWN_ERROR, "An unknown error occurred.", 3100L, true);
            UNKNOWN_ERROR = create13;
            ERROR_CODE_MAPPING = ImmutableMap.builder().put(10, create6).put(1, create12).put(3, create5).put(5, create8).put(8, create4).put(11, create2).put(7, create9).put(2, create).put(6, create10).put(4, create7).put(9, create3).put(0, create13).put(Integer.valueOf(CustomMediaSessionErrorCode.ERROR_CODE_STREAMING_UNAVAILABLE), create11).build();
        }

        public static PlayerError forErrorCode(int i) {
            ImmutableMap<Integer, PlayerError> immutableMap = ERROR_CODE_MAPPING;
            return immutableMap.containsKey(Integer.valueOf(i)) ? immutableMap.get(Integer.valueOf(i)) : UNKNOWN_ERROR;
        }
    }
}
