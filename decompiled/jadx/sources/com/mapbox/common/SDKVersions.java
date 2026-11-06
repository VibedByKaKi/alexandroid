package com.mapbox.common;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mapbox/common/SDKVersions;", "", "()V", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class SDKVersions {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String MAPBOX_IDENTIFIER = "mapbox";

    @NotNull
    private static final String SDK_VERSIONS_FOLDER = "sdk_versions";

    @JvmStatic
    @NotNull
    public static final List<String> getList() {
        return INSTANCE.getList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mapbox/common/SDKVersions$Companion;", "", "()V", "MAPBOX_IDENTIFIER", "", "SDK_VERSIONS_FOLDER", "getList", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final List<String> getList() {
            boolean contains;
            ArrayList arrayList = new ArrayList();
            AssetManager assets = MapboxSDKCommon.INSTANCE.getContext().getAssets();
            String[] list = assets.list(SDKVersions.SDK_VERSIONS_FOLDER);
            if (list != null) {
                for (String str : list) {
                    str.getClass();
                    contains = StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) SDKVersions.MAPBOX_IDENTIFIER, true);
                    if (contains) {
                        InputStream open = assets.open(SDKVersions.SDK_VERSIONS_FOLDER + File.separator + str);
                        open.getClass();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192);
                        try {
                            arrayList.add(bufferedReader.readLine() + " (" + str + ')');
                            CloseableKt.closeFinally(bufferedReader, null);
                        } finally {
                        }
                    }
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }
}
