package com.amazon.alexa.ra.apl.fragments.composables;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/composables/PaginatedViewPagerConstants;", "", "<init>", "()V", "CACHE_SIZE_DIVISOR", "", "DEFAULT_OFFSCREEN_PAGE_LIMIT", "VIEW_CACHE_SIZE", "getVIEW_CACHE_SIZE", "()I", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class PaginatedViewPagerConstants {
    private static final int CACHE_SIZE_DIVISOR = 8;
    public static final int DEFAULT_OFFSCREEN_PAGE_LIMIT = 3;

    @NotNull
    public static final PaginatedViewPagerConstants INSTANCE = new PaginatedViewPagerConstants();
    private static final int VIEW_CACHE_SIZE = (int) ((Runtime.getRuntime().maxMemory() / 1024) / 8);

    private PaginatedViewPagerConstants() {
    }

    public final int getVIEW_CACHE_SIZE() {
        return VIEW_CACHE_SIZE;
    }
}
