package com.amazon.mobile.heremapsexplore.Factories;

import android.graphics.Bitmap;
import com.amazon.alexa.font.Font;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import com.amazon.mobile.heremapsexplore.Constants.Resources;
import com.amazon.mobile.heremapsexplore.Factories.Builders.FindMyDeviceImageBuilder;
import com.amazon.mobile.heremapsexplore.R;
import com.amazon.mobile.heremapsexplore.Utilities.ImageUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openjdk.tools.javac.jvm.ByteCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ImageFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Factories.ImageFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId;

        static {
            int[] iArr = new int[ImageId.values().length];
            $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId = iArr;
            try {
                iArr[ImageId.SMALL_ACTIVE_FETCH_ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_FETCH_ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_TILE_ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_TILE_ICON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_ECHO_AUTO_ICON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_ECHO_AUTO_ICON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_LEFT_BUD_ICON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_LEFT_BUD_V2_ICON.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_LEFT_BUD_ICON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_LEFT_BUD_V2_ICON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_RIGHT_BUD_ICON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_RIGHT_BUD_V2_ICON.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_RIGHT_BUD_ICON.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_RIGHT_BUD_V2_ICON.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_ECHO_BUD_ICON.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_ECHO_BUD_V2_ICON.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_ECHO_BUD_ICON.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_ECHO_BUD_V2_ICON.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_SMART_THINGS_ICON.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_SMART_THINGS_ICON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_ECHO_FRAMES_ICON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_ECHO_FRAMES_ICON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_REMOTE_CONTROL_ICON.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_REMOTE_CONTROL_ICON.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_DEFAULT_ICON.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_DEFAULT_ICON.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_SAMSUNG_PHONE_ICON.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_SAMSUNG_PHONE_ICON.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_SAMSUNG_WATCH_ICON.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_SAMSUNG_WATCH_ICON.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_SAMSUNG_TABLET_ICON.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_SAMSUNG_TABLET_ICON.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_SAMSUNG_BUDS_LEFT_ICON.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_SAMSUNG_BUDS_LEFT_ICON.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_ACTIVE_FIRE_TABLET_ICON.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.SMALL_INACTIVE_FIRE_TABLET_ICON.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_FETCH_ICON.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_FETCH_ICON.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_TILE_ICON.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_TILE_ICON.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_ECHO_AUTO_ICON.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_ECHO_AUTO_ICON.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_ECHO_BUD_ICON.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_ECHO_BUD_V2_ICON.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_ECHO_BUD_ICON.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_ECHO_BUD_V2_ICON.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_LEFT_BUD_ICON.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_LEFT_BUD_V2_ICON.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_LEFT_BUD_ICON.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_LEFT_BUD_V2_ICON.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_RIGHT_BUD_ICON.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_RIGHT_BUD_V2_ICON.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_RIGHT_BUD_ICON.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_RIGHT_BUD_V2_ICON.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_SMART_THINGS_ICON.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_SMART_THINGS_ICON.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_ECHO_FRAMES_ICON.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_ECHO_FRAMES_ICON.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_REMOTE_CONTROL_ICON.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_REMOTE_CONTROL_ICON.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_DEFAULT_ICON.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_DEFAULT_ICON.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_SAMSUNG_PHONE_ICON.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_SAMSUNG_PHONE_ICON.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_SAMSUNG_WATCH_ICON.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_SAMSUNG_WATCH_ICON.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_SAMSUNG_TABLET_ICON.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_SAMSUNG_TABLET_ICON.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_SAMSUNG_BUDS_LEFT_ICON.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_SAMSUNG_BUDS_LEFT_ICON.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_ACTIVE_FIRE_TABLET_ICON.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.LARGE_INACTIVE_FIRE_TABLET_ICON.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.CLUSTER_ICON.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                $SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[ImageId.BLUE_FILL_BLACK_STROKE_USER_LOCATION.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ImageId {
        SMALL_ACTIVE_FETCH_ICON,
        SMALL_ACTIVE_TILE_ICON,
        SMALL_ACTIVE_ECHO_AUTO_ICON,
        SMALL_ACTIVE_LEFT_BUD_ICON,
        SMALL_ACTIVE_RIGHT_BUD_ICON,
        SMALL_ACTIVE_ECHO_BUD_ICON,
        SMALL_ACTIVE_LEFT_BUD_V2_ICON,
        SMALL_ACTIVE_RIGHT_BUD_V2_ICON,
        SMALL_ACTIVE_ECHO_BUD_V2_ICON,
        SMALL_ACTIVE_SMART_THINGS_ICON,
        SMALL_ACTIVE_ECHO_FRAMES_ICON,
        SMALL_ACTIVE_REMOTE_CONTROL_ICON,
        SMALL_ACTIVE_DEFAULT_ICON,
        SMALL_ACTIVE_SAMSUNG_WATCH_ICON,
        SMALL_ACTIVE_SAMSUNG_PHONE_ICON,
        SMALL_ACTIVE_SAMSUNG_TABLET_ICON,
        SMALL_ACTIVE_SAMSUNG_BUDS_LEFT_ICON,
        SMALL_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON,
        SMALL_ACTIVE_FIRE_TABLET_ICON,
        SMALL_INACTIVE_FETCH_ICON,
        SMALL_INACTIVE_TILE_ICON,
        SMALL_INACTIVE_ECHO_AUTO_ICON,
        SMALL_INACTIVE_LEFT_BUD_ICON,
        SMALL_INACTIVE_RIGHT_BUD_ICON,
        SMALL_INACTIVE_ECHO_BUD_ICON,
        SMALL_INACTIVE_LEFT_BUD_V2_ICON,
        SMALL_INACTIVE_RIGHT_BUD_V2_ICON,
        SMALL_INACTIVE_ECHO_BUD_V2_ICON,
        SMALL_INACTIVE_SMART_THINGS_ICON,
        SMALL_INACTIVE_ECHO_FRAMES_ICON,
        SMALL_INACTIVE_REMOTE_CONTROL_ICON,
        SMALL_INACTIVE_DEFAULT_ICON,
        SMALL_INACTIVE_SAMSUNG_WATCH_ICON,
        SMALL_INACTIVE_SAMSUNG_PHONE_ICON,
        SMALL_INACTIVE_SAMSUNG_TABLET_ICON,
        SMALL_INACTIVE_SAMSUNG_BUDS_LEFT_ICON,
        SMALL_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON,
        SMALL_INACTIVE_FIRE_TABLET_ICON,
        LARGE_ACTIVE_FETCH_ICON,
        LARGE_ACTIVE_TILE_ICON,
        LARGE_ACTIVE_ECHO_AUTO_ICON,
        LARGE_ACTIVE_LEFT_BUD_ICON,
        LARGE_ACTIVE_RIGHT_BUD_ICON,
        LARGE_ACTIVE_ECHO_BUD_ICON,
        LARGE_ACTIVE_LEFT_BUD_V2_ICON,
        LARGE_ACTIVE_RIGHT_BUD_V2_ICON,
        LARGE_ACTIVE_ECHO_BUD_V2_ICON,
        LARGE_ACTIVE_SMART_THINGS_ICON,
        LARGE_ACTIVE_ECHO_FRAMES_ICON,
        LARGE_ACTIVE_REMOTE_CONTROL_ICON,
        LARGE_ACTIVE_DEFAULT_ICON,
        LARGE_ACTIVE_SAMSUNG_WATCH_ICON,
        LARGE_ACTIVE_SAMSUNG_PHONE_ICON,
        LARGE_ACTIVE_SAMSUNG_TABLET_ICON,
        LARGE_ACTIVE_SAMSUNG_BUDS_LEFT_ICON,
        LARGE_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON,
        LARGE_ACTIVE_FIRE_TABLET_ICON,
        LARGE_INACTIVE_FETCH_ICON,
        LARGE_INACTIVE_TILE_ICON,
        LARGE_INACTIVE_ECHO_AUTO_ICON,
        LARGE_INACTIVE_LEFT_BUD_ICON,
        LARGE_INACTIVE_RIGHT_BUD_ICON,
        LARGE_INACTIVE_ECHO_BUD_ICON,
        LARGE_INACTIVE_LEFT_BUD_V2_ICON,
        LARGE_INACTIVE_RIGHT_BUD_V2_ICON,
        LARGE_INACTIVE_ECHO_BUD_V2_ICON,
        LARGE_INACTIVE_SMART_THINGS_ICON,
        LARGE_INACTIVE_ECHO_FRAMES_ICON,
        LARGE_INACTIVE_REMOTE_CONTROL_ICON,
        LARGE_INACTIVE_DEFAULT_ICON,
        LARGE_INACTIVE_SAMSUNG_WATCH_ICON,
        LARGE_INACTIVE_SAMSUNG_PHONE_ICON,
        LARGE_INACTIVE_SAMSUNG_TABLET_ICON,
        LARGE_INACTIVE_SAMSUNG_BUDS_LEFT_ICON,
        LARGE_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON,
        LARGE_INACTIVE_FIRE_TABLET_ICON,
        CLUSTER_ICON,
        BLUE_FILL_BLACK_STROKE_USER_LOCATION
    }

    public static Bitmap getImage(ImageId imageId, Map map) {
        switch (AnonymousClass1.$SwitchMap$com$amazon$mobile$heremapsexplore$Factories$ImageFactory$ImageId[imageId.ordinal()]) {
            case 1:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_tracker_pet_24dp)).withWhiteCircle(false).build();
            case 2:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_tracker_pet_24dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 3:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().cropImage(ImageUtils.getInstance().loadImage(R.drawable.ic_app_tile_24dp), 0, 0, 6, 6)).build();
            case 4:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().cropImage(ImageUtils.getInstance().loadImage(R.drawable.ic_app_tile_24dp), 0, 0, 6, 6)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 5:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_by_car_24dp)).withWhiteCircle(false).build();
            case 6:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_by_car_24dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 7:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("L", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).build();
            case 8:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("L", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).build();
            case 9:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("L", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 10:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("L", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 11:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("R", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).build();
            case 12:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("R", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).build();
            case 13:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("R", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 14:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("R", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 15:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_earbuds_24dp)).withWhiteCircle(false).build();
            case 16:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_earbud_gen_2_24dp)).withWhiteCircle(false).build();
            case 17:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_earbuds_24dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 18:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_earbud_gen_2_24dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 19:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_smartthings_24dp)).withWhiteCircle(false).build();
            case 20:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_smartthings_24dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 21:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_echo_frames_24dp)).withWhiteCircle(false).build();
            case 22:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_echo_frames_24dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 23:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_remote_24dp)).withWhiteCircle(false).build();
            case 24:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_remote_24dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 25:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_pin_24dp)).withWhiteCircle(false).build();
            case 26:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_pin_24dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 27:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_phone)).withWhiteCircle(false).build();
            case 28:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_phone)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 29:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_watch)).withWhiteCircle(false).build();
            case 30:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_watch)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 31:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_tablet)).withWhiteCircle(false).build();
            case 32:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_tablet)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 33:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_buds_left)).withWhiteCircle(false).build();
            case 34:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_buds_left)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 35:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_buds_right)).withWhiteCircle(false).build();
            case 36:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_buds_right)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 37:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_tablet_24dp)).withWhiteCircle(false).build();
            case 38:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_tablet_24dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 39:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_tracker_pet_36dp, -1)).withWhiteCircle(false).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).build();
            case 40:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_tracker_pet_36dp, -1)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).build();
            case 41:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().cropImage(ImageUtils.getInstance().loadImage(R.drawable.ic_app_tile_30dp), 0, 0, 6, 6)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).build();
            case 42:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().cropImage(ImageUtils.getInstance().loadImage(R.drawable.ic_app_tile_30dp), 0, 0, 6, 6)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).build();
            case 43:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_by_car_36dp, -1)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 44:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_by_car_36dp, -1)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 45:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_earbuds_30dp, -1)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 46:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_earbud_gen_2_36dp, -1)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 47:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_earbuds_30dp, -1)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 48:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_earbud_gen_2_36dp, -1)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 49:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("L", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).build();
            case 50:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("L", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).build();
            case 51:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("L", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 52:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("L", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 53:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("R", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).build();
            case 54:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("R", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).build();
            case 55:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("R", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 56:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText("R", Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 57:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_smartthings_36dp)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 58:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_smartthings_36dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 59:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_echo_frames_36dp)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 60:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_echo_frames_36dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 61:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_remote_36dp)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 62:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_remote_36dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 63:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_pin_36dp, -1)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 64:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImageWithTintColor(R.drawable.ic_pin_36dp, -1)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).build();
            case 65:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_phone)).withWhiteCircle(false).build();
            case 66:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_phone)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 67:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_watch)).withWhiteCircle(false).build();
            case 68:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_watch)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 69:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_tablet)).withWhiteCircle(false).build();
            case 70:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_tablet)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 71:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_buds_left)).withWhiteCircle(false).build();
            case 72:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_buds_left)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 73:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_buds_right)).withWhiteCircle(false).build();
            case 74:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_samsung_buds_right)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withWhiteCircle(false).build();
            case 75:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_tablet_36dp)).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case 76:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().loadImage(R.drawable.ic_tablet_36dp)).withState(FindMyDeviceImageBuilder.DeviceState.INACTIVE).withSize(FindMyDeviceImageBuilder.DeviceImageSize.LARGE).withWhiteCircle(false).build();
            case ByteCodes.astore_2 /* 77 */:
                return FindMyDeviceImageBuilder.newBuilder().withForeground(ImageUtils.getInstance().imageFromText(Integer.toString(((Double) map.get(ReactProperties.HereMapMarker.CLUSTER_SIZE)).intValue()), Font.AMAZON_EMBER_BOLD, 14, Resources.Colors.BACKGROUND)).build();
            case 78:
                HashMap hashMap = new HashMap();
                hashMap.put("radius", 9);
                hashMap.put("color", Integer.valueOf(Resources.Colors.BACKGROUND));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("radius", 6);
                hashMap2.put("color", Integer.valueOf(Resources.Colors.ACTIVE));
                return ImageUtils.getInstance().dropShadow(ImageUtils.getInstance().drawCircles(Arrays.asList(hashMap, hashMap2)), 0, 2, 2, Resources.Colors.BLUE_BAYOUX);
            default:
                return null;
        }
    }

    public static Bitmap getImage(ImageId imageId) {
        return getImage(imageId, new HashMap());
    }
}
