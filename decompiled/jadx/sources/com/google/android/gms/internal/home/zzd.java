package com.google.android.gms.internal.home;

import com.amazon.alexa.mobilytics.event.Channels;
import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzd {
    public static final Feature zza;
    public static final Feature zzb;
    public static final Feature zzc;
    public static final Feature zzd;
    public static final Feature zze;
    public static final Feature zzf;
    public static final Feature zzg;
    public static final Feature zzh;
    public static final Feature zzi;
    public static final Feature zzj;
    public static final Feature zzk;
    public static final Feature zzl;
    public static final Feature zzm;
    public static final Feature[] zzn;

    static {
        Feature feature = new Feature("home_matter_chip", 1L);
        zza = feature;
        Feature feature2 = new Feature("home_matter_commission_device", 4L);
        zzb = feature2;
        Feature feature3 = new Feature("home_matter_send_detected_beacons", 1L);
        zzc = feature3;
        Feature feature4 = new Feature("home_matter_setup_1p_device", 5L);
        zzd = feature4;
        Feature feature5 = new Feature("home_matter_share_device", 1L);
        zze = feature5;
        Feature feature6 = new Feature(Channels.HOME, 1L);
        zzf = feature6;
        Feature feature7 = new Feature("home_matter_resolve_dnssd_service", 1L);
        zzg = feature7;
        Feature feature8 = new Feature("home_matter_settings_device_list", 2L);
        zzh = feature8;
        Feature feature9 = new Feature("home_matter_settings_device_information", 1L);
        zzi = feature9;
        Feature feature10 = new Feature("home_matter_settings_linked_services", 1L);
        zzj = feature10;
        Feature feature11 = new Feature("home_matter_settings_remove_device", 1L);
        zzk = feature11;
        Feature feature12 = new Feature("home_matter_set_half_sheet_enabled", 1L);
        zzl = feature12;
        Feature feature13 = new Feature("home_matter_request_sharing", 1L);
        zzm = feature13;
        zzn = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, feature11, feature12, feature13};
    }
}
