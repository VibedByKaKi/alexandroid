package com.amazon.apl.android.utils;

import android.net.Uri;
import android.text.TextUtils;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.apl.utils.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PackagePathResolver {
    private static final String DEFAULT_DOMAIN = "https://arl.assets-v2.apl-alexa.com";
    private static final String DEVICE_SPECIFIC_PATH_RESOLUTION_FORMAT = "%s/packages/%s-%s/%s/document.json?";
    private static final List<String> DISALLOWED_SCHEMES_FOR_QUERY_PARAMS = new ArrayList(Arrays.asList("content", "file"));
    private static final int MAX_HUB5_DEVICE_WIDTH = 1279;
    private static final String TAG = "PackagePathResolver";
    private static final String V2_RESOLUTION_WITH_PROPERTIES = "%s/packages/%s/%s/document.json?";
    private static final String VANILLA_RESOLUTION_FORMAT = "https://arl.assets.apl-alexa.com/packages/%s/%s/document.json";
    private String mDomain = DEFAULT_DOMAIN;
    private final int mDpi;
    private final int mHeight;
    private final DeviceModality mModality;
    private final Mode mMode;
    private final int mWidth;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.utils.PackagePathResolver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$android$utils$PackagePathResolver$DeviceModality;

        static {
            int[] iArr = new int[DeviceModality.values().length];
            $SwitchMap$com$amazon$apl$android$utils$PackagePathResolver$DeviceModality = iArr;
            try {
                iArr[DeviceModality.kDeviceModalityHub.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$utils$PackagePathResolver$DeviceModality[DeviceModality.kDeviceModalityMobile.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$utils$PackagePathResolver$DeviceModality[DeviceModality.kDeviceModalityWeb.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$utils$PackagePathResolver$DeviceModality[DeviceModality.kDeviceModalityTV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DeviceModality {
        kDeviceModalityAuto,
        kDeviceModalityHub,
        kDeviceModalityMobile,
        kDeviceModalityWeb,
        kDeviceModalityTV
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Mode {
        kResolverModeDeviceSpecific,
        kResolverModeDeviceVanilla
    }

    public PackagePathResolver(Mode mode, int i, int i2, int i3, DeviceModality deviceModality) {
        this.mMode = mode;
        this.mWidth = i;
        this.mHeight = i2;
        this.mDpi = i3;
        this.mModality = deviceModality;
    }

    public PackageQueryPath createQueryPath(String str, String str2) {
        PackageQueryPath packageQueryPath = new PackageQueryPath(this, null);
        packageQueryPath.mName = str;
        packageQueryPath.mVersion = str2;
        packageQueryPath.mDomain = this.mDomain;
        return packageQueryPath;
    }

    public PackagePathResolver domain(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mDomain = str;
        }
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PackageQueryPath {
        private String mDomain;
        private String mName;
        private Map<String, String> mPropertiesMap;
        private final PackagePathResolver mResolver;
        private String mSource;
        private String mVersion;

        private PackageQueryPath(PackagePathResolver packagePathResolver) {
            this.mPropertiesMap = new HashMap();
            this.mResolver = packagePathResolver;
        }

        private String buildQueryString(Map<String, String> map) {
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return builder.build().getQuery();
        }

        private boolean canAppendQueryParameters(Uri uri) {
            return !PackagePathResolver.DISALLOWED_SCHEMES_FOR_QUERY_PARAMS.contains(uri.getScheme());
        }

        public Uri build() {
            StringBuilder sb;
            Map<String, String> map;
            if (!TextUtils.isEmpty(this.mSource)) {
                Uri parse = Uri.parse(this.mSource);
                if (canAppendQueryParameters(parse) && (map = this.mPropertiesMap) != null && !map.isEmpty()) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    for (Map.Entry<String, String> entry : this.mPropertiesMap.entrySet()) {
                        buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    parse = buildUpon.build();
                }
                if (BuildConfig.DEBUG) {
                    parse.toString();
                }
                return parse;
            }
            if (this.mResolver.mMode == Mode.kResolverModeDeviceSpecific) {
                int i = AnonymousClass1.$SwitchMap$com$amazon$apl$android$utils$PackagePathResolver$DeviceModality[this.mResolver.mModality.ordinal()];
                String str = "hub5";
                if (i != 1) {
                    if (i == 2) {
                        str = "mobile";
                    } else if (i == 3) {
                        str = "web";
                    } else if (i == 4) {
                        str = "tv";
                    }
                } else if (this.mResolver.mWidth > 1279) {
                    str = "hub7";
                }
                sb = new StringBuilder(ErrorUtils$$ExternalSyntheticOutline0.m(TableInfo$$ExternalSyntheticOutline0.m(this.mDomain, "/packages/", this.mName, "-", str), "/", this.mVersion, "/document.json?"));
                Map<String, String> map2 = this.mPropertiesMap;
                if (map2 != null && !map2.isEmpty()) {
                    sb.append(buildQueryString(this.mPropertiesMap));
                }
            } else {
                Map<String, String> map3 = this.mPropertiesMap;
                if (map3 == null || map3.isEmpty()) {
                    sb = new StringBuilder(a$$ExternalSyntheticOutline0.m(Constants.PACKAGE_LOCATION_PREFIX, this.mName, "/", this.mVersion, "/document.json"));
                } else {
                    StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(this.mDomain, "/packages/", this.mName, "/", this.mVersion);
                    m.append("/document.json?");
                    sb = new StringBuilder(m.toString());
                    sb.append(buildQueryString(this.mPropertiesMap));
                }
            }
            Uri parse2 = Uri.parse(sb.toString());
            if (BuildConfig.DEBUG) {
                parse2.toString();
            }
            return parse2;
        }

        public PackageQueryPath domain(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.mDomain = str;
            }
            return this;
        }

        public PackageQueryPath propertiesMap(Map<String, String> map) {
            this.mPropertiesMap = map;
            return this;
        }

        public PackageQueryPath source(String str) {
            this.mSource = str;
            return this;
        }

        public /* synthetic */ PackageQueryPath(PackagePathResolver packagePathResolver, AnonymousClass1 anonymousClass1) {
            this(packagePathResolver);
        }
    }
}
