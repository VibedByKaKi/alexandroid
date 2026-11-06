package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CaptureMode {
    public static final String BURST = "BURST";
    public static final String HDR = "HDR";
    public static final String LENTICULAR = "LENTICULAR";
    public static final String NONE = "NONE";
    public static final String PANORAMA = "PANORAMA";
    public static final String REWIND = "REWIND";
    public static final String VIDSNAP = "VIDSNAP";
    private static final String[] values = {"NONE", "REWIND", "HDR", "BURST", "PANORAMA", "LENTICULAR", "VIDSNAP"};

    private CaptureMode() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
