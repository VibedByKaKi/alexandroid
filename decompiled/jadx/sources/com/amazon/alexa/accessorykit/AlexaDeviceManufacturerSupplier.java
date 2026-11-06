package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.DeviceManufacturerSupplier;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.mobilytics.OwnerIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class AlexaDeviceManufacturerSupplier implements DeviceManufacturerSupplier {
    public static final String AH_CASE = "A21YKVRGQV9TET";
    public static final String AH_CLUSTER = "ADXK6Q246T9EA";
    public static final String AH_LEFT = "A168KS6Z8QG6RV";
    public static final String AH_RIGHT = "A3KF60B9RDMWLY";
    public static final String ARMSTRONG_CASE = "A3HVREY4JWAZ6K";
    public static final String ARMSTRONG_CLUSTER = "A15QWUTQ6FSMYX";
    public static final String ARMSTRONG_LEFT = "A2QDHDQIWC2LTG";
    public static final String ARMSTRONG_RIGHT = "A31PMVIWCRNTX2";
    public static final String ECHO_AUTO = "A303PJF6ISQ7IC";
    public static final String G = "A13W6HQIHKEN3Z";
    public static final String HK = "A3HND3J60V1OXX";
    public static final String LENOVO_SMART_DOCK_NAME_PREFIX = "Lenovo Smart Dock";
    public static final String M = "A1388YOZ88W373";
    public static final String POP_CASE = "AN5E98JS518PS";
    public static final String POP_CLUSTER = "A1KB231CKNXSSQ";
    public static final String POP_LEFT = "A8767TLLU9HPX";
    public static final String POP_RIGHT = "A2VZ5420634BK4";
    public static final String P_CASE = "AE9FIEPOC6D9B";
    public static final String P_CLUSTER = "A16MZVIFVHX6P6";
    public static final String P_LEFT = "AS8OPU4NNXJI8";
    public static final String P_RIGHT = "ALWUIN0P635PT";
    public static final String SLUSHY = "A3JKY41C0S05FZ";
    public static final String SLUSHY_CASE = "AJMM5LZMBFMM0";
    public static final String SLUSHY_CLUSTER = "A1L3WOTKSI91HQ";
    public static final String WEAR_APP = "AJQACSCJ0A68Q";
    public static final String Z = "A2OUFCM11BT9RB";
    public static final String ZION = "A3IYPH06PH1HRA";

    public static boolean isFirstPartyDevice(String str) {
        Preconditions.notNull(str, "deviceType");
        str.getClass();
        switch (str) {
            case "A2QDHDQIWC2LTG":
            case "A3HVREY4JWAZ6K":
            case "AJMM5LZMBFMM0":
            case "A168KS6Z8QG6RV":
            case "AJQACSCJ0A68Q":
            case "A16MZVIFVHX6P6":
            case "A13W6HQIHKEN3Z":
            case "A3JKY41C0S05FZ":
            case "A1L3WOTKSI91HQ":
            case "A8767TLLU9HPX":
            case "AE9FIEPOC6D9B":
            case "ALWUIN0P635PT":
            case "A3IYPH06PH1HRA":
            case "A21YKVRGQV9TET":
            case "A2OUFCM11BT9RB":
            case "AS8OPU4NNXJI8":
            case "A1388YOZ88W373":
            case "A2VZ5420634BK4":
            case "A1KB231CKNXSSQ":
            case "A15QWUTQ6FSMYX":
            case "AN5E98JS518PS":
            case "ADXK6Q246T9EA":
            case "A31PMVIWCRNTX2":
            case "A303PJF6ISQ7IC":
            case "A3KF60B9RDMWLY":
            case "A3HND3J60V1OXX":
                return true;
            default:
                return false;
        }
    }

    @Override // com.amazon.alexa.accessory.DeviceManufacturerSupplier
    public String getDeviceOwnerId(String str) {
        Preconditions.notNull(str, "deviceType");
        str.getClass();
        switch (str) {
            case "A2QDHDQIWC2LTG":
            case "A3HVREY4JWAZ6K":
            case "A15QWUTQ6FSMYX":
            case "A31PMVIWCRNTX2":
                return OwnerIdentifier.FIRMWARE_POWELL;
            case "AJMM5LZMBFMM0":
            case "A3JKY41C0S05FZ":
            case "A1L3WOTKSI91HQ":
            case "A3IYPH06PH1HRA":
            case "A2OUFCM11BT9RB":
                return OwnerIdentifier.FIRMWARE_ZEPHYR;
            case "A168KS6Z8QG6RV":
            case "A8767TLLU9HPX":
            case "A21YKVRGQV9TET":
            case "A2VZ5420634BK4":
            case "A1KB231CKNXSSQ":
            case "AN5E98JS518PS":
            case "ADXK6Q246T9EA":
            case "A3KF60B9RDMWLY":
                return OwnerIdentifier.FIRMWARE_ARROWHEAD;
            case "A16MZVIFVHX6P6":
            case "AE9FIEPOC6D9B":
            case "ALWUIN0P635PT":
            case "AS8OPU4NNXJI8":
                return OwnerIdentifier.FIRMWARE_PUGET;
            case "A13W6HQIHKEN3Z":
                return OwnerIdentifier.FIRMWARE_GREENWOOD;
            case "A1388YOZ88W373":
            case "A303PJF6ISQ7IC":
                return OwnerIdentifier.FIRMWARE_MUFFIN;
            default:
                return OwnerIdentifier.APP_ACCESSORIES_GENERAL;
        }
    }

    @Override // com.amazon.alexa.accessory.DeviceManufacturerSupplier
    public boolean isFirstParty(String str) {
        return isFirstPartyDevice(str);
    }

    @Override // com.amazon.alexa.accessory.DeviceManufacturerSupplier
    public boolean isFwUpdateSupported(String str) {
        Preconditions.notNull(str, "deviceType");
        return !WEAR_APP.equals(str);
    }
}
