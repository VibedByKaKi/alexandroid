package com.amazon.comms.ringservice.util;

import androidx.core.util.Pair;
import com.amazon.comms.calling.service.VideoConstraints;
import com.amazon.comms.log.CommsLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.webrtc.LocalAudioVideoShim;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VideoConstraintsManager {
    private static final CommsLogger log = CommsLogger.getLogger(VideoConstraintsManager.class);
    private VideoConstraints dynamicVideoConstraints = null;
    private VideoConstraints remoteRequestedVideoConstraints = null;
    private VideoConstraints localVideoConstraints = null;
    private VideoConstraints reducedVideoConstraints = null;
    private VideoConstraints thermalVideoConstraints = null;
    private VideoConstraints constraintsUntilFirstIceConn = null;

    public static List<Pair<String, Integer>> convertVideoConstraintToMediaConstraintList(List<Pair<String, Integer>> list, VideoConstraints videoConstraints) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(Pair.create("maxWidth", Integer.valueOf(videoConstraints.getVideoWidth())));
        list.add(Pair.create("maxHeight", Integer.valueOf(videoConstraints.getVideoHeight())));
        list.add(Pair.create(LocalAudioVideoShim.MAX_VIDEO_FPS_CONSTRAINT, Integer.valueOf(videoConstraints.getVideoFps())));
        return list;
    }

    public static VideoConstraints getVideoConstraints(Map<Integer, VideoConstraints> map, int i) {
        Map.Entry floorEntry = new TreeMap(map).floorEntry(Integer.valueOf(i));
        if (floorEntry != null) {
            return (VideoConstraints) floorEntry.getValue();
        }
        log.e("Unable to find a matching VideoConstraint in the map");
        return null;
    }

    public static VideoConstraints minVideoConstraints(VideoConstraints videoConstraints, VideoConstraints videoConstraints2) {
        return videoConstraints2 == null ? videoConstraints : (videoConstraints != null && videoConstraints.compareTo(videoConstraints2) < 0) ? videoConstraints : videoConstraints2;
    }

    private static VideoConstraints minimizeResolutionAndFpsIndependently(VideoConstraints videoConstraints, VideoConstraints videoConstraints2) {
        if (videoConstraints2 == null) {
            return videoConstraints;
        }
        if (videoConstraints == null) {
            return videoConstraints2;
        }
        int videoWidth = videoConstraints.getVideoWidth() * videoConstraints.getVideoHeight();
        int videoWidth2 = videoConstraints2.getVideoWidth() * videoConstraints2.getVideoHeight();
        int videoFps = videoConstraints.getVideoFps();
        int videoFps2 = videoConstraints2.getVideoFps();
        if (videoWidth == videoWidth2 && videoConstraints.getVideoFps() == videoConstraints2.getVideoFps()) {
            return videoConstraints;
        }
        int videoWidth3 = videoConstraints2.getVideoWidth();
        int videoHeight = videoConstraints2.getVideoHeight();
        int videoFps3 = videoConstraints2.getVideoFps();
        if (videoWidth2 == 0 || (videoWidth > 0 && videoWidth2 > 0 && videoWidth2 > videoWidth)) {
            videoWidth3 = videoConstraints.getVideoWidth();
            videoHeight = videoConstraints.getVideoHeight();
        }
        if (videoFps2 != 0 && (videoFps2 <= 0 || videoFps <= 0 || videoFps2 <= videoFps)) {
            videoFps = videoFps3;
        }
        return new VideoConstraints(videoWidth3, videoHeight, videoFps);
    }

    public VideoConstraints getConstraintsUntilFirstIceConn() {
        return this.constraintsUntilFirstIceConn;
    }

    public VideoConstraints getCurrentVideoConstraints() {
        return minimizeResolutionAndFpsIndependently(minVideoConstraints(minVideoConstraints(minVideoConstraints(minVideoConstraints(this.reducedVideoConstraints, this.localVideoConstraints), this.remoteRequestedVideoConstraints), this.dynamicVideoConstraints), this.thermalVideoConstraints), this.constraintsUntilFirstIceConn);
    }

    public VideoConstraints getLocalVideoConstraints() {
        return this.localVideoConstraints;
    }

    public VideoConstraints getReducedVideoConstraints() {
        return this.reducedVideoConstraints;
    }

    public VideoConstraints getRemoteRequestedVideoConstraints() {
        return this.remoteRequestedVideoConstraints;
    }

    public VideoConstraints getThermalVideoConstraints() {
        return this.thermalVideoConstraints;
    }

    public void printAllConstraints() {
        log.i("dynamicVideoConstraints: " + this.dynamicVideoConstraints + " ,  localVideoConstraints: " + this.localVideoConstraints + " ,  remoteRequestedVideoConstraints: " + this.remoteRequestedVideoConstraints + " ,  reducedVideoConstraints: " + this.reducedVideoConstraints + " ,  thermalVideoConstraints: " + this.thermalVideoConstraints + " ,  constraintsUntilFirstIceConn: " + this.constraintsUntilFirstIceConn);
    }

    public void setConstraintsUntilFirstIceConn(VideoConstraints videoConstraints) {
        this.constraintsUntilFirstIceConn = videoConstraints;
    }

    public void setDynamicVideoConstraints(VideoConstraints videoConstraints) {
        this.dynamicVideoConstraints = videoConstraints;
    }

    public void setLocalVideoConstraints(VideoConstraints videoConstraints) {
        this.localVideoConstraints = videoConstraints;
    }

    public void setReducedVideoConstraints(VideoConstraints videoConstraints) {
        this.reducedVideoConstraints = videoConstraints;
    }

    public void setRemoteRequestedVideoConstraints(VideoConstraints videoConstraints) {
        this.remoteRequestedVideoConstraints = videoConstraints;
    }

    public void setThermalVideoConstraints(VideoConstraints videoConstraints) {
        this.thermalVideoConstraints = videoConstraints;
    }

    public static List<Pair<String, Integer>> convertVideoConstraintToMediaConstraintList(VideoConstraints videoConstraints) {
        return convertVideoConstraintToMediaConstraintList(new ArrayList(), videoConstraints);
    }
}
