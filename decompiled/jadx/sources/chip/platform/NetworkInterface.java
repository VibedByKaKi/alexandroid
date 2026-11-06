package chip.platform;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NetworkInterface {
    public static final int INTERFACE_TYPE_ENUM_CELLULAR = 3;
    public static final int INTERFACE_TYPE_ENUM_ETHERNET = 2;
    public static final int INTERFACE_TYPE_ENUM_THREAD = 4;
    public static final int INTERFACE_TYPE_ENUM_UNSPECIFIED = 0;
    public static final int INTERFACE_TYPE_ENUM_WI_FI = 1;
    public byte[] hardwareAddress;
    public byte[] ipv4Address;
    public byte[] ipv6Address;
    public boolean isOperational;
    public String name;

    @Nullable
    public Boolean offPremiseServicesReachableIPv4;

    @Nullable
    public Boolean offPremiseServicesReachableIPv6;
    public int type;
}
