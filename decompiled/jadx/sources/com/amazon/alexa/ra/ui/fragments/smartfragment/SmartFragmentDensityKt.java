package com.amazon.alexa.ra.ui.fragments.smartfragment;

import com.amazon.alexa.ra.core.data.fragments.ContentExperimental;
import com.amazon.alexa.ra.core.data.fragments.ContentLayoutVariables;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DENSITY_KEYS", "", "", "getDensity", "Lcom/amazon/alexa/ra/ui/fragments/smartfragment/ContentDensity;", "Lcom/amazon/alexa/ra/core/data/fragments/SmartFragmentContent;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSmartFragmentDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartFragmentDensity.kt\ncom/amazon/alexa/ra/ui/fragments/smartfragment/SmartFragmentDensityKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,82:1\n188#2,3:83\n*S KotlinDebug\n*F\n+ 1 SmartFragmentDensity.kt\ncom/amazon/alexa/ra/ui/fragments/smartfragment/SmartFragmentDensityKt\n*L\n74#1:83,3\n*E\n"})
/* loaded from: classes19.dex */
public final class SmartFragmentDensityKt {

    @NotNull
    private static final Set<String> DENSITY_KEYS = SetsKt.setOf((Object[]) new String[]{"dataPoints", "hourlyForecast", "dailyForecast", "inputs", "chips", "imageItems", "rows", "pairs"});

    @NotNull
    public static final ContentDensity getDensity(@NotNull SmartFragmentContent smartFragmentContent) {
        ContentLayoutVariables layoutVariables;
        smartFragmentContent.getClass();
        ContentExperimental experimental = smartFragmentContent.getExperimental();
        if (experimental == null || (layoutVariables = experimental.getLayoutVariables()) == null) {
            return ContentDensity.HIGH;
        }
        Integer clusterCount = layoutVariables.getClusterCount();
        Map<String, Integer> structuredDataKeys = layoutVariables.getStructuredDataKeys();
        if (clusterCount == null || structuredDataKeys == null) {
            return ContentDensity.HIGH;
        }
        Integer significantImageCount = layoutVariables.getSignificantImageCount();
        boolean z = false;
        int intValue = significantImageCount != null ? significantImageCount.intValue() : 0;
        if (!structuredDataKeys.isEmpty()) {
            Iterator<Map.Entry<String, Integer>> it2 = structuredDataKeys.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it2.next();
                String key = next.getKey();
                int intValue2 = next.getValue().intValue();
                if (DENSITY_KEYS.contains(key) && intValue2 > 0) {
                    z = true;
                    break;
                }
            }
        }
        return (clusterCount.intValue() > 1 || intValue != 0 || z) ? ContentDensity.HIGH : ContentDensity.LOW;
    }
}
