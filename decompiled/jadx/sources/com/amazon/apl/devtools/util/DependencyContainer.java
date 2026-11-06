package com.amazon.apl.devtools.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DependencyContainer {
    private static DependencyContainer sInstance;
    private final CommandRequestFactory mCommandRequestFactory;
    private final MultiViewUtil mMultiViewUtil;
    private final TargetCatalog mTargetCatalog;

    private DependencyContainer() {
        TargetCatalog targetCatalog = new TargetCatalog();
        this.mTargetCatalog = targetCatalog;
        this.mCommandRequestFactory = new CommandRequestFactory(targetCatalog, new CommandMethodUtil(), new CommandRequestValidator(targetCatalog));
        this.mMultiViewUtil = new MultiViewUtil();
    }

    public static DependencyContainer getInstance() {
        if (sInstance == null) {
            sInstance = new DependencyContainer();
        }
        return sInstance;
    }

    public CommandRequestFactory getCommandRequestFactory() {
        return this.mCommandRequestFactory;
    }

    public MultiViewUtil getMultiViewUtil() {
        return this.mMultiViewUtil;
    }

    public TargetCatalog getTargetCatalog() {
        return this.mTargetCatalog;
    }
}
