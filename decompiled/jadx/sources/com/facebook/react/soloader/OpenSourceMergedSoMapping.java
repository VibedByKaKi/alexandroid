package com.facebook.react.soloader;

import com.facebook.soloader.ExternalSoMapping;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\t\u0010\n\u001a\u00020\u000bH\u0086 J\t\u0010\f\u001a\u00020\u000bH\u0086 J\t\u0010\r\u001a\u00020\u000bH\u0086 J\t\u0010\u000e\u001a\u00020\u000bH\u0086 J\t\u0010\u000f\u001a\u00020\u000bH\u0086 J\t\u0010\u0010\u001a\u00020\u000bH\u0086 J\t\u0010\u0011\u001a\u00020\u000bH\u0086 J\t\u0010\u0012\u001a\u00020\u000bH\u0086 J\t\u0010\u0013\u001a\u00020\u000bH\u0086 J\t\u0010\u0014\u001a\u00020\u000bH\u0086 J\t\u0010\u0015\u001a\u00020\u000bH\u0086 J\t\u0010\u0016\u001a\u00020\u000bH\u0086 J\t\u0010\u0017\u001a\u00020\u000bH\u0086 J\t\u0010\u0018\u001a\u00020\u000bH\u0086 J\t\u0010\u0019\u001a\u00020\u000bH\u0086 J\t\u0010\u001a\u001a\u00020\u000bH\u0086 J\t\u0010\u001b\u001a\u00020\u000bH\u0086 J\t\u0010\u001c\u001a\u00020\u000bH\u0086 ¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;", "Lcom/facebook/soloader/ExternalSoMapping;", "<init>", "()V", "mapLibName", "", "input", "invokeJniOnload", "", "libraryName", "libfabricjni_so", "", "libhermes_executor_so", "libhermesinstancejni_so", "libhermestooling_so", "libjsijniprofiler_so", "libjsinspector_so", "libmapbufferjni_so", "libreact_devsupportjni_so", "libreact_featureflagsjni_so", "libreact_newarchdefaults_so", "libreactnative_so", "libreactnativeblob_so", "libreactnativejni_so", "libreactnativejni_common_so", "librninstance_so", "libturbomodulejsijni_so", "libuimanagerjni_so", "libyoga_so", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OpenSourceMergedSoMapping implements ExternalSoMapping {

    @NotNull
    public static final OpenSourceMergedSoMapping INSTANCE = new OpenSourceMergedSoMapping();

    private OpenSourceMergedSoMapping() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.facebook.soloader.ExternalSoMapping
    public void invokeJniOnload(@NotNull String libraryName) {
        libraryName.getClass();
        switch (libraryName.hashCode()) {
            case -1793638007:
                if (libraryName.equals("mapbufferjni")) {
                    libmapbufferjni_so();
                    break;
                }
                break;
            case -1624070447:
                if (libraryName.equals("rninstance")) {
                    librninstance_so();
                    break;
                }
                break;
            case -1570429553:
                if (libraryName.equals("reactnativejni")) {
                    libreactnativejni_so();
                    break;
                }
                break;
            case -1438915853:
                if (libraryName.equals("reactnativeblob")) {
                    libreactnativeblob_so();
                    break;
                }
                break;
            case -1382694412:
                if (libraryName.equals("react_featureflagsjni")) {
                    libreact_featureflagsjni_so();
                    break;
                }
                break;
            case -1259441509:
                if (libraryName.equals("reactnativejni_common")) {
                    libreactnativejni_common_so();
                    break;
                }
                break;
            case -1033318826:
                if (libraryName.equals("reactnative")) {
                    libreactnative_so();
                    break;
                }
                break;
            case -579037304:
                if (libraryName.equals("react_newarchdefaults")) {
                    libreact_newarchdefaults_so();
                    break;
                }
                break;
            case -49345041:
                if (libraryName.equals("turbomodulejsijni")) {
                    libturbomodulejsijni_so();
                    break;
                }
                break;
            case 3714672:
                if (libraryName.equals("yoga")) {
                    libyoga_so();
                    break;
                }
                break;
            case 65536138:
                if (libraryName.equals("hermesinstancejni")) {
                    libhermesinstancejni_so();
                    break;
                }
                break;
            case 86183502:
                if (libraryName.equals("jsijniprofiler")) {
                    libjsijniprofiler_so();
                    break;
                }
                break;
            case 352552524:
                if (libraryName.equals("hermes_executor")) {
                    libhermes_executor_so();
                    break;
                }
                break;
            case 614482404:
                if (libraryName.equals("hermestooling")) {
                    libhermestooling_so();
                    break;
                }
                break;
            case 688235659:
                if (libraryName.equals("react_devsupportjni")) {
                    libreact_devsupportjni_so();
                    break;
                }
                break;
            case 716617324:
                if (libraryName.equals("uimanagerjni")) {
                    libuimanagerjni_so();
                    break;
                }
                break;
            case 1590431694:
                if (libraryName.equals("jsinspector")) {
                    libjsinspector_so();
                    break;
                }
                break;
            case 2016911584:
                if (libraryName.equals("fabricjni")) {
                    libfabricjni_so();
                    break;
                }
                break;
        }
    }

    public final native int libfabricjni_so();

    public final native int libhermes_executor_so();

    public final native int libhermesinstancejni_so();

    public final native int libhermestooling_so();

    public final native int libjsijniprofiler_so();

    public final native int libjsinspector_so();

    public final native int libmapbufferjni_so();

    public final native int libreact_devsupportjni_so();

    public final native int libreact_featureflagsjni_so();

    public final native int libreact_newarchdefaults_so();

    public final native int libreactnative_so();

    public final native int libreactnativeblob_so();

    public final native int libreactnativejni_common_so();

    public final native int libreactnativejni_so();

    public final native int librninstance_so();

    public final native int libturbomodulejsijni_so();

    public final native int libuimanagerjni_so();

    public final native int libyoga_so();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6 A[RETURN] */
    @Override // com.facebook.soloader.ExternalSoMapping
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mapLibName(@org.jetbrains.annotations.NotNull java.lang.String r1) {
        /*
            r0 = this;
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1793638007: goto L9b;
                case -1624070447: goto L92;
                case -1570429553: goto L89;
                case -1438915853: goto L80;
                case -1382694412: goto L77;
                case -1259441509: goto L6e;
                case -579037304: goto L65;
                case -49345041: goto L5c;
                case 3714672: goto L53;
                case 65536138: goto L47;
                case 86183502: goto L3e;
                case 352552524: goto L34;
                case 688235659: goto L2a;
                case 716617324: goto L20;
                case 1590431694: goto L16;
                case 2016911584: goto Lc;
                default: goto La;
            }
        La:
            goto La6
        Lc:
            java.lang.String r0 = "fabricjni"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L16:
            java.lang.String r0 = "jsinspector"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L20:
            java.lang.String r0 = "uimanagerjni"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L2a:
            java.lang.String r0 = "react_devsupportjni"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L34:
            java.lang.String r0 = "hermes_executor"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L50
            goto La6
        L3e:
            java.lang.String r0 = "jsijniprofiler"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L50
            goto La6
        L47:
            java.lang.String r0 = "hermesinstancejni"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L50
            goto La6
        L50:
            java.lang.String r0 = "hermestooling"
            return r0
        L53:
            java.lang.String r0 = "yoga"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L5c:
            java.lang.String r0 = "turbomodulejsijni"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L65:
            java.lang.String r0 = "react_newarchdefaults"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L6e:
            java.lang.String r0 = "reactnativejni_common"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L77:
            java.lang.String r0 = "react_featureflagsjni"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L80:
            java.lang.String r0 = "reactnativeblob"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L89:
            java.lang.String r0 = "reactnativejni"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L92:
            java.lang.String r0 = "rninstance"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La3
            goto La6
        L9b:
            java.lang.String r0 = "mapbufferjni"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La6
        La3:
            java.lang.String r0 = "reactnative"
            return r0
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.soloader.OpenSourceMergedSoMapping.mapLibName(java.lang.String):java.lang.String");
    }
}
