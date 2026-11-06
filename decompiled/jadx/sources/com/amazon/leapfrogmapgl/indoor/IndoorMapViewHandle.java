package com.amazon.leapfrogmapgl.indoor;

import com.amazon.clouddrive.cdasdk.cds.common.TimeGroupBy;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010L\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020SX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001c\u0010X\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010^\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010c\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010d\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0013\"\u0004\bf\u0010\u0015R\u001c\u0010g\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010[\"\u0004\bi\u0010]R\u001a\u0010j\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0013\"\u0004\bl\u0010\u0015R\u001a\u0010m\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010+\"\u0004\bo\u0010-R(\u0010p\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Y\u0018\u00010qX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0013\"\u0004\bx\u0010\u0015R\u001a\u0010y\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0013\"\u0004\b{\u0010\u0015R\u001a\u0010|\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0013\"\u0004\b~\u0010\u0015R\u001c\u0010\u007f\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0013\"\u0005\b\u0081\u0001\u0010\u0015R\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u00104\"\u0005\b\u0084\u0001\u00106R\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u00104\"\u0005\b\u0087\u0001\u00106R\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u00104\"\u0005\b\u008a\u0001\u00106R\u001d\u0010\u008b\u0001\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010\u0013\"\u0005\b\u008d\u0001\u0010\u0015R\u001d\u0010\u008e\u0001\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010\u0019\"\u0005\b\u0090\u0001\u0010\u001bR\u001d\u0010\u0091\u0001\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u0019\"\u0005\b\u0093\u0001\u0010\u001bR)\u0010\u0094\u0001\u001a\f\u0012\u0005\u0012\u00030\u0096\u0001\u0018\u00010\u0095\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001f\u0010\u009b\u0001\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010[\"\u0005\b\u009d\u0001\u0010]R!\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0012\n\u0002\u0010c\u001a\u0005\b\u009f\u0001\u0010`\"\u0005\b \u0001\u0010bR\u001d\u0010¡\u0001\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010\u0019\"\u0005\b£\u0001\u0010\u001bR\u001d\u0010¤\u0001\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010\u0019\"\u0005\b¦\u0001\u0010\u001bR\u001d\u0010§\u0001\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010\u0019\"\u0005\b©\u0001\u0010\u001bR\"\u0010ª\u0001\u001a\u0005\u0018\u00010«\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R&\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00020Y0\u0095\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b±\u0001\u0010\u0098\u0001\"\u0006\b²\u0001\u0010\u009a\u0001R\u001d\u0010³\u0001\u001a\u00020)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010+\"\u0005\bµ\u0001\u0010-R\u001f\u0010¶\u0001\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u00104\"\u0005\b¸\u0001\u00106R\u001d\u0010¹\u0001\u001a\u00020YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010[\"\u0005\b»\u0001\u0010]R\u001f\u0010¼\u0001\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0001\u00104\"\u0005\b¾\u0001\u00106R\u001f\u0010¿\u0001\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0001\u0010[\"\u0005\bÁ\u0001\u0010]R\u001f\u0010Â\u0001\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0001\u00104\"\u0005\bÄ\u0001\u00106R\u001d\u0010Å\u0001\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0001\u0010\u0013\"\u0005\bÇ\u0001\u0010\u0015R\"\u0010È\u0001\u001a\u0005\u0018\u00010É\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R\u001f\u0010Î\u0001\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÏ\u0001\u0010[\"\u0005\bÐ\u0001\u0010]R)\u0010Ñ\u0001\u001a\f\u0012\u0005\u0012\u00030Ó\u0001\u0018\u00010Ò\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R\u001f\u0010Ø\u0001\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÙ\u0001\u00104\"\u0005\bÚ\u0001\u00106R\u001d\u0010Û\u0001\u001a\u000208X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÜ\u0001\u0010:\"\u0005\bÝ\u0001\u0010<R\u001d\u0010Þ\u0001\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bß\u0001\u0010\u0013\"\u0005\bà\u0001\u0010\u0015R\u001f\u0010á\u0001\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bâ\u0001\u00104\"\u0005\bã\u0001\u00106R\u001d\u0010ä\u0001\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bå\u0001\u0010\u0013\"\u0005\bæ\u0001\u0010\u0015R\u001f\u0010ç\u0001\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bè\u0001\u0010[\"\u0005\bé\u0001\u0010]R\u001d\u0010ê\u0001\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bë\u0001\u0010\u0013\"\u0005\bì\u0001\u0010\u0015R\u001d\u0010í\u0001\u001a\u00020YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bî\u0001\u0010[\"\u0005\bï\u0001\u0010]R\u001f\u0010ð\u0001\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bñ\u0001\u0010[\"\u0005\bò\u0001\u0010]R\u001f\u0010ó\u0001\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bô\u0001\u0010[\"\u0005\bõ\u0001\u0010]R\u001f\u0010ö\u0001\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b÷\u0001\u0010[\"\u0005\bø\u0001\u0010]R\u001f\u0010ù\u0001\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bú\u0001\u0010[\"\u0005\bû\u0001\u0010]R\u001d\u0010ü\u0001\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bý\u0001\u0010\u0013\"\u0005\bþ\u0001\u0010\u0015R\"\u0010ÿ\u0001\u001a\u0005\u0018\u00010\u0080\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R\u001f\u0010\u0085\u0002\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0002\u0010[\"\u0005\b\u0087\u0002\u0010]R4\u0010\u0088\u0002\u001a\u0017\u0012\u0004\u0012\u00020Y\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00010\u0089\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R4\u0010\u008e\u0002\u001a\u0017\u0012\u0004\u0012\u00020Y\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00010\u0089\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0002\u0010\u008b\u0002\"\u0006\b\u0090\u0002\u0010\u008d\u0002R,\u0010\u0091\u0002\u001a\u000f\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Y0\u0089\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0092\u0002\u0010\u008b\u0002\"\u0006\b\u0093\u0002\u0010\u008d\u0002R\u001f\u0010\u0094\u0002\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0002\u0010[\"\u0005\b\u0096\u0002\u0010]¨\u0006\u0097\u0002"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/IndoorMapViewHandle;", "", "mapView", "Lcom/mapbox/maps/MapView;", "layer", "Lcom/amazon/leapfrogmapgl/indoor/FloorPlanLayer;", "lifecycleOwner", "Lcom/amazon/leapfrogmapgl/indoor/FakeLifecycleOwner;", "<init>", "(Lcom/mapbox/maps/MapView;Lcom/amazon/leapfrogmapgl/indoor/FloorPlanLayer;Lcom/amazon/leapfrogmapgl/indoor/FakeLifecycleOwner;)V", "getMapView", "()Lcom/mapbox/maps/MapView;", "getLayer", "()Lcom/amazon/leapfrogmapgl/indoor/FloorPlanLayer;", "getLifecycleOwner", "()Lcom/amazon/leapfrogmapgl/indoor/FakeLifecycleOwner;", "followActive", "", "getFollowActive", "()Z", "setFollowActive", "(Z)V", "followLat", "", "getFollowLat", "()D", "setFollowLat", "(D)V", "followLon", "getFollowLon", "setFollowLon", "followBearing", "getFollowBearing", "setFollowBearing", "followSubjectLat", "getFollowSubjectLat", "setFollowSubjectLat", "followSubjectLon", "getFollowSubjectLon", "setFollowSubjectLon", "followLastFrameMs", "", "getFollowLastFrameMs", "()J", "setFollowLastFrameMs", "(J)V", "followEaseUntilMs", "getFollowEaseUntilMs", "setFollowEaseUntilMs", "followRevert", "Ljava/lang/Runnable;", "getFollowRevert", "()Ljava/lang/Runnable;", "setFollowRevert", "(Ljava/lang/Runnable;)V", "followTickCount", "", "getFollowTickCount", "()I", "setFollowTickCount", "(I)V", "lastUserInteractionMs", "getLastUserInteractionMs", "setLastUserInteractionMs", "lastFootprintRing", "", "getLastFootprintRing", "()[D", "setLastFootprintRing", "([D)V", "lastVegetations", "Lorg/json/JSONArray;", "getLastVegetations", "()Lorg/json/JSONArray;", "setLastVegetations", "(Lorg/json/JSONArray;)V", "treeOcclusion", "Lcom/amazon/leapfrogmapgl/indoor/TreeOcclusionController;", "getTreeOcclusion", "()Lcom/amazon/leapfrogmapgl/indoor/TreeOcclusionController;", "setTreeOcclusion", "(Lcom/amazon/leapfrogmapgl/indoor/TreeOcclusionController;)V", "userPreferences", "Lcom/amazon/leapfrogmapgl/indoor/NativeUserPreferences;", "getUserPreferences", "()Lcom/amazon/leapfrogmapgl/indoor/NativeUserPreferences;", "setUserPreferences", "(Lcom/amazon/leapfrogmapgl/indoor/NativeUserPreferences;)V", "lastUserPreferencesJson", "", "getLastUserPreferencesJson", "()Ljava/lang/String;", "setLastUserPreferencesJson", "(Ljava/lang/String;)V", "zoomOutFloor", "getZoomOutFloor", "()Ljava/lang/Double;", "setZoomOutFloor", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "pinchInProgress", "getPinchInProgress", "setPinchInProgress", "liveViewRequested", "getLiveViewRequested", "setLiveViewRequested", "pinchDrivenTransition", "getPinchDrivenTransition", "setPinchDrivenTransition", "pinchDrivenRequestedAtMs", "getPinchDrivenRequestedAtMs", "setPinchDrivenRequestedAtMs", "parsedView", "Lkotlin/Pair;", "getParsedView", "()Lkotlin/Pair;", "setParsedView", "(Lkotlin/Pair;)V", "floorPinned", "getFloorPinned", "setFloorPinned", "firstFrameDrawn", "getFirstFrameDrawn", "setFirstFrameDrawn", "openingSettled", "getOpeningSettled", "setOpeningSettled", "rendererReadyEmitted", "getRendererReadyEmitted", "setRendererReadyEmitted", "openingSettleFallback", "getOpeningSettleFallback", "setOpeningSettleFallback", "sceneAssetsTimeout", "getSceneAssetsTimeout", "setSceneAssetsTimeout", "pitchBoundsDeferred", "getPitchBoundsDeferred", "setPitchBoundsDeferred", "pinchReleased", "getPinchReleased", "setPinchReleased", "pinchStartZoom", "getPinchStartZoom", "setPinchStartZoom", "maxPitch", "getMaxPitch", "setMaxPitch", "heroBoundsPoints", "", "Lcom/mapbox/geojson/Point;", "getHeroBoundsPoints", "()Ljava/util/List;", "setHeroBoundsPoints", "(Ljava/util/List;)V", "lastCameraTargetJson", "getLastCameraTargetJson", "setLastCameraTargetJson", "roadPerpendicular", "getRoadPerpendicular", "setRoadPerpendicular", "cachedFitZoomFar", "getCachedFitZoomFar", "setCachedFitZoomFar", "cachedFitZoomNear", "getCachedFitZoomNear", "setCachedFitZoomNear", "cachedFitZoom", "getCachedFitZoom", "setCachedFitZoom", "roadProbe", "Lcom/amazon/leapfrogmapgl/indoor/RoadProbe;", "getRoadProbe", "()Lcom/amazon/leapfrogmapgl/indoor/RoadProbe;", "setRoadProbe", "(Lcom/amazon/leapfrogmapgl/indoor/RoadProbe;)V", "orderedLevelIds", "getOrderedLevelIds", "setOrderedLevelIds", "debugCmdStamp", "getDebugCmdStamp", "setDebugCmdStamp", "debugCmdPoller", "getDebugCmdPoller", "setDebugCmdPoller", "demoMode", "getDemoMode", "setDemoMode", "demoPump", "getDemoPump", "setDemoPump", "lastSceneUpdateJson", "getLastSceneUpdateJson", "setLastSceneUpdateJson", "actorPump", "getActorPump", "setActorPump", "dropped", "getDropped", "setDropped", "alignment", "Lcom/amazon/leapfrogmapgl/indoor/AlignmentController;", "getAlignment", "()Lcom/amazon/leapfrogmapgl/indoor/AlignmentController;", "setAlignment", "(Lcom/amazon/leapfrogmapgl/indoor/AlignmentController;)V", "lastMotionActiveCamerasJson", "getLastMotionActiveCamerasJson", "setLastMotionActiveCamerasJson", "sceneAssetsListener", "Lkotlin/Function0;", "", "getSceneAssetsListener", "()Lkotlin/jvm/functions/Function0;", "setSceneAssetsListener", "(Lkotlin/jvm/functions/Function0;)V", "cyclePump", "getCyclePump", "setCyclePump", "cycleIter", "getCycleIter", "setCycleIter", "hasFlownIndoor", "getHasFlownIndoor", "setHasFlownIndoor", "benchPump", "getBenchPump", "setBenchPump", "debugNavLatched", "getDebugNavLatched", "setDebugNavLatched", "debugTodLatch", "getDebugTodLatch", "setDebugTodLatch", "initialFitApplied", "getInitialFitApplied", "setInitialFitApplied", "currentTimeOfDay", "getCurrentTimeOfDay", "setCurrentTimeOfDay", "lastLayoutJson", "getLastLayoutJson", "setLastLayoutJson", "lastEndpointsJson", "getLastEndpointsJson", "setLastEndpointsJson", "lastDeviceGroupsJson", "getLastDeviceGroupsJson", "setLastDeviceGroupsJson", "currentWeatherJson", "getCurrentWeatherJson", "setCurrentWeatherJson", "pendingIndoorCameraFly", "getPendingIndoorCameraFly", "setPendingIndoorCameraFly", "lastSettledCamera", "Lcom/mapbox/maps/CameraState;", "getLastSettledCamera", "()Lcom/mapbox/maps/CameraState;", "setLastSettledCamera", "(Lcom/mapbox/maps/CameraState;)V", "lastMapNavigationJson", "getLastMapNavigationJson", "setLastMapNavigationJson", "roomPolygonsByRoomId", "", "getRoomPolygonsByRoomId", "()Ljava/util/Map;", "setRoomPolygonsByRoomId", "(Ljava/util/Map;)V", "pointsByLevelId", "getPointsByLevelId", "setPointsByLevelId", "levelIdByRoomId", "getLevelIdByRoomId", "setLevelIdByRoomId", "lastFocusedRoomId", "getLastFocusedRoomId", "setLastFocusedRoomId", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class IndoorMapViewHandle {

    @Nullable
    private Runnable actorPump;

    @Nullable
    private AlignmentController alignment;

    @Nullable
    private volatile Runnable benchPump;
    private volatile double cachedFitZoom;
    private volatile double cachedFitZoomFar;
    private volatile double cachedFitZoomNear;

    @NotNull
    private volatile String currentTimeOfDay;

    @Nullable
    private String currentWeatherJson;
    private int cycleIter;

    @Nullable
    private Runnable cyclePump;

    @Nullable
    private volatile Runnable debugCmdPoller;
    private volatile long debugCmdStamp;
    private volatile boolean debugNavLatched;

    @Nullable
    private volatile String debugTodLatch;

    @NotNull
    private volatile String demoMode;

    @Nullable
    private volatile Runnable demoPump;
    private volatile boolean dropped;
    private boolean firstFrameDrawn;
    private boolean floorPinned;
    private boolean followActive;
    private double followBearing;
    private long followEaseUntilMs;
    private long followLastFrameMs;
    private double followLat;
    private double followLon;

    @Nullable
    private Runnable followRevert;
    private double followSubjectLat;
    private double followSubjectLon;
    private int followTickCount;
    private volatile boolean hasFlownIndoor;

    @Nullable
    private volatile List<Point> heroBoundsPoints;
    private volatile boolean initialFitApplied;

    @Nullable
    private volatile String lastCameraTargetJson;

    @Nullable
    private String lastDeviceGroupsJson;

    @Nullable
    private volatile String lastEndpointsJson;

    @Nullable
    private volatile String lastFocusedRoomId;

    @Nullable
    private volatile double[] lastFootprintRing;

    @Nullable
    private volatile String lastLayoutJson;

    @Nullable
    private volatile String lastMapNavigationJson;

    @Nullable
    private String lastMotionActiveCamerasJson;

    @Nullable
    private String lastSceneUpdateJson;

    @Nullable
    private CameraState lastSettledCamera;
    private long lastUserInteractionMs;

    @Nullable
    private volatile String lastUserPreferencesJson;

    @Nullable
    private volatile JSONArray lastVegetations;

    @NotNull
    private final FloorPlanLayer layer;

    @NotNull
    private volatile Map<String, String> levelIdByRoomId;

    @NotNull
    private final FakeLifecycleOwner lifecycleOwner;

    @Nullable
    private String liveViewRequested;

    @NotNull
    private final MapView mapView;
    private double maxPitch;

    @Nullable
    private Runnable openingSettleFallback;
    private boolean openingSettled;

    @NotNull
    private volatile List<String> orderedLevelIds;

    @Nullable
    private Pair<String, String> parsedView;
    private volatile boolean pendingIndoorCameraFly;
    private long pinchDrivenRequestedAtMs;
    private boolean pinchDrivenTransition;
    private boolean pinchInProgress;
    private boolean pinchReleased;
    private double pinchStartZoom;

    @Nullable
    private Runnable pitchBoundsDeferred;

    @NotNull
    private volatile Map<String, ? extends List<Point>> pointsByLevelId;
    private boolean rendererReadyEmitted;

    @Nullable
    private volatile Double roadPerpendicular;

    @Nullable
    private volatile RoadProbe roadProbe;

    @NotNull
    private volatile Map<String, ? extends List<Point>> roomPolygonsByRoomId;

    @Nullable
    private Function0<Unit> sceneAssetsListener;

    @Nullable
    private Runnable sceneAssetsTimeout;

    @Nullable
    private TreeOcclusionController treeOcclusion;

    @NotNull
    private volatile NativeUserPreferences userPreferences;

    @Nullable
    private Double zoomOutFloor;

    public IndoorMapViewHandle(@NotNull MapView mapView, @NotNull FloorPlanLayer floorPlanLayer, @NotNull FakeLifecycleOwner fakeLifecycleOwner) {
        mapView.getClass();
        floorPlanLayer.getClass();
        fakeLifecycleOwner.getClass();
        this.mapView = mapView;
        this.layer = floorPlanLayer;
        this.lifecycleOwner = fakeLifecycleOwner;
        this.followLat = Double.NaN;
        this.followLon = Double.NaN;
        this.followBearing = Double.NaN;
        this.followSubjectLat = Double.NaN;
        this.followSubjectLon = Double.NaN;
        this.userPreferences = NativeUserPreferences.INSTANCE.getDEFAULT();
        this.pinchStartZoom = Double.NaN;
        this.maxPitch = 85.0d;
        this.cachedFitZoomFar = Double.NaN;
        this.cachedFitZoomNear = Double.NaN;
        this.cachedFitZoom = Double.NaN;
        this.orderedLevelIds = CollectionsKt.emptyList();
        this.demoMode = "off";
        this.currentTimeOfDay = TimeGroupBy.DAY;
        this.roomPolygonsByRoomId = MapsKt.emptyMap();
        this.pointsByLevelId = MapsKt.emptyMap();
        this.levelIdByRoomId = MapsKt.emptyMap();
    }

    @Nullable
    public final Runnable getActorPump() {
        return this.actorPump;
    }

    @Nullable
    public final AlignmentController getAlignment() {
        return this.alignment;
    }

    @Nullable
    public final Runnable getBenchPump() {
        return this.benchPump;
    }

    public final double getCachedFitZoom() {
        return this.cachedFitZoom;
    }

    public final double getCachedFitZoomFar() {
        return this.cachedFitZoomFar;
    }

    public final double getCachedFitZoomNear() {
        return this.cachedFitZoomNear;
    }

    @NotNull
    public final String getCurrentTimeOfDay() {
        return this.currentTimeOfDay;
    }

    @Nullable
    public final String getCurrentWeatherJson() {
        return this.currentWeatherJson;
    }

    public final int getCycleIter() {
        return this.cycleIter;
    }

    @Nullable
    public final Runnable getCyclePump() {
        return this.cyclePump;
    }

    @Nullable
    public final Runnable getDebugCmdPoller() {
        return this.debugCmdPoller;
    }

    public final long getDebugCmdStamp() {
        return this.debugCmdStamp;
    }

    public final boolean getDebugNavLatched() {
        return this.debugNavLatched;
    }

    @Nullable
    public final String getDebugTodLatch() {
        return this.debugTodLatch;
    }

    @NotNull
    public final String getDemoMode() {
        return this.demoMode;
    }

    @Nullable
    public final Runnable getDemoPump() {
        return this.demoPump;
    }

    public final boolean getDropped() {
        return this.dropped;
    }

    public final boolean getFirstFrameDrawn() {
        return this.firstFrameDrawn;
    }

    public final boolean getFloorPinned() {
        return this.floorPinned;
    }

    public final boolean getFollowActive() {
        return this.followActive;
    }

    public final double getFollowBearing() {
        return this.followBearing;
    }

    public final long getFollowEaseUntilMs() {
        return this.followEaseUntilMs;
    }

    public final long getFollowLastFrameMs() {
        return this.followLastFrameMs;
    }

    public final double getFollowLat() {
        return this.followLat;
    }

    public final double getFollowLon() {
        return this.followLon;
    }

    @Nullable
    public final Runnable getFollowRevert() {
        return this.followRevert;
    }

    public final double getFollowSubjectLat() {
        return this.followSubjectLat;
    }

    public final double getFollowSubjectLon() {
        return this.followSubjectLon;
    }

    public final int getFollowTickCount() {
        return this.followTickCount;
    }

    public final boolean getHasFlownIndoor() {
        return this.hasFlownIndoor;
    }

    @Nullable
    public final List<Point> getHeroBoundsPoints() {
        return this.heroBoundsPoints;
    }

    public final boolean getInitialFitApplied() {
        return this.initialFitApplied;
    }

    @Nullable
    public final String getLastCameraTargetJson() {
        return this.lastCameraTargetJson;
    }

    @Nullable
    public final String getLastDeviceGroupsJson() {
        return this.lastDeviceGroupsJson;
    }

    @Nullable
    public final String getLastEndpointsJson() {
        return this.lastEndpointsJson;
    }

    @Nullable
    public final String getLastFocusedRoomId() {
        return this.lastFocusedRoomId;
    }

    @Nullable
    public final double[] getLastFootprintRing() {
        return this.lastFootprintRing;
    }

    @Nullable
    public final String getLastLayoutJson() {
        return this.lastLayoutJson;
    }

    @Nullable
    public final String getLastMapNavigationJson() {
        return this.lastMapNavigationJson;
    }

    @Nullable
    public final String getLastMotionActiveCamerasJson() {
        return this.lastMotionActiveCamerasJson;
    }

    @Nullable
    public final String getLastSceneUpdateJson() {
        return this.lastSceneUpdateJson;
    }

    @Nullable
    public final CameraState getLastSettledCamera() {
        return this.lastSettledCamera;
    }

    public final long getLastUserInteractionMs() {
        return this.lastUserInteractionMs;
    }

    @Nullable
    public final String getLastUserPreferencesJson() {
        return this.lastUserPreferencesJson;
    }

    @Nullable
    public final JSONArray getLastVegetations() {
        return this.lastVegetations;
    }

    @NotNull
    public final FloorPlanLayer getLayer() {
        return this.layer;
    }

    @NotNull
    public final Map<String, String> getLevelIdByRoomId() {
        return this.levelIdByRoomId;
    }

    @NotNull
    public final FakeLifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Nullable
    public final String getLiveViewRequested() {
        return this.liveViewRequested;
    }

    @NotNull
    public final MapView getMapView() {
        return this.mapView;
    }

    public final double getMaxPitch() {
        return this.maxPitch;
    }

    @Nullable
    public final Runnable getOpeningSettleFallback() {
        return this.openingSettleFallback;
    }

    public final boolean getOpeningSettled() {
        return this.openingSettled;
    }

    @NotNull
    public final List<String> getOrderedLevelIds() {
        return this.orderedLevelIds;
    }

    @Nullable
    public final Pair<String, String> getParsedView() {
        return this.parsedView;
    }

    public final boolean getPendingIndoorCameraFly() {
        return this.pendingIndoorCameraFly;
    }

    public final long getPinchDrivenRequestedAtMs() {
        return this.pinchDrivenRequestedAtMs;
    }

    public final boolean getPinchDrivenTransition() {
        return this.pinchDrivenTransition;
    }

    public final boolean getPinchInProgress() {
        return this.pinchInProgress;
    }

    public final boolean getPinchReleased() {
        return this.pinchReleased;
    }

    public final double getPinchStartZoom() {
        return this.pinchStartZoom;
    }

    @Nullable
    public final Runnable getPitchBoundsDeferred() {
        return this.pitchBoundsDeferred;
    }

    @NotNull
    public final Map<String, List<Point>> getPointsByLevelId() {
        return this.pointsByLevelId;
    }

    public final boolean getRendererReadyEmitted() {
        return this.rendererReadyEmitted;
    }

    @Nullable
    public final Double getRoadPerpendicular() {
        return this.roadPerpendicular;
    }

    @Nullable
    public final RoadProbe getRoadProbe() {
        return this.roadProbe;
    }

    @NotNull
    public final Map<String, List<Point>> getRoomPolygonsByRoomId() {
        return this.roomPolygonsByRoomId;
    }

    @Nullable
    public final Function0<Unit> getSceneAssetsListener() {
        return this.sceneAssetsListener;
    }

    @Nullable
    public final Runnable getSceneAssetsTimeout() {
        return this.sceneAssetsTimeout;
    }

    @Nullable
    public final TreeOcclusionController getTreeOcclusion() {
        return this.treeOcclusion;
    }

    @NotNull
    public final NativeUserPreferences getUserPreferences() {
        return this.userPreferences;
    }

    @Nullable
    public final Double getZoomOutFloor() {
        return this.zoomOutFloor;
    }

    public final void setActorPump(@Nullable Runnable runnable) {
        this.actorPump = runnable;
    }

    public final void setAlignment(@Nullable AlignmentController alignmentController) {
        this.alignment = alignmentController;
    }

    public final void setBenchPump(@Nullable Runnable runnable) {
        this.benchPump = runnable;
    }

    public final void setCachedFitZoom(double d) {
        this.cachedFitZoom = d;
    }

    public final void setCachedFitZoomFar(double d) {
        this.cachedFitZoomFar = d;
    }

    public final void setCachedFitZoomNear(double d) {
        this.cachedFitZoomNear = d;
    }

    public final void setCurrentTimeOfDay(@NotNull String str) {
        str.getClass();
        this.currentTimeOfDay = str;
    }

    public final void setCurrentWeatherJson(@Nullable String str) {
        this.currentWeatherJson = str;
    }

    public final void setCycleIter(int i) {
        this.cycleIter = i;
    }

    public final void setCyclePump(@Nullable Runnable runnable) {
        this.cyclePump = runnable;
    }

    public final void setDebugCmdPoller(@Nullable Runnable runnable) {
        this.debugCmdPoller = runnable;
    }

    public final void setDebugCmdStamp(long j) {
        this.debugCmdStamp = j;
    }

    public final void setDebugNavLatched(boolean z) {
        this.debugNavLatched = z;
    }

    public final void setDebugTodLatch(@Nullable String str) {
        this.debugTodLatch = str;
    }

    public final void setDemoMode(@NotNull String str) {
        str.getClass();
        this.demoMode = str;
    }

    public final void setDemoPump(@Nullable Runnable runnable) {
        this.demoPump = runnable;
    }

    public final void setDropped(boolean z) {
        this.dropped = z;
    }

    public final void setFirstFrameDrawn(boolean z) {
        this.firstFrameDrawn = z;
    }

    public final void setFloorPinned(boolean z) {
        this.floorPinned = z;
    }

    public final void setFollowActive(boolean z) {
        this.followActive = z;
    }

    public final void setFollowBearing(double d) {
        this.followBearing = d;
    }

    public final void setFollowEaseUntilMs(long j) {
        this.followEaseUntilMs = j;
    }

    public final void setFollowLastFrameMs(long j) {
        this.followLastFrameMs = j;
    }

    public final void setFollowLat(double d) {
        this.followLat = d;
    }

    public final void setFollowLon(double d) {
        this.followLon = d;
    }

    public final void setFollowRevert(@Nullable Runnable runnable) {
        this.followRevert = runnable;
    }

    public final void setFollowSubjectLat(double d) {
        this.followSubjectLat = d;
    }

    public final void setFollowSubjectLon(double d) {
        this.followSubjectLon = d;
    }

    public final void setFollowTickCount(int i) {
        this.followTickCount = i;
    }

    public final void setHasFlownIndoor(boolean z) {
        this.hasFlownIndoor = z;
    }

    public final void setHeroBoundsPoints(@Nullable List<Point> list) {
        this.heroBoundsPoints = list;
    }

    public final void setInitialFitApplied(boolean z) {
        this.initialFitApplied = z;
    }

    public final void setLastCameraTargetJson(@Nullable String str) {
        this.lastCameraTargetJson = str;
    }

    public final void setLastDeviceGroupsJson(@Nullable String str) {
        this.lastDeviceGroupsJson = str;
    }

    public final void setLastEndpointsJson(@Nullable String str) {
        this.lastEndpointsJson = str;
    }

    public final void setLastFocusedRoomId(@Nullable String str) {
        this.lastFocusedRoomId = str;
    }

    public final void setLastFootprintRing(@Nullable double[] dArr) {
        this.lastFootprintRing = dArr;
    }

    public final void setLastLayoutJson(@Nullable String str) {
        this.lastLayoutJson = str;
    }

    public final void setLastMapNavigationJson(@Nullable String str) {
        this.lastMapNavigationJson = str;
    }

    public final void setLastMotionActiveCamerasJson(@Nullable String str) {
        this.lastMotionActiveCamerasJson = str;
    }

    public final void setLastSceneUpdateJson(@Nullable String str) {
        this.lastSceneUpdateJson = str;
    }

    public final void setLastSettledCamera(@Nullable CameraState cameraState) {
        this.lastSettledCamera = cameraState;
    }

    public final void setLastUserInteractionMs(long j) {
        this.lastUserInteractionMs = j;
    }

    public final void setLastUserPreferencesJson(@Nullable String str) {
        this.lastUserPreferencesJson = str;
    }

    public final void setLastVegetations(@Nullable JSONArray jSONArray) {
        this.lastVegetations = jSONArray;
    }

    public final void setLevelIdByRoomId(@NotNull Map<String, String> map) {
        map.getClass();
        this.levelIdByRoomId = map;
    }

    public final void setLiveViewRequested(@Nullable String str) {
        this.liveViewRequested = str;
    }

    public final void setMaxPitch(double d) {
        this.maxPitch = d;
    }

    public final void setOpeningSettleFallback(@Nullable Runnable runnable) {
        this.openingSettleFallback = runnable;
    }

    public final void setOpeningSettled(boolean z) {
        this.openingSettled = z;
    }

    public final void setOrderedLevelIds(@NotNull List<String> list) {
        list.getClass();
        this.orderedLevelIds = list;
    }

    public final void setParsedView(@Nullable Pair<String, String> pair) {
        this.parsedView = pair;
    }

    public final void setPendingIndoorCameraFly(boolean z) {
        this.pendingIndoorCameraFly = z;
    }

    public final void setPinchDrivenRequestedAtMs(long j) {
        this.pinchDrivenRequestedAtMs = j;
    }

    public final void setPinchDrivenTransition(boolean z) {
        this.pinchDrivenTransition = z;
    }

    public final void setPinchInProgress(boolean z) {
        this.pinchInProgress = z;
    }

    public final void setPinchReleased(boolean z) {
        this.pinchReleased = z;
    }

    public final void setPinchStartZoom(double d) {
        this.pinchStartZoom = d;
    }

    public final void setPitchBoundsDeferred(@Nullable Runnable runnable) {
        this.pitchBoundsDeferred = runnable;
    }

    public final void setPointsByLevelId(@NotNull Map<String, ? extends List<Point>> map) {
        map.getClass();
        this.pointsByLevelId = map;
    }

    public final void setRendererReadyEmitted(boolean z) {
        this.rendererReadyEmitted = z;
    }

    public final void setRoadPerpendicular(@Nullable Double d) {
        this.roadPerpendicular = d;
    }

    public final void setRoadProbe(@Nullable RoadProbe roadProbe) {
        this.roadProbe = roadProbe;
    }

    public final void setRoomPolygonsByRoomId(@NotNull Map<String, ? extends List<Point>> map) {
        map.getClass();
        this.roomPolygonsByRoomId = map;
    }

    public final void setSceneAssetsListener(@Nullable Function0<Unit> function0) {
        this.sceneAssetsListener = function0;
    }

    public final void setSceneAssetsTimeout(@Nullable Runnable runnable) {
        this.sceneAssetsTimeout = runnable;
    }

    public final void setTreeOcclusion(@Nullable TreeOcclusionController treeOcclusionController) {
        this.treeOcclusion = treeOcclusionController;
    }

    public final void setUserPreferences(@NotNull NativeUserPreferences nativeUserPreferences) {
        nativeUserPreferences.getClass();
        this.userPreferences = nativeUserPreferences;
    }

    public final void setZoomOutFloor(@Nullable Double d) {
        this.zoomOutFloor = d;
    }
}
