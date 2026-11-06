package com.mapbox.maps.plugin.delegates;

import android.graphics.RectF;
import com.amazon.mobile.heremapsexplore.Constants.ResponseFields;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraBounds;
import com.mapbox.maps.CameraBoundsOptions;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.CoordinateBounds;
import com.mapbox.maps.CoordinateBoundsZoom;
import com.mapbox.maps.CoordinateInfo;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.FreeCameraOptions;
import com.mapbox.maps.MapCenterAltitudeMode;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.ScreenBox;
import com.mapbox.maps.ScreenCoordinate;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JQ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0002\u0010\u0012JA\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0002\u0010\u0019JU\u0010\u0013\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u001cH&¢\u0006\u0002\u0010\u001dJ&\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH'J?\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H&J9\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010*\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020-H&J\u0010\u0010.\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0010\u00100\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0010\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0011H&J\u0010\u00103\u001a\u0002042\u0006\u00102\u001a\u00020\u0011H&J\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H&J\u001c\u00107\u001a\b\u0012\u0004\u0012\u0002040\u00152\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H&J\b\u00108\u001a\u000209H&J\b\u0010:\u001a\u00020;H&J\b\u0010<\u001a\u00020=H&J\u0010\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u0016H&J\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J\u001c\u0010A\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0B2\u0006\u0010E\u001a\u00020FH&J\u0010\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u0007H&J\u0010\u0010G\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020=H&J\u0010\u0010J\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020;H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006L"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "", "cameraState", "Lcom/mapbox/maps/CameraState;", "getCameraState", "()Lcom/mapbox/maps/CameraState;", "cameraForCoordinateBounds", "Lcom/mapbox/maps/CameraOptions;", "bounds", "Lcom/mapbox/maps/CoordinateBounds;", "boundsPadding", "Lcom/mapbox/maps/EdgeInsets;", "bearing", "", ResponseFields.PITCH, "maxZoom", "offset", "Lcom/mapbox/maps/ScreenCoordinate;", "(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "cameraForCoordinates", "coordinates", "", "Lcom/mapbox/geojson/Point;", "camera", "coordinatesPadding", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "", "result", "Lkotlin/Function1;", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lkotlin/jvm/functions/Function1;)V", "box", "Lcom/mapbox/maps/ScreenBox;", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "cameraForDrag", "fromPoint", "toPoint", "cameraForGeometry", "geometry", "Lcom/mapbox/geojson/Geometry;", "geometryPadding", "(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "coordinateBoundsForCamera", "coordinateBoundsForCameraUnwrapped", "coordinateBoundsForRect", "rectF", "Landroid/graphics/RectF;", "coordinateBoundsZoomForCamera", "Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCameraUnwrapped", "coordinateForPixel", "pixel", "coordinateInfoForPixel", "Lcom/mapbox/maps/CoordinateInfo;", "coordinatesForPixels", "pixels", "coordinatesInfoForPixels", "getBounds", "Lcom/mapbox/maps/CameraBounds;", "getCenterAltitudeMode", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "getFreeCameraOptions", "Lcom/mapbox/maps/FreeCameraOptions;", "pixelForCoordinate", "coordinate", "pixelsForCoordinates", "setBounds", "Lcom/mapbox/bindgen/Expected;", "", "Lcom/mapbox/bindgen/None;", "options", "Lcom/mapbox/maps/CameraBoundsOptions;", "setCamera", "cameraOptions", "freeCameraOptions", "setCenterAltitudeMode", "mode", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface MapCameraManagerDelegate {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ CameraOptions cameraForCoordinateBounds$default(MapCameraManagerDelegate mapCameraManagerDelegate, CoordinateBounds coordinateBounds, EdgeInsets edgeInsets, Double d, Double d2, Double d3, ScreenCoordinate screenCoordinate, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: cameraForCoordinateBounds");
                return null;
            }
            if ((i & 2) != 0) {
                edgeInsets = null;
            }
            if ((i & 4) != 0) {
                d = null;
            }
            if ((i & 8) != 0) {
                d2 = null;
            }
            if ((i & 16) != 0) {
                d3 = null;
            }
            if ((i & 32) != 0) {
                screenCoordinate = null;
            }
            return mapCameraManagerDelegate.cameraForCoordinateBounds(coordinateBounds, edgeInsets, d, d2, d3, screenCoordinate);
        }

        public static /* synthetic */ CameraOptions cameraForCoordinates$default(MapCameraManagerDelegate mapCameraManagerDelegate, List list, EdgeInsets edgeInsets, Double d, Double d2, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: cameraForCoordinates");
                return null;
            }
            if ((i & 2) != 0) {
                edgeInsets = null;
            }
            if ((i & 4) != 0) {
                d = null;
            }
            if ((i & 8) != 0) {
                d2 = null;
            }
            return mapCameraManagerDelegate.cameraForCoordinates(list, edgeInsets, d, d2);
        }

        public static /* synthetic */ CameraOptions cameraForGeometry$default(MapCameraManagerDelegate mapCameraManagerDelegate, Geometry geometry, EdgeInsets edgeInsets, Double d, Double d2, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: cameraForGeometry");
                return null;
            }
            if ((i & 2) != 0) {
                edgeInsets = null;
            }
            if ((i & 4) != 0) {
                d = null;
            }
            if ((i & 8) != 0) {
                d2 = null;
            }
            return mapCameraManagerDelegate.cameraForGeometry(geometry, edgeInsets, d, d2);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated", replaceWith = @ReplaceWith(expression = "cameraForCoordinates(coordinates, camera, coordinatesPadding, maxZoom, offset, result)", imports = {}))
    @NotNull
    CameraOptions cameraForCoordinateBounds(@NotNull CoordinateBounds bounds, @Nullable EdgeInsets boundsPadding, @Nullable Double bearing, @Nullable Double pitch, @Nullable Double maxZoom, @Nullable ScreenCoordinate offset);

    @MapboxDelicateApi
    @NotNull
    CameraOptions cameraForCoordinates(@NotNull List<Point> coordinates, @NotNull CameraOptions camera, @Nullable EdgeInsets coordinatesPadding, @Nullable Double maxZoom, @Nullable ScreenCoordinate offset);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated", replaceWith = @ReplaceWith(expression = "cameraForCoordinates(coordinates, camera, coordinatesPadding, maxZoom, offset, result)", imports = {}))
    @NotNull
    CameraOptions cameraForCoordinates(@NotNull List<Point> coordinates, @NotNull CameraOptions camera, @NotNull ScreenBox box);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated", replaceWith = @ReplaceWith(expression = "cameraForCoordinates(coordinates, camera, coordinatesPadding, maxZoom, offset, result)", imports = {}))
    @NotNull
    CameraOptions cameraForCoordinates(@NotNull List<Point> coordinates, @Nullable EdgeInsets coordinatesPadding, @Nullable Double bearing, @Nullable Double pitch);

    void cameraForCoordinates(@NotNull List<Point> coordinates, @NotNull CameraOptions camera, @Nullable EdgeInsets coordinatesPadding, @Nullable Double maxZoom, @Nullable ScreenCoordinate offset, @NotNull Function1<? super CameraOptions, Unit> result);

    @NotNull
    CameraOptions cameraForDrag(@NotNull ScreenCoordinate fromPoint, @NotNull ScreenCoordinate toPoint);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated", replaceWith = @ReplaceWith(expression = "cameraForCoordinates(coordinates, camera, coordinatesPadding, maxZoom, offset, result)", imports = {}))
    @NotNull
    CameraOptions cameraForGeometry(@NotNull Geometry geometry, @Nullable EdgeInsets geometryPadding, @Nullable Double bearing, @Nullable Double pitch);

    @NotNull
    CoordinateBounds coordinateBoundsForCamera(@NotNull CameraOptions camera);

    @NotNull
    CoordinateBounds coordinateBoundsForCameraUnwrapped(@NotNull CameraOptions camera);

    @NotNull
    CoordinateBounds coordinateBoundsForRect(@NotNull RectF rectF);

    @NotNull
    CoordinateBoundsZoom coordinateBoundsZoomForCamera(@NotNull CameraOptions camera);

    @NotNull
    CoordinateBoundsZoom coordinateBoundsZoomForCameraUnwrapped(@NotNull CameraOptions camera);

    @NotNull
    Point coordinateForPixel(@NotNull ScreenCoordinate pixel);

    @NotNull
    CoordinateInfo coordinateInfoForPixel(@NotNull ScreenCoordinate pixel);

    @NotNull
    List<Point> coordinatesForPixels(@NotNull List<ScreenCoordinate> pixels);

    @NotNull
    List<CoordinateInfo> coordinatesInfoForPixels(@NotNull List<ScreenCoordinate> pixels);

    @NotNull
    CameraBounds getBounds();

    @NotNull
    CameraState getCameraState();

    @NotNull
    MapCenterAltitudeMode getCenterAltitudeMode();

    @NotNull
    FreeCameraOptions getFreeCameraOptions();

    @NotNull
    ScreenCoordinate pixelForCoordinate(@NotNull Point coordinate);

    @NotNull
    List<ScreenCoordinate> pixelsForCoordinates(@NotNull List<Point> coordinates);

    @NotNull
    Expected<String, None> setBounds(@NotNull CameraBoundsOptions options);

    void setCamera(@NotNull CameraOptions cameraOptions);

    void setCamera(@NotNull FreeCameraOptions freeCameraOptions);

    void setCenterAltitudeMode(@NotNull MapCenterAltitudeMode mode);
}
