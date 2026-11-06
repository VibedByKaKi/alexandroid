package com.amazon.comms.calling.data.util;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0012H&J\b\u0010\u0016\u001a\u00020\u0012H&J\b\u0010\u0017\u001a\u00020\u0012H&J\b\u0010\u0018\u001a\u00020\u0012H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001e"}, d2 = {"Lcom/amazon/comms/calling/data/util/Utils;", "", "isFireOS", "", "shouldUseNormalAudioMode", "isLollipopAndAbove", "isMarshMallowAndAbove", "isNougatAndAbove", "isAndroid10AndAbove", "isOreoAndAbove", "isPieAndAbove", "isAndroid12AndAbove", "isFireOS5", "isDoNotDisturbActive", "isAMPDDevice", "generateInt", "", "generateRandomUUID", "", "checkIfPermissionGranted", "permission", "getDeviceSerialNumber", "getOSType", "getManufacturer", "getModel", "isInPowerSaveMode", "isDeviceInIdleMode", "isInteractive", "shouldSaveBattery", "isAlexaAppExperienceEnabled", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"AnnotateVersionCheck", "ObsoleteSdkInt"})
/* loaded from: classes20.dex */
public interface Utils {
    boolean checkIfPermissionGranted(@NotNull String permission);

    int generateInt();

    @NotNull
    String generateRandomUUID();

    @NotNull
    String getDeviceSerialNumber();

    @NotNull
    String getManufacturer();

    @NotNull
    String getModel();

    @NotNull
    String getOSType();

    boolean isAMPDDevice();

    boolean isAlexaAppExperienceEnabled();

    boolean isAndroid10AndAbove();

    boolean isAndroid12AndAbove();

    boolean isDeviceInIdleMode();

    boolean isDoNotDisturbActive();

    boolean isFireOS();

    boolean isFireOS5();

    boolean isInPowerSaveMode();

    boolean isInteractive();

    boolean isLollipopAndAbove();

    boolean isMarshMallowAndAbove();

    boolean isNougatAndAbove();

    boolean isOreoAndAbove();

    boolean isPieAndAbove();

    boolean shouldSaveBattery();

    boolean shouldUseNormalAudioMode();
}
