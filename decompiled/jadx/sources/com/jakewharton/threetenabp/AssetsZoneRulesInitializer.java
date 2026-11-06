package com.jakewharton.threetenabp;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.TzdbZoneRulesProvider;
import org.threeten.bp.zone.ZoneRulesInitializer;
import org.threeten.bp.zone.ZoneRulesProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class AssetsZoneRulesInitializer extends ZoneRulesInitializer {
    private final String assetPath;
    private final Context context;

    public AssetsZoneRulesInitializer(Context context, String str) {
        this.context = context;
        this.assetPath = str;
    }

    @Override // org.threeten.bp.zone.ZoneRulesInitializer
    public void initializeProviders() {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.context.getAssets().open(this.assetPath);
                TzdbZoneRulesProvider tzdbZoneRulesProvider = new TzdbZoneRulesProvider(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                ZoneRulesProvider.registerProvider(tzdbZoneRulesProvider);
            } catch (IOException e) {
                throw new IllegalStateException(this.assetPath + " missing from assets", e);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
